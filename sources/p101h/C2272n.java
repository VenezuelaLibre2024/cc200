package p101h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0242d;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p089g.C1931a;
import p089g.C1936f;
import p089g.C1940j;
import p101h.AbstractC2259a;
import p148k0.C3308b0;
import p148k0.C3320h0;
import p148k0.C3324j0;
import p148k0.InterfaceC3322i0;
import p148k0.InterfaceC3326k0;
import p162l.AbstractC3391b;
import p162l.C3390a;
import p162l.C3396g;
import p162l.C3397h;
import p187n.InterfaceC3635g0;

/* renamed from: h.n */
/* loaded from: classes.dex */
public class C2272n extends AbstractC2259a implements ActionBarOverlayLayout.InterfaceC0205d {

    /* renamed from: E */
    public static final Interpolator f9073E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f9074F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f9075A;

    /* renamed from: a */
    public Context f9079a;

    /* renamed from: b */
    public Context f9080b;

    /* renamed from: c */
    public Activity f9081c;

    /* renamed from: d */
    public ActionBarOverlayLayout f9082d;

    /* renamed from: e */
    public ActionBarContainer f9083e;

    /* renamed from: f */
    public InterfaceC3635g0 f9084f;

    /* renamed from: g */
    public ActionBarContextView f9085g;

    /* renamed from: h */
    public View f9086h;

    /* renamed from: i */
    public C0242d f9087i;

    /* renamed from: l */
    public boolean f9090l;

    /* renamed from: m */
    public d f9091m;

    /* renamed from: n */
    public AbstractC3391b f9092n;

    /* renamed from: o */
    public AbstractC3391b.a f9093o;

    /* renamed from: p */
    public boolean f9094p;

    /* renamed from: r */
    public boolean f9096r;

    /* renamed from: u */
    public boolean f9099u;

    /* renamed from: v */
    public boolean f9100v;

    /* renamed from: w */
    public boolean f9101w;

    /* renamed from: y */
    public C3397h f9103y;

    /* renamed from: z */
    public boolean f9104z;

    /* renamed from: j */
    public ArrayList<Object> f9088j = new ArrayList<>();

    /* renamed from: k */
    public int f9089k = -1;

    /* renamed from: q */
    public ArrayList<AbstractC2259a.b> f9095q = new ArrayList<>();

    /* renamed from: s */
    public int f9097s = 0;

    /* renamed from: t */
    public boolean f9098t = true;

    /* renamed from: x */
    public boolean f9102x = true;

    /* renamed from: B */
    public final InterfaceC3322i0 f9076B = new a();

    /* renamed from: C */
    public final InterfaceC3322i0 f9077C = new b();

    /* renamed from: D */
    public final InterfaceC3326k0 f9078D = new c();

    /* renamed from: h.n$a */
    /* loaded from: classes.dex */
    public class a extends C3324j0 {
        public a() {
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            View view2;
            C2272n c2272n = C2272n.this;
            if (c2272n.f9098t && (view2 = c2272n.f9086h) != null) {
                view2.setTranslationY(0.0f);
                C2272n.this.f9083e.setTranslationY(0.0f);
            }
            C2272n.this.f9083e.setVisibility(8);
            C2272n.this.f9083e.setTransitioning(false);
            C2272n c2272n2 = C2272n.this;
            c2272n2.f9103y = null;
            c2272n2.m9200D();
            ActionBarOverlayLayout actionBarOverlayLayout = C2272n.this.f9082d;
            if (actionBarOverlayLayout != null) {
                C3308b0.m12006T(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: h.n$b */
    /* loaded from: classes.dex */
    public class b extends C3324j0 {
        public b() {
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: b */
        public void mo1115b(View view) {
            C2272n c2272n = C2272n.this;
            c2272n.f9103y = null;
            c2272n.f9083e.requestLayout();
        }
    }

    /* renamed from: h.n$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3326k0 {
        public c() {
        }

        @Override // p148k0.InterfaceC3326k0
        /* renamed from: a */
        public void mo9218a(View view) {
            ((View) C2272n.this.f9083e.getParent()).invalidate();
        }
    }

    /* renamed from: h.n$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC3391b implements C0192e.a {

        /* renamed from: j */
        public final Context f9108j;

        /* renamed from: k */
        public final C0192e f9109k;

        /* renamed from: l */
        public AbstractC3391b.a f9110l;

        /* renamed from: m */
        public WeakReference<View> f9111m;

        public d(Context context, AbstractC3391b.a aVar) {
            this.f9108j = context;
            this.f9110l = aVar;
            C0192e m773S = new C0192e(context).m773S(1);
            this.f9109k = m773S;
            m773S.mo772R(this);
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: a */
        public boolean mo810a(C0192e c0192e, MenuItem menuItem) {
            AbstractC3391b.a aVar = this.f9110l;
            if (aVar != null) {
                return aVar.mo9128d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: b */
        public void mo811b(C0192e c0192e) {
            if (this.f9110l == null) {
                return;
            }
            mo9225k();
            C2272n.this.f9085g.m870l();
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: c */
        public void mo9219c() {
            C2272n c2272n = C2272n.this;
            if (c2272n.f9091m != this) {
                return;
            }
            if (C2272n.m9198C(c2272n.f9099u, c2272n.f9100v, false)) {
                this.f9110l.mo9127c(this);
            } else {
                C2272n c2272n2 = C2272n.this;
                c2272n2.f9092n = this;
                c2272n2.f9093o = this.f9110l;
            }
            this.f9110l = null;
            C2272n.this.m9199B(false);
            C2272n.this.f9085g.m865g();
            C2272n c2272n3 = C2272n.this;
            c2272n3.f9082d.setHideOnContentScrollEnabled(c2272n3.f9075A);
            C2272n.this.f9091m = null;
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: d */
        public View mo9220d() {
            WeakReference<View> weakReference = this.f9111m;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: e */
        public Menu mo9221e() {
            return this.f9109k;
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: f */
        public MenuInflater mo9222f() {
            return new C3396g(this.f9108j);
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: g */
        public CharSequence mo9223g() {
            return C2272n.this.f9085g.getSubtitle();
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: i */
        public CharSequence mo9224i() {
            return C2272n.this.f9085g.getTitle();
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: k */
        public void mo9225k() {
            if (C2272n.this.f9091m != this) {
                return;
            }
            this.f9109k.m788d0();
            try {
                this.f9110l.mo9126b(this, this.f9109k);
            } finally {
                this.f9109k.m786c0();
            }
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: l */
        public boolean mo9226l() {
            return C2272n.this.f9085g.m868j();
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: m */
        public void mo9227m(View view) {
            C2272n.this.f9085g.setCustomView(view);
            this.f9111m = new WeakReference<>(view);
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: n */
        public void mo9228n(int i10) {
            mo9229o(C2272n.this.f9079a.getResources().getString(i10));
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: o */
        public void mo9229o(CharSequence charSequence) {
            C2272n.this.f9085g.setSubtitle(charSequence);
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: q */
        public void mo9230q(int i10) {
            mo9231r(C2272n.this.f9079a.getResources().getString(i10));
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: r */
        public void mo9231r(CharSequence charSequence) {
            C2272n.this.f9085g.setTitle(charSequence);
        }

        @Override // p162l.AbstractC3391b
        /* renamed from: s */
        public void mo9232s(boolean z10) {
            super.mo9232s(z10);
            C2272n.this.f9085g.setTitleOptional(z10);
        }

        /* renamed from: t */
        public boolean m9233t() {
            this.f9109k.m788d0();
            try {
                return this.f9110l.mo9125a(this, this.f9109k);
            } finally {
                this.f9109k.m786c0();
            }
        }
    }

    public C2272n(Activity activity, boolean z10) {
        this.f9081c = activity;
        View decorView = activity.getWindow().getDecorView();
        m9208L(decorView);
        if (z10) {
            return;
        }
        this.f9086h = decorView.findViewById(R.id.content);
    }

    public C2272n(Dialog dialog) {
        m9208L(dialog.getWindow().getDecorView());
    }

    /* renamed from: C */
    public static boolean m9198C(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: A */
    public AbstractC3391b mo9003A(AbstractC3391b.a aVar) {
        d dVar = this.f9091m;
        if (dVar != null) {
            dVar.mo9219c();
        }
        this.f9082d.setHideOnContentScrollEnabled(false);
        this.f9085g.m869k();
        d dVar2 = new d(this.f9085g.getContext(), aVar);
        if (!dVar2.m9233t()) {
            return null;
        }
        this.f9091m = dVar2;
        dVar2.mo9225k();
        this.f9085g.m866h(dVar2);
        m9199B(true);
        return dVar2;
    }

    /* renamed from: B */
    public void m9199B(boolean z10) {
        C3320h0 mo1103p;
        C3320h0 mo864f;
        if (z10) {
            m9216T();
        } else {
            m9207K();
        }
        if (!m9215S()) {
            if (z10) {
                this.f9084f.mo1105r(4);
                this.f9085g.setVisibility(0);
                return;
            } else {
                this.f9084f.mo1105r(0);
                this.f9085g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            mo864f = this.f9084f.mo1103p(4, 100L);
            mo1103p = this.f9085g.mo864f(0, 200L);
        } else {
            mo1103p = this.f9084f.mo1103p(0, 200L);
            mo864f = this.f9085g.mo864f(8, 100L);
        }
        C3397h c3397h = new C3397h();
        c3397h.m12634d(mo864f, mo1103p);
        c3397h.m12638h();
    }

    /* renamed from: D */
    public void m9200D() {
        AbstractC3391b.a aVar = this.f9093o;
        if (aVar != null) {
            aVar.mo9127c(this.f9092n);
            this.f9092n = null;
            this.f9093o = null;
        }
    }

    /* renamed from: E */
    public void m9201E(boolean z10) {
        View view;
        C3397h c3397h = this.f9103y;
        if (c3397h != null) {
            c3397h.m12631a();
        }
        if (this.f9097s != 0 || (!this.f9104z && !z10)) {
            this.f9076B.mo1115b(null);
            return;
        }
        this.f9083e.setAlpha(1.0f);
        this.f9083e.setTransitioning(true);
        C3397h c3397h2 = new C3397h();
        float f10 = -this.f9083e.getHeight();
        if (z10) {
            this.f9083e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C3320h0 m12260m = C3308b0.m12017c(this.f9083e).m12260m(f10);
        m12260m.m12258k(this.f9078D);
        c3397h2.m12633c(m12260m);
        if (this.f9098t && (view = this.f9086h) != null) {
            c3397h2.m12633c(C3308b0.m12017c(view).m12260m(f10));
        }
        c3397h2.m12636f(f9073E);
        c3397h2.m12635e(250L);
        c3397h2.m12637g(this.f9076B);
        this.f9103y = c3397h2;
        c3397h2.m12638h();
    }

    /* renamed from: F */
    public void m9202F(boolean z10) {
        View view;
        View view2;
        C3397h c3397h = this.f9103y;
        if (c3397h != null) {
            c3397h.m12631a();
        }
        this.f9083e.setVisibility(0);
        if (this.f9097s == 0 && (this.f9104z || z10)) {
            this.f9083e.setTranslationY(0.0f);
            float f10 = -this.f9083e.getHeight();
            if (z10) {
                this.f9083e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f9083e.setTranslationY(f10);
            C3397h c3397h2 = new C3397h();
            C3320h0 m12260m = C3308b0.m12017c(this.f9083e).m12260m(0.0f);
            m12260m.m12258k(this.f9078D);
            c3397h2.m12633c(m12260m);
            if (this.f9098t && (view2 = this.f9086h) != null) {
                view2.setTranslationY(f10);
                c3397h2.m12633c(C3308b0.m12017c(this.f9086h).m12260m(0.0f));
            }
            c3397h2.m12636f(f9074F);
            c3397h2.m12635e(250L);
            c3397h2.m12637g(this.f9077C);
            this.f9103y = c3397h2;
            c3397h2.m12638h();
        } else {
            this.f9083e.setAlpha(1.0f);
            this.f9083e.setTranslationY(0.0f);
            if (this.f9098t && (view = this.f9086h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f9077C.mo1115b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9082d;
        if (actionBarOverlayLayout != null) {
            C3308b0.m12006T(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final InterfaceC3635g0 m9203G(View view) {
        if (view instanceof InterfaceC3635g0) {
            return (InterfaceC3635g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: H */
    public int m9204H() {
        return this.f9083e.getHeight();
    }

    /* renamed from: I */
    public int m9205I() {
        return this.f9082d.getActionBarHideOffset();
    }

    /* renamed from: J */
    public int m9206J() {
        return this.f9084f.mo1102o();
    }

    /* renamed from: K */
    public final void m9207K() {
        if (this.f9101w) {
            this.f9101w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f9082d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m9217U(false);
        }
    }

    /* renamed from: L */
    public final void m9208L(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1936f.f7455p);
        this.f9082d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f9084f = m9203G(view.findViewById(C1936f.f7440a));
        this.f9085g = (ActionBarContextView) view.findViewById(C1936f.f7445f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1936f.f7442c);
        this.f9083e = actionBarContainer;
        InterfaceC3635g0 interfaceC3635g0 = this.f9084f;
        if (interfaceC3635g0 == null || this.f9085g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f9079a = interfaceC3635g0.getContext();
        boolean z10 = (this.f9084f.mo1108u() & 4) != 0;
        if (z10) {
            this.f9090l = true;
        }
        C3390a m12599b = C3390a.m12599b(this.f9079a);
        m9214R(m12599b.m12600a() || z10);
        m9212P(m12599b.m12605g());
        TypedArray obtainStyledAttributes = this.f9079a.obtainStyledAttributes(null, C1940j.f7613a, C1931a.f7331c, 0);
        if (obtainStyledAttributes.getBoolean(C1940j.f7663k, false)) {
            m9213Q(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1940j.f7653i, 0);
        if (dimensionPixelSize != 0) {
            m9211O(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: M */
    public void m9209M(boolean z10) {
        m9210N(z10 ? 4 : 0, 4);
    }

    /* renamed from: N */
    public void m9210N(int i10, int i11) {
        int mo1108u = this.f9084f.mo1108u();
        if ((i11 & 4) != 0) {
            this.f9090l = true;
        }
        this.f9084f.mo1099l((i10 & i11) | ((~i11) & mo1108u));
    }

    /* renamed from: O */
    public void m9211O(float f10) {
        C3308b0.m12020d0(this.f9083e, f10);
    }

    /* renamed from: P */
    public final void m9212P(boolean z10) {
        this.f9096r = z10;
        if (z10) {
            this.f9083e.setTabContainer(null);
            this.f9084f.mo1097j(this.f9087i);
        } else {
            this.f9084f.mo1097j(null);
            this.f9083e.setTabContainer(this.f9087i);
        }
        boolean z11 = m9206J() == 2;
        C0242d c0242d = this.f9087i;
        if (c0242d != null) {
            if (z11) {
                c0242d.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9082d;
                if (actionBarOverlayLayout != null) {
                    C3308b0.m12006T(actionBarOverlayLayout);
                }
            } else {
                c0242d.setVisibility(8);
            }
        }
        this.f9084f.mo1111x(!this.f9096r && z11);
        this.f9082d.setHasNonEmbeddedTabs(!this.f9096r && z11);
    }

    /* renamed from: Q */
    public void m9213Q(boolean z10) {
        if (z10 && !this.f9082d.m887q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f9075A = z10;
        this.f9082d.setHideOnContentScrollEnabled(z10);
    }

    /* renamed from: R */
    public void m9214R(boolean z10) {
        this.f9084f.mo1107t(z10);
    }

    /* renamed from: S */
    public final boolean m9215S() {
        return C3308b0.m11993G(this.f9083e);
    }

    /* renamed from: T */
    public final void m9216T() {
        if (this.f9101w) {
            return;
        }
        this.f9101w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9082d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m9217U(false);
    }

    /* renamed from: U */
    public final void m9217U(boolean z10) {
        if (m9198C(this.f9099u, this.f9100v, this.f9101w)) {
            if (this.f9102x) {
                return;
            }
            this.f9102x = true;
            m9202F(z10);
            return;
        }
        if (this.f9102x) {
            this.f9102x = false;
            m9201E(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: a */
    public void mo893a() {
        if (this.f9100v) {
            this.f9100v = false;
            m9217U(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: b */
    public void mo894b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: c */
    public void mo895c(boolean z10) {
        this.f9098t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: d */
    public void mo896d() {
        if (this.f9100v) {
            return;
        }
        this.f9100v = true;
        m9217U(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: e */
    public void mo897e() {
        C3397h c3397h = this.f9103y;
        if (c3397h != null) {
            c3397h.m12631a();
            this.f9103y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0205d
    /* renamed from: f */
    public void mo898f(int i10) {
        this.f9097s = i10;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: h */
    public boolean mo9005h() {
        InterfaceC3635g0 interfaceC3635g0 = this.f9084f;
        if (interfaceC3635g0 == null || !interfaceC3635g0.mo1098k()) {
            return false;
        }
        this.f9084f.collapseActionView();
        return true;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: i */
    public void mo9006i(boolean z10) {
        if (z10 == this.f9094p) {
            return;
        }
        this.f9094p = z10;
        int size = this.f9095q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9095q.get(i10).m9024a(z10);
        }
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: j */
    public int mo9007j() {
        return this.f9084f.mo1108u();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: k */
    public Context mo9008k() {
        if (this.f9080b == null) {
            TypedValue typedValue = new TypedValue();
            this.f9079a.getTheme().resolveAttribute(C1931a.f7335g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f9080b = new ContextThemeWrapper(this.f9079a, i10);
            } else {
                this.f9080b = this.f9079a;
            }
        }
        return this.f9080b;
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: l */
    public void mo9009l() {
        if (this.f9099u) {
            return;
        }
        this.f9099u = true;
        m9217U(false);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: n */
    public boolean mo9011n() {
        int m9204H = m9204H();
        return this.f9102x && (m9204H == 0 || m9205I() < m9204H);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: o */
    public void mo9012o(Configuration configuration) {
        m9212P(C3390a.m12599b(this.f9079a).m12605g());
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: q */
    public boolean mo9014q(int i10, KeyEvent keyEvent) {
        Menu mo9221e;
        d dVar = this.f9091m;
        if (dVar == null || (mo9221e = dVar.mo9221e()) == null) {
            return false;
        }
        mo9221e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo9221e.performShortcut(i10, keyEvent, 0);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: t */
    public void mo9017t(Drawable drawable) {
        this.f9083e.setPrimaryBackground(drawable);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: u */
    public void mo9018u(boolean z10) {
        if (this.f9090l) {
            return;
        }
        m9209M(z10);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: v */
    public void mo9019v(boolean z10) {
        m9210N(z10 ? 8 : 0, 8);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: w */
    public void mo9020w(boolean z10) {
        C3397h c3397h;
        this.f9104z = z10;
        if (z10 || (c3397h = this.f9103y) == null) {
            return;
        }
        c3397h.m12631a();
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: x */
    public void mo9021x(CharSequence charSequence) {
        this.f9084f.setTitle(charSequence);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: y */
    public void mo9022y(CharSequence charSequence) {
        this.f9084f.setWindowTitle(charSequence);
    }

    @Override // p101h.AbstractC2259a
    /* renamed from: z */
    public void mo9023z() {
        if (this.f9099u) {
            this.f9099u = false;
            m9217U(false);
        }
    }
}
