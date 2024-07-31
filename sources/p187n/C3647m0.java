package p187n;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0191d;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.C0194g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: n.m0 */
/* loaded from: classes.dex */
public class C3647m0 extends C3643k0 implements InterfaceC3645l0 {

    /* renamed from: R */
    public static Method f12957R;

    /* renamed from: Q */
    public InterfaceC3645l0 f12958Q;

    /* renamed from: n.m0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13616a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m13617b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: n.m0$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m13618a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* renamed from: n.m0$c */
    /* loaded from: classes.dex */
    public static class c extends C3639i0 {

        /* renamed from: v */
        public final int f12959v;

        /* renamed from: w */
        public final int f12960w;

        /* renamed from: x */
        public InterfaceC3645l0 f12961x;

        /* renamed from: y */
        public MenuItem f12962y;

        /* renamed from: n.m0$c$a */
        /* loaded from: classes.dex */
        public static class a {
            /* renamed from: a */
            public static int m13619a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != a.m13619a(configuration)) {
                this.f12959v = 22;
                this.f12960w = 21;
            } else {
                this.f12959v = 21;
                this.f12960w = 22;
            }
        }

        @Override // p187n.C3639i0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo13526d(int i10, int i11, int i12, int i13, int i14) {
            return super.mo13526d(i10, i11, i12, i13, i14);
        }

        @Override // p187n.C3639i0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo13527e(MotionEvent motionEvent, int i10) {
            return super.mo13527e(motionEvent, i10);
        }

        @Override // p187n.C3639i0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p187n.C3639i0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p187n.C3639i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p187n.C3639i0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p187n.C3639i0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.f12961x != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                C0191d c0191d = (C0191d) adapter;
                C0194g c0194g = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < c0191d.getCount()) {
                    c0194g = c0191d.getItem(i11);
                }
                MenuItem menuItem = this.f12962y;
                if (menuItem != c0194g) {
                    C0192e m751b = c0191d.m751b();
                    if (menuItem != null) {
                        this.f12961x.mo744c(m751b, menuItem);
                    }
                    this.f12962y = c0194g;
                    if (c0194g != null) {
                        this.f12961x.mo743b(m751b, c0194g);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f12959v) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f12960w) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0191d) adapter).m751b().m789e(false);
            return true;
        }

        @Override // p187n.C3639i0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC3645l0 interfaceC3645l0) {
            this.f12961x = interfaceC3645l0;
        }

        @Override // p187n.C3639i0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f12957R = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C3647m0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* renamed from: M */
    public void m13612M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.m13616a(this.f12926M, (Transition) obj);
        }
    }

    /* renamed from: N */
    public void m13613N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.m13617b(this.f12926M, (Transition) obj);
        }
    }

    /* renamed from: O */
    public void m13614O(InterfaceC3645l0 interfaceC3645l0) {
        this.f12958Q = interfaceC3645l0;
    }

    /* renamed from: P */
    public void m13615P(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m13618a(this.f12926M, z10);
            return;
        }
        Method method = f12957R;
        if (method != null) {
            try {
                method.invoke(this.f12926M, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // p187n.InterfaceC3645l0
    /* renamed from: b */
    public void mo743b(C0192e c0192e, MenuItem menuItem) {
        InterfaceC3645l0 interfaceC3645l0 = this.f12958Q;
        if (interfaceC3645l0 != null) {
            interfaceC3645l0.mo743b(c0192e, menuItem);
        }
    }

    @Override // p187n.InterfaceC3645l0
    /* renamed from: c */
    public void mo744c(C0192e c0192e, MenuItem menuItem) {
        InterfaceC3645l0 interfaceC3645l0 = this.f12958Q;
        if (interfaceC3645l0 != null) {
            interfaceC3645l0.mo744c(c0192e, menuItem);
        }
    }

    @Override // p187n.C3643k0
    /* renamed from: r */
    public C3639i0 mo13591r(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
