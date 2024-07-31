package p204o3;

import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: o3.g */
/* loaded from: classes.dex */
public final class C3854g implements InterfaceC2589b<String> {

    /* renamed from: o3.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final C3854g f13884a = new C3854g();
    }

    /* renamed from: a */
    public static C3854g m14646a() {
        return a.f13884a;
    }

    /* renamed from: b */
    public static String m14647b() {
        return (String) C2591d.m10356c(AbstractC3852f.m14642a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m14647b();
    }
}
