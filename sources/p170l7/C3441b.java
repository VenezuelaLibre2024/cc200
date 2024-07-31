package p170l7;

import sun.misc.Unsafe;

/* renamed from: l7.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3441b {
    /* renamed from: a */
    public static /* synthetic */ boolean m12827a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
