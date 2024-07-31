package ke;

import gd.C2245s;
import p038ce.InterfaceC1076n;
import p116he.C2538l0;
import sd.InterfaceC4580l;
import sd.InterfaceC4585q;
import td.AbstractC4754n;

/* renamed from: ke.c */
/* loaded from: classes2.dex */
public final class C3388c {

    /* renamed from: a */
    public static final InterfaceC4585q<Object, Object, Object, Object> f11816a = a.f11822h;

    /* renamed from: b */
    public static final C2538l0 f11817b = new C2538l0("STATE_REG");

    /* renamed from: c */
    public static final C2538l0 f11818c = new C2538l0("STATE_COMPLETED");

    /* renamed from: d */
    public static final C2538l0 f11819d = new C2538l0("STATE_CANCELLED");

    /* renamed from: e */
    public static final C2538l0 f11820e = new C2538l0("NO_RESULT");

    /* renamed from: f */
    public static final C2538l0 f11821f = new C2538l0("PARAM_CLAUSE_0");

    /* renamed from: ke.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4585q {

        /* renamed from: h */
        public static final a f11822h = new a();

        public a() {
            super(3);
        }

        @Override // sd.InterfaceC4585q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo7159b(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* renamed from: a */
    public static final EnumC3389d m12589a(int i10) {
        if (i10 == 0) {
            return EnumC3389d.SUCCESSFUL;
        }
        if (i10 == 1) {
            return EnumC3389d.REREGISTER;
        }
        if (i10 == 2) {
            return EnumC3389d.CANCELLED;
        }
        if (i10 == 3) {
            return EnumC3389d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* renamed from: h */
    public static final boolean m12596h(InterfaceC1076n<? super C2245s> interfaceC1076n, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        Object mo4487e = interfaceC1076n.mo4487e(C2245s.f8873a, null, interfaceC4580l);
        if (mo4487e == null) {
            return false;
        }
        interfaceC1076n.mo4492m(mo4487e);
        return true;
    }
}
