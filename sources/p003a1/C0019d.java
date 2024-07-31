package p003a1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0326x;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p003a1.C0019d;
import p115hd.C2488e0;
import p115hd.C2494h0;
import p115hd.C2510v;
import td.C4747g;
import td.C4753m;

/* renamed from: a1.d */
/* loaded from: classes.dex */
public final class C0019d {

    /* renamed from: a */
    public static final C0019d f42a = new C0019d();

    /* renamed from: b */
    public static c f43b = c.f54e;

    /* renamed from: a1.d$a */
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: a1.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m116a(AbstractC0029n abstractC0029n);
    }

    /* renamed from: a1.d$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d */
        public static final a f53d = new a(null);

        /* renamed from: e */
        public static final c f54e = new c(C2494h0.m9929b(), null, C2488e0.m9896d());

        /* renamed from: a */
        public final Set<a> f55a;

        /* renamed from: b */
        public final b f56b;

        /* renamed from: c */
        public final Map<String, Set<Class<? extends AbstractC0029n>>> f57c;

        /* renamed from: a1.d$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C4747g c4747g) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends AbstractC0029n>>> map) {
            C4753m.m18653f(set, "flags");
            C4753m.m18653f(map, "allowedViolations");
            this.f55a = set;
            this.f56b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends AbstractC0029n>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f57c = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<a> m117a() {
            return this.f55a;
        }

        /* renamed from: b */
        public final b m118b() {
            return this.f56b;
        }

        /* renamed from: c */
        public final Map<String, Set<Class<? extends AbstractC0029n>>> m119c() {
            return this.f57c;
        }
    }

    /* renamed from: e */
    public static final void m99e(c cVar, AbstractC0029n abstractC0029n) {
        C4753m.m18653f(cVar, "$policy");
        C4753m.m18653f(abstractC0029n, "$violation");
        cVar.m118b().m116a(abstractC0029n);
    }

    /* renamed from: f */
    public static final void m100f(String str, AbstractC0029n abstractC0029n) {
        C4753m.m18653f(abstractC0029n, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, abstractC0029n);
        throw abstractC0029n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final void m101h(Fragment fragment, String str) {
        C4753m.m18653f(fragment, "fragment");
        C4753m.m18653f(str, "previousFragmentId");
        C0016a c0016a = new C0016a(fragment, str);
        C0019d c0019d = f42a;
        c0019d.m112g(c0016a);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_FRAGMENT_REUSE) && c0019d.m114r(m110c, fragment.getClass(), c0016a.getClass())) {
            c0019d.m111d(m110c, c0016a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final void m102i(Fragment fragment, ViewGroup viewGroup) {
        C4753m.m18653f(fragment, "fragment");
        C0020e c0020e = new C0020e(fragment, viewGroup);
        C0019d c0019d = f42a;
        c0019d.m112g(c0020e);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0020e.getClass())) {
            c0019d.m111d(m110c, c0020e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static final void m103j(Fragment fragment) {
        C4753m.m18653f(fragment, "fragment");
        C0021f c0021f = new C0021f(fragment);
        C0019d c0019d = f42a;
        c0019d.m112g(c0021f);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0021f.getClass())) {
            c0019d.m111d(m110c, c0021f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static final void m104k(Fragment fragment) {
        C4753m.m18653f(fragment, "fragment");
        C0022g c0022g = new C0022g(fragment);
        C0019d c0019d = f42a;
        c0019d.m112g(c0022g);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0022g.getClass())) {
            c0019d.m111d(m110c, c0022g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static final void m105l(Fragment fragment) {
        C4753m.m18653f(fragment, "fragment");
        C0023h c0023h = new C0023h(fragment);
        C0019d c0019d = f42a;
        c0019d.m112g(c0023h);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0023h.getClass())) {
            c0019d.m111d(m110c, c0023h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m106m(Fragment fragment) {
        C4753m.m18653f(fragment, "fragment");
        C0025j c0025j = new C0025j(fragment);
        C0019d c0019d = f42a;
        c0019d.m112g(c0025j);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0025j.getClass())) {
            c0019d.m111d(m110c, c0025j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m107n(Fragment fragment, Fragment fragment2, int i10) {
        C4753m.m18653f(fragment, "violatingFragment");
        C4753m.m18653f(fragment2, "targetFragment");
        C0026k c0026k = new C0026k(fragment, fragment2, i10);
        C0019d c0019d = f42a;
        c0019d.m112g(c0026k);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c0019d.m114r(m110c, fragment.getClass(), c0026k.getClass())) {
            c0019d.m111d(m110c, c0026k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final void m108o(Fragment fragment, boolean z10) {
        C4753m.m18653f(fragment, "fragment");
        C0027l c0027l = new C0027l(fragment, z10);
        C0019d c0019d = f42a;
        c0019d.m112g(c0027l);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c0019d.m114r(m110c, fragment.getClass(), c0027l.getClass())) {
            c0019d.m111d(m110c, c0027l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final void m109p(Fragment fragment, ViewGroup viewGroup) {
        C4753m.m18653f(fragment, "fragment");
        C4753m.m18653f(viewGroup, "container");
        C0030o c0030o = new C0030o(fragment, viewGroup);
        C0019d c0019d = f42a;
        c0019d.m112g(c0030o);
        c m110c = c0019d.m110c(fragment);
        if (m110c.m117a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c0019d.m114r(m110c, fragment.getClass(), c0030o.getClass())) {
            c0019d.m111d(m110c, c0030o);
        }
    }

    /* renamed from: c */
    public final c m110c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                AbstractC0326x parentFragmentManager = fragment.getParentFragmentManager();
                C4753m.m18652e(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.m1638B0() != null) {
                    c m1638B0 = parentFragmentManager.m1638B0();
                    C4753m.m18650c(m1638B0);
                    return m1638B0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f43b;
    }

    /* renamed from: d */
    public final void m111d(final c cVar, final AbstractC0029n abstractC0029n) {
        Fragment m120a = abstractC0029n.m120a();
        final String name = m120a.getClass().getName();
        if (cVar.m117a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC0029n);
        }
        if (cVar.m118b() != null) {
            m113q(m120a, new Runnable() { // from class: a1.b
                @Override // java.lang.Runnable
                public final void run() {
                    C0019d.m99e(C0019d.c.this, abstractC0029n);
                }
            });
        }
        if (cVar.m117a().contains(a.PENALTY_DEATH)) {
            m113q(m120a, new Runnable() { // from class: a1.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0019d.m100f(name, abstractC0029n);
                }
            });
        }
    }

    /* renamed from: g */
    public final void m112g(AbstractC0029n abstractC0029n) {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC0029n.m120a().getClass().getName(), abstractC0029n);
        }
    }

    /* renamed from: q */
    public final void m113q(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler m1598g = fragment.getParentFragmentManager().m1732v0().m1598g();
            C4753m.m18652e(m1598g, "fragment.parentFragmentManager.host.handler");
            if (!C4753m.m18648a(m1598g.getLooper(), Looper.myLooper())) {
                m1598g.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: r */
    public final boolean m114r(c cVar, Class<? extends Fragment> cls, Class<? extends AbstractC0029n> cls2) {
        Set<Class<? extends AbstractC0029n>> set = cVar.m119c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C4753m.m18648a(cls2.getSuperclass(), AbstractC0029n.class) || !C2510v.m10015n(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
