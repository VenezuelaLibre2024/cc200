package p204o3;

import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: o3.j */
/* loaded from: classes.dex */
public final class C3860j implements InterfaceC2589b<AbstractC3850e> {

    /* renamed from: o3.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final C3860j f13890a = new C3860j();
    }

    /* renamed from: a */
    public static C3860j m14657a() {
        return a.f13890a;
    }

    /* renamed from: c */
    public static AbstractC3850e m14658c() {
        return (AbstractC3850e) C2591d.m10356c(AbstractC3852f.m14645d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3850e get() {
        return m14658c();
    }
}
