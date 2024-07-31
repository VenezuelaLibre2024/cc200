package p208o7;

import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: o7.a */
/* loaded from: classes.dex */
public final class CallableC3951a implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f14207a;

    public CallableC3951a(FirebaseAnalytics firebaseAnalytics) {
        this.f14207a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        zzdf zzdfVar;
        zzdfVar = this.f14207a.f4718a;
        return zzdfVar.zze();
    }
}
