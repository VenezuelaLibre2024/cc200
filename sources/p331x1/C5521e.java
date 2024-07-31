package p331x1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0307j0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p090g0.C1945e;
import p331x1.AbstractC5537m;

@SuppressLint({"RestrictedApi"})
/* renamed from: x1.e */
/* loaded from: classes.dex */
public class C5521e extends AbstractC0307j0 {

    /* renamed from: x1.e$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5537m.e {

        /* renamed from: a */
        public final /* synthetic */ Rect f20677a;

        public a(Rect rect) {
            this.f20677a = rect;
        }
    }

    /* renamed from: x1.e$b */
    /* loaded from: classes.dex */
    public class b implements AbstractC5537m.f {

        /* renamed from: a */
        public final /* synthetic */ View f20679a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f20680b;

        public b(View view, ArrayList arrayList) {
            this.f20679a = view;
            this.f20680b = arrayList;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: a */
        public void mo22247a(AbstractC5537m abstractC5537m) {
            abstractC5537m.mo22287T(this);
            abstractC5537m.mo22295b(this);
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: b */
        public void mo22216b(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: c */
        public void mo22217c(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            abstractC5537m.mo22287T(this);
            this.f20679a.setVisibility(8);
            int size = this.f20680b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f20680b.get(i10)).setVisibility(0);
            }
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: e */
        public void mo22219e(AbstractC5537m abstractC5537m) {
        }
    }

    /* renamed from: x1.e$c */
    /* loaded from: classes.dex */
    public class c extends C5539n {

        /* renamed from: a */
        public final /* synthetic */ Object f20682a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f20683b;

        /* renamed from: c */
        public final /* synthetic */ Object f20684c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f20685d;

        /* renamed from: e */
        public final /* synthetic */ Object f20686e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f20687f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f20682a = obj;
            this.f20683b = arrayList;
            this.f20684c = obj2;
            this.f20685d = arrayList2;
            this.f20686e = obj3;
            this.f20687f = arrayList3;
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: a */
        public void mo22247a(AbstractC5537m abstractC5537m) {
            Object obj = this.f20682a;
            if (obj != null) {
                C5521e.this.m22246w(obj, this.f20683b, null);
            }
            Object obj2 = this.f20684c;
            if (obj2 != null) {
                C5521e.this.m22246w(obj2, this.f20685d, null);
            }
            Object obj3 = this.f20686e;
            if (obj3 != null) {
                C5521e.this.m22246w(obj3, this.f20687f, null);
            }
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            abstractC5537m.mo22287T(this);
        }
    }

    /* renamed from: x1.e$d */
    /* loaded from: classes.dex */
    public class d implements C1945e.b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC5537m f20689a;

        public d(AbstractC5537m abstractC5537m) {
            this.f20689a = abstractC5537m;
        }

        @Override // p090g0.C1945e.b
        /* renamed from: a */
        public void mo1406a() {
            this.f20689a.mo22304h();
        }
    }

    /* renamed from: x1.e$e */
    /* loaded from: classes.dex */
    public class e implements AbstractC5537m.f {

        /* renamed from: a */
        public final /* synthetic */ Runnable f20691a;

        public e(Runnable runnable) {
            this.f20691a = runnable;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: a */
        public void mo22247a(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: b */
        public void mo22216b(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: c */
        public void mo22217c(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            this.f20691a.run();
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: e */
        public void mo22219e(AbstractC5537m abstractC5537m) {
        }
    }

    /* renamed from: x1.e$f */
    /* loaded from: classes.dex */
    public class f extends AbstractC5537m.e {

        /* renamed from: a */
        public final /* synthetic */ Rect f20693a;

        public f(Rect rect) {
            this.f20693a = rect;
        }
    }

    /* renamed from: v */
    public static boolean m22245v(AbstractC5537m abstractC5537m) {
        return (AbstractC0307j0.m1527i(abstractC5537m.m22274C()) && AbstractC0307j0.m1527i(abstractC5537m.m22275D()) && AbstractC0307j0.m1527i(abstractC5537m.m22276F())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: a */
    public void mo1496a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC5537m) obj).mo22297c(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: b */
    public void mo1497b(Object obj, ArrayList<View> arrayList) {
        AbstractC5537m abstractC5537m = (AbstractC5537m) obj;
        if (abstractC5537m == null) {
            return;
        }
        int i10 = 0;
        if (abstractC5537m instanceof C5542q) {
            C5542q c5542q = (C5542q) abstractC5537m;
            int m22329l0 = c5542q.m22329l0();
            while (i10 < m22329l0) {
                mo1497b(c5542q.m22328k0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m22245v(abstractC5537m) || !AbstractC0307j0.m1527i(abstractC5537m.m22277G())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC5537m.mo22297c(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: c */
    public void mo1498c(ViewGroup viewGroup, Object obj) {
        C5540o.m22319a(viewGroup, (AbstractC5537m) obj);
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: e */
    public boolean mo1499e(Object obj) {
        return obj instanceof AbstractC5537m;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: f */
    public Object mo1500f(Object obj) {
        if (obj != null) {
            return ((AbstractC5537m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: j */
    public Object mo1501j(Object obj, Object obj2, Object obj3) {
        AbstractC5537m abstractC5537m = (AbstractC5537m) obj;
        AbstractC5537m abstractC5537m2 = (AbstractC5537m) obj2;
        AbstractC5537m abstractC5537m3 = (AbstractC5537m) obj3;
        if (abstractC5537m != null && abstractC5537m2 != null) {
            abstractC5537m = new C5542q().m22326i0(abstractC5537m).m22326i0(abstractC5537m2).m22334q0(1);
        } else if (abstractC5537m == null) {
            abstractC5537m = abstractC5537m2 != null ? abstractC5537m2 : null;
        }
        if (abstractC5537m3 == null) {
            return abstractC5537m;
        }
        C5542q c5542q = new C5542q();
        if (abstractC5537m != null) {
            c5542q.m22326i0(abstractC5537m);
        }
        c5542q.m22326i0(abstractC5537m3);
        return c5542q;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: k */
    public Object mo1502k(Object obj, Object obj2, Object obj3) {
        C5542q c5542q = new C5542q();
        if (obj != null) {
            c5542q.m22326i0((AbstractC5537m) obj);
        }
        if (obj2 != null) {
            c5542q.m22326i0((AbstractC5537m) obj2);
        }
        if (obj3 != null) {
            c5542q.m22326i0((AbstractC5537m) obj3);
        }
        return c5542q;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: m */
    public void mo1503m(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC5537m) obj).mo22295b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: n */
    public void mo1504n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC5537m) obj).mo22295b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: o */
    public void mo1505o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC5537m) obj).mo22293Z(new f(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: p */
    public void mo1506p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1528h(view, rect);
            ((AbstractC5537m) obj).mo22293Z(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: q */
    public void mo1507q(Fragment fragment, Object obj, C1945e c1945e, Runnable runnable) {
        AbstractC5537m abstractC5537m = (AbstractC5537m) obj;
        c1945e.m7854b(new d(abstractC5537m));
        abstractC5537m.mo22295b(new e(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: s */
    public void mo1508s(Object obj, View view, ArrayList<View> arrayList) {
        C5542q c5542q = (C5542q) obj;
        List<View> m22277G = c5542q.m22277G();
        m22277G.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0307j0.m1525d(m22277G, arrayList.get(i10));
        }
        m22277G.add(view);
        arrayList.add(view);
        mo1497b(c5542q, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: t */
    public void mo1509t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C5542q c5542q = (C5542q) obj;
        if (c5542q != null) {
            c5542q.m22277G().clear();
            c5542q.m22277G().addAll(arrayList2);
            m22246w(c5542q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: u */
    public Object mo1510u(Object obj) {
        if (obj == null) {
            return null;
        }
        C5542q c5542q = new C5542q();
        c5542q.m22326i0((AbstractC5537m) obj);
        return c5542q;
    }

    /* renamed from: w */
    public void m22246w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC5537m abstractC5537m = (AbstractC5537m) obj;
        int i10 = 0;
        if (abstractC5537m instanceof C5542q) {
            C5542q c5542q = (C5542q) abstractC5537m;
            int m22329l0 = c5542q.m22329l0();
            while (i10 < m22329l0) {
                m22246w(c5542q.m22328k0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m22245v(abstractC5537m)) {
            return;
        }
        List<View> m22277G = abstractC5537m.m22277G();
        if (m22277G.size() == arrayList.size() && m22277G.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC5537m.mo22297c(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC5537m.mo22288U(arrayList.get(size2));
            }
        }
    }
}
