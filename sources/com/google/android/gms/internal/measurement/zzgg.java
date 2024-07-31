package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p109h7.C2432o;
import p285u.C4771a;

/* loaded from: classes.dex */
public final class zzgg implements zzgj {
    private static final Map<Uri, zzgg> zza = new C4771a();
    private static final String[] zzb = {Constants.KEY, "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzgh> zzi;

    private zzgg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgi zzgiVar = new zzgi(this, null);
        this.zzf = zzgiVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        C2432o.m9704j(contentResolver);
        C2432o.m9704j(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgiVar);
    }

    public static zzgg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgg zzggVar;
        synchronized (zzgg.class) {
            Map<Uri, zzgg> map = zza;
            zzggVar = map.get(uri);
            if (zzggVar == null) {
                try {
                    zzgg zzggVar2 = new zzgg(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzggVar2);
                    } catch (SecurityException unused) {
                    }
                    zzggVar = zzggVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzggVar;
    }

    public static synchronized void zzc() {
        synchronized (zzgg.class) {
            for (zzgg zzggVar : zza.values()) {
                zzggVar.zzc.unregisterContentObserver(zzggVar.zzf);
            }
            zza.clear();
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzgm.zza(new zzgl() { // from class: com.google.android.gms.internal.measurement.zzgf
                    @Override // com.google.android.gms.internal.measurement.zzgl
                    public final Object zza() {
                        return zzgg.this.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgj
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    map = zze();
                    this.zzh = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final /* synthetic */ Map zzb() {
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map c4771a = count <= 256 ? new C4771a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                c4771a.put(query.getString(0), query.getString(1));
            }
            return c4771a;
        } finally {
            query.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            Iterator<zzgh> it = this.zzi.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}
