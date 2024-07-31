package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.auth.m */
/* loaded from: classes.dex */
public final class RunnableC1271m implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ FirebaseAuth f4814h;

    public RunnableC1271m(FirebaseAuth firebaseAuth) {
        this.f4814h = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.f4814h.f4733d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.InterfaceC1255a) it.next()).mo5267a(this.f4814h);
        }
    }
}
