package p148k0;

import android.os.Build;
import android.view.Gravity;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C3313e {
    /* renamed from: a */
    public static int m12211a(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i10, i11) : i10 & (-8388609);
    }
}
