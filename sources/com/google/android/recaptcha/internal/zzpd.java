package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpd extends zzit implements zzkf {
    private static final zzpd zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzpd zzpdVar = new zzpd();
        zzb = zzpdVar;
        zzit.zzD(zzpd.class, zzpdVar);
    }

    private zzpd() {
    }

    public static /* synthetic */ void zzH(zzpd zzpdVar, zznf zznfVar) {
        zznfVar.getClass();
        zzpdVar.zze = zznfVar;
        zzpdVar.zzd = 1;
    }

    public static /* synthetic */ void zzI(zzpd zzpdVar, zznu zznuVar) {
        zznuVar.getClass();
        zzpdVar.zze = zznuVar;
        zzpdVar.zzd = 2;
    }

    public static zzpc zzi() {
        return (zzpc) zzb.zzp();
    }

    public static zzpd zzk(byte[] bArr) {
        return (zzpd) zzit.zzu(zzb, bArr);
    }

    public final int zzJ() {
        int i10 = this.zzd;
        if (i10 == 0) {
            return 3;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    public final zznf zzf() {
        return this.zzd == 1 ? (zznf) this.zze : zznf.zzH();
    }

    public final zznu zzg() {
        return this.zzd == 2 ? (zznu) this.zze : zznu.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zznf.class, zznu.class});
        }
        if (i11 == 3) {
            return new zzpd();
        }
        zzor zzorVar = null;
        if (i11 == 4) {
            return new zzpc(zzorVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
