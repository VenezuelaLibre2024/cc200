package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0188a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.C0194g;
import androidx.appcompat.view.menu.C0195h;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.InterfaceC0197j;
import androidx.appcompat.view.menu.SubMenuC0199l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p015b0.C0436a;
import p089g.C1931a;
import p089g.C1937g;
import p148k0.AbstractC3307b;
import p162l.C3390a;
import p175m.InterfaceC3490f;
import p187n.AbstractViewOnTouchListenerC3641j0;
import p187n.C3654q;
import p187n.C3671y0;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public class C0239a extends AbstractC0188a implements AbstractC3307b.a {

    /* renamed from: A */
    public boolean f1065A;

    /* renamed from: B */
    public boolean f1066B;

    /* renamed from: C */
    public boolean f1067C;

    /* renamed from: D */
    public int f1068D;

    /* renamed from: E */
    public final SparseBooleanArray f1069E;

    /* renamed from: F */
    public e f1070F;

    /* renamed from: G */
    public a f1071G;

    /* renamed from: H */
    public c f1072H;

    /* renamed from: I */
    public b f1073I;

    /* renamed from: J */
    public final f f1074J;

    /* renamed from: K */
    public int f1075K;

    /* renamed from: r */
    public d f1076r;

    /* renamed from: s */
    public Drawable f1077s;

    /* renamed from: t */
    public boolean f1078t;

    /* renamed from: u */
    public boolean f1079u;

    /* renamed from: v */
    public boolean f1080v;

    /* renamed from: w */
    public int f1081w;

    /* renamed from: x */
    public int f1082x;

    /* renamed from: y */
    public int f1083y;

    /* renamed from: z */
    public boolean f1084z;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class a extends C0195h {
        public a(Context context, SubMenuC0199l subMenuC0199l, View view) {
            super(context, subMenuC0199l, view, false, C1931a.f7340l);
            if (!((C0194g) subMenuC0199l.getItem()).m829l()) {
                View view2 = C0239a.this.f1076r;
                m849f(view2 == null ? (View) C0239a.this.f683p : view2);
            }
            m853j(C0239a.this.f1074J);
        }

        @Override // androidx.appcompat.view.menu.C0195h
        /* renamed from: e */
        public void mo848e() {
            C0239a c0239a = C0239a.this;
            c0239a.f1071G = null;
            c0239a.f1075K = 0;
            super.mo848e();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.AbstractC0187b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0187b
        /* renamed from: a */
        public InterfaceC3490f mo699a() {
            a aVar = C0239a.this.f1071G;
            if (aVar != null) {
                return aVar.m846c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: h */
        public e f1087h;

        public c(e eVar) {
            this.f1087h = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0239a.this.f677j != null) {
                C0239a.this.f677j.m787d();
            }
            View view = (View) C0239a.this.f683p;
            if (view != null && view.getWindowToken() != null && this.f1087h.m856m()) {
                C0239a.this.f1070F = this.f1087h;
            }
            C0239a.this.f1072H = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$d */
    /* loaded from: classes.dex */
    public class d extends C3654q implements ActionMenuView.InterfaceC0207a {

        /* renamed from: androidx.appcompat.widget.a$d$a */
        /* loaded from: classes.dex */
        public class a extends AbstractViewOnTouchListenerC3641j0 {

            /* renamed from: q */
            public final /* synthetic */ C0239a f1090q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, C0239a c0239a) {
                super(view);
                this.f1090q = c0239a;
            }

            @Override // p187n.AbstractViewOnTouchListenerC3641j0
            /* renamed from: b */
            public InterfaceC3490f mo697b() {
                e eVar = C0239a.this.f1070F;
                if (eVar == null) {
                    return null;
                }
                return eVar.m846c();
            }

            @Override // p187n.AbstractViewOnTouchListenerC3641j0
            /* renamed from: c */
            public boolean mo698c() {
                C0239a.this.m1046K();
                return true;
            }

            @Override // p187n.AbstractViewOnTouchListenerC3641j0
            /* renamed from: d */
            public boolean mo1049d() {
                C0239a c0239a = C0239a.this;
                if (c0239a.f1072H != null) {
                    return false;
                }
                c0239a.m1037B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C1931a.f7339k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C3671y0.m13742a(this, getContentDescription());
            setOnTouchListener(new a(this, C0239a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0207a
        /* renamed from: a */
        public boolean mo690a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0207a
        /* renamed from: b */
        public boolean mo691b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0239a.this.m1046K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0436a.m2260k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.a$e */
    /* loaded from: classes.dex */
    public class e extends C0195h {
        public e(Context context, C0192e c0192e, View view, boolean z10) {
            super(context, c0192e, view, z10, C1931a.f7340l);
            m851h(8388613);
            m853j(C0239a.this.f1074J);
        }

        @Override // androidx.appcompat.view.menu.C0195h
        /* renamed from: e */
        public void mo848e() {
            if (C0239a.this.f677j != null) {
                C0239a.this.f677j.close();
            }
            C0239a.this.f1070F = null;
            super.mo848e();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC0196i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: b */
        public void mo813b(C0192e c0192e, boolean z10) {
            if (c0192e instanceof SubMenuC0199l) {
                c0192e.mo758D().m789e(false);
            }
            InterfaceC0196i.a m719m = C0239a.this.m719m();
            if (m719m != null) {
                m719m.mo813b(c0192e, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: c */
        public boolean mo814c(C0192e c0192e) {
            if (c0192e == C0239a.this.f677j) {
                return false;
            }
            C0239a.this.f1075K = ((SubMenuC0199l) c0192e).getItem().getItemId();
            InterfaceC0196i.a m719m = C0239a.this.m719m();
            if (m719m != null) {
                return m719m.mo814c(c0192e);
            }
            return false;
        }
    }

    public C0239a(Context context) {
        super(context, C1937g.f7468c, C1937g.f7467b);
        this.f1069E = new SparseBooleanArray();
        this.f1074J = new f();
    }

    /* renamed from: A */
    public Drawable m1036A() {
        d dVar = this.f1076r;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1078t) {
            return this.f1077s;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m1037B() {
        Object obj;
        c cVar = this.f1072H;
        if (cVar != null && (obj = this.f683p) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1072H = null;
            return true;
        }
        e eVar = this.f1070F;
        if (eVar == null) {
            return false;
        }
        eVar.m845b();
        return true;
    }

    /* renamed from: C */
    public boolean m1038C() {
        a aVar = this.f1071G;
        if (aVar == null) {
            return false;
        }
        aVar.m845b();
        return true;
    }

    /* renamed from: D */
    public boolean m1039D() {
        return this.f1072H != null || m1040E();
    }

    /* renamed from: E */
    public boolean m1040E() {
        e eVar = this.f1070F;
        return eVar != null && eVar.m847d();
    }

    /* renamed from: F */
    public void m1041F(Configuration configuration) {
        if (!this.f1084z) {
            this.f1083y = C3390a.m12599b(this.f676i).m12602d();
        }
        C0192e c0192e = this.f677j;
        if (c0192e != null) {
            c0192e.m765K(true);
        }
    }

    /* renamed from: G */
    public void m1042G(boolean z10) {
        this.f1067C = z10;
    }

    /* renamed from: H */
    public void m1043H(ActionMenuView actionMenuView) {
        this.f683p = actionMenuView;
        actionMenuView.mo701b(this.f677j);
    }

    /* renamed from: I */
    public void m1044I(Drawable drawable) {
        d dVar = this.f1076r;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1078t = true;
            this.f1077s = drawable;
        }
    }

    /* renamed from: J */
    public void m1045J(boolean z10) {
        this.f1079u = z10;
        this.f1080v = true;
    }

    /* renamed from: K */
    public boolean m1046K() {
        C0192e c0192e;
        if (!this.f1079u || m1040E() || (c0192e = this.f677j) == null || this.f683p == null || this.f1072H != null || c0192e.m809z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f676i, this.f677j, this.f1076r, true));
        this.f1072H = cVar;
        ((View) this.f683p).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a, androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: b */
    public void mo709b(C0192e c0192e, boolean z10) {
        m1047y();
        super.mo709b(c0192e, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a, androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: c */
    public void mo710c(boolean z10) {
        super.mo710c(z10);
        ((View) this.f683p).requestLayout();
        C0192e c0192e = this.f677j;
        boolean z11 = false;
        if (c0192e != null) {
            ArrayList<C0194g> m802s = c0192e.m802s();
            int size = m802s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3307b mo819a = m802s.get(i10).mo819a();
                if (mo819a != null) {
                    mo819a.m11985i(this);
                }
            }
        }
        C0192e c0192e2 = this.f677j;
        ArrayList<C0194g> m809z = c0192e2 != null ? c0192e2.m809z() : null;
        if (this.f1079u && m809z != null) {
            int size2 = m809z.size();
            if (size2 == 1) {
                z11 = !m809z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f1076r;
        if (z11) {
            if (dVar == null) {
                this.f1076r = new d(this.f675h);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1076r.getParent();
            if (viewGroup != this.f683p) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1076r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f683p;
                actionMenuView.addView(this.f1076r, actionMenuView.m903D());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f683p;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f1076r);
            }
        }
        ((ActionMenuView) this.f683p).setOverflowReserved(this.f1079u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: d */
    public boolean mo730d() {
        ArrayList<C0194g> arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        C0239a c0239a = this;
        C0192e c0192e = c0239a.f677j;
        View view = null;
        ?? r32 = 0;
        if (c0192e != null) {
            arrayList = c0192e.m759E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = c0239a.f1083y;
        int i15 = c0239a.f1082x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0239a.f683p;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            C0194g c0194g = arrayList.get(i18);
            if (c0194g.m832o()) {
                i16++;
            } else if (c0194g.m831n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (c0239a.f1067C && c0194g.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (c0239a.f1079u && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = c0239a.f1069E;
        sparseBooleanArray.clear();
        if (c0239a.f1065A) {
            int i20 = c0239a.f1068D;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            C0194g c0194g2 = arrayList.get(i21);
            if (c0194g2.m832o()) {
                View mo720n = c0239a.mo720n(c0194g2, view, viewGroup);
                if (c0239a.f1065A) {
                    i12 -= ActionMenuView.m899J(mo720n, i11, i12, makeMeasureSpec, r32);
                } else {
                    mo720n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo720n.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = c0194g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0194g2.m838u(true);
                z10 = r32;
                i13 = i10;
            } else if (c0194g2.m831n()) {
                int groupId2 = c0194g2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!c0239a.f1065A || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View mo720n2 = c0239a.mo720n(c0194g2, null, viewGroup);
                    if (c0239a.f1065A) {
                        int m899J = ActionMenuView.m899J(mo720n2, i11, i12, makeMeasureSpec, 0);
                        i12 -= m899J;
                        if (m899J == 0) {
                            z14 = false;
                        }
                    } else {
                        mo720n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = mo720n2.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!c0239a.f1065A ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        C0194g c0194g3 = arrayList.get(i23);
                        if (c0194g3.getGroupId() == groupId2) {
                            if (c0194g3.m829l()) {
                                i19++;
                            }
                            c0194g3.m838u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                c0194g2.m838u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                c0194g2.m838u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            c0239a = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a, androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: h */
    public void mo714h(Context context, C0192e c0192e) {
        super.mo714h(context, c0192e);
        Resources resources = context.getResources();
        C3390a m12599b = C3390a.m12599b(context);
        if (!this.f1080v) {
            this.f1079u = m12599b.m12606h();
        }
        if (!this.f1066B) {
            this.f1081w = m12599b.m12601c();
        }
        if (!this.f1084z) {
            this.f1083y = m12599b.m12602d();
        }
        int i10 = this.f1081w;
        if (this.f1079u) {
            if (this.f1076r == null) {
                d dVar = new d(this.f675h);
                this.f1076r = dVar;
                if (this.f1078t) {
                    dVar.setImageDrawable(this.f1077s);
                    this.f1077s = null;
                    this.f1078t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1076r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1076r.getMeasuredWidth();
        } else {
            this.f1076r = null;
        }
        this.f1082x = i10;
        this.f1068D = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a, androidx.appcompat.view.menu.InterfaceC0196i
    /* renamed from: i */
    public boolean mo715i(SubMenuC0199l subMenuC0199l) {
        boolean z10 = false;
        if (!subMenuC0199l.hasVisibleItems()) {
            return false;
        }
        SubMenuC0199l subMenuC0199l2 = subMenuC0199l;
        while (subMenuC0199l2.m860e0() != this.f677j) {
            subMenuC0199l2 = (SubMenuC0199l) subMenuC0199l2.m860e0();
        }
        View m1048z = m1048z(subMenuC0199l2.getItem());
        if (m1048z == null) {
            return false;
        }
        this.f1075K = subMenuC0199l.getItem().getItemId();
        int size = subMenuC0199l.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = subMenuC0199l.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f676i, subMenuC0199l, m1048z);
        this.f1071G = aVar;
        aVar.m850g(z10);
        this.f1071G.m854k();
        super.mo715i(subMenuC0199l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a
    /* renamed from: j */
    public void mo716j(C0194g c0194g, InterfaceC0197j.a aVar) {
        aVar.mo693d(c0194g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f683p);
        if (this.f1073I == null) {
            this.f1073I = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1073I);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a
    /* renamed from: l */
    public boolean mo718l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1076r) {
            return false;
        }
        return super.mo718l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a
    /* renamed from: n */
    public View mo720n(C0194g c0194g, View view, ViewGroup viewGroup) {
        View actionView = c0194g.getActionView();
        if (actionView == null || c0194g.m827j()) {
            actionView = super.mo720n(c0194g, view, viewGroup);
        }
        actionView.setVisibility(c0194g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a
    /* renamed from: o */
    public InterfaceC0197j mo721o(ViewGroup viewGroup) {
        InterfaceC0197j interfaceC0197j = this.f683p;
        InterfaceC0197j mo721o = super.mo721o(viewGroup);
        if (interfaceC0197j != mo721o) {
            ((ActionMenuView) mo721o).setPresenter(this);
        }
        return mo721o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0188a
    /* renamed from: q */
    public boolean mo723q(int i10, C0194g c0194g) {
        return c0194g.m829l();
    }

    /* renamed from: y */
    public boolean m1047y() {
        return m1037B() | m1038C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final View m1048z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f683p;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0197j.a) && ((InterfaceC0197j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
