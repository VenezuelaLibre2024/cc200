package p038ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ce.s */
/* loaded from: classes2.dex */
public final class C1096s extends C1024c0 {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f4082c = AtomicIntegerFieldUpdater.newUpdater(C1096s.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1096s(p146jd.InterfaceC3281d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C1096s.<init>(jd.d, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m4571c() {
        return f4082c.compareAndSet(this, 0, 1);
    }
}
