package com.google.firebase.auth;

import com.google.firebase.auth.C1260b;
import p108h6.C2394s;
import p195n7.C3773m;
import p321w7.C5394o0;
import p337x7.C5673f;

/* renamed from: com.google.firebase.auth.g */
/* loaded from: classes.dex */
public final class C1265g extends C1260b.b {

    /* renamed from: a */
    public final /* synthetic */ C1260b.b f4791a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f4792b;

    public C1265g(FirebaseAuth firebaseAuth, C1260b.b bVar) {
        this.f4791a = bVar;
        this.f4792b = firebaseAuth;
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onCodeSent(String str, C1260b.a aVar) {
        C5673f c5673f;
        C1260b.b bVar = this.f4791a;
        c5673f = this.f4792b.f4736g;
        bVar.onVerificationCompleted(C1260b.m5291a(str, (String) C2394s.m9619l(c5673f.m22750e())));
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationCompleted(C5394o0 c5394o0) {
        this.f4791a.onVerificationCompleted(c5394o0);
    }

    @Override // com.google.firebase.auth.C1260b.b
    public final void onVerificationFailed(C3773m c3773m) {
        this.f4791a.onVerificationFailed(c3773m);
    }
}
