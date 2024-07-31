package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import p345y.C5786e;

/* loaded from: classes.dex */
public final class zzgo implements zzgj {
    private static zzgo zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgo() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzgo(Context context) {
        this.zzb = context;
        zzgq zzgqVar = new zzgq(this, null);
        this.zzc = zzgqVar;
        context.getContentResolver().registerContentObserver(zzfu.zza, true, zzgqVar);
    }

    public static zzgo zza(Context context) {
        zzgo zzgoVar;
        synchronized (zzgo.class) {
            if (zza == null) {
                zza = C5786e.m23095b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgo(context) : new zzgo();
            }
            zzgoVar = zza;
        }
        return zzgoVar;
    }

    public static synchronized void zza() {
        Context context;
        synchronized (zzgo.class) {
            zzgo zzgoVar = zza;
            if (zzgoVar != null && (context = zzgoVar.zzb) != null && zzgoVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgj
    /* renamed from: zzc */
    public final String zza(String str) {
        Context context = this.zzb;
        if (context != null && !zzge.zza(context)) {
            try {
                return (String) zzgm.zza(new zzgl() { // from class: com.google.android.gms.internal.measurement.zzgn
                    private /* synthetic */ String zzb;

                    public /* synthetic */ zzgn(String str2) {
                        r2 = str2;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzgl
                    public final Object zza() {
                        return zzgo.this.zzb(r2);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str2, e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzb(String str) {
        return zzfr.zza(this.zzb.getContentResolver(), str, null);
    }
}
