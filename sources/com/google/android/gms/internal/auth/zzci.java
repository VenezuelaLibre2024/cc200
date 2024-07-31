package com.google.android.gms.internal.auth;

import android.net.Uri;
import p285u.C4777g;

/* loaded from: classes.dex */
public final class zzci {
    private final C4777g zza;

    public zzci(C4777g c4777g) {
        this.zza = c4777g;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        C4777g c4777g;
        if (uri != null) {
            c4777g = (C4777g) this.zza.get(uri.toString());
        } else {
            c4777g = null;
        }
        if (c4777g == null) {
            return null;
        }
        return (String) c4777g.get("".concat(str3));
    }
}
