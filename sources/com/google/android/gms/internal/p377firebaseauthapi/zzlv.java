package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
public final class zzlv {
    private final zzbh zza;
    private final zzbq zzb;

    public zzlv(zzbh zzbhVar) {
        this.zza = zzbhVar;
        this.zzb = null;
    }

    public zzlv(zzbq zzbqVar) {
        this.zza = null;
        this.zzb = zzbqVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzbh zzbhVar = this.zza;
        return zzbhVar != null ? zzbhVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
