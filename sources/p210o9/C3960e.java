package p210o9;

import td.C4753m;

/* renamed from: o9.e */
/* loaded from: classes.dex */
public final class C3960e {

    /* renamed from: a */
    public final Boolean f14240a;

    /* renamed from: b */
    public final Double f14241b;

    /* renamed from: c */
    public final Integer f14242c;

    /* renamed from: d */
    public final Integer f14243d;

    /* renamed from: e */
    public final Long f14244e;

    public C3960e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f14240a = bool;
        this.f14241b = d10;
        this.f14242c = num;
        this.f14243d = num2;
        this.f14244e = l10;
    }

    /* renamed from: a */
    public final Integer m14987a() {
        return this.f14243d;
    }

    /* renamed from: b */
    public final Long m14988b() {
        return this.f14244e;
    }

    /* renamed from: c */
    public final Boolean m14989c() {
        return this.f14240a;
    }

    /* renamed from: d */
    public final Integer m14990d() {
        return this.f14242c;
    }

    /* renamed from: e */
    public final Double m14991e() {
        return this.f14241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3960e)) {
            return false;
        }
        C3960e c3960e = (C3960e) obj;
        return C4753m.m18648a(this.f14240a, c3960e.f14240a) && C4753m.m18648a(this.f14241b, c3960e.f14241b) && C4753m.m18648a(this.f14242c, c3960e.f14242c) && C4753m.m18648a(this.f14243d, c3960e.f14243d) && C4753m.m18648a(this.f14244e, c3960e.f14244e);
    }

    public int hashCode() {
        Boolean bool = this.f14240a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f14241b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f14242c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14243d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f14244e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f14240a + ", sessionSamplingRate=" + this.f14241b + ", sessionRestartTimeout=" + this.f14242c + ", cacheDuration=" + this.f14243d + ", cacheUpdatedTime=" + this.f14244e + ')';
    }
}
