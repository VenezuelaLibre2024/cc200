package p266s5;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* renamed from: s5.c */
/* loaded from: classes.dex */
public final class C4534c extends Thread {

    /* renamed from: h */
    public final WeakReference<C4532a> f17134h;

    /* renamed from: i */
    public final long f17135i;

    /* renamed from: j */
    public final CountDownLatch f17136j = new CountDownLatch(1);

    /* renamed from: k */
    public boolean f17137k = false;

    public C4534c(C4532a c4532a, long j10) {
        this.f17134h = new WeakReference<>(c4532a);
        this.f17135i = j10;
        start();
    }

    /* renamed from: a */
    public final void m17965a() {
        C4532a c4532a = this.f17134h.get();
        if (c4532a != null) {
            c4532a.m17958c();
            this.f17137k = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f17136j.await(this.f17135i, TimeUnit.MILLISECONDS)) {
                return;
            }
            m17965a();
        } catch (InterruptedException unused) {
            m17965a();
        }
    }
}
