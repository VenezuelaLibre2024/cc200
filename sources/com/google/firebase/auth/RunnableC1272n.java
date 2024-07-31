package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;
import p067e9.C1761b;
import p337x7.InterfaceC5653a;

/* renamed from: com.google.firebase.auth.n */
/* loaded from: classes.dex */
public final class RunnableC1272n implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ FirebaseAuth f4815h;

    /* renamed from: i */
    public final /* synthetic */ C1761b f4816i;

    public RunnableC1272n(FirebaseAuth firebaseAuth, C1761b c1761b) {
        this.f4815h = firebaseAuth;
        this.f4816i = c1761b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f4815h.f4732c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5653a) it.next()).m22713a(this.f4816i);
        }
        list2 = this.f4815h.f4731b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.InterfaceC1256b) it2.next()).mo5268a(this.f4815h);
        }
    }
}
