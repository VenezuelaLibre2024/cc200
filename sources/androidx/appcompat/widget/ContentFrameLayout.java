package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p148k0.C3308b0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: h */
    public TypedValue f922h;

    /* renamed from: i */
    public TypedValue f923i;

    /* renamed from: j */
    public TypedValue f924j;

    /* renamed from: k */
    public TypedValue f925k;

    /* renamed from: l */
    public TypedValue f926l;

    /* renamed from: m */
    public TypedValue f927m;

    /* renamed from: n */
    public final Rect f928n;

    /* renamed from: o */
    public InterfaceC0212a f929o;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0212a {
        /* renamed from: a */
        void mo925a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f928n = new Rect();
    }

    /* renamed from: a */
    public void m923a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m924b(int i10, int i11, int i12, int i13) {
        this.f928n.set(i10, i11, i12, i13);
        if (C3308b0.m11993G(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f926l == null) {
            this.f926l = new TypedValue();
        }
        return this.f926l;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f927m == null) {
            this.f927m = new TypedValue();
        }
        return this.f927m;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f924j == null) {
            this.f924j = new TypedValue();
        }
        return this.f924j;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f925k == null) {
            this.f925k = new TypedValue();
        }
        return this.f925k;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f922h == null) {
            this.f922h = new TypedValue();
        }
        return this.f922h;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f923i == null) {
            this.f923i = new TypedValue();
        }
        return this.f923i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0212a interfaceC0212a = this.f929o;
        if (interfaceC0212a != null) {
            interfaceC0212a.mo925a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0212a interfaceC0212a = this.f929o;
        if (interfaceC0212a != null) {
            interfaceC0212a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0212a interfaceC0212a) {
        this.f929o = interfaceC0212a;
    }
}
