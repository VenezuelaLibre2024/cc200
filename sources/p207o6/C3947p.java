package p207o6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p064e6.C1685k;
import p237q6.C4195c;

/* renamed from: o6.p */
/* loaded from: classes.dex */
public final class C3947p {
    /* renamed from: a */
    public static boolean m14967a(Context context, int i10) {
        if (!m14968b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C1685k.m6736a(context).m6739b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m14968b(Context context, int i10, String str) {
        return C4195c.m16183a(context).m16182g(i10, str);
    }
}
