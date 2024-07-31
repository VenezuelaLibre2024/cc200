package p096g6;

import android.util.Log;
import java.util.Map;
import p064e6.C1667b;
import p079f6.C1841a;

/* renamed from: g6.n0 */
/* loaded from: classes.dex */
public final class RunnableC2048n0 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C1667b f8104h;

    /* renamed from: i */
    public final /* synthetic */ C2051o0 f8105i;

    public RunnableC2048n0(C2051o0 c2051o0, C1667b c1667b) {
        this.f8105i = c2051o0;
        this.f8104h = c1667b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C2002b c2002b;
        C1841a.f fVar;
        C1841a.f fVar2;
        C1841a.f fVar3;
        C1841a.f fVar4;
        C2051o0 c2051o0 = this.f8105i;
        map = c2051o0.f8115f.f8029s;
        c2002b = c2051o0.f8111b;
        C2039k0 c2039k0 = (C2039k0) map.get(c2002b);
        if (c2039k0 == null) {
            return;
        }
        if (!this.f8104h.m6681M()) {
            c2039k0.m8183H(this.f8104h, null);
            return;
        }
        this.f8105i.f8114e = true;
        fVar = this.f8105i.f8110a;
        if (fVar.requiresSignIn()) {
            this.f8105i.m8234h();
            return;
        }
        try {
            C2051o0 c2051o02 = this.f8105i;
            fVar3 = c2051o02.f8110a;
            fVar4 = c2051o02.f8110a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f8105i.f8110a;
            fVar2.disconnect("Failed to get service from broker.");
            c2039k0.m8183H(new C1667b(10), null);
        }
    }
}
