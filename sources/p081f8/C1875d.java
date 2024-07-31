package p081f8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p023b8.C0515g;
import p066e8.C1733i;

/* renamed from: f8.d */
/* loaded from: classes.dex */
public class C1875d {

    /* renamed from: a */
    public final Map<String, String> f7078a = new HashMap();

    /* renamed from: b */
    public final int f7079b;

    /* renamed from: c */
    public final int f7080c;

    public C1875d(int i10, int i11) {
        this.f7079b = i10;
        this.f7080c = i11;
    }

    /* renamed from: c */
    public static String m7627c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i10 ? trim.substring(0, i10) : trim;
    }

    /* renamed from: a */
    public synchronized Map<String, String> m7628a() {
        return Collections.unmodifiableMap(new HashMap(this.f7078a));
    }

    /* renamed from: b */
    public final String m7629b(String str) {
        if (str != null) {
            return m7627c(str, this.f7080c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean m7630d(String str, String str2) {
        String m7629b = m7629b(str);
        if (this.f7078a.size() >= this.f7079b && !this.f7078a.containsKey(m7629b)) {
            C0515g.m2482f().m2492k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f7079b);
            return false;
        }
        String m7627c = m7627c(str2, this.f7080c);
        if (C1733i.m6837y(this.f7078a.get(m7629b), m7627c)) {
            return false;
        }
        Map<String, String> map = this.f7078a;
        if (str2 == null) {
            m7627c = "";
        }
        map.put(m7629b, m7627c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m7631e(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m7629b = m7629b(entry.getKey());
            if (this.f7078a.size() >= this.f7079b && !this.f7078a.containsKey(m7629b)) {
                i10++;
            }
            String value = entry.getValue();
            this.f7078a.put(m7629b, value == null ? "" : m7627c(value, this.f7080c));
        }
        if (i10 > 0) {
            C0515g.m2482f().m2492k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f7079b);
        }
    }
}
