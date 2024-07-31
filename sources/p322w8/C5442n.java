package p322w8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p195n7.C3767g;
import p207o6.C3944m;

/* renamed from: w8.n */
/* loaded from: classes.dex */
public class C5442n {

    /* renamed from: a */
    public final Context f20289a;

    /* renamed from: b */
    public String f20290b;

    /* renamed from: c */
    public String f20291c;

    /* renamed from: d */
    public int f20292d;

    /* renamed from: e */
    public int f20293e = 0;

    public C5442n(Context context) {
        this.f20289a = context;
    }

    /* renamed from: c */
    public static String m21599c(C3767g c3767g) {
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
    public synchronized String m21600a() {
        if (this.f20290b == null) {
            m21606h();
        }
        return this.f20290b;
    }

    /* renamed from: b */
    public synchronized String m21601b() {
        if (this.f20291c == null) {
            m21606h();
        }
        return this.f20291c;
    }

    /* renamed from: d */
    public synchronized int m21602d() {
        PackageInfo m21604f;
        if (this.f20292d == 0 && (m21604f = m21604f("com.google.android.gms")) != null) {
            this.f20292d = m21604f.versionCode;
        }
        return this.f20292d;
    }

    /* renamed from: e */
    public synchronized int m21603e() {
        int i10 = this.f20293e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f20289a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!C3944m.m14959h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f20293e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f20293e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (C3944m.m14959h()) {
            this.f20293e = 2;
            i11 = 2;
        } else {
            this.f20293e = 1;
        }
        return i11;
    }

    /* renamed from: f */
    public final PackageInfo m21604f(String str) {
        try {
            return this.f20289a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: g */
    public boolean m21605g() {
        return m21603e() != 0;
    }

    /* renamed from: h */
    public final synchronized void m21606h() {
        PackageInfo m21604f = m21604f(this.f20289a.getPackageName());
        if (m21604f != null) {
            this.f20290b = Integer.toString(m21604f.versionCode);
            this.f20291c = m21604f.versionName;
        }
    }
}
