package p038ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ce.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C1080o {
    /* renamed from: a */
    public static /* synthetic */ boolean m4523a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
