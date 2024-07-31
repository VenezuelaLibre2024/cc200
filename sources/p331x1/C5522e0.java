package p331x1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: x1.e0 */
/* loaded from: classes.dex */
public class C5522e0 extends C5520d0 {

    /* renamed from: f */
    public static boolean f20695f = true;

    /* renamed from: g */
    public static boolean f20696g = true;

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo22248h(View view, Matrix matrix) {
        if (f20695f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f20695f = false;
            }
        }
    }

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo22249i(View view, Matrix matrix) {
        if (f20696g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f20696g = false;
            }
        }
    }
}
