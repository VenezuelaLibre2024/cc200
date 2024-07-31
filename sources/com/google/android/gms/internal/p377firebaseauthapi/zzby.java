package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzux;
import com.google.android.gms.internal.p377firebaseauthapi.zzvh;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzby {
    private final zzvh zza;
    private final List<zzca> zzb;
    private final zzrl zzc = zzrl.zza;

    private zzby(zzvh zzvhVar, List<zzca> list) {
        this.zza = zzvhVar;
        this.zzb = list;
    }

    public static final zzby zza(zzcb zzcbVar, zzbh zzbhVar) {
        byte[] bArr = new byte[0];
        zzty zza = zzcbVar.zza();
        if (zza == null || zza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zza, zzbhVar, bArr));
    }

    public static final zzby zza(zzvh zzvhVar) {
        zzc(zzvhVar);
        return new zzby(zzvhVar, zzb(zzvhVar));
    }

    private static zzot zza(zzvh.zza zzaVar) {
        try {
            return zzot.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzvt.RAW ? null : Integer.valueOf(zzaVar.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzpe("Creating a protokey serialization failed", e10);
        }
    }

    private static zzty zza(zzvh zzvhVar, zzbh zzbhVar, byte[] bArr) {
        byte[] zzb = zzbhVar.zzb(zzvhVar.zzj(), bArr);
        try {
            if (zzvh.zza(zzbhVar.zza(zzb, bArr), zzaip.zza()).equals(zzvhVar)) {
                return (zzty) ((zzaja) zzty.zza().zza(zzahm.zza(zzb)).zza(zzcy.zza(zzvhVar)).zzf());
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzajj unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzvh zza(zzty zztyVar, zzbh zzbhVar, byte[] bArr) {
        try {
            zzvh zza = zzvh.zza(zzbhVar.zza(zztyVar.zzc().zzg(), bArr), zzaip.zza());
            zzc(zza);
            return zza;
        } catch (zzajj unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static <B> B zza(zzmm zzmmVar, zzbu zzbuVar, Class<B> cls) {
        try {
            return (B) zzmmVar.zza(zzbuVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B zza(zzmm zzmmVar, zzvh.zza zzaVar, Class<B> cls) {
        try {
            return (B) zzmmVar.zza(zzaVar.zzb(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List<zzca> zzb(zzvh zzvhVar) {
        zzbw zzbwVar;
        ArrayList arrayList = new ArrayList(zzvhVar.zza());
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            int zza = zzaVar.zza();
            try {
                zzbu zza2 = zznv.zza().zza(zza(zzaVar), zzct.zza());
                int i10 = zzbx.zza[zzaVar.zzc().ordinal()];
                if (i10 == 1) {
                    zzbwVar = zzbw.zza;
                } else if (i10 == 2) {
                    zzbwVar = zzbw.zzb;
                } else {
                    if (i10 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                        break;
                    }
                    zzbwVar = zzbw.zzc;
                }
                arrayList.add(new zzca(zza2, zzbwVar, zza, zza == zzvhVar.zzb()));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzc(zzvh zzvhVar) {
        if (zzvhVar == null || zzvhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcy.zza(this.zza).toString();
    }

    public final zzby zza() {
        if (this.zza == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzvh.zzb zzc = zzvh.zzc();
        for (zzvh.zza zzaVar : this.zza.zze()) {
            zzux zzb = zzaVar.zzb();
            if (zzb.zzb() != zzux.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            zzc.zza((zzvh.zza) ((zzaja) zzaVar.zzm().zza(zzcu.zza(zzb.zzf(), zzb.zze())).zzf()));
        }
        zzc.zza(this.zza.zzb());
        return zza((zzvh) ((zzaja) zzc.zzf()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P zza(Class<P> cls) {
        zzox zza = zzox.zza();
        if (!(zza instanceof zzmm)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        Class<?> zza2 = zza.zza(cls);
        if (zza2 == null) {
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        zzcy.zzb(this.zza);
        zzck zzckVar = new zzck(zza2);
        zzckVar.zza(this.zzc);
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            zzvh.zza zza3 = this.zza.zza(i10);
            if (zza3.zzc().equals(zzvb.ENABLED)) {
                Object zza4 = zza(zza, zza3, zza2);
                Object zza5 = this.zzb.get(i10) != null ? zza(zza, this.zzb.get(i10).zza(), zza2) : null;
                if (zza5 == null && zza4 == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(zza2) + " for key of type " + zza3.zzb().zzf());
                }
                if (zza3.zza() == this.zza.zzb()) {
                    zzckVar.zzb(zza5, zza4, zza3);
                } else {
                    zzckVar.zza(zza5, zza4, zza3);
                }
            }
        }
        return (P) zza.zza(zzckVar.zza(), cls);
    }

    public final void zza(zzce zzceVar) {
        for (zzvh.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzux.zzb.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzux.zzb.SYMMETRIC || zzaVar.zzb().zzb() == zzux.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzaVar.zzb().zzb().name(), zzaVar.zzb().zzf()));
            }
        }
        zzceVar.zza(this.zza);
    }

    public final void zza(zzce zzceVar, zzbh zzbhVar) {
        zzceVar.zza(zza(this.zza, zzbhVar, new byte[0]));
    }

    public final zzvh zzb() {
        return this.zza;
    }

    public final zzvi zzc() {
        return zzcy.zza(this.zza);
    }
}
