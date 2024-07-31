package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0196i;
import p089g.C1934d;
import p089g.C1937g;
import p148k0.C3308b0;
import p175m.AbstractC3488d;
import p187n.C3647m0;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0198k extends AbstractC3488d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: C */
    public static final int f815C = C1937g.f7478m;

    /* renamed from: B */
    public boolean f817B;

    /* renamed from: i */
    public final Context f818i;

    /* renamed from: j */
    public final C0192e f819j;

    /* renamed from: k */
    public final C0191d f820k;

    /* renamed from: l */
    public final boolean f821l;

    /* renamed from: m */
    public final int f822m;

    /* renamed from: n */
    public final int f823n;

    /* renamed from: o */
    public final int f824o;

    /* renamed from: p */
    public final C3647m0 f825p;

    /* renamed from: s */
    public PopupWindow.OnDismissListener f828s;

    /* renamed from: t */
    public View f829t;

    /* renamed from: u */
    public View f830u;

    /* renamed from: v */
    public InterfaceC0196i.a f831v;

    /* renamed from: w */
    public ViewTreeObserver f832w;

    /* renamed from: x */
    public boolean f833x;

    /* renamed from: y */
    public boolean f834y;

    /* renamed from: z */
    public int f835z;

    /* renamed from: q */
    public final ViewTreeObserver.OnGlobalLayoutListener f826q = new a();

    /* renamed from: r */
    public final View.OnAttachStateChangeListener f827r = new b();

    /* renamed from: A */
    public int f816A = 0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0198k.this.mo729a() || ViewOnKeyListenerC0198k.this.f825p.m13596w()) {
                return;
            }
            View view = ViewOnKeyListenerC0198k.this.f830u;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0198k.this.dismiss();
            } else {
                ViewOnKeyListenerC0198k.this.f825p.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0198k.this.f832w;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0198k.this.f832w = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0198k viewOnKeyListenerC0198k = ViewOnKeyListenerC0198k.this;
                viewOnKeyListenerC0198k.f832w.removeGlobalOnLayoutListener(viewOnKeyListenerC0198k.f826q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0198k(Context context, C0192e c0192e, View view, int i10, int i11, boolean z10) {
        this.f818i = context;
        this.f819j = c0192e;
        this.f821l = z10;
        this.f820k = new C0191d(c0192e, LayoutInflater.from(context), z10, f815C);
        this.f823n = i10;
        this.f824o = i11;
        Resources resources = context.getResources();
        this.f822m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1934d.f7367d));
        this.f829t = view;
        this.f825p = new C3647m0(context, null, i10, i11);
        c0192e.m785c(this, context);
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: a */
    public boolean mo729a() {
        return !this.f833x && this.f825p.mo729a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: b */
    public void mo709b(C0192e c0192e, boolean z10) {
        if (c0192e != this.f819j) {
            return;
        }
        dismiss();
        InterfaceC0196i.a aVar = this.f831v;
        if (aVar != null) {
            aVar.mo813b(c0192e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: c */
    public void mo710c(boolean z10) {
        this.f834y = false;
        C0191d c0191d = this.f820k;
        if (c0191d != null) {
            c0191d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: d */
    public boolean mo730d() {
        return false;
    }

    @Override // p175m.InterfaceC3490f
    public void dismiss() {
        if (mo729a()) {
            this.f825p.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: g */
    public void mo713g(InterfaceC0196i.a aVar) {
        this.f831v = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: i */
    public boolean mo715i(SubMenuC0199l subMenuC0199l) {
        if (subMenuC0199l.hasVisibleItems()) {
            C0195h c0195h = new C0195h(this.f818i, subMenuC0199l, this.f830u, this.f821l, this.f823n, this.f824o);
            c0195h.m853j(this.f831v);
            c0195h.m850g(AbstractC3488d.m12982w(subMenuC0199l));
            c0195h.m852i(this.f828s);
            this.f828s = null;
            this.f819j.m789e(false);
            int m13584f = this.f825p.m13584f();
            int m13588o = this.f825p.m13588o();
            if ((Gravity.getAbsoluteGravity(this.f816A, C3308b0.m12048v(this.f829t)) & 7) == 5) {
                m13584f += this.f829t.getWidth();
            }
            if (c0195h.m857n(m13584f, m13588o)) {
                InterfaceC0196i.a aVar = this.f831v;
                if (aVar == null) {
                    return true;
                }
                aVar.mo814c(subMenuC0199l);
                return true;
            }
        }
        return false;
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: j */
    public ListView mo731j() {
        return this.f825p.mo731j();
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: k */
    public void mo732k(C0192e c0192e) {
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: o */
    public void mo734o(View view) {
        this.f829t = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f833x = true;
        this.f819j.close();
        ViewTreeObserver viewTreeObserver = this.f832w;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f832w = this.f830u.getViewTreeObserver();
            }
            this.f832w.removeGlobalOnLayoutListener(this.f826q);
            this.f832w = null;
        }
        this.f830u.removeOnAttachStateChangeListener(this.f827r);
        PopupWindow.OnDismissListener onDismissListener = this.f828s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: q */
    public void mo735q(boolean z10) {
        this.f820k.m753d(z10);
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: r */
    public void mo736r(int i10) {
        this.f816A = i10;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: s */
    public void mo737s(int i10) {
        this.f825p.m13585g(i10);
    }

    @Override // p175m.InterfaceC3490f
    public void show() {
        if (!m859y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: t */
    public void mo738t(PopupWindow.OnDismissListener onDismissListener) {
        this.f828s = onDismissListener;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: u */
    public void mo739u(boolean z10) {
        this.f817B = z10;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: v */
    public void mo740v(int i10) {
        this.f825p.m13587l(i10);
    }

    /* renamed from: y */
    public final boolean m859y() {
        View view;
        if (mo729a()) {
            return true;
        }
        if (this.f833x || (view = this.f829t) == null) {
            return false;
        }
        this.f830u = view;
        this.f825p.m13575F(this);
        this.f825p.m13576G(this);
        this.f825p.m13574E(true);
        View view2 = this.f830u;
        boolean z10 = this.f832w == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f832w = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f826q);
        }
        view2.addOnAttachStateChangeListener(this.f827r);
        this.f825p.m13598y(view2);
        this.f825p.m13571B(this.f816A);
        if (!this.f834y) {
            this.f835z = AbstractC3488d.m12981n(this.f820k, null, this.f818i, this.f822m);
            this.f834y = true;
        }
        this.f825p.m13570A(this.f835z);
        this.f825p.m13573D(2);
        this.f825p.m13572C(m12984m());
        this.f825p.show();
        ListView mo731j = this.f825p.mo731j();
        mo731j.setOnKeyListener(this);
        if (this.f817B && this.f819j.m807x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f818i).inflate(C1937g.f7477l, (ViewGroup) mo731j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f819j.m807x());
            }
            frameLayout.setEnabled(false);
            mo731j.addHeaderView(frameLayout, null, false);
        }
        this.f825p.mo13589p(this.f820k);
        this.f825p.show();
        return true;
    }
}
