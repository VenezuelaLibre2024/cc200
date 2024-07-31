package p185m9;

import td.C4753m;

/* renamed from: m9.z */
/* loaded from: classes.dex */
public final class C3591z {

    /* renamed from: a */
    public final EnumC3571i f12645a;

    /* renamed from: b */
    public final C3564e0 f12646b;

    /* renamed from: c */
    public final C3557b f12647c;

    public C3591z(EnumC3571i enumC3571i, C3564e0 c3564e0, C3557b c3557b) {
        C4753m.m18653f(enumC3571i, "eventType");
        C4753m.m18653f(c3564e0, "sessionData");
        C4753m.m18653f(c3557b, "applicationInfo");
        this.f12645a = enumC3571i;
        this.f12646b = c3564e0;
        this.f12647c = c3557b;
    }

    /* renamed from: a */
    public final C3557b m13314a() {
        return this.f12647c;
    }

    /* renamed from: b */
    public final EnumC3571i m13315b() {
        return this.f12645a;
    }

    /* renamed from: c */
    public final C3564e0 m13316c() {
        return this.f12646b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3591z)) {
            return false;
        }
        C3591z c3591z = (C3591z) obj;
        return this.f12645a == c3591z.f12645a && C4753m.m18648a(this.f12646b, c3591z.f12646b) && C4753m.m18648a(this.f12647c, c3591z.f12647c);
    }

    public int hashCode() {
        return (((this.f12645a.hashCode() * 31) + this.f12646b.hashCode()) * 31) + this.f12647c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f12645a + ", sessionData=" + this.f12646b + ", applicationInfo=" + this.f12647c + ')';
    }
}
