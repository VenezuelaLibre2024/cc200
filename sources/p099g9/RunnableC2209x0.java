package p099g9;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.C1284a;
import java.io.IOException;

/* renamed from: g9.x0 */
/* loaded from: classes.dex */
public class RunnableC2209x0 implements Runnable {

    /* renamed from: m */
    public static final Object f8772m = new Object();

    /* renamed from: n */
    public static Boolean f8773n;

    /* renamed from: o */
    public static Boolean f8774o;

    /* renamed from: h */
    public final Context f8775h;

    /* renamed from: i */
    public final C2177h0 f8776i;

    /* renamed from: j */
    public final PowerManager.WakeLock f8777j;

    /* renamed from: k */
    public final C2207w0 f8778k;

    /* renamed from: l */
    public final long f8779l;

    /* renamed from: g9.x0$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC2209x0 f8780a;

        public a(RunnableC2209x0 runnableC2209x0) {
            this.f8780a = runnableC2209x0;
        }

        /* renamed from: a */
        public void m8875a() {
            if (RunnableC2209x0.m8866b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC2209x0.this.f8775h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC2209x0 runnableC2209x0 = this.f8780a;
            if (runnableC2209x0 == null) {
                return;
            }
            if (runnableC2209x0.m8874i()) {
                if (RunnableC2209x0.m8866b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8780a.f8778k.m8856m(this.f8780a, 0L);
                context.unregisterReceiver(this);
                this.f8780a = null;
            }
        }
    }

    public RunnableC2209x0(C2207w0 c2207w0, Context context, C2177h0 c2177h0, long j10) {
        this.f8778k = c2207w0;
        this.f8775h = context;
        this.f8779l = j10;
        this.f8776i = c2177h0;
        this.f8777j = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m8866b() {
        return m8873j();
    }

    /* renamed from: e */
    public static String m8869e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    public static boolean m8870f(Context context) {
        boolean booleanValue;
        synchronized (f8772m) {
            Boolean bool = f8774o;
            Boolean valueOf = Boolean.valueOf(bool == null ? m8871g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f8774o = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m8871g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m8869e(str));
        }
        return z10;
    }

    /* renamed from: h */
    public static boolean m8872h(Context context) {
        boolean booleanValue;
        synchronized (f8772m) {
            Boolean bool = f8773n;
            Boolean valueOf = Boolean.valueOf(bool == null ? m8871g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f8773n = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m8873j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: i */
    public final synchronized boolean m8874i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8775h.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m8872h(this.f8775h)) {
            this.f8777j.acquire(C1284a.f4875a);
        }
        try {
            try {
                try {
                    this.f8778k.m8858o(true);
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f8778k.m8858o(false);
                    if (!m8872h(this.f8775h)) {
                        return;
                    } else {
                        wakeLock = this.f8777j;
                    }
                }
                if (!this.f8776i.m8769g()) {
                    this.f8778k.m8858o(false);
                    if (m8872h(this.f8775h)) {
                        try {
                            this.f8777j.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (m8870f(this.f8775h) && !m8874i()) {
                    new a(this).m8875a();
                    if (m8872h(this.f8775h)) {
                        try {
                            this.f8777j.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f8778k.m8862s()) {
                    this.f8778k.m8858o(false);
                } else {
                    this.f8778k.m8863t(this.f8779l);
                }
                if (m8872h(this.f8775h)) {
                    wakeLock = this.f8777j;
                    wakeLock.release();
                }
            } catch (Throwable th) {
                if (m8872h(this.f8775h)) {
                    try {
                        this.f8777j.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
