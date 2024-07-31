package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0192e;
import p187n.C3667w0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0192e.b, InterfaceC0197j, AdapterView.OnItemClickListener {

    /* renamed from: j */
    public static final int[] f655j = {R.attr.background, R.attr.divider};

    /* renamed from: h */
    public C0192e f656h;

    /* renamed from: i */
    public int f657i;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, f655j, i10, 0);
        if (m13717u.m13735r(0)) {
            setBackgroundDrawable(m13717u.m13723f(0));
        }
        if (m13717u.m13735r(1)) {
            setDivider(m13717u.m13723f(1));
        }
        m13717u.m13736v();
    }

    @Override // androidx.appcompat.view.menu.C0192e.b
    /* renamed from: a */
    public boolean mo700a(C0194g c0194g) {
        return this.f656h.m766L(c0194g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j
    /* renamed from: b */
    public void mo701b(C0192e c0192e) {
        this.f656h = c0192e;
    }

    public int getWindowAnimations() {
        return this.f657i;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo700a((C0194g) getAdapter().getItem(i10));
    }
}
