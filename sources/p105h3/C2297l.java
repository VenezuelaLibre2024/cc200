package p105h3;

import android.content.Context;
import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;

/* renamed from: h3.l */
/* loaded from: classes.dex */
public final class C2297l implements InterfaceC2589b<C2296k> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f9209a;

    /* renamed from: b */
    public final InterfaceC1904a<C2294i> f9210b;

    public C2297l(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<C2294i> interfaceC1904a2) {
        this.f9209a = interfaceC1904a;
        this.f9210b = interfaceC1904a2;
    }

    /* renamed from: a */
    public static C2297l m9319a(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<C2294i> interfaceC1904a2) {
        return new C2297l(interfaceC1904a, interfaceC1904a2);
    }

    /* renamed from: c */
    public static C2296k m9320c(Context context, Object obj) {
        return new C2296k(context, (C2294i) obj);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2296k get() {
        return m9320c(this.f9209a.get(), this.f9210b.get());
    }
}
