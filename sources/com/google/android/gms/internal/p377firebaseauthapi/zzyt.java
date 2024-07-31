package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import p321w7.C5428z1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyt implements zzadm<zzafc> {
    private final /* synthetic */ zzadj zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ C5428z1 zze;
    private final /* synthetic */ zzacf zzf;
    private final /* synthetic */ zzafm zzg;

    public zzyt(zzyl zzylVar, zzadj zzadjVar, String str, String str2, Boolean bool, C5428z1 c5428z1, zzacf zzacfVar, zzafm zzafmVar) {
        this.zza = zzadjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = c5428z1;
        this.zzf = zzacfVar;
        this.zzg = zzafmVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafc zzafcVar) {
        zzafr zzafrVar;
        List<zzafb> zza = zzafcVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean z10 = false;
        zzafb zzafbVar = zza.get(0);
        zzafu zzf = zzafbVar.zzf();
        List<zzafr> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzafrVar = zza2.get(0);
            } else {
                for (int i10 = 0; i10 < zza2.size(); i10++) {
                    if (zza2.get(i10).zzf().equals(this.zzb)) {
                        zzafrVar = zza2.get(i10);
                    }
                }
            }
            zzafrVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else if (zzafbVar.zzb() - zzafbVar.zza() < 1000) {
            z10 = true;
        }
        zzafbVar.zza(z10);
        zzafbVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzafbVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
