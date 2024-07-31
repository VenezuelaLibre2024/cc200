package cc;

import p079f6.C1841a;

/* renamed from: cc.a */
/* loaded from: classes.dex */
public class C1006a implements InterfaceC1010e {

    /* renamed from: a */
    public final int f3953a;

    /* renamed from: b */
    public final int f3954b;

    public C1006a(int i10) {
        this.f3953a = i10;
        this.f3954b = C1841a.e.API_PRIORITY_OTHER;
    }

    public C1006a(int i10, int i11) {
        this.f3953a = i10;
        this.f3954b = i11;
    }

    @Override // cc.InterfaceC1010e
    /* renamed from: a */
    public C1011f mo4243a(C1011f c1011f) {
        int i10;
        int i11;
        if (c1011f.m4248b() <= this.f3953a && c1011f.m4247a() <= this.f3954b) {
            return c1011f;
        }
        float m4248b = c1011f.m4248b() / c1011f.m4247a();
        if (c1011f.m4247a() / this.f3954b >= c1011f.m4248b() / this.f3953a) {
            i11 = this.f3954b;
            i10 = (int) (i11 * m4248b);
        } else {
            i10 = this.f3953a;
            i11 = (int) (i10 / m4248b);
        }
        if (i10 % 2 != 0) {
            i10--;
        }
        if (i11 % 2 != 0) {
            i11--;
        }
        return new C1011f(i10, i11);
    }
}
