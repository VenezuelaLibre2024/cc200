package p073f0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C1799a {

    /* renamed from: f0.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m7269a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: a */
    public static boolean m7268a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return a.m7269a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }
}
