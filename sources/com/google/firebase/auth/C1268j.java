package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.firebase.auth.C1260b;
import p195n7.C3773m;
import p321w7.C5394o0;

/* renamed from: com.google.firebase.auth.j */
/* loaded from: classes.dex */
public final class C1268j extends C1260b.b {

    /* renamed from: a */
    public final /* synthetic */ C1259a f4806a;

    /* renamed from: b */
    public final /* synthetic */ C1260b.b f4807b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f4808c;

    public C1268j(FirebaseAuth firebaseAuth, C1259a c1259a, C1260b.b bVar) {
        this.f4806a = c1259a;
        this.f4807b = bVar;
        this.f4808c = firebaseAuth;
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f4807b.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeSent(String str, C1260b.a aVar) {
        this.f4807b.onCodeSent(str, aVar);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationCompleted(C5394o0 c5394o0) {
        this.f4807b.onVerificationCompleted(c5394o0);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationFailed(C3773m c3773m) {
        if (zzach.zza(c3773m)) {
            this.f4806a.m5271b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.f4806a.m5278i());
            FirebaseAuth.m5188f0(this.f4806a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f4806a.m5278i() + ", error - " + c3773m.getMessage());
        this.f4807b.onVerificationFailed(c3773m);
    }
}
