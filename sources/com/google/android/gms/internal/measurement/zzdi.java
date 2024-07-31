package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdf;
import p034c7.C0683e6;
import p108h6.C2394s;
import p252r6.BinderC4309d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdi extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdfVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdfVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzcu zzcuVar;
        zzcu zzcuVar2;
        String str4;
        String str5;
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str6 = this.zzd;
                String str7 = this.zzc;
                str5 = this.zzg.zzc;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C2394s.m9619l(this.zze);
            zzdf zzdfVar = this.zzg;
            zzdfVar.zzj = zzdfVar.zza(this.zze, true);
            zzcuVar = this.zzg.zzj;
            if (zzcuVar == null) {
                str4 = this.zzg.zzc;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m4994a = DynamiteModule.m4994a(this.zze, ModuleDescriptor.MODULE_ID);
            zzdd zzddVar = new zzdd(84002L, Math.max(m4994a, r0), DynamiteModule.m4995c(this.zze, ModuleDescriptor.MODULE_ID) < m4994a, str, str2, str3, this.zzf, C0683e6.m3161a(this.zze));
            zzcuVar2 = this.zzg.zzj;
            ((zzcu) C2394s.m9619l(zzcuVar2)).initialize(BinderC4309d.m16572g(this.zze), zzddVar, this.zza);
        } catch (Exception e10) {
            this.zzg.zza(e10, true, false);
        }
    }
}
