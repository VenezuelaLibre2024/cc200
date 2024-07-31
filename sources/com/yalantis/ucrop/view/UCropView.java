package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p242qc.C4229e;
import p242qc.C4230f;
import p242qc.C4233i;
import p258rc.InterfaceC4342c;
import p258rc.InterfaceC4343d;

/* loaded from: classes2.dex */
public class UCropView extends FrameLayout {

    /* renamed from: h */
    public GestureCropImageView f5466h;

    /* renamed from: i */
    public final OverlayView f5467i;

    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    /* loaded from: classes2.dex */
    public class C1503a implements InterfaceC4342c {
        public C1503a() {
        }

        @Override // p258rc.InterfaceC4342c
        /* renamed from: a */
        public void mo6090a(float f10) {
            UCropView.this.f5467i.setTargetAspectRatio(f10);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    /* loaded from: classes2.dex */
    public class C1504b implements InterfaceC4343d {
        public C1504b() {
        }

        @Override // p258rc.InterfaceC4343d
        /* renamed from: a */
        public void mo6091a(RectF rectF) {
            UCropView.this.f5466h.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C4230f.f15269d, (ViewGroup) this, true);
        this.f5466h = (GestureCropImageView) findViewById(C4229e.f15241b);
        OverlayView overlayView = (OverlayView) findViewById(C4229e.f15264y);
        this.f5467i = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4233i.f15299Y);
        overlayView.m6083g(obtainStyledAttributes);
        this.f5466h.m20888A(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m6089c();
    }

    /* renamed from: c */
    public final void m6089c() {
        this.f5466h.setCropBoundsChangeListener(new C1503a());
        this.f5467i.setOverlayViewChangeListener(new C1504b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f5466h;
    }

    public OverlayView getOverlayView() {
        return this.f5467i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
