package p204o3;

import android.content.Context;
import p086fd.InterfaceC1904a;
import p122i3.C2591d;
import p122i3.InterfaceC2589b;

/* renamed from: o3.h */
/* loaded from: classes.dex */
public final class C3856h implements InterfaceC2589b<String> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f13886a;

    public C3856h(InterfaceC1904a<Context> interfaceC1904a) {
        this.f13886a = interfaceC1904a;
    }

    /* renamed from: a */
    public static C3856h m14650a(InterfaceC1904a<Context> interfaceC1904a) {
        return new C3856h(interfaceC1904a);
    }

    /* renamed from: c */
    public static String m14651c(Context context) {
        return (String) C2591d.m10356c(AbstractC3852f.m14643b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m14651c(this.f13886a.get());
    }
}
