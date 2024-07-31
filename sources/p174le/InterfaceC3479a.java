package p174le;

import gd.C2245s;
import p146jd.InterfaceC3281d;

/* renamed from: le.a */
/* loaded from: classes2.dex */
public interface InterfaceC3479a {

    /* renamed from: le.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m12933a(InterfaceC3479a interfaceC3479a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC3479a.mo12932c(obj);
        }
    }

    /* renamed from: a */
    boolean mo12930a();

    /* renamed from: b */
    Object mo12931b(Object obj, InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: c */
    void mo12932c(Object obj);
}
