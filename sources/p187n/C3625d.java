package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p089g.C1940j;
import p148k0.C3308b0;

/* renamed from: n.d */
/* loaded from: classes.dex */
public class C3625d {

    /* renamed from: a */
    public final View f12814a;

    /* renamed from: d */
    public C3663u0 f12817d;

    /* renamed from: e */
    public C3663u0 f12818e;

    /* renamed from: f */
    public C3663u0 f12819f;

    /* renamed from: c */
    public int f12816c = -1;

    /* renamed from: b */
    public final C3640j f12815b = C3640j.m13541b();

    public C3625d(View view) {
        this.f12814a = view;
    }

    /* renamed from: a */
    public final boolean m13451a(Drawable drawable) {
        if (this.f12819f == null) {
            this.f12819f = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12819f;
        c3663u0.m13709a();
        ColorStateList m12042p = C3308b0.m12042p(this.f12814a);
        if (m12042p != null) {
            c3663u0.f13042d = true;
            c3663u0.f13039a = m12042p;
        }
        PorterDuff.Mode m12043q = C3308b0.m12043q(this.f12814a);
        if (m12043q != null) {
            c3663u0.f13041c = true;
            c3663u0.f13040b = m12043q;
        }
        if (!c3663u0.f13042d && !c3663u0.f13041c) {
            return false;
        }
        C3640j.m13544i(drawable, c3663u0, this.f12814a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m13452b() {
        Drawable background = this.f12814a.getBackground();
        if (background != null) {
            if (m13461k() && m13451a(background)) {
                return;
            }
            C3663u0 c3663u0 = this.f12818e;
            if (c3663u0 != null) {
                C3640j.m13544i(background, c3663u0, this.f12814a.getDrawableState());
                return;
            }
            C3663u0 c3663u02 = this.f12817d;
            if (c3663u02 != null) {
                C3640j.m13544i(background, c3663u02, this.f12814a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m13453c() {
        C3663u0 c3663u0 = this.f12818e;
        if (c3663u0 != null) {
            return c3663u0.f13039a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m13454d() {
        C3663u0 c3663u0 = this.f12818e;
        if (c3663u0 != null) {
            return c3663u0.f13040b;
        }
        return null;
    }

    /* renamed from: e */
    public void m13455e(AttributeSet attributeSet, int i10) {
        Context context = this.f12814a.getContext();
        int[] iArr = C1940j.f7737y3;
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, iArr, i10, 0);
        View view = this.f12814a;
        C3308b0.m12007U(view, view.getContext(), iArr, attributeSet, m13717u.m13734q(), i10, 0);
        try {
            int i11 = C1940j.f7742z3;
            if (m13717u.m13735r(i11)) {
                this.f12816c = m13717u.m13730m(i11, -1);
                ColorStateList m13547f = this.f12815b.m13547f(this.f12814a.getContext(), this.f12816c);
                if (m13547f != null) {
                    m13458h(m13547f);
                }
            }
            int i12 = C1940j.f7507A3;
            if (m13717u.m13735r(i12)) {
                C3308b0.m12014a0(this.f12814a, m13717u.m13720c(i12));
            }
            int i13 = C1940j.f7512B3;
            if (m13717u.m13735r(i13)) {
                C3308b0.m12016b0(this.f12814a, C3637h0.m13514d(m13717u.m13727j(i13, -1), null));
            }
        } finally {
            m13717u.m13736v();
        }
    }

    /* renamed from: f */
    public void m13456f(Drawable drawable) {
        this.f12816c = -1;
        m13458h(null);
        m13452b();
    }

    /* renamed from: g */
    public void m13457g(int i10) {
        this.f12816c = i10;
        C3640j c3640j = this.f12815b;
        m13458h(c3640j != null ? c3640j.m13547f(this.f12814a.getContext(), i10) : null);
        m13452b();
    }

    /* renamed from: h */
    public void m13458h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f12817d == null) {
                this.f12817d = new C3663u0();
            }
            C3663u0 c3663u0 = this.f12817d;
            c3663u0.f13039a = colorStateList;
            c3663u0.f13042d = true;
        } else {
            this.f12817d = null;
        }
        m13452b();
    }

    /* renamed from: i */
    public void m13459i(ColorStateList colorStateList) {
        if (this.f12818e == null) {
            this.f12818e = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12818e;
        c3663u0.f13039a = colorStateList;
        c3663u0.f13042d = true;
        m13452b();
    }

    /* renamed from: j */
    public void m13460j(PorterDuff.Mode mode) {
        if (this.f12818e == null) {
            this.f12818e = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12818e;
        c3663u0.f13040b = mode;
        c3663u0.f13041c = true;
        m13452b();
    }

    /* renamed from: k */
    public final boolean m13461k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f12817d != null : i10 == 21;
    }
}
