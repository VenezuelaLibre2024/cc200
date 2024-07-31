package p031c4;

import p333x3.C5557a0;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: c4.d */
/* loaded from: classes.dex */
public final class C0611d implements InterfaceC5573m {

    /* renamed from: h */
    public final long f2669h;

    /* renamed from: i */
    public final InterfaceC5573m f2670i;

    /* renamed from: c4.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5586z {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5586z f2671a;

        public a(InterfaceC5586z interfaceC5586z) {
            this.f2671a = interfaceC5586z;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: d */
        public long mo3035d() {
            return this.f2671a.mo3035d();
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: f */
        public boolean mo3036f() {
            return this.f2671a.mo3036f();
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: i */
        public InterfaceC5586z.a mo3037i(long j10) {
            InterfaceC5586z.a mo3037i = this.f2671a.mo3037i(j10);
            C5557a0 c5557a0 = mo3037i.f20963a;
            C5557a0 c5557a02 = new C5557a0(c5557a0.f20851a, c5557a0.f20852b + C0611d.this.f2669h);
            C5557a0 c5557a03 = mo3037i.f20964b;
            return new InterfaceC5586z.a(c5557a02, new C5557a0(c5557a03.f20851a, c5557a03.f20852b + C0611d.this.f2669h));
        }
    }

    public C0611d(long j10, InterfaceC5573m interfaceC5573m) {
        this.f2669h = j10;
        this.f2670i = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: e */
    public InterfaceC5559b0 mo3032e(int i10, int i11) {
        return this.f2670i.mo3032e(i10, i11);
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: j */
    public void mo3033j(InterfaceC5586z interfaceC5586z) {
        this.f2670i.mo3033j(new a(interfaceC5586z));
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: n */
    public void mo3034n() {
        this.f2670i.mo3034n();
    }
}
