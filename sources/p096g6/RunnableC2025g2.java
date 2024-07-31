package p096g6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: g6.g2 */
/* loaded from: classes.dex */
public final class RunnableC2025g2 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ LifecycleCallback f8039h;

    /* renamed from: i */
    public final /* synthetic */ String f8040i;

    /* renamed from: j */
    public final /* synthetic */ FragmentC2029h2 f8041j;

    public RunnableC2025g2(FragmentC2029h2 fragmentC2029h2, LifecycleCallback lifecycleCallback, String str) {
        this.f8041j = fragmentC2029h2;
        this.f8039h = lifecycleCallback;
        this.f8040i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        FragmentC2029h2 fragmentC2029h2 = this.f8041j;
        i10 = fragmentC2029h2.f8048i;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f8039h;
            bundle = fragmentC2029h2.f8049j;
            if (bundle != null) {
                String str = this.f8040i;
                bundle3 = fragmentC2029h2.f8049j;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f8041j.f8048i;
        if (i11 >= 2) {
            this.f8039h.onStart();
        }
        i12 = this.f8041j.f8048i;
        if (i12 >= 3) {
            this.f8039h.onResume();
        }
        i13 = this.f8041j.f8048i;
        if (i13 >= 4) {
            this.f8039h.onStop();
        }
        i14 = this.f8041j.f8048i;
        if (i14 >= 5) {
            this.f8039h.onDestroy();
        }
    }
}
