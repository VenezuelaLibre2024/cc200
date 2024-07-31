package p066e8;

import android.content.Context;

/* renamed from: e8.d0 */
/* loaded from: classes.dex */
public class C1724d0 {

    /* renamed from: a */
    public String f6336a;

    /* renamed from: b */
    public static String m6788b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* renamed from: a */
    public synchronized String m6789a(Context context) {
        if (this.f6336a == null) {
            this.f6336a = m6788b(context);
        }
        return "".equals(this.f6336a) ? null : this.f6336a;
    }
}
