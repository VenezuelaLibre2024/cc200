package p174le;

import p116he.C2538l0;
import p116he.C2544o0;

/* renamed from: le.e */
/* loaded from: classes2.dex */
public final class C3483e {

    /* renamed from: a */
    public static final int f12210a;

    /* renamed from: b */
    public static final C2538l0 f12211b;

    /* renamed from: c */
    public static final C2538l0 f12212c;

    /* renamed from: d */
    public static final C2538l0 f12213d;

    /* renamed from: e */
    public static final C2538l0 f12214e;

    /* renamed from: f */
    public static final int f12215f;

    static {
        int m10139e;
        int m10139e2;
        m10139e = C2544o0.m10139e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f12210a = m10139e;
        f12211b = new C2538l0("PERMIT");
        f12212c = new C2538l0("TAKEN");
        f12213d = new C2538l0("BROKEN");
        f12214e = new C2538l0("CANCELLED");
        m10139e2 = C2544o0.m10139e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f12215f = m10139e2;
    }

    /* renamed from: h */
    public static final C3484f m12968h(long j10, C3484f c3484f) {
        return new C3484f(j10, c3484f, 0);
    }
}
