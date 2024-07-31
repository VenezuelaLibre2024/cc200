package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.f */
/* loaded from: classes.dex */
public final class RunnableC1264f implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ FirebaseAuth.InterfaceC1256b f4789h;

    /* renamed from: i */
    public final /* synthetic */ FirebaseAuth f4790i;

    public RunnableC1264f(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC1256b interfaceC1256b) {
        this.f4789h = interfaceC1256b;
        this.f4790i = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4789h.mo5268a(this.f4790i);
    }
}
