package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzog extends zzit implements zzkf {
    private static final zzog zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zzit.zzD(zzog.class, zzogVar);
    }

    private zzog() {
    }

    public static /* synthetic */ void zzJ(zzog zzogVar, String str) {
        str.getClass();
        zzogVar.zzd |= 1;
        zzogVar.zze = str;
    }

    public static zzof zzf() {
        return (zzof) zzb.zzp();
    }

    public static zzog zzi(byte[] bArr) {
        return (zzog) zzit.zzu(zzb, bArr);
    }

    public final String zzH() {
        return this.zzf;
    }

    public final String zzI() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzog();
        }
        if (i11 == 4) {
            return new zzof(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zze;
    }
}
