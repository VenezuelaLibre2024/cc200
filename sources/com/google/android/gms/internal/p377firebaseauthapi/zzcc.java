package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzvh;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzcc {
    private final zzvh.zzb zza;

    private zzcc(zzvh.zzb zzbVar) {
        this.zza = zzbVar;
    }

    private final synchronized int zza(zzvd zzvdVar, boolean z10) {
        zzvh.zza zza;
        zza = zza(zzvdVar);
        this.zza.zza(zza);
        return zza.zza();
    }

    public static zzcc zza(zzby zzbyVar) {
        return new zzcc(zzbyVar.zzb().zzm());
    }

    private final synchronized zzvh.zza zza(zzux zzuxVar, zzvt zzvtVar) {
        int zzc;
        zzc = zzc();
        if (zzvtVar == zzvt.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzvh.zza) ((zzaja) zzvh.zza.zzd().zza(zzuxVar).zza(zzc).zza(zzvb.ENABLED).zza(zzvtVar).zzf());
    }

    private final synchronized zzvh.zza zza(zzvd zzvdVar) {
        return zza(zzcu.zza(zzvdVar), zzvdVar.zzd());
    }

    public static zzcc zzb() {
        return new zzcc(zzvh.zzc());
    }

    private final synchronized boolean zzb(int i10) {
        boolean z10;
        Iterator<zzvh.zza> it = this.zza.zzb().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (it.next().zza() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private final synchronized int zzc() {
        int zza;
        do {
            zza = zzpg.zza();
        } while (zzb(zza));
        return zza;
    }

    public final synchronized zzby zza() {
        return zzby.zza((zzvh) ((zzaja) this.zza.zzf()));
    }

    public final synchronized zzcc zza(int i10) {
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zzvh.zza zzb = this.zza.zzb(i11);
            if (zzb.zza() == i10) {
                if (!zzb.zzc().equals(zzvb.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.zza.zza(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    public final synchronized zzcc zza(zzbv zzbvVar) {
        zza(zzbvVar.zza(), false);
        return this;
    }
}
