package p234q3;

import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: q3.d */
/* loaded from: classes.dex */
public final class C4160d implements InterfaceC2589b<InterfaceC4157a> {

    /* renamed from: q3.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final C4160d f14959a = new C4160d();
    }

    /* renamed from: a */
    public static C4160d m16009a() {
        return a.f14959a;
    }

    /* renamed from: c */
    public static InterfaceC4157a m16010c() {
        return (InterfaceC4157a) C2591d.m10356c(AbstractC4158b.m16004b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4157a get() {
        return m16010c();
    }
}
