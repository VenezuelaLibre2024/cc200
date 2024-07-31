package p170l7;

import java.util.concurrent.locks.LockSupport;

/* renamed from: l7.h */
/* loaded from: classes.dex */
public final class C3447h {
    /* renamed from: a */
    public static void m12831a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
