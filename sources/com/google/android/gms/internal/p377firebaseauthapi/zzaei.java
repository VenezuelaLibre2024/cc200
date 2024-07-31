package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaei extends zzafx {
    private String zza;
    private String zzb;
    private String zzc;
    private zzaex zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafx zza(zzaex zzaexVar) {
        Objects.requireNonNull(zzaexVar, "Null tokenType");
        this.zzd = zzaexVar;
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafx zza(String str) {
        Objects.requireNonNull(str, "Null idToken");
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafy zza() {
        String str;
        zzaex zzaexVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzaexVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzaef(str3, this.zzb, str, zzaexVar, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb2));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafx zzb(String str) {
        Objects.requireNonNull(str, "Null providerId");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafx zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzafx
    public final zzafx zzd(String str) {
        Objects.requireNonNull(str, "Null token");
        this.zzc = str;
        return this;
    }
}
