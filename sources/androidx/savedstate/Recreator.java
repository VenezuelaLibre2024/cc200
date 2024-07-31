package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import androidx.savedstate.C0395a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p247r1.InterfaceC4275d;
import td.C4747g;
import td.C4753m;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0350i {

    /* renamed from: i */
    public static final C0393a f1878i = new C0393a(null);

    /* renamed from: h */
    public final InterfaceC4275d f1879h;

    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C0393a {
        public C0393a() {
        }

        public /* synthetic */ C0393a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    /* loaded from: classes.dex */
    public static final class C0394b implements C0395a.c {

        /* renamed from: a */
        public final Set<String> f1880a;

        public C0394b(C0395a c0395a) {
            C4753m.m18653f(c0395a, "registry");
            this.f1880a = new LinkedHashSet();
            c0395a.m1997h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C0395a.c
        /* renamed from: a */
        public Bundle mo595a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1880a));
            return bundle;
        }

        /* renamed from: b */
        public final void m1989b(String str) {
            C4753m.m18653f(str, "className");
            this.f1880a.add(str);
        }
    }

    public Recreator(InterfaceC4275d interfaceC4275d) {
        C4753m.m18653f(interfaceC4275d, "owner");
        this.f1879h = interfaceC4275d;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        if (aVar != AbstractC0344f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0354k.getLifecycle().mo1802c(this);
        Bundle m1992b = this.f1879h.getSavedStateRegistry().m1992b("androidx.savedstate.Restarter");
        if (m1992b == null) {
            return;
        }
        ArrayList<String> stringArrayList = m1992b.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m1988b(it.next());
        }
    }

    /* renamed from: b */
    public final void m1988b(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C0395a.a.class);
            C4753m.m18652e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C4753m.m18652e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C0395a.a) newInstance).mo1762a(this.f1879h);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }
}
