package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzno extends zzit implements zzkf {
    private static final zzno zzb;
    private int zzd;
    private zzib zze;
    private zzlj zzf;
    private zzib zzg;
    private zzlj zzh;

    static {
        zzno zznoVar = new zzno();
        zzb = zznoVar;
        zzit.zzD(zzno.class, zznoVar);
    }

    private zzno() {
    }

    public static /* synthetic */ void zzH(zzno zznoVar, zzib zzibVar) {
        zzibVar.getClass();
        zznoVar.zzg = zzibVar;
        zznoVar.zzd |= 4;
    }

    public static zznn zzf() {
        return (zznn) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzno zznoVar, zzib zzibVar) {
        zzibVar.getClass();
        zznoVar.zze = zzibVar;
        zznoVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzno zznoVar, zzlj zzljVar) {
        zzljVar.getClass();
        zznoVar.zzh = zzljVar;
        zznoVar.zzd |= 8;
    }

    public static /* synthetic */ void zzk(zzno zznoVar, zzlj zzljVar) {
        zzljVar.getClass();
        zznoVar.zzf = zzljVar;
        zznoVar.zzd |= 2;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzno();
        }
        if (i11 == 4) {
            return new zznn(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
