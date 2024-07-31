package p007a5;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p007a5.C0049c;
import p007a5.C0053g;
import p007a5.C0054h;
import p007a5.C0056j;
import p007a5.InterfaceC0058l;
import p079f6.C1841a;
import p126i7.C2610b0;
import p206o5.C3893a0;
import p206o5.C3901e0;
import p206o5.C3905g0;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4499t2;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.InterfaceC4845a0;
import p365z4.InterfaceC5976g;

/* renamed from: a5.c */
/* loaded from: classes.dex */
public final class C0049c implements InterfaceC0058l, C3901e0.b<C3905g0<AbstractC0055i>> {

    /* renamed from: w */
    public static final InterfaceC0058l.a f95w = new InterfaceC0058l.a() { // from class: a5.b
        @Override // p007a5.InterfaceC0058l.a
        /* renamed from: a */
        public final InterfaceC0058l mo179a(InterfaceC5976g interfaceC5976g, InterfaceC3899d0 interfaceC3899d0, InterfaceC0057k interfaceC0057k) {
            return new C0049c(interfaceC5976g, interfaceC3899d0, interfaceC0057k);
        }
    };

    /* renamed from: h */
    public final InterfaceC5976g f96h;

    /* renamed from: i */
    public final InterfaceC0057k f97i;

    /* renamed from: j */
    public final InterfaceC3899d0 f98j;

    /* renamed from: k */
    public final HashMap<Uri, c> f99k;

    /* renamed from: l */
    public final CopyOnWriteArrayList<InterfaceC0058l.b> f100l;

    /* renamed from: m */
    public final double f101m;

    /* renamed from: n */
    public InterfaceC4845a0.a f102n;

    /* renamed from: o */
    public C3901e0 f103o;

    /* renamed from: p */
    public Handler f104p;

    /* renamed from: q */
    public InterfaceC0058l.e f105q;

    /* renamed from: r */
    public C0054h f106r;

    /* renamed from: s */
    public Uri f107s;

    /* renamed from: t */
    public C0053g f108t;

    /* renamed from: u */
    public boolean f109u;

    /* renamed from: v */
    public long f110v;

    /* renamed from: a5.c$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0058l.b {
        public b() {
        }

        @Override // p007a5.InterfaceC0058l.b
        /* renamed from: a */
        public void mo224a() {
            C0049c.this.f100l.remove(this);
        }

        @Override // p007a5.InterfaceC0058l.b
        /* renamed from: e */
        public boolean mo225e(Uri uri, InterfaceC3899d0.c cVar, boolean z10) {
            c cVar2;
            if (C0049c.this.f108t == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<C0054h.b> list = ((C0054h) C4041n0.m15463j(C0049c.this.f106r)).f171e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c cVar3 = (c) C0049c.this.f99k.get(list.get(i11).f184a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f119o) {
                        i10++;
                    }
                }
                InterfaceC3899d0.b mo14777c = C0049c.this.f98j.mo14777c(new InterfaceC3899d0.a(1, 0, C0049c.this.f106r.f171e.size(), i10), cVar);
                if (mo14777c != null && mo14777c.f13989a == 2 && (cVar2 = (c) C0049c.this.f99k.get(uri)) != null) {
                    cVar2.m234h(mo14777c.f13990b);
                }
            }
            return false;
        }
    }

    /* renamed from: a5.c$c */
    /* loaded from: classes.dex */
    public final class c implements C3901e0.b<C3905g0<AbstractC0055i>> {

        /* renamed from: h */
        public final Uri f112h;

        /* renamed from: i */
        public final C3901e0 f113i = new C3901e0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: j */
        public final InterfaceC3910j f114j;

        /* renamed from: k */
        public C0053g f115k;

        /* renamed from: l */
        public long f116l;

        /* renamed from: m */
        public long f117m;

        /* renamed from: n */
        public long f118n;

        /* renamed from: o */
        public long f119o;

        /* renamed from: p */
        public boolean f120p;

        /* renamed from: q */
        public IOException f121q;

        public c(Uri uri) {
            this.f112h = uri;
            this.f114j = C0049c.this.f96h.mo23929a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m233m(Uri uri) {
            this.f120p = false;
            m239p(uri);
        }

        /* renamed from: h */
        public final boolean m234h(long j10) {
            this.f119o = SystemClock.elapsedRealtime() + j10;
            return this.f112h.equals(C0049c.this.f107s) && !C0049c.this.m202L();
        }

        /* renamed from: i */
        public final Uri m235i() {
            C0053g c0053g = this.f115k;
            if (c0053g != null) {
                C0053g.f fVar = c0053g.f145v;
                if (fVar.f164a != -9223372036854775807L || fVar.f168e) {
                    Uri.Builder buildUpon = this.f112h.buildUpon();
                    C0053g c0053g2 = this.f115k;
                    if (c0053g2.f145v.f168e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c0053g2.f134k + c0053g2.f141r.size()));
                        C0053g c0053g3 = this.f115k;
                        if (c0053g3.f137n != -9223372036854775807L) {
                            List<C0053g.b> list = c0053g3.f142s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C0053g.b) C2610b0.m10505d(list)).f147t) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C0053g.f fVar2 = this.f115k.f145v;
                    if (fVar2.f164a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f165b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f112h;
        }

        /* renamed from: j */
        public C0053g m236j() {
            return this.f115k;
        }

        /* renamed from: l */
        public boolean m237l() {
            int i10;
            if (this.f115k == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C4041n0.m15442Y0(this.f115k.f144u));
            C0053g c0053g = this.f115k;
            return c0053g.f138o || (i10 = c0053g.f127d) == 2 || i10 == 1 || this.f116l + max > elapsedRealtime;
        }

        /* renamed from: n */
        public void m238n() {
            m240q(this.f112h);
        }

        /* renamed from: p */
        public final void m239p(Uri uri) {
            C3905g0 c3905g0 = new C3905g0(this.f114j, uri, 4, C0049c.this.f97i.mo177a(C0049c.this.f106r, this.f115k));
            C0049c.this.f102n.m19238z(new C4870n(c3905g0.f14029a, c3905g0.f14030b, this.f113i.m14807n(c3905g0, this, C0049c.this.f98j.mo14778d(c3905g0.f14031c))), c3905g0.f14031c);
        }

        /* renamed from: q */
        public final void m240q(final Uri uri) {
            this.f119o = 0L;
            if (this.f120p || this.f113i.m14803j() || this.f113i.m14802i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f118n) {
                m239p(uri);
            } else {
                this.f120p = true;
                C0049c.this.f104p.postDelayed(new Runnable() { // from class: a5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0049c.c.this.m233m(uri);
                    }
                }, this.f118n - elapsedRealtime);
            }
        }

        /* renamed from: s */
        public void m241s() {
            this.f113i.mo4756a();
            IOException iOException = this.f121q;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo223r(C3905g0<AbstractC0055i> c3905g0, long j10, long j11, boolean z10) {
            C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
            C0049c.this.f98j.m14776b(c3905g0.f14029a);
            C0049c.this.f102n.m19229q(c4870n, 4);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo222o(C3905g0<AbstractC0055i> c3905g0, long j10, long j11) {
            AbstractC0055i m14827e = c3905g0.m14827e();
            C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
            if (m14827e instanceof C0053g) {
                m245w((C0053g) m14827e, c4870n);
                C0049c.this.f102n.m19232t(c4870n, 4);
            } else {
                this.f121q = C4499t2.m17596c("Loaded playlist has unexpected type.", null);
                C0049c.this.f102n.m19236x(c4870n, 4, this.f121q, true);
            }
            C0049c.this.f98j.m14776b(c3905g0.f14029a);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3901e0.c mo219k(C3905g0<AbstractC0055i> c3905g0, long j10, long j11, IOException iOException, int i10) {
            C3901e0.c cVar;
            C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
            boolean z10 = iOException instanceof C0056j.a;
            if ((c3905g0.m14828f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = C1841a.e.API_PRIORITY_OTHER;
                if (iOException instanceof C3893a0) {
                    i11 = ((C3893a0) iOException).f13968k;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f118n = SystemClock.elapsedRealtime();
                    m238n();
                    ((InterfaceC4845a0.a) C4041n0.m15463j(C0049c.this.f102n)).m19236x(c4870n, c3905g0.f14031c, iOException, true);
                    return C3901e0.f14001f;
                }
            }
            InterfaceC3899d0.c cVar2 = new InterfaceC3899d0.c(c4870n, new C4876q(c3905g0.f14031c), iOException, i10);
            if (C0049c.this.m204N(this.f112h, cVar2, false)) {
                long mo14775a = C0049c.this.f98j.mo14775a(cVar2);
                cVar = mo14775a != -9223372036854775807L ? C3901e0.m14799h(false, mo14775a) : C3901e0.f14002g;
            } else {
                cVar = C3901e0.f14001f;
            }
            boolean m14810c = true ^ cVar.m14810c();
            C0049c.this.f102n.m19236x(c4870n, c3905g0.f14031c, iOException, m14810c);
            if (m14810c) {
                C0049c.this.f98j.m14776b(c3905g0.f14029a);
            }
            return cVar;
        }

        /* renamed from: w */
        public final void m245w(C0053g c0053g, C4870n c4870n) {
            IOException dVar;
            boolean z10;
            C0053g c0053g2 = this.f115k;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f116l = elapsedRealtime;
            C0053g m197G = C0049c.this.m197G(c0053g2, c0053g);
            this.f115k = m197G;
            if (m197G != c0053g2) {
                this.f121q = null;
                this.f117m = elapsedRealtime;
                C0049c.this.m208R(this.f112h, m197G);
            } else if (!m197G.f138o) {
                long size = c0053g.f134k + c0053g.f141r.size();
                C0053g c0053g3 = this.f115k;
                if (size < c0053g3.f134k) {
                    dVar = new InterfaceC0058l.c(this.f112h);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f117m)) > ((double) C4041n0.m15442Y0(c0053g3.f136m)) * C0049c.this.f101m ? new InterfaceC0058l.d(this.f112h) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f121q = dVar;
                    C0049c.this.m204N(this.f112h, new InterfaceC3899d0.c(c4870n, new C4876q(4), dVar, 1), z10);
                }
            }
            long j10 = 0;
            C0053g c0053g4 = this.f115k;
            if (!c0053g4.f145v.f168e) {
                j10 = c0053g4.f136m;
                if (c0053g4 == c0053g2) {
                    j10 /= 2;
                }
            }
            this.f118n = elapsedRealtime + C4041n0.m15442Y0(j10);
            if (!(this.f115k.f137n != -9223372036854775807L || this.f112h.equals(C0049c.this.f107s)) || this.f115k.f138o) {
                return;
            }
            m240q(m235i());
        }

        /* renamed from: x */
        public void m246x() {
            this.f113i.m14805l();
        }
    }

    public C0049c(InterfaceC5976g interfaceC5976g, InterfaceC3899d0 interfaceC3899d0, InterfaceC0057k interfaceC0057k) {
        this(interfaceC5976g, interfaceC3899d0, interfaceC0057k, 3.5d);
    }

    public C0049c(InterfaceC5976g interfaceC5976g, InterfaceC3899d0 interfaceC3899d0, InterfaceC0057k interfaceC0057k, double d10) {
        this.f96h = interfaceC5976g;
        this.f97i = interfaceC0057k;
        this.f98j = interfaceC3899d0;
        this.f101m = d10;
        this.f100l = new CopyOnWriteArrayList<>();
        this.f99k = new HashMap<>();
        this.f110v = -9223372036854775807L;
    }

    /* renamed from: F */
    public static C0053g.d m184F(C0053g c0053g, C0053g c0053g2) {
        int i10 = (int) (c0053g2.f134k - c0053g.f134k);
        List<C0053g.d> list = c0053g.f141r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* renamed from: E */
    public final void m196E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f99k.put(uri, new c(uri));
        }
    }

    /* renamed from: G */
    public final C0053g m197G(C0053g c0053g, C0053g c0053g2) {
        return !c0053g2.m252f(c0053g) ? c0053g2.f138o ? c0053g.m250d() : c0053g : c0053g2.m249c(m199I(c0053g, c0053g2), m198H(c0053g, c0053g2));
    }

    /* renamed from: H */
    public final int m198H(C0053g c0053g, C0053g c0053g2) {
        C0053g.d m184F;
        if (c0053g2.f132i) {
            return c0053g2.f133j;
        }
        C0053g c0053g3 = this.f108t;
        int i10 = c0053g3 != null ? c0053g3.f133j : 0;
        return (c0053g == null || (m184F = m184F(c0053g, c0053g2)) == null) ? i10 : (c0053g.f133j + m184F.f156k) - c0053g2.f141r.get(0).f156k;
    }

    /* renamed from: I */
    public final long m199I(C0053g c0053g, C0053g c0053g2) {
        if (c0053g2.f139p) {
            return c0053g2.f131h;
        }
        C0053g c0053g3 = this.f108t;
        long j10 = c0053g3 != null ? c0053g3.f131h : 0L;
        if (c0053g == null) {
            return j10;
        }
        int size = c0053g.f141r.size();
        C0053g.d m184F = m184F(c0053g, c0053g2);
        return m184F != null ? c0053g.f131h + m184F.f157l : ((long) size) == c0053g2.f134k - c0053g.f134k ? c0053g.m251e() : j10;
    }

    /* renamed from: J */
    public final Uri m200J(Uri uri) {
        C0053g.c cVar;
        C0053g c0053g = this.f108t;
        if (c0053g == null || !c0053g.f145v.f168e || (cVar = c0053g.f143t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f149b));
        int i10 = cVar.f150c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    /* renamed from: K */
    public final boolean m201K(Uri uri) {
        List<C0054h.b> list = this.f106r.f171e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f184a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m202L() {
        List<C0054h.b> list = this.f106r.f171e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) C4014a.m15199e(this.f99k.get(list.get(i10).f184a));
            if (elapsedRealtime > cVar.f119o) {
                Uri uri = cVar.f112h;
                this.f107s = uri;
                cVar.m240q(m200J(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public final void m203M(Uri uri) {
        if (uri.equals(this.f107s) || !m201K(uri)) {
            return;
        }
        C0053g c0053g = this.f108t;
        if (c0053g == null || !c0053g.f138o) {
            this.f107s = uri;
            c cVar = this.f99k.get(uri);
            C0053g c0053g2 = cVar.f115k;
            if (c0053g2 == null || !c0053g2.f138o) {
                cVar.m240q(m200J(uri));
            } else {
                this.f108t = c0053g2;
                this.f105q.mo294p(c0053g2);
            }
        }
    }

    /* renamed from: N */
    public final boolean m204N(Uri uri, InterfaceC3899d0.c cVar, boolean z10) {
        Iterator<InterfaceC0058l.b> it = this.f100l.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().mo225e(uri, cVar, z10);
        }
        return z11;
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo223r(C3905g0<AbstractC0055i> c3905g0, long j10, long j11, boolean z10) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        this.f98j.m14776b(c3905g0.f14029a);
        this.f102n.m19229q(c4870n, 4);
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo222o(C3905g0<AbstractC0055i> c3905g0, long j10, long j11) {
        AbstractC0055i m14827e = c3905g0.m14827e();
        boolean z10 = m14827e instanceof C0053g;
        C0054h m258e = z10 ? C0054h.m258e(m14827e.f190a) : (C0054h) m14827e;
        this.f106r = m258e;
        this.f107s = m258e.f171e.get(0).f184a;
        this.f100l.add(new b());
        m196E(m258e.f170d);
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        c cVar = this.f99k.get(this.f107s);
        if (z10) {
            cVar.m245w((C0053g) m14827e, c4870n);
        } else {
            cVar.m238n();
        }
        this.f98j.m14776b(c3905g0.f14029a);
        this.f102n.m19232t(c4870n, 4);
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C3901e0.c mo219k(C3905g0<AbstractC0055i> c3905g0, long j10, long j11, IOException iOException, int i10) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        long mo14775a = this.f98j.mo14775a(new InterfaceC3899d0.c(c4870n, new C4876q(c3905g0.f14031c), iOException, i10));
        boolean z10 = mo14775a == -9223372036854775807L;
        this.f102n.m19236x(c4870n, c3905g0.f14031c, iOException, z10);
        if (z10) {
            this.f98j.m14776b(c3905g0.f14029a);
        }
        return z10 ? C3901e0.f14002g : C3901e0.m14799h(false, mo14775a);
    }

    /* renamed from: R */
    public final void m208R(Uri uri, C0053g c0053g) {
        if (uri.equals(this.f107s)) {
            if (this.f108t == null) {
                this.f109u = !c0053g.f138o;
                this.f110v = c0053g.f131h;
            }
            this.f108t = c0053g;
            this.f105q.mo294p(c0053g);
        }
        Iterator<InterfaceC0058l.b> it = this.f100l.iterator();
        while (it.hasNext()) {
            it.next().mo224a();
        }
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: a */
    public boolean mo209a(Uri uri) {
        return this.f99k.get(uri).m237l();
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: b */
    public void mo210b(InterfaceC0058l.b bVar) {
        C4014a.m15199e(bVar);
        this.f100l.add(bVar);
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: c */
    public void mo211c(Uri uri) {
        this.f99k.get(uri).m241s();
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: d */
    public long mo212d() {
        return this.f110v;
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: e */
    public boolean mo213e() {
        return this.f109u;
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: f */
    public C0054h mo214f() {
        return this.f106r;
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: g */
    public boolean mo215g(Uri uri, long j10) {
        if (this.f99k.get(uri) != null) {
            return !r2.m234h(j10);
        }
        return false;
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: h */
    public void mo216h(InterfaceC0058l.b bVar) {
        this.f100l.remove(bVar);
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: i */
    public void mo217i() {
        C3901e0 c3901e0 = this.f103o;
        if (c3901e0 != null) {
            c3901e0.mo4756a();
        }
        Uri uri = this.f107s;
        if (uri != null) {
            mo211c(uri);
        }
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: j */
    public void mo218j(Uri uri) {
        this.f99k.get(uri).m238n();
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: l */
    public void mo220l(Uri uri, InterfaceC4845a0.a aVar, InterfaceC0058l.e eVar) {
        this.f104p = C4041n0.m15489w();
        this.f102n = aVar;
        this.f105q = eVar;
        C3905g0 c3905g0 = new C3905g0(this.f96h.mo23929a(4), uri, 4, this.f97i.mo178b());
        C4014a.m15200f(this.f103o == null);
        C3901e0 c3901e0 = new C3901e0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f103o = c3901e0;
        aVar.m19238z(new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3901e0.m14807n(c3905g0, this, this.f98j.mo14778d(c3905g0.f14031c))), c3905g0.f14031c);
    }

    @Override // p007a5.InterfaceC0058l
    /* renamed from: m */
    public C0053g mo221m(Uri uri, boolean z10) {
        C0053g m236j = this.f99k.get(uri).m236j();
        if (m236j != null && z10) {
            m203M(uri);
        }
        return m236j;
    }

    @Override // p007a5.InterfaceC0058l
    public void stop() {
        this.f107s = null;
        this.f108t = null;
        this.f106r = null;
        this.f110v = -9223372036854775807L;
        this.f103o.m14805l();
        this.f103o = null;
        Iterator<c> it = this.f99k.values().iterator();
        while (it.hasNext()) {
            it.next().m246x();
        }
        this.f104p.removeCallbacksAndMessages(null);
        this.f104p = null;
        this.f99k.clear();
    }
}
