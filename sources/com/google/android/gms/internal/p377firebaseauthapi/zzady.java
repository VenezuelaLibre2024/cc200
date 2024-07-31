package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;
import p079f6.C1844d;
import p154k6.C3363a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzady extends zzacf {
    private final String zza;
    private final /* synthetic */ zzadt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzady(zzadt zzadtVar, zzacf zzacfVar, String str) {
        super(zzacfVar);
        this.zzb = zzadtVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacf
    public final void zza(Status status) {
        C3363a c3363a;
        HashMap hashMap;
        c3363a = zzadt.zza;
        c3363a.m12508c("SMS verification code request failed: " + C1844d.m7583a(status.m4987J()) + " " + status.m4988K(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzaea zzaeaVar = (zzaea) hashMap.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacf
    public final void zzb(String str) {
        C3363a c3363a;
        HashMap hashMap;
        c3363a = zzadt.zza;
        c3363a.m12506a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzaea zzaeaVar = (zzaea) hashMap.get(this.zza);
        if (zzaeaVar == null) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaeaVar.zzg = true;
        zzaeaVar.zzd = str;
        if (zzaeaVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaeaVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzah.zzc(zzaeaVar.zze)) {
                return;
            }
            zzadt.zza(this.zzb, this.zza);
        }
    }
}
