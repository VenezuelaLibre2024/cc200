package com.google.android.gms.internal.p377firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzbk implements zzcb {
    private final InputStream zza;

    private zzbk(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzcb zza(byte[] bArr) {
        return new zzbk(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzcb
    public final zzty zza() {
        try {
            return zzty.zza(this.zza, zzaip.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzcb
    public final zzvh zzb() {
        try {
            return zzvh.zza(this.zza, zzaip.zza());
        } finally {
            this.zza.close();
        }
    }
}
