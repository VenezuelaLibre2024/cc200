package p333x3;

import java.io.EOFException;
import p206o5.InterfaceC3906h;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;

/* renamed from: x3.j */
/* loaded from: classes.dex */
public final class C5570j implements InterfaceC5559b0 {

    /* renamed from: a */
    public final byte[] f20931a = new byte[4096];

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: a */
    public void mo4851a(long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: b */
    public void mo4852b(C4463m1 c4463m1) {
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: d */
    public void mo4853d(C4015a0 c4015a0, int i10, int i11) {
        c4015a0.m15224U(i10);
    }

    @Override // p333x3.InterfaceC5559b0
    /* renamed from: f */
    public int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11) {
        int mo14769c = interfaceC3906h.mo14769c(this.f20931a, 0, Math.min(this.f20931a.length, i10));
        if (mo14769c != -1) {
            return mo14769c;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
