package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzgc {
    String zza(ContentResolver contentResolver, String str);

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzfz<T> zzfzVar);
}
