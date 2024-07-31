package p064e6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import p108h6.C2394s;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: e6.k */
/* loaded from: classes.dex */
public class C1685k {

    /* renamed from: c */
    public static C1685k f6275c;

    /* renamed from: a */
    public final Context f6276a;

    /* renamed from: b */
    public volatile String f6277b;

    public C1685k(Context context) {
        this.f6276a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1685k m6736a(Context context) {
        C2394s.m9619l(context);
        synchronized (C1685k.class) {
            if (f6275c == null) {
                C1668b0.m6685d(context);
                f6275c = new C1685k(context);
            }
        }
        return f6275c;
    }

    /* renamed from: d */
    public static final AbstractBinderC1701x m6737d(PackageInfo packageInfo, AbstractBinderC1701x... abstractBinderC1701xArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC1702y binderC1702y = new BinderC1702y(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < abstractBinderC1701xArr.length; i10++) {
                if (abstractBinderC1701xArr[i10].equals(binderC1702y)) {
                    return abstractBinderC1701xArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m6738e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            e6.x[] r4 = p064e6.C1666a0.f6227a
            e6.x r4 = m6737d(r2, r4)
            goto L46
        L3a:
            e6.x[] r4 = new p064e6.AbstractBinderC1701x[r0]
            e6.x[] r5 = p064e6.C1666a0.f6227a
            r5 = r5[r1]
            r4[r1] = r5
            e6.x r4 = m6737d(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p064e6.C1685k.m6738e(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* renamed from: b */
    public boolean m6739b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m6738e(packageInfo, false)) {
            return true;
        }
        if (m6738e(packageInfo, true)) {
            if (C1683j.m6728f(this.f6276a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m6740c(int i10) {
        C1688l0 m6743c;
        int length;
        String[] packagesForUid = this.f6276a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m6743c = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C2394s.m9619l(m6743c);
                    break;
                }
                m6743c = m6741f(packagesForUid[i11], false, false);
                if (m6743c.f6280a) {
                    break;
                }
                i11++;
            }
        } else {
            m6743c = C1688l0.m6743c("no pkgs");
        }
        m6743c.m6747e();
        return m6743c.f6280a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    public final C1688l0 m6741f(String str, boolean z10, boolean z11) {
        C1688l0 c1688l0;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return C1688l0.m6743c("null pkg");
        }
        if (str.equals(this.f6277b)) {
            return C1688l0.m6742b();
        }
        if (C1668b0.m6686e()) {
            c1688l0 = C1668b0.m6683b(str, C1683j.m6728f(this.f6276a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f6276a.getPackageManager().getPackageInfo(str, 64);
                boolean m6728f = C1683j.m6728f(this.f6276a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        BinderC1702y binderC1702y = new BinderC1702y(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        C1688l0 m6682a = C1668b0.m6682a(str3, binderC1702y, m6728f, false);
                        if (!m6682a.f6280a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C1668b0.m6682a(str3, binderC1702y, false, true).f6280a) {
                            c1688l0 = m6682a;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                c1688l0 = C1688l0.m6743c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return C1688l0.m6744d("no pkg ".concat(str), e10);
            }
        }
        if (c1688l0.f6280a) {
            this.f6277b = str;
        }
        return c1688l0;
    }
}
