package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import p038ce.C1063k;
import p038ce.InterfaceC1085p0;
import p115hd.C2510v;

/* loaded from: classes.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final InterfaceC1085p0 zzd;
    private final zzaz zze;

    public zzbm(Context context, zzbn zzbnVar, InterfaceC1085p0 interfaceC1085p0) {
        zzaz zzazVar;
        this.zzc = zzbnVar;
        this.zzd = interfaceC1085p0;
        zzax zzaxVar = zzaz.zza;
        zzaz zzazVar2 = null;
        try {
            zzazVar = zzaz.zzc;
            zzazVar = zzazVar == null ? new zzaz(context, null) : zzazVar;
            zzaz.zzc = zzazVar;
            zzazVar2 = zzazVar;
        } catch (Exception unused) {
        }
        this.zze = zzazVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzaz zzazVar;
        zzpd zzk;
        int zzJ;
        int i10;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            for (List<zzba> list : C2510v.m10013P(zzazVar2.zzd(), 20, 20, true)) {
                zznh zzi = zzni.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzba zzbaVar : list) {
                    try {
                        zzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        zzJ = zzk.zzJ();
                        i10 = zzJ - 1;
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                    if (zzJ == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        zzi.zzp(zzk.zzf());
                    } else if (i10 == 1) {
                        zzi.zzq(zzk.zzg());
                    }
                    arrayList.add(zzbaVar);
                }
                if (zzi.zzd() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzni) zzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(zzpd zzpdVar) {
        C1063k.m4457d(this.zzd, null, null, new zzbl(this, zzpdVar, null), 3, null);
        zzh();
    }
}
