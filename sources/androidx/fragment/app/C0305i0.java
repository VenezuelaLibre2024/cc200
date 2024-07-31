package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p090g0.C1945e;

/* renamed from: androidx.fragment.app.i0 */
/* loaded from: classes.dex */
public class C0305i0 extends AbstractC0307j0 {

    /* renamed from: androidx.fragment.app.i0$a */
    /* loaded from: classes.dex */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f1496a;

        public a(Rect rect) {
            this.f1496a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f1496a;
        }
    }

    /* renamed from: androidx.fragment.app.i0$b */
    /* loaded from: classes.dex */
    public class b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f1498a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1499b;

        public b(View view, ArrayList arrayList) {
            this.f1498a = view;
            this.f1499b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.m1513b(transition, this);
            this.f1498a.setVisibility(8);
            int size = this.f1499b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f1499b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            f.m1513b(transition, this);
            f.m1512a(transition, this);
        }
    }

    /* renamed from: androidx.fragment.app.i0$c */
    /* loaded from: classes.dex */
    public class c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f1501a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f1502b;

        /* renamed from: c */
        public final /* synthetic */ Object f1503c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f1504d;

        /* renamed from: e */
        public final /* synthetic */ Object f1505e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f1506f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1501a = obj;
            this.f1502b = arrayList;
            this.f1503c = obj2;
            this.f1504d = arrayList2;
            this.f1505e = obj3;
            this.f1506f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            f.m1513b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f1501a;
            if (obj != null) {
                C0305i0.this.m1511w(obj, this.f1502b, null);
            }
            Object obj2 = this.f1503c;
            if (obj2 != null) {
                C0305i0.this.m1511w(obj2, this.f1504d, null);
            }
            Object obj3 = this.f1505e;
            if (obj3 != null) {
                C0305i0.this.m1511w(obj3, this.f1506f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i0$d */
    /* loaded from: classes.dex */
    public class d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f1508a;

        public d(Runnable runnable) {
            this.f1508a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f1508a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.i0$e */
    /* loaded from: classes.dex */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f1510a;

        public e(Rect rect) {
            this.f1510a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1510a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1510a;
        }
    }

    /* renamed from: androidx.fragment.app.i0$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        public static void m1512a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        public static void m1513b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    /* renamed from: v */
    public static boolean m1495v(Transition transition) {
        return (AbstractC0307j0.m1527i(transition.getTargetIds()) && AbstractC0307j0.m1527i(transition.getTargetNames()) && AbstractC0307j0.m1527i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: a */
    public void mo1496a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: b */
    public void mo1497b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo1497b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m1495v(transition) || !AbstractC0307j0.m1527i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: c */
    public void mo1498c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: e */
    public boolean mo1499e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: f */
    public Object mo1500f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: j */
    public Object mo1501j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: k */
    public Object mo1502k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: m */
    public void mo1503m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: n */
    public void mo1504n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: o */
    public void mo1505o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: p */
    public void mo1506p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1528h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: q */
    public void mo1507q(Fragment fragment, Object obj, C1945e c1945e, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: s */
    public void mo1508s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0307j0.m1525d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo1497b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: t */
    public void mo1509t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m1511w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0307j0
    /* renamed from: u */
    public Object mo1510u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void m1511w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                m1511w(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m1495v(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}
