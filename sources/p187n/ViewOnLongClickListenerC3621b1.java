package p187n;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p148k0.C3308b0;
import p148k0.C3312d0;

/* renamed from: n.b1 */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC3621b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: r */
    public static ViewOnLongClickListenerC3621b1 f12785r;

    /* renamed from: s */
    public static ViewOnLongClickListenerC3621b1 f12786s;

    /* renamed from: h */
    public final View f12787h;

    /* renamed from: i */
    public final CharSequence f12788i;

    /* renamed from: j */
    public final int f12789j;

    /* renamed from: k */
    public final Runnable f12790k = new Runnable() { // from class: n.a1
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC3621b1.this.m13435e();
        }
    };

    /* renamed from: l */
    public final Runnable f12791l = new Runnable() { // from class: n.z0
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC3621b1.this.m13440d();
        }
    };

    /* renamed from: m */
    public int f12792m;

    /* renamed from: n */
    public int f12793n;

    /* renamed from: o */
    public C3624c1 f12794o;

    /* renamed from: p */
    public boolean f12795p;

    /* renamed from: q */
    public boolean f12796q;

    public ViewOnLongClickListenerC3621b1(View view, CharSequence charSequence) {
        this.f12787h = view;
        this.f12788i = charSequence;
        this.f12789j = C3312d0.m12207a(ViewConfiguration.get(view.getContext()));
        m13439c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m13435e() {
        m13442i(false);
    }

    /* renamed from: g */
    public static void m13436g(ViewOnLongClickListenerC3621b1 viewOnLongClickListenerC3621b1) {
        ViewOnLongClickListenerC3621b1 viewOnLongClickListenerC3621b12 = f12785r;
        if (viewOnLongClickListenerC3621b12 != null) {
            viewOnLongClickListenerC3621b12.m13438b();
        }
        f12785r = viewOnLongClickListenerC3621b1;
        if (viewOnLongClickListenerC3621b1 != null) {
            viewOnLongClickListenerC3621b1.m13441f();
        }
    }

    /* renamed from: h */
    public static void m13437h(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC3621b1 viewOnLongClickListenerC3621b1 = f12785r;
        if (viewOnLongClickListenerC3621b1 != null && viewOnLongClickListenerC3621b1.f12787h == view) {
            m13436g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC3621b1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC3621b1 viewOnLongClickListenerC3621b12 = f12786s;
        if (viewOnLongClickListenerC3621b12 != null && viewOnLongClickListenerC3621b12.f12787h == view) {
            viewOnLongClickListenerC3621b12.m13440d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: b */
    public final void m13438b() {
        this.f12787h.removeCallbacks(this.f12790k);
    }

    /* renamed from: c */
    public final void m13439c() {
        this.f12796q = true;
    }

    /* renamed from: d */
    public void m13440d() {
        if (f12786s == this) {
            f12786s = null;
            C3624c1 c3624c1 = this.f12794o;
            if (c3624c1 != null) {
                c3624c1.m13448c();
                this.f12794o = null;
                m13439c();
                this.f12787h.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f12785r == this) {
            m13436g(null);
        }
        this.f12787h.removeCallbacks(this.f12791l);
    }

    /* renamed from: f */
    public final void m13441f() {
        this.f12787h.postDelayed(this.f12790k, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m13442i(boolean z10) {
        long longPressTimeout;
        if (C3308b0.m11992F(this.f12787h)) {
            m13436g(null);
            ViewOnLongClickListenerC3621b1 viewOnLongClickListenerC3621b1 = f12786s;
            if (viewOnLongClickListenerC3621b1 != null) {
                viewOnLongClickListenerC3621b1.m13440d();
            }
            f12786s = this;
            this.f12795p = z10;
            C3624c1 c3624c1 = new C3624c1(this.f12787h.getContext());
            this.f12794o = c3624c1;
            c3624c1.m13450e(this.f12787h, this.f12792m, this.f12793n, this.f12795p, this.f12788i);
            this.f12787h.addOnAttachStateChangeListener(this);
            if (this.f12795p) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C3308b0.m11988B(this.f12787h) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f12787h.removeCallbacks(this.f12791l);
            this.f12787h.postDelayed(this.f12791l, longPressTimeout);
        }
    }

    /* renamed from: j */
    public final boolean m13443j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f12796q && Math.abs(x10 - this.f12792m) <= this.f12789j && Math.abs(y10 - this.f12793n) <= this.f12789j) {
            return false;
        }
        this.f12792m = x10;
        this.f12793n = y10;
        this.f12796q = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f12794o != null && this.f12795p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f12787h.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m13439c();
                m13440d();
            }
        } else if (this.f12787h.isEnabled() && this.f12794o == null && m13443j(motionEvent)) {
            m13436g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f12792m = view.getWidth() / 2;
        this.f12793n = view.getHeight() / 2;
        m13442i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m13440d();
    }
}
