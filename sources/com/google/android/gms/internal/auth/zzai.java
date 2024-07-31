package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;

/* loaded from: classes.dex */
final class zzai implements InterfaceC1853m {
    private static final Account zza = new Account("DUMMY_NAME", "com.google");
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.zzb;
    }
}
