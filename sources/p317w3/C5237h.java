package p317w3;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p126i7.AbstractC2617d1;
import p126i7.AbstractC2651u;
import p126i7.AbstractC2657x;
import p126i7.C2660y0;
import p206o5.C3927v;
import p206o5.InterfaceC3899d0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4441i;
import p264s3.C4463m1;
import p275t3.C4674s1;
import p317w3.C5235g;
import p317w3.C5237h;
import p317w3.C5247m;
import p317w3.InterfaceC5226b0;
import p317w3.InterfaceC5248n;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;

/* renamed from: w3.h */
/* loaded from: classes.dex */
public class C5237h implements InterfaceC5256v {

    /* renamed from: c */
    public final UUID f19850c;

    /* renamed from: d */
    public final InterfaceC5226b0.c f19851d;

    /* renamed from: e */
    public final InterfaceC5240i0 f19852e;

    /* renamed from: f */
    public final HashMap<String, String> f19853f;

    /* renamed from: g */
    public final boolean f19854g;

    /* renamed from: h */
    public final int[] f19855h;

    /* renamed from: i */
    public final boolean f19856i;

    /* renamed from: j */
    public final g f19857j;

    /* renamed from: k */
    public final InterfaceC3899d0 f19858k;

    /* renamed from: l */
    public final h f19859l;

    /* renamed from: m */
    public final long f19860m;

    /* renamed from: n */
    public final List<C5235g> f19861n;

    /* renamed from: o */
    public final Set<f> f19862o;

    /* renamed from: p */
    public final Set<C5235g> f19863p;

    /* renamed from: q */
    public int f19864q;

    /* renamed from: r */
    public InterfaceC5226b0 f19865r;

    /* renamed from: s */
    public C5235g f19866s;

    /* renamed from: t */
    public C5235g f19867t;

    /* renamed from: u */
    public Looper f19868u;

    /* renamed from: v */
    public Handler f19869v;

    /* renamed from: w */
    public int f19870w;

    /* renamed from: x */
    public byte[] f19871x;

    /* renamed from: y */
    public C4674s1 f19872y;

    /* renamed from: z */
    public volatile d f19873z;

    /* renamed from: w3.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d */
        public boolean f19877d;

        /* renamed from: f */
        public boolean f19879f;

        /* renamed from: a */
        public final HashMap<String, String> f19874a = new HashMap<>();

        /* renamed from: b */
        public UUID f19875b = C4441i.f16300d;

        /* renamed from: c */
        public InterfaceC5226b0.c f19876c = C5234f0.f19809d;

        /* renamed from: g */
        public InterfaceC3899d0 f19880g = new C3927v();

        /* renamed from: e */
        public int[] f19878e = new int[0];

        /* renamed from: h */
        public long f19881h = 300000;

        /* renamed from: a */
        public C5237h m21238a(InterfaceC5240i0 interfaceC5240i0) {
            return new C5237h(this.f19875b, this.f19876c, interfaceC5240i0, this.f19874a, this.f19877d, this.f19878e, this.f19879f, this.f19880g, this.f19881h);
        }

        /* renamed from: b */
        public b m21239b(boolean z10) {
            this.f19877d = z10;
            return this;
        }

        /* renamed from: c */
        public b m21240c(boolean z10) {
            this.f19879f = z10;
            return this;
        }

        /* renamed from: d */
        public b m21241d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                C4014a.m15195a(z10);
            }
            this.f19878e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public b m21242e(UUID uuid, InterfaceC5226b0.c cVar) {
            this.f19875b = (UUID) C4014a.m15199e(uuid);
            this.f19876c = (InterfaceC5226b0.c) C4014a.m15199e(cVar);
            return this;
        }
    }

    /* renamed from: w3.h$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC5226b0.b {
        public c() {
        }

        @Override // p317w3.InterfaceC5226b0.b
        /* renamed from: a */
        public void mo21141a(InterfaceC5226b0 interfaceC5226b0, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C4014a.m15199e(C5237h.this.f19873z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.h$d */
    /* loaded from: classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C5235g c5235g : C5237h.this.f19861n) {
                if (c5235g.m21187u(bArr)) {
                    c5235g.m21175C(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: w3.h$e */
    /* loaded from: classes.dex */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: w3.h$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC5256v.b {

        /* renamed from: b */
        public final InterfaceC5255u.a f19884b;

        /* renamed from: c */
        public InterfaceC5248n f19885c;

        /* renamed from: d */
        public boolean f19886d;

        public f(InterfaceC5255u.a aVar) {
            this.f19884b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m21245f(C4463m1 c4463m1) {
            if (C5237h.this.f19864q == 0 || this.f19886d) {
                return;
            }
            C5237h c5237h = C5237h.this;
            this.f19885c = c5237h.m21233t((Looper) C4014a.m15199e(c5237h.f19868u), this.f19884b, c4463m1, false);
            C5237h.this.f19862o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m21246g() {
            if (this.f19886d) {
                return;
            }
            InterfaceC5248n interfaceC5248n = this.f19885c;
            if (interfaceC5248n != null) {
                interfaceC5248n.mo21121d(this.f19884b);
            }
            C5237h.this.f19862o.remove(this);
            this.f19886d = true;
        }

        /* renamed from: e */
        public void m21247e(final C4463m1 c4463m1) {
            ((Handler) C4014a.m15199e(C5237h.this.f19869v)).post(new Runnable() { // from class: w3.j
                @Override // java.lang.Runnable
                public final void run() {
                    C5237h.f.this.m21245f(c4463m1);
                }
            });
        }

        @Override // p317w3.InterfaceC5256v.b
        public void release() {
            C4041n0.m15414K0((Handler) C4014a.m15199e(C5237h.this.f19869v), new Runnable() { // from class: w3.i
                @Override // java.lang.Runnable
                public final void run() {
                    C5237h.f.this.m21246g();
                }
            });
        }
    }

    /* renamed from: w3.h$g */
    /* loaded from: classes.dex */
    public class g implements C5235g.a {

        /* renamed from: a */
        public final Set<C5235g> f19888a = new HashSet();

        /* renamed from: b */
        public C5235g f19889b;

        public g(C5237h c5237h) {
        }

        @Override // p317w3.C5235g.a
        /* renamed from: a */
        public void mo21191a(C5235g c5235g) {
            this.f19888a.add(c5235g);
            if (this.f19889b != null) {
                return;
            }
            this.f19889b = c5235g;
            c5235g.m21181I();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p317w3.C5235g.a
        /* renamed from: b */
        public void mo21192b(Exception exc, boolean z10) {
            this.f19889b = null;
            AbstractC2651u m10768p = AbstractC2651u.m10768p(this.f19888a);
            this.f19888a.clear();
            AbstractC2617d1 it = m10768p.iterator();
            while (it.hasNext()) {
                ((C5235g) it.next()).m21177E(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p317w3.C5235g.a
        /* renamed from: c */
        public void mo21193c() {
            this.f19889b = null;
            AbstractC2651u m10768p = AbstractC2651u.m10768p(this.f19888a);
            this.f19888a.clear();
            AbstractC2617d1 it = m10768p.iterator();
            while (it.hasNext()) {
                ((C5235g) it.next()).m21176D();
            }
        }

        /* renamed from: d */
        public void m21248d(C5235g c5235g) {
            this.f19888a.remove(c5235g);
            if (this.f19889b == c5235g) {
                this.f19889b = null;
                if (this.f19888a.isEmpty()) {
                    return;
                }
                C5235g next = this.f19888a.iterator().next();
                this.f19889b = next;
                next.m21181I();
            }
        }
    }

    /* renamed from: w3.h$h */
    /* loaded from: classes.dex */
    public class h implements C5235g.b {
        public h() {
        }

        @Override // p317w3.C5235g.b
        /* renamed from: a */
        public void mo21194a(final C5235g c5235g, int i10) {
            if (i10 == 1 && C5237h.this.f19864q > 0 && C5237h.this.f19860m != -9223372036854775807L) {
                C5237h.this.f19863p.add(c5235g);
                ((Handler) C4014a.m15199e(C5237h.this.f19869v)).postAtTime(new Runnable() { // from class: w3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5235g.this.mo21121d(null);
                    }
                }, c5235g, SystemClock.uptimeMillis() + C5237h.this.f19860m);
            } else if (i10 == 0) {
                C5237h.this.f19861n.remove(c5235g);
                if (C5237h.this.f19866s == c5235g) {
                    C5237h.this.f19866s = null;
                }
                if (C5237h.this.f19867t == c5235g) {
                    C5237h.this.f19867t = null;
                }
                C5237h.this.f19857j.m21248d(c5235g);
                if (C5237h.this.f19860m != -9223372036854775807L) {
                    ((Handler) C4014a.m15199e(C5237h.this.f19869v)).removeCallbacksAndMessages(c5235g);
                    C5237h.this.f19863p.remove(c5235g);
                }
            }
            C5237h.this.m21222C();
        }

        @Override // p317w3.C5235g.b
        /* renamed from: b */
        public void mo21195b(C5235g c5235g, int i10) {
            if (C5237h.this.f19860m != -9223372036854775807L) {
                C5237h.this.f19863p.remove(c5235g);
                ((Handler) C4014a.m15199e(C5237h.this.f19869v)).removeCallbacksAndMessages(c5235g);
            }
        }
    }

    public C5237h(UUID uuid, InterfaceC5226b0.c cVar, InterfaceC5240i0 interfaceC5240i0, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, InterfaceC3899d0 interfaceC3899d0, long j10) {
        C4014a.m15199e(uuid);
        C4014a.m15196b(!C4441i.f16298b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f19850c = uuid;
        this.f19851d = cVar;
        this.f19852e = interfaceC5240i0;
        this.f19853f = hashMap;
        this.f19854g = z10;
        this.f19855h = iArr;
        this.f19856i = z11;
        this.f19858k = interfaceC3899d0;
        this.f19857j = new g(this);
        this.f19859l = new h();
        this.f19870w = 0;
        this.f19861n = new ArrayList();
        this.f19862o = C2660y0.m10841h();
        this.f19863p = C2660y0.m10841h();
        this.f19860m = j10;
    }

    /* renamed from: u */
    public static boolean m21218u(InterfaceC5248n interfaceC5248n) {
        return interfaceC5248n.getState() == 1 && (C4041n0.f14513a < 19 || (((InterfaceC5248n.a) C4014a.m15199e(interfaceC5248n.mo21118a())).getCause() instanceof ResourceBusyException));
    }

    /* renamed from: y */
    public static List<C5247m.b> m21219y(C5247m c5247m, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c5247m.f19908k);
        for (int i10 = 0; i10 < c5247m.f19908k; i10++) {
            C5247m.b m21259f = c5247m.m21259f(i10);
            if ((m21259f.m21266e(uuid) || (C4441i.f16299c.equals(uuid) && m21259f.m21266e(C4441i.f16298b))) && (m21259f.f19913l != null || z10)) {
                arrayList.add(m21259f);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final InterfaceC5248n m21220A(int i10, boolean z10) {
        InterfaceC5226b0 interfaceC5226b0 = (InterfaceC5226b0) C4014a.m15199e(this.f19865r);
        if ((interfaceC5226b0.mo21138m() == 2 && C5228c0.f19799d) || C4041n0.m15494y0(this.f19855h, i10) == -1 || interfaceC5226b0.mo21138m() == 1) {
            return null;
        }
        C5235g c5235g = this.f19866s;
        if (c5235g == null) {
            C5235g m21236x = m21236x(AbstractC2651u.m10770u(), true, null, z10);
            this.f19861n.add(m21236x);
            this.f19866s = m21236x;
        } else {
            c5235g.mo21120c(null);
        }
        return this.f19866s;
    }

    /* renamed from: B */
    public final void m21221B(Looper looper) {
        if (this.f19873z == null) {
            this.f19873z = new d(looper);
        }
    }

    /* renamed from: C */
    public final void m21222C() {
        if (this.f19865r != null && this.f19864q == 0 && this.f19861n.isEmpty() && this.f19862o.isEmpty()) {
            ((InterfaceC5226b0) C4014a.m15199e(this.f19865r)).release();
            this.f19865r = null;
        }
    }

    /* renamed from: D */
    public final void m21223D() {
        AbstractC2617d1 it = AbstractC2657x.m10820n(this.f19863p).iterator();
        while (it.hasNext()) {
            ((InterfaceC5248n) it.next()).mo21121d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m21224E() {
        AbstractC2617d1 it = AbstractC2657x.m10820n(this.f19862o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    /* renamed from: F */
    public void m21225F(int i10, byte[] bArr) {
        C4014a.m15200f(this.f19861n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C4014a.m15199e(bArr);
        }
        this.f19870w = i10;
        this.f19871x = bArr;
    }

    /* renamed from: G */
    public final void m21226G(InterfaceC5248n interfaceC5248n, InterfaceC5255u.a aVar) {
        interfaceC5248n.mo21121d(aVar);
        if (this.f19860m != -9223372036854775807L) {
            interfaceC5248n.mo21121d(null);
        }
    }

    /* renamed from: H */
    public final void m21227H(boolean z10) {
        if (z10 && this.f19868u == null) {
            C4046r.m15530j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C4014a.m15199e(this.f19868u)).getThread()) {
            C4046r.m15530j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f19868u.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p317w3.InterfaceC5256v
    /* renamed from: a */
    public final void mo21228a() {
        m21227H(true);
        int i10 = this.f19864q;
        this.f19864q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f19865r == null) {
            InterfaceC5226b0 mo21142a = this.f19851d.mo21142a(this.f19850c);
            this.f19865r = mo21142a;
            mo21142a.mo21130e(new c());
        } else if (this.f19860m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f19861n.size(); i11++) {
                this.f19861n.get(i11).mo21120c(null);
            }
        }
    }

    @Override // p317w3.InterfaceC5256v
    /* renamed from: b */
    public InterfaceC5248n mo21229b(InterfaceC5255u.a aVar, C4463m1 c4463m1) {
        m21227H(false);
        C4014a.m15200f(this.f19864q > 0);
        C4014a.m15202h(this.f19868u);
        return m21233t(this.f19868u, aVar, c4463m1, true);
    }

    @Override // p317w3.InterfaceC5256v
    /* renamed from: c */
    public InterfaceC5256v.b mo21230c(InterfaceC5255u.a aVar, C4463m1 c4463m1) {
        C4014a.m15200f(this.f19864q > 0);
        C4014a.m15202h(this.f19868u);
        f fVar = new f(aVar);
        fVar.m21247e(c4463m1);
        return fVar;
    }

    @Override // p317w3.InterfaceC5256v
    /* renamed from: d */
    public void mo21231d(Looper looper, C4674s1 c4674s1) {
        m21237z(looper);
        this.f19872y = c4674s1;
    }

    @Override // p317w3.InterfaceC5256v
    /* renamed from: e */
    public int mo21232e(C4463m1 c4463m1) {
        m21227H(false);
        int mo21138m = ((InterfaceC5226b0) C4014a.m15199e(this.f19865r)).mo21138m();
        C5247m c5247m = c4463m1.f16509v;
        if (c5247m != null) {
            if (m21234v(c5247m)) {
                return mo21138m;
            }
            return 1;
        }
        if (C4041n0.m15494y0(this.f19855h, C4050v.m15554k(c4463m1.f16506s)) != -1) {
            return mo21138m;
        }
        return 0;
    }

    @Override // p317w3.InterfaceC5256v
    public final void release() {
        m21227H(true);
        int i10 = this.f19864q - 1;
        this.f19864q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f19860m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f19861n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C5235g) arrayList.get(i11)).mo21121d(null);
            }
        }
        m21224E();
        m21222C();
    }

    /* renamed from: t */
    public final InterfaceC5248n m21233t(Looper looper, InterfaceC5255u.a aVar, C4463m1 c4463m1, boolean z10) {
        List<C5247m.b> list;
        m21221B(looper);
        C5247m c5247m = c4463m1.f16509v;
        if (c5247m == null) {
            return m21220A(C4050v.m15554k(c4463m1.f16506s), z10);
        }
        C5235g c5235g = null;
        byte b10 = 0;
        if (this.f19871x == null) {
            list = m21219y((C5247m) C4014a.m15199e(c5247m), this.f19850c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f19850c);
                C4046r.m15524d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m21288l(eVar);
                }
                return new C5224a0(new InterfaceC5248n.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f19854g) {
            Iterator<C5235g> it = this.f19861n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5235g next = it.next();
                if (C4041n0.m15449c(next.f19813a, list)) {
                    c5235g = next;
                    break;
                }
            }
        } else {
            c5235g = this.f19867t;
        }
        if (c5235g == null) {
            c5235g = m21236x(list, false, aVar, z10);
            if (!this.f19854g) {
                this.f19867t = c5235g;
            }
            this.f19861n.add(c5235g);
        } else {
            c5235g.mo21120c(aVar);
        }
        return c5235g;
    }

    /* renamed from: v */
    public final boolean m21234v(C5247m c5247m) {
        if (this.f19871x != null) {
            return true;
        }
        if (m21219y(c5247m, this.f19850c, true).isEmpty()) {
            if (c5247m.f19908k != 1 || !c5247m.m21259f(0).m21266e(C4441i.f16298b)) {
                return false;
            }
            C4046r.m15529i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f19850c);
        }
        String str = c5247m.f19907j;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? C4041n0.f14513a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* renamed from: w */
    public final C5235g m21235w(List<C5247m.b> list, boolean z10, InterfaceC5255u.a aVar) {
        C4014a.m15199e(this.f19865r);
        C5235g c5235g = new C5235g(this.f19850c, this.f19865r, this.f19857j, this.f19859l, list, this.f19870w, this.f19856i | z10, z10, this.f19871x, this.f19853f, this.f19852e, (Looper) C4014a.m15199e(this.f19868u), this.f19858k, (C4674s1) C4014a.m15199e(this.f19872y));
        c5235g.mo21120c(aVar);
        if (this.f19860m != -9223372036854775807L) {
            c5235g.mo21120c(null);
        }
        return c5235g;
    }

    /* renamed from: x */
    public final C5235g m21236x(List<C5247m.b> list, boolean z10, InterfaceC5255u.a aVar, boolean z11) {
        C5235g m21235w = m21235w(list, z10, aVar);
        if (m21218u(m21235w) && !this.f19863p.isEmpty()) {
            m21223D();
            m21226G(m21235w, aVar);
            m21235w = m21235w(list, z10, aVar);
        }
        if (!m21218u(m21235w) || !z11 || this.f19862o.isEmpty()) {
            return m21235w;
        }
        m21224E();
        if (!this.f19863p.isEmpty()) {
            m21223D();
        }
        m21226G(m21235w, aVar);
        return m21235w(list, z10, aVar);
    }

    /* renamed from: z */
    public final synchronized void m21237z(Looper looper) {
        Looper looper2 = this.f19868u;
        if (looper2 == null) {
            this.f19868u = looper;
            this.f19869v = new Handler(looper);
        } else {
            C4014a.m15200f(looper2 == looper);
            C4014a.m15199e(this.f19869v);
        }
    }
}
