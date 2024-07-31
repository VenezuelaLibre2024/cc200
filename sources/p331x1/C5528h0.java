package p331x1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: x1.h0 */
/* loaded from: classes.dex */
public class C5528h0 extends C5526g0 {
    @Override // p331x1.C5520d0, p331x1.C5530i0
    /* renamed from: c */
    public float mo22242c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p331x1.C5524f0, p331x1.C5530i0
    /* renamed from: e */
    public void mo22251e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p331x1.C5520d0, p331x1.C5530i0
    /* renamed from: f */
    public void mo22244f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p331x1.C5526g0, p331x1.C5530i0
    /* renamed from: g */
    public void mo22253g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p331x1.C5522e0, p331x1.C5530i0
    /* renamed from: h */
    public void mo22248h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p331x1.C5522e0, p331x1.C5530i0
    /* renamed from: i */
    public void mo22249i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
