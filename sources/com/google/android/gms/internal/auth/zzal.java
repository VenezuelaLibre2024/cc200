package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.InterfaceC1853m;
import p291u5.C4893a;
import p291u5.InterfaceC4894b;

/* loaded from: classes.dex */
public final class zzal implements InterfaceC4894b {
    private static final Status zza = new Status(13);

    public final AbstractC1848h<Object> addWorkAccount(AbstractC1846f abstractC1846f, String str) {
        return abstractC1846f.mo7589b(new zzae(this, C4893a.f18505a, abstractC1846f, str));
    }

    public final AbstractC1848h<InterfaceC1853m> removeWorkAccount(AbstractC1846f abstractC1846f, Account account) {
        return abstractC1846f.mo7589b(new zzag(this, C4893a.f18505a, abstractC1846f, account));
    }

    public final void setWorkAuthenticatorEnabled(AbstractC1846f abstractC1846f, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(abstractC1846f, z10);
    }

    public final AbstractC1848h<InterfaceC1853m> setWorkAuthenticatorEnabledWithResult(AbstractC1846f abstractC1846f, boolean z10) {
        return abstractC1846f.mo7589b(new zzac(this, C4893a.f18505a, abstractC1846f, z10));
    }
}
