package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p108h6.C2394s;
import p207o6.C3932a;
import p207o6.C3940i;

/* loaded from: classes.dex */
public final class zzado {
    private final String zza;
    private final String zzb;

    public zzado(Context context) {
        this(context, context.getPackageName());
    }

    private zzado(Context context, String str) {
        C2394s.m9619l(context);
        String m9613f = C2394s.m9613f(str);
        this.zza = m9613f;
        try {
            byte[] m14916a = C3932a.m14916a(context, m9613f);
            if (m14916a != null) {
                this.zzb = C3940i.m14948c(m14916a, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
