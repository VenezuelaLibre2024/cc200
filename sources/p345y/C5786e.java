package p345y;

import android.content.Context;
import android.os.Process;
import p133j0.C3203b;
import p329x.C5488f;

/* renamed from: y.e */
/* loaded from: classes.dex */
public final class C5786e {
    /* renamed from: a */
    public static int m23094a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String m21787c = C5488f.m21787c(str);
        if (m21787c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i11 && C3203b.m11399a(context.getPackageName(), str2) ? C5488f.m21785a(context, i11, m21787c, str2) : C5488f.m21786b(context, m21787c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m23095b(Context context, String str) {
        return m23094a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
