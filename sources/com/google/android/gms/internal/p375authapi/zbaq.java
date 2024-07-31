package com.google.android.gms.internal.p375authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import p079f6.AbstractC1845e;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.C1842b;
import p096g6.AbstractC2071v;
import p096g6.C2018f;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p125i6.C2605e;
import p335x5.C5598b;
import p335x5.C5600c;
import p335x5.C5601c0;
import p335x5.C5602d;
import p335x5.C5604e;
import p335x5.C5608i;

/* loaded from: classes.dex */
public final class zbaq extends AbstractC1845e {
    private static final C1841a.g zba;
    private static final C1841a.a zbb;
    private static final C1841a zbc;
    private final String zbd;

    static {
        C1841a.g gVar = new C1841a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new C1841a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(Activity activity, C5601c0 c5601c0) {
        super(activity, (C1841a<C5601c0>) zbc, c5601c0, AbstractC1845e.a.f7033c);
        this.zbd = zbat.zba();
    }

    public zbaq(Context context, C5601c0 c5601c0) {
        super(context, (C1841a<C5601c0>) zbc, c5601c0, AbstractC1845e.a.f7033c);
        this.zbd = zbat.zba();
    }

    public final Task<C5600c> beginSignIn(C5598b c5598b) {
        C2394s.m9619l(c5598b);
        C5598b.a m22535O = C5598b.m22535O(c5598b);
        m22535O.m22547g(this.zbd);
        final C5598b m22541a = m22535O.m22541a();
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zba).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbc(new zbam(zbaq.this, (TaskCompletionSource) obj2), (C5598b) C2394s.m9619l(m22541a));
            }
        }).m8273c(false).m8275e(1553).m8271a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C1842b(Status.f4472o);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final C5602d c5602d) {
        C2394s.m9619l(c5602d);
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zbh).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zba(c5602d, (zbar) obj, (TaskCompletionSource) obj2);
            }
        }).m8275e(1653).m8271a());
    }

    public final C5608i getSignInCredentialFromIntent(Intent intent) {
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
        C5608i c5608i = (C5608i) C2605e.m10492b(intent, "sign_in_credential", C5608i.CREATOR);
        if (c5608i != null) {
            return c5608i;
        }
        throw new C1842b(Status.f4472o);
    }

    public final Task<PendingIntent> getSignInIntent(C5604e c5604e) {
        C2394s.m9619l(c5604e);
        C5604e.a m22576N = C5604e.m22576N(c5604e);
        m22576N.m22586f(this.zbd);
        final C5604e m22581a = m22576N.m22581a();
        return doRead(AbstractC2071v.m8266a().m8274d(zbas.zbf).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                ((zbw) ((zbar) obj).getService()).zbe(new zbao(zbaq.this, (TaskCompletionSource) obj2), (C5604e) C2394s.m9619l(m22581a));
            }
        }).m8275e(1555).m8271a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<AbstractC1846f> it = AbstractC1846f.m7587c().iterator();
        while (it.hasNext()) {
            it.next().m7593g();
        }
        C2018f.m8114a();
        return doWrite(AbstractC2071v.m8266a().m8274d(zbas.zbb).m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        }).m8273c(false).m8275e(1554).m8271a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(C5602d c5602d, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), c5602d, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }
}
