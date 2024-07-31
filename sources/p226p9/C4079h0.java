package p226p9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p108h6.C2394s;
import p240q9.C4212c;
import p255r9.AbstractC4328e;
import p255r9.C4326c;

/* renamed from: p9.h0 */
/* loaded from: classes.dex */
public class C4079h0 extends AbstractC4073e0<d> {

    /* renamed from: l */
    public C4093p f14679l;

    /* renamed from: m */
    public C4212c f14680m;

    /* renamed from: p */
    public b f14683p;

    /* renamed from: r */
    public long f14685r;

    /* renamed from: s */
    public long f14686s;

    /* renamed from: t */
    public InputStream f14687t;

    /* renamed from: u */
    public AbstractC4328e f14688u;

    /* renamed from: v */
    public String f14689v;

    /* renamed from: n */
    public volatile Exception f14681n = null;

    /* renamed from: o */
    public volatile int f14682o = 0;

    /* renamed from: q */
    public long f14684q = -1;

    /* renamed from: p9.h0$a */
    /* loaded from: classes.dex */
    public class a implements Callable<InputStream> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call() {
            return C4079h0.this.m15730o0();
        }
    }

    /* renamed from: p9.h0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15736a(d dVar, InputStream inputStream);
    }

    /* renamed from: p9.h0$c */
    /* loaded from: classes.dex */
    public static class c extends InputStream {

        /* renamed from: h */
        public C4079h0 f14691h;

        /* renamed from: i */
        public InputStream f14692i;

        /* renamed from: j */
        public Callable<InputStream> f14693j;

        /* renamed from: k */
        public IOException f14694k;

        /* renamed from: l */
        public long f14695l;

        /* renamed from: m */
        public long f14696m;

        /* renamed from: n */
        public boolean f14697n;

        public c(Callable<InputStream> callable, C4079h0 c4079h0) {
            this.f14691h = c4079h0;
            this.f14693j = callable;
        }

        @Override // java.io.InputStream
        public int available() {
            while (m15739f()) {
                try {
                    return this.f14692i.available();
                } catch (IOException e10) {
                    this.f14694k = e10;
                }
            }
            throw this.f14694k;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f14692i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f14697n = true;
            C4079h0 c4079h0 = this.f14691h;
            if (c4079h0 != null && c4079h0.f14688u != null) {
                this.f14691h.f14688u.m16583C();
                this.f14691h.f14688u = null;
            }
            m15738d();
        }

        /* renamed from: d */
        public final void m15738d() {
            C4079h0 c4079h0 = this.f14691h;
            if (c4079h0 != null && c4079h0.m15651B() == 32) {
                throw new C4064a();
            }
        }

        /* renamed from: f */
        public final boolean m15739f() {
            m15738d();
            if (this.f14694k != null) {
                try {
                    InputStream inputStream = this.f14692i;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f14692i = null;
                if (this.f14696m == this.f14695l) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f14694k);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f14695l, this.f14694k);
                this.f14696m = this.f14695l;
                this.f14694k = null;
            }
            if (this.f14697n) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f14692i != null) {
                return true;
            }
            try {
                this.f14692i = this.f14693j.call();
                return true;
            } catch (Exception e10) {
                if (e10 instanceof IOException) {
                    throw ((IOException) e10);
                }
                throw new IOException("Unable to open stream", e10);
            }
        }

        /* renamed from: j */
        public final void m15740j(long j10) {
            C4079h0 c4079h0 = this.f14691h;
            if (c4079h0 != null) {
                c4079h0.m15732q0(j10);
            }
            this.f14695l += j10;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            while (m15739f()) {
                try {
                    int read = this.f14692i.read();
                    if (read != -1) {
                        m15740j(1L);
                    }
                    return read;
                } catch (IOException e10) {
                    this.f14694k = e10;
                }
            }
            throw this.f14694k;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (m15739f()) {
                while (i11 > 262144) {
                    try {
                        int read = this.f14692i.read(bArr, i10, 262144);
                        if (read == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += read;
                        i10 += read;
                        i11 -= read;
                        m15740j(read);
                        m15738d();
                    } catch (IOException e10) {
                        this.f14694k = e10;
                    }
                }
                if (i11 > 0) {
                    int read2 = this.f14692i.read(bArr, i10, i11);
                    if (read2 == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    i10 += read2;
                    i12 += read2;
                    i11 -= read2;
                    m15740j(read2);
                }
                if (i11 == 0) {
                    return i12;
                }
            }
            throw this.f14694k;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = 0;
            while (m15739f()) {
                while (j10 > 262144) {
                    try {
                        long skip = this.f14692i.skip(262144L);
                        if (skip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += skip;
                        j10 -= skip;
                        m15740j(skip);
                        m15738d();
                    } catch (IOException e10) {
                        this.f14694k = e10;
                    }
                }
                if (j10 > 0) {
                    long skip2 = this.f14692i.skip(j10);
                    if (skip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += skip2;
                    j10 -= skip2;
                    m15740j(skip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.f14694k;
        }
    }

    /* renamed from: p9.h0$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC4073e0<d>.b {

        /* renamed from: c */
        public final long f14698c;

        public d(Exception exc, long j10) {
            super(exc);
            this.f14698c = j10;
        }
    }

    public C4079h0(C4093p c4093p) {
        this.f14679l = c4093p;
        C4074f m15845u = c4093p.m15845u();
        this.f14680m = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15703i());
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: I */
    public C4093p mo15622I() {
        return this.f14679l;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: U */
    public void mo15623U() {
        this.f14680m.m16225a();
        this.f14681n = C4090n.m15756c(Status.f4474q);
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: X */
    public void mo15663X() {
        this.f14686s = this.f14685r;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: a0 */
    public boolean mo15666a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: d0 */
    public boolean mo15669d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: e0 */
    public void mo15624e0() {
        if (this.f14681n != null) {
            m15674j0(64, false);
            return;
        }
        if (m15674j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f14687t = new BufferedInputStream(cVar);
            try {
                cVar.m15739f();
                b bVar = this.f14683p;
                if (bVar != null) {
                    try {
                        bVar.mo15736a(m15670g0(), this.f14687t);
                    } catch (Exception e10) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e10);
                        this.f14681n = e10;
                    }
                }
            } catch (IOException e11) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e11);
                this.f14681n = e11;
            }
            if (this.f14687t == null) {
                this.f14688u.m16583C();
                this.f14688u = null;
            }
            if (this.f14681n == null && m15651B() == 4) {
                m15674j0(4, false);
                m15674j0(128, false);
                return;
            }
            if (m15674j0(m15651B() == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + m15651B());
        }
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: f0 */
    public void mo15625f0() {
        C4077g0.m15718b().m15724g(m15654E());
    }

    /* renamed from: o0 */
    public final InputStream m15730o0() {
        String str;
        this.f14680m.m16227c();
        AbstractC4328e abstractC4328e = this.f14688u;
        if (abstractC4328e != null) {
            abstractC4328e.m16583C();
        }
        C4326c c4326c = new C4326c(this.f14679l.m15846v(), this.f14679l.m15835i(), this.f14685r);
        this.f14688u = c4326c;
        boolean z10 = false;
        this.f14680m.m16229e(c4326c, false);
        this.f14682o = this.f14688u.m16599o();
        this.f14681n = this.f14688u.m16592f() != null ? this.f14688u.m16592f() : this.f14681n;
        if (m15731p0(this.f14682o) && this.f14681n == null && m15651B() == 4) {
            z10 = true;
        }
        if (!z10) {
            throw new IOException("Could not open resulting stream.");
        }
        String m16601q = this.f14688u.m16601q("ETag");
        if (!TextUtils.isEmpty(m16601q) && (str = this.f14689v) != null && !str.equals(m16601q)) {
            this.f14682o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        this.f14689v = m16601q;
        this.f14684q = this.f14688u.m16602r() + this.f14685r;
        return this.f14688u.m16604t();
    }

    /* renamed from: p0 */
    public final boolean m15731p0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: q0 */
    public void m15732q0(long j10) {
        long j11 = this.f14685r + j10;
        this.f14685r = j11;
        if (this.f14686s + 262144 <= j11) {
            if (m15651B() == 4) {
                m15674j0(4, false);
            } else {
                this.f14686s = this.f14685r;
            }
        }
    }

    /* renamed from: r0 */
    public C4079h0 m15733r0(b bVar) {
        C2394s.m9619l(bVar);
        C2394s.m9622o(this.f14683p == null);
        this.f14683p = bVar;
        return this;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d mo15626h0() {
        return new d(C4090n.m15758e(this.f14681n, this.f14682o), this.f14686s);
    }
}
