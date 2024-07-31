package androidx.fragment.app;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p285u.C4771a;
import p331x1.C5521e;

/* renamed from: androidx.fragment.app.h0 */
/* loaded from: classes.dex */
public class C0303h0 {

    /* renamed from: a */
    public static final AbstractC0307j0 f1493a;

    /* renamed from: b */
    public static final AbstractC0307j0 f1494b;

    static {
        f1493a = Build.VERSION.SDK_INT >= 21 ? new C0305i0() : null;
        f1494b = m1492b();
    }

    /* renamed from: a */
    public static void m1491a(Fragment fragment, Fragment fragment2, boolean z10, C4771a<String, View> c4771a, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: b */
    public static AbstractC0307j0 m1492b() {
        try {
            return (AbstractC0307j0) C5521e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m1493c(C4771a<String, String> c4771a, C4771a<String, View> c4771a2) {
        for (int size = c4771a.size() - 1; size >= 0; size--) {
            if (!c4771a2.containsKey(c4771a.m18765m(size))) {
                c4771a.m18763k(size);
            }
        }
    }

    /* renamed from: d */
    public static void m1494d(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
