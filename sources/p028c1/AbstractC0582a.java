package p028c1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: c1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0582a extends BroadcastReceiver {

    /* renamed from: h */
    public static final SparseArray<PowerManager.WakeLock> f2563h = new SparseArray<>();

    /* renamed from: i */
    public static int f2564i = 1;

    /* renamed from: b */
    public static boolean m2934b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f2563h;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m2935c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f2563h;
        synchronized (sparseArray) {
            int i10 = f2564i;
            int i11 = i10 + 1;
            f2564i = i11;
            if (i11 <= 0) {
                f2564i = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
