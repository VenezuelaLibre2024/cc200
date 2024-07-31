package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public class zzge {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzge() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzge.class) {
            if (zzb) {
                return true;
            }
            boolean zzd = zzd(context);
            if (zzd) {
                zzb = zzd;
            }
            return zzd;
        }
    }

    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z11 = false;
                }
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                zza = null;
                i10++;
            }
        }
        z10 = z11;
        if (z10) {
            zza = null;
        }
        return z10;
    }
}
