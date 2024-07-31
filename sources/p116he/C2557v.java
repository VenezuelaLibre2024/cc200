package p116he;

import td.C4753m;

/* renamed from: he.v */
/* loaded from: classes2.dex */
public final class C2557v {

    /* renamed from: a */
    public static final Object f10016a = new C2538l0("CONDITION_FALSE");

    /* renamed from: a */
    public static final Object m10179a() {
        return f10016a;
    }

    /* renamed from: b */
    public static final C2559w m10180b(Object obj) {
        C2559w c2559w;
        C2526f0 c2526f0 = obj instanceof C2526f0 ? (C2526f0) obj : null;
        if (c2526f0 != null && (c2559w = c2526f0.f9966a) != null) {
            return c2559w;
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C2559w) obj;
    }
}
