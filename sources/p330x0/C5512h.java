package p330x0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0261e;

/* renamed from: x0.h */
/* loaded from: classes.dex */
public class C5512h implements TransformationMethod {

    /* renamed from: h */
    public final TransformationMethod f20630h;

    public C5512h(TransformationMethod transformationMethod) {
        this.f20630h = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m22191a() {
        return this.f20630h;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f20630h;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0261e.m1242b().m1248d() != 1) ? charSequence : C0261e.m1242b().m1255o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f20630h;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
