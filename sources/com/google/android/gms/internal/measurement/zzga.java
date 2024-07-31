package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzga implements zzgc {
    @Override // com.google.android.gms.internal.measurement.zzgc
    public final String zza(ContentResolver contentResolver, String str) {
        Cursor query = contentResolver.query(zzfu.zza, null, null, new String[]{str}, null);
        try {
            if (query == null) {
                throw new zzgb("Failed to connect to GservicesProvider");
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(1);
            query.close();
            return string;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgc
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzfz<T> zzfzVar) {
        Cursor query = contentResolver.query(zzfu.zzb, null, null, strArr, null);
        try {
            if (query == null) {
                throw new zzgb("Failed to connect to GservicesProvider");
            }
            T zza = zzfzVar.zza(query.getCount());
            while (query.moveToNext()) {
                zza.put(query.getString(0), query.getString(1));
            }
            query.close();
            return zza;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
