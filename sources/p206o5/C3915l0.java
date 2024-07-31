package p206o5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p222p5.C4014a;

/* renamed from: o5.l0 */
/* loaded from: classes.dex */
public final class C3915l0 implements InterfaceC3910j {

    /* renamed from: a */
    public final InterfaceC3910j f14067a;

    /* renamed from: b */
    public long f14068b;

    /* renamed from: c */
    public Uri f14069c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f14070d = Collections.emptyMap();

    public C3915l0(InterfaceC3910j interfaceC3910j) {
        this.f14067a = (InterfaceC3910j) C4014a.m15199e(interfaceC3910j);
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        int mo14769c = this.f14067a.mo14769c(bArr, i10, i11);
        if (mo14769c != -1) {
            this.f14068b += mo14769c;
        }
        return mo14769c;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f14067a.close();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: g */
    public void mo14820g(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15199e(interfaceC3917m0);
        this.f14067a.mo14820g(interfaceC3917m0);
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: j */
    public Map<String, List<String>> mo14829j() {
        return this.f14067a.mo14829j();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        this.f14069c = c3918n.f14071a;
        this.f14070d = Collections.emptyMap();
        long mo14770k = this.f14067a.mo14770k(c3918n);
        this.f14069c = (Uri) C4014a.m15199e(mo14771o());
        this.f14070d = mo14829j();
        return mo14770k;
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f14067a.mo14771o();
    }

    /* renamed from: q */
    public long m14843q() {
        return this.f14068b;
    }

    /* renamed from: r */
    public Uri m14844r() {
        return this.f14069c;
    }

    /* renamed from: s */
    public Map<String, List<String>> m14845s() {
        return this.f14070d;
    }

    /* renamed from: t */
    public void m14846t() {
        this.f14068b = 0L;
    }
}
