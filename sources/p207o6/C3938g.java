package p207o6;

import android.os.SystemClock;

/* renamed from: o6.g */
/* loaded from: classes.dex */
public class C3938g implements InterfaceC3935d {

    /* renamed from: a */
    public static final C3938g f14185a = new C3938g();

    /* renamed from: d */
    public static InterfaceC3935d m14938d() {
        return f14185a;
    }

    @Override // p207o6.InterfaceC3935d
    /* renamed from: a */
    public final long mo14932a() {
        return System.currentTimeMillis();
    }

    @Override // p207o6.InterfaceC3935d
    /* renamed from: b */
    public final long mo14933b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p207o6.InterfaceC3935d
    /* renamed from: c */
    public final long mo14934c() {
        return System.nanoTime();
    }
}
