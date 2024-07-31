package p344xe;

import bf.C0557c;
import bf.C0560f;
import bf.InterfaceC0558d;
import bf.InterfaceC0559e;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079f6.C1841a;
import p344xe.C5775h;
import se.AbstractRunnableC4593b;
import se.C4596e;
import ye.C5926f;

/* renamed from: xe.f */
/* loaded from: classes2.dex */
public final class C5773f implements Closeable {

    /* renamed from: G */
    public static final ExecutorService f21399G = new ThreadPoolExecutor(0, C1841a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4596e.m18088H("OkHttp Http2Connection", true));

    /* renamed from: B */
    public final C5780m f21401B;

    /* renamed from: C */
    public final Socket f21402C;

    /* renamed from: D */
    public final C5777j f21403D;

    /* renamed from: E */
    public final l f21404E;

    /* renamed from: F */
    public final Set<Integer> f21405F;

    /* renamed from: h */
    public final boolean f21406h;

    /* renamed from: i */
    public final j f21407i;

    /* renamed from: k */
    public final String f21409k;

    /* renamed from: l */
    public int f21410l;

    /* renamed from: m */
    public int f21411m;

    /* renamed from: n */
    public boolean f21412n;

    /* renamed from: o */
    public final ScheduledExecutorService f21413o;

    /* renamed from: p */
    public final ExecutorService f21414p;

    /* renamed from: q */
    public final InterfaceC5779l f21415q;

    /* renamed from: z */
    public long f21424z;

    /* renamed from: j */
    public final Map<Integer, C5776i> f21408j = new LinkedHashMap();

    /* renamed from: r */
    public long f21416r = 0;

    /* renamed from: s */
    public long f21417s = 0;

    /* renamed from: t */
    public long f21418t = 0;

    /* renamed from: u */
    public long f21419u = 0;

    /* renamed from: v */
    public long f21420v = 0;

    /* renamed from: w */
    public long f21421w = 0;

    /* renamed from: x */
    public long f21422x = 0;

    /* renamed from: y */
    public long f21423y = 0;

    /* renamed from: A */
    public C5780m f21400A = new C5780m();

    /* renamed from: xe.f$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21425i;

        /* renamed from: j */
        public final /* synthetic */ EnumC5769b f21426j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, EnumC5769b enumC5769b) {
            super(str, objArr);
            this.f21425i = i10;
            this.f21426j = enumC5769b;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            try {
                C5773f.this.m22959K0(this.f21425i, this.f21426j);
            } catch (IOException e10) {
                C5773f.this.m22963W(e10);
            }
        }
    }

    /* renamed from: xe.f$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21428i;

        /* renamed from: j */
        public final /* synthetic */ long f21429j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f21428i = i10;
            this.f21429j = j10;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            try {
                C5773f.this.f21403D.m23041W(this.f21428i, this.f21429j);
            } catch (IOException e10) {
                C5773f.this.m22963W(e10);
            }
        }
    }

    /* renamed from: xe.f$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractRunnableC4593b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            C5773f.this.m22958J0(false, 2, 0);
        }
    }

    /* renamed from: xe.f$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21432i;

        /* renamed from: j */
        public final /* synthetic */ List f21433j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f21432i = i10;
            this.f21433j = list;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            if (C5773f.this.f21415q.mo23058b(this.f21432i, this.f21433j)) {
                try {
                    C5773f.this.f21403D.m23039K(this.f21432i, EnumC5769b.CANCEL);
                    synchronized (C5773f.this) {
                        C5773f.this.f21405F.remove(Integer.valueOf(this.f21432i));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: xe.f$e */
    /* loaded from: classes2.dex */
    public class e extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21435i;

        /* renamed from: j */
        public final /* synthetic */ List f21436j;

        /* renamed from: k */
        public final /* synthetic */ boolean f21437k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f21435i = i10;
            this.f21436j = list;
            this.f21437k = z10;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            boolean mo23059c = C5773f.this.f21415q.mo23059c(this.f21435i, this.f21436j, this.f21437k);
            if (mo23059c) {
                try {
                    C5773f.this.f21403D.m23039K(this.f21435i, EnumC5769b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (mo23059c || this.f21437k) {
                synchronized (C5773f.this) {
                    C5773f.this.f21405F.remove(Integer.valueOf(this.f21435i));
                }
            }
        }
    }

    /* renamed from: xe.f$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21439i;

        /* renamed from: j */
        public final /* synthetic */ C0557c f21440j;

        /* renamed from: k */
        public final /* synthetic */ int f21441k;

        /* renamed from: l */
        public final /* synthetic */ boolean f21442l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, C0557c c0557c, int i11, boolean z10) {
            super(str, objArr);
            this.f21439i = i10;
            this.f21440j = c0557c;
            this.f21441k = i11;
            this.f21442l = z10;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            try {
                boolean mo23060d = C5773f.this.f21415q.mo23060d(this.f21439i, this.f21440j, this.f21441k, this.f21442l);
                if (mo23060d) {
                    C5773f.this.f21403D.m23039K(this.f21439i, EnumC5769b.CANCEL);
                }
                if (mo23060d || this.f21442l) {
                    synchronized (C5773f.this) {
                        C5773f.this.f21405F.remove(Integer.valueOf(this.f21439i));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: xe.f$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final /* synthetic */ int f21444i;

        /* renamed from: j */
        public final /* synthetic */ EnumC5769b f21445j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i10, EnumC5769b enumC5769b) {
            super(str, objArr);
            this.f21444i = i10;
            this.f21445j = enumC5769b;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            C5773f.this.f21415q.mo23057a(this.f21444i, this.f21445j);
            synchronized (C5773f.this) {
                C5773f.this.f21405F.remove(Integer.valueOf(this.f21444i));
            }
        }
    }

    /* renamed from: xe.f$h */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a */
        public Socket f21447a;

        /* renamed from: b */
        public String f21448b;

        /* renamed from: c */
        public InterfaceC0559e f21449c;

        /* renamed from: d */
        public InterfaceC0558d f21450d;

        /* renamed from: e */
        public j f21451e = j.f21456a;

        /* renamed from: f */
        public InterfaceC5779l f21452f = InterfaceC5779l.f21527a;

        /* renamed from: g */
        public boolean f21453g;

        /* renamed from: h */
        public int f21454h;

        public h(boolean z10) {
            this.f21453g = z10;
        }

        /* renamed from: a */
        public C5773f m22980a() {
            return new C5773f(this);
        }

        /* renamed from: b */
        public h m22981b(j jVar) {
            this.f21451e = jVar;
            return this;
        }

        /* renamed from: c */
        public h m22982c(int i10) {
            this.f21454h = i10;
            return this;
        }

        /* renamed from: d */
        public h m22983d(Socket socket, String str, InterfaceC0559e interfaceC0559e, InterfaceC0558d interfaceC0558d) {
            this.f21447a = socket;
            this.f21448b = str;
            this.f21449c = interfaceC0559e;
            this.f21450d = interfaceC0558d;
            return this;
        }
    }

    /* renamed from: xe.f$i */
    /* loaded from: classes2.dex */
    public final class i extends AbstractRunnableC4593b {
        public i() {
            super("OkHttp %s ping", C5773f.this.f21409k);
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            boolean z10;
            synchronized (C5773f.this) {
                if (C5773f.this.f21417s < C5773f.this.f21416r) {
                    z10 = true;
                } else {
                    C5773f.m22951l(C5773f.this);
                    z10 = false;
                }
            }
            C5773f c5773f = C5773f.this;
            if (z10) {
                c5773f.m22963W(null);
            } else {
                c5773f.m22958J0(false, 1, 0);
            }
        }
    }

    /* renamed from: xe.f$j */
    /* loaded from: classes2.dex */
    public static abstract class j {

        /* renamed from: a */
        public static final j f21456a = new a();

        /* renamed from: xe.f$j$a */
        /* loaded from: classes2.dex */
        public class a extends j {
            @Override // p344xe.C5773f.j
            /* renamed from: b */
            public void mo19678b(C5776i c5776i) {
                c5776i.m23016d(EnumC5769b.REFUSED_STREAM, null);
            }
        }

        /* renamed from: a */
        public void mo19677a(C5773f c5773f) {
        }

        /* renamed from: b */
        public abstract void mo19678b(C5776i c5776i);
    }

    /* renamed from: xe.f$k */
    /* loaded from: classes2.dex */
    public final class k extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final boolean f21457i;

        /* renamed from: j */
        public final int f21458j;

        /* renamed from: k */
        public final int f21459k;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", C5773f.this.f21409k, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f21457i = z10;
            this.f21458j = i10;
            this.f21459k = i11;
        }

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            C5773f.this.m22958J0(this.f21457i, this.f21458j, this.f21459k);
        }
    }

    /* renamed from: xe.f$l */
    /* loaded from: classes2.dex */
    public class l extends AbstractRunnableC4593b implements C5775h.b {

        /* renamed from: i */
        public final C5775h f21461i;

        /* renamed from: xe.f$l$a */
        /* loaded from: classes2.dex */
        public class a extends AbstractRunnableC4593b {

            /* renamed from: i */
            public final /* synthetic */ C5776i f21463i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, C5776i c5776i) {
                super(str, objArr);
                this.f21463i = c5776i;
            }

            @Override // se.AbstractRunnableC4593b
            /* renamed from: k */
            public void mo16654k() {
                try {
                    C5773f.this.f21407i.mo19678b(this.f21463i);
                } catch (IOException e10) {
                    C5926f.m23671l().mo23653s(4, "Http2Connection.Listener failure for " + C5773f.this.f21409k, e10);
                    try {
                        this.f21463i.m23016d(EnumC5769b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: xe.f$l$b */
        /* loaded from: classes2.dex */
        public class b extends AbstractRunnableC4593b {

            /* renamed from: i */
            public final /* synthetic */ boolean f21465i;

            /* renamed from: j */
            public final /* synthetic */ C5780m f21466j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, C5780m c5780m) {
                super(str, objArr);
                this.f21465i = z10;
                this.f21466j = c5780m;
            }

            @Override // se.AbstractRunnableC4593b
            /* renamed from: k */
            public void mo16654k() {
                l.this.m22994l(this.f21465i, this.f21466j);
            }
        }

        /* renamed from: xe.f$l$c */
        /* loaded from: classes2.dex */
        public class c extends AbstractRunnableC4593b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // se.AbstractRunnableC4593b
            /* renamed from: k */
            public void mo16654k() {
                C5773f c5773f = C5773f.this;
                c5773f.f21407i.mo19677a(c5773f);
            }
        }

        public l(C5775h c5775h) {
            super("OkHttp %s", C5773f.this.f21409k);
            this.f21461i = c5775h;
        }

        @Override // p344xe.C5775h.b
        /* renamed from: a */
        public void mo22984a() {
        }

        @Override // p344xe.C5775h.b
        /* renamed from: b */
        public void mo22985b(boolean z10, int i10, int i11, List<C5770c> list) {
            if (C5773f.this.m22974s0(i10)) {
                C5773f.this.m22971l0(i10, list, z10);
                return;
            }
            synchronized (C5773f.this) {
                C5776i m22964b0 = C5773f.this.m22964b0(i10);
                if (m22964b0 != null) {
                    m22964b0.m23026n(C4596e.m18090J(list), z10);
                    return;
                }
                if (C5773f.this.f21412n) {
                    return;
                }
                C5773f c5773f = C5773f.this;
                if (i10 <= c5773f.f21410l) {
                    return;
                }
                if (i10 % 2 == c5773f.f21411m % 2) {
                    return;
                }
                C5776i c5776i = new C5776i(i10, C5773f.this, false, z10, C4596e.m18090J(list));
                C5773f c5773f2 = C5773f.this;
                c5773f2.f21410l = i10;
                c5773f2.f21408j.put(Integer.valueOf(i10), c5776i);
                C5773f.f21399G.execute(new a("OkHttp %s stream %d", new Object[]{C5773f.this.f21409k, Integer.valueOf(i10)}, c5776i));
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: c */
        public void mo22986c(int i10, EnumC5769b enumC5769b, C0560f c0560f) {
            C5776i[] c5776iArr;
            c0560f.mo2871u();
            synchronized (C5773f.this) {
                c5776iArr = (C5776i[]) C5773f.this.f21408j.values().toArray(new C5776i[C5773f.this.f21408j.size()]);
                C5773f.this.f21412n = true;
            }
            for (C5776i c5776i : c5776iArr) {
                if (c5776i.m23019g() > i10 && c5776i.m23022j()) {
                    c5776i.m23027o(EnumC5769b.REFUSED_STREAM);
                    C5773f.this.m22975u0(c5776i.m23019g());
                }
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: d */
        public void mo22987d(int i10, long j10) {
            C5773f c5773f = C5773f.this;
            if (i10 == 0) {
                synchronized (c5773f) {
                    C5773f c5773f2 = C5773f.this;
                    c5773f2.f21424z += j10;
                    c5773f2.notifyAll();
                }
                return;
            }
            C5776i m22964b0 = c5773f.m22964b0(i10);
            if (m22964b0 != null) {
                synchronized (m22964b0) {
                    m22964b0.m23013a(j10);
                }
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: e */
        public void mo22988e(int i10, EnumC5769b enumC5769b) {
            if (C5773f.this.m22974s0(i10)) {
                C5773f.this.m22973r0(i10, enumC5769b);
                return;
            }
            C5776i m22975u0 = C5773f.this.m22975u0(i10);
            if (m22975u0 != null) {
                m22975u0.m23027o(enumC5769b);
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: f */
        public void mo22989f(boolean z10, int i10, InterfaceC0559e interfaceC0559e, int i11) {
            if (C5773f.this.m22974s0(i10)) {
                C5773f.this.m22969h0(i10, interfaceC0559e, i11, z10);
                return;
            }
            C5776i m22964b0 = C5773f.this.m22964b0(i10);
            if (m22964b0 == null) {
                C5773f.this.m22960L0(i10, EnumC5769b.PROTOCOL_ERROR);
                long j10 = i11;
                C5773f.this.m22955G0(j10);
                interfaceC0559e.mo2827e(j10);
                return;
            }
            m22964b0.m23025m(interfaceC0559e, i11);
            if (z10) {
                m22964b0.m23026n(C4596e.f17232c, true);
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: g */
        public void mo22990g(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    C5773f.this.f21413o.execute(new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (C5773f.this) {
                try {
                    if (i10 == 1) {
                        C5773f.m22949f(C5773f.this);
                    } else if (i10 == 2) {
                        C5773f.m22945I(C5773f.this);
                    } else if (i10 == 3) {
                        C5773f.m22946K(C5773f.this);
                        C5773f.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: h */
        public void mo22991h(int i10, int i11, int i12, boolean z10) {
        }

        @Override // p344xe.C5775h.b
        /* renamed from: i */
        public void mo22992i(boolean z10, C5780m c5780m) {
            try {
                C5773f.this.f21413o.execute(new b("OkHttp %s ACK Settings", new Object[]{C5773f.this.f21409k}, z10, c5780m));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p344xe.C5775h.b
        /* renamed from: j */
        public void mo22993j(int i10, int i11, List<C5770c> list) {
            C5773f.this.m22972n0(i11, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [xe.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, xe.h] */
        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            EnumC5769b enumC5769b;
            EnumC5769b enumC5769b2;
            EnumC5769b enumC5769b3 = EnumC5769b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f21461i.m23007f(this);
                    do {
                    } while (this.f21461i.m23006d(false, this));
                    enumC5769b2 = EnumC5769b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    enumC5769b = enumC5769b3;
                    C5773f.this.m22962P(enumC5769b, enumC5769b3, e10);
                    C4596e.m18098f(this.f21461i);
                    throw th;
                }
                try {
                    C5773f.this.m22962P(enumC5769b2, EnumC5769b.CANCEL, null);
                    enumC5769b = enumC5769b2;
                } catch (IOException e12) {
                    e10 = e12;
                    EnumC5769b enumC5769b4 = EnumC5769b.PROTOCOL_ERROR;
                    C5773f c5773f = C5773f.this;
                    c5773f.m22962P(enumC5769b4, enumC5769b4, e10);
                    enumC5769b = c5773f;
                    enumC5769b3 = this.f21461i;
                    C4596e.m18098f(enumC5769b3);
                }
                enumC5769b3 = this.f21461i;
                C4596e.m18098f(enumC5769b3);
            } catch (Throwable th2) {
                th = th2;
                C5773f.this.m22962P(enumC5769b, enumC5769b3, e10);
                C4596e.m18098f(this.f21461i);
                throw th;
            }
        }

        /* renamed from: l */
        public void m22994l(boolean z10, C5780m c5780m) {
            C5776i[] c5776iArr;
            long j10;
            synchronized (C5773f.this.f21403D) {
                synchronized (C5773f.this) {
                    int m23064d = C5773f.this.f21401B.m23064d();
                    if (z10) {
                        C5773f.this.f21401B.m23061a();
                    }
                    C5773f.this.f21401B.m23068h(c5780m);
                    int m23064d2 = C5773f.this.f21401B.m23064d();
                    c5776iArr = null;
                    if (m23064d2 == -1 || m23064d2 == m23064d) {
                        j10 = 0;
                    } else {
                        j10 = m23064d2 - m23064d;
                        if (!C5773f.this.f21408j.isEmpty()) {
                            c5776iArr = (C5776i[]) C5773f.this.f21408j.values().toArray(new C5776i[C5773f.this.f21408j.size()]);
                        }
                    }
                }
                try {
                    C5773f c5773f = C5773f.this;
                    c5773f.f21403D.m23042a(c5773f.f21401B);
                } catch (IOException e10) {
                    C5773f.this.m22963W(e10);
                }
            }
            if (c5776iArr != null) {
                for (C5776i c5776i : c5776iArr) {
                    synchronized (c5776i) {
                        c5776i.m23013a(j10);
                    }
                }
            }
            C5773f.f21399G.execute(new c("OkHttp %s settings", C5773f.this.f21409k));
        }
    }

    public C5773f(h hVar) {
        C5780m c5780m = new C5780m();
        this.f21401B = c5780m;
        this.f21405F = new LinkedHashSet();
        this.f21415q = hVar.f21452f;
        boolean z10 = hVar.f21453g;
        this.f21406h = z10;
        this.f21407i = hVar.f21451e;
        int i10 = z10 ? 1 : 2;
        this.f21411m = i10;
        if (z10) {
            this.f21411m = i10 + 2;
        }
        if (z10) {
            this.f21400A.m23069i(7, 16777216);
        }
        String str = hVar.f21448b;
        this.f21409k = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C4596e.m18088H(C4596e.m18108p("OkHttp %s Writer", str), false));
        this.f21413o = scheduledThreadPoolExecutor;
        if (hVar.f21454h != 0) {
            i iVar = new i();
            int i11 = hVar.f21454h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i11, i11, TimeUnit.MILLISECONDS);
        }
        this.f21414p = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4596e.m18088H(C4596e.m18108p("OkHttp %s Push Observer", str), true));
        c5780m.m23069i(7, 65535);
        c5780m.m23069i(5, 16384);
        this.f21424z = c5780m.m23064d();
        this.f21402C = hVar.f21447a;
        this.f21403D = new C5777j(hVar.f21450d, z10);
        this.f21404E = new l(new C5775h(hVar.f21449c, z10));
    }

    /* renamed from: I */
    public static /* synthetic */ long m22945I(C5773f c5773f) {
        long j10 = c5773f.f21419u;
        c5773f.f21419u = 1 + j10;
        return j10;
    }

    /* renamed from: K */
    public static /* synthetic */ long m22946K(C5773f c5773f) {
        long j10 = c5773f.f21421w;
        c5773f.f21421w = 1 + j10;
        return j10;
    }

    /* renamed from: f */
    public static /* synthetic */ long m22949f(C5773f c5773f) {
        long j10 = c5773f.f21417s;
        c5773f.f21417s = 1 + j10;
        return j10;
    }

    /* renamed from: l */
    public static /* synthetic */ long m22951l(C5773f c5773f) {
        long j10 = c5773f.f21416r;
        c5773f.f21416r = 1 + j10;
        return j10;
    }

    /* renamed from: G0 */
    public synchronized void m22955G0(long j10) {
        long j11 = this.f21423y + j10;
        this.f21423y = j11;
        if (j11 >= this.f21400A.m23064d() / 2) {
            m22961M0(0, this.f21423y);
            this.f21423y = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f21403D.m23050x());
        r6 = r2;
        r8.f21424z -= r6;
     */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m22956H0(int r9, boolean r10, bf.C0557c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            xe.j r12 = r8.f21403D
            r12.m23045f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f21424z     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, xe.i> r2 = r8.f21408j     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L56
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L56
            xe.j r4 = r8.f21403D     // Catch: java.lang.Throwable -> L56
            int r4 = r4.m23050x()     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f21424z     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f21424z = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            xe.j r4 = r8.f21403D
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.m23045f(r5, r9, r11, r2)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p344xe.C5773f.m22956H0(int, boolean, bf.c, long):void");
    }

    /* renamed from: I0 */
    public void m22957I0(int i10, boolean z10, List<C5770c> list) {
        this.f21403D.m23049w(z10, i10, list);
    }

    /* renamed from: J0 */
    public void m22958J0(boolean z10, int i10, int i11) {
        try {
            this.f21403D.m23037E(z10, i10, i11);
        } catch (IOException e10) {
            m22963W(e10);
        }
    }

    /* renamed from: K0 */
    public void m22959K0(int i10, EnumC5769b enumC5769b) {
        this.f21403D.m23039K(i10, enumC5769b);
    }

    /* renamed from: L0 */
    public void m22960L0(int i10, EnumC5769b enumC5769b) {
        try {
            this.f21413o.execute(new a("OkHttp %s stream %d", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, enumC5769b));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: M0 */
    public void m22961M0(int i10, long j10) {
        try {
            this.f21413o.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: P */
    public void m22962P(EnumC5769b enumC5769b, EnumC5769b enumC5769b2, IOException iOException) {
        try {
            m22977x0(enumC5769b);
        } catch (IOException unused) {
        }
        C5776i[] c5776iArr = null;
        synchronized (this) {
            if (!this.f21408j.isEmpty()) {
                c5776iArr = (C5776i[]) this.f21408j.values().toArray(new C5776i[this.f21408j.size()]);
                this.f21408j.clear();
            }
        }
        if (c5776iArr != null) {
            for (C5776i c5776i : c5776iArr) {
                try {
                    c5776i.m23016d(enumC5769b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f21403D.close();
        } catch (IOException unused3) {
        }
        try {
            this.f21402C.close();
        } catch (IOException unused4) {
        }
        this.f21413o.shutdown();
        this.f21414p.shutdown();
    }

    /* renamed from: W */
    public final void m22963W(IOException iOException) {
        EnumC5769b enumC5769b = EnumC5769b.PROTOCOL_ERROR;
        m22962P(enumC5769b, enumC5769b, iOException);
    }

    /* renamed from: b0 */
    public synchronized C5776i m22964b0(int i10) {
        return this.f21408j.get(Integer.valueOf(i10));
    }

    /* renamed from: c0 */
    public synchronized boolean m22965c0(long j10) {
        if (this.f21412n) {
            return false;
        }
        if (this.f21419u < this.f21418t) {
            if (j10 >= this.f21422x) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m22962P(EnumC5769b.NO_ERROR, EnumC5769b.CANCEL, null);
    }

    /* renamed from: e0 */
    public synchronized int m22966e0() {
        return this.f21401B.m23065e(C1841a.e.API_PRIORITY_OTHER);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x0029, B:15:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x004a, B:36:0x006d, B:37:0x0072), top: B:5:0x0007, outer: #1 }] */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p344xe.C5776i m22967f0(int r11, java.util.List<p344xe.C5770c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            xe.j r7 = r10.f21403D
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            int r0 = r10.f21411m     // Catch: java.lang.Throwable -> L73
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            xe.b r0 = p344xe.EnumC5769b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L73
            r10.m22977x0(r0)     // Catch: java.lang.Throwable -> L73
        L13:
            boolean r0 = r10.f21412n     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            int r8 = r10.f21411m     // Catch: java.lang.Throwable -> L73
            int r0 = r8 + 2
            r10.f21411m = r0     // Catch: java.lang.Throwable -> L73
            xe.i r9 = new xe.i     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L3a
            long r0 = r10.f21424z     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            long r0 = r9.f21489b     // Catch: java.lang.Throwable -> L73
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L38
            goto L3a
        L38:
            r13 = 0
            goto L3b
        L3a:
            r13 = 1
        L3b:
            boolean r0 = r9.m23023k()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, xe.i> r0 = r10.f21408j     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L73
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L53
            xe.j r11 = r10.f21403D     // Catch: java.lang.Throwable -> L76
            r11.m23049w(r6, r8, r12)     // Catch: java.lang.Throwable -> L76
            goto L5c
        L53:
            boolean r0 = r10.f21406h     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L65
            xe.j r0 = r10.f21403D     // Catch: java.lang.Throwable -> L76
            r0.m23038I(r11, r8, r12)     // Catch: java.lang.Throwable -> L76
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L64
            xe.j r11 = r10.f21403D
            r11.flush()
        L64:
            return r9
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L6d:
            xe.a r11 = new xe.a     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p344xe.C5773f.m22967f0(int, java.util.List, boolean):xe.i");
    }

    public void flush() {
        this.f21403D.flush();
    }

    /* renamed from: g0 */
    public C5776i m22968g0(List<C5770c> list, boolean z10) {
        return m22967f0(0, list, z10);
    }

    /* renamed from: h0 */
    public void m22969h0(int i10, InterfaceC0559e interfaceC0559e, int i11, boolean z10) {
        C0557c c0557c = new C0557c();
        long j10 = i11;
        interfaceC0559e.mo2806B0(j10);
        interfaceC0559e.mo2800T(c0557c, j10);
        if (c0557c.m2831g0() == j10) {
            m22970i0(new f("OkHttp %s Push Data[%s]", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, c0557c, i11, z10));
            return;
        }
        throw new IOException(c0557c.m2831g0() + " != " + i11);
    }

    /* renamed from: i0 */
    public final synchronized void m22970i0(AbstractRunnableC4593b abstractRunnableC4593b) {
        if (!this.f21412n) {
            this.f21414p.execute(abstractRunnableC4593b);
        }
    }

    /* renamed from: l0 */
    public void m22971l0(int i10, List<C5770c> list, boolean z10) {
        try {
            m22970i0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: n0 */
    public void m22972n0(int i10, List<C5770c> list) {
        synchronized (this) {
            if (this.f21405F.contains(Integer.valueOf(i10))) {
                m22960L0(i10, EnumC5769b.PROTOCOL_ERROR);
                return;
            }
            this.f21405F.add(Integer.valueOf(i10));
            try {
                m22970i0(new d("OkHttp %s Push Request[%s]", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: r0 */
    public void m22973r0(int i10, EnumC5769b enumC5769b) {
        m22970i0(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f21409k, Integer.valueOf(i10)}, i10, enumC5769b));
    }

    /* renamed from: s0 */
    public boolean m22974s0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* renamed from: u0 */
    public synchronized C5776i m22975u0(int i10) {
        C5776i remove;
        remove = this.f21408j.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* renamed from: v0 */
    public void m22976v0() {
        synchronized (this) {
            long j10 = this.f21419u;
            long j11 = this.f21418t;
            if (j10 < j11) {
                return;
            }
            this.f21418t = j11 + 1;
            this.f21422x = System.nanoTime() + 1000000000;
            try {
                this.f21413o.execute(new c("OkHttp %s ping", this.f21409k));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: x0 */
    public void m22977x0(EnumC5769b enumC5769b) {
        synchronized (this.f21403D) {
            synchronized (this) {
                if (this.f21412n) {
                    return;
                }
                this.f21412n = true;
                this.f21403D.m23048n(this.f21410l, enumC5769b, C4596e.f17230a);
            }
        }
    }

    /* renamed from: y0 */
    public void m22978y0() {
        m22979z0(true);
    }

    /* renamed from: z0 */
    public void m22979z0(boolean z10) {
        if (z10) {
            this.f21403D.m23044d();
            this.f21403D.m23040P(this.f21400A);
            if (this.f21400A.m23064d() != 65535) {
                this.f21403D.m23041W(0, r6 - 65535);
            }
        }
        new Thread(this.f21404E).start();
    }
}
