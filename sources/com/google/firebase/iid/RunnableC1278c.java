package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p322w8.C5430b;
import p322w8.C5439k;
import p322w8.C5447s;

/* renamed from: com.google.firebase.iid.c */
/* loaded from: classes.dex */
public class RunnableC1278c implements Runnable {

    /* renamed from: h */
    public final long f4843h;

    /* renamed from: i */
    public final PowerManager.WakeLock f4844i;

    /* renamed from: j */
    public final FirebaseInstanceId f4845j;

    /* renamed from: k */
    @VisibleForTesting
    public ExecutorService f4846k = C5430b.m21587b();

    @VisibleForTesting
    /* renamed from: com.google.firebase.iid.c$a */
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {

        /* renamed from: a */
        public RunnableC1278c f4847a;

        public a(RunnableC1278c runnableC1278c) {
            this.f4847a = runnableC1278c;
        }

        /* renamed from: a */
        public void m5392a() {
            if (FirebaseInstanceId.m5335r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f4847a.m5389b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC1278c runnableC1278c = this.f4847a;
            if (runnableC1278c != null && runnableC1278c.m5390c()) {
                if (FirebaseInstanceId.m5335r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f4847a.f4845j.m5348g(this.f4847a, 0L);
                this.f4847a.m5389b().unregisterReceiver(this);
                this.f4847a = null;
            }
        }
    }

    @VisibleForTesting
    public RunnableC1278c(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f4845j = firebaseInstanceId;
        this.f4843h = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m5389b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4844i = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: b */
    public Context m5389b() {
        return this.f4845j.m5349h().m14349m();
    }

    /* renamed from: c */
    public boolean m5390c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m5389b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: d */
    public boolean m5391d() {
        String str;
        if (!this.f4845j.m5343F(this.f4845j.m5356p())) {
            return true;
        }
        try {
            if (this.f4845j.m5346d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (C5439k.m21589g(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                str = sb2.toString();
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseInstanceId", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (C5447s.m21607a().m21609c(m5389b())) {
            this.f4844i.acquire();
        }
        try {
            try {
                this.f4845j.m5340C(true);
                if (!this.f4845j.m5358s()) {
                    this.f4845j.m5340C(false);
                    if (!C5447s.m21607a().m21609c(m5389b())) {
                        return;
                    }
                } else if (!C5447s.m21607a().m21608b(m5389b()) || m5390c()) {
                    if (m5391d()) {
                        this.f4845j.m5340C(false);
                    } else {
                        this.f4845j.m5342E(this.f4843h);
                    }
                    if (!C5447s.m21607a().m21609c(m5389b())) {
                        return;
                    }
                } else {
                    new a(this).m5392a();
                    if (!C5447s.m21607a().m21609c(m5389b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb2.toString());
                this.f4845j.m5340C(false);
                if (!C5447s.m21607a().m21609c(m5389b())) {
                    return;
                }
            }
            this.f4844i.release();
        } catch (Throwable th) {
            if (C5447s.m21607a().m21609c(m5389b())) {
                this.f4844i.release();
            }
            throw th;
        }
    }
}
