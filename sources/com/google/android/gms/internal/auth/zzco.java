package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import p345y.C5786e;

/* loaded from: classes.dex */
public final class zzco implements zzcl {
    private static zzco zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzco() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzco(Context context) {
        this.zzb = context;
        zzcn zzcnVar = new zzcn(this, null);
        this.zzc = zzcnVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcnVar);
    }

    public static zzco zza(Context context) {
        zzco zzcoVar;
        synchronized (zzco.class) {
            if (zza == null) {
                zza = C5786e.m23095b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzco(context) : new zzco();
            }
            zzcoVar = zza;
        }
        return zzcoVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzco.class) {
            zzco zzcoVar = zza;
            if (zzcoVar != null && (context = zzcoVar.zzb) != null && zzcoVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    /* renamed from: zzc */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzcc.zza(context)) {
            try {
                return (String) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzcm
                    public final /* synthetic */ String zzb;

                    public /* synthetic */ zzcm(String str2) {
                        r2 = str2;
                    }

                    @Override // com.google.android.gms.internal.auth.zzck
                    public final Object zza() {
                        return zzco.this.zzd(r2);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str2)), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, null);
    }
}
