package p174le;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p116he.AbstractC2532i0;
import p116he.C2538l0;
import p146jd.InterfaceC3284g;

/* renamed from: le.f */
/* loaded from: classes2.dex */
public final class C3484f extends AbstractC2532i0<C3484f> {

    /* renamed from: l */
    public final AtomicReferenceArray f12216l;

    public C3484f(long j10, C3484f c3484f, int i10) {
        super(j10, c3484f, i10);
        int i11;
        i11 = C3483e.f12215f;
        this.f12216l = new AtomicReferenceArray(i11);
    }

    @Override // p116he.AbstractC2532i0
    /* renamed from: n */
    public int mo7210n() {
        int i10;
        i10 = C3483e.f12215f;
        return i10;
    }

    @Override // p116he.AbstractC2532i0
    /* renamed from: o */
    public void mo7211o(int i10, Throwable th, InterfaceC3284g interfaceC3284g) {
        C2538l0 c2538l0;
        c2538l0 = C3483e.f12214e;
        m12969r().set(i10, c2538l0);
        m10085p();
    }

    /* renamed from: r */
    public final AtomicReferenceArray m12969r() {
        return this.f12216l;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f9971j + ", hashCode=" + hashCode() + ']';
    }
}
