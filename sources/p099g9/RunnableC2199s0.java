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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p223p6.ThreadFactoryC4056b;

/* renamed from: g9.s0 */
/* loaded from: classes.dex */
public class RunnableC2199s0 implements Runnable {

    /* renamed from: h */
    public final long f8737h;

    /* renamed from: i */
    public final PowerManager.WakeLock f8738i;

    /* renamed from: j */
    public final FirebaseMessaging f8739j;

    /* renamed from: k */
    @SuppressLint({"ThreadPoolCreation"})
    public ExecutorService f8740k = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4056b("firebase-iid-executor"));

    /* renamed from: g9.s0$a */
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC2199s0 f8741a;

        public a(RunnableC2199s0 runnableC2199s0) {
            this.f8741a = runnableC2199s0;
        }

        /* renamed from: a */
        public void m8831a() {
            if (RunnableC2199s0.m8827c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f8741a.m8828b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC2199s0 runnableC2199s0 = this.f8741a;
            if (runnableC2199s0 != null && runnableC2199s0.m8829d()) {
                if (RunnableC2199s0.m8827c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8741a.f8739j.m5437p(this.f8741a, 0L);
                this.f8741a.m8828b().unregisterReceiver(this);
                this.f8741a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC2199s0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f8739j = firebaseMessaging;
        this.f8737h = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m8828b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8738i = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m8827c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public Context m8828b() {
        return this.f8739j.m5438q();
    }

    /* renamed from: d */
    public boolean m8829d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m8828b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    public boolean m8830e() {
        String str;
        try {
            if (this.f8739j.m5435n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (C2167d0.m8732h(e10.getMessage())) {
                str = "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval";
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C2193p0.m8808b().m8812e(m8828b())) {
            this.f8738i.acquire();
        }
        try {
            try {
                this.f8739j.m5428O(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f8739j.m5428O(false);
                if (!C2193p0.m8808b().m8812e(m8828b())) {
                    return;
                }
            }
            if (!this.f8739j.m5444z()) {
                this.f8739j.m5428O(false);
                if (C2193p0.m8808b().m8812e(m8828b())) {
                    this.f8738i.release();
                    return;
                }
                return;
            }
            if (C2193p0.m8808b().m8811d(m8828b()) && !m8829d()) {
                new a(this).m8831a();
                if (C2193p0.m8808b().m8812e(m8828b())) {
                    this.f8738i.release();
                    return;
                }
                return;
            }
            if (m8830e()) {
                this.f8739j.m5428O(false);
            } else {
                this.f8739j.m5432S(this.f8737h);
            }
            if (!C2193p0.m8808b().m8812e(m8828b())) {
                return;
            }
            this.f8738i.release();
        } catch (Throwable th) {
            if (C2193p0.m8808b().m8812e(m8828b())) {
                this.f8738i.release();
            }
            throw th;
        }
    }
}
