package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.C0194g;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.SubMenuC0199l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p089g.C1931a;
import p089g.C1940j;
import p101h.AbstractC2259a;
import p118i.C2572a;
import p148k0.C3308b0;
import p148k0.C3313e;
import p148k0.C3319h;
import p148k0.C3327l;
import p148k0.InterfaceC3321i;
import p148k0.InterfaceC3331n;
import p162l.C3396g;
import p162l.InterfaceC3392c;
import p187n.C3623c0;
import p187n.C3630e1;
import p187n.C3650o;
import p187n.C3653p0;
import p187n.C3654q;
import p187n.C3667w0;
import p187n.C3671y0;
import p187n.InterfaceC3635g0;
import p217p0.AbstractC3995a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC3321i {

    /* renamed from: A */
    public C3653p0 f1008A;

    /* renamed from: B */
    public int f1009B;

    /* renamed from: C */
    public int f1010C;

    /* renamed from: D */
    public int f1011D;

    /* renamed from: E */
    public CharSequence f1012E;

    /* renamed from: F */
    public CharSequence f1013F;

    /* renamed from: G */
    public ColorStateList f1014G;

    /* renamed from: H */
    public ColorStateList f1015H;

    /* renamed from: I */
    public boolean f1016I;

    /* renamed from: J */
    public boolean f1017J;

    /* renamed from: K */
    public final ArrayList<View> f1018K;

    /* renamed from: L */
    public final ArrayList<View> f1019L;

    /* renamed from: M */
    public final int[] f1020M;

    /* renamed from: N */
    public final C3327l f1021N;

    /* renamed from: O */
    public ArrayList<MenuItem> f1022O;

    /* renamed from: P */
    public InterfaceC0236f f1023P;

    /* renamed from: Q */
    public final ActionMenuView.InterfaceC0211e f1024Q;

    /* renamed from: R */
    public C0243e f1025R;

    /* renamed from: S */
    public C0239a f1026S;

    /* renamed from: T */
    public C0234d f1027T;

    /* renamed from: U */
    public InterfaceC0196i.a f1028U;

    /* renamed from: V */
    public C0192e.a f1029V;

    /* renamed from: W */
    public boolean f1030W;

    /* renamed from: a0 */
    public final Runnable f1031a0;

    /* renamed from: h */
    public ActionMenuView f1032h;

    /* renamed from: i */
    public TextView f1033i;

    /* renamed from: j */
    public TextView f1034j;

    /* renamed from: k */
    public ImageButton f1035k;

    /* renamed from: l */
    public ImageView f1036l;

    /* renamed from: m */
    public Drawable f1037m;

    /* renamed from: n */
    public CharSequence f1038n;

    /* renamed from: o */
    public ImageButton f1039o;

    /* renamed from: p */
    public View f1040p;

    /* renamed from: q */
    public Context f1041q;

    /* renamed from: r */
    public int f1042r;

    /* renamed from: s */
    public int f1043s;

    /* renamed from: t */
    public int f1044t;

    /* renamed from: u */
    public int f1045u;

    /* renamed from: v */
    public int f1046v;

    /* renamed from: w */
    public int f1047w;

    /* renamed from: x */
    public int f1048x;

    /* renamed from: y */
    public int f1049y;

    /* renamed from: z */
    public int f1050z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C0231a implements ActionMenuView.InterfaceC0211e {
        public C0231a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0211e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1021N.m12271j(menuItem)) {
                return true;
            }
            InterfaceC0236f interfaceC0236f = Toolbar.this.f1023P;
            if (interfaceC0236f != null) {
                return interfaceC0236f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public class RunnableC0232b implements Runnable {
        public RunnableC0232b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m996Q();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0233c implements View.OnClickListener {
        public ViewOnClickListenerC0233c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m1001e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0234d implements InterfaceC0196i {

        /* renamed from: h */
        public C0192e f1054h;

        /* renamed from: i */
        public C0194g f1055i;

        public C0234d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: b */
        public void mo709b(C0192e c0192e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: c */
        public void mo710c(boolean z10) {
            if (this.f1055i != null) {
                C0192e c0192e = this.f1054h;
                boolean z11 = false;
                if (c0192e != null) {
                    int size = c0192e.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1054h.getItem(i10) == this.f1055i) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                mo711e(this.f1054h, this.f1055i);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: d */
        public boolean mo730d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: e */
        public boolean mo711e(C0192e c0192e, C0194g c0194g) {
            KeyEvent.Callback callback = Toolbar.this.f1040p;
            if (callback instanceof InterfaceC3392c) {
                ((InterfaceC3392c) callback).mo956d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1040p);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1039o);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1040p = null;
            toolbar3.m997a();
            this.f1055i = null;
            Toolbar.this.requestLayout();
            c0194g.m835r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: f */
        public boolean mo712f(C0192e c0192e, C0194g c0194g) {
            Toolbar.this.m1003g();
            ViewParent parent = Toolbar.this.f1039o.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1039o);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1039o);
            }
            Toolbar.this.f1040p = c0194g.getActionView();
            this.f1055i = c0194g;
            ViewParent parent2 = Toolbar.this.f1040p.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1040p);
                }
                C0235e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f8914a = 8388611 | (toolbar4.f1045u & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                generateDefaultLayoutParams.f1057b = 2;
                toolbar4.f1040p.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1040p);
            }
            Toolbar.this.m988I();
            Toolbar.this.requestLayout();
            c0194g.m835r(true);
            KeyEvent.Callback callback = Toolbar.this.f1040p;
            if (callback instanceof InterfaceC3392c) {
                ((InterfaceC3392c) callback).mo954c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: h */
        public void mo714h(Context context, C0192e c0192e) {
            C0194g c0194g;
            C0192e c0192e2 = this.f1054h;
            if (c0192e2 != null && (c0194g = this.f1055i) != null) {
                c0192e2.mo790f(c0194g);
            }
            this.f1054h = c0192e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i
        /* renamed from: i */
        public boolean mo715i(SubMenuC0199l subMenuC0199l) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0235e extends AbstractC2259a.a {

        /* renamed from: b */
        public int f1057b;

        public C0235e(int i10, int i11) {
            super(i10, i11);
            this.f1057b = 0;
            this.f8914a = 8388627;
        }

        public C0235e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1057b = 0;
        }

        public C0235e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1057b = 0;
        }

        public C0235e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1057b = 0;
            m1023a(marginLayoutParams);
        }

        public C0235e(C0235e c0235e) {
            super((AbstractC2259a.a) c0235e);
            this.f1057b = 0;
            this.f1057b = c0235e.f1057b;
        }

        public C0235e(AbstractC2259a.a aVar) {
            super(aVar);
            this.f1057b = 0;
        }

        /* renamed from: a */
        public void m1023a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0236f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public static class C0237g extends AbstractC3995a {
        public static final Parcelable.Creator<C0237g> CREATOR = new a();

        /* renamed from: j */
        public int f1058j;

        /* renamed from: k */
        public boolean f1059k;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<C0237g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0237g createFromParcel(Parcel parcel) {
                return new C0237g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0237g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0237g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0237g[] newArray(int i10) {
                return new C0237g[i10];
            }
        }

        public C0237g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1058j = parcel.readInt();
            this.f1059k = parcel.readInt() != 0;
        }

        public C0237g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p217p0.AbstractC3995a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1058j);
            parcel.writeInt(this.f1059k ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7328M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1011D = 8388627;
        this.f1018K = new ArrayList<>();
        this.f1019L = new ArrayList<>();
        this.f1020M = new int[2];
        this.f1021N = new C3327l(new Runnable() { // from class: n.x0
            public /* synthetic */ RunnableC3669x0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m1021y();
            }
        });
        this.f1022O = new ArrayList<>();
        this.f1024Q = new C0231a();
        this.f1031a0 = new RunnableC0232b();
        Context context2 = getContext();
        int[] iArr = C1940j.f7580R2;
        C3667w0 m13717u = C3667w0.m13717u(context2, attributeSet, iArr, i10, 0);
        C3308b0.m12007U(this, context, iArr, attributeSet, m13717u.m13734q(), i10, 0);
        this.f1043s = m13717u.m13730m(C1940j.f7712t3, 0);
        this.f1044t = m13717u.m13730m(C1940j.f7667k3, 0);
        this.f1011D = m13717u.m13728k(C1940j.f7584S2, this.f1011D);
        this.f1045u = m13717u.m13728k(C1940j.f7588T2, 48);
        int m13721d = m13717u.m13721d(C1940j.f7682n3, 0);
        int i11 = C1940j.f7707s3;
        m13721d = m13717u.m13735r(i11) ? m13717u.m13721d(i11, m13721d) : m13721d;
        this.f1050z = m13721d;
        this.f1049y = m13721d;
        this.f1048x = m13721d;
        this.f1047w = m13721d;
        int m13721d2 = m13717u.m13721d(C1940j.f7697q3, -1);
        if (m13721d2 >= 0) {
            this.f1047w = m13721d2;
        }
        int m13721d3 = m13717u.m13721d(C1940j.f7692p3, -1);
        if (m13721d3 >= 0) {
            this.f1048x = m13721d3;
        }
        int m13721d4 = m13717u.m13721d(C1940j.f7702r3, -1);
        if (m13721d4 >= 0) {
            this.f1049y = m13721d4;
        }
        int m13721d5 = m13717u.m13721d(C1940j.f7687o3, -1);
        if (m13721d5 >= 0) {
            this.f1050z = m13721d5;
        }
        this.f1046v = m13717u.m13722e(C1940j.f7637e3, -1);
        int m13721d6 = m13717u.m13721d(C1940j.f7617a3, Integer.MIN_VALUE);
        int m13721d7 = m13717u.m13721d(C1940j.f7600W2, Integer.MIN_VALUE);
        int m13722e = m13717u.m13722e(C1940j.f7608Y2, 0);
        int m13722e2 = m13717u.m13722e(C1940j.f7612Z2, 0);
        m1004h();
        this.f1008A.m13666e(m13722e, m13722e2);
        if (m13721d6 != Integer.MIN_VALUE || m13721d7 != Integer.MIN_VALUE) {
            this.f1008A.m13668g(m13721d6, m13721d7);
        }
        this.f1009B = m13717u.m13721d(C1940j.f7622b3, Integer.MIN_VALUE);
        this.f1010C = m13717u.m13721d(C1940j.f7604X2, Integer.MIN_VALUE);
        this.f1037m = m13717u.m13723f(C1940j.f7596V2);
        this.f1038n = m13717u.m13732o(C1940j.f7592U2);
        CharSequence m13732o = m13717u.m13732o(C1940j.f7677m3);
        if (!TextUtils.isEmpty(m13732o)) {
            setTitle(m13732o);
        }
        CharSequence m13732o2 = m13717u.m13732o(C1940j.f7662j3);
        if (!TextUtils.isEmpty(m13732o2)) {
            setSubtitle(m13732o2);
        }
        this.f1041q = getContext();
        setPopupTheme(m13717u.m13730m(C1940j.f7657i3, 0));
        Drawable m13723f = m13717u.m13723f(C1940j.f7652h3);
        if (m13723f != null) {
            setNavigationIcon(m13723f);
        }
        CharSequence m13732o3 = m13717u.m13732o(C1940j.f7647g3);
        if (!TextUtils.isEmpty(m13732o3)) {
            setNavigationContentDescription(m13732o3);
        }
        Drawable m13723f2 = m13717u.m13723f(C1940j.f7627c3);
        if (m13723f2 != null) {
            setLogo(m13723f2);
        }
        CharSequence m13732o4 = m13717u.m13732o(C1940j.f7632d3);
        if (!TextUtils.isEmpty(m13732o4)) {
            setLogoDescription(m13732o4);
        }
        int i12 = C1940j.f7717u3;
        if (m13717u.m13735r(i12)) {
            setTitleTextColor(m13717u.m13720c(i12));
        }
        int i13 = C1940j.f7672l3;
        if (m13717u.m13735r(i13)) {
            setSubtitleTextColor(m13717u.m13720c(i13));
        }
        int i14 = C1940j.f7642f3;
        if (m13717u.m13735r(i14)) {
            m1020x(m13717u.m13730m(i14, 0));
        }
        m13717u.m13736v();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C3396g(getContext());
    }

    /* renamed from: A */
    public boolean m980A() {
        ActionMenuView actionMenuView = this.f1032h;
        return actionMenuView != null && actionMenuView.m906G();
    }

    /* renamed from: B */
    public boolean m981B() {
        ActionMenuView actionMenuView = this.f1032h;
        return actionMenuView != null && actionMenuView.m907H();
    }

    /* renamed from: C */
    public final int m982C(View view, int i10, int[] iArr, int i11) {
        C0235e c0235e = (C0235e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0235e).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int m1013q = m1013q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1013q, max + measuredWidth, view.getMeasuredHeight() + m1013q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0235e).rightMargin;
    }

    /* renamed from: D */
    public final int m983D(View view, int i10, int[] iArr, int i11) {
        C0235e c0235e = (C0235e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0235e).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int m1013q = m1013q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1013q, max, view.getMeasuredHeight() + m1013q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0235e).leftMargin);
    }

    /* renamed from: E */
    public final int m984E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    public final void m985F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    public final void m986G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1021N.m12269h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1022O = currentMenuItems2;
        this.f1021N.m12272k(menu);
    }

    /* renamed from: H */
    public final void m987H() {
        removeCallbacks(this.f1031a0);
        post(this.f1031a0);
    }

    /* renamed from: I */
    public void m988I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0235e) childAt.getLayoutParams()).f1057b != 2 && childAt != this.f1032h) {
                removeViewAt(childCount);
                this.f1019L.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m989J(int i10, int i11) {
        m1004h();
        this.f1008A.m13668g(i10, i11);
    }

    /* renamed from: K */
    public void m990K(C0192e c0192e, C0239a c0239a) {
        if (c0192e == null && this.f1032h == null) {
            return;
        }
        m1007k();
        C0192e m910L = this.f1032h.m910L();
        if (m910L == c0192e) {
            return;
        }
        if (m910L != null) {
            m910L.m769O(this.f1026S);
            m910L.m769O(this.f1027T);
        }
        if (this.f1027T == null) {
            this.f1027T = new C0234d();
        }
        c0239a.m1042G(true);
        if (c0192e != null) {
            c0192e.m785c(c0239a, this.f1041q);
            c0192e.m785c(this.f1027T, this.f1041q);
        } else {
            c0239a.mo714h(this.f1041q, null);
            this.f1027T.mo714h(this.f1041q, null);
            c0239a.mo710c(true);
            this.f1027T.mo710c(true);
        }
        this.f1032h.setPopupTheme(this.f1042r);
        this.f1032h.setPresenter(c0239a);
        this.f1026S = c0239a;
    }

    /* renamed from: L */
    public void m991L(InterfaceC0196i.a aVar, C0192e.a aVar2) {
        this.f1028U = aVar;
        this.f1029V = aVar2;
        ActionMenuView actionMenuView = this.f1032h;
        if (actionMenuView != null) {
            actionMenuView.m911M(aVar, aVar2);
        }
    }

    /* renamed from: M */
    public void m992M(Context context, int i10) {
        this.f1044t = i10;
        TextView textView = this.f1034j;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: N */
    public void m993N(Context context, int i10) {
        this.f1043s = i10;
        TextView textView = this.f1033i;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* renamed from: O */
    public final boolean m994O() {
        if (!this.f1030W) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (m995P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    public final boolean m995P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: Q */
    public boolean m996Q() {
        ActionMenuView actionMenuView = this.f1032h;
        return actionMenuView != null && actionMenuView.m912N();
    }

    /* renamed from: a */
    public void m997a() {
        for (int size = this.f1019L.size() - 1; size >= 0; size--) {
            addView(this.f1019L.get(size));
        }
        this.f1019L.clear();
    }

    @Override // p148k0.InterfaceC3321i
    public void addMenuProvider(InterfaceC3331n interfaceC3331n) {
        this.f1021N.m12266c(interfaceC3331n);
    }

    /* renamed from: b */
    public final void m998b(List<View> list, int i10) {
        boolean z10 = C3308b0.m12048v(this) == 1;
        int childCount = getChildCount();
        int m12211a = C3313e.m12211a(i10, C3308b0.m12048v(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0235e c0235e = (C0235e) childAt.getLayoutParams();
                if (c0235e.f1057b == 0 && m995P(childAt) && m1012p(c0235e.f8914a) == m12211a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            C0235e c0235e2 = (C0235e) childAt2.getLayoutParams();
            if (c0235e2.f1057b == 0 && m995P(childAt2) && m1012p(c0235e2.f8914a) == m12211a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m999c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0235e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0235e) layoutParams;
        generateDefaultLayoutParams.f1057b = 1;
        if (!z10 || this.f1040p == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f1019L.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0235e);
    }

    /* renamed from: d */
    public boolean m1000d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1032h) != null && actionMenuView.m908I();
    }

    /* renamed from: e */
    public void m1001e() {
        C0234d c0234d = this.f1027T;
        C0194g c0194g = c0234d == null ? null : c0234d.f1055i;
        if (c0194g != null) {
            c0194g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m1002f() {
        ActionMenuView actionMenuView = this.f1032h;
        if (actionMenuView != null) {
            actionMenuView.m916z();
        }
    }

    /* renamed from: g */
    public void m1003g() {
        if (this.f1039o == null) {
            C3650o c3650o = new C3650o(getContext(), null, C1931a.f7327L);
            this.f1039o = c3650o;
            c3650o.setImageDrawable(this.f1037m);
            this.f1039o.setContentDescription(this.f1038n);
            C0235e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f8914a = 8388611 | (this.f1045u & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            generateDefaultLayoutParams.f1057b = 2;
            this.f1039o.setLayoutParams(generateDefaultLayoutParams);
            this.f1039o.setOnClickListener(new ViewOnClickListenerC0233c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1039o;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1039o;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C3653p0 c3653p0 = this.f1008A;
        if (c3653p0 != null) {
            return c3653p0.m13662a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1010C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C3653p0 c3653p0 = this.f1008A;
        if (c3653p0 != null) {
            return c3653p0.m13663b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C3653p0 c3653p0 = this.f1008A;
        if (c3653p0 != null) {
            return c3653p0.m13664c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C3653p0 c3653p0 = this.f1008A;
        if (c3653p0 != null) {
            return c3653p0.m13665d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1009B;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0192e m910L;
        ActionMenuView actionMenuView = this.f1032h;
        return actionMenuView != null && (m910L = actionMenuView.m910L()) != null && m910L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1010C, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C3308b0.m12048v(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C3308b0.m12048v(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1009B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1036l;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1036l;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1006j();
        return this.f1032h.getMenu();
    }

    public View getNavButtonView() {
        return this.f1035k;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1035k;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1035k;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0239a getOuterActionMenuPresenter() {
        return this.f1026S;
    }

    public Drawable getOverflowIcon() {
        m1006j();
        return this.f1032h.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1041q;
    }

    public int getPopupTheme() {
        return this.f1042r;
    }

    public CharSequence getSubtitle() {
        return this.f1013F;
    }

    public final TextView getSubtitleTextView() {
        return this.f1034j;
    }

    public CharSequence getTitle() {
        return this.f1012E;
    }

    public int getTitleMarginBottom() {
        return this.f1050z;
    }

    public int getTitleMarginEnd() {
        return this.f1048x;
    }

    public int getTitleMarginStart() {
        return this.f1047w;
    }

    public int getTitleMarginTop() {
        return this.f1049y;
    }

    public final TextView getTitleTextView() {
        return this.f1033i;
    }

    public InterfaceC3635g0 getWrapper() {
        if (this.f1025R == null) {
            this.f1025R = new C0243e(this, true);
        }
        return this.f1025R;
    }

    /* renamed from: h */
    public final void m1004h() {
        if (this.f1008A == null) {
            this.f1008A = new C3653p0();
        }
    }

    /* renamed from: i */
    public final void m1005i() {
        if (this.f1036l == null) {
            this.f1036l = new C3654q(getContext());
        }
    }

    /* renamed from: j */
    public final void m1006j() {
        m1007k();
        if (this.f1032h.m910L() == null) {
            C0192e c0192e = (C0192e) this.f1032h.getMenu();
            if (this.f1027T == null) {
                this.f1027T = new C0234d();
            }
            this.f1032h.setExpandedActionViewsExclusive(true);
            c0192e.m785c(this.f1027T, this.f1041q);
        }
    }

    /* renamed from: k */
    public final void m1007k() {
        if (this.f1032h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1032h = actionMenuView;
            actionMenuView.setPopupTheme(this.f1042r);
            this.f1032h.setOnMenuItemClickListener(this.f1024Q);
            this.f1032h.m911M(this.f1028U, this.f1029V);
            C0235e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f8914a = 8388613 | (this.f1045u & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1032h.setLayoutParams(generateDefaultLayoutParams);
            m999c(this.f1032h, false);
        }
    }

    /* renamed from: l */
    public final void m1008l() {
        if (this.f1035k == null) {
            this.f1035k = new C3650o(getContext(), null, C1931a.f7327L);
            C0235e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f8914a = 8388611 | (this.f1045u & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1035k.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0235e generateDefaultLayoutParams() {
        return new C0235e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0235e generateLayoutParams(AttributeSet attributeSet) {
        return new C0235e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0235e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0235e ? new C0235e((C0235e) layoutParams) : layoutParams instanceof AbstractC2259a.a ? new C0235e((AbstractC2259a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0235e((ViewGroup.MarginLayoutParams) layoutParams) : new C0235e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1031a0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1017J = false;
        }
        if (!this.f1017J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1017J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1017J = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295 A[LOOP:0: B:46:0x0293->B:47:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7 A[LOOP:1: B:50:0x02b5->B:51:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0 A[LOOP:2: B:59:0x02ee->B:60:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f1020M;
        boolean m13501b = C3630e1.m13501b(this);
        int i19 = !m13501b ? 1 : 0;
        if (m995P(this.f1035k)) {
            m985F(this.f1035k, i10, 0, i11, 0, this.f1046v);
            i12 = this.f1035k.getMeasuredWidth() + m1015s(this.f1035k);
            i13 = Math.max(0, this.f1035k.getMeasuredHeight() + m1016t(this.f1035k));
            i14 = View.combineMeasuredStates(0, this.f1035k.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (m995P(this.f1039o)) {
            m985F(this.f1039o, i10, 0, i11, 0, this.f1046v);
            i12 = this.f1039o.getMeasuredWidth() + m1015s(this.f1039o);
            i13 = Math.max(i13, this.f1039o.getMeasuredHeight() + m1016t(this.f1039o));
            i14 = View.combineMeasuredStates(i14, this.f1039o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[m13501b ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (m995P(this.f1032h)) {
            m985F(this.f1032h, i10, max, i11, 0, this.f1046v);
            i15 = this.f1032h.getMeasuredWidth() + m1015s(this.f1032h);
            i13 = Math.max(i13, this.f1032h.getMeasuredHeight() + m1016t(this.f1032h));
            i14 = View.combineMeasuredStates(i14, this.f1032h.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (m995P(this.f1040p)) {
            max2 += m984E(this.f1040p, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1040p.getMeasuredHeight() + m1016t(this.f1040p));
            i14 = View.combineMeasuredStates(i14, this.f1040p.getMeasuredState());
        }
        if (m995P(this.f1036l)) {
            max2 += m984E(this.f1036l, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1036l.getMeasuredHeight() + m1016t(this.f1036l));
            i14 = View.combineMeasuredStates(i14, this.f1036l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((C0235e) childAt.getLayoutParams()).f1057b == 0 && m995P(childAt)) {
                max2 += m984E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + m1016t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1049y + this.f1050z;
        int i22 = this.f1047w + this.f1048x;
        if (m995P(this.f1033i)) {
            m984E(this.f1033i, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1033i.getMeasuredWidth() + m1015s(this.f1033i);
            i16 = this.f1033i.getMeasuredHeight() + m1016t(this.f1033i);
            i17 = View.combineMeasuredStates(i14, this.f1033i.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (m995P(this.f1034j)) {
            i18 = Math.max(i18, m984E(this.f1034j, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f1034j.getMeasuredHeight() + m1016t(this.f1034j);
            i17 = View.combineMeasuredStates(i17, this.f1034j.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), m994O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i16) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0237g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0237g c0237g = (C0237g) parcelable;
        super.onRestoreInstanceState(c0237g.m15137a());
        ActionMenuView actionMenuView = this.f1032h;
        C0192e m910L = actionMenuView != null ? actionMenuView.m910L() : null;
        int i10 = c0237g.f1058j;
        if (i10 != 0 && this.f1027T != null && m910L != null && (findItem = m910L.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (c0237g.f1059k) {
            m987H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        m1004h();
        this.f1008A.m13667f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0194g c0194g;
        C0237g c0237g = new C0237g(super.onSaveInstanceState());
        C0234d c0234d = this.f1027T;
        if (c0234d != null && (c0194g = c0234d.f1055i) != null) {
            c0237g.f1058j = c0194g.getItemId();
        }
        c0237g.f1059k = m981B();
        return c0237g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1016I = false;
        }
        if (!this.f1016I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1016I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1016I = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m1012p(int i10) {
        int m12048v = C3308b0.m12048v(this);
        int m12211a = C3313e.m12211a(i10, m12048v) & 7;
        return (m12211a == 1 || m12211a == 3 || m12211a == 5) ? m12211a : m12048v == 1 ? 5 : 3;
    }

    /* renamed from: q */
    public final int m1013q(View view, int i10) {
        C0235e c0235e = (C0235e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int m1014r = m1014r(c0235e.f8914a);
        if (m1014r == 48) {
            return getPaddingTop() - i11;
        }
        if (m1014r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0235e).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) c0235e).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) c0235e).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    /* renamed from: r */
    public final int m1014r(int i10) {
        int i11 = i10 & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1011D & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
    }

    @Override // p148k0.InterfaceC3321i
    public void removeMenuProvider(InterfaceC3331n interfaceC3331n) {
        this.f1021N.m12273l(interfaceC3331n);
    }

    /* renamed from: s */
    public final int m1015s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C3319h.m12239b(marginLayoutParams) + C3319h.m12238a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1003g();
        }
        ImageButton imageButton = this.f1039o;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C2572a.m10278b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1003g();
            this.f1039o.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1039o;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1037m);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1030W = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1010C) {
            this.f1010C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1009B) {
            this.f1009B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(C2572a.m10278b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1005i();
            if (!m1022z(this.f1036l)) {
                m999c(this.f1036l, true);
            }
        } else {
            ImageView imageView = this.f1036l;
            if (imageView != null && m1022z(imageView)) {
                removeView(this.f1036l);
                this.f1019L.remove(this.f1036l);
            }
        }
        ImageView imageView2 = this.f1036l;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1005i();
        }
        ImageView imageView = this.f1036l;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1008l();
        }
        ImageButton imageButton = this.f1035k;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C3671y0.m13742a(this.f1035k, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C2572a.m10278b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1008l();
            if (!m1022z(this.f1035k)) {
                m999c(this.f1035k, true);
            }
        } else {
            ImageButton imageButton = this.f1035k;
            if (imageButton != null && m1022z(imageButton)) {
                removeView(this.f1035k);
                this.f1019L.remove(this.f1035k);
            }
        }
        ImageButton imageButton2 = this.f1035k;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1008l();
        this.f1035k.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0236f interfaceC0236f) {
        this.f1023P = interfaceC0236f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1006j();
        this.f1032h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1042r != i10) {
            this.f1042r = i10;
            if (i10 == 0) {
                this.f1041q = getContext();
            } else {
                this.f1041q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1034j;
            if (textView != null && m1022z(textView)) {
                removeView(this.f1034j);
                this.f1019L.remove(this.f1034j);
            }
        } else {
            if (this.f1034j == null) {
                Context context = getContext();
                C3623c0 c3623c0 = new C3623c0(context);
                this.f1034j = c3623c0;
                c3623c0.setSingleLine();
                this.f1034j.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1044t;
                if (i10 != 0) {
                    this.f1034j.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1015H;
                if (colorStateList != null) {
                    this.f1034j.setTextColor(colorStateList);
                }
            }
            if (!m1022z(this.f1034j)) {
                m999c(this.f1034j, true);
            }
        }
        TextView textView2 = this.f1034j;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1013F = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1015H = colorStateList;
        TextView textView = this.f1034j;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1033i;
            if (textView != null && m1022z(textView)) {
                removeView(this.f1033i);
                this.f1019L.remove(this.f1033i);
            }
        } else {
            if (this.f1033i == null) {
                Context context = getContext();
                C3623c0 c3623c0 = new C3623c0(context);
                this.f1033i = c3623c0;
                c3623c0.setSingleLine();
                this.f1033i.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1043s;
                if (i10 != 0) {
                    this.f1033i.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1014G;
                if (colorStateList != null) {
                    this.f1033i.setTextColor(colorStateList);
                }
            }
            if (!m1022z(this.f1033i)) {
                m999c(this.f1033i, true);
            }
        }
        TextView textView2 = this.f1033i;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1012E = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1050z = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1048x = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1047w = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1049y = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1014G = colorStateList;
        TextView textView = this.f1033i;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final int m1016t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int m1017u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            C0235e c0235e = (C0235e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) c0235e).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) c0235e).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    /* renamed from: v */
    public boolean m1018v() {
        C0234d c0234d = this.f1027T;
        return (c0234d == null || c0234d.f1055i == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m1019w() {
        ActionMenuView actionMenuView = this.f1032h;
        return actionMenuView != null && actionMenuView.m905F();
    }

    /* renamed from: x */
    public void m1020x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* renamed from: y */
    public void m1021y() {
        Iterator<MenuItem> it = this.f1022O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m986G();
    }

    /* renamed from: z */
    public final boolean m1022z(View view) {
        return view.getParent() == this || this.f1019L.contains(view);
    }
}
