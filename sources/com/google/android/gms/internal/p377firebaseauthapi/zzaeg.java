package com.google.android.gms.internal.p377firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaeg extends zzaft {
    private final String zza;
    private final String zzb;

    public zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaft) {
            zzaft zzaftVar = (zzaft) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaftVar.zzb()) : zzaftVar.zzb() == null) {
                String str2 = this.zzb;
                String zza = zzaftVar.zza();
                if (str2 != null ? str2.equals(zza) : zza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaft
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaft
    public final String zzb() {
        return this.zza;
    }
}
