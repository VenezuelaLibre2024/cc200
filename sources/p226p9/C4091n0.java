package p226p9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import p108h6.C2394s;
import p207o6.C3938g;
import p207o6.InterfaceC3935d;
import p226p9.C4092o;
import p240q9.C4211b;
import p240q9.C4212c;
import p240q9.C4215f;
import p240q9.C4218i;
import p240q9.InterfaceC4214e;
import p255r9.AbstractC4328e;
import p255r9.C4330g;
import p255r9.C4331h;
import p255r9.C4332i;
import p255r9.C4333j;
import p308v7.InterfaceC5140b;
import p337x7.InterfaceC5657b;

/* renamed from: p9.n0 */
/* loaded from: classes.dex */
public class C4091n0 extends AbstractC4073e0<b> {

    /* renamed from: E */
    public static final Random f14733E = new Random();

    /* renamed from: F */
    public static InterfaceC4214e f14734F = new C4215f();

    /* renamed from: G */
    public static InterfaceC3935d f14735G = C3938g.m14938d();

    /* renamed from: A */
    public volatile String f14736A;

    /* renamed from: B */
    public volatile long f14737B;

    /* renamed from: C */
    public int f14738C;

    /* renamed from: D */
    public final int f14739D;

    /* renamed from: l */
    public final C4093p f14740l;

    /* renamed from: m */
    public final Uri f14741m;

    /* renamed from: n */
    public final long f14742n;

    /* renamed from: o */
    public final C4211b f14743o;

    /* renamed from: p */
    public final AtomicLong f14744p;

    /* renamed from: q */
    public final InterfaceC5657b f14745q;

    /* renamed from: r */
    public final InterfaceC5140b f14746r;

    /* renamed from: s */
    public int f14747s;

    /* renamed from: t */
    public C4212c f14748t;

    /* renamed from: u */
    public boolean f14749u;

    /* renamed from: v */
    public volatile C4092o f14750v;

    /* renamed from: w */
    public volatile Uri f14751w;

    /* renamed from: x */
    public volatile Exception f14752x;

    /* renamed from: y */
    public volatile Exception f14753y;

    /* renamed from: z */
    public volatile int f14754z;

    /* renamed from: p9.n0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC4328e f14755h;

        public a(AbstractC4328e abstractC4328e) {
            this.f14755h = abstractC4328e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14755h.m16582B(C4218i.m16240c(C4091n0.this.f14745q), C4218i.m16239b(C4091n0.this.f14746r), C4091n0.this.f14740l.m15835i().m14349m());
        }
    }

    /* renamed from: p9.n0$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC4073e0<b>.b {

        /* renamed from: c */
        public final long f14757c;

        /* renamed from: d */
        public final Uri f14758d;

        /* renamed from: e */
        public final C4092o f14759e;

        public b(Exception exc, long j10, Uri uri, C4092o c4092o) {
            super(exc);
            this.f14757c = j10;
            this.f14758d = uri;
            this.f14759e = c4092o;
        }

        /* renamed from: d */
        public long m15777d() {
            return this.f14757c;
        }

        /* renamed from: e */
        public C4092o m15778e() {
            return this.f14759e;
        }

        /* renamed from: f */
        public long m15779f() {
            return C4091n0.this.m15767q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4091n0(p226p9.C4093p r11, p226p9.C4092o r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p226p9.C4091n0.<init>(p9.p, p9.o, android.net.Uri, android.net.Uri):void");
    }

    public C4091n0(C4093p c4093p, C4092o c4092o, byte[] bArr) {
        this.f14744p = new AtomicLong(0L);
        this.f14747s = 262144;
        this.f14751w = null;
        this.f14752x = null;
        this.f14753y = null;
        this.f14754z = 0;
        this.f14738C = 0;
        this.f14739D = 1000;
        C2394s.m9619l(c4093p);
        C2394s.m9619l(bArr);
        C4074f m15845u = c4093p.m15845u();
        this.f14742n = bArr.length;
        this.f14740l = c4093p;
        this.f14750v = c4092o;
        InterfaceC5657b m15699c = m15845u.m15699c();
        this.f14745q = m15699c;
        InterfaceC5140b m15698b = m15845u.m15698b();
        this.f14746r = m15698b;
        this.f14741m = null;
        this.f14743o = new C4211b(new ByteArrayInputStream(bArr), 262144);
        this.f14749u = true;
        this.f14737B = m15845u.m15702h();
        this.f14748t = new C4212c(m15845u.m15697a().m14349m(), m15699c, m15698b, m15845u.m15703i());
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: I */
    public C4093p mo15622I() {
        return this.f14740l;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: U */
    public void mo15623U() {
        this.f14748t.m16225a();
        C4331h c4331h = this.f14751w != null ? new C4331h(this.f14740l.m15846v(), this.f14740l.m15835i(), this.f14751w) : null;
        if (c4331h != null) {
            C4077g0.m15718b().m15723f(new a(c4331h));
        }
        this.f14752x = C4090n.m15756c(Status.f4474q);
        super.mo15623U();
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: c0 */
    public void mo15668c0() {
        this.f14752x = null;
        this.f14753y = null;
        this.f14754z = 0;
        this.f14736A = null;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: e0 */
    public void mo15624e0() {
        this.f14748t.m16227c();
        if (!m15674j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f14740l.m15842r() == null) {
            this.f14752x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f14752x != null) {
            return;
        }
        if (this.f14751w == null) {
            m15765o0();
        } else {
            m15770t0(false);
        }
        boolean m15774x0 = m15774x0();
        while (m15774x0) {
            m15776z0();
            m15774x0 = m15774x0();
            if (m15774x0) {
                m15674j0(4, false);
            }
        }
        if (!this.f14749u || m15651B() == 16) {
            return;
        }
        try {
            this.f14743o.m16220c();
        } catch (IOException e10) {
            Log.e("UploadTask", "Unable to close stream.", e10);
        }
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: f0 */
    public void mo15625f0() {
        C4077g0.m15718b().m15725h(m15654E());
    }

    /* renamed from: o0 */
    public final void m15765o0() {
        String m15809w = this.f14750v != null ? this.f14750v.m15809w() : null;
        if (this.f14741m != null && TextUtils.isEmpty(m15809w)) {
            m15809w = this.f14740l.m15845u().m15697a().m14349m().getContentResolver().getType(this.f14741m);
        }
        if (TextUtils.isEmpty(m15809w)) {
            m15809w = "application/octet-stream";
        }
        C4333j c4333j = new C4333j(this.f14740l.m15846v(), this.f14740l.m15835i(), this.f14750v != null ? this.f14750v.m15803q() : null, m15809w);
        if (m15772v0(c4333j)) {
            String m16601q = c4333j.m16601q("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(m16601q)) {
                return;
            }
            this.f14751w = Uri.parse(m16601q);
        }
    }

    /* renamed from: p0 */
    public final boolean m15766p0(AbstractC4328e abstractC4328e) {
        try {
            Log.d("UploadTask", "Waiting " + this.f14738C + " milliseconds");
            f14734F.mo16233a(this.f14738C + f14733E.nextInt(250));
            boolean m15771u0 = m15771u0(abstractC4328e);
            if (m15771u0) {
                this.f14738C = 0;
            }
            return m15771u0;
        } catch (InterruptedException e10) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f14753y = e10;
            return false;
        }
    }

    /* renamed from: q0 */
    public long m15767q0() {
        return this.f14742n;
    }

    /* renamed from: r0 */
    public final boolean m15768r0(int i10) {
        return i10 == 308 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: s0 */
    public final boolean m15769s0(AbstractC4328e abstractC4328e) {
        int m16599o = abstractC4328e.m16599o();
        if (this.f14748t.m16226b(m16599o)) {
            m16599o = -2;
        }
        this.f14754z = m16599o;
        this.f14753y = abstractC4328e.m16592f();
        this.f14736A = abstractC4328e.m16601q("X-Goog-Upload-Status");
        return m15768r0(this.f14754z) && this.f14753y == null;
    }

    /* renamed from: t0 */
    public final boolean m15770t0(boolean z10) {
        C4332i c4332i = new C4332i(this.f14740l.m15846v(), this.f14740l.m15835i(), this.f14751w);
        if ("final".equals(this.f14736A)) {
            return false;
        }
        if (z10) {
            if (!m15772v0(c4332i)) {
                return false;
            }
        } else if (!m15771u0(c4332i)) {
            return false;
        }
        if ("final".equals(c4332i.m16601q("X-Goog-Upload-Status"))) {
            e = new IOException("The server has terminated the upload session");
        } else {
            String m16601q = c4332i.m16601q("X-Goog-Upload-Size-Received");
            long parseLong = !TextUtils.isEmpty(m16601q) ? Long.parseLong(m16601q) : 0L;
            long j10 = this.f14744p.get();
            if (j10 > parseLong) {
                e = new IOException("Unexpected error. The server lost a chunk update.");
            } else {
                if (j10 >= parseLong) {
                    return true;
                }
                try {
                    if (this.f14743o.m16218a((int) r7) != parseLong - j10) {
                        this.f14752x = new IOException("Unexpected end of stream encountered.");
                        return false;
                    }
                    if (this.f14744p.compareAndSet(j10, parseLong)) {
                        return true;
                    }
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f14752x = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                } catch (IOException e10) {
                    e = e10;
                    Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e);
                }
            }
        }
        this.f14752x = e;
        return false;
    }

    /* renamed from: u0 */
    public final boolean m15771u0(AbstractC4328e abstractC4328e) {
        abstractC4328e.m16582B(C4218i.m16240c(this.f14745q), C4218i.m16239b(this.f14746r), this.f14740l.m15835i().m14349m());
        return m15769s0(abstractC4328e);
    }

    /* renamed from: v0 */
    public final boolean m15772v0(AbstractC4328e abstractC4328e) {
        this.f14748t.m16228d(abstractC4328e);
        return m15769s0(abstractC4328e);
    }

    /* renamed from: w0 */
    public final boolean m15773w0() {
        if (!"final".equals(this.f14736A)) {
            return true;
        }
        if (this.f14752x == null) {
            this.f14752x = new IOException("The server has terminated the upload session", this.f14753y);
        }
        m15674j0(64, false);
        return false;
    }

    /* renamed from: x0 */
    public final boolean m15774x0() {
        if (m15651B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f14752x = new InterruptedException();
            m15674j0(64, false);
            return false;
        }
        if (m15651B() == 32) {
            m15674j0(256, false);
            return false;
        }
        if (m15651B() == 8) {
            m15674j0(16, false);
            return false;
        }
        if (!m15773w0()) {
            return false;
        }
        if (this.f14751w == null) {
            if (this.f14752x == null) {
                this.f14752x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            m15674j0(64, false);
            return false;
        }
        if (this.f14752x != null) {
            m15674j0(64, false);
            return false;
        }
        boolean z10 = this.f14753y != null || this.f14754z < 200 || this.f14754z >= 300;
        long mo14933b = f14735G.mo14933b() + this.f14737B;
        long mo14933b2 = f14735G.mo14933b() + this.f14738C;
        if (z10) {
            if (mo14933b2 > mo14933b || !m15770t0(true)) {
                if (m15773w0()) {
                    m15674j0(64, false);
                }
                return false;
            }
            this.f14738C = Math.max(this.f14738C * 2, 1000);
        }
        return true;
    }

    @Override // p226p9.AbstractC4073e0
    /* renamed from: y0 */
    public b mo15626h0() {
        return new b(C4090n.m15758e(this.f14752x != null ? this.f14752x : this.f14753y, this.f14754z), this.f14744p.get(), this.f14751w, this.f14750v);
    }

    /* renamed from: z0 */
    public final void m15776z0() {
        try {
            this.f14743o.m16221d(this.f14747s);
            int min = Math.min(this.f14747s, this.f14743o.m16219b());
            C4330g c4330g = new C4330g(this.f14740l.m15846v(), this.f14740l.m15835i(), this.f14751w, this.f14743o.m16222e(), this.f14744p.get(), min, this.f14743o.m16223f());
            if (!m15766p0(c4330g)) {
                this.f14747s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f14747s);
                return;
            }
            this.f14744p.getAndAdd(min);
            if (!this.f14743o.m16223f()) {
                this.f14743o.m16218a(min);
                int i10 = this.f14747s;
                if (i10 < 33554432) {
                    this.f14747s = i10 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f14747s);
                    return;
                }
                return;
            }
            try {
                this.f14750v = new C4092o.b(c4330g.m16598n(), this.f14740l).m15813a();
                m15674j0(4, false);
                m15674j0(128, false);
            } catch (JSONException e10) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + c4330g.m16597m(), e10);
                this.f14752x = e10;
            }
        } catch (IOException e11) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e11);
            this.f14752x = e11;
        }
    }
}
