package p237q6;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p207o6.C3944m;

/* renamed from: q6.b */
/* loaded from: classes.dex */
public class C4194b {

    /* renamed from: a */
    public final Context f15145a;

    public C4194b(Context context) {
        this.f15145a = context;
    }

    /* renamed from: a */
    public int m16176a(String str) {
        return this.f15145a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public int m16177b(String str, String str2) {
        return this.f15145a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: c */
    public ApplicationInfo m16178c(String str, int i10) {
        return this.f15145a.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: d */
    public CharSequence m16179d(String str) {
        Context context = this.f15145a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: e */
    public PackageInfo m16180e(String str, int i10) {
        return this.f15145a.getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: f */
    public boolean m16181f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4193a.m16175a(this.f15145a);
        }
        if (!C3944m.m14959h() || (nameForUid = this.f15145a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f15145a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean m16182g(int i10, String str) {
        if (C3944m.m14955d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f15145a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i10, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f15145a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
