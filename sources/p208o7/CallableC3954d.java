package p208o7;

import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: o7.d */
/* loaded from: classes.dex */
public final class CallableC3954d implements Callable<Long> {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f14209a;

    public CallableC3954d(FirebaseAnalytics firebaseAnalytics) {
        this.f14209a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        zzdf zzdfVar;
        zzdfVar = this.f14209a.f4718a;
        return zzdfVar.zzc();
    }
}
