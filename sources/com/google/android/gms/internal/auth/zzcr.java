package com.google.android.gms.internal.auth;

import android.net.Uri;
import p285u.C4771a;

/* loaded from: classes.dex */
public final class zzcr {
    private static final C4771a zza = new C4771a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            C4771a c4771a = zza;
            Uri uri = (Uri) c4771a.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            c4771a.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
