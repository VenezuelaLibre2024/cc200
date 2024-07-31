package p034c7;

import java.lang.Thread;
import p108h6.C2394s;

/* renamed from: c7.f6 */
/* loaded from: classes.dex */
public final class C0697f6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f2925a;

    /* renamed from: b */
    public final /* synthetic */ C0669d6 f2926b;

    public C0697f6(C0669d6 c0669d6, String str) {
        this.f2926b = c0669d6;
        C2394s.m9619l(str);
        this.f2925a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f2926b.zzj().m3914B().m3996b(this.f2925a, th);
    }
}
