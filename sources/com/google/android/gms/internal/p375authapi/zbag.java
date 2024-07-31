package com.google.android.gms.internal.p375authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p125i6.C2605e;
import p335x5.C5605f;
import p335x5.C5606g;
import p335x5.C5607h;
import p335x5.C5616q;

/* loaded from: classes.dex */
public final class zbag extends AbstractC1845e {
    private static final C1841a.g zba;
    private static final C1841a.a zbb;
    private static final C1841a zbc;
    private final String zbd;

    static {
        C1841a.g gVar = new C1841a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new C1841a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(Activity activity, C5616q c5616q) {
        super(activity, (C1841a<C5616q>) zbc, c5616q, AbstractC1845e.a.f7033c);
        this.zbd = zbat.zba();
    }

    public zbag(Context context, C5616q c5616q) {
        super(context, (C1841a<C5616q>) zbc, c5616q, AbstractC1845e.a.f7033c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) C2605e.m10492b(intent, "status", Status.CREATOR)) == null) ? Status.f4472o : status;
    }

    public final Task<C5605f> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C2394s.m9619l(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.C1160a m4910N = SaveAccountLinkingTokenRequest.m4910N(saveAccountLinkingTokenRequest);
        m4910N.m4920f(this.zbd);
        final SaveAccountLinkingTokenRequest m4915a = m4910N.m4915a();
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zbg).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbc(new zbae(zbag.this, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) C2394s.m9619l(m4915a));
            }
        }).m8273c(false).m8275e(1535).m8271a());
    }

    public final Task<C5607h> savePassword(C5606g c5606g) {
        C2394s.m9619l(c5606g);
        C5606g.a m22590K = C5606g.m22590K(c5606g);
        m22590K.m22594c(this.zbd);
        final C5606g m22592a = m22590K.m22592a();
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zbe).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zbn) ((zbh) obj).getService()).zbd(new zbaf(zbag.this, (TaskCompletionSource) obj2), (C5606g) C2394s.m9619l(m22592a));
            }
        }).m8273c(false).m8275e(1536).m8271a());
    }
}
