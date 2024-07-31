package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0196i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089g.C1934d;
import p089g.C1937g;
import p148k0.C3308b0;
import p148k0.C3313e;
import p175m.AbstractC3488d;
import p187n.C3647m0;
import p187n.InterfaceC3645l0;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0189b extends AbstractC3488d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: I */
    public static final int f685I = C1937g.f7470e;

    /* renamed from: A */
    public int f686A;

    /* renamed from: B */
    public int f687B;

    /* renamed from: D */
    public boolean f689D;

    /* renamed from: E */
    public InterfaceC0196i.a f690E;

    /* renamed from: F */
    public ViewTreeObserver f691F;

    /* renamed from: G */
    public PopupWindow.OnDismissListener f692G;

    /* renamed from: H */
    public boolean f693H;

    /* renamed from: i */
    public final Context f694i;

    /* renamed from: j */
    public final int f695j;

    /* renamed from: k */
    public final int f696k;

    /* renamed from: l */
    public final int f697l;

    /* renamed from: m */
    public final boolean f698m;

    /* renamed from: n */
    public final Handler f699n;

    /* renamed from: v */
    public View f707v;

    /* renamed from: w */
    public View f708w;

    /* renamed from: y */
    public boolean f710y;

    /* renamed from: z */
    public boolean f711z;

    /* renamed from: o */
    public final List<C0192e> f700o = new ArrayList();

    /* renamed from: p */
    public final List<d> f701p = new ArrayList();

    /* renamed from: q */
    public final ViewTreeObserver.OnGlobalLayoutListener f702q = new a();

    /* renamed from: r */
    public final View.OnAttachStateChangeListener f703r = new b();

    /* renamed from: s */
    public final InterfaceC3645l0 f704s = new c();

    /* renamed from: t */
    public int f705t = 0;

    /* renamed from: u */
    public int f706u = 0;

    /* renamed from: C */
    public boolean f688C = false;

    /* renamed from: x */
    public int f709x = m726C();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0189b.this.mo729a() || ViewOnKeyListenerC0189b.this.f701p.size() <= 0 || ViewOnKeyListenerC0189b.this.f701p.get(0).f719a.m13596w()) {
                return;
            }
            View view = ViewOnKeyListenerC0189b.this.f708w;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0189b.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0189b.this.f701p.iterator();
            while (it.hasNext()) {
                it.next().f719a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0189b.this.f691F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0189b.this.f691F = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0189b viewOnKeyListenerC0189b = ViewOnKeyListenerC0189b.this;
                viewOnKeyListenerC0189b.f691F.removeGlobalOnLayoutListener(viewOnKeyListenerC0189b.f702q);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3645l0 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ d f715h;

            /* renamed from: i */
            public final /* synthetic */ MenuItem f716i;

            /* renamed from: j */
            public final /* synthetic */ C0192e f717j;

            public a(d dVar, MenuItem menuItem, C0192e c0192e) {
                this.f715h = dVar;
                this.f716i = menuItem;
                this.f717j = c0192e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f715h;
                if (dVar != null) {
                    ViewOnKeyListenerC0189b.this.f693H = true;
                    dVar.f720b.m789e(false);
                    ViewOnKeyListenerC0189b.this.f693H = false;
                }
                if (this.f716i.isEnabled() && this.f716i.hasSubMenu()) {
                    this.f717j.m766L(this.f716i, 4);
                }
            }
        }

        public c() {
        }

        @Override // p187n.InterfaceC3645l0
        /* renamed from: b */
        public void mo743b(C0192e c0192e, MenuItem menuItem) {
            ViewOnKeyListenerC0189b.this.f699n.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0189b.this.f701p.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0192e == ViewOnKeyListenerC0189b.this.f701p.get(i10).f720b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            ViewOnKeyListenerC0189b.this.f699n.postAtTime(new a(i11 < ViewOnKeyListenerC0189b.this.f701p.size() ? ViewOnKeyListenerC0189b.this.f701p.get(i11) : null, menuItem, c0192e), c0192e, SystemClock.uptimeMillis() + 200);
        }

        @Override // p187n.InterfaceC3645l0
        /* renamed from: c */
        public void mo744c(C0192e c0192e, MenuItem menuItem) {
            ViewOnKeyListenerC0189b.this.f699n.removeCallbacksAndMessages(c0192e);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final C3647m0 f719a;

        /* renamed from: b */
        public final C0192e f720b;

        /* renamed from: c */
        public final int f721c;

        public d(C3647m0 c3647m0, C0192e c0192e, int i10) {
            this.f719a = c3647m0;
            this.f720b = c0192e;
            this.f721c = i10;
        }

        /* renamed from: a */
        public ListView m745a() {
            return this.f719a.mo731j();
        }
    }

    public ViewOnKeyListenerC0189b(Context context, View view, int i10, int i11, boolean z10) {
        this.f694i = context;
        this.f707v = view;
        this.f696k = i10;
        this.f697l = i11;
        this.f698m = z10;
        Resources resources = context.getResources();
        this.f695j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1934d.f7367d));
        this.f699n = new Handler();
    }

    /* renamed from: A */
    public final MenuItem m724A(C0192e c0192e, C0192e c0192e2) {
        int size = c0192e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0192e.getItem(i10);
            if (item.hasSubMenu() && c0192e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: B */
    public final View m725B(d dVar, C0192e c0192e) {
        C0191d c0191d;
        int i10;
        int firstVisiblePosition;
        MenuItem m724A = m724A(dVar.f720b, c0192e);
        if (m724A == null) {
            return null;
        }
        ListView m745a = dVar.m745a();
        ListAdapter adapter = m745a.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            c0191d = (C0191d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0191d = (C0191d) adapter;
            i10 = 0;
        }
        int count = c0191d.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (m724A == c0191d.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - m745a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m745a.getChildCount()) {
            return m745a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: C */
    public final int m726C() {
        return C3308b0.m12048v(this.f707v) == 1 ? 0 : 1;
    }

    /* renamed from: D */
    public final int m727D(int i10) {
        List<d> list = this.f701p;
        ListView m745a = list.get(list.size() - 1).m745a();
        int[] iArr = new int[2];
        m745a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f708w.getWindowVisibleDisplayFrame(rect);
        return this.f709x == 1 ? (iArr[0] + m745a.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    /* renamed from: E */
    public final void m728E(C0192e c0192e) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f694i);
        C0191d c0191d = new C0191d(c0192e, from, this.f698m, f685I);
        if (!mo729a() && this.f688C) {
            c0191d.m753d(true);
        } else if (mo729a()) {
            c0191d.m753d(AbstractC3488d.m12982w(c0192e));
        }
        int m12981n = AbstractC3488d.m12981n(c0191d, null, this.f694i, this.f695j);
        C3647m0 m741y = m741y();
        m741y.mo13589p(c0191d);
        m741y.m13570A(m12981n);
        m741y.m13571B(this.f706u);
        if (this.f701p.size() > 0) {
            List<d> list = this.f701p;
            dVar = list.get(list.size() - 1);
            view = m725B(dVar, c0192e);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m741y.m13615P(false);
            m741y.m13612M(null);
            int m727D = m727D(m12981n);
            boolean z10 = m727D == 1;
            this.f709x = m727D;
            if (Build.VERSION.SDK_INT >= 26) {
                m741y.m13598y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f707v.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f706u & 7) == 5) {
                    iArr[0] = iArr[0] + this.f707v.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f706u & 5) == 5) {
                if (!z10) {
                    m12981n = view.getWidth();
                    i12 = i10 - m12981n;
                }
                i12 = i10 + m12981n;
            } else {
                if (z10) {
                    m12981n = view.getWidth();
                    i12 = i10 + m12981n;
                }
                i12 = i10 - m12981n;
            }
            m741y.m13585g(i12);
            m741y.m13577H(true);
            m741y.m13587l(i11);
        } else {
            if (this.f710y) {
                m741y.m13585g(this.f686A);
            }
            if (this.f711z) {
                m741y.m13587l(this.f687B);
            }
            m741y.m13572C(m12984m());
        }
        this.f701p.add(new d(m741y, c0192e, this.f709x));
        m741y.show();
        ListView mo731j = m741y.mo731j();
        mo731j.setOnKeyListener(this);
        if (dVar == null && this.f689D && c0192e.m807x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1937g.f7477l, (ViewGroup) mo731j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0192e.m807x());
            mo731j.addHeaderView(frameLayout, null, false);
            m741y.show();
        }
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: a */
    public boolean mo729a() {
        return this.f701p.size() > 0 && this.f701p.get(0).f719a.mo729a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: b */
    public void mo709b(C0192e c0192e, boolean z10) {
        int m742z = m742z(c0192e);
        if (m742z < 0) {
            return;
        }
        int i10 = m742z + 1;
        if (i10 < this.f701p.size()) {
            this.f701p.get(i10).f720b.m789e(false);
        }
        d remove = this.f701p.remove(m742z);
        remove.f720b.m769O(this);
        if (this.f693H) {
            remove.f719a.m13613N(null);
            remove.f719a.m13599z(0);
        }
        remove.f719a.dismiss();
        int size = this.f701p.size();
        this.f709x = size > 0 ? this.f701p.get(size - 1).f721c : m726C();
        if (size != 0) {
            if (z10) {
                this.f701p.get(0).f720b.m789e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0196i.a aVar = this.f690E;
        if (aVar != null) {
            aVar.mo813b(c0192e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f691F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f691F.removeGlobalOnLayoutListener(this.f702q);
            }
            this.f691F = null;
        }
        this.f708w.removeOnAttachStateChangeListener(this.f703r);
        this.f692G.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: c */
    public void mo710c(boolean z10) {
        Iterator<d> it = this.f701p.iterator();
        while (it.hasNext()) {
            AbstractC3488d.m12983x(it.next().m745a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: d */
    public boolean mo730d() {
        return false;
    }

    @Override // p175m.InterfaceC3490f
    public void dismiss() {
        int size = this.f701p.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f701p.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f719a.mo729a()) {
                    dVar.f719a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: g */
    public void mo713g(InterfaceC0196i.a aVar) {
        this.f690E = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: i */
    public boolean mo715i(SubMenuC0199l subMenuC0199l) {
        for (d dVar : this.f701p) {
            if (subMenuC0199l == dVar.f720b) {
                dVar.m745a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0199l.hasVisibleItems()) {
            return false;
        }
        mo732k(subMenuC0199l);
        InterfaceC0196i.a aVar = this.f690E;
        if (aVar != null) {
            aVar.mo814c(subMenuC0199l);
        }
        return true;
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: j */
    public ListView mo731j() {
        if (this.f701p.isEmpty()) {
            return null;
        }
        return this.f701p.get(r0.size() - 1).m745a();
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: k */
    public void mo732k(C0192e c0192e) {
        c0192e.m785c(this, this.f694i);
        if (mo729a()) {
            m728E(c0192e);
        } else {
            this.f700o.add(c0192e);
        }
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: l */
    public boolean mo733l() {
        return false;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: o */
    public void mo734o(View view) {
        if (this.f707v != view) {
            this.f707v = view;
            this.f706u = C3313e.m12211a(this.f705t, C3308b0.m12048v(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f701p.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f701p.get(i10);
            if (!dVar.f719a.mo729a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f720b.m789e(false);
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
        this.f688C = z10;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: r */
    public void mo736r(int i10) {
        if (this.f705t != i10) {
            this.f705t = i10;
            this.f706u = C3313e.m12211a(i10, C3308b0.m12048v(this.f707v));
        }
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: s */
    public void mo737s(int i10) {
        this.f710y = true;
        this.f686A = i10;
    }

    @Override // p175m.InterfaceC3490f
    public void show() {
        if (mo729a()) {
            return;
        }
        Iterator<C0192e> it = this.f700o.iterator();
        while (it.hasNext()) {
            m728E(it.next());
        }
        this.f700o.clear();
        View view = this.f707v;
        this.f708w = view;
        if (view != null) {
            boolean z10 = this.f691F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f691F = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f702q);
            }
            this.f708w.addOnAttachStateChangeListener(this.f703r);
        }
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: t */
    public void mo738t(PopupWindow.OnDismissListener onDismissListener) {
        this.f692G = onDismissListener;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: u */
    public void mo739u(boolean z10) {
        this.f689D = z10;
    }

    @Override // p175m.AbstractC3488d
    /* renamed from: v */
    public void mo740v(int i10) {
        this.f711z = true;
        this.f687B = i10;
    }

    /* renamed from: y */
    public final C3647m0 m741y() {
        C3647m0 c3647m0 = new C3647m0(this.f694i, null, this.f696k, this.f697l);
        c3647m0.m13614O(this.f704s);
        c3647m0.m13576G(this);
        c3647m0.m13575F(this);
        c3647m0.m13598y(this.f707v);
        c3647m0.m13571B(this.f706u);
        c3647m0.m13574E(true);
        c3647m0.m13573D(2);
        return c3647m0;
    }

    /* renamed from: z */
    public final int m742z(C0192e c0192e) {
        int size = this.f701p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0192e == this.f701p.get(i10).f720b) {
                return i10;
            }
        }
        return -1;
    }
}
