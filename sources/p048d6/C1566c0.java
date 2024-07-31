package p048d6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p207o6.C3944m;
import p237q6.C4195c;

/* renamed from: d6.c0 */
/* loaded from: classes.dex */
public final class C1566c0 {

    /* renamed from: a */
    public final Context f5861a;

    /* renamed from: b */
    public int f5862b;

    /* renamed from: c */
    public int f5863c = 0;

    public C1566c0(Context context) {
        this.f5861a = context;
    }

    /* renamed from: a */
    public final synchronized int m6405a() {
        PackageInfo packageInfo;
        if (this.f5862b == 0) {
            try {
                packageInfo = C4195c.m16183a(this.f5861a).m16180e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f5862b = packageInfo.versionCode;
            }
        }
        return this.f5862b;
    }

    /* renamed from: b */
    public final synchronized int m6406b() {
        int i10 = this.f5863c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f5861a;
        PackageManager packageManager = context.getPackageManager();
        if (C4195c.m16183a(context).m16177b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3944m.m14959h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                r2 = 1;
                this.f5863c = r2;
                return r2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            r2 = true != C3944m.m14959h() ? 1 : 2;
            this.f5863c = r2;
            return r2;
        }
        this.f5863c = r2;
        return r2;
    }
}
