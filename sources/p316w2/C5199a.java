package p316w2;

import java.util.Map;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public class C5199a {

    /* renamed from: a */
    public final String f19722a;

    /* renamed from: b */
    public final String f19723b;

    public C5199a(String str, String str2) {
        this.f19722a = str;
        this.f19723b = str2;
    }

    /* renamed from: c */
    public static C5199a m21046c(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new C5199a((String) map.get("name"), (String) map.get("defType"));
    }

    /* renamed from: a */
    public String m21047a() {
        return this.f19723b;
    }

    /* renamed from: b */
    public String m21048b() {
        return this.f19722a;
    }
}
