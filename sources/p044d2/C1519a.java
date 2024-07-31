package p044d2;

import android.os.Handler;
import android.os.Looper;
import p029c2.InterfaceC0599q;
import p090g0.C1949i;

/* renamed from: d2.a */
/* loaded from: classes.dex */
public class C1519a implements InterfaceC0599q {

    /* renamed from: a */
    public final Handler f5543a = C1949i.m7861a(Looper.getMainLooper());

    @Override // p029c2.InterfaceC0599q
    /* renamed from: a */
    public void mo2984a(long j10, Runnable runnable) {
        this.f5543a.postDelayed(runnable, j10);
    }

    @Override // p029c2.InterfaceC0599q
    /* renamed from: b */
    public void mo2985b(Runnable runnable) {
        this.f5543a.removeCallbacks(runnable);
    }
}
