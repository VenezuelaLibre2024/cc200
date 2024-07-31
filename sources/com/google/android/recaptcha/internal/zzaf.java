package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import p064e6.C1675f;

/* loaded from: classes.dex */
public final class zzaf {
    public static final zzaf zza = new zzaf();
    private static final String zzb = String.valueOf(Build.VERSION.SDK_INT);
    private static final C1675f zzc = C1675f.m6715f();

    private zzaf() {
    }

    public static final String zza(Context context) {
        int mo6697g = zzc.mo6697g(context);
        return (mo6697g == 1 || mo6697g == 3 || mo6697g == 9) ? "ANDROID_OFFPLAY" : "ANDROID_ONPLAY";
    }
}
