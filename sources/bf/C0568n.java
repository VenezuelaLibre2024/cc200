package bf;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: bf.n */
/* loaded from: classes2.dex */
public final class C0568n implements InterfaceC0558d {

    /* renamed from: h */
    public final C0557c f2534h = new C0557c();

    /* renamed from: i */
    public final InterfaceC0573s f2535i;

    /* renamed from: j */
    public boolean f2536j;

    public C0568n(InterfaceC0573s interfaceC0573s) {
        Objects.requireNonNull(interfaceC0573s, "sink == null");
        this.f2535i = interfaceC0573s;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: C */
    public InterfaceC0558d mo2807C(int i10) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2807C(i10);
        return mo2815J();
    }

    @Override // bf.InterfaceC0573s
    /* renamed from: C0 */
    public void mo2798C0(C0557c c0557c, long j10) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2798C0(c0557c, j10);
        mo2815J();
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: J */
    public InterfaceC0558d mo2815J() {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        long m2839n = this.f2534h.m2839n();
        if (m2839n > 0) {
            this.f2535i.mo2798C0(this.f2534h, m2839n);
        }
        return this;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: S */
    public InterfaceC0558d mo2820S(String str) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2820S(str);
        return mo2815J();
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: Y */
    public InterfaceC0558d mo2822Y(byte[] bArr, int i10, int i11) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2822Y(bArr, i10, i11);
        return mo2815J();
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: b */
    public C0557c mo2823b() {
        return this.f2534h;
    }

    @Override // bf.InterfaceC0573s
    /* renamed from: c */
    public C0575u mo2799c() {
        return this.f2535i.mo2799c();
    }

    @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2536j) {
            return;
        }
        Throwable th = null;
        try {
            C0557c c0557c = this.f2534h;
            long j10 = c0557c.f2508i;
            if (j10 > 0) {
                this.f2535i.mo2798C0(c0557c, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f2535i.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f2536j = true;
        if (th != null) {
            C0576v.m2924e(th);
        }
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: d0 */
    public InterfaceC0558d mo2826d0(long j10) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2826d0(j10);
        return mo2815J();
    }

    @Override // bf.InterfaceC0558d, bf.InterfaceC0573s, java.io.Flushable
    public void flush() {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        C0557c c0557c = this.f2534h;
        long j10 = c0557c.f2508i;
        if (j10 > 0) {
            this.f2535i.mo2798C0(c0557c, j10);
        }
        this.f2535i.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2536j;
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: r */
    public InterfaceC0558d mo2842r(int i10) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2842r(i10);
        return mo2815J();
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: t0 */
    public InterfaceC0558d mo2845t0(byte[] bArr) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2845t0(bArr);
        return mo2815J();
    }

    public String toString() {
        return "buffer(" + this.f2535i + ")";
    }

    @Override // bf.InterfaceC0558d
    /* renamed from: u */
    public InterfaceC0558d mo2846u(int i10) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        this.f2534h.mo2846u(i10);
        return mo2815J();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f2536j) {
            throw new IllegalStateException("closed");
        }
        int write = this.f2534h.write(byteBuffer);
        mo2815J();
        return write;
    }
}
