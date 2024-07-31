package p035c8;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p023b8.C0515g;

/* renamed from: c8.c */
/* loaded from: classes.dex */
public class C0986c implements InterfaceC0985b, InterfaceC0984a {

    /* renamed from: a */
    public final C0988e f3863a;

    /* renamed from: b */
    public final int f3864b;

    /* renamed from: c */
    public final TimeUnit f3865c;

    /* renamed from: e */
    public CountDownLatch f3867e;

    /* renamed from: d */
    public final Object f3866d = new Object();

    /* renamed from: f */
    public boolean f3868f = false;

    public C0986c(C0988e c0988e, int i10, TimeUnit timeUnit) {
        this.f3863a = c0988e;
        this.f3864b = i10;
        this.f3865c = timeUnit;
    }

    @Override // p035c8.InterfaceC0984a
    /* renamed from: a */
    public void mo301a(String str, Bundle bundle) {
        synchronized (this.f3866d) {
            C0515g.m2482f().m2490i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f3867e = new CountDownLatch(1);
            this.f3868f = false;
            this.f3863a.mo301a(str, bundle);
            C0515g.m2482f().m2490i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f3867e.await(this.f3864b, this.f3865c)) {
                    this.f3868f = true;
                    C0515g.m2482f().m2490i("App exception callback received from Analytics listener.");
                } else {
                    C0515g.m2482f().m2492k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C0515g.m2482f().m2486d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f3867e = null;
        }
    }

    @Override // p035c8.InterfaceC0985b
    /* renamed from: f */
    public void mo4142f(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f3867e;
        if (countDownLatch != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
