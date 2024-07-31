package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p089g.C1940j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: h */
    public int f1060h;

    /* renamed from: i */
    public int f1061i;

    /* renamed from: j */
    public WeakReference<View> f1062j;

    /* renamed from: k */
    public LayoutInflater f1063k;

    /* renamed from: l */
    public InterfaceC0238a f1064l;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0238a {
        /* renamed from: a */
        void m1028a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1060h = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7517C3, i10, 0);
        this.f1061i = obtainStyledAttributes.getResourceId(C1940j.f7532F3, -1);
        this.f1060h = obtainStyledAttributes.getResourceId(C1940j.f7527E3, 0);
        setId(obtainStyledAttributes.getResourceId(C1940j.f7522D3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1027a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1060h == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1063k;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1060h, viewGroup, false);
        int i10 = this.f1061i;
        if (i10 != -1) {
            inflate.setId(i10);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1062j = new WeakReference<>(inflate);
        InterfaceC0238a interfaceC0238a = this.f1064l;
        if (interfaceC0238a != null) {
            interfaceC0238a.m1028a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1061i;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1063k;
    }

    public int getLayoutResource() {
        return this.f1060h;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1061i = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1063k = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1060h = i10;
    }

    public void setOnInflateListener(InterfaceC0238a interfaceC0238a) {
        this.f1064l = interfaceC0238a;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1062j;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            m1027a();
        }
    }
}
