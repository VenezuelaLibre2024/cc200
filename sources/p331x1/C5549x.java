package p331x1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: x1.x */
/* loaded from: classes.dex */
public class C5549x {

    /* renamed from: a */
    public static boolean f20805a = true;

    /* renamed from: a */
    public static InterfaceC5548w m22343a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C5547v(viewGroup) : C5546u.m22340g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m22344b(ViewGroup viewGroup, boolean z10) {
        if (f20805a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f20805a = false;
            }
        }
    }

    /* renamed from: c */
    public static void m22345c(ViewGroup viewGroup, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (i10 >= 18) {
            m22344b(viewGroup, z10);
        } else {
            C5550y.m22347b(viewGroup, z10);
        }
    }
}
