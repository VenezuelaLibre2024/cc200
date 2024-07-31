package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;
import p366z5.C5993c;

/* loaded from: classes.dex */
final class zzbu implements InterfaceC1853m {
    private final Status zza;
    private C5993c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public zzbu(C5993c c5993c) {
        this.zzb = c5993c;
        this.zza = Status.f4470m;
    }

    public final C5993c getResponse() {
        return this.zzb;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.zza;
    }
}
