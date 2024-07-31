package p333x3;

import p222p5.C4014a;
import p289u3.C4807b;
import p333x3.InterfaceC5559b0;

/* renamed from: x3.c0 */
/* loaded from: classes.dex */
public final class C5561c0 {

    /* renamed from: a */
    public final byte[] f20863a = new byte[10];

    /* renamed from: b */
    public boolean f20864b;

    /* renamed from: c */
    public int f20865c;

    /* renamed from: d */
    public long f20866d;

    /* renamed from: e */
    public int f20867e;

    /* renamed from: f */
    public int f20868f;

    /* renamed from: g */
    public int f20869g;

    /* renamed from: a */
    public void m22410a(InterfaceC5559b0 interfaceC5559b0, InterfaceC5559b0.a aVar) {
        if (this.f20865c > 0) {
            interfaceC5559b0.mo4851a(this.f20866d, this.f20867e, this.f20868f, this.f20869g, aVar);
            this.f20865c = 0;
        }
    }

    /* renamed from: b */
    public void m22411b() {
        this.f20864b = false;
        this.f20865c = 0;
    }

    /* renamed from: c */
    public void m22412c(InterfaceC5559b0 interfaceC5559b0, long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
        C4014a.m15201g(this.f20869g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f20864b) {
            int i13 = this.f20865c;
            int i14 = i13 + 1;
            this.f20865c = i14;
            if (i13 == 0) {
                this.f20866d = j10;
                this.f20867e = i10;
                this.f20868f = 0;
            }
            this.f20868f += i11;
            this.f20869g = i12;
            if (i14 >= 16) {
                m22410a(interfaceC5559b0, aVar);
            }
        }
    }

    /* renamed from: d */
    public void m22413d(InterfaceC5572l interfaceC5572l) {
        if (this.f20864b) {
            return;
        }
        interfaceC5572l.mo22430p(this.f20863a, 0, 10);
        interfaceC5572l.mo22427l();
        if (C4807b.m18981j(this.f20863a) == 0) {
            return;
        }
        this.f20864b = true;
    }
}
