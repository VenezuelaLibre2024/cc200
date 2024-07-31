package p331x1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: x1.f0 */
/* loaded from: classes.dex */
public class C5524f0 extends C5522e0 {

    /* renamed from: h */
    public static boolean f20697h = true;

    @Override // p331x1.C5530i0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo22251e(View view, int i10, int i11, int i12, int i13) {
        if (f20697h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f20697h = false;
            }
        }
    }
}
