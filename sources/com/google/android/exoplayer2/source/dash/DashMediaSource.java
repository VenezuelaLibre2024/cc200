package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.C1152c;
import com.google.android.exoplayer2.source.dash.C1153d;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.InterfaceC1150a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2422e;
import p140j7.C3255c;
import p206o5.C3901e0;
import p206o5.C3905g0;
import p206o5.C3927v;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4023e0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.AbstractC4505u3;
import p264s3.C4448j1;
import p264s3.C4499t2;
import p264s3.C4503u1;
import p276t4.C4690b;
import p276t4.C4691c;
import p290u4.AbstractC4844a;
import p290u4.C4860i;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;
import p317w3.C5245l;
import p317w3.InterfaceC5256v;
import p317w3.InterfaceC5258x;
import p334x4.C5588b;
import p334x4.InterfaceC5592f;
import p350y4.AbstractC5809j;
import p350y4.C5800a;
import p350y4.C5802c;
import p350y4.C5803d;
import p350y4.C5806g;
import p350y4.C5814o;

/* loaded from: classes.dex */
public final class DashMediaSource extends AbstractC4844a {

    /* renamed from: A */
    public final Object f4165A;

    /* renamed from: B */
    public final SparseArray<C1151b> f4166B;

    /* renamed from: C */
    public final Runnable f4167C;

    /* renamed from: D */
    public final Runnable f4168D;

    /* renamed from: E */
    public final C1153d.b f4169E;

    /* renamed from: F */
    public final InterfaceC3903f0 f4170F;

    /* renamed from: G */
    public InterfaceC3910j f4171G;

    /* renamed from: H */
    public C3901e0 f4172H;

    /* renamed from: I */
    public InterfaceC3917m0 f4173I;

    /* renamed from: J */
    public IOException f4174J;

    /* renamed from: K */
    public Handler f4175K;

    /* renamed from: L */
    public C4503u1.g f4176L;

    /* renamed from: M */
    public Uri f4177M;

    /* renamed from: N */
    public Uri f4178N;

    /* renamed from: O */
    public C5802c f4179O;

    /* renamed from: P */
    public boolean f4180P;

    /* renamed from: Q */
    public long f4181Q;

    /* renamed from: R */
    public long f4182R;

    /* renamed from: S */
    public long f4183S;

    /* renamed from: T */
    public int f4184T;

    /* renamed from: U */
    public long f4185U;

    /* renamed from: V */
    public int f4186V;

    /* renamed from: o */
    public final C4503u1 f4187o;

    /* renamed from: p */
    public final boolean f4188p;

    /* renamed from: q */
    public final InterfaceC3910j.a f4189q;

    /* renamed from: r */
    public final InterfaceC1150a.a f4190r;

    /* renamed from: s */
    public final InterfaceC4858h f4191s;

    /* renamed from: t */
    public final InterfaceC5256v f4192t;

    /* renamed from: u */
    public final InterfaceC3899d0 f4193u;

    /* renamed from: v */
    public final C5588b f4194v;

    /* renamed from: w */
    public final long f4195w;

    /* renamed from: x */
    public final InterfaceC4845a0.a f4196x;

    /* renamed from: y */
    public final C3905g0.a<? extends C5802c> f4197y;

    /* renamed from: z */
    public final C1146e f4198z;

    /* loaded from: classes.dex */
    public static final class Factory implements InterfaceC4882t.a {

        /* renamed from: a */
        public final InterfaceC1150a.a f4199a;

        /* renamed from: b */
        public final InterfaceC3910j.a f4200b;

        /* renamed from: c */
        public InterfaceC5258x f4201c;

        /* renamed from: d */
        public InterfaceC4858h f4202d;

        /* renamed from: e */
        public InterfaceC3899d0 f4203e;

        /* renamed from: f */
        public long f4204f;

        /* renamed from: g */
        public C3905g0.a<? extends C5802c> f4205g;

        public Factory(InterfaceC1150a.a aVar, InterfaceC3910j.a aVar2) {
            this.f4199a = (InterfaceC1150a.a) C4014a.m15199e(aVar);
            this.f4200b = aVar2;
            this.f4201c = new C5245l();
            this.f4203e = new C3927v();
            this.f4204f = 30000L;
            this.f4202d = new C4860i();
        }

        public Factory(InterfaceC3910j.a aVar) {
            this(new C1152c.a(aVar), aVar);
        }

        /* renamed from: a */
        public DashMediaSource m4739a(C4503u1 c4503u1) {
            C4014a.m15199e(c4503u1.f16712i);
            C3905g0.a aVar = this.f4205g;
            if (aVar == null) {
                aVar = new C5803d();
            }
            List<C4691c> list = c4503u1.f16712i.f16790e;
            return new DashMediaSource(c4503u1, null, this.f4200b, !list.isEmpty() ? new C4690b(aVar, list) : aVar, this.f4199a, this.f4202d, this.f4201c.mo21251a(c4503u1), this.f4203e, this.f4204f, null);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    /* loaded from: classes.dex */
    public class C1142a implements C4023e0.b {
        public C1142a() {
        }

        @Override // p222p5.C4023e0.b
        /* renamed from: a */
        public void mo4740a(IOException iOException) {
            DashMediaSource.this.m4726a0(iOException);
        }

        @Override // p222p5.C4023e0.b
        /* renamed from: b */
        public void mo4741b() {
            DashMediaSource.this.m4728b0(C4023e0.m15293h());
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    /* loaded from: classes.dex */
    public static final class C1143b extends AbstractC4505u3 {

        /* renamed from: m */
        public final long f4207m;

        /* renamed from: n */
        public final long f4208n;

        /* renamed from: o */
        public final long f4209o;

        /* renamed from: p */
        public final int f4210p;

        /* renamed from: q */
        public final long f4211q;

        /* renamed from: r */
        public final long f4212r;

        /* renamed from: s */
        public final long f4213s;

        /* renamed from: t */
        public final C5802c f4214t;

        /* renamed from: u */
        public final C4503u1 f4215u;

        /* renamed from: v */
        public final C4503u1.g f4216v;

        public C1143b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, C5802c c5802c, C4503u1 c4503u1, C4503u1.g gVar) {
            C4014a.m15200f(c5802c.f21762d == (gVar != null));
            this.f4207m = j10;
            this.f4208n = j11;
            this.f4209o = j12;
            this.f4210p = i10;
            this.f4211q = j13;
            this.f4212r = j14;
            this.f4213s = j15;
            this.f4214t = c5802c;
            this.f4215u = c4503u1;
            this.f4216v = gVar;
        }

        /* renamed from: x */
        public static boolean m4742x(C5802c c5802c) {
            return c5802c.f21762d && c5802c.f21763e != -9223372036854775807L && c5802c.f21760b == -9223372036854775807L;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: f */
        public int mo4743f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f4210p) >= 0 && intValue < mo4745m()) {
                return intValue;
            }
            return -1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: k */
        public AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
            C4014a.m15197c(i10, 0, mo4745m());
            return bVar.m17698u(z10 ? this.f4214t.m23279d(i10).f21794a : null, z10 ? Integer.valueOf(this.f4210p + i10) : null, 0, this.f4214t.m23282g(i10), C4041n0.m15396B0(this.f4214t.m23279d(i10).f21795b - this.f4214t.m23279d(0).f21795b) - this.f4211q);
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: m */
        public int mo4745m() {
            return this.f4214t.m23280e();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: q */
        public Object mo4746q(int i10) {
            C4014a.m15197c(i10, 0, mo4745m());
            return Integer.valueOf(this.f4210p + i10);
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: s */
        public AbstractC4505u3.d mo4747s(int i10, AbstractC4505u3.d dVar, long j10) {
            C4014a.m15197c(i10, 0, 1);
            long m4749w = m4749w(j10);
            Object obj = AbstractC4505u3.d.f16858y;
            C4503u1 c4503u1 = this.f4215u;
            C5802c c5802c = this.f4214t;
            return dVar.m17707h(obj, c4503u1, c5802c, this.f4207m, this.f4208n, this.f4209o, true, m4742x(c5802c), this.f4216v, m4749w, this.f4212r, 0, mo4745m() - 1, this.f4211q);
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: t */
        public int mo4748t() {
            return 1;
        }

        /* renamed from: w */
        public final long m4749w(long j10) {
            InterfaceC5592f mo23364l;
            long j11 = this.f4213s;
            if (!m4742x(this.f4214t)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f4212r) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f4211q + j11;
            long m23282g = this.f4214t.m23282g(0);
            int i10 = 0;
            while (i10 < this.f4214t.m23280e() - 1 && j12 >= m23282g) {
                j12 -= m23282g;
                i10++;
                m23282g = this.f4214t.m23282g(i10);
            }
            C5806g m23279d = this.f4214t.m23279d(i10);
            int m23358a = m23279d.m23358a(2);
            return (m23358a == -1 || (mo23364l = m23279d.f21796c.get(m23358a).f21751c.get(0).mo23364l()) == null || mo23364l.mo22522i(m23282g) == 0) ? j11 : (j11 + mo23364l.mo22514a(mo23364l.mo22519f(j12, m23282g))) - j12;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    /* loaded from: classes.dex */
    public final class C1144c implements C1153d.b {
        public C1144c() {
        }

        public /* synthetic */ C1144c(DashMediaSource dashMediaSource, C1142a c1142a) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.C1153d.b
        /* renamed from: a */
        public void mo4750a() {
            DashMediaSource.this.m4719U();
        }

        @Override // com.google.android.exoplayer2.source.dash.C1153d.b
        /* renamed from: b */
        public void mo4751b(long j10) {
            DashMediaSource.this.m4718T(j10);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    /* loaded from: classes.dex */
    public static final class C1145d implements C3905g0.a<Long> {

        /* renamed from: a */
        public static final Pattern f4218a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // p206o5.C3905g0.a
        /* renamed from: b */
        public Long mo290a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, C2422e.f9747c)).readLine();
            try {
                Matcher matcher = f4218a.matcher(readLine);
                if (!matcher.matches()) {
                    throw C4499t2.m17596c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw C4499t2.m17596c(null, e10);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    /* loaded from: classes.dex */
    public final class C1146e implements C3901e0.b<C3905g0<C5802c>> {
        public C1146e() {
        }

        public /* synthetic */ C1146e(DashMediaSource dashMediaSource, C1142a c1142a) {
            this();
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: a */
        public void mo223r(C3905g0<C5802c> c3905g0, long j10, long j11, boolean z10) {
            DashMediaSource.this.m4720V(c3905g0, j10, j11);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: b */
        public void mo222o(C3905g0<C5802c> c3905g0, long j10, long j11) {
            DashMediaSource.this.m4721W(c3905g0, j10, j11);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: c */
        public C3901e0.c mo219k(C3905g0<C5802c> c3905g0, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.m4722X(c3905g0, j10, j11, iOException, i10);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    /* loaded from: classes.dex */
    public final class C1147f implements InterfaceC3903f0 {
        public C1147f() {
        }

        @Override // p206o5.InterfaceC3903f0
        /* renamed from: a */
        public void mo4756a() {
            DashMediaSource.this.f4172H.mo4756a();
            m4757b();
        }

        /* renamed from: b */
        public final void m4757b() {
            if (DashMediaSource.this.f4174J != null) {
                throw DashMediaSource.this.f4174J;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    /* loaded from: classes.dex */
    public final class C1148g implements C3901e0.b<C3905g0<Long>> {
        public C1148g() {
        }

        public /* synthetic */ C1148g(DashMediaSource dashMediaSource, C1142a c1142a) {
            this();
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: a */
        public void mo223r(C3905g0<Long> c3905g0, long j10, long j11, boolean z10) {
            DashMediaSource.this.m4720V(c3905g0, j10, j11);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: b */
        public void mo222o(C3905g0<Long> c3905g0, long j10, long j11) {
            DashMediaSource.this.m4723Y(c3905g0, j10, j11);
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: c */
        public C3901e0.c mo219k(C3905g0<Long> c3905g0, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.m4724Z(c3905g0, j10, j11, iOException);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    /* loaded from: classes.dex */
    public static final class C1149h implements C3905g0.a<Long> {
        public C1149h() {
        }

        public /* synthetic */ C1149h(C1142a c1142a) {
            this();
        }

        @Override // p206o5.C3905g0.a
        /* renamed from: b */
        public Long mo290a(Uri uri, InputStream inputStream) {
            return Long.valueOf(C4041n0.m15410I0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C4448j1.m17365a("goog.exo.dash");
    }

    public DashMediaSource(C4503u1 c4503u1, C5802c c5802c, InterfaceC3910j.a aVar, C3905g0.a<? extends C5802c> aVar2, InterfaceC1150a.a aVar3, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, long j10) {
        this.f4187o = c4503u1;
        this.f4176L = c4503u1.f16714k;
        this.f4177M = ((C4503u1.h) C4014a.m15199e(c4503u1.f16712i)).f16786a;
        this.f4178N = c4503u1.f16712i.f16786a;
        this.f4179O = c5802c;
        this.f4189q = aVar;
        this.f4197y = aVar2;
        this.f4190r = aVar3;
        this.f4192t = interfaceC5256v;
        this.f4193u = interfaceC3899d0;
        this.f4195w = j10;
        this.f4191s = interfaceC4858h;
        this.f4194v = new C5588b();
        boolean z10 = c5802c != null;
        this.f4188p = z10;
        this.f4196x = m19203w(null);
        this.f4165A = new Object();
        this.f4166B = new SparseArray<>();
        this.f4169E = new C1144c(this, null);
        this.f4185U = -9223372036854775807L;
        this.f4183S = -9223372036854775807L;
        if (!z10) {
            this.f4198z = new C1146e(this, null);
            this.f4170F = new C1147f();
            this.f4167C = new Runnable() { // from class: x4.d
                public /* synthetic */ RunnableC5590d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.m4737i0();
                }
            };
            this.f4168D = new Runnable() { // from class: x4.e
                public /* synthetic */ RunnableC5591e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.m4713R();
                }
            };
            return;
        }
        C4014a.m15200f(true ^ c5802c.f21762d);
        this.f4198z = null;
        this.f4167C = null;
        this.f4168D = null;
        this.f4170F = new InterfaceC3903f0.a();
    }

    public /* synthetic */ DashMediaSource(C4503u1 c4503u1, C5802c c5802c, InterfaceC3910j.a aVar, C3905g0.a aVar2, InterfaceC1150a.a aVar3, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, long j10, C1142a c1142a) {
        this(c4503u1, c5802c, aVar, aVar2, aVar3, interfaceC4858h, interfaceC5256v, interfaceC3899d0, j10);
    }

    /* renamed from: L */
    public static long m4708L(C5806g c5806g, long j10, long j11) {
        long m15396B0 = C4041n0.m15396B0(c5806g.f21795b);
        boolean m4711P = m4711P(c5806g);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < c5806g.f21796c.size(); i10++) {
            C5800a c5800a = c5806g.f21796c.get(i10);
            List<AbstractC5809j> list = c5800a.f21751c;
            int i11 = c5800a.f21750b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!m4711P || !z10) && !list.isEmpty()) {
                InterfaceC5592f mo23364l = list.get(0).mo23364l();
                if (mo23364l == null) {
                    return m15396B0 + j10;
                }
                long mo22523j = mo23364l.mo22523j(j10, j11);
                if (mo22523j == 0) {
                    return m15396B0;
                }
                long mo22516c = (mo23364l.mo22516c(j10, j11) + mo22523j) - 1;
                j12 = Math.min(j12, mo23364l.mo22515b(mo22516c, j10) + mo23364l.mo22514a(mo22516c) + m15396B0);
            }
        }
        return j12;
    }

    /* renamed from: M */
    public static long m4709M(C5806g c5806g, long j10, long j11) {
        long m15396B0 = C4041n0.m15396B0(c5806g.f21795b);
        boolean m4711P = m4711P(c5806g);
        long j12 = m15396B0;
        for (int i10 = 0; i10 < c5806g.f21796c.size(); i10++) {
            C5800a c5800a = c5806g.f21796c.get(i10);
            List<AbstractC5809j> list = c5800a.f21751c;
            int i11 = c5800a.f21750b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!m4711P || !z10) && !list.isEmpty()) {
                InterfaceC5592f mo23364l = list.get(0).mo23364l();
                if (mo23364l == null || mo23364l.mo22523j(j10, j11) == 0) {
                    return m15396B0;
                }
                j12 = Math.max(j12, mo23364l.mo22514a(mo23364l.mo22516c(j10, j11)) + m15396B0);
            }
        }
        return j12;
    }

    /* renamed from: N */
    public static long m4710N(C5802c c5802c, long j10) {
        InterfaceC5592f mo23364l;
        int m23280e = c5802c.m23280e() - 1;
        C5806g m23279d = c5802c.m23279d(m23280e);
        long m15396B0 = C4041n0.m15396B0(m23279d.f21795b);
        long m23282g = c5802c.m23282g(m23280e);
        long m15396B02 = C4041n0.m15396B0(j10);
        long m15396B03 = C4041n0.m15396B0(c5802c.f21759a);
        long m15396B04 = C4041n0.m15396B0(5000L);
        for (int i10 = 0; i10 < m23279d.f21796c.size(); i10++) {
            List<AbstractC5809j> list = m23279d.f21796c.get(i10).f21751c;
            if (!list.isEmpty() && (mo23364l = list.get(0).mo23364l()) != null) {
                long mo22517d = ((m15396B03 + m15396B0) + mo23364l.mo22517d(m23282g, m15396B02)) - m15396B02;
                if (mo22517d < m15396B04 - 100000 || (mo22517d > m15396B04 && mo22517d < m15396B04 + 100000)) {
                    m15396B04 = mo22517d;
                }
            }
        }
        return C3255c.m11754a(m15396B04, 1000L, RoundingMode.CEILING);
    }

    /* renamed from: P */
    public static boolean m4711P(C5806g c5806g) {
        for (int i10 = 0; i10 < c5806g.f21796c.size(); i10++) {
            int i11 = c5806g.f21796c.get(i10).f21750b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m4712Q(C5806g c5806g) {
        for (int i10 = 0; i10 < c5806g.f21796c.size(); i10++) {
            InterfaceC5592f mo23364l = c5806g.f21796c.get(i10).f21751c.get(0).mo23364l();
            if (mo23364l == null || mo23364l.mo22520g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public /* synthetic */ void m4713R() {
        m4729c0(false);
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: C */
    public void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        this.f4173I = interfaceC3917m0;
        this.f4192t.mo21231d(Looper.myLooper(), m19189A());
        this.f4192t.mo21228a();
        if (this.f4188p) {
            m4729c0(false);
            return;
        }
        this.f4171G = this.f4189q.mo14830a();
        this.f4172H = new C3901e0("DashMediaSource");
        this.f4175K = C4041n0.m15489w();
        m4737i0();
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        this.f4180P = false;
        this.f4171G = null;
        C3901e0 c3901e0 = this.f4172H;
        if (c3901e0 != null) {
            c3901e0.m14805l();
            this.f4172H = null;
        }
        this.f4181Q = 0L;
        this.f4182R = 0L;
        this.f4179O = this.f4188p ? this.f4179O : null;
        this.f4177M = this.f4178N;
        this.f4174J = null;
        Handler handler = this.f4175K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4175K = null;
        }
        this.f4183S = -9223372036854775807L;
        this.f4184T = 0;
        this.f4185U = -9223372036854775807L;
        this.f4186V = 0;
        this.f4166B.clear();
        this.f4194v.m22511i();
        this.f4192t.release();
    }

    /* renamed from: O */
    public final long m4716O() {
        return Math.min((this.f4184T - 1) * 1000, 5000);
    }

    /* renamed from: S */
    public final void m4717S() {
        C4023e0.m15295j(this.f4172H, new C1142a());
    }

    /* renamed from: T */
    public void m4718T(long j10) {
        long j11 = this.f4185U;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f4185U = j10;
        }
    }

    /* renamed from: U */
    public void m4719U() {
        this.f4175K.removeCallbacks(this.f4168D);
        m4737i0();
    }

    /* renamed from: V */
    public void m4720V(C3905g0<?> c3905g0, long j10, long j11) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        this.f4193u.m14776b(c3905g0.f14029a);
        this.f4196x.m19229q(c4870n, c3905g0.f14031c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4721W(p206o5.C3905g0<p350y4.C5802c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m4721W(o5.g0, long, long):void");
    }

    /* renamed from: X */
    public C3901e0.c m4722X(C3905g0<C5802c> c3905g0, long j10, long j11, IOException iOException, int i10) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        long mo14775a = this.f4193u.mo14775a(new InterfaceC3899d0.c(c4870n, new C4876q(c3905g0.f14031c), iOException, i10));
        C3901e0.c m14799h = mo14775a == -9223372036854775807L ? C3901e0.f14002g : C3901e0.m14799h(false, mo14775a);
        boolean z10 = !m14799h.m14810c();
        this.f4196x.m19236x(c4870n, c3905g0.f14031c, iOException, z10);
        if (z10) {
            this.f4193u.m14776b(c3905g0.f14029a);
        }
        return m14799h;
    }

    /* renamed from: Y */
    public void m4723Y(C3905g0<Long> c3905g0, long j10, long j11) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        this.f4193u.m14776b(c3905g0.f14029a);
        this.f4196x.m19232t(c4870n, c3905g0.f14031c);
        m4728b0(c3905g0.m14827e().longValue() - j10);
    }

    /* renamed from: Z */
    public C3901e0.c m4724Z(C3905g0<Long> c3905g0, long j10, long j11, IOException iOException) {
        this.f4196x.m19236x(new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a()), c3905g0.f14031c, iOException, true);
        this.f4193u.m14776b(c3905g0.f14029a);
        m4726a0(iOException);
        return C3901e0.f14001f;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: a */
    public void mo4725a(InterfaceC4878r interfaceC4878r) {
        C1151b c1151b = (C1151b) interfaceC4878r;
        c1151b.m4780H();
        this.f4166B.remove(c1151b.f4229h);
    }

    /* renamed from: a0 */
    public final void m4726a0(IOException iOException) {
        C4046r.m15524d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m4729c0(true);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: b */
    public InterfaceC4878r mo4727b(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        int intValue = ((Integer) bVar.f18457a).intValue() - this.f4186V;
        InterfaceC4845a0.a m19204x = m19204x(bVar, this.f4179O.m23279d(intValue).f21795b);
        C1151b c1151b = new C1151b(intValue + this.f4186V, this.f4179O, this.f4194v, intValue, this.f4190r, this.f4173I, this.f4192t, m19201u(bVar), this.f4193u, m19204x, this.f4183S, this.f4170F, interfaceC3894b, this.f4191s, this.f4169E, m19189A());
        this.f4166B.put(c1151b.f4229h, c1151b);
        return c1151b;
    }

    /* renamed from: b0 */
    public final void m4728b0(long j10) {
        this.f4183S = j10;
        m4729c0(true);
    }

    /* renamed from: c0 */
    public final void m4729c0(boolean z10) {
        C5806g c5806g;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f4166B.size(); i10++) {
            int keyAt = this.f4166B.keyAt(i10);
            if (keyAt >= this.f4186V) {
                this.f4166B.valueAt(i10).m4784L(this.f4179O, keyAt - this.f4186V);
            }
        }
        C5806g m23279d = this.f4179O.m23279d(0);
        int m23280e = this.f4179O.m23280e() - 1;
        C5806g m23279d2 = this.f4179O.m23279d(m23280e);
        long m23282g = this.f4179O.m23282g(m23280e);
        long m15396B0 = C4041n0.m15396B0(C4041n0.m15446a0(this.f4183S));
        long m4709M = m4709M(m23279d, this.f4179O.m23282g(0), m15396B0);
        long m4708L = m4708L(m23279d2, m23282g, m15396B0);
        boolean z11 = this.f4179O.f21762d && !m4712Q(m23279d2);
        if (z11) {
            long j12 = this.f4179O.f21764f;
            if (j12 != -9223372036854775807L) {
                m4709M = Math.max(m4709M, m4708L - C4041n0.m15396B0(j12));
            }
        }
        long j13 = m4708L - m4709M;
        C5802c c5802c = this.f4179O;
        if (c5802c.f21762d) {
            C4014a.m15200f(c5802c.f21759a != -9223372036854775807L);
            long m15396B02 = (m15396B0 - C4041n0.m15396B0(this.f4179O.f21759a)) - m4709M;
            m4738j0(m15396B02, j13);
            long m15442Y0 = this.f4179O.f21759a + C4041n0.m15442Y0(m4709M);
            long m15396B03 = m15396B02 - C4041n0.m15396B0(this.f4176L.f16776h);
            long min = Math.min(5000000L, j13 / 2);
            j10 = m15442Y0;
            j11 = m15396B03 < min ? min : m15396B03;
            c5806g = m23279d;
        } else {
            c5806g = m23279d;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long m15396B04 = m4709M - C4041n0.m15396B0(c5806g.f21795b);
        C5802c c5802c2 = this.f4179O;
        m19191D(new C1143b(c5802c2.f21759a, j10, this.f4183S, this.f4186V, m15396B04, j13, j11, c5802c2, this.f4187o, c5802c2.f21762d ? this.f4176L : null));
        if (this.f4188p) {
            return;
        }
        this.f4175K.removeCallbacks(this.f4168D);
        if (z11) {
            this.f4175K.postDelayed(this.f4168D, m4710N(this.f4179O, C4041n0.m15446a0(this.f4183S)));
        }
        if (this.f4180P) {
            m4737i0();
            return;
        }
        if (z10) {
            C5802c c5802c3 = this.f4179O;
            if (c5802c3.f21762d) {
                long j14 = c5802c3.f21763e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    m4734g0(Math.max(0L, (this.f4181Q + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: d0 */
    public final void m4730d0(C5814o c5814o) {
        C3905g0.a<Long> c1145d;
        String str = c5814o.f21849a;
        if (C4041n0.m15449c(str, "urn:mpeg:dash:utc:direct:2014") || C4041n0.m15449c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m4731e0(c5814o);
            return;
        }
        if (C4041n0.m15449c(str, "urn:mpeg:dash:utc:http-iso:2014") || C4041n0.m15449c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            c1145d = new C1145d();
        } else {
            if (!C4041n0.m15449c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !C4041n0.m15449c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (C4041n0.m15449c(str, "urn:mpeg:dash:utc:ntp:2014") || C4041n0.m15449c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    m4717S();
                    return;
                } else {
                    m4726a0(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            c1145d = new C1149h(null);
        }
        m4732f0(c5814o, c1145d);
    }

    /* renamed from: e0 */
    public final void m4731e0(C5814o c5814o) {
        try {
            m4728b0(C4041n0.m15410I0(c5814o.f21850b) - this.f4182R);
        } catch (C4499t2 e10) {
            m4726a0(e10);
        }
    }

    /* renamed from: f0 */
    public final void m4732f0(C5814o c5814o, C3905g0.a<Long> aVar) {
        m4736h0(new C3905g0(this.f4171G, Uri.parse(c5814o.f21850b), 5, aVar), new C1148g(this, null), 1);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: g */
    public C4503u1 mo4733g() {
        return this.f4187o;
    }

    /* renamed from: g0 */
    public final void m4734g0(long j10) {
        this.f4175K.postDelayed(this.f4167C, j10);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: h */
    public void mo4735h() {
        this.f4170F.mo4756a();
    }

    /* renamed from: h0 */
    public final <T> void m4736h0(C3905g0<T> c3905g0, C3901e0.b<C3905g0<T>> bVar, int i10) {
        this.f4196x.m19238z(new C4870n(c3905g0.f14029a, c3905g0.f14030b, this.f4172H.m14807n(c3905g0, bVar, i10)), c3905g0.f14031c);
    }

    /* renamed from: i0 */
    public final void m4737i0() {
        Uri uri;
        this.f4175K.removeCallbacks(this.f4167C);
        if (this.f4172H.m14802i()) {
            return;
        }
        if (this.f4172H.m14803j()) {
            this.f4180P = true;
            return;
        }
        synchronized (this.f4165A) {
            uri = this.f4177M;
        }
        this.f4180P = false;
        m4736h0(new C3905g0(this.f4171G, uri, 4, this.f4197y), this.f4198z, this.f4193u.mo14778d(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0061, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0025, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4738j0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m4738j0(long, long):void");
    }
}
