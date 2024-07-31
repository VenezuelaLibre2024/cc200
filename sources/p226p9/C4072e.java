package p226p9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p240q9.C4212c;
import p255r9.AbstractC4328e;
import p255r9.C4326c;

/* renamed from: p9.e */
/* loaded from: classes.dex */
public class C4072e extends AbstractC4073e0<a> {

    /* renamed from: l */
    public final Uri f14629l;

    /* renamed from: m */
    public long f14630m;

    /* renamed from: n */
    public C4093p f14631n;

    /* renamed from: o */
    public C4212c f14632o;

    /* renamed from: p */
    public long f14633p = -1;

    /* renamed from: q */
    public String f14634q = null;

    /* renamed from: r */
    public volatile Exception f14635r = null;

    /* renamed from: s */
    public long f14636s = 0;

    /* renamed from: t */
    public int f14637t;

    /* renamed from: p9.e$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4073e0<a>.b {

        /* renamed from: c */
        public final long f14638c;

        public a(Exception exc, long j10) {
            super(exc);
            this.f14638c = j10;
        }

        /* renamed from: d */
        public long m15632d() {
            return this.f14638c;
        }

        /* renamed from: e */
        public long m15633e() {
            return C4072e.this.m15628m0();
        }
    }

    public C4072e(C4093p c4093p, Uri uri) {
        this.f14631n = c4093p;
        this.f14629l = uri;
        C4074f m15845u = c4093p.m15845u();
        this.f14632o = new C4212c(m15845u.m15697a().m14349m(), m15845u.m15699c(), m15845u.m15698b(), m15845u.m15703i());
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: I */
    public C4093p mo15622I() {
        return this.f14631n;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: U */
    public void mo15623U() {
        this.f14632o.m16225a();
        this.f14635r = C4090n.m15756c(Status.f4474q);
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: e0 */
    public void mo15624e0() {
        String str;
        if (this.f14635r != null) {
            m15674j0(64, false);
            return;
        }
        if (!m15674j0(4, false)) {
            return;
        }
        do {
            this.f14630m = 0L;
            this.f14635r = null;
            this.f14632o.m16227c();
            C4326c c4326c = new C4326c(this.f14631n.m15846v(), this.f14631n.m15835i(), this.f14636s);
            this.f14632o.m16229e(c4326c, false);
            this.f14637t = c4326c.m16599o();
            this.f14635r = c4326c.m16592f() != null ? c4326c.m16592f() : this.f14635r;
            boolean z10 = m15629n0(this.f14637t) && this.f14635r == null && m15651B() == 4;
            if (z10) {
                this.f14633p = c4326c.m16602r() + this.f14636s;
                String m16601q = c4326c.m16601q("ETag");
                if (!TextUtils.isEmpty(m16601q) && (str = this.f14634q) != null && !str.equals(m16601q)) {
                    Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                    this.f14636s = 0L;
                    this.f14634q = null;
                    c4326c.m16583C();
                    mo15625f0();
                    return;
                }
                this.f14634q = m16601q;
                try {
                    z10 = m15630o0(c4326c);
                } catch (IOException e10) {
                    Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e10);
                    this.f14635r = e10;
                }
            }
            c4326c.m16583C();
            if (z10 && this.f14635r == null && m15651B() == 4) {
                m15674j0(128, false);
                return;
            }
            File file = new File(this.f14629l.getPath());
            if (file.exists()) {
                this.f14636s = file.length();
            } else {
                this.f14636s = 0L;
            }
            if (m15651B() == 8) {
                m15674j0(16, false);
                return;
            }
            if (m15651B() == 32) {
                if (m15674j0(256, false)) {
                    return;
                }
                Log.w("FileDownloadTask", "Unable to change download task to final state from " + m15651B());
                return;
            }
        } while (this.f14630m > 0);
        m15674j0(64, false);
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: f0 */
    public void mo15625f0() {
        C4077g0.m15718b().m15724g(m15654E());
    }

    /* renamed from: l0 */
    public final int m15627l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i10 = 0;
        boolean z10 = false;
        while (i10 != bArr.length && (read = inputStream.read(bArr, i10, bArr.length - i10)) != -1) {
            try {
                z10 = true;
                i10 += read;
            } catch (IOException e10) {
                this.f14635r = e10;
            }
        }
        if (z10) {
            return i10;
        }
        return -1;
    }

    /* renamed from: m0 */
    public long m15628m0() {
        return this.f14633p;
    }

    /* renamed from: n0 */
    public final boolean m15629n0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: o0 */
    public final boolean m15630o0(AbstractC4328e abstractC4328e) {
        FileOutputStream fileOutputStream;
        InputStream m16604t = abstractC4328e.m16604t();
        if (m16604t == null) {
            this.f14635r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f14629l.getPath());
        if (!file.exists()) {
            if (this.f14636s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z10 = true;
        if (this.f14636s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f14636s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z10) {
                int m15627l0 = m15627l0(m16604t, bArr);
                if (m15627l0 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, m15627l0);
                this.f14630m += m15627l0;
                if (this.f14635r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f14635r);
                    this.f14635r = null;
                    z10 = false;
                }
                if (!m15674j0(4, false)) {
                    z10 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            m16604t.close();
            return z10;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            m16604t.close();
            throw th;
        }
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: p0 */
    public a mo15626h0() {
        return new a(C4090n.m15758e(this.f14635r, this.f14637t), this.f14630m + this.f14636s);
    }
}
