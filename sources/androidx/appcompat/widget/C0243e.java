package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.widget.Toolbar;
import p089g.C1931a;
import p089g.C1935e;
import p089g.C1936f;
import p089g.C1938h;
import p089g.C1940j;
import p118i.C2572a;
import p148k0.C3308b0;
import p148k0.C3320h0;
import p148k0.C3324j0;
import p175m.C3485a;
import p187n.C3667w0;
import p187n.InterfaceC3635g0;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public class C0243e implements InterfaceC3635g0 {

    /* renamed from: a */
    public Toolbar f1129a;

    /* renamed from: b */
    public int f1130b;

    /* renamed from: c */
    public View f1131c;

    /* renamed from: d */
    public View f1132d;

    /* renamed from: e */
    public Drawable f1133e;

    /* renamed from: f */
    public Drawable f1134f;

    /* renamed from: g */
    public Drawable f1135g;

    /* renamed from: h */
    public boolean f1136h;

    /* renamed from: i */
    public CharSequence f1137i;

    /* renamed from: j */
    public CharSequence f1138j;

    /* renamed from: k */
    public CharSequence f1139k;

    /* renamed from: l */
    public Window.Callback f1140l;

    /* renamed from: m */
    public boolean f1141m;

    /* renamed from: n */
    public C0239a f1142n;

    /* renamed from: o */
    public int f1143o;

    /* renamed from: p */
    public int f1144p;

    /* renamed from: q */
    public Drawable f1145q;

    /* renamed from: androidx.appcompat.widget.e$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: h */
        public final C3485a f1146h;

        public a() {
            this.f1146h = new C3485a(C0243e.this.f1129a.getContext(), 0, R.id.home, 0, 0, C0243e.this.f1137i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0243e c0243e = C0243e.this;
            Window.Callback callback = c0243e.f1140l;
            if (callback == null || !c0243e.f1141m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1146h);
        }
    }

    /* renamed from: androidx.appcompat.widget.e$b */
    /* loaded from: classes.dex */
    public class b extends C3324j0 {

        /* renamed from: a */
        public boolean f1148a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1149b;

        public b(int i10) {
            this.f1149b = i10;
        }

        @Override // p148k0.C3324j0, p148k0.InterfaceC3322i0
        /* renamed from: a */
        public void mo1114a(View view) {
            this.f1148a = true;
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            if (this.f1148a) {
                return;
            }
            C0243e.this.f1129a.setVisibility(this.f1149b);
        }

        @Override // p148k0.C3324j0, p148k0.InterfaceC3322i0
        /* renamed from: c */
        public void mo1116c(View view) {
            C0243e.this.f1129a.setVisibility(0);
        }
    }

    public C0243e(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C1938h.f7486a, C1935e.f7411n);
    }

    public C0243e(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1143o = 0;
        this.f1144p = 0;
        this.f1129a = toolbar;
        this.f1137i = toolbar.getTitle();
        this.f1138j = toolbar.getSubtitle();
        this.f1136h = this.f1137i != null;
        this.f1135g = toolbar.getNavigationIcon();
        C3667w0 m13717u = C3667w0.m13717u(toolbar.getContext(), null, C1940j.f7613a, C1931a.f7331c, 0);
        this.f1145q = m13717u.m13723f(C1940j.f7668l);
        if (z10) {
            CharSequence m13732o = m13717u.m13732o(C1940j.f7698r);
            if (!TextUtils.isEmpty(m13732o)) {
                setTitle(m13732o);
            }
            CharSequence m13732o2 = m13717u.m13732o(C1940j.f7688p);
            if (!TextUtils.isEmpty(m13732o2)) {
                m1083F(m13732o2);
            }
            Drawable m13723f = m13717u.m13723f(C1940j.f7678n);
            if (m13723f != null) {
                m1079B(m13723f);
            }
            Drawable m13723f2 = m13717u.m13723f(C1940j.f7673m);
            if (m13723f2 != null) {
                setIcon(m13723f2);
            }
            if (this.f1135g == null && (drawable = this.f1145q) != null) {
                m1082E(drawable);
            }
            mo1099l(m13717u.m13727j(C1940j.f7648h, 0));
            int m13730m = m13717u.m13730m(C1940j.f7643g, 0);
            if (m13730m != 0) {
                m1113z(LayoutInflater.from(this.f1129a.getContext()).inflate(m13730m, (ViewGroup) this.f1129a, false));
                mo1099l(this.f1130b | 16);
            }
            int m13729l = m13717u.m13729l(C1940j.f7658j, 0);
            if (m13729l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1129a.getLayoutParams();
                layoutParams.height = m13729l;
                this.f1129a.setLayoutParams(layoutParams);
            }
            int m13721d = m13717u.m13721d(C1940j.f7638f, -1);
            int m13721d2 = m13717u.m13721d(C1940j.f7633e, -1);
            if (m13721d >= 0 || m13721d2 >= 0) {
                this.f1129a.m989J(Math.max(m13721d, 0), Math.max(m13721d2, 0));
            }
            int m13730m2 = m13717u.m13730m(C1940j.f7703s, 0);
            if (m13730m2 != 0) {
                Toolbar toolbar2 = this.f1129a;
                toolbar2.m993N(toolbar2.getContext(), m13730m2);
            }
            int m13730m3 = m13717u.m13730m(C1940j.f7693q, 0);
            if (m13730m3 != 0) {
                Toolbar toolbar3 = this.f1129a;
                toolbar3.m992M(toolbar3.getContext(), m13730m3);
            }
            int m13730m4 = m13717u.m13730m(C1940j.f7683o, 0);
            if (m13730m4 != 0) {
                this.f1129a.setPopupTheme(m13730m4);
            }
        } else {
            this.f1130b = m1112y();
        }
        m13717u.m13736v();
        m1078A(i10);
        this.f1139k = this.f1129a.getNavigationContentDescription();
        this.f1129a.setNavigationOnClickListener(new a());
    }

    /* renamed from: A */
    public void m1078A(int i10) {
        if (i10 == this.f1144p) {
            return;
        }
        this.f1144p = i10;
        if (TextUtils.isEmpty(this.f1129a.getNavigationContentDescription())) {
            m1080C(this.f1144p);
        }
    }

    /* renamed from: B */
    public void m1079B(Drawable drawable) {
        this.f1134f = drawable;
        m1087J();
    }

    /* renamed from: C */
    public void m1080C(int i10) {
        m1081D(i10 == 0 ? null : getContext().getString(i10));
    }

    /* renamed from: D */
    public void m1081D(CharSequence charSequence) {
        this.f1139k = charSequence;
        m1085H();
    }

    /* renamed from: E */
    public void m1082E(Drawable drawable) {
        this.f1135g = drawable;
        m1086I();
    }

    /* renamed from: F */
    public void m1083F(CharSequence charSequence) {
        this.f1138j = charSequence;
        if ((this.f1130b & 8) != 0) {
            this.f1129a.setSubtitle(charSequence);
        }
    }

    /* renamed from: G */
    public final void m1084G(CharSequence charSequence) {
        this.f1137i = charSequence;
        if ((this.f1130b & 8) != 0) {
            this.f1129a.setTitle(charSequence);
            if (this.f1136h) {
                C3308b0.m12011Y(this.f1129a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: H */
    public final void m1085H() {
        if ((this.f1130b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1139k)) {
                this.f1129a.setNavigationContentDescription(this.f1144p);
            } else {
                this.f1129a.setNavigationContentDescription(this.f1139k);
            }
        }
    }

    /* renamed from: I */
    public final void m1086I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1130b & 4) != 0) {
            toolbar = this.f1129a;
            drawable = this.f1135g;
            if (drawable == null) {
                drawable = this.f1145q;
            }
        } else {
            toolbar = this.f1129a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: J */
    public final void m1087J() {
        Drawable drawable;
        int i10 = this.f1130b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1134f) == null) {
            drawable = this.f1133e;
        }
        this.f1129a.setLogo(drawable);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: a */
    public void mo1088a(Menu menu, InterfaceC0196i.a aVar) {
        if (this.f1142n == null) {
            C0239a c0239a = new C0239a(this.f1129a.getContext());
            this.f1142n = c0239a;
            c0239a.m722p(C1936f.f7446g);
        }
        this.f1142n.mo713g(aVar);
        this.f1129a.m990K((C0192e) menu, this.f1142n);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: b */
    public boolean mo1089b() {
        return this.f1129a.m981B();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: c */
    public void mo1090c() {
        this.f1141m = true;
    }

    @Override // p187n.InterfaceC3635g0
    public void collapseActionView() {
        this.f1129a.m1001e();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: d */
    public boolean mo1091d() {
        return this.f1129a.m1000d();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: e */
    public void mo1092e(Drawable drawable) {
        C3308b0.m12012Z(this.f1129a, drawable);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: f */
    public boolean mo1093f() {
        return this.f1129a.m980A();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: g */
    public boolean mo1094g() {
        return this.f1129a.m1019w();
    }

    @Override // p187n.InterfaceC3635g0
    public Context getContext() {
        return this.f1129a.getContext();
    }

    @Override // p187n.InterfaceC3635g0
    public CharSequence getTitle() {
        return this.f1129a.getTitle();
    }

    @Override // p187n.InterfaceC3635g0
    public int getVisibility() {
        return this.f1129a.getVisibility();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: h */
    public boolean mo1095h() {
        return this.f1129a.m996Q();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: i */
    public void mo1096i() {
        this.f1129a.m1002f();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: j */
    public void mo1097j(C0242d c0242d) {
        View view = this.f1131c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1129a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1131c);
            }
        }
        this.f1131c = c0242d;
        if (c0242d == null || this.f1143o != 2) {
            return;
        }
        this.f1129a.addView(c0242d, 0);
        Toolbar.C0235e c0235e = (Toolbar.C0235e) this.f1131c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0235e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0235e).height = -2;
        c0235e.f8914a = 8388691;
        c0242d.setAllowCollapse(true);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: k */
    public boolean mo1098k() {
        return this.f1129a.m1018v();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: l */
    public void mo1099l(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1130b ^ i10;
        this.f1130b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m1085H();
                }
                m1086I();
            }
            if ((i11 & 3) != 0) {
                m1087J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1129a.setTitle(this.f1137i);
                    toolbar = this.f1129a;
                    charSequence = this.f1138j;
                } else {
                    charSequence = null;
                    this.f1129a.setTitle((CharSequence) null);
                    toolbar = this.f1129a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1132d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1129a.addView(view);
            } else {
                this.f1129a.removeView(view);
            }
        }
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: m */
    public Menu mo1100m() {
        return this.f1129a.getMenu();
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: n */
    public void mo1101n(int i10) {
        m1079B(i10 != 0 ? C2572a.m10278b(getContext(), i10) : null);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: o */
    public int mo1102o() {
        return this.f1143o;
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: p */
    public C3320h0 mo1103p(int i10, long j10) {
        return C3308b0.m12017c(this.f1129a).m12250b(i10 == 0 ? 1.0f : 0.0f).m12253f(j10).m12255h(new b(i10));
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: q */
    public void mo1104q(InterfaceC0196i.a aVar, C0192e.a aVar2) {
        this.f1129a.m991L(aVar, aVar2);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: r */
    public void mo1105r(int i10) {
        this.f1129a.setVisibility(i10);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: s */
    public ViewGroup mo1106s() {
        return this.f1129a;
    }

    @Override // p187n.InterfaceC3635g0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C2572a.m10278b(getContext(), i10) : null);
    }

    @Override // p187n.InterfaceC3635g0
    public void setIcon(Drawable drawable) {
        this.f1133e = drawable;
        m1087J();
    }

    @Override // p187n.InterfaceC3635g0
    public void setTitle(CharSequence charSequence) {
        this.f1136h = true;
        m1084G(charSequence);
    }

    @Override // p187n.InterfaceC3635g0
    public void setWindowCallback(Window.Callback callback) {
        this.f1140l = callback;
    }

    @Override // p187n.InterfaceC3635g0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1136h) {
            return;
        }
        m1084G(charSequence);
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: t */
    public void mo1107t(boolean z10) {
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: u */
    public int mo1108u() {
        return this.f1130b;
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: v */
    public void mo1109v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: w */
    public void mo1110w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p187n.InterfaceC3635g0
    /* renamed from: x */
    public void mo1111x(boolean z10) {
        this.f1129a.setCollapsible(z10);
    }

    /* renamed from: y */
    public final int m1112y() {
        if (this.f1129a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1145q = this.f1129a.getNavigationIcon();
        return 15;
    }

    /* renamed from: z */
    public void m1113z(View view) {
        View view2 = this.f1132d;
        if (view2 != null && (this.f1130b & 16) != 0) {
            this.f1129a.removeView(view2);
        }
        this.f1132d = view;
        if (view == null || (this.f1130b & 16) == 0) {
            return;
        }
        this.f1129a.addView(view);
    }
}
