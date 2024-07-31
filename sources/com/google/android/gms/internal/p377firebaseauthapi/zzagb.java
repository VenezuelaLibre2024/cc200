package com.google.android.gms.internal.p377firebaseauthapi;

import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzagb implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzagn zzg = new zzagn();
    private zzagn zzi = new zzagn();

    public final zzagb zza(String str) {
        C2394s.m9613f(str);
        this.zzi.zzb().add(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzagb.zza():java.lang.String");
    }

    public final zzagb zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzagb zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzagb zzd(String str) {
        this.zza = C2394s.m9613f(str);
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final zzagb zze(String str) {
        this.zze = C2394s.m9613f(str);
        return this;
    }

    public final String zze() {
        return this.zzf;
    }

    public final zzagb zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzagb zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzagb zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        C2394s.m9613f(str);
        return this.zzg.zzb().contains(str);
    }
}
