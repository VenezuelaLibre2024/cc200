package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0196i;
import p089g.C1934d;
import p148k0.C3308b0;
import p148k0.C3313e;
import p175m.AbstractC3488d;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public class C0195h {

    /* renamed from: a */
    public final Context f802a;

    /* renamed from: b */
    public final C0192e f803b;

    /* renamed from: c */
    public final boolean f804c;

    /* renamed from: d */
    public final int f805d;

    /* renamed from: e */
    public final int f806e;

    /* renamed from: f */
    public View f807f;

    /* renamed from: g */
    public int f808g;

    /* renamed from: h */
    public boolean f809h;

    /* renamed from: i */
    public InterfaceC0196i.a f810i;

    /* renamed from: j */
    public AbstractC3488d f811j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f812k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f813l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0195h.this.mo848e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m858a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0195h(Context context, C0192e c0192e, View view, boolean z10, int i10) {
        this(context, c0192e, view, z10, i10, 0);
    }

    public C0195h(Context context, C0192e c0192e, View view, boolean z10, int i10, int i11) {
        this.f808g = 8388611;
        this.f813l = new a();
        this.f802a = context;
        this.f803b = c0192e;
        this.f807f = view;
        this.f804c = z10;
        this.f805d = i10;
        this.f806e = i11;
    }

    /* renamed from: a */
    public final AbstractC3488d m844a() {
        Display defaultDisplay = ((WindowManager) this.f802a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            b.m858a(defaultDisplay, point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC3488d viewOnKeyListenerC0189b = Math.min(point.x, point.y) >= this.f802a.getResources().getDimensionPixelSize(C1934d.f7366c) ? new ViewOnKeyListenerC0189b(this.f802a, this.f807f, this.f805d, this.f806e, this.f804c) : new ViewOnKeyListenerC0198k(this.f802a, this.f803b, this.f807f, this.f805d, this.f806e, this.f804c);
        viewOnKeyListenerC0189b.mo732k(this.f803b);
        viewOnKeyListenerC0189b.mo738t(this.f813l);
        viewOnKeyListenerC0189b.mo734o(this.f807f);
        viewOnKeyListenerC0189b.mo713g(this.f810i);
        viewOnKeyListenerC0189b.mo735q(this.f809h);
        viewOnKeyListenerC0189b.mo736r(this.f808g);
        return viewOnKeyListenerC0189b;
    }

    /* renamed from: b */
    public void m845b() {
        if (m847d()) {
            this.f811j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC3488d m846c() {
        if (this.f811j == null) {
            this.f811j = m844a();
        }
        return this.f811j;
    }

    /* renamed from: d */
    public boolean m847d() {
        AbstractC3488d abstractC3488d = this.f811j;
        return abstractC3488d != null && abstractC3488d.mo729a();
    }

    /* renamed from: e */
    public void mo848e() {
        this.f811j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f812k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m849f(View view) {
        this.f807f = view;
    }

    /* renamed from: g */
    public void m850g(boolean z10) {
        this.f809h = z10;
        AbstractC3488d abstractC3488d = this.f811j;
        if (abstractC3488d != null) {
            abstractC3488d.mo735q(z10);
        }
    }

    /* renamed from: h */
    public void m851h(int i10) {
        this.f808g = i10;
    }

    /* renamed from: i */
    public void m852i(PopupWindow.OnDismissListener onDismissListener) {
        this.f812k = onDismissListener;
    }

    /* renamed from: j */
    public void m853j(InterfaceC0196i.a aVar) {
        this.f810i = aVar;
        AbstractC3488d abstractC3488d = this.f811j;
        if (abstractC3488d != null) {
            abstractC3488d.mo713g(aVar);
        }
    }

    /* renamed from: k */
    public void m854k() {
        if (!m856m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void m855l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC3488d m846c = m846c();
        m846c.mo739u(z11);
        if (z10) {
            if ((C3313e.m12211a(this.f808g, C3308b0.m12048v(this.f807f)) & 7) == 5) {
                i10 -= this.f807f.getWidth();
            }
            m846c.mo737s(i10);
            m846c.mo740v(i11);
            int i12 = (int) ((this.f802a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m846c.m12985p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        m846c.show();
    }

    /* renamed from: m */
    public boolean m856m() {
        if (m847d()) {
            return true;
        }
        if (this.f807f == null) {
            return false;
        }
        m855l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m857n(int i10, int i11) {
        if (m847d()) {
            return true;
        }
        if (this.f807f == null) {
            return false;
        }
        m855l(i10, i11, true, true);
        return true;
    }
}
