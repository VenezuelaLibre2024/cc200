package p175m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0191d;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.C0194g;
import androidx.appcompat.view.menu.InterfaceC0196i;

/* renamed from: m.d */
/* loaded from: classes.dex */
public abstract class AbstractC3488d implements InterfaceC3490f, InterfaceC0196i, AdapterView.OnItemClickListener {

    /* renamed from: h */
    public Rect f12251h;

    /* renamed from: n */
    public static int m12981n(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* renamed from: w */
    public static boolean m12982w(C0192e c0192e) {
        int size = c0192e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0192e.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static C0191d m12983x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0191d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0191d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: e */
    public boolean mo711e(C0192e c0192e, C0194g c0194g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: f */
    public boolean mo712f(C0192e c0192e, C0194g c0194g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: h */
    public void mo714h(Context context, C0192e c0192e) {
    }

    /* renamed from: k */
    public abstract void mo732k(C0192e c0192e);

    /* renamed from: l */
    public boolean mo733l() {
        return true;
    }

    /* renamed from: m */
    public Rect m12984m() {
        return this.f12251h;
    }

    /* renamed from: o */
    public abstract void mo734o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m12983x(listAdapter).f733h.m767M((MenuItem) listAdapter.getItem(i10), this, mo733l() ? 0 : 4);
    }

    /* renamed from: p */
    public void m12985p(Rect rect) {
        this.f12251h = rect;
    }

    /* renamed from: q */
    public abstract void mo735q(boolean z10);

    /* renamed from: r */
    public abstract void mo736r(int i10);

    /* renamed from: s */
    public abstract void mo737s(int i10);

    /* renamed from: t */
    public abstract void mo738t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo739u(boolean z10);

    /* renamed from: v */
    public abstract void mo740v(int i10);
}
