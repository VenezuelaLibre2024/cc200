package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p034c7.InterfaceC0714g9;
import p108h6.C2394s;
import p208o7.C3952b;
import p208o7.C3953c;
import p208o7.CallableC3951a;
import p208o7.CallableC3954d;
import p369z8.C6083g;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c */
    public static volatile FirebaseAnalytics f4717c;

    /* renamed from: a */
    public final zzdf f4718a;

    /* renamed from: b */
    public ExecutorService f4719b;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    /* loaded from: classes.dex */
    public enum EnumC1253a {
        GRANTED,
        DENIED
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    /* loaded from: classes.dex */
    public enum EnumC1254b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzdf zzdfVar) {
        C2394s.m9619l(zzdfVar);
        this.f4718a = zzdfVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f4717c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f4717c == null) {
                    f4717c = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return f4717c;
    }

    @Keep
    public static InterfaceC0714g9 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new C3953c(zza);
    }

    /* renamed from: a */
    public final Task<String> m5166a() {
        try {
            return Tasks.call(m5176l(), new CallableC3951a(this));
        } catch (RuntimeException e10) {
            this.f4718a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    /* renamed from: b */
    public final Task<Long> m5167b() {
        try {
            return Tasks.call(m5176l(), new CallableC3954d(this));
        } catch (RuntimeException e10) {
            this.f4718a.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e10);
        }
    }

    /* renamed from: c */
    public final void m5168c(String str, Bundle bundle) {
        this.f4718a.zza(str, bundle);
    }

    /* renamed from: d */
    public final void m5169d() {
        this.f4718a.zzj();
    }

    /* renamed from: e */
    public final void m5170e(boolean z10) {
        this.f4718a.zza(Boolean.valueOf(z10));
    }

    /* renamed from: f */
    public final void m5171f(Map<EnumC1254b, EnumC1253a> map) {
        Bundle bundle = new Bundle();
        EnumC1253a enumC1253a = map.get(EnumC1254b.AD_STORAGE);
        if (enumC1253a != null) {
            int ordinal = enumC1253a.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        EnumC1253a enumC1253a2 = map.get(EnumC1254b.ANALYTICS_STORAGE);
        if (enumC1253a2 != null) {
            int ordinal2 = enumC1253a2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        EnumC1253a enumC1253a3 = map.get(EnumC1254b.AD_USER_DATA);
        if (enumC1253a3 != null) {
            int ordinal3 = enumC1253a3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        EnumC1253a enumC1253a4 = map.get(EnumC1254b.AD_PERSONALIZATION);
        if (enumC1253a4 != null) {
            int ordinal4 = enumC1253a4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f4718a.zzc(bundle);
    }

    /* renamed from: g */
    public final void m5172g(Bundle bundle) {
        this.f4718a.zzd(bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(C6083g.m24306p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    /* renamed from: h */
    public final void m5173h(long j10) {
        this.f4718a.zza(j10);
    }

    /* renamed from: i */
    public final void m5174i(String str) {
        this.f4718a.zzd(str);
    }

    /* renamed from: j */
    public final void m5175j(String str, String str2) {
        this.f4718a.zzb(str, str2);
    }

    /* renamed from: l */
    public final ExecutorService m5176l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f4719b == null) {
                this.f4719b = new C3952b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f4719b;
        }
        return executorService;
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f4718a.zza(activity, str, str2);
    }
}
