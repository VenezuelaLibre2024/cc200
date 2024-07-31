package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.l */
/* loaded from: classes.dex */
public final class RunnableC1270l implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ FirebaseAuth.InterfaceC1255a f4812h;

    /* renamed from: i */
    public final /* synthetic */ FirebaseAuth f4813i;

    public RunnableC1270l(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC1255a interfaceC1255a) {
        this.f4812h = interfaceC1255a;
        this.f4813i = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4812h.mo5267a(this.f4813i);
    }
}
