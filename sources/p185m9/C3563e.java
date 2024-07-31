package p185m9;

import td.C4747g;
import td.C4753m;

/* renamed from: m9.e */
/* loaded from: classes.dex */
public final class C3563e {

    /* renamed from: a */
    public final EnumC3561d f12544a;

    /* renamed from: b */
    public final EnumC3561d f12545b;

    /* renamed from: c */
    public final double f12546c;

    public C3563e() {
        this(null, null, 0.0d, 7, null);
    }

    public C3563e(EnumC3561d enumC3561d, EnumC3561d enumC3561d2, double d10) {
        C4753m.m18653f(enumC3561d, "performance");
        C4753m.m18653f(enumC3561d2, "crashlytics");
        this.f12544a = enumC3561d;
        this.f12545b = enumC3561d2;
        this.f12546c = d10;
    }

    public /* synthetic */ C3563e(EnumC3561d enumC3561d, EnumC3561d enumC3561d2, double d10, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? EnumC3561d.COLLECTION_SDK_NOT_INSTALLED : enumC3561d, (i10 & 2) != 0 ? EnumC3561d.COLLECTION_SDK_NOT_INSTALLED : enumC3561d2, (i10 & 4) != 0 ? 1.0d : d10);
    }

    /* renamed from: a */
    public final EnumC3561d m13241a() {
        return this.f12545b;
    }

    /* renamed from: b */
    public final EnumC3561d m13242b() {
        return this.f12544a;
    }

    /* renamed from: c */
    public final double m13243c() {
        return this.f12546c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3563e)) {
            return false;
        }
        C3563e c3563e = (C3563e) obj;
        return this.f12544a == c3563e.f12544a && this.f12545b == c3563e.f12545b && C4753m.m18648a(Double.valueOf(this.f12546c), Double.valueOf(c3563e.f12546c));
    }

    public int hashCode() {
        return (((this.f12544a.hashCode() * 31) + this.f12545b.hashCode()) * 31) + Double.hashCode(this.f12546c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f12544a + ", crashlytics=" + this.f12545b + ", sessionSamplingRate=" + this.f12546c + ')';
    }
}
