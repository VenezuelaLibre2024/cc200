package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzmx extends zzit implements zzkf {
    private static final zzmx zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzmx zzmxVar = new zzmx();
        zzb = zzmxVar;
        zzit.zzD(zzmx.class, zzmxVar);
    }

    private zzmx() {
    }

    @Override // com.google.android.recaptcha.internal.zzit
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzmx();
        }
        zzmv zzmvVar = null;
        if (i11 == 4) {
            return new zzmw(zzmvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
