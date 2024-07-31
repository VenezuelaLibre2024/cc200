package p185m9;

import java.util.List;
import td.C4753m;

/* renamed from: m9.a */
/* loaded from: classes.dex */
public final class C3555a {

    /* renamed from: a */
    public final String f12455a;

    /* renamed from: b */
    public final String f12456b;

    /* renamed from: c */
    public final String f12457c;

    /* renamed from: d */
    public final String f12458d;

    /* renamed from: e */
    public final C3585t f12459e;

    /* renamed from: f */
    public final List<C3585t> f12460f;

    public C3555a(String str, String str2, String str3, String str4, C3585t c3585t, List<C3585t> list) {
        C4753m.m18653f(str, "packageName");
        C4753m.m18653f(str2, "versionName");
        C4753m.m18653f(str3, "appBuildVersion");
        C4753m.m18653f(str4, "deviceManufacturer");
        C4753m.m18653f(c3585t, "currentProcessDetails");
        C4753m.m18653f(list, "appProcessDetails");
        this.f12455a = str;
        this.f12456b = str2;
        this.f12457c = str3;
        this.f12458d = str4;
        this.f12459e = c3585t;
        this.f12460f = list;
    }

    /* renamed from: a */
    public final String m13201a() {
        return this.f12457c;
    }

    /* renamed from: b */
    public final List<C3585t> m13202b() {
        return this.f12460f;
    }

    /* renamed from: c */
    public final C3585t m13203c() {
        return this.f12459e;
    }

    /* renamed from: d */
    public final String m13204d() {
        return this.f12458d;
    }

    /* renamed from: e */
    public final String m13205e() {
        return this.f12455a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3555a)) {
            return false;
        }
        C3555a c3555a = (C3555a) obj;
        return C4753m.m18648a(this.f12455a, c3555a.f12455a) && C4753m.m18648a(this.f12456b, c3555a.f12456b) && C4753m.m18648a(this.f12457c, c3555a.f12457c) && C4753m.m18648a(this.f12458d, c3555a.f12458d) && C4753m.m18648a(this.f12459e, c3555a.f12459e) && C4753m.m18648a(this.f12460f, c3555a.f12460f);
    }

    /* renamed from: f */
    public final String m13206f() {
        return this.f12456b;
    }

    public int hashCode() {
        return (((((((((this.f12455a.hashCode() * 31) + this.f12456b.hashCode()) * 31) + this.f12457c.hashCode()) * 31) + this.f12458d.hashCode()) * 31) + this.f12459e.hashCode()) * 31) + this.f12460f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f12455a + ", versionName=" + this.f12456b + ", appBuildVersion=" + this.f12457c + ", deviceManufacturer=" + this.f12458d + ", currentProcessDetails=" + this.f12459e + ", appProcessDetails=" + this.f12460f + ')';
    }
}
