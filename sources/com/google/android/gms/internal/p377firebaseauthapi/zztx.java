package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
public enum zztx implements zzajf {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private static final zzaje<zztx> zzg = new zzaje<zztx>() { // from class: com.google.android.gms.internal.firebase-auth-api.zztz
    };
    private final int zzi;

    zztx(int i10) {
        this.zzi = i10;
    }

    public static zztx zza(int i10) {
        if (i10 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i10 == 2) {
            return NIST_P256;
        }
        if (i10 == 3) {
            return NIST_P384;
        }
        if (i10 == 4) {
            return NIST_P521;
        }
        if (i10 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zztx.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajf
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
