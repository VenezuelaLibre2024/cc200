package p116he;

import p116he.AbstractC2532i0;
import td.C4753m;

/* renamed from: he.j0 */
/* loaded from: classes2.dex */
public final class C2534j0<S extends AbstractC2532i0<S>> {
    /* renamed from: a */
    public static <S extends AbstractC2532i0<S>> Object m10087a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final S m10088b(Object obj) {
        if (obj == C2523e.f9963a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    /* renamed from: c */
    public static final boolean m10089c(Object obj) {
        return obj == C2523e.f9963a;
    }
}
