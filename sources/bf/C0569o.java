package bf;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: bf.o */
/* loaded from: classes2.dex */
public final class C0569o implements InterfaceC0559e {

    /* renamed from: h */
    public final C0557c f2537h = new C0557c();

    /* renamed from: i */
    public final InterfaceC0574t f2538i;

    /* renamed from: j */
    public boolean f2539j;

    public C0569o(InterfaceC0574t interfaceC0574t) {
        Objects.requireNonNull(interfaceC0574t, "source == null");
        this.f2538i = interfaceC0574t;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: A */
    public C0557c mo2804A() {
        return this.f2537h;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: B */
    public boolean mo2805B() {
        if (this.f2539j) {
            throw new IllegalStateException("closed");
        }
        return this.f2537h.mo2805B() && this.f2538i.mo2800T(this.f2537h, 8192L) == -1;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: B0 */
    public void mo2806B0(long j10) {
        if (!m2908d(j10)) {
            throw new EOFException();
        }
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: E0 */
    public long mo2808E0(byte b10) {
        return m2907a(b10, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // bf.InterfaceC0559e
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo2809F0() {
        /*
            r6 = this;
            r0 = 1
            r6.mo2806B0(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.m2908d(r3)
            if (r3 == 0) goto L4a
            bf.c r3 = r6.f2537h
            long r4 = (long) r1
            byte r3 = r3.m2813I(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            bf.c r0 = r6.f2537h
            long r0 = r0.mo2809F0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C0569o.mo2809F0():long");
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: H */
    public long mo2811H(InterfaceC0573s interfaceC0573s) {
        if (interfaceC0573s == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j10 = 0;
        while (this.f2538i.mo2800T(this.f2537h, 8192L) != -1) {
            long m2839n = this.f2537h.m2839n();
            if (m2839n > 0) {
                j10 += m2839n;
                interfaceC0573s.mo2798C0(this.f2537h, m2839n);
            }
        }
        if (this.f2537h.m2831g0() <= 0) {
            return j10;
        }
        long m2831g0 = j10 + this.f2537h.m2831g0();
        C0557c c0557c = this.f2537h;
        interfaceC0573s.mo2798C0(c0557c, c0557c.m2831g0());
        return m2831g0;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: L */
    public String mo2818L(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long m2907a = m2907a((byte) 10, 0L, j11);
        if (m2907a != -1) {
            return this.f2537h.m2830f0(m2907a);
        }
        if (j11 < Long.MAX_VALUE && m2908d(j11) && this.f2537h.m2813I(j11 - 1) == 13 && m2908d(1 + j11) && this.f2537h.m2813I(j11) == 10) {
            return this.f2537h.m2830f0(j11);
        }
        C0557c c0557c = new C0557c();
        C0557c c0557c2 = this.f2537h;
        c0557c2.m2849w(c0557c, 0L, Math.min(32L, c0557c2.m2831g0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2537h.m2831g0(), j10) + " content=" + c0557c.m2821W().mo2866o() + (char) 8230);
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: T */
    public long mo2800T(C0557c c0557c, long j10) {
        if (c0557c == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f2539j) {
            throw new IllegalStateException("closed");
        }
        C0557c c0557c2 = this.f2537h;
        if (c0557c2.f2508i == 0 && this.f2538i.mo2800T(c0557c2, 8192L) == -1) {
            return -1L;
        }
        return this.f2537h.mo2800T(c0557c, Math.min(j10, this.f2537h.f2508i));
    }

    /* renamed from: a */
    public long m2907a(byte b10, long j10, long j11) {
        if (this.f2539j) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        while (j10 < j11) {
            long m2817K = this.f2537h.m2817K(b10, j10, j11);
            if (m2817K == -1) {
                C0557c c0557c = this.f2537h;
                long j12 = c0557c.f2508i;
                if (j12 >= j11 || this.f2538i.mo2800T(c0557c, 8192L) == -1) {
                    break;
                }
                j10 = Math.max(j10, j12);
            } else {
                return m2817K;
            }
        }
        return -1L;
    }

    @Override // bf.InterfaceC0559e, bf.InterfaceC0558d
    /* renamed from: b */
    public C0557c mo2823b() {
        return this.f2537h;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: c */
    public C0575u mo2801c() {
        return this.f2538i.mo2801c();
    }

    @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2539j) {
            return;
        }
        this.f2539j = true;
        this.f2538i.close();
        this.f2537h.m2829f();
    }

    /* renamed from: d */
    public boolean m2908d(long j10) {
        C0557c c0557c;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f2539j) {
            throw new IllegalStateException("closed");
        }
        do {
            c0557c = this.f2537h;
            if (c0557c.f2508i >= j10) {
                return true;
            }
        } while (this.f2538i.mo2800T(c0557c, 8192L) != -1);
        return false;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: e */
    public void mo2827e(long j10) {
        if (this.f2539j) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            C0557c c0557c = this.f2537h;
            if (c0557c.f2508i == 0 && this.f2538i.mo2800T(c0557c, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f2537h.m2831g0());
            this.f2537h.mo2827e(min);
            j10 -= min;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2539j;
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: k0 */
    public String mo2834k0() {
        return mo2818L(Long.MAX_VALUE);
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: m */
    public C0560f mo2837m(long j10) {
        mo2806B0(j10);
        return this.f2537h.mo2837m(j10);
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: m0 */
    public int mo2838m0() {
        mo2806B0(4L);
        return this.f2537h.mo2838m0();
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: p0 */
    public byte[] mo2841p0(long j10) {
        mo2806B0(j10);
        return this.f2537h.mo2841p0(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C0557c c0557c = this.f2537h;
        if (c0557c.f2508i == 0 && this.f2538i.mo2800T(c0557c, 8192L) == -1) {
            return -1;
        }
        return this.f2537h.read(byteBuffer);
    }

    @Override // bf.InterfaceC0559e
    public byte readByte() {
        mo2806B0(1L);
        return this.f2537h.readByte();
    }

    @Override // bf.InterfaceC0559e
    public void readFully(byte[] bArr) {
        try {
            mo2806B0(bArr.length);
            this.f2537h.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                C0557c c0557c = this.f2537h;
                long j10 = c0557c.f2508i;
                if (j10 <= 0) {
                    throw e10;
                }
                int m2819P = c0557c.m2819P(bArr, i10, (int) j10);
                if (m2819P == -1) {
                    throw new AssertionError();
                }
                i10 += m2819P;
            }
        }
    }

    @Override // bf.InterfaceC0559e
    public int readInt() {
        mo2806B0(4L);
        return this.f2537h.readInt();
    }

    @Override // bf.InterfaceC0559e
    public short readShort() {
        mo2806B0(2L);
        return this.f2537h.readShort();
    }

    public String toString() {
        return "buffer(" + this.f2538i + ")";
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: w0 */
    public short mo2850w0() {
        mo2806B0(2L);
        return this.f2537h.mo2850w0();
    }

    @Override // bf.InterfaceC0559e
    /* renamed from: z */
    public byte[] mo2854z() {
        this.f2537h.m2847u0(this.f2538i);
        return this.f2537h.mo2854z();
    }
}
