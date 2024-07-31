package p137j4;

import p137j4.C3223b;
import p137j4.C3245x;
import p137j4.InterfaceC3233l;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;

/* renamed from: j4.j */
/* loaded from: classes.dex */
public final class C3231j implements InterfaceC3233l.b {

    /* renamed from: a */
    public int f11219a = 0;

    /* renamed from: b */
    public boolean f11220b;

    @Override // p137j4.InterfaceC3233l.b
    /* renamed from: a */
    public InterfaceC3233l mo11513a(InterfaceC3233l.a aVar) {
        int i10;
        int i11 = C4041n0.f14513a;
        if (i11 < 23 || ((i10 = this.f11219a) != 1 && (i10 != 0 || i11 < 31))) {
            return new C3245x.b().mo11513a(aVar);
        }
        int m15554k = C4050v.m15554k(aVar.f11228c.f16506s);
        C4046r.m15526f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + C4041n0.m15466k0(m15554k));
        return new C3223b.b(m15554k, this.f11220b).mo11513a(aVar);
    }
}
