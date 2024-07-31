package p331x1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: x1.g0 */
/* loaded from: classes.dex */
public class C5526g0 extends C5524f0 {

    /* renamed from: i */
    public static boolean f20698i = true;

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo22253g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo22253g(view, i10);
        } else if (f20698i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f20698i = false;
            }
        }
    }
}
