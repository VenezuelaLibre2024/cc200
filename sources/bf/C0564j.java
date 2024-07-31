package bf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: bf.j */
/* loaded from: classes2.dex */
public final class C0564j implements InterfaceC0574t {

    /* renamed from: i */
    public final InterfaceC0559e f2518i;

    /* renamed from: j */
    public final Inflater f2519j;

    /* renamed from: k */
    public final C0565k f2520k;

    /* renamed from: h */
    public int f2517h = 0;

    /* renamed from: l */
    public final CRC32 f2521l = new CRC32();

    public C0564j(InterfaceC0574t interfaceC0574t) {
        if (interfaceC0574t == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f2519j = inflater;
        InterfaceC0559e m2894b = C0566l.m2894b(interfaceC0574t);
        this.f2518i = m2894b;
        this.f2520k = new C0565k(m2894b, inflater);
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: T */
    public long mo2800T(C0557c c0557c, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f2517h == 0) {
            m2888d();
            this.f2517h = 1;
        }
        if (this.f2517h == 1) {
            long j11 = c0557c.f2508i;
            long mo2800T = this.f2520k.mo2800T(c0557c, j10);
            if (mo2800T != -1) {
                m2890j(c0557c, j11, mo2800T);
                return mo2800T;
            }
            this.f2517h = 2;
        }
        if (this.f2517h == 2) {
            m2889f();
            this.f2517h = 3;
            if (!this.f2518i.mo2805B()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: a */
    public final void m2887a(String str, int i10, int i11) {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: c */
    public C0575u mo2801c() {
        return this.f2518i.mo2801c();
    }

    @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2520k.close();
    }

    /* renamed from: d */
    public final void m2888d() {
        this.f2518i.mo2806B0(10L);
        byte m2813I = this.f2518i.mo2823b().m2813I(3L);
        boolean z10 = ((m2813I >> 1) & 1) == 1;
        if (z10) {
            m2890j(this.f2518i.mo2823b(), 0L, 10L);
        }
        m2887a("ID1ID2", 8075, this.f2518i.readShort());
        this.f2518i.mo2827e(8L);
        if (((m2813I >> 2) & 1) == 1) {
            this.f2518i.mo2806B0(2L);
            if (z10) {
                m2890j(this.f2518i.mo2823b(), 0L, 2L);
            }
            long mo2850w0 = this.f2518i.mo2823b().mo2850w0();
            this.f2518i.mo2806B0(mo2850w0);
            if (z10) {
                m2890j(this.f2518i.mo2823b(), 0L, mo2850w0);
            }
            this.f2518i.mo2827e(mo2850w0);
        }
        if (((m2813I >> 3) & 1) == 1) {
            long mo2808E0 = this.f2518i.mo2808E0((byte) 0);
            if (mo2808E0 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m2890j(this.f2518i.mo2823b(), 0L, mo2808E0 + 1);
            }
            this.f2518i.mo2827e(mo2808E0 + 1);
        }
        if (((m2813I >> 4) & 1) == 1) {
            long mo2808E02 = this.f2518i.mo2808E0((byte) 0);
            if (mo2808E02 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m2890j(this.f2518i.mo2823b(), 0L, mo2808E02 + 1);
            }
            this.f2518i.mo2827e(mo2808E02 + 1);
        }
        if (z10) {
            m2887a("FHCRC", this.f2518i.mo2850w0(), (short) this.f2521l.getValue());
            this.f2521l.reset();
        }
    }

    /* renamed from: f */
    public final void m2889f() {
        m2887a("CRC", this.f2518i.mo2838m0(), (int) this.f2521l.getValue());
        m2887a("ISIZE", this.f2518i.mo2838m0(), (int) this.f2519j.getBytesWritten());
    }

    /* renamed from: j */
    public final void m2890j(C0557c c0557c, long j10, long j11) {
        C0570p c0570p = c0557c.f2507h;
        while (true) {
            int i10 = c0570p.f2542c;
            int i11 = c0570p.f2541b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            c0570p = c0570p.f2545f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(c0570p.f2542c - r6, j11);
            this.f2521l.update(c0570p.f2540a, (int) (c0570p.f2541b + j10), min);
            j11 -= min;
            c0570p = c0570p.f2545f;
            j10 = 0;
        }
    }
}
