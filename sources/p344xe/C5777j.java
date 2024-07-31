package p344xe;

import bf.C0557c;
import bf.InterfaceC0558d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p079f6.C1841a;
import p344xe.C5771d;
import se.C4596e;

/* renamed from: xe.j */
/* loaded from: classes2.dex */
public final class C5777j implements Closeable {

    /* renamed from: n */
    public static final Logger f21513n = Logger.getLogger(C5772e.class.getName());

    /* renamed from: h */
    public final InterfaceC0558d f21514h;

    /* renamed from: i */
    public final boolean f21515i;

    /* renamed from: j */
    public final C0557c f21516j;

    /* renamed from: k */
    public int f21517k;

    /* renamed from: l */
    public boolean f21518l;

    /* renamed from: m */
    public final C5771d.b f21519m;

    public C5777j(InterfaceC0558d interfaceC0558d, boolean z10) {
        this.f21514h = interfaceC0558d;
        this.f21515i = z10;
        C0557c c0557c = new C0557c();
        this.f21516j = c0557c;
        this.f21519m = new C5771d.b(c0557c);
        this.f21517k = 16384;
    }

    /* renamed from: c0 */
    public static void m23036c0(InterfaceC0558d interfaceC0558d, int i10) {
        interfaceC0558d.mo2807C((i10 >>> 16) & 255);
        interfaceC0558d.mo2807C((i10 >>> 8) & 255);
        interfaceC0558d.mo2807C(i10 & 255);
    }

    /* renamed from: E */
    public synchronized void m23037E(boolean z10, int i10, int i11) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        m23047l(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f21514h.mo2846u(i10);
        this.f21514h.mo2846u(i11);
        this.f21514h.flush();
    }

    /* renamed from: I */
    public synchronized void m23038I(int i10, int i11, List<C5770c> list) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        this.f21519m.m22938g(list);
        long m2831g0 = this.f21516j.m2831g0();
        int min = (int) Math.min(this.f21517k - 4, m2831g0);
        long j10 = min;
        m23047l(i10, min + 4, (byte) 5, m2831g0 == j10 ? (byte) 4 : (byte) 0);
        this.f21514h.mo2846u(i11 & C1841a.e.API_PRIORITY_OTHER);
        this.f21514h.mo2798C0(this.f21516j, j10);
        if (m2831g0 > j10) {
            m23043b0(i10, m2831g0 - j10);
        }
    }

    /* renamed from: K */
    public synchronized void m23039K(int i10, EnumC5769b enumC5769b) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        if (enumC5769b.f21365h == -1) {
            throw new IllegalArgumentException();
        }
        m23047l(i10, 4, (byte) 3, (byte) 0);
        this.f21514h.mo2846u(enumC5769b.f21365h);
        this.f21514h.flush();
    }

    /* renamed from: P */
    public synchronized void m23040P(C5780m c5780m) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        int i10 = 0;
        m23047l(0, c5780m.m23070j() * 6, (byte) 4, (byte) 0);
        while (i10 < 10) {
            if (c5780m.m23067g(i10)) {
                this.f21514h.mo2842r(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                this.f21514h.mo2846u(c5780m.m23062b(i10));
            }
            i10++;
        }
        this.f21514h.flush();
    }

    /* renamed from: W */
    public synchronized void m23041W(int i10, long j10) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw C5772e.m22942c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
        m23047l(i10, 4, (byte) 8, (byte) 0);
        this.f21514h.mo2846u((int) j10);
        this.f21514h.flush();
    }

    /* renamed from: a */
    public synchronized void m23042a(C5780m c5780m) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        this.f21517k = c5780m.m23066f(this.f21517k);
        if (c5780m.m23063c() != -1) {
            this.f21519m.m22936e(c5780m.m23063c());
        }
        m23047l(0, 0, (byte) 4, (byte) 1);
        this.f21514h.flush();
    }

    /* renamed from: b0 */
    public final void m23043b0(int i10, long j10) {
        while (j10 > 0) {
            int min = (int) Math.min(this.f21517k, j10);
            long j11 = min;
            j10 -= j11;
            m23047l(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f21514h.mo2798C0(this.f21516j, j11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f21518l = true;
        this.f21514h.close();
    }

    /* renamed from: d */
    public synchronized void m23044d() {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        if (this.f21515i) {
            Logger logger = f21513n;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C4596e.m18108p(">> CONNECTION %s", C5772e.f21395a.mo2866o()));
            }
            this.f21514h.mo2845t0(C5772e.f21395a.mo2875y());
            this.f21514h.flush();
        }
    }

    /* renamed from: f */
    public synchronized void m23045f(boolean z10, int i10, C0557c c0557c, int i11) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        m23046j(i10, z10 ? (byte) 1 : (byte) 0, c0557c, i11);
    }

    public synchronized void flush() {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        this.f21514h.flush();
    }

    /* renamed from: j */
    public void m23046j(int i10, byte b10, C0557c c0557c, int i11) {
        m23047l(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f21514h.mo2798C0(c0557c, i11);
        }
    }

    /* renamed from: l */
    public void m23047l(int i10, int i11, byte b10, byte b11) {
        Logger logger = f21513n;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C5772e.m22941b(false, i10, i11, b10, b11));
        }
        int i12 = this.f21517k;
        if (i11 > i12) {
            throw C5772e.m22942c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw C5772e.m22942c("reserved bit set: %s", Integer.valueOf(i10));
        }
        m23036c0(this.f21514h, i11);
        this.f21514h.mo2807C(b10 & 255);
        this.f21514h.mo2807C(b11 & 255);
        this.f21514h.mo2846u(i10 & C1841a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: n */
    public synchronized void m23048n(int i10, EnumC5769b enumC5769b, byte[] bArr) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        if (enumC5769b.f21365h == -1) {
            throw C5772e.m22942c("errorCode.httpCode == -1", new Object[0]);
        }
        m23047l(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f21514h.mo2846u(i10);
        this.f21514h.mo2846u(enumC5769b.f21365h);
        if (bArr.length > 0) {
            this.f21514h.mo2845t0(bArr);
        }
        this.f21514h.flush();
    }

    /* renamed from: w */
    public synchronized void m23049w(boolean z10, int i10, List<C5770c> list) {
        if (this.f21518l) {
            throw new IOException("closed");
        }
        this.f21519m.m22938g(list);
        long m2831g0 = this.f21516j.m2831g0();
        int min = (int) Math.min(this.f21517k, m2831g0);
        long j10 = min;
        byte b10 = m2831g0 == j10 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        m23047l(i10, min, (byte) 1, b10);
        this.f21514h.mo2798C0(this.f21516j, j10);
        if (m2831g0 > j10) {
            m23043b0(i10, m2831g0 - j10);
        }
    }

    /* renamed from: x */
    public int m23050x() {
        return this.f21517k;
    }
}
