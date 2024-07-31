package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Context;
import p064e6.C1675f;
import p064e6.C1683j;

/* loaded from: classes.dex */
public final class zzack {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int mo6698h = C1675f.m6715f().mo6698h(context, C1683j.f6269a);
            zza = Boolean.valueOf(mo6698h == 0 || mo6698h == 2);
        }
        return zza.booleanValue();
    }
}
