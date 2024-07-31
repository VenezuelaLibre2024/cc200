package p064e6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.common.zzd;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p207o6.C3939h;
import p237q6.C4195c;

/* renamed from: e6.f */
/* loaded from: classes.dex */
public class C1675f {

    /* renamed from: a */
    public static final int f6260a = C1683j.f6269a;

    /* renamed from: b */
    public static final C1675f f6261b = new C1675f();

    /* renamed from: f */
    public static C1675f m6715f() {
        return f6261b;
    }

    /* renamed from: a */
    public int m6716a(Context context) {
        return C1683j.m6724b(context);
    }

    /* renamed from: b */
    public Intent mo6694b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && C3939h.m14942d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f6260a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C4195c.m16183a(context).m16180e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* renamed from: c */
    public PendingIntent mo6695c(Context context, int i10, int i11) {
        return m6717d(context, i10, i11, null);
    }

    /* renamed from: d */
    public PendingIntent m6717d(Context context, int i10, int i11, String str) {
        Intent mo6694b = mo6694b(context, i10, str);
        if (mo6694b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, mo6694b, zzd.zza | 134217728);
    }

    /* renamed from: e */
    public String mo6696e(int i10) {
        return C1683j.m6725c(i10);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: g */
    public int mo6697g(Context context) {
        return mo6698h(context, f6260a);
    }

    /* renamed from: h */
    public int mo6698h(Context context, int i10) {
        int m6729g = C1683j.m6729g(context, i10);
        if (C1683j.m6730h(context, m6729g)) {
            return 18;
        }
        return m6729g;
    }

    /* renamed from: i */
    public boolean m6718i(Context context, String str) {
        return C1683j.m6734l(context, str);
    }

    /* renamed from: j */
    public boolean mo6699j(int i10) {
        return C1683j.m6732j(i10);
    }
}
