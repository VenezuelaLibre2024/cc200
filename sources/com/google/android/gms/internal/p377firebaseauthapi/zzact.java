package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import p108h6.C2382o;

/* loaded from: classes.dex */
public final class zzact {
    private final int zza;

    private zzact(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza = zzac.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt(zza.get(0)) * 1000000) + (Integer.parseInt(zza.get(1)) * 1000) + Integer.parseInt(zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            return -1;
        }
    }

    public static zzact zza() {
        String m9586b = C2382o.m9585a().m9586b("firebase-auth");
        if (TextUtils.isEmpty(m9586b) || m9586b.equals("UNKNOWN")) {
            m9586b = "-1";
        }
        return new zzact(m9586b);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
