package p099g9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p195n7.C3767g;
import p207o6.C3944m;

/* renamed from: g9.h0 */
/* loaded from: classes.dex */
public class C2177h0 {

    /* renamed from: a */
    public final Context f8696a;

    /* renamed from: b */
    public String f8697b;

    /* renamed from: c */
    public String f8698c;

    /* renamed from: d */
    public int f8699d;

    /* renamed from: e */
    public int f8700e = 0;

    public C2177h0(Context context) {
        this.f8696a = context;
    }

    /* renamed from: c */
    public static String m8763c(C3767g c3767g) {
        String m14367f = c3767g.m14351r().m14367f();
        if (m14367f != null) {
            return m14367f;
        }
        String m14364c = c3767g.m14351r().m14364c();
        if (!m14364c.startsWith("1:")) {
            return m14364c;
        }
        String[] split = m14364c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String m8764a() {
        if (this.f8697b == null) {
            m8770h();
        }
        return this.f8697b;
    }

    /* renamed from: b */
    public synchronized String m8765b() {
        if (this.f8698c == null) {
            m8770h();
        }
        return this.f8698c;
    }

    /* renamed from: d */
    public synchronized int m8766d() {
        PackageInfo m8768f;
        if (this.f8699d == 0 && (m8768f = m8768f("com.google.android.gms")) != null) {
            this.f8699d = m8768f.versionCode;
        }
        return this.f8699d;
    }

    /* renamed from: e */
    public synchronized int m8767e() {
        int i10 = this.f8700e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f8696a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3944m.m14959h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8700e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f8700e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C3944m.m14959h()) {
            this.f8700e = 2;
        } else {
            this.f8700e = 1;
        }
        return this.f8700e;
    }

    /* renamed from: f */
    public final PackageInfo m8768f(String str) {
        try {
            return this.f8696a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* renamed from: g */
    public boolean m8769g() {
        return m8767e() != 0;
    }

    /* renamed from: h */
    public final synchronized void m8770h() {
        PackageInfo m8768f = m8768f(this.f8696a.getPackageName());
        if (m8768f != null) {
            this.f8697b = Integer.toString(m8768f.versionCode);
            this.f8698c = m8768f.versionName;
        }
    }
}
