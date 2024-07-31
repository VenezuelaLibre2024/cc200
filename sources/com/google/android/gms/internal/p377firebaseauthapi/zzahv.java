package com.google.android.gms.internal.p377firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahv {
    private final zzaii zza;
    private final byte[] zzb;

    private zzahv(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzaii.zzb(bArr);
    }

    public final zzahm zza() {
        this.zza.zzb();
        return new zzahw(this.zzb);
    }

    public final zzaii zzb() {
        return this.zza;
    }
}
