package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzahd;
import com.google.android.gms.internal.p377firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class zzahd<MessageType extends zzahd<MessageType, BuilderType>, BuilderType extends zzahf<MessageType, BuilderType>> implements zzakk {
    public int zza = 0;

    public int zza(zzalc zzalcVar) {
        int zzh = zzh();
        if (zzh != -1) {
            return zzh;
        }
        int zza = zzalcVar.zza(this);
        zzb(zza);
        return zza;
    }

    public final void zza(OutputStream outputStream) {
        zzaii zza = zzaii.zza(outputStream, zzaii.zzd(zzk()));
        zza(zza);
        zza.zzc();
    }

    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public int zzh() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakk
    public final zzahm zzi() {
        try {
            zzahv zzc = zzahm.zzc(zzk());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzk()];
            zzaii zzb = zzaii.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
