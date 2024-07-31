package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p090g0.C1945e;
import p148k0.C3308b0;
import p361z0.C5940b;

/* renamed from: androidx.fragment.app.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0313m0 {

    /* renamed from: a */
    public final ViewGroup f1537a;

    /* renamed from: b */
    public final ArrayList<e> f1538b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<e> f1539c = new ArrayList<>();

    /* renamed from: d */
    public boolean f1540d = false;

    /* renamed from: e */
    public boolean f1541e = false;

    /* renamed from: androidx.fragment.app.m0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ d f1542h;

        public a(d dVar) {
            this.f1542h = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC0313m0.this.f1538b.contains(this.f1542h)) {
                this.f1542h.m1567e().m1576b(this.f1542h.m1568f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.m0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ d f1544h;

        public b(d dVar) {
            this.f1544h = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0313m0.this.f1538b.remove(this.f1544h);
            AbstractC0313m0.this.f1539c.remove(this.f1544h);
        }
    }

    /* renamed from: androidx.fragment.app.m0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1546a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1547b;

        static {
            int[] iArr = new int[e.b.values().length];
            f1547b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1547b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1547b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f1546a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1546a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1546a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1546a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.m0$d */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h */
        public final C0297e0 f1548h;

        public d(e.c cVar, e.b bVar, C0297e0 c0297e0, C1945e c1945e) {
            super(cVar, bVar, c0297e0.m1445k(), c1945e);
            this.f1548h = c0297e0;
        }

        @Override // androidx.fragment.app.AbstractC0313m0.e
        /* renamed from: c */
        public void mo1562c() {
            super.mo1562c();
            this.f1548h.m1447m();
        }

        @Override // androidx.fragment.app.AbstractC0313m0.e
        /* renamed from: l */
        public void mo1563l() {
            if (m1569g() != e.b.ADDING) {
                if (m1569g() == e.b.REMOVING) {
                    Fragment m1445k = this.f1548h.m1445k();
                    View requireView = m1445k.requireView();
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + m1445k);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment m1445k2 = this.f1548h.m1445k();
            View findFocus = m1445k2.mView.findFocus();
            if (findFocus != null) {
                m1445k2.setFocusedView(findFocus);
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m1445k2);
                }
            }
            View requireView2 = m1568f().requireView();
            if (requireView2.getParent() == null) {
                this.f1548h.m1436b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(m1445k2.getPostOnViewCreatedAlpha());
        }
    }

    /* renamed from: androidx.fragment.app.m0$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public c f1549a;

        /* renamed from: b */
        public b f1550b;

        /* renamed from: c */
        public final Fragment f1551c;

        /* renamed from: d */
        public final List<Runnable> f1552d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C1945e> f1553e = new HashSet<>();

        /* renamed from: f */
        public boolean f1554f = false;

        /* renamed from: g */
        public boolean f1555g = false;

        /* renamed from: androidx.fragment.app.m0$e$a */
        /* loaded from: classes.dex */
        public class a implements C1945e.b {
            public a() {
            }

            @Override // p090g0.C1945e.b
            /* renamed from: a */
            public void mo1406a() {
                e.this.m1565b();
            }
        }

        /* renamed from: androidx.fragment.app.m0$e$b */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.m0$e$c */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: c */
            public static c m1574c(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            /* renamed from: f */
            public static c m1575f(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m1574c(view.getVisibility());
            }

            /* renamed from: b */
            public void m1576b(View view) {
                int i10;
                int i11 = c.f1546a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (AbstractC0326x.m1617I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i10 = 0;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        if (AbstractC0326x.m1617I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i10 = 8;
                }
                view.setVisibility(i10);
            }
        }

        public e(c cVar, b bVar, Fragment fragment, C1945e c1945e) {
            this.f1549a = cVar;
            this.f1550b = bVar;
            this.f1551c = fragment;
            c1945e.m7854b(new a());
        }

        /* renamed from: a */
        public final void m1564a(Runnable runnable) {
            this.f1552d.add(runnable);
        }

        /* renamed from: b */
        public final void m1565b() {
            if (m1570h()) {
                return;
            }
            this.f1554f = true;
            if (this.f1553e.isEmpty()) {
                mo1562c();
                return;
            }
            Iterator it = new ArrayList(this.f1553e).iterator();
            while (it.hasNext()) {
                ((C1945e) it.next()).m7853a();
            }
        }

        /* renamed from: c */
        public void mo1562c() {
            if (this.f1555g) {
                return;
            }
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1555g = true;
            Iterator<Runnable> it = this.f1552d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: d */
        public final void m1566d(C1945e c1945e) {
            if (this.f1553e.remove(c1945e) && this.f1553e.isEmpty()) {
                mo1562c();
            }
        }

        /* renamed from: e */
        public c m1567e() {
            return this.f1549a;
        }

        /* renamed from: f */
        public final Fragment m1568f() {
            return this.f1551c;
        }

        /* renamed from: g */
        public b m1569g() {
            return this.f1550b;
        }

        /* renamed from: h */
        public final boolean m1570h() {
            return this.f1554f;
        }

        /* renamed from: i */
        public final boolean m1571i() {
            return this.f1555g;
        }

        /* renamed from: j */
        public final void m1572j(C1945e c1945e) {
            mo1563l();
            this.f1553e.add(c1945e);
        }

        /* renamed from: k */
        public final void m1573k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f1547b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f1549a != c.REMOVED) {
                        if (AbstractC0326x.m1617I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1551c + " mFinalState = " + this.f1549a + " -> " + cVar + ". ");
                        }
                        this.f1549a = cVar;
                        return;
                    }
                    return;
                }
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1551c + " mFinalState = " + this.f1549a + " -> REMOVED. mLifecycleImpact  = " + this.f1550b + " to REMOVING.");
                }
                this.f1549a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f1549a != c.REMOVED) {
                    return;
                }
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1551c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1550b + " to ADDING.");
                }
                this.f1549a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f1550b = bVar2;
        }

        /* renamed from: l */
        public void mo1563l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1549a + "} {mLifecycleImpact = " + this.f1550b + "} {mFragment = " + this.f1551c + "}";
        }
    }

    public AbstractC0313m0(ViewGroup viewGroup) {
        this.f1537a = viewGroup;
    }

    /* renamed from: n */
    public static AbstractC0313m0 m1545n(ViewGroup viewGroup, AbstractC0326x abstractC0326x) {
        return m1546o(viewGroup, abstractC0326x.m1636A0());
    }

    /* renamed from: o */
    public static AbstractC0313m0 m1546o(ViewGroup viewGroup, InterfaceC0315n0 interfaceC0315n0) {
        int i10 = C5940b.f22087b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof AbstractC0313m0) {
            return (AbstractC0313m0) tag;
        }
        AbstractC0313m0 mo1591a = interfaceC0315n0.mo1591a(viewGroup);
        viewGroup.setTag(i10, mo1591a);
        return mo1591a;
    }

    /* renamed from: a */
    public final void m1547a(e.c cVar, e.b bVar, C0297e0 c0297e0) {
        synchronized (this.f1538b) {
            C1945e c1945e = new C1945e();
            e m1553h = m1553h(c0297e0.m1445k());
            if (m1553h != null) {
                m1553h.m1573k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, c0297e0, c1945e);
            this.f1538b.add(dVar);
            dVar.m1564a(new a(dVar));
            dVar.m1564a(new b(dVar));
        }
    }

    /* renamed from: b */
    public void m1548b(e.c cVar, C0297e0 c0297e0) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0297e0.m1445k());
        }
        m1547a(cVar, e.b.ADDING, c0297e0);
    }

    /* renamed from: c */
    public void m1549c(C0297e0 c0297e0) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c0297e0.m1445k());
        }
        m1547a(e.c.GONE, e.b.NONE, c0297e0);
    }

    /* renamed from: d */
    public void m1550d(C0297e0 c0297e0) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c0297e0.m1445k());
        }
        m1547a(e.c.REMOVED, e.b.REMOVING, c0297e0);
    }

    /* renamed from: e */
    public void m1551e(C0297e0 c0297e0) {
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c0297e0.m1445k());
        }
        m1547a(e.c.VISIBLE, e.b.NONE, c0297e0);
    }

    /* renamed from: f */
    public abstract void mo1398f(List<e> list, boolean z10);

    /* renamed from: g */
    public void m1552g() {
        if (this.f1541e) {
            return;
        }
        if (!C3308b0.m11992F(this.f1537a)) {
            m1555j();
            this.f1540d = false;
            return;
        }
        synchronized (this.f1538b) {
            if (!this.f1538b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1539c);
                this.f1539c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m1565b();
                    if (!eVar.m1571i()) {
                        this.f1539c.add(eVar);
                    }
                }
                m1560q();
                ArrayList arrayList2 = new ArrayList(this.f1538b);
                this.f1538b.clear();
                this.f1539c.addAll(arrayList2);
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo1563l();
                }
                mo1398f(arrayList2, this.f1540d);
                this.f1540d = false;
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* renamed from: h */
    public final e m1553h(Fragment fragment) {
        Iterator<e> it = this.f1538b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m1568f().equals(fragment) && !next.m1570h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final e m1554i(Fragment fragment) {
        Iterator<e> it = this.f1539c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m1568f().equals(fragment) && !next.m1570h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m1555j() {
        String str;
        String str2;
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean m11992F = C3308b0.m11992F(this.f1537a);
        synchronized (this.f1538b) {
            m1560q();
            Iterator<e> it = this.f1538b.iterator();
            while (it.hasNext()) {
                it.next().mo1563l();
            }
            Iterator it2 = new ArrayList(this.f1539c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (AbstractC0326x.m1617I0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m11992F) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1537a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.m1565b();
            }
            Iterator it3 = new ArrayList(this.f1538b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (AbstractC0326x.m1617I0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (m11992F) {
                        str = "";
                    } else {
                        str = "Container " + this.f1537a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.m1565b();
            }
        }
    }

    /* renamed from: k */
    public void m1556k() {
        if (this.f1541e) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f1541e = false;
            m1552g();
        }
    }

    /* renamed from: l */
    public e.b m1557l(C0297e0 c0297e0) {
        e m1553h = m1553h(c0297e0.m1445k());
        e.b m1569g = m1553h != null ? m1553h.m1569g() : null;
        e m1554i = m1554i(c0297e0.m1445k());
        return (m1554i == null || !(m1569g == null || m1569g == e.b.NONE)) ? m1569g : m1554i.m1569g();
    }

    /* renamed from: m */
    public ViewGroup m1558m() {
        return this.f1537a;
    }

    /* renamed from: p */
    public void m1559p() {
        synchronized (this.f1538b) {
            m1560q();
            this.f1541e = false;
            int size = this.f1538b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f1538b.get(size);
                e.c m1575f = e.c.m1575f(eVar.m1568f().mView);
                e.c m1567e = eVar.m1567e();
                e.c cVar = e.c.VISIBLE;
                if (m1567e == cVar && m1575f != cVar) {
                    this.f1541e = eVar.m1568f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void m1560q() {
        Iterator<e> it = this.f1538b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m1569g() == e.b.ADDING) {
                next.m1573k(e.c.m1574c(next.m1568f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* renamed from: r */
    public void m1561r(boolean z10) {
        this.f1540d = z10;
    }
}
