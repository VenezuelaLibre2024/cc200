package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.InterfaceC0197j;
import androidx.appcompat.widget.ActionMenuView;
import p089g.C1940j;
import p175m.InterfaceC3490f;
import p187n.AbstractViewOnTouchListenerC3641j0;
import p187n.C3623c0;
import p187n.C3671y0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C3623c0 implements InterfaceC0197j.a, View.OnClickListener, ActionMenuView.InterfaceC0207a {

    /* renamed from: n */
    public C0194g f643n;

    /* renamed from: o */
    public CharSequence f644o;

    /* renamed from: p */
    public Drawable f645p;

    /* renamed from: q */
    public C0192e.b f646q;

    /* renamed from: r */
    public AbstractViewOnTouchListenerC3641j0 f647r;

    /* renamed from: s */
    public AbstractC0187b f648s;

    /* renamed from: t */
    public boolean f649t;

    /* renamed from: u */
    public boolean f650u;

    /* renamed from: v */
    public int f651v;

    /* renamed from: w */
    public int f652w;

    /* renamed from: x */
    public int f653x;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    public class C0186a extends AbstractViewOnTouchListenerC3641j0 {
        public C0186a() {
            super(ActionMenuItemView.this);
        }

        @Override // p187n.AbstractViewOnTouchListenerC3641j0
        /* renamed from: b */
        public InterfaceC3490f mo697b() {
            AbstractC0187b abstractC0187b = ActionMenuItemView.this.f648s;
            if (abstractC0187b != null) {
                return abstractC0187b.mo699a();
            }
            return null;
        }

        @Override // p187n.AbstractViewOnTouchListenerC3641j0
        /* renamed from: c */
        public boolean mo698c() {
            InterfaceC3490f mo697b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0192e.b bVar = actionMenuItemView.f646q;
            return bVar != null && bVar.mo700a(actionMenuItemView.f643n) && (mo697b = mo697b()) != null && mo697b.mo729a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0187b {
        /* renamed from: a */
        public abstract InterfaceC3490f mo699a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f649t = m695g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7718v, i10, 0);
        this.f651v = obtainStyledAttributes.getDimensionPixelSize(C1940j.f7723w, 0);
        obtainStyledAttributes.recycle();
        this.f653x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f652w = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0207a
    /* renamed from: a */
    public boolean mo690a() {
        return m694f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0207a
    /* renamed from: b */
    public boolean mo691b() {
        return m694f() && this.f643n.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    /* renamed from: c */
    public boolean mo692c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    /* renamed from: d */
    public void mo693d(C0194g c0194g, int i10) {
        this.f643n = c0194g;
        setIcon(c0194g.getIcon());
        setTitle(c0194g.m826i(this));
        setId(c0194g.getItemId());
        setVisibility(c0194g.isVisible() ? 0 : 8);
        setEnabled(c0194g.isEnabled());
        if (c0194g.hasSubMenu() && this.f647r == null) {
            this.f647r = new C0186a();
        }
    }

    /* renamed from: f */
    public boolean m694f() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: g */
    public final boolean m695g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    public C0194g getItemData() {
        return this.f643n;
    }

    /* renamed from: h */
    public final void m696h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f644o);
        if (this.f645p != null && (!this.f643n.m818B() || (!this.f649t && !this.f650u))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f644o : null);
        CharSequence contentDescription = this.f643n.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f643n.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f643n.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C3671y0.m13742a(this, z12 ? null : this.f643n.getTitle());
        } else {
            C3671y0.m13742a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0192e.b bVar = this.f646q;
        if (bVar != null) {
            bVar.mo700a(this.f643n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f649t = m695g();
        m696h();
    }

    @Override // p187n.C3623c0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean m694f = m694f();
        if (m694f && (i12 = this.f652w) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f651v) : this.f651v;
        if (mode != 1073741824 && this.f651v > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (m694f || this.f645p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f645p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC3641j0 abstractViewOnTouchListenerC3641j0;
        if (this.f643n.hasSubMenu() && (abstractViewOnTouchListenerC3641j0 = this.f647r) != null && abstractViewOnTouchListenerC3641j0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f650u != z10) {
            this.f650u = z10;
            C0194g c0194g = this.f643n;
            if (c0194g != null) {
                c0194g.m821c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f645p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f653x;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m696h();
    }

    public void setItemInvoker(C0192e.b bVar) {
        this.f646q = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f652w = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0187b abstractC0187b) {
        this.f648s = abstractC0187b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f644o = charSequence;
        m696h();
    }
}
