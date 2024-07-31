package com.google.android.gms.internal.p377firebaseauthapi;

import java.io.UnsupportedEncodingException;
import java.util.List;
import p108h6.C2394s;
import p207o6.C3934c;

/* loaded from: classes.dex */
public final class zzafo {
    public static long zza(String str) {
        zzafn zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzafn zzb(String str) {
        C2394s.m9613f(str);
        List<String> zza = zzac.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzafn.zza(new String(C3934c.m14928b(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
