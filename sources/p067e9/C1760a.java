package p067e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import p195n7.C3762b;
import p294u8.C4990a;
import p294u8.InterfaceC4992c;
import p345y.C5782a;

/* renamed from: e9.a */
/* loaded from: classes.dex */
public class C1760a {

    /* renamed from: a */
    public final Context f6508a;

    /* renamed from: b */
    public final SharedPreferences f6509b;

    /* renamed from: c */
    public final InterfaceC4992c f6510c;

    /* renamed from: d */
    public boolean f6511d;

    public C1760a(Context context, String str, InterfaceC4992c interfaceC4992c) {
        Context m7052a = m7052a(context);
        this.f6508a = m7052a;
        this.f6509b = m7052a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f6510c = interfaceC4992c;
        this.f6511d = m7054c();
    }

    /* renamed from: a */
    public static Context m7052a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : C5782a.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    public synchronized boolean m7053b() {
        return this.f6511d;
    }

    /* renamed from: c */
    public final boolean m7054c() {
        return this.f6509b.contains("firebase_data_collection_default_enabled") ? this.f6509b.getBoolean("firebase_data_collection_default_enabled", true) : m7055d();
    }

    /* renamed from: d */
    public final boolean m7055d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f6508a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f6508a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public synchronized void m7056e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f6509b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = m7055d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f6509b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        m7057f(equals);
    }

    /* renamed from: f */
    public final synchronized void m7057f(boolean z10) {
        if (this.f6511d != z10) {
            this.f6511d = z10;
            this.f6510c.mo19563c(new C4990a<>(C3762b.class, new C3762b(z10)));
        }
    }
}
