package p331x1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: x1.d0 */
/* loaded from: classes.dex */
public class C5520d0 extends C5530i0 {

    /* renamed from: e */
    public static boolean f20676e = true;

    @Override // p331x1.C5530i0
    /* renamed from: a */
    public void mo22241a(View view) {
    }

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo22242c(View view) {
        if (f20676e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f20676e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p331x1.C5530i0
    /* renamed from: d */
    public void mo22243d(View view) {
    }

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo22244f(View view, float f10) {
        if (f20676e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f20676e = false;
            }
        }
        view.setAlpha(f10);
    }
}
