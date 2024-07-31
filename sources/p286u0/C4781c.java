package p286u0;

import java.io.File;
import java.util.List;
import p038ce.InterfaceC1085p0;
import p243qd.C4246m;
import p246r0.C4263g;
import p246r0.InterfaceC4260d;
import p246r0.InterfaceC4262f;
import p261s0.C4386b;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: u0.c */
/* loaded from: classes.dex */
public final class C4781c {

    /* renamed from: a */
    public static final C4781c f17810a = new C4781c();

    /* renamed from: u0.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<File> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC4569a<File> f17811h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4569a<? extends File> interfaceC4569a) {
            super(0);
            this.f17811h = interfaceC4569a;
        }

        @Override // sd.InterfaceC4569a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File invoke = this.f17811h.invoke();
            String m16297i = C4246m.m16297i(invoke);
            C4786h c4786h = C4786h.f17818a;
            if (C4753m.m18648a(m16297i, c4786h.m18806f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + c4786h.m18806f()).toString());
        }
    }

    /* renamed from: a */
    public final InterfaceC4262f<AbstractC4782d> m18786a(C4386b<AbstractC4782d> c4386b, List<? extends InterfaceC4260d<AbstractC4782d>> list, InterfaceC1085p0 interfaceC1085p0, InterfaceC4569a<? extends File> interfaceC4569a) {
        C4753m.m18653f(list, "migrations");
        C4753m.m18653f(interfaceC1085p0, "scope");
        C4753m.m18653f(interfaceC4569a, "produceFile");
        return new C4780b(C4263g.f15413a.m16351a(C4786h.f17818a, c4386b, list, interfaceC1085p0, new a(interfaceC4569a)));
    }
}
