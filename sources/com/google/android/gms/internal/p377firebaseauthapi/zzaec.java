package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p195n7.C3767g;
import p285u.C4771a;

/* loaded from: classes.dex */
public final class zzaec {
    private static final Map<String, zzaeb> zza = new C4771a();
    private static final Map<String, List<WeakReference<zzaee>>> zzb = new C4771a();

    public static String zza(String str) {
        zzaeb zzaebVar;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":")) + "emulator/auth/handler";
    }

    private static String zza(String str, int i10, boolean z10) {
        StringBuilder sb2;
        String str2;
        if (z10) {
            sb2 = new StringBuilder("http://[");
            sb2.append(str);
            str2 = "]:";
        } else {
            sb2 = new StringBuilder("http://");
            sb2.append(str);
            str2 = ":";
        }
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        return sb2.toString();
    }

    public static void zza(String str, zzaee zzaeeVar) {
        Map<String, List<WeakReference<zzaee>>> map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                map.get(str).add(new WeakReference<>(zzaeeVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference<>(zzaeeVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void zza(C3767g c3767g, String str, int i10) {
        String m14363b = c3767g.m14351r().m14363b();
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            map.put(m14363b, new zzaeb(str, i10));
        }
        Map<String, List<WeakReference<zzaee>>> map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(m14363b)) {
                boolean z10 = false;
                Iterator<WeakReference<zzaee>> it = map2.get(m14363b).iterator();
                while (it.hasNext()) {
                    zzaee zzaeeVar = it.next().get();
                    if (zzaeeVar != null) {
                        z10 = true;
                        zzaeeVar.zza();
                    }
                }
                if (!z10) {
                    zza.remove(m14363b);
                }
            }
        }
    }

    public static boolean zza(C3767g c3767g) {
        return zza.containsKey(c3767g.m14351r().m14363b());
    }

    public static String zzb(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzaeb zzaebVar;
        String str2;
        Map<String, zzaeb> map = zza;
        synchronized (map) {
            zzaebVar = map.get(str);
        }
        if (zzaebVar != null) {
            str2 = "" + zza(zzaebVar.zzb(), zzaebVar.zza(), zzaebVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }
}
