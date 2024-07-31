package com.google.android.gms.internal.p377firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzahw extends zzahx {
    public final byte[] zzb;

    public zzahw(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahm) || zzb() != ((zzahm) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzahw)) {
            return obj.equals(this);
        }
        zzahw zzahwVar = (zzahw) obj;
        int zza = zza();
        int zza2 = zzahwVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzahwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final zzahm zza(int i10, int i11) {
        int zza = zzahm.zza(0, i11, zzb());
        return zza == 0 ? zzahm.zza : new zzahq(this.zzb, zzh(), zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final String zza(Charset charset) {
        return new String(this.zzb, zzh(), zzb(), charset);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final void zza(zzahn zzahnVar) {
        zzahnVar.zza(this.zzb, zzh(), zzb());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahx
    public final boolean zza(zzahm zzahmVar, int i10, int i11) {
        if (i11 > zzahmVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zzahmVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zzahmVar.zzb());
        }
        if (!(zzahmVar instanceof zzahw)) {
            return zzahmVar.zza(0, i11).equals(zza(0, i11));
        }
        zzahw zzahwVar = (zzahw) zzahmVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzahwVar.zzb;
        int zzh = zzh() + i11;
        int zzh2 = zzh();
        int zzh3 = zzahwVar.zzh();
        while (zzh2 < zzh) {
            if (bArr[zzh2] != bArr2[zzh3]) {
                return false;
            }
            zzh2++;
            zzh3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final int zzb(int i10, int i11, int i12) {
        return zzajc.zza(i10, this.zzb, zzh(), i12);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final zzaib zzc() {
        return zzaib.zza(this.zzb, zzh(), zzb(), true);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahm
    public final boolean zzf() {
        int zzh = zzh();
        return zzaml.zzc(this.zzb, zzh, zzb() + zzh);
    }

    public int zzh() {
        return 0;
    }
}
