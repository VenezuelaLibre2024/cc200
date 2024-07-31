package p321w7;

import java.util.Map;

/* renamed from: w7.c0 */
/* loaded from: classes.dex */
public class C5349c0 {

    /* renamed from: a */
    public String f20150a;

    /* renamed from: b */
    public Map<String, Object> f20151b;

    public C5349c0(String str, Map<String, Object> map) {
        this.f20150a = str;
        this.f20151b = map;
    }

    /* renamed from: a */
    public long m21445a() {
        return m21452h("auth_time");
    }

    /* renamed from: b */
    public Map<String, Object> m21446b() {
        return this.f20151b;
    }

    /* renamed from: c */
    public long m21447c() {
        return m21452h("exp");
    }

    /* renamed from: d */
    public long m21448d() {
        return m21452h("iat");
    }

    /* renamed from: e */
    public String m21449e() {
        Map map = (Map) this.f20151b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: f */
    public String m21450f() {
        Map map = (Map) this.f20151b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    /* renamed from: g */
    public String m21451g() {
        return this.f20150a;
    }

    /* renamed from: h */
    public final long m21452h(String str) {
        Integer num = (Integer) this.f20151b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
