package p179m3;

import android.content.Context;
import p086fd.InterfaceC1904a;
import p122i3.C2591d;
import p122i3.InterfaceC2589b;
import p191n3.AbstractC3710g;
import p191n3.InterfaceC3728y;
import p204o3.InterfaceC3848d;
import p234q3.InterfaceC4157a;

/* renamed from: m3.i */
/* loaded from: classes.dex */
public final class C3522i implements InterfaceC2589b<InterfaceC3728y> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f12347a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC3848d> f12348b;

    /* renamed from: c */
    public final InterfaceC1904a<AbstractC3710g> f12349c;

    /* renamed from: d */
    public final InterfaceC1904a<InterfaceC4157a> f12350d;

    public C3522i(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC3848d> interfaceC1904a2, InterfaceC1904a<AbstractC3710g> interfaceC1904a3, InterfaceC1904a<InterfaceC4157a> interfaceC1904a4) {
        this.f12347a = interfaceC1904a;
        this.f12348b = interfaceC1904a2;
        this.f12349c = interfaceC1904a3;
        this.f12350d = interfaceC1904a4;
    }

    /* renamed from: a */
    public static C3522i m13075a(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC3848d> interfaceC1904a2, InterfaceC1904a<AbstractC3710g> interfaceC1904a3, InterfaceC1904a<InterfaceC4157a> interfaceC1904a4) {
        return new C3522i(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4);
    }

    /* renamed from: c */
    public static InterfaceC3728y m13076c(Context context, InterfaceC3848d interfaceC3848d, AbstractC3710g abstractC3710g, InterfaceC4157a interfaceC4157a) {
        return (InterfaceC3728y) C2591d.m10356c(AbstractC3521h.m13074a(context, interfaceC3848d, abstractC3710g, interfaceC4157a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3728y get() {
        return m13076c(this.f12347a.get(), this.f12348b.get(), this.f12349c.get(), this.f12350d.get());
    }
}
