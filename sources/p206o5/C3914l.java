package p206o5;

import java.io.InputStream;
import p222p5.C4014a;

/* renamed from: o5.l */
/* loaded from: classes.dex */
public final class C3914l extends InputStream {

    /* renamed from: h */
    public final InterfaceC3910j f14061h;

    /* renamed from: i */
    public final C3918n f14062i;

    /* renamed from: m */
    public long f14066m;

    /* renamed from: k */
    public boolean f14064k = false;

    /* renamed from: l */
    public boolean f14065l = false;

    /* renamed from: j */
    public final byte[] f14063j = new byte[1];

    public C3914l(InterfaceC3910j interfaceC3910j, C3918n c3918n) {
        this.f14061h = interfaceC3910j;
        this.f14062i = c3918n;
    }

    /* renamed from: a */
    public final void m14841a() {
        if (this.f14064k) {
            return;
        }
        this.f14061h.mo14770k(this.f14062i);
        this.f14064k = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14065l) {
            return;
        }
        this.f14061h.close();
        this.f14065l = true;
    }

    /* renamed from: d */
    public void m14842d() {
        m14841a();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f14063j) == -1) {
            return -1;
        }
        return this.f14063j[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        C4014a.m15200f(!this.f14065l);
        m14841a();
        int mo14769c = this.f14061h.mo14769c(bArr, i10, i11);
        if (mo14769c == -1) {
            return -1;
        }
        this.f14066m += mo14769c;
        return mo14769c;
    }
}
