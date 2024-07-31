package com.google.android.gms.internal.p375authapi;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p079f6.C1842b;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p125i6.C2605e;
import p335x5.C5596a;
import p335x5.C5611l;

/* loaded from: classes.dex */
public final class zbaa extends AbstractC1845e {
    private static final C1841a.g zba;
    private static final C1841a.a zbb;
    private static final C1841a zbc;

    static {
        C1841a.g gVar = new C1841a.g();
        zba = gVar;
        zby zbyVar = new zby();
        zbb = zbyVar;
        zbc = new C1841a("Auth.Api.Identity.Authorization.API", zbyVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaa(android.app.Activity r3, p335x5.C5611l r4) {
        /*
            r2 = this;
            f6.a r0 = com.google.android.gms.internal.p375authapi.zbaa.zbc
            x5.k r4 = p335x5.C5610k.m22608c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p375authapi.zbat.zba()
            r4.m22609a(r1)
            x5.l r4 = r4.m22610b()
            f6.e$a r1 = p079f6.AbstractC1845e.a.f7033c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p375authapi.zbaa.<init>(android.app.Activity, x5.l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaa(android.content.Context r3, p335x5.C5611l r4) {
        /*
            r2 = this;
            f6.a r0 = com.google.android.gms.internal.p375authapi.zbaa.zbc
            x5.k r4 = p335x5.C5610k.m22608c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p375authapi.zbat.zba()
            r4.m22609a(r1)
            x5.l r4 = r4.m22610b()
            f6.e$a r1 = p079f6.AbstractC1845e.a.f7033c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p375authapi.zbaa.<init>(android.content.Context, x5.l):void");
    }

    public final Task<C5596a> authorize(AuthorizationRequest authorizationRequest) {
        C2394s.m9619l(authorizationRequest);
        AuthorizationRequest.C1159a m4894O = AuthorizationRequest.m4894O(authorizationRequest);
        m4894O.m4907g(((C5611l) getApiOptions()).m22612b());
        final AuthorizationRequest m4901a = m4894O.m4901a();
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zbc).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zbk) ((zbg) obj).getService()).zbc(new zbz(zbaa.this, (TaskCompletionSource) obj2), (AuthorizationRequest) C2394s.m9619l(m4901a));
            }
        }).m8273c(false).m8275e(1534).m8271a());
    }

    public final C5596a getAuthorizationResultFromIntent(Intent intent) {
        if (intent == null) {
            throw new C1842b(Status.f4472o);
        }
        Status status = (Status) C2605e.m10492b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C1842b(Status.f4474q);
        }
        if (!status.m4991N()) {
            throw new C1842b(status);
        }
        C5596a c5596a = (C5596a) C2605e.m10492b(intent, "authorization_result", C5596a.CREATOR);
        if (c5596a != null) {
            return c5596a;
        }
        throw new C1842b(Status.f4472o);
    }
}
