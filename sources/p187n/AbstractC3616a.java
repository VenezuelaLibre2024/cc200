package p187n;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0239a;
import p089g.C1931a;
import p089g.C1940j;
import p148k0.C3308b0;
import p148k0.C3320h0;
import p148k0.InterfaceC3322i0;

/* renamed from: n.a */
/* loaded from: classes.dex */
public abstract class AbstractC3616a extends ViewGroup {

    /* renamed from: h */
    public final a f12749h;

    /* renamed from: i */
    public final Context f12750i;

    /* renamed from: j */
    public ActionMenuView f12751j;

    /* renamed from: k */
    public C0239a f12752k;

    /* renamed from: l */
    public int f12753l;

    /* renamed from: m */
    public C3320h0 f12754m;

    /* renamed from: n */
    public boolean f12755n;

    /* renamed from: o */
    public boolean f12756o;

    /* renamed from: n.a$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3322i0 {

        /* renamed from: a */
        public boolean f12757a = false;

        /* renamed from: b */
        public int f12758b;

        public a() {
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: a */
        public void mo1114a(View view) {
            this.f12757a = true;
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            if (this.f12757a) {
                return;
            }
            AbstractC3616a abstractC3616a = AbstractC3616a.this;
            abstractC3616a.f12754m = null;
            AbstractC3616a.super.setVisibility(this.f12758b);
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: c */
        public void mo1116c(View view) {
            AbstractC3616a.super.setVisibility(0);
            this.f12757a = false;
        }

        /* renamed from: d */
        public a m13387d(C3320h0 c3320h0, int i10) {
            AbstractC3616a.this.f12754m = c3320h0;
            this.f12758b = i10;
            return this;
        }
    }

    public AbstractC3616a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC3616a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12749h = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1931a.f7329a, typedValue, true) || typedValue.resourceId == 0) {
            this.f12750i = context;
        } else {
            this.f12750i = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    public static int m13384d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* renamed from: c */
    public int m13385c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* renamed from: e */
    public int m13386e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C3320h0 mo864f(int i10, long j10) {
        C3320h0 m12250b;
        C3320h0 c3320h0 = this.f12754m;
        if (c3320h0 != null) {
            c3320h0.m12251c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            m12250b = C3308b0.m12017c(this).m12250b(1.0f);
        } else {
            m12250b = C3308b0.m12017c(this).m12250b(0.0f);
        }
        m12250b.m12253f(j10);
        m12250b.m12255h(this.f12749h.m13387d(m12250b, i10));
        return m12250b;
    }

    public int getAnimatedVisibility() {
        return this.f12754m != null ? this.f12749h.f12758b : getVisibility();
    }

    public int getContentHeight() {
        return this.f12753l;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1940j.f7613a, C1931a.f7331c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1940j.f7658j, 0));
        obtainStyledAttributes.recycle();
        C0239a c0239a = this.f12752k;
        if (c0239a != null) {
            c0239a.m1041F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f12756o = false;
        }
        if (!this.f12756o) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f12756o = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f12756o = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12755n = false;
        }
        if (!this.f12755n) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f12755n = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f12755n = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f12753l = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C3320h0 c3320h0 = this.f12754m;
            if (c3320h0 != null) {
                c3320h0.m12251c();
            }
            super.setVisibility(i10);
        }
    }
}
