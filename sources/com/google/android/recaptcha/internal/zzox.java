package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzox extends zzit implements zzkf {
    private static final zzox zzb;
    private int zzd;

    static {
        zzox zzoxVar = new zzox();
        zzb = zzoxVar;
        zzit.zzD(zzox.class, zzoxVar);
    }

    private zzox() {
    }

    public static zzox zzg(byte[] bArr) {
        return (zzox) zzit.zzu(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzox();
        }
        if (i11 == 4) {
            return new zzow(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzpb zzi() {
        zzpb zzb2 = zzpb.zzb(this.zzd);
        return zzb2 == null ? zzpb.UNRECOGNIZED : zzb2;
    }
}
