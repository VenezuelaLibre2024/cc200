package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzbv implements InterfaceC1853m {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) C2394s.m9619l(status);
        this.zzb = "";
    }

    public zzbv(String str) {
        this.zzb = (String) C2394s.m9619l(str);
        this.zza = Status.f4470m;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.zza;
    }
}
