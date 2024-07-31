package p264s3;

import android.content.Context;
import android.os.Looper;
import p109h7.InterfaceC2424g;
import p109h7.InterfaceC2438u;
import p193n5.AbstractC3734b0;
import p193n5.C3746m;
import p206o5.C3922q;
import p206o5.InterfaceC3900e;
import p222p5.C4014a;
import p222p5.C4019c0;
import p222p5.C4041n0;
import p222p5.InterfaceC4020d;
import p264s3.C4446j;
import p264s3.InterfaceC4486r;
import p275t3.InterfaceC4618a;
import p289u3.C4813e;
import p290u4.C4862j;
import p290u4.InterfaceC4882t;
import p333x3.C5568h;

/* renamed from: s3.r */
/* loaded from: classes.dex */
public interface InterfaceC4486r extends InterfaceC4409b3 {

    /* renamed from: s3.r$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: B */
        default void m17513B(boolean z10) {
        }

        /* renamed from: v */
        default void mo17514v(boolean z10) {
        }
    }

    /* renamed from: s3.r$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        public boolean f16629A;

        /* renamed from: B */
        public Looper f16630B;

        /* renamed from: C */
        public boolean f16631C;

        /* renamed from: a */
        public final Context f16632a;

        /* renamed from: b */
        public InterfaceC4020d f16633b;

        /* renamed from: c */
        public long f16634c;

        /* renamed from: d */
        public InterfaceC2438u<InterfaceC4460l3> f16635d;

        /* renamed from: e */
        public InterfaceC2438u<InterfaceC4882t.a> f16636e;

        /* renamed from: f */
        public InterfaceC2438u<AbstractC3734b0> f16637f;

        /* renamed from: g */
        public InterfaceC2438u<InterfaceC4493s1> f16638g;

        /* renamed from: h */
        public InterfaceC2438u<InterfaceC3900e> f16639h;

        /* renamed from: i */
        public InterfaceC2424g<InterfaceC4020d, InterfaceC4618a> f16640i;

        /* renamed from: j */
        public Looper f16641j;

        /* renamed from: k */
        public C4019c0 f16642k;

        /* renamed from: l */
        public C4813e f16643l;

        /* renamed from: m */
        public boolean f16644m;

        /* renamed from: n */
        public int f16645n;

        /* renamed from: o */
        public boolean f16646o;

        /* renamed from: p */
        public boolean f16647p;

        /* renamed from: q */
        public int f16648q;

        /* renamed from: r */
        public int f16649r;

        /* renamed from: s */
        public boolean f16650s;

        /* renamed from: t */
        public C4465m3 f16651t;

        /* renamed from: u */
        public long f16652u;

        /* renamed from: v */
        public long f16653v;

        /* renamed from: w */
        public InterfaceC4488r1 f16654w;

        /* renamed from: x */
        public long f16655x;

        /* renamed from: y */
        public long f16656y;

        /* renamed from: z */
        public boolean f16657z;

        public b(Context context) {
            this(context, new InterfaceC2438u() { // from class: s3.u

                /* renamed from: h */
                public final /* synthetic */ Context f16702h;

                public /* synthetic */ C4501u(Context context2) {
                    r1 = context2;
                }

                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    InterfaceC4460l3 m17519f;
                    m17519f = InterfaceC4486r.b.m17519f(r1);
                    return m17519f;
                }
            }, new InterfaceC2438u() { // from class: s3.w

                /* renamed from: h */
                public final /* synthetic */ Context f16884h;

                public /* synthetic */ C4511w(Context context2) {
                    r1 = context2;
                }

                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    InterfaceC4882t.a m17520g;
                    m17520g = InterfaceC4486r.b.m17520g(r1);
                    return m17520g;
                }
            });
        }

        public b(Context context, InterfaceC2438u<InterfaceC4460l3> interfaceC2438u, InterfaceC2438u<InterfaceC4882t.a> interfaceC2438u2) {
            this(context, interfaceC2438u, interfaceC2438u2, new InterfaceC2438u() { // from class: s3.v

                /* renamed from: h */
                public final /* synthetic */ Context f16877h;

                public /* synthetic */ C4506v(Context context2) {
                    r1 = context2;
                }

                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    AbstractC3734b0 m17521h;
                    m17521h = InterfaceC4486r.b.m17521h(r1);
                    return m17521h;
                }
            }, C4516x.f16968h, new InterfaceC2438u() { // from class: s3.t

                /* renamed from: h */
                public final /* synthetic */ Context f16696h;

                public /* synthetic */ C4496t(Context context2) {
                    r1 = context2;
                }

                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    InterfaceC3900e m14875n;
                    m14875n = C3922q.m14875n(r1);
                    return m14875n;
                }
            }, C4491s.f16666h);
        }

        public b(Context context, InterfaceC2438u<InterfaceC4460l3> interfaceC2438u, InterfaceC2438u<InterfaceC4882t.a> interfaceC2438u2, InterfaceC2438u<AbstractC3734b0> interfaceC2438u3, InterfaceC2438u<InterfaceC4493s1> interfaceC2438u4, InterfaceC2438u<InterfaceC3900e> interfaceC2438u5, InterfaceC2424g<InterfaceC4020d, InterfaceC4618a> interfaceC2424g) {
            this.f16632a = (Context) C4014a.m15199e(context);
            this.f16635d = interfaceC2438u;
            this.f16636e = interfaceC2438u2;
            this.f16637f = interfaceC2438u3;
            this.f16638g = interfaceC2438u4;
            this.f16639h = interfaceC2438u5;
            this.f16640i = interfaceC2424g;
            this.f16641j = C4041n0.m15425Q();
            this.f16643l = C4813e.f17998n;
            this.f16645n = 0;
            this.f16648q = 1;
            this.f16649r = 0;
            this.f16650s = true;
            this.f16651t = C4465m3.f16553g;
            this.f16652u = 5000L;
            this.f16653v = 15000L;
            this.f16654w = new C4446j.b().m17364a();
            this.f16633b = InterfaceC4020d.f14458a;
            this.f16655x = 500L;
            this.f16656y = 2000L;
            this.f16629A = true;
        }

        /* renamed from: f */
        public static /* synthetic */ InterfaceC4460l3 m17519f(Context context) {
            return new C4461m(context);
        }

        /* renamed from: g */
        public static /* synthetic */ InterfaceC4882t.a m17520g(Context context) {
            return new C4862j(context, new C5568h());
        }

        /* renamed from: h */
        public static /* synthetic */ AbstractC3734b0 m17521h(Context context) {
            return new C3746m(context);
        }

        /* renamed from: e */
        public InterfaceC4486r m17523e() {
            C4014a.m15200f(!this.f16631C);
            this.f16631C = true;
            return new C4512w0(this, null);
        }
    }

    /* renamed from: h */
    void mo17510h(C4813e c4813e, boolean z10);

    /* renamed from: l */
    void mo17511l(InterfaceC4882t interfaceC4882t);

    /* renamed from: w */
    C4463m1 mo17512w();
}
