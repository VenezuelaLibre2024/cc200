package com.google.android.gms.internal.p377firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.C1260b;
import java.util.Map;
import java.util.concurrent.Executor;
import p207o6.C3938g;
import p285u.C4771a;

/* loaded from: classes.dex */
public final class zzads {
    private static final Map<String, zzadu> zza = new C4771a();

    public static C1260b.b zza(String str, C1260b.b bVar, zzacw zzacwVar) {
        zza(str, zzacwVar);
        return new zzadr(bVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzacw zzacwVar) {
        zza.put(str, new zzadu(zzacwVar, C3938g.m14938d().mo14932a()));
    }

    public static boolean zza(String str, C1260b.b bVar, Activity activity, Executor executor) {
        Map<String, zzadu> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzadu zzaduVar = map.get(str);
        if (C3938g.m14938d().mo14932a() - zzaduVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzacw zzacwVar = zzaduVar.zza;
        if (zzacwVar == null) {
            return true;
        }
        zzacwVar.zza(bVar, activity, executor, str);
        return true;
    }
}
