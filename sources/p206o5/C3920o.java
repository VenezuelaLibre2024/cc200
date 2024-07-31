package p206o5;

import java.util.Arrays;
import p206o5.InterfaceC3894b;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: o5.o */
/* loaded from: classes.dex */
public final class C3920o implements InterfaceC3894b {

    /* renamed from: a */
    public final boolean f14101a;

    /* renamed from: b */
    public final int f14102b;

    /* renamed from: c */
    public final byte[] f14103c;

    /* renamed from: d */
    public int f14104d;

    /* renamed from: e */
    public int f14105e;

    /* renamed from: f */
    public int f14106f;

    /* renamed from: g */
    public C3892a[] f14107g;

    public C3920o(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C3920o(boolean z10, int i10, int i11) {
        C4014a.m15195a(i10 > 0);
        C4014a.m15195a(i11 >= 0);
        this.f14101a = z10;
        this.f14102b = i10;
        this.f14106f = i11;
        this.f14107g = new C3892a[i11 + 100];
        if (i11 <= 0) {
            this.f14103c = null;
            return;
        }
        this.f14103c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f14107g[i12] = new C3892a(this.f14103c, i12 * i10);
        }
    }

    @Override // p206o5.InterfaceC3894b
    /* renamed from: a */
    public synchronized void mo14761a(InterfaceC3894b.a aVar) {
        while (aVar != null) {
            C3892a[] c3892aArr = this.f14107g;
            int i10 = this.f14106f;
            this.f14106f = i10 + 1;
            c3892aArr[i10] = aVar.mo14766a();
            this.f14105e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // p206o5.InterfaceC3894b
    /* renamed from: b */
    public synchronized void mo14762b(C3892a c3892a) {
        C3892a[] c3892aArr = this.f14107g;
        int i10 = this.f14106f;
        this.f14106f = i10 + 1;
        c3892aArr[i10] = c3892a;
        this.f14105e--;
        notifyAll();
    }

    @Override // p206o5.InterfaceC3894b
    /* renamed from: c */
    public synchronized C3892a mo14763c() {
        C3892a c3892a;
        this.f14105e++;
        int i10 = this.f14106f;
        if (i10 > 0) {
            C3892a[] c3892aArr = this.f14107g;
            int i11 = i10 - 1;
            this.f14106f = i11;
            c3892a = (C3892a) C4014a.m15199e(c3892aArr[i11]);
            this.f14107g[this.f14106f] = null;
        } else {
            c3892a = new C3892a(new byte[this.f14102b], 0);
            int i12 = this.f14105e;
            C3892a[] c3892aArr2 = this.f14107g;
            if (i12 > c3892aArr2.length) {
                this.f14107g = (C3892a[]) Arrays.copyOf(c3892aArr2, c3892aArr2.length * 2);
            }
        }
        return c3892a;
    }

    @Override // p206o5.InterfaceC3894b
    /* renamed from: d */
    public synchronized void mo14764d() {
        int i10 = 0;
        int max = Math.max(0, C4041n0.m15467l(this.f14104d, this.f14102b) - this.f14105e);
        int i11 = this.f14106f;
        if (max >= i11) {
            return;
        }
        if (this.f14103c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                C3892a c3892a = (C3892a) C4014a.m15199e(this.f14107g[i10]);
                if (c3892a.f13966a == this.f14103c) {
                    i10++;
                } else {
                    C3892a c3892a2 = (C3892a) C4014a.m15199e(this.f14107g[i12]);
                    if (c3892a2.f13966a != this.f14103c) {
                        i12--;
                    } else {
                        C3892a[] c3892aArr = this.f14107g;
                        c3892aArr[i10] = c3892a2;
                        c3892aArr[i12] = c3892a;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f14106f) {
                return;
            }
        }
        Arrays.fill(this.f14107g, max, this.f14106f, (Object) null);
        this.f14106f = max;
    }

    @Override // p206o5.InterfaceC3894b
    /* renamed from: e */
    public int mo14765e() {
        return this.f14102b;
    }

    /* renamed from: f */
    public synchronized int m14868f() {
        return this.f14105e * this.f14102b;
    }

    /* renamed from: g */
    public synchronized void m14869g() {
        if (this.f14101a) {
            m14870h(0);
        }
    }

    /* renamed from: h */
    public synchronized void m14870h(int i10) {
        boolean z10 = i10 < this.f14104d;
        this.f14104d = i10;
        if (z10) {
            mo14764d();
        }
    }
}
