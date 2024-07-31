package bf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: bf.k */
/* loaded from: classes2.dex */
public final class C0565k implements InterfaceC0574t {

    /* renamed from: h */
    public final InterfaceC0559e f2522h;

    /* renamed from: i */
    public final Inflater f2523i;

    /* renamed from: j */
    public int f2524j;

    /* renamed from: k */
    public boolean f2525k;

    public C0565k(InterfaceC0559e interfaceC0559e, Inflater inflater) {
        if (interfaceC0559e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f2522h = interfaceC0559e;
        this.f2523i = inflater;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: T */
    public long mo2800T(C0557c c0557c, long j10) {
        boolean m2891a;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f2525k) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            m2891a = m2891a();
            try {
                C0570p m2836l0 = c0557c.m2836l0(1);
                int inflate = this.f2523i.inflate(m2836l0.f2540a, m2836l0.f2542c, (int) Math.min(j10, 8192 - m2836l0.f2542c));
                if (inflate > 0) {
                    m2836l0.f2542c += inflate;
                    long j11 = inflate;
                    c0557c.f2508i += j11;
                    return j11;
                }
                if (!this.f2523i.finished() && !this.f2523i.needsDictionary()) {
                }
                m2892d();
                if (m2836l0.f2541b != m2836l0.f2542c) {
                    return -1L;
                }
                c0557c.f2507h = m2836l0.m2910b();
                C0571q.m2915a(m2836l0);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!m2891a);
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: a */
    public final boolean m2891a() {
        if (!this.f2523i.needsInput()) {
            return false;
        }
        m2892d();
        if (this.f2523i.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f2522h.mo2805B()) {
            return true;
        }
        C0570p c0570p = this.f2522h.mo2823b().f2507h;
        int i10 = c0570p.f2542c;
        int i11 = c0570p.f2541b;
        int i12 = i10 - i11;
        this.f2524j = i12;
        this.f2523i.setInput(c0570p.f2540a, i11, i12);
        return false;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: c */
    public C0575u mo2801c() {
        return this.f2522h.mo2801c();
    }

    @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2525k) {
            return;
        }
        this.f2523i.end();
        this.f2525k = true;
        this.f2522h.close();
    }

    /* renamed from: d */
    public final void m2892d() {
        int i10 = this.f2524j;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f2523i.getRemaining();
        this.f2524j -= remaining;
        this.f2522h.mo2827e(remaining);
    }
}
