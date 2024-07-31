package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzid {
    private final zzio zza;
    private final byte[] zzb;

    private zzid(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzio.zzb(bArr);
    }

    public final zzhu zza() {
        this.zza.zzb();
        return new zzie(this.zzb);
    }

    public final zzio zzb() {
        return this.zza;
    }
}
