package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;
import p034c7.C0618a0;
import p034c7.C0686e9;
import p034c7.C0705g0;
import p034c7.C0767k6;
import p034c7.C0857qc;
import p034c7.C0936w7;
import p034c7.InterfaceC0866r7;
import p034c7.InterfaceC0880s7;
import p034c7.RunnableC0711g6;
import p034c7.RunnableC0726h7;
import p034c7.RunnableC0728h9;
import p034c7.RunnableC0729ha;
import p034c7.RunnableC0744ib;
import p034c7.RunnableC0769k8;
import p034c7.RunnableC0797m8;
import p034c7.RunnableC0853q8;
import p034c7.RunnableC0951x8;
import p108h6.C2394s;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;
import p285u.C4771a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzct {

    /* renamed from: a */
    public C0767k6 f4610a = null;

    /* renamed from: b */
    public final Map<Integer, InterfaceC0866r7> f4611b = new C4771a();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    /* loaded from: classes.dex */
    public class C1184a implements InterfaceC0866r7 {

        /* renamed from: a */
        public zzda f4612a;

        public C1184a(zzda zzdaVar) {
            this.f4612a = zzdaVar;
        }

        @Override // p034c7.InterfaceC0866r7
        /* renamed from: a */
        public final void mo3818a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f4612a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                C0767k6 c0767k6 = AppMeasurementDynamiteService.this.f4610a;
                if (c0767k6 != null) {
                    c0767k6.zzj().m3919G().m3996b("Event listener threw exception", e10);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    /* loaded from: classes.dex */
    public class C1185b implements InterfaceC0880s7 {

        /* renamed from: a */
        public zzda f4614a;

        public C1185b(zzda zzdaVar) {
            this.f4614a = zzdaVar;
        }

        @Override // p034c7.InterfaceC0880s7
        /* renamed from: a */
        public final void mo3842a(String str, String str2, Bundle bundle, long j10) {
            try {
                this.f4614a.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                C0767k6 c0767k6 = AppMeasurementDynamiteService.this.f4610a;
                if (c0767k6 != null) {
                    c0767k6.zzj().m3919G().m3996b("Event interceptor threw exception", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(String str, long j10) {
        m5104c();
        this.f4610a.m3512t().m3109u(str, j10);
    }

    /* renamed from: c */
    public final void m5104c() {
        if (this.f4610a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m5104c();
        this.f4610a.m3487C().m3959T(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long j10) {
        m5104c();
        this.f4610a.m3487C().m3953N(null);
    }

    /* renamed from: e */
    public final void m5105e(zzcv zzcvVar, String str) {
        m5104c();
        this.f4610a.m3491G().m3786R(zzcvVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(String str, long j10) {
        m5104c();
        this.f4610a.m3512t().m3112y(str, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(zzcv zzcvVar) {
        m5104c();
        long m3778K0 = this.f4610a.m3491G().m3778K0();
        m5104c();
        this.f4610a.m3491G().m3782P(zzcvVar, m3778K0);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(zzcv zzcvVar) {
        m5104c();
        this.f4610a.zzl().m3152y(new RunnableC0726h7(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(zzcv zzcvVar) {
        m5104c();
        m5105e(zzcvVar, this.f4610a.m3487C().m3970e0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        m5104c();
        this.f4610a.zzl().m3152y(new RunnableC0744ib(this, zzcvVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(zzcv zzcvVar) {
        m5104c();
        m5105e(zzcvVar, this.f4610a.m3487C().m3971f0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(zzcv zzcvVar) {
        m5104c();
        m5105e(zzcvVar, this.f4610a.m3487C().m3972g0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(zzcv zzcvVar) {
        m5104c();
        m5105e(zzcvVar, this.f4610a.m3487C().m3973h0());
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String str, zzcv zzcvVar) {
        m5104c();
        this.f4610a.m3487C();
        C2394s.m9613f(str);
        m5104c();
        this.f4610a.m3491G().m3781O(zzcvVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(zzcv zzcvVar) {
        m5104c();
        C0936w7 m3487C = this.f4610a.m3487C();
        m3487C.zzl().m3152y(new RunnableC0951x8(m3487C, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(zzcv zzcvVar, int i10) {
        m5104c();
        if (i10 == 0) {
            this.f4610a.m3491G().m3786R(zzcvVar, this.f4610a.m3487C().m3974i0());
            return;
        }
        if (i10 == 1) {
            this.f4610a.m3491G().m3782P(zzcvVar, this.f4610a.m3487C().m3969d0().longValue());
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f4610a.m3491G().m3781O(zzcvVar, this.f4610a.m3487C().m3968c0().intValue());
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f4610a.m3491G().m3790T(zzcvVar, this.f4610a.m3487C().m3966a0().booleanValue());
                return;
            }
        }
        C0857qc m3491G = this.f4610a.m3491G();
        double doubleValue = this.f4610a.m3487C().m3967b0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", doubleValue);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            m3491G.f3198a.zzj().m3919G().m3996b("Error returning double value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar) {
        m5104c();
        this.f4610a.zzl().m3152y(new RunnableC0728h9(this, zzcvVar, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(Map map) {
        m5104c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void initialize(InterfaceC4307b interfaceC4307b, zzdd zzddVar, long j10) {
        C0767k6 c0767k6 = this.f4610a;
        if (c0767k6 == null) {
            this.f4610a = C0767k6.m3480a((Context) C2394s.m9619l((Context) BinderC4309d.m16571e(interfaceC4307b)), zzddVar, Long.valueOf(j10));
        } else {
            c0767k6.zzj().m3919G().m3995a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(zzcv zzcvVar) {
        m5104c();
        this.f4610a.zzl().m3152y(new RunnableC0729ha(this, zzcvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        m5104c();
        this.f4610a.m3487C().m3961V(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10) {
        m5104c();
        C2394s.m9613f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f4610a.zzl().m3152y(new RunnableC0711g6(this, zzcvVar, new C0705g0(str2, new C0618a0(bundle), "app", j10), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int i10, String str, InterfaceC4307b interfaceC4307b, InterfaceC4307b interfaceC4307b2, InterfaceC4307b interfaceC4307b3) {
        m5104c();
        this.f4610a.zzj().m3925u(i10, true, false, str, interfaceC4307b == null ? null : BinderC4309d.m16571e(interfaceC4307b), interfaceC4307b2 == null ? null : BinderC4309d.m16571e(interfaceC4307b2), interfaceC4307b3 != null ? BinderC4309d.m16571e(interfaceC4307b3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(InterfaceC4307b interfaceC4307b, Bundle bundle, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityCreated((Activity) BinderC4309d.m16571e(interfaceC4307b), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(InterfaceC4307b interfaceC4307b, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityDestroyed((Activity) BinderC4309d.m16571e(interfaceC4307b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(InterfaceC4307b interfaceC4307b, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityPaused((Activity) BinderC4309d.m16571e(interfaceC4307b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(InterfaceC4307b interfaceC4307b, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityResumed((Activity) BinderC4309d.m16571e(interfaceC4307b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(InterfaceC4307b interfaceC4307b, zzcv zzcvVar, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        Bundle bundle = new Bundle();
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivitySaveInstanceState((Activity) BinderC4309d.m16571e(interfaceC4307b), bundle);
        }
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f4610a.zzj().m3919G().m3996b("Error returning bundle value to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(InterfaceC4307b interfaceC4307b, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityStarted((Activity) BinderC4309d.m16571e(interfaceC4307b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(InterfaceC4307b interfaceC4307b, long j10) {
        m5104c();
        C0686e9 c0686e9 = this.f4610a.m3487C().f3697c;
        if (c0686e9 != null) {
            this.f4610a.m3487C().m3976k0();
            c0686e9.onActivityStopped((Activity) BinderC4309d.m16571e(interfaceC4307b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle, zzcv zzcvVar, long j10) {
        m5104c();
        zzcvVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC0866r7 interfaceC0866r7;
        m5104c();
        synchronized (this.f4611b) {
            interfaceC0866r7 = this.f4611b.get(Integer.valueOf(zzdaVar.zza()));
            if (interfaceC0866r7 == null) {
                interfaceC0866r7 = new C1184a(zzdaVar);
                this.f4611b.put(Integer.valueOf(zzdaVar.zza()), interfaceC0866r7);
            }
        }
        this.f4610a.m3487C().m3951H(interfaceC0866r7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long j10) {
        m5104c();
        C0936w7 m3487C = this.f4610a.m3487C();
        m3487C.m3955P(null);
        m3487C.zzl().m3152y(new RunnableC0853q8(m3487C, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        m5104c();
        if (bundle == null) {
            this.f4610a.zzj().m3914B().m3995a("Conditional user property must not be null");
        } else {
            this.f4610a.m3487C().m3947D(bundle, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(final Bundle bundle, final long j10) {
        m5104c();
        final C0936w7 m3487C = this.f4610a.m3487C();
        m3487C.zzl().m3144B(new Runnable() { // from class: c7.c8
            @Override // java.lang.Runnable
            public final void run() {
                C0936w7 c0936w7 = C0936w7.this;
                Bundle bundle2 = bundle;
                long j11 = j10;
                if (TextUtils.isEmpty(c0936w7.mo3101k().m3698B())) {
                    c0936w7.m3946C(bundle2, 0, j11);
                } else {
                    c0936w7.zzj().m3920H().m3995a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(Bundle bundle, long j10) {
        m5104c();
        this.f4610a.m3487C().m3946C(bundle, -20, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(InterfaceC4307b interfaceC4307b, String str, String str2, long j10) {
        m5104c();
        this.f4610a.m3488D().m3715C((Activity) BinderC4309d.m16571e(interfaceC4307b), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z10) {
        m5104c();
        C0936w7 m3487C = this.f4610a.m3487C();
        m3487C.m3155q();
        m3487C.zzl().m3152y(new RunnableC0769k8(m3487C, z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(Bundle bundle) {
        m5104c();
        final C0936w7 m3487C = this.f4610a.m3487C();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        m3487C.zzl().m3152y(new Runnable() { // from class: c7.z7
            @Override // java.lang.Runnable
            public final void run() {
                C0936w7.this.m3945B(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(zzda zzdaVar) {
        m5104c();
        C1185b c1185b = new C1185b(zzdaVar);
        if (this.f4610a.zzl().m3145E()) {
            this.f4610a.m3487C().m3952I(c1185b);
        } else {
            this.f4610a.zzl().m3152y(new RunnableC1186a(this, c1185b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(zzdb zzdbVar) {
        m5104c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z10, long j10) {
        m5104c();
        this.f4610a.m3487C().m3953N(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long j10) {
        m5104c();
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long j10) {
        m5104c();
        C0936w7 m3487C = this.f4610a.m3487C();
        m3487C.zzl().m3152y(new RunnableC0797m8(m3487C, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(final String str, long j10) {
        m5104c();
        final C0936w7 m3487C = this.f4610a.m3487C();
        if (str != null && TextUtils.isEmpty(str)) {
            m3487C.f3198a.zzj().m3919G().m3995a("User ID must be non-empty or null");
        } else {
            m3487C.zzl().m3152y(new Runnable() { // from class: c7.d8
                @Override // java.lang.Runnable
                public final void run() {
                    C0936w7 c0936w7 = C0936w7.this;
                    if (c0936w7.mo3101k().m3702F(str)) {
                        c0936w7.mo3101k().m3700D();
                    }
                }
            });
            m3487C.m3964Y(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(String str, String str2, InterfaceC4307b interfaceC4307b, boolean z10, long j10) {
        m5104c();
        this.f4610a.m3487C().m3964Y(str, str2, BinderC4309d.m16571e(interfaceC4307b), z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        InterfaceC0866r7 remove;
        m5104c();
        synchronized (this.f4611b) {
            remove = this.f4611b.remove(Integer.valueOf(zzdaVar.zza()));
        }
        if (remove == null) {
            remove = new C1184a(zzdaVar);
        }
        this.f4610a.m3487C().m3985t0(remove);
    }
}
