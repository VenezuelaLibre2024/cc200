package p316w2;

import java.util.Map;

/* renamed from: w2.d */
/* loaded from: classes.dex */
public class C5202d {

    /* renamed from: a */
    public final String f19729a;

    /* renamed from: b */
    public final String f19730b;

    /* renamed from: c */
    public final C5199a f19731c;

    /* renamed from: d */
    public final boolean f19732d;

    /* renamed from: e */
    public final boolean f19733e;

    /* renamed from: f */
    public final boolean f19734f;

    public C5202d(String str, String str2, C5199a c5199a, boolean z10, boolean z11, boolean z12) {
        this.f19729a = str;
        this.f19730b = str2;
        this.f19731c = c5199a;
        this.f19732d = z10;
        this.f19733e = z11;
        this.f19734f = z12;
    }

    /* renamed from: g */
    public static C5202d m21057g(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        C5199a m21046c = C5199a.m21046c((Map) map.get("notificationIcon"));
        return new C5202d((String) map.get("notificationTitle"), (String) map.get("notificationText"), m21046c, ((Boolean) map.get("enableWifiLock")).booleanValue(), ((Boolean) map.get("enableWakeLock")).booleanValue(), ((Boolean) map.get("setOngoing")).booleanValue());
    }

    /* renamed from: a */
    public C5199a m21058a() {
        return this.f19731c;
    }

    /* renamed from: b */
    public String m21059b() {
        return this.f19730b;
    }

    /* renamed from: c */
    public String m21060c() {
        return this.f19729a;
    }

    /* renamed from: d */
    public boolean m21061d() {
        return this.f19733e;
    }

    /* renamed from: e */
    public boolean m21062e() {
        return this.f19732d;
    }

    /* renamed from: f */
    public boolean m21063f() {
        return this.f19734f;
    }
}
