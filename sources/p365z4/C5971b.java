package p365z4;

import p062e4.C1655f;
import p077f4.C1826g;
import p106h4.C2301b;
import p106h4.C2307e;
import p106h4.C2313h;
import p106h4.C2314h0;
import p222p5.C4014a;
import p222p5.C4033j0;
import p264s3.C4463m1;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;

/* renamed from: z4.b */
/* loaded from: classes.dex */
public final class C5971b implements InterfaceC5980k {

    /* renamed from: d */
    public static final C5585y f22178d = new C5585y();

    /* renamed from: a */
    public final InterfaceC5571k f22179a;

    /* renamed from: b */
    public final C4463m1 f22180b;

    /* renamed from: c */
    public final C4033j0 f22181c;

    public C5971b(InterfaceC5571k interfaceC5571k, C4463m1 c4463m1, C4033j0 c4033j0) {
        this.f22179a = interfaceC5571k;
        this.f22180b = c4463m1;
        this.f22181c = c4033j0;
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: a */
    public boolean mo23923a(InterfaceC5572l interfaceC5572l) {
        return this.f22179a.mo169g(interfaceC5572l, f22178d) == 0;
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: b */
    public void mo23924b(InterfaceC5573m interfaceC5573m) {
        this.f22179a.mo164b(interfaceC5573m);
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: c */
    public void mo23925c() {
        this.f22179a.mo165c(0L, 0L);
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: d */
    public boolean mo23926d() {
        InterfaceC5571k interfaceC5571k = this.f22179a;
        return (interfaceC5571k instanceof C2313h) || (interfaceC5571k instanceof C2301b) || (interfaceC5571k instanceof C2307e) || (interfaceC5571k instanceof C1655f);
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: e */
    public boolean mo23927e() {
        InterfaceC5571k interfaceC5571k = this.f22179a;
        return (interfaceC5571k instanceof C2314h0) || (interfaceC5571k instanceof C1826g);
    }

    @Override // p365z4.InterfaceC5980k
    /* renamed from: f */
    public InterfaceC5980k mo23928f() {
        InterfaceC5571k c1655f;
        C4014a.m15200f(!mo23927e());
        InterfaceC5571k interfaceC5571k = this.f22179a;
        if (interfaceC5571k instanceof C5990u) {
            c1655f = new C5990u(this.f22180b.f16497j, this.f22181c);
        } else if (interfaceC5571k instanceof C2313h) {
            c1655f = new C2313h();
        } else if (interfaceC5571k instanceof C2301b) {
            c1655f = new C2301b();
        } else if (interfaceC5571k instanceof C2307e) {
            c1655f = new C2307e();
        } else {
            if (!(interfaceC5571k instanceof C1655f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f22179a.getClass().getSimpleName());
            }
            c1655f = new C1655f();
        }
        return new C5971b(c1655f, this.f22180b, this.f22181c);
    }
}
