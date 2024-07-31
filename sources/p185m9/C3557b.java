package p185m9;

import td.C4753m;

/* renamed from: m9.b */
/* loaded from: classes.dex */
public final class C3557b {

    /* renamed from: a */
    public final String f12463a;

    /* renamed from: b */
    public final String f12464b;

    /* renamed from: c */
    public final String f12465c;

    /* renamed from: d */
    public final String f12466d;

    /* renamed from: e */
    public final EnumC3584s f12467e;

    /* renamed from: f */
    public final C3555a f12468f;

    public C3557b(String str, String str2, String str3, String str4, EnumC3584s enumC3584s, C3555a c3555a) {
        C4753m.m18653f(str, "appId");
        C4753m.m18653f(str2, "deviceModel");
        C4753m.m18653f(str3, "sessionSdkVersion");
        C4753m.m18653f(str4, "osVersion");
        C4753m.m18653f(enumC3584s, "logEnvironment");
        C4753m.m18653f(c3555a, "androidAppInfo");
        this.f12463a = str;
        this.f12464b = str2;
        this.f12465c = str3;
        this.f12466d = str4;
        this.f12467e = enumC3584s;
        this.f12468f = c3555a;
    }

    /* renamed from: a */
    public final C3555a m13211a() {
        return this.f12468f;
    }

    /* renamed from: b */
    public final String m13212b() {
        return this.f12463a;
    }

    /* renamed from: c */
    public final String m13213c() {
        return this.f12464b;
    }

    /* renamed from: d */
    public final EnumC3584s m13214d() {
        return this.f12467e;
    }

    /* renamed from: e */
    public final String m13215e() {
        return this.f12466d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3557b)) {
            return false;
        }
        C3557b c3557b = (C3557b) obj;
        return C4753m.m18648a(this.f12463a, c3557b.f12463a) && C4753m.m18648a(this.f12464b, c3557b.f12464b) && C4753m.m18648a(this.f12465c, c3557b.f12465c) && C4753m.m18648a(this.f12466d, c3557b.f12466d) && this.f12467e == c3557b.f12467e && C4753m.m18648a(this.f12468f, c3557b.f12468f);
    }

    /* renamed from: f */
    public final String m13216f() {
        return this.f12465c;
    }

    public int hashCode() {
        return (((((((((this.f12463a.hashCode() * 31) + this.f12464b.hashCode()) * 31) + this.f12465c.hashCode()) * 31) + this.f12466d.hashCode()) * 31) + this.f12467e.hashCode()) * 31) + this.f12468f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f12463a + ", deviceModel=" + this.f12464b + ", sessionSdkVersion=" + this.f12465c + ", osVersion=" + this.f12466d + ", logEnvironment=" + this.f12467e + ", androidAppInfo=" + this.f12468f + ')';
    }
}
