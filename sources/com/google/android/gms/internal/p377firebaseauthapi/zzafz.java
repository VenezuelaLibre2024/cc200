package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzafz implements zzacr {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final boolean zzh;
    private zzaed zzi;

    public zzafz(String str, long j10, boolean z10, String str2, String str3, String str4, String str5, boolean z11) {
        this.zza = C2394s.m9613f(str);
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = z11;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzaed zzaedVar = this.zzi;
        if (zzaedVar != null) {
            jSONObject.put("autoRetrievalInfo", zzaedVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaed zzaedVar) {
        this.zzi = zzaedVar;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzh;
    }
}
