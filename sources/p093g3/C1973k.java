package p093g3;

import java.util.concurrent.Executor;
import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: g3.k */
/* loaded from: classes.dex */
public final class C1973k implements InterfaceC2589b<Executor> {

    /* renamed from: g3.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final C1973k f7878a = new C1973k();
    }

    /* renamed from: a */
    public static C1973k m7990a() {
        return a.f7878a;
    }

    /* renamed from: b */
    public static Executor m7991b() {
        return (Executor) C2591d.m10356c(AbstractC1972j.m7989a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m7991b();
    }
}
