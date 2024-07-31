package p333x3;

import java.io.EOFException;
import p152k4.C3348a;
import p221p4.C4007h;
import p222p5.C4015a0;

/* renamed from: x3.w */
/* loaded from: classes.dex */
public final class C5583w {

    /* renamed from: a */
    public final C4015a0 f20957a = new C4015a0(10);

    /* renamed from: a */
    public C3348a m22502a(InterfaceC5572l interfaceC5572l, C4007h.a aVar) {
        C3348a c3348a = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC5572l.mo22430p(this.f20957a.m15230e(), 0, 10);
                this.f20957a.m15223T(0);
                if (this.f20957a.m15213J() != 4801587) {
                    break;
                }
                this.f20957a.m15224U(3);
                int m15209F = this.f20957a.m15209F();
                int i11 = m15209F + 10;
                if (c3348a == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f20957a.m15230e(), 0, bArr, 0, 10);
                    interfaceC5572l.mo22430p(bArr, 10, m15209F);
                    c3348a = new C4007h(aVar).m15180e(bArr, i11);
                } else {
                    interfaceC5572l.mo22425h(m15209F);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h(i10);
        return c3348a;
    }
}
