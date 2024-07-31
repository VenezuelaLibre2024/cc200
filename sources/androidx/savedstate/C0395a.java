package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import androidx.savedstate.C0395a;
import androidx.savedstate.Recreator;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.Map;
import p216p.C3994b;
import p247r1.InterfaceC4275d;
import td.C4747g;
import td.C4753m;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C0395a {

    /* renamed from: g */
    public static final b f1881g = new b(null);

    /* renamed from: b */
    public boolean f1883b;

    /* renamed from: c */
    public Bundle f1884c;

    /* renamed from: d */
    public boolean f1885d;

    /* renamed from: e */
    public Recreator.C0394b f1886e;

    /* renamed from: a */
    public final C3994b<String, c> f1882a = new C3994b<>();

    /* renamed from: f */
    public boolean f1887f = true;

    /* renamed from: androidx.savedstate.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1762a(InterfaceC4275d interfaceC4275d);
    }

    /* renamed from: androidx.savedstate.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        Bundle mo595a();
    }

    /* renamed from: d */
    public static final void m1991d(C0395a c0395a, InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        boolean z10;
        C4753m.m18653f(c0395a, "this$0");
        C4753m.m18653f(interfaceC0354k, "<anonymous parameter 0>");
        C4753m.m18653f(aVar, "event");
        if (aVar == AbstractC0344f.a.ON_START) {
            z10 = true;
        } else if (aVar != AbstractC0344f.a.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        c0395a.f1887f = z10;
    }

    /* renamed from: b */
    public final Bundle m1992b(String str) {
        C4753m.m18653f(str, Constants.KEY);
        if (!this.f1885d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f1884c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f1884c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f1884c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f1884c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final c m1993c(String str) {
        C4753m.m18653f(str, Constants.KEY);
        Iterator<Map.Entry<String, c>> it = this.f1882a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            C4753m.m18652e(next, "components");
            String key = next.getKey();
            c value = next.getValue();
            if (C4753m.m18648a(key, str)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1994e(AbstractC0344f abstractC0344f) {
        C4753m.m18653f(abstractC0344f, "lifecycle");
        if (!(!this.f1883b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        abstractC0344f.mo1800a(new InterfaceC0350i() { // from class: r1.b
            public /* synthetic */ C4273b() {
            }

            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public final void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                C0395a.m1991d(C0395a.this, interfaceC0354k, aVar);
            }
        });
        this.f1883b = true;
    }

    /* renamed from: f */
    public final void m1995f(Bundle bundle) {
        if (!this.f1883b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f1885d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f1884c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f1885d = true;
    }

    /* renamed from: g */
    public final void m1996g(Bundle bundle) {
        C4753m.m18653f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1884c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3994b<String, c>.d m15128c = this.f1882a.m15128c();
        C4753m.m18652e(m15128c, "this.components.iteratorWithAdditions()");
        while (m15128c.hasNext()) {
            Map.Entry next = m15128c.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).mo595a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: h */
    public final void m1997h(String str, c cVar) {
        C4753m.m18653f(str, Constants.KEY);
        C4753m.m18653f(cVar, "provider");
        if (!(this.f1882a.mo15124h(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void m1998i(Class<? extends a> cls) {
        C4753m.m18653f(cls, "clazz");
        if (!this.f1887f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.C0394b c0394b = this.f1886e;
        if (c0394b == null) {
            c0394b = new Recreator.C0394b(this);
        }
        this.f1886e = c0394b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.C0394b c0394b2 = this.f1886e;
            if (c0394b2 != null) {
                String name = cls.getName();
                C4753m.m18652e(name, "clazz.name");
                c0394b2.m1989b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
