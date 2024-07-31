package p272t0;

import android.content.Context;
import java.util.List;
import p038ce.C1045g1;
import p038ce.C1089q0;
import p038ce.C1115w2;
import p038ce.InterfaceC1085p0;
import p115hd.C2502n;
import p246r0.InterfaceC4260d;
import p246r0.InterfaceC4262f;
import p261s0.C4386b;
import p286u0.AbstractC4782d;
import p298ud.InterfaceC5012a;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C4601a {

    /* renamed from: t0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Context, List<? extends InterfaceC4260d<AbstractC4782d>>> {

        /* renamed from: h */
        public static final a f17252h = new a();

        public a() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final List<InterfaceC4260d<AbstractC4782d>> invoke(Context context) {
            C4753m.m18653f(context, "it");
            return C2502n.m9989e();
        }
    }

    /* renamed from: a */
    public static final InterfaceC5012a<Context, InterfaceC4262f<AbstractC4782d>> m18127a(String str, C4386b<AbstractC4782d> c4386b, InterfaceC4580l<? super Context, ? extends List<? extends InterfaceC4260d<AbstractC4782d>>> interfaceC4580l, InterfaceC1085p0 interfaceC1085p0) {
        C4753m.m18653f(str, "name");
        C4753m.m18653f(interfaceC4580l, "produceMigrations");
        C4753m.m18653f(interfaceC1085p0, "scope");
        return new C4603c(str, c4386b, interfaceC4580l, interfaceC1085p0);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC5012a m18128b(String str, C4386b c4386b, InterfaceC4580l interfaceC4580l, InterfaceC1085p0 interfaceC1085p0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c4386b = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC4580l = a.f17252h;
        }
        if ((i10 & 8) != 0) {
            C1045g1 c1045g1 = C1045g1.f4003a;
            interfaceC1085p0 = C1089q0.m4557a(C1045g1.m4327b().mo4369e0(C1115w2.m4594b(null, 1, null)));
        }
        return m18127a(str, c4386b, interfaceC4580l, interfaceC1085p0);
    }
}
