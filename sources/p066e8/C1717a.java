package p066e8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;
import p023b8.C0514f;

/* renamed from: e8.a */
/* loaded from: classes.dex */
public class C1717a {

    /* renamed from: a */
    public final String f6312a;

    /* renamed from: b */
    public final String f6313b;

    /* renamed from: c */
    public final List<C1727f> f6314c;

    /* renamed from: d */
    public final String f6315d;

    /* renamed from: e */
    public final String f6316e;

    /* renamed from: f */
    public final String f6317f;

    /* renamed from: g */
    public final String f6318g;

    /* renamed from: h */
    public final C0514f f6319h;

    public C1717a(String str, String str2, List<C1727f> list, String str3, String str4, String str5, String str6, C0514f c0514f) {
        this.f6312a = str;
        this.f6313b = str2;
        this.f6314c = list;
        this.f6315d = str3;
        this.f6316e = str4;
        this.f6317f = str5;
        this.f6318g = str6;
        this.f6319h = c0514f;
    }

    /* renamed from: a */
    public static C1717a m6760a(Context context, C1720b0 c1720b0, String str, String str2, List<C1727f> list, C0514f c0514f) {
        String packageName = context.getPackageName();
        String m6776g = c1720b0.m6776g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String m6761b = m6761b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1717a(str, str2, list, m6776g, packageName, m6761b, str3, c0514f);
    }

    /* renamed from: b */
    public static String m6761b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
