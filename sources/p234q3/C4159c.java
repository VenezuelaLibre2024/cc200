package p234q3;

import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: q3.c */
/* loaded from: classes.dex */
public final class C4159c implements InterfaceC2589b<InterfaceC4157a> {

    /* renamed from: q3.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final C4159c f14958a = new C4159c();
    }

    /* renamed from: a */
    public static C4159c m16005a() {
        return a.f14958a;
    }

    /* renamed from: b */
    public static InterfaceC4157a m16006b() {
        return (InterfaceC4157a) C2591d.m10356c(AbstractC4158b.m16003a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4157a get() {
        return m16006b();
    }
}
