package p322w8;

import android.content.Context;
import android.util.Log;

/* renamed from: w8.s */
/* loaded from: classes.dex */
public class C5447s {

    /* renamed from: c */
    public static C5447s f20299c;

    /* renamed from: a */
    public Boolean f20300a = null;

    /* renamed from: b */
    public Boolean f20301b = null;

    /* renamed from: a */
    public static synchronized C5447s m21607a() {
        C5447s c5447s;
        synchronized (C5447s.class) {
            if (f20299c == null) {
                f20299c = new C5447s();
            }
            c5447s = f20299c;
        }
        return c5447s;
    }

    /* renamed from: b */
    public boolean m21608b(Context context) {
        if (this.f20301b == null) {
            this.f20301b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f20300a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f20301b.booleanValue();
    }

    /* renamed from: c */
    public boolean m21609c(Context context) {
        if (this.f20300a == null) {
            this.f20300a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f20300a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f20300a.booleanValue();
    }
}
