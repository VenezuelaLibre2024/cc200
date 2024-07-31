package p304v3;

import p222p5.C4014a;
import p264s3.C4463m1;

/* renamed from: v3.i */
/* loaded from: classes.dex */
public final class C5112i {

    /* renamed from: a */
    public final String f19294a;

    /* renamed from: b */
    public final C4463m1 f19295b;

    /* renamed from: c */
    public final C4463m1 f19296c;

    /* renamed from: d */
    public final int f19297d;

    /* renamed from: e */
    public final int f19298e;

    public C5112i(String str, C4463m1 c4463m1, C4463m1 c4463m12, int i10, int i11) {
        C4014a.m15195a(i10 == 0 || i11 == 0);
        this.f19294a = C4014a.m15198d(str);
        this.f19295b = (C4463m1) C4014a.m15199e(c4463m1);
        this.f19296c = (C4463m1) C4014a.m15199e(c4463m12);
        this.f19297d = i10;
        this.f19298e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5112i.class != obj.getClass()) {
            return false;
        }
        C5112i c5112i = (C5112i) obj;
        return this.f19297d == c5112i.f19297d && this.f19298e == c5112i.f19298e && this.f19294a.equals(c5112i.f19294a) && this.f19295b.equals(c5112i.f19295b) && this.f19296c.equals(c5112i.f19296c);
    }

    public int hashCode() {
        return ((((((((527 + this.f19297d) * 31) + this.f19298e) * 31) + this.f19294a.hashCode()) * 31) + this.f19295b.hashCode()) * 31) + this.f19296c.hashCode();
    }
}
