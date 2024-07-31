package ie;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p116he.C2539m;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;

/* renamed from: ie.a */
/* loaded from: classes2.dex */
public final class C2705a {
    /* renamed from: a */
    public static final void m11032a(InterfaceC3281d<?> interfaceC3281d, Throwable th) {
        C2237k.a aVar = C2237k.f8865i;
        interfaceC3281d.resumeWith(C2237k.m8966b(C2238l.m8974a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m11033b(InterfaceC3281d<? super C2245s> interfaceC3281d, InterfaceC3281d<?> interfaceC3281d2) {
        try {
            InterfaceC3281d m12580b = C3384b.m12580b(interfaceC3281d);
            C2237k.a aVar = C2237k.f8865i;
            C2539m.m10111c(m12580b, C2237k.m8966b(C2245s.f8873a), null, 2, null);
        } catch (Throwable th) {
            m11032a(interfaceC3281d2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m11034c(InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, R r10, InterfaceC3281d<? super T> interfaceC3281d, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        try {
            InterfaceC3281d m12580b = C3384b.m12580b(C3384b.m12579a(interfaceC4584p, r10, interfaceC3281d));
            C2237k.a aVar = C2237k.f8865i;
            C2539m.m10110b(m12580b, C2237k.m8966b(C2245s.f8873a), interfaceC4580l);
        } catch (Throwable th) {
            m11032a(interfaceC3281d, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m11035d(InterfaceC4584p interfaceC4584p, Object obj, InterfaceC3281d interfaceC3281d, InterfaceC4580l interfaceC4580l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC4580l = null;
        }
        m11034c(interfaceC4584p, obj, interfaceC3281d, interfaceC4580l);
    }
}
