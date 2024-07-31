package p096g6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: g6.i2 */
/* loaded from: classes.dex */
public final class RunnableC2033i2 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ LifecycleCallback f8052h;

    /* renamed from: i */
    public final /* synthetic */ String f8053i;

    /* renamed from: j */
    public final /* synthetic */ C2037j2 f8054j;

    public RunnableC2033i2(C2037j2 c2037j2, LifecycleCallback lifecycleCallback, String str) {
        this.f8054j = c2037j2;
        this.f8052h = lifecycleCallback;
        this.f8053i = str;
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
        C2037j2 c2037j2 = this.f8054j;
        i10 = c2037j2.f8065i;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f8052h;
            bundle = c2037j2.f8066j;
            if (bundle != null) {
                String str = this.f8053i;
                bundle3 = c2037j2.f8066j;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f8054j.f8065i;
        if (i11 >= 2) {
            this.f8052h.onStart();
        }
        i12 = this.f8054j.f8065i;
        if (i12 >= 3) {
            this.f8052h.onResume();
        }
        i13 = this.f8054j.f8065i;
        if (i13 >= 4) {
            this.f8052h.onStop();
        }
        i14 = this.f8054j.f8065i;
        if (i14 >= 5) {
            this.f8052h.onDestroy();
        }
    }
}
