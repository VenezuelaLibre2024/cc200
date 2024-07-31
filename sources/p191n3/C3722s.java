package p191n3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p045d3.C1531c;
import p093g3.AbstractC1971i;
import p093g3.AbstractC1978p;
import p093g3.C1970h;
import p105h3.AbstractC2291f;
import p105h3.AbstractC2292g;
import p105h3.InterfaceC2290e;
import p105h3.InterfaceC2298m;
import p136j3.C3216a;
import p136j3.C3218c;
import p151k3.C3347a;
import p204o3.AbstractC3862k;
import p204o3.InterfaceC3846c;
import p204o3.InterfaceC3848d;
import p220p3.C3998a;
import p220p3.InterfaceC3999b;
import p234q3.InterfaceC4157a;

/* renamed from: n3.s */
/* loaded from: classes.dex */
public class C3722s {

    /* renamed from: a */
    public final Context f13251a;

    /* renamed from: b */
    public final InterfaceC2290e f13252b;

    /* renamed from: c */
    public final InterfaceC3848d f13253c;

    /* renamed from: d */
    public final InterfaceC3728y f13254d;

    /* renamed from: e */
    public final Executor f13255e;

    /* renamed from: f */
    public final InterfaceC3999b f13256f;

    /* renamed from: g */
    public final InterfaceC4157a f13257g;

    /* renamed from: h */
    public final InterfaceC4157a f13258h;

    /* renamed from: i */
    public final InterfaceC3846c f13259i;

    public C3722s(Context context, InterfaceC2290e interfaceC2290e, InterfaceC3848d interfaceC3848d, InterfaceC3728y interfaceC3728y, Executor executor, InterfaceC3999b interfaceC3999b, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, InterfaceC3846c interfaceC3846c) {
        this.f13251a = context;
        this.f13252b = interfaceC2290e;
        this.f13253c = interfaceC3848d;
        this.f13254d = interfaceC3728y;
        this.f13255e = executor;
        this.f13256f = interfaceC3999b;
        this.f13257g = interfaceC4157a;
        this.f13258h = interfaceC4157a2;
        this.f13259i = interfaceC3846c;
    }

    /* renamed from: l */
    public /* synthetic */ Boolean m14018l(AbstractC1978p abstractC1978p) {
        return Boolean.valueOf(this.f13253c.mo14640v(abstractC1978p));
    }

    /* renamed from: m */
    public /* synthetic */ Iterable m14019m(AbstractC1978p abstractC1978p) {
        return this.f13253c.mo14635R(abstractC1978p);
    }

    /* renamed from: n */
    public /* synthetic */ Object m14020n(Iterable iterable, AbstractC1978p abstractC1978p, long j10) {
        this.f13253c.mo14632A0(iterable);
        this.f13253c.mo14636X(abstractC1978p, this.f13257g.mo16002a() + j10);
        return null;
    }

    /* renamed from: o */
    public /* synthetic */ Object m14021o(Iterable iterable) {
        this.f13253c.mo14639i(iterable);
        return null;
    }

    /* renamed from: p */
    public /* synthetic */ Object m14022p() {
        this.f13259i.mo14628d();
        return null;
    }

    /* renamed from: q */
    public /* synthetic */ Object m14023q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f13259i.mo14630j(((Integer) r0.getValue()).intValue(), C3218c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* renamed from: r */
    public /* synthetic */ Object m14024r(AbstractC1978p abstractC1978p, long j10) {
        this.f13253c.mo14636X(abstractC1978p, this.f13257g.mo16002a() + j10);
        return null;
    }

    /* renamed from: s */
    public /* synthetic */ Object m14025s(AbstractC1978p abstractC1978p, int i10) {
        this.f13254d.mo13983a(abstractC1978p, i10 + 1);
        return null;
    }

    /* renamed from: t */
    public /* synthetic */ void m14026t(AbstractC1978p abstractC1978p, int i10, Runnable runnable) {
        try {
            try {
                InterfaceC3999b interfaceC3999b = this.f13256f;
                InterfaceC3848d interfaceC3848d = this.f13253c;
                Objects.requireNonNull(interfaceC3848d);
                interfaceC3999b.mo14729a(new InterfaceC3999b.a() { // from class: n3.i
                    public /* synthetic */ C3712i() {
                    }

                    @Override // p220p3.InterfaceC3999b.a
                    /* renamed from: d */
                    public final Object mo13061d() {
                        return Integer.valueOf(InterfaceC3848d.this.mo14638h());
                    }
                });
                if (m14028k()) {
                    m14029u(abstractC1978p, i10);
                } else {
                    this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.m

                        /* renamed from: b */
                        public final /* synthetic */ AbstractC1978p f13237b;

                        /* renamed from: c */
                        public final /* synthetic */ int f13238c;

                        public /* synthetic */ C3716m(AbstractC1978p abstractC1978p2, int i102) {
                            r2 = abstractC1978p2;
                            r3 = i102;
                        }

                        @Override // p220p3.InterfaceC3999b.a
                        /* renamed from: d */
                        public final Object mo13061d() {
                            Object m14025s;
                            m14025s = C3722s.this.m14025s(r2, r3);
                            return m14025s;
                        }
                    });
                }
            } catch (C3998a unused) {
                this.f13254d.mo13983a(abstractC1978p2, i102 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC1971i m14027j(InterfaceC2298m interfaceC2298m) {
        InterfaceC3999b interfaceC3999b = this.f13256f;
        InterfaceC3846c interfaceC3846c = this.f13259i;
        Objects.requireNonNull(interfaceC3846c);
        return interfaceC2298m.mo6545b(AbstractC1971i.m7980a().mo7950i(this.f13257g.mo16002a()).mo7952k(this.f13258h.mo16002a()).mo7951j("GDT_CLIENT_METRICS").mo7949h(new C1970h(C1531c.m6232b("proto"), ((C3216a) interfaceC3999b.mo14729a(new InterfaceC3999b.a() { // from class: n3.r
            public /* synthetic */ C3721r() {
            }

            @Override // p220p3.InterfaceC3999b.a
            /* renamed from: d */
            public final Object mo13061d() {
                return InterfaceC3846c.this.mo14629f();
            }
        })).m11451f())).mo7945d());
    }

    /* renamed from: k */
    public boolean m14028k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f13251a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public AbstractC2292g m14029u(AbstractC1978p abstractC1978p, int i10) {
        AbstractC2292g mo6544a;
        InterfaceC2298m interfaceC2298m = this.f13252b.get(abstractC1978p.mo7964b());
        long j10 = 0;
        AbstractC2292g m9308e = AbstractC2292g.m9308e(0L);
        while (true) {
            long j11 = j10;
            while (((Boolean) this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.k

                /* renamed from: b */
                public final /* synthetic */ AbstractC1978p f13233b;

                public /* synthetic */ C3714k(AbstractC1978p abstractC1978p2) {
                    r2 = abstractC1978p2;
                }

                @Override // p220p3.InterfaceC3999b.a
                /* renamed from: d */
                public final Object mo13061d() {
                    Boolean m14018l;
                    m14018l = C3722s.this.m14018l(r2);
                    return m14018l;
                }
            })).booleanValue()) {
                Iterable iterable = (Iterable) this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.l

                    /* renamed from: b */
                    public final /* synthetic */ AbstractC1978p f13235b;

                    public /* synthetic */ C3715l(AbstractC1978p abstractC1978p2) {
                        r2 = abstractC1978p2;
                    }

                    @Override // p220p3.InterfaceC3999b.a
                    /* renamed from: d */
                    public final Object mo13061d() {
                        Iterable m14019m;
                        m14019m = C3722s.this.m14019m(r2);
                        return m14019m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m9308e;
                }
                if (interfaceC2298m == null) {
                    C3347a.m12404b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC1978p2);
                    mo6544a = AbstractC2292g.m9306a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC3862k) it.next()).mo14625b());
                    }
                    if (abstractC1978p2.m8000e()) {
                        arrayList.add(m14027j(interfaceC2298m));
                    }
                    mo6544a = interfaceC2298m.mo6544a(AbstractC2291f.m9305a().mo9297b(arrayList).mo9298c(abstractC1978p2.mo7965c()).mo9296a());
                }
                m9308e = mo6544a;
                if (m9308e.mo9300c() == AbstractC2292g.a.TRANSIENT_ERROR) {
                    this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.p

                        /* renamed from: b */
                        public final /* synthetic */ Iterable f13245b;

                        /* renamed from: c */
                        public final /* synthetic */ AbstractC1978p f13246c;

                        /* renamed from: d */
                        public final /* synthetic */ long f13247d;

                        public /* synthetic */ C3719p(Iterable iterable2, AbstractC1978p abstractC1978p2, long j112) {
                            r2 = iterable2;
                            r3 = abstractC1978p2;
                            r4 = j112;
                        }

                        @Override // p220p3.InterfaceC3999b.a
                        /* renamed from: d */
                        public final Object mo13061d() {
                            Object m14020n;
                            m14020n = C3722s.this.m14020n(r2, r3, r4);
                            return m14020n;
                        }
                    });
                    this.f13254d.mo13984b(abstractC1978p2, i10 + 1, true);
                    return m9308e;
                }
                this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.o

                    /* renamed from: b */
                    public final /* synthetic */ Iterable f13243b;

                    public /* synthetic */ C3718o(Iterable iterable2) {
                        r2 = iterable2;
                    }

                    @Override // p220p3.InterfaceC3999b.a
                    /* renamed from: d */
                    public final Object mo13061d() {
                        Object m14021o;
                        m14021o = C3722s.this.m14021o(r2);
                        return m14021o;
                    }
                });
                if (m9308e.mo9300c() == AbstractC2292g.a.OK) {
                    j10 = Math.max(j112, m9308e.mo9299b());
                    if (abstractC1978p2.m8000e()) {
                        this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.j
                            public /* synthetic */ C3713j() {
                            }

                            @Override // p220p3.InterfaceC3999b.a
                            /* renamed from: d */
                            public final Object mo13061d() {
                                Object m14022p;
                                m14022p = C3722s.this.m14022p();
                                return m14022p;
                            }
                        });
                    }
                } else if (m9308e.mo9300c() == AbstractC2292g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        String mo7943j = ((AbstractC3862k) it2.next()).mo14625b().mo7943j();
                        hashMap.put(mo7943j, !hashMap.containsKey(mo7943j) ? 1 : Integer.valueOf(((Integer) hashMap.get(mo7943j)).intValue() + 1));
                    }
                    this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.q

                        /* renamed from: b */
                        public final /* synthetic */ Map f13249b;

                        public /* synthetic */ C3720q(Map hashMap2) {
                            r2 = hashMap2;
                        }

                        @Override // p220p3.InterfaceC3999b.a
                        /* renamed from: d */
                        public final Object mo13061d() {
                            Object m14023q;
                            m14023q = C3722s.this.m14023q(r2);
                            return m14023q;
                        }
                    });
                }
            }
            this.f13256f.mo14729a(new InterfaceC3999b.a() { // from class: n3.n

                /* renamed from: b */
                public final /* synthetic */ AbstractC1978p f13240b;

                /* renamed from: c */
                public final /* synthetic */ long f13241c;

                public /* synthetic */ C3717n(AbstractC1978p abstractC1978p2, long j112) {
                    r2 = abstractC1978p2;
                    r3 = j112;
                }

                @Override // p220p3.InterfaceC3999b.a
                /* renamed from: d */
                public final Object mo13061d() {
                    Object m14024r;
                    m14024r = C3722s.this.m14024r(r2, r3);
                    return m14024r;
                }
            });
            return m9308e;
        }
    }

    /* renamed from: v */
    public void m14030v(AbstractC1978p abstractC1978p, int i10, Runnable runnable) {
        this.f13255e.execute(new Runnable() { // from class: n3.h

            /* renamed from: i */
            public final /* synthetic */ AbstractC1978p f13227i;

            /* renamed from: j */
            public final /* synthetic */ int f13228j;

            /* renamed from: k */
            public final /* synthetic */ Runnable f13229k;

            public /* synthetic */ RunnableC3711h(AbstractC1978p abstractC1978p2, int i102, Runnable runnable2) {
                r2 = abstractC1978p2;
                r3 = i102;
                r4 = runnable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3722s.this.m14026t(r2, r3, r4);
            }
        });
    }
}
