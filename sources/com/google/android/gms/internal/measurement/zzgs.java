package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import p285u.C4771a;

/* loaded from: classes.dex */
public final class zzgs {
    private static final C4771a<String, Uri> zza = new C4771a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzgs.class) {
            C4771a<String, Uri> c4771a = zza;
            uri = c4771a.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                c4771a.put(str, uri);
            }
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
