package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.InterfaceC0240b;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0240b {

    /* renamed from: h */
    public InterfaceC0240b.a f931h;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0240b.a aVar = this.f931h;
        if (aVar != null) {
            aVar.mo1050a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0240b
    public void setOnFitSystemWindowsListener(InterfaceC0240b.a aVar) {
        this.f931h = aVar;
    }
}
