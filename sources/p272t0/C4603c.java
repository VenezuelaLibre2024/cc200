package p272t0;

import android.content.Context;
import java.io.File;
import java.util.List;
import p038ce.InterfaceC1085p0;
import p246r0.InterfaceC4260d;
import p246r0.InterfaceC4262f;
import p261s0.C4386b;
import p286u0.AbstractC4782d;
import p286u0.C4781c;
import p298ud.InterfaceC5012a;
import p359yd.InterfaceC5918h;
import sd.InterfaceC4569a;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: t0.c */
/* loaded from: classes.dex */
public final class C4603c implements InterfaceC5012a<Context, InterfaceC4262f<AbstractC4782d>> {

    /* renamed from: a */
    public final String f17253a;

    /* renamed from: b */
    public final C4386b<AbstractC4782d> f17254b;

    /* renamed from: c */
    public final InterfaceC4580l<Context, List<InterfaceC4260d<AbstractC4782d>>> f17255c;

    /* renamed from: d */
    public final InterfaceC1085p0 f17256d;

    /* renamed from: e */
    public final Object f17257e;

    /* renamed from: f */
    public volatile InterfaceC4262f<AbstractC4782d> f17258f;

    /* renamed from: t0.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<File> {

        /* renamed from: h */
        public final /* synthetic */ Context f17259h;

        /* renamed from: i */
        public final /* synthetic */ C4603c f17260i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C4603c c4603c) {
            super(0);
            this.f17259h = context;
            this.f17260i = c4603c;
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.f17259h;
            C4753m.m18652e(context, "applicationContext");
            return C4602b.m18130a(context, this.f17260i.f17253a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4603c(String str, C4386b<AbstractC4782d> c4386b, InterfaceC4580l<? super Context, ? extends List<? extends InterfaceC4260d<AbstractC4782d>>> interfaceC4580l, InterfaceC1085p0 interfaceC1085p0) {
        C4753m.m18653f(str, "name");
        C4753m.m18653f(interfaceC4580l, "produceMigrations");
        C4753m.m18653f(interfaceC1085p0, "scope");
        this.f17253a = str;
        this.f17254b = c4386b;
        this.f17255c = interfaceC4580l;
        this.f17256d = interfaceC1085p0;
        this.f17257e = new Object();
    }

    @Override // p298ud.InterfaceC5012a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4262f<AbstractC4782d> mo18132a(Context context, InterfaceC5918h<?> interfaceC5918h) {
        InterfaceC4262f<AbstractC4782d> interfaceC4262f;
        C4753m.m18653f(context, "thisRef");
        C4753m.m18653f(interfaceC5918h, "property");
        InterfaceC4262f<AbstractC4782d> interfaceC4262f2 = this.f17258f;
        if (interfaceC4262f2 != null) {
            return interfaceC4262f2;
        }
        synchronized (this.f17257e) {
            if (this.f17258f == null) {
                Context applicationContext = context.getApplicationContext();
                C4781c c4781c = C4781c.f17810a;
                C4386b<AbstractC4782d> c4386b = this.f17254b;
                InterfaceC4580l<Context, List<InterfaceC4260d<AbstractC4782d>>> interfaceC4580l = this.f17255c;
                C4753m.m18652e(applicationContext, "applicationContext");
                this.f17258f = c4781c.m18786a(c4386b, interfaceC4580l.invoke(applicationContext), this.f17256d, new a(applicationContext, this));
            }
            interfaceC4262f = this.f17258f;
            C4753m.m18650c(interfaceC4262f);
        }
        return interfaceC4262f;
    }
}
