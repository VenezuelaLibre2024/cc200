package p093g3;

import android.content.Context;
import java.util.concurrent.Executor;
import p086fd.InterfaceC1904a;
import p093g3.AbstractC1984v;
import p105h3.C2295j;
import p105h3.C2297l;
import p122i3.C2588a;
import p122i3.C2590c;
import p122i3.C2591d;
import p122i3.InterfaceC2589b;
import p179m3.C3516c;
import p179m3.C3517d;
import p179m3.C3520g;
import p179m3.C3522i;
import p191n3.AbstractC3710g;
import p191n3.C3722s;
import p191n3.C3723t;
import p191n3.C3726w;
import p191n3.C3727x;
import p191n3.InterfaceC3728y;
import p204o3.C3854g;
import p204o3.C3856h;
import p204o3.C3858i;
import p204o3.C3860j;
import p204o3.C3867m0;
import p204o3.C3869n0;
import p204o3.C3883u0;
import p204o3.InterfaceC3848d;
import p234q3.C4159c;
import p234q3.C4160d;

/* renamed from: g3.e */
/* loaded from: classes.dex */
public final class C1967e extends AbstractC1984v {

    /* renamed from: h */
    public InterfaceC1904a<Executor> f7862h;

    /* renamed from: i */
    public InterfaceC1904a<Context> f7863i;

    /* renamed from: j */
    public InterfaceC1904a f7864j;

    /* renamed from: k */
    public InterfaceC1904a f7865k;

    /* renamed from: l */
    public InterfaceC1904a f7866l;

    /* renamed from: m */
    public InterfaceC1904a<String> f7867m;

    /* renamed from: n */
    public InterfaceC1904a<C3867m0> f7868n;

    /* renamed from: o */
    public InterfaceC1904a<AbstractC3710g> f7869o;

    /* renamed from: p */
    public InterfaceC1904a<InterfaceC3728y> f7870p;

    /* renamed from: q */
    public InterfaceC1904a<C3516c> f7871q;

    /* renamed from: r */
    public InterfaceC1904a<C3722s> f7872r;

    /* renamed from: s */
    public InterfaceC1904a<C3726w> f7873s;

    /* renamed from: t */
    public InterfaceC1904a<C1983u> f7874t;

    /* renamed from: g3.e$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC1984v.a {

        /* renamed from: a */
        public Context f7875a;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // p093g3.AbstractC1984v.a
        /* renamed from: a */
        public AbstractC1984v mo7975a() {
            C2591d.m10354a(this.f7875a, Context.class);
            return new C1967e(this.f7875a);
        }

        @Override // p093g3.AbstractC1984v.a
        /* renamed from: c */
        public b mo7976b(Context context) {
            this.f7875a = (Context) C2591d.m10355b(context);
            return this;
        }
    }

    public C1967e(Context context) {
        m7974j(context);
    }

    public /* synthetic */ C1967e(Context context, a aVar) {
        this(context);
    }

    /* renamed from: f */
    public static AbstractC1984v.a m7971f() {
        return new b();
    }

    @Override // p093g3.AbstractC1984v
    /* renamed from: a */
    public InterfaceC3848d mo7972a() {
        return this.f7868n.get();
    }

    @Override // p093g3.AbstractC1984v
    /* renamed from: d */
    public C1983u mo7973d() {
        return this.f7874t.get();
    }

    /* renamed from: j */
    public final void m7974j(Context context) {
        this.f7862h = C2588a.m10351a(C1973k.m7990a());
        InterfaceC2589b m10353a = C2590c.m10353a(context);
        this.f7863i = m10353a;
        C2295j m9312a = C2295j.m9312a(m10353a, C4159c.m16005a(), C4160d.m16009a());
        this.f7864j = m9312a;
        this.f7865k = C2588a.m10351a(C2297l.m9319a(this.f7863i, m9312a));
        this.f7866l = C3883u0.m14752a(this.f7863i, C3854g.m14646a(), C3858i.m14653a());
        this.f7867m = C2588a.m10351a(C3856h.m14650a(this.f7863i));
        this.f7868n = C2588a.m10351a(C3869n0.m14735a(C4159c.m16005a(), C4160d.m16009a(), C3860j.m14657a(), this.f7866l, this.f7867m));
        C3520g m13072b = C3520g.m13072b(C4159c.m16005a());
        this.f7869o = m13072b;
        C3522i m13075a = C3522i.m13075a(this.f7863i, this.f7868n, m13072b, C4160d.m16009a());
        this.f7870p = m13075a;
        InterfaceC1904a<Executor> interfaceC1904a = this.f7862h;
        InterfaceC1904a interfaceC1904a2 = this.f7865k;
        InterfaceC1904a<C3867m0> interfaceC1904a3 = this.f7868n;
        this.f7871q = C3517d.m13067a(interfaceC1904a, interfaceC1904a2, m13075a, interfaceC1904a3, interfaceC1904a3);
        InterfaceC1904a<Context> interfaceC1904a4 = this.f7863i;
        InterfaceC1904a interfaceC1904a5 = this.f7865k;
        InterfaceC1904a<C3867m0> interfaceC1904a6 = this.f7868n;
        this.f7872r = C3723t.m14031a(interfaceC1904a4, interfaceC1904a5, interfaceC1904a6, this.f7870p, this.f7862h, interfaceC1904a6, C4159c.m16005a(), C4160d.m16009a(), this.f7868n);
        InterfaceC1904a<Executor> interfaceC1904a7 = this.f7862h;
        InterfaceC1904a<C3867m0> interfaceC1904a8 = this.f7868n;
        this.f7873s = C3727x.m14039a(interfaceC1904a7, interfaceC1904a8, this.f7870p, interfaceC1904a8);
        this.f7874t = C2588a.m10351a(C1985w.m8012a(C4159c.m16005a(), C4160d.m16009a(), this.f7871q, this.f7872r, this.f7873s));
    }
}
