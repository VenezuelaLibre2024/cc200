package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0197j;
import p089g.C1931a;
import p089g.C1936f;
import p089g.C1937g;
import p089g.C1940j;
import p148k0.C3308b0;
import p187n.C3667w0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0197j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: h */
    public C0194g f658h;

    /* renamed from: i */
    public ImageView f659i;

    /* renamed from: j */
    public RadioButton f660j;

    /* renamed from: k */
    public TextView f661k;

    /* renamed from: l */
    public CheckBox f662l;

    /* renamed from: m */
    public TextView f663m;

    /* renamed from: n */
    public ImageView f664n;

    /* renamed from: o */
    public ImageView f665o;

    /* renamed from: p */
    public LinearLayout f666p;

    /* renamed from: q */
    public Drawable f667q;

    /* renamed from: r */
    public int f668r;

    /* renamed from: s */
    public Context f669s;

    /* renamed from: t */
    public boolean f670t;

    /* renamed from: u */
    public Drawable f671u;

    /* renamed from: v */
    public boolean f672v;

    /* renamed from: w */
    public LayoutInflater f673w;

    /* renamed from: x */
    public boolean f674x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7319D);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        C3667w0 m13717u = C3667w0.m13717u(getContext(), attributeSet, C1940j.f7587T1, i10, 0);
        this.f667q = m13717u.m13723f(C1940j.f7595V1);
        this.f668r = m13717u.m13730m(C1940j.f7591U1, -1);
        this.f670t = m13717u.m13718a(C1940j.f7599W1, false);
        this.f669s = context;
        this.f671u = m13717u.m13723f(C1940j.f7603X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1931a.f7316A, 0);
        this.f672v = obtainStyledAttributes.hasValue(0);
        m13717u.m13736v();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f673w == null) {
            this.f673w = LayoutInflater.from(getContext());
        }
        return this.f673w;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f664n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m702a(View view) {
        m703b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f665o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f665o.getLayoutParams();
        rect.top += this.f665o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final void m703b(View view, int i10) {
        LinearLayout linearLayout = this.f666p;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    /* renamed from: c */
    public boolean mo692c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    /* renamed from: d */
    public void mo693d(C0194g c0194g, int i10) {
        this.f658h = c0194g;
        setVisibility(c0194g.isVisible() ? 0 : 8);
        setTitle(c0194g.m826i(this));
        setCheckable(c0194g.isCheckable());
        m707h(c0194g.m817A(), c0194g.m824g());
        setIcon(c0194g.getIcon());
        setEnabled(c0194g.isEnabled());
        setSubMenuArrowVisible(c0194g.hasSubMenu());
        setContentDescription(c0194g.getContentDescription());
    }

    /* renamed from: e */
    public final void m704e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1937g.f7473h, (ViewGroup) this, false);
        this.f662l = checkBox;
        m702a(checkBox);
    }

    /* renamed from: f */
    public final void m705f() {
        ImageView imageView = (ImageView) getInflater().inflate(C1937g.f7474i, (ViewGroup) this, false);
        this.f659i = imageView;
        m703b(imageView, 0);
    }

    /* renamed from: g */
    public final void m706g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1937g.f7476k, (ViewGroup) this, false);
        this.f660j = radioButton;
        m702a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j.a
    public C0194g getItemData() {
        return this.f658h;
    }

    /* renamed from: h */
    public void m707h(boolean z10, char c10) {
        int i10 = (z10 && this.f658h.m817A()) ? 0 : 8;
        if (i10 == 0) {
            this.f663m.setText(this.f658h.m825h());
        }
        if (this.f663m.getVisibility() != i10) {
            this.f663m.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C3308b0.m12012Z(this, this.f667q);
        TextView textView = (TextView) findViewById(C1936f.f7436M);
        this.f661k = textView;
        int i10 = this.f668r;
        if (i10 != -1) {
            textView.setTextAppearance(this.f669s, i10);
        }
        this.f663m = (TextView) findViewById(C1936f.f7429F);
        ImageView imageView = (ImageView) findViewById(C1936f.f7432I);
        this.f664n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f671u);
        }
        this.f665o = (ImageView) findViewById(C1936f.f7457r);
        this.f666p = (LinearLayout) findViewById(C1936f.f7451l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f659i != null && this.f670t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f659i.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f660j == null && this.f662l == null) {
            return;
        }
        if (this.f658h.m830m()) {
            if (this.f660j == null) {
                m706g();
            }
            compoundButton = this.f660j;
            compoundButton2 = this.f662l;
        } else {
            if (this.f662l == null) {
                m704e();
            }
            compoundButton = this.f662l;
            compoundButton2 = this.f660j;
        }
        if (z10) {
            compoundButton.setChecked(this.f658h.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f662l;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f660j;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f658h.m830m()) {
            if (this.f660j == null) {
                m706g();
            }
            compoundButton = this.f660j;
        } else {
            if (this.f662l == null) {
                m704e();
            }
            compoundButton = this.f662l;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f674x = z10;
        this.f670t = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f665o;
        if (imageView != null) {
            imageView.setVisibility((this.f672v || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f658h.m843z() || this.f674x;
        if (z10 || this.f670t) {
            ImageView imageView = this.f659i;
            if (imageView == null && drawable == null && !this.f670t) {
                return;
            }
            if (imageView == null) {
                m705f();
            }
            if (drawable == null && !this.f670t) {
                this.f659i.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f659i;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f659i.getVisibility() != 0) {
                this.f659i.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f661k.setText(charSequence);
            if (this.f661k.getVisibility() == 0) {
                return;
            }
            textView = this.f661k;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f661k.getVisibility() == 8) {
                return;
            } else {
                textView = this.f661k;
            }
        }
        textView.setVisibility(i10);
    }
}
