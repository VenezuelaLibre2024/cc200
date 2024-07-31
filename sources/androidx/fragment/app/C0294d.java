package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC0313m0;
import androidx.fragment.app.C0308k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p090g0.C1945e;
import p133j0.C3205d;
import p148k0.C3308b0;
import p148k0.C3314e0;
import p148k0.ViewTreeObserverOnPreDrawListenerC3342y;
import p285u.C4771a;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class C0294d extends AbstractC0313m0 {

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1369a;

        static {
            int[] iArr = new int[AbstractC0313m0.e.c.values().length];
            f1369a = iArr;
            try {
                iArr[AbstractC0313m0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1369a[AbstractC0313m0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1369a[AbstractC0313m0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1369a[AbstractC0313m0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ List f1370h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC0313m0.e f1371i;

        public b(List list, AbstractC0313m0.e eVar) {
            this.f1370h = list;
            this.f1371i = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1370h.contains(this.f1371i)) {
                this.f1370h.remove(this.f1371i);
                C0294d.this.m1399s(this.f1371i);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1373a;

        /* renamed from: b */
        public final /* synthetic */ View f1374b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1375c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC0313m0.e f1376d;

        /* renamed from: e */
        public final /* synthetic */ k f1377e;

        public c(ViewGroup viewGroup, View view, boolean z10, AbstractC0313m0.e eVar, k kVar) {
            this.f1373a = viewGroup;
            this.f1374b = view;
            this.f1375c = z10;
            this.f1376d = eVar;
            this.f1377e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1373a.endViewTransition(this.f1374b);
            if (this.f1375c) {
                this.f1376d.m1567e().m1576b(this.f1374b);
            }
            this.f1377e.m1408a();
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f1376d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: classes.dex */
    public class d implements C1945e.b {

        /* renamed from: a */
        public final /* synthetic */ Animator f1379a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC0313m0.e f1380b;

        public d(Animator animator, AbstractC0313m0.e eVar) {
            this.f1379a = animator;
            this.f1380b = eVar;
        }

        @Override // p090g0.C1945e.b
        /* renamed from: a */
        public void mo1406a() {
            this.f1379a.end();
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f1380b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0313m0.e f1382a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f1383b;

        /* renamed from: c */
        public final /* synthetic */ View f1384c;

        /* renamed from: d */
        public final /* synthetic */ k f1385d;

        /* renamed from: androidx.fragment.app.d$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f1383b.endViewTransition(eVar.f1384c);
                e.this.f1385d.m1408a();
            }
        }

        public e(AbstractC0313m0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f1382a = eVar;
            this.f1383b = viewGroup;
            this.f1384c = view;
            this.f1385d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1383b.post(new a());
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f1382a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f1382a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    /* loaded from: classes.dex */
    public class f implements C1945e.b {

        /* renamed from: a */
        public final /* synthetic */ View f1388a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f1389b;

        /* renamed from: c */
        public final /* synthetic */ k f1390c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC0313m0.e f1391d;

        public f(View view, ViewGroup viewGroup, k kVar, AbstractC0313m0.e eVar) {
            this.f1388a = view;
            this.f1389b = viewGroup;
            this.f1390c = kVar;
            this.f1391d = eVar;
        }

        @Override // p090g0.C1945e.b
        /* renamed from: a */
        public void mo1406a() {
            this.f1388a.clearAnimation();
            this.f1389b.endViewTransition(this.f1388a);
            this.f1390c.m1408a();
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f1391d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC0313m0.e f1393h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC0313m0.e f1394i;

        /* renamed from: j */
        public final /* synthetic */ boolean f1395j;

        /* renamed from: k */
        public final /* synthetic */ C4771a f1396k;

        public g(AbstractC0313m0.e eVar, AbstractC0313m0.e eVar2, boolean z10, C4771a c4771a) {
            this.f1393h = eVar;
            this.f1394i = eVar2;
            this.f1395j = z10;
            this.f1396k = c4771a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0303h0.m1491a(this.f1393h.m1568f(), this.f1394i.m1568f(), this.f1395j, this.f1396k, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC0307j0 f1398h;

        /* renamed from: i */
        public final /* synthetic */ View f1399i;

        /* renamed from: j */
        public final /* synthetic */ Rect f1400j;

        public h(AbstractC0307j0 abstractC0307j0, View view, Rect rect) {
            this.f1398h = abstractC0307j0;
            this.f1399i = view;
            this.f1400j = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1398h.m1528h(this.f1399i, this.f1400j);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ ArrayList f1402h;

        public i(ArrayList arrayList) {
            this.f1402h = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0303h0.m1494d(this.f1402h, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ m f1404h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC0313m0.e f1405i;

        public j(m mVar, AbstractC0313m0.e eVar) {
            this.f1404h = mVar;
            this.f1405i = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1404h.m1408a();
            if (AbstractC0326x.m1617I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f1405i + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c */
        public boolean f1407c;

        /* renamed from: d */
        public boolean f1408d;

        /* renamed from: e */
        public C0308k.a f1409e;

        public k(AbstractC0313m0.e eVar, C1945e c1945e, boolean z10) {
            super(eVar, c1945e);
            this.f1408d = false;
            this.f1407c = z10;
        }

        /* renamed from: e */
        public C0308k.a m1407e(Context context) {
            if (this.f1408d) {
                return this.f1409e;
            }
            C0308k.a m1532b = C0308k.m1532b(context, m1409b().m1568f(), m1409b().m1567e() == AbstractC0313m0.e.c.VISIBLE, this.f1407c);
            this.f1409e = m1532b;
            this.f1408d = true;
            return m1532b;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        public final AbstractC0313m0.e f1410a;

        /* renamed from: b */
        public final C1945e f1411b;

        public l(AbstractC0313m0.e eVar, C1945e c1945e) {
            this.f1410a = eVar;
            this.f1411b = c1945e;
        }

        /* renamed from: a */
        public void m1408a() {
            this.f1410a.m1566d(this.f1411b);
        }

        /* renamed from: b */
        public AbstractC0313m0.e m1409b() {
            return this.f1410a;
        }

        /* renamed from: c */
        public C1945e m1410c() {
            return this.f1411b;
        }

        /* renamed from: d */
        public boolean m1411d() {
            AbstractC0313m0.e.c cVar;
            AbstractC0313m0.e.c m1575f = AbstractC0313m0.e.c.m1575f(this.f1410a.m1568f().mView);
            AbstractC0313m0.e.c m1567e = this.f1410a.m1567e();
            return m1575f == m1567e || !(m1575f == (cVar = AbstractC0313m0.e.c.VISIBLE) || m1567e == cVar);
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c */
        public final Object f1412c;

        /* renamed from: d */
        public final boolean f1413d;

        /* renamed from: e */
        public final Object f1414e;

        public m(AbstractC0313m0.e eVar, C1945e c1945e, boolean z10, boolean z11) {
            super(eVar, c1945e);
            boolean z12;
            Object obj;
            if (eVar.m1567e() == AbstractC0313m0.e.c.VISIBLE) {
                Fragment m1568f = eVar.m1568f();
                this.f1412c = z10 ? m1568f.getReenterTransition() : m1568f.getEnterTransition();
                Fragment m1568f2 = eVar.m1568f();
                z12 = z10 ? m1568f2.getAllowReturnTransitionOverlap() : m1568f2.getAllowEnterTransitionOverlap();
            } else {
                Fragment m1568f3 = eVar.m1568f();
                this.f1412c = z10 ? m1568f3.getReturnTransition() : m1568f3.getExitTransition();
                z12 = true;
            }
            this.f1413d = z12;
            if (z11) {
                Fragment m1568f4 = eVar.m1568f();
                obj = z10 ? m1568f4.getSharedElementReturnTransition() : m1568f4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f1414e = obj;
        }

        /* renamed from: e */
        public AbstractC0307j0 m1412e() {
            AbstractC0307j0 m1413f = m1413f(this.f1412c);
            AbstractC0307j0 m1413f2 = m1413f(this.f1414e);
            if (m1413f == null || m1413f2 == null || m1413f == m1413f2) {
                return m1413f != null ? m1413f : m1413f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m1409b().m1568f() + " returned Transition " + this.f1412c + " which uses a different Transition  type than its shared element transition " + this.f1414e);
        }

        /* renamed from: f */
        public final AbstractC0307j0 m1413f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC0307j0 abstractC0307j0 = C0303h0.f1493a;
            if (abstractC0307j0 != null && abstractC0307j0.mo1499e(obj)) {
                return abstractC0307j0;
            }
            AbstractC0307j0 abstractC0307j02 = C0303h0.f1494b;
            if (abstractC0307j02 != null && abstractC0307j02.mo1499e(obj)) {
                return abstractC0307j02;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m1409b().m1568f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: g */
        public Object m1414g() {
            return this.f1414e;
        }

        /* renamed from: h */
        public Object m1415h() {
            return this.f1412c;
        }

        /* renamed from: i */
        public boolean m1416i() {
            return this.f1414e != null;
        }

        /* renamed from: j */
        public boolean m1417j() {
            return this.f1413d;
        }
    }

    public C0294d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.AbstractC0313m0
    /* renamed from: f */
    public void mo1398f(List<AbstractC0313m0.e> list, boolean z10) {
        AbstractC0313m0.e eVar = null;
        AbstractC0313m0.e eVar2 = null;
        for (AbstractC0313m0.e eVar3 : list) {
            AbstractC0313m0.e.c m1575f = AbstractC0313m0.e.c.m1575f(eVar3.m1568f().mView);
            int i10 = a.f1369a[eVar3.m1567e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (m1575f == AbstractC0313m0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && m1575f != AbstractC0313m0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        m1405y(list);
        for (AbstractC0313m0.e eVar4 : list) {
            C1945e c1945e = new C1945e();
            eVar4.m1572j(c1945e);
            arrayList.add(new k(eVar4, c1945e, z10));
            C1945e c1945e2 = new C1945e();
            eVar4.m1572j(c1945e2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c1945e2, z10, z11));
                    eVar4.m1564a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c1945e2, z10, z11));
                eVar4.m1564a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c1945e2, z10, z11));
                    eVar4.m1564a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c1945e2, z10, z11));
                eVar4.m1564a(new b(arrayList3, eVar4));
            }
        }
        Map<AbstractC0313m0.e, Boolean> m1404x = m1404x(arrayList2, arrayList3, z10, eVar, eVar2);
        m1403w(arrayList, arrayList3, m1404x.containsValue(Boolean.TRUE), m1404x);
        Iterator<AbstractC0313m0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            m1399s(it.next());
        }
        arrayList3.clear();
        if (AbstractC0326x.m1617I0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    /* renamed from: s */
    public void m1399s(AbstractC0313m0.e eVar) {
        eVar.m1567e().m1576b(eVar.m1568f().mView);
    }

    /* renamed from: t */
    public void m1400t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C3314e0.m12212a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                m1400t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    public void m1401u(Map<String, View> map, View view) {
        String m11987A = C3308b0.m11987A(view);
        if (m11987A != null) {
            map.put(m11987A, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m1401u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void m1402v(C4771a<String, View> c4771a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c4771a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C3308b0.m11987A(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void m1403w(List<k> list, List<AbstractC0313m0.e> list2, boolean z10, Map<AbstractC0313m0.e, Boolean> map) {
        int i10;
        StringBuilder sb2;
        String str;
        boolean z11;
        int i11;
        C0308k.a m1407e;
        AbstractC0313m0.e eVar;
        ViewGroup m1558m = m1558m();
        Context context = m1558m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z12 = false;
        while (true) {
            i10 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.m1411d() || (m1407e = next.m1407e(context)) == null) {
                next.m1408a();
            } else {
                Animator animator = m1407e.f1520b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    AbstractC0313m0.e m1409b = next.m1409b();
                    Fragment m1568f = m1409b.m1568f();
                    if (Boolean.TRUE.equals(map.get(m1409b))) {
                        if (AbstractC0326x.m1617I0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + m1568f + " as this Fragment was involved in a Transition.");
                        }
                        next.m1408a();
                    } else {
                        boolean z13 = m1409b.m1567e() == AbstractC0313m0.e.c.GONE;
                        if (z13) {
                            list2.remove(m1409b);
                        }
                        View view = m1568f.mView;
                        m1558m.startViewTransition(view);
                        animator.addListener(new c(m1558m, view, z13, m1409b, next));
                        animator.setTarget(view);
                        animator.start();
                        if (AbstractC0326x.m1617I0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Animator from operation ");
                            eVar = m1409b;
                            sb3.append(eVar);
                            sb3.append(" has started.");
                            Log.v("FragmentManager", sb3.toString());
                        } else {
                            eVar = m1409b;
                        }
                        next.m1410c().m7854b(new d(animator, eVar));
                        z12 = true;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            AbstractC0313m0.e m1409b2 = kVar.m1409b();
            Fragment m1568f2 = m1409b2.m1568f();
            if (z10) {
                if (AbstractC0326x.m1617I0(i10)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m1568f2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar.m1408a();
            } else if (z12) {
                if (AbstractC0326x.m1617I0(i10)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m1568f2);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar.m1408a();
            } else {
                View view2 = m1568f2.mView;
                Animation animation = (Animation) C3205d.m11414j(((C0308k.a) C3205d.m11414j(kVar.m1407e(context))).f1519a);
                if (m1409b2.m1567e() != AbstractC0313m0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.m1408a();
                    z11 = z12;
                    i11 = i10;
                } else {
                    m1558m.startViewTransition(view2);
                    C0308k.b bVar = new C0308k.b(animation, m1558m, view2);
                    z11 = z12;
                    bVar.setAnimationListener(new e(m1409b2, m1558m, view2, kVar));
                    view2.startAnimation(bVar);
                    i11 = 2;
                    if (AbstractC0326x.m1617I0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + m1409b2 + " has started.");
                    }
                }
                kVar.m1410c().m7854b(new f(view2, m1558m, kVar, m1409b2));
                i10 = i11;
                z12 = z11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final Map<AbstractC0313m0.e, Boolean> m1404x(List<m> list, List<AbstractC0313m0.e> list2, boolean z10, AbstractC0313m0.e eVar, AbstractC0313m0.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        HashMap hashMap;
        View view2;
        Object mo1502k;
        C4771a c4771a;
        ArrayList<View> arrayList3;
        AbstractC0313m0.e eVar3;
        ArrayList<View> arrayList4;
        Rect rect;
        AbstractC0307j0 abstractC0307j0;
        HashMap hashMap2;
        AbstractC0313m0.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z11 = z10;
        AbstractC0313m0.e eVar5 = eVar;
        AbstractC0313m0.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        AbstractC0307j0 abstractC0307j02 = null;
        for (m mVar : list) {
            if (!mVar.m1411d()) {
                AbstractC0307j0 m1412e = mVar.m1412e();
                if (abstractC0307j02 == null) {
                    abstractC0307j02 = m1412e;
                } else if (m1412e != null && abstractC0307j02 != m1412e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m1409b().m1568f() + " returned Transition " + mVar.m1415h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC0307j02 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.m1409b(), Boolean.FALSE);
                mVar2.m1408a();
            }
            return hashMap3;
        }
        View view6 = new View(m1558m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C4771a c4771a2 = new C4771a();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z12 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.m1416i() || eVar5 == null || eVar6 == null) {
                c4771a = c4771a2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                abstractC0307j0 = abstractC0307j02;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object mo1510u = abstractC0307j02.mo1510u(abstractC0307j02.mo1500f(next.m1414g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m1568f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m1568f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m1568f().getSharedElementTargetNames();
                View view9 = view7;
                int i10 = 0;
                while (i10 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m1568f().getSharedElementTargetNames();
                Fragment m1568f = eVar.m1568f();
                if (z11) {
                    m1568f.getEnterTransitionCallback();
                    eVar2.m1568f().getExitTransitionCallback();
                } else {
                    m1568f.getExitTransitionCallback();
                    eVar2.m1568f().getEnterTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    c4771a2.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                if (AbstractC0326x.m1617I0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + it2.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + it3.next());
                    }
                }
                C4771a<String, View> c4771a3 = new C4771a<>();
                m1401u(c4771a3, eVar.m1568f().mView);
                c4771a3.m18706o(sharedElementSourceNames);
                c4771a2.m18706o(c4771a3.keySet());
                C4771a<String, View> c4771a4 = new C4771a<>();
                m1401u(c4771a4, eVar2.m1568f().mView);
                c4771a4.m18706o(sharedElementTargetNames2);
                c4771a4.m18706o(c4771a2.values());
                C0303h0.m1493c(c4771a2, c4771a4);
                m1402v(c4771a3, c4771a2.keySet());
                m1402v(c4771a4, c4771a2.values());
                if (c4771a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c4771a = c4771a2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    abstractC0307j0 = abstractC0307j02;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    C0303h0.m1491a(eVar2.m1568f(), eVar.m1568f(), z11, c4771a3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    c4771a = c4771a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC3342y.m12395a(m1558m(), new g(eVar2, eVar, z10, c4771a4));
                    arrayList5.addAll(c4771a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view9;
                    } else {
                        View view11 = (View) c4771a3.get(sharedElementSourceNames.get(0));
                        abstractC0307j02.mo1506p(mo1510u, view11);
                        view7 = view11;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c4771a4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) c4771a4.get(sharedElementTargetNames2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        ViewTreeObserverOnPreDrawListenerC3342y.m12395a(m1558m(), new h(abstractC0307j02, view5, rect2));
                        view4 = view10;
                        z12 = true;
                    }
                    abstractC0307j02.mo1508s(mo1510u, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    abstractC0307j0 = abstractC0307j02;
                    abstractC0307j02.mo1504n(mo1510u, null, null, null, null, mo1510u, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap2.put(eVar4, bool);
                    obj3 = mo1510u;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            hashMap3 = hashMap2;
            c4771a2 = c4771a;
            z11 = z10;
            arrayList6 = arrayList3;
            abstractC0307j02 = abstractC0307j0;
            AbstractC0313m0.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view12 = view7;
        C4771a c4771a5 = c4771a2;
        ArrayList<View> arrayList9 = arrayList6;
        AbstractC0313m0.e eVar8 = eVar5;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        AbstractC0307j0 abstractC0307j03 = abstractC0307j02;
        HashMap hashMap5 = hashMap3;
        View view13 = view6;
        AbstractC0313m0.e eVar9 = eVar6;
        View view14 = view13;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar3 : list) {
            if (mVar3.m1411d()) {
                hashMap5.put(mVar3.m1409b(), Boolean.FALSE);
                mVar3.m1408a();
            } else {
                Object mo1500f = abstractC0307j03.mo1500f(mVar3.m1415h());
                AbstractC0313m0.e m1409b = mVar3.m1409b();
                boolean z13 = obj3 != null && (m1409b == eVar8 || m1409b == eVar9);
                if (mo1500f == null) {
                    if (!z13) {
                        hashMap5.put(m1409b, Boolean.FALSE);
                        mVar3.m1408a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view14;
                    mo1502k = obj4;
                    hashMap = hashMap5;
                    view2 = view12;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    m1400t(arrayList12, m1409b.m1568f().mView);
                    if (z13) {
                        if (m1409b == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC0307j03.mo1496a(mo1500f, view14);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view14;
                        obj2 = obj5;
                        hashMap = hashMap5;
                        obj = obj6;
                    } else {
                        abstractC0307j03.mo1497b(mo1500f, arrayList12);
                        view = view14;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        hashMap = hashMap5;
                        abstractC0307j03.mo1504n(mo1500f, mo1500f, arrayList12, null, null, null, null);
                        if (m1409b.m1567e() == AbstractC0313m0.e.c.GONE) {
                            list2.remove(m1409b);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(m1409b.m1568f().mView);
                            abstractC0307j03.mo1503m(mo1500f, m1409b.m1568f().mView, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC3342y.m12395a(m1558m(), new i(arrayList12));
                        }
                    }
                    if (m1409b.m1567e() == AbstractC0313m0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            abstractC0307j03.mo1505o(mo1500f, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        abstractC0307j03.mo1506p(mo1500f, view2);
                    }
                    hashMap.put(m1409b, Boolean.TRUE);
                    if (mVar3.m1417j()) {
                        obj5 = abstractC0307j03.mo1502k(obj2, mo1500f, null);
                        mo1502k = obj;
                    } else {
                        mo1502k = abstractC0307j03.mo1502k(obj, mo1500f, null);
                        obj5 = obj2;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj4 = mo1502k;
                view12 = view2;
                str = str3;
                view14 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        String str4 = str;
        ArrayList<View> arrayList15 = arrayList10;
        HashMap hashMap6 = hashMap5;
        Object mo1501j = abstractC0307j03.mo1501j(obj5, obj4, obj3);
        if (mo1501j == null) {
            return hashMap6;
        }
        for (m mVar4 : list) {
            if (!mVar4.m1411d()) {
                Object m1415h = mVar4.m1415h();
                AbstractC0313m0.e m1409b2 = mVar4.m1409b();
                HashMap hashMap7 = hashMap6;
                boolean z14 = obj3 != null && (m1409b2 == eVar8 || m1409b2 == eVar2);
                if (m1415h == null && !z14) {
                    str2 = str4;
                } else if (C3308b0.m11993G(m1558m())) {
                    str2 = str4;
                    abstractC0307j03.mo1507q(mVar4.m1409b().m1568f(), mo1501j, mVar4.m1410c(), new j(mVar4, m1409b2));
                } else {
                    if (AbstractC0326x.m1617I0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m1558m() + " has not been laid out. Completing operation " + m1409b2);
                    } else {
                        str2 = str4;
                    }
                    mVar4.m1408a();
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!C3308b0.m11993G(m1558m())) {
            return hashMap8;
        }
        C0303h0.m1494d(arrayList11, 4);
        ArrayList<String> m1529l = abstractC0307j03.m1529l(arrayList14);
        if (AbstractC0326x.m1617I0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it4 = arrayList15.iterator();
            while (it4.hasNext()) {
                View next2 = it4.next();
                Log.v(str5, "View: " + next2 + " Name: " + C3308b0.m11987A(next2));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it5 = arrayList14.iterator();
            while (it5.hasNext()) {
                View next3 = it5.next();
                Log.v(str5, "View: " + next3 + " Name: " + C3308b0.m11987A(next3));
            }
        }
        abstractC0307j03.mo1498c(m1558m(), mo1501j);
        abstractC0307j03.m1530r(m1558m(), arrayList15, arrayList14, m1529l, c4771a5);
        C0303h0.m1494d(arrayList11, 0);
        abstractC0307j03.mo1509t(obj3, arrayList15, arrayList14);
        return hashMap8;
    }

    /* renamed from: y */
    public final void m1405y(List<AbstractC0313m0.e> list) {
        Fragment m1568f = list.get(list.size() - 1).m1568f();
        for (AbstractC0313m0.e eVar : list) {
            eVar.m1568f().mAnimationInfo.f1316c = m1568f.mAnimationInfo.f1316c;
            eVar.m1568f().mAnimationInfo.f1317d = m1568f.mAnimationInfo.f1317d;
            eVar.m1568f().mAnimationInfo.f1318e = m1568f.mAnimationInfo.f1318e;
            eVar.m1568f().mAnimationInfo.f1319f = m1568f.mAnimationInfo.f1319f;
        }
    }
}
