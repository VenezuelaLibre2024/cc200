package p066e8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import p023b8.C0515g;
import p195n7.C3767g;

/* renamed from: e8.x */
/* loaded from: classes.dex */
public class C1757x {

    /* renamed from: a */
    public final SharedPreferences f6486a;

    /* renamed from: b */
    public final C3767g f6487b;

    /* renamed from: c */
    public final Object f6488c;

    /* renamed from: d */
    public TaskCompletionSource<Void> f6489d;

    /* renamed from: e */
    public boolean f6490e;

    /* renamed from: f */
    public boolean f6491f;

    /* renamed from: g */
    public Boolean f6492g;

    /* renamed from: h */
    public final TaskCompletionSource<Void> f6493h;

    public C1757x(C3767g c3767g) {
        Object obj = new Object();
        this.f6488c = obj;
        this.f6489d = new TaskCompletionSource<>();
        this.f6490e = false;
        this.f6491f = false;
        this.f6493h = new TaskCompletionSource<>();
        Context m14349m = c3767g.m14349m();
        this.f6487b = c3767g;
        this.f6486a = C1733i.m6829q(m14349m);
        Boolean m7037b = m7037b();
        this.f6492g = m7037b == null ? m7036a(m14349m) : m7037b;
        synchronized (obj) {
            if (m7039d()) {
                this.f6489d.trySetResult(null);
                this.f6490e = true;
            }
        }
    }

    /* renamed from: g */
    public static Boolean m7034g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            C0515g.m2482f().m2487e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: i */
    public static void m7035i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: a */
    public final Boolean m7036a(Context context) {
        Boolean m7034g = m7034g(context);
        if (m7034g == null) {
            this.f6491f = false;
            return null;
        }
        this.f6491f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m7034g));
    }

    /* renamed from: b */
    public final Boolean m7037b() {
        if (!this.f6486a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f6491f = false;
        return Boolean.valueOf(this.f6486a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: c */
    public void m7038c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f6493h.trySetResult(null);
    }

    /* renamed from: d */
    public synchronized boolean m7039d() {
        boolean booleanValue;
        Boolean bool = this.f6492g;
        booleanValue = bool != null ? bool.booleanValue() : m7040e();
        m7041f(booleanValue);
        return booleanValue;
    }

    /* renamed from: e */
    public final boolean m7040e() {
        try {
            return this.f6487b.m14354x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final void m7041f(boolean z10) {
        C0515g.m2482f().m2484b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f6492g == null ? "global Firebase setting" : this.f6491f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    /* renamed from: h */
    public synchronized void m7042h(Boolean bool) {
        if (bool != null) {
            try {
                this.f6491f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6492g = bool != null ? bool : m7036a(this.f6487b.m14349m());
        m7035i(this.f6486a, bool);
        synchronized (this.f6488c) {
            if (m7039d()) {
                if (!this.f6490e) {
                    this.f6489d.trySetResult(null);
                    this.f6490e = true;
                }
            } else if (this.f6490e) {
                this.f6489d = new TaskCompletionSource<>();
                this.f6490e = false;
            }
        }
    }

    /* renamed from: j */
    public Task<Void> m7043j() {
        Task<Void> task;
        synchronized (this.f6488c) {
            task = this.f6489d.getTask();
        }
        return task;
    }

    /* renamed from: k */
    public Task<Void> m7044k(Executor executor) {
        return C1750q0.m6972o(executor, this.f6493h.getTask(), m7043j());
    }
}
