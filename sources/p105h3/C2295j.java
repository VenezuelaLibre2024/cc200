package p105h3;

import android.content.Context;
import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;
import p234q3.InterfaceC4157a;

/* renamed from: h3.j */
/* loaded from: classes.dex */
public final class C2295j implements InterfaceC2589b<C2294i> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f9201a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC4157a> f9202b;

    /* renamed from: c */
    public final InterfaceC1904a<InterfaceC4157a> f9203c;

    public C2295j(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<InterfaceC4157a> interfaceC1904a3) {
        this.f9201a = interfaceC1904a;
        this.f9202b = interfaceC1904a2;
        this.f9203c = interfaceC1904a3;
    }

    /* renamed from: a */
    public static C2295j m9312a(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<InterfaceC4157a> interfaceC1904a3) {
        return new C2295j(interfaceC1904a, interfaceC1904a2, interfaceC1904a3);
    }

    /* renamed from: c */
    public static C2294i m9313c(Context context, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2) {
        return new C2294i(context, interfaceC4157a, interfaceC4157a2);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2294i get() {
        return m9313c(this.f9201a.get(), this.f9202b.get(), this.f9203c.get());
    }
}
