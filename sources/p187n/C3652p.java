package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p089g.C1940j;
import p118i.C2572a;
import p148k0.C3308b0;
import p188n0.C3679f;

/* renamed from: n.p */
/* loaded from: classes.dex */
public class C3652p {

    /* renamed from: a */
    public final ImageView f12977a;

    /* renamed from: b */
    public C3663u0 f12978b;

    /* renamed from: c */
    public C3663u0 f12979c;

    /* renamed from: d */
    public C3663u0 f12980d;

    /* renamed from: e */
    public int f12981e = 0;

    public C3652p(ImageView imageView) {
        this.f12977a = imageView;
    }

    /* renamed from: a */
    public final boolean m13650a(Drawable drawable) {
        if (this.f12980d == null) {
            this.f12980d = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12980d;
        c3663u0.m13709a();
        ColorStateList m13827a = C3679f.m13827a(this.f12977a);
        if (m13827a != null) {
            c3663u0.f13042d = true;
            c3663u0.f13039a = m13827a;
        }
        PorterDuff.Mode m13828b = C3679f.m13828b(this.f12977a);
        if (m13828b != null) {
            c3663u0.f13041c = true;
            c3663u0.f13040b = m13828b;
        }
        if (!c3663u0.f13042d && !c3663u0.f13041c) {
            return false;
        }
        C3640j.m13544i(drawable, c3663u0, this.f12977a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m13651b() {
        if (this.f12977a.getDrawable() != null) {
            this.f12977a.getDrawable().setLevel(this.f12981e);
        }
    }

    /* renamed from: c */
    public void m13652c() {
        Drawable drawable = this.f12977a.getDrawable();
        if (drawable != null) {
            C3637h0.m13512b(drawable);
        }
        if (drawable != null) {
            if (m13661l() && m13650a(drawable)) {
                return;
            }
            C3663u0 c3663u0 = this.f12979c;
            if (c3663u0 != null) {
                C3640j.m13544i(drawable, c3663u0, this.f12977a.getDrawableState());
                return;
            }
            C3663u0 c3663u02 = this.f12978b;
            if (c3663u02 != null) {
                C3640j.m13544i(drawable, c3663u02, this.f12977a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m13653d() {
        C3663u0 c3663u0 = this.f12979c;
        if (c3663u0 != null) {
            return c3663u0.f13039a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m13654e() {
        C3663u0 c3663u0 = this.f12979c;
        if (c3663u0 != null) {
            return c3663u0.f13040b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m13655f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f12977a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void m13656g(AttributeSet attributeSet, int i10) {
        int m13730m;
        Context context = this.f12977a.getContext();
        int[] iArr = C1940j.f7569P;
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f12977a;
        C3308b0.m12007U(imageView, imageView.getContext(), iArr, attributeSet, m13717u.m13734q(), i10, 0);
        try {
            Drawable drawable = this.f12977a.getDrawable();
            if (drawable == null && (m13730m = m13717u.m13730m(C1940j.f7573Q, -1)) != -1 && (drawable = C2572a.m10278b(this.f12977a.getContext(), m13730m)) != null) {
                this.f12977a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C3637h0.m13512b(drawable);
            }
            int i11 = C1940j.f7577R;
            if (m13717u.m13735r(i11)) {
                C3679f.m13829c(this.f12977a, m13717u.m13720c(i11));
            }
            int i12 = C1940j.f7581S;
            if (m13717u.m13735r(i12)) {
                C3679f.m13830d(this.f12977a, C3637h0.m13514d(m13717u.m13727j(i12, -1), null));
            }
        } finally {
            m13717u.m13736v();
        }
    }

    /* renamed from: h */
    public void m13657h(Drawable drawable) {
        this.f12981e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m13658i(int i10) {
        if (i10 != 0) {
            Drawable m10278b = C2572a.m10278b(this.f12977a.getContext(), i10);
            if (m10278b != null) {
                C3637h0.m13512b(m10278b);
            }
            this.f12977a.setImageDrawable(m10278b);
        } else {
            this.f12977a.setImageDrawable(null);
        }
        m13652c();
    }

    /* renamed from: j */
    public void m13659j(ColorStateList colorStateList) {
        if (this.f12979c == null) {
            this.f12979c = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12979c;
        c3663u0.f13039a = colorStateList;
        c3663u0.f13042d = true;
        m13652c();
    }

    /* renamed from: k */
    public void m13660k(PorterDuff.Mode mode) {
        if (this.f12979c == null) {
            this.f12979c = new C3663u0();
        }
        C3663u0 c3663u0 = this.f12979c;
        c3663u0.f13040b = mode;
        c3663u0.f13041c = true;
        m13652c();
    }

    /* renamed from: l */
    public final boolean m13661l() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f12978b != null : i10 == 21;
    }
}
