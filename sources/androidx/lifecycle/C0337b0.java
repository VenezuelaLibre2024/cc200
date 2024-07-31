package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0345f0;
import androidx.savedstate.C0395a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import p059e1.AbstractC1637a;
import p247r1.InterfaceC4275d;
import td.C4753m;

/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public final class C0337b0 extends C0345f0.d implements C0345f0.b {

    /* renamed from: b */
    public Application f1686b;

    /* renamed from: c */
    public final C0345f0.b f1687c;

    /* renamed from: d */
    public Bundle f1688d;

    /* renamed from: e */
    public AbstractC0344f f1689e;

    /* renamed from: f */
    public C0395a f1690f;

    @SuppressLint({"LambdaLast"})
    public C0337b0(Application application, InterfaceC4275d interfaceC4275d, Bundle bundle) {
        C4753m.m18653f(interfaceC4275d, "owner");
        this.f1690f = interfaceC4275d.getSavedStateRegistry();
        this.f1689e = interfaceC4275d.getLifecycle();
        this.f1688d = bundle;
        this.f1686b = application;
        this.f1687c = application != null ? C0345f0.a.f1714f.m1817a(application) : new C0345f0.a();
    }

    @Override // androidx.lifecycle.C0345f0.b
    /* renamed from: a */
    public <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
        C4753m.m18653f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m1784d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0345f0.b
    /* renamed from: b */
    public <T extends AbstractC0343e0> T mo1782b(Class<T> cls, AbstractC1637a abstractC1637a) {
        C4753m.m18653f(cls, "modelClass");
        C4753m.m18653f(abstractC1637a, "extras");
        String str = (String) abstractC1637a.mo6514a(C0345f0.c.f1723d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (abstractC1637a.mo6514a(C0369y.f1767a) == null || abstractC1637a.mo6514a(C0369y.f1768b) == null) {
            if (this.f1689e != null) {
                return (T) m1784d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) abstractC1637a.mo6514a(C0345f0.a.f1716h);
        boolean isAssignableFrom = C0334a.class.isAssignableFrom(cls);
        Constructor m1787c = C0339c0.m1787c(cls, (!isAssignableFrom || application == null) ? C0339c0.f1692b : C0339c0.f1691a);
        return m1787c == null ? (T) this.f1687c.mo1782b(cls, abstractC1637a) : (!isAssignableFrom || application == null) ? (T) C0339c0.m1788d(cls, m1787c, C0369y.m1883a(abstractC1637a)) : (T) C0339c0.m1788d(cls, m1787c, application, C0369y.m1883a(abstractC1637a));
    }

    @Override // androidx.lifecycle.C0345f0.d
    /* renamed from: c */
    public void mo1783c(AbstractC0343e0 abstractC0343e0) {
        C4753m.m18653f(abstractC0343e0, "viewModel");
        if (this.f1689e != null) {
            C0395a c0395a = this.f1690f;
            C4753m.m18650c(c0395a);
            AbstractC0344f abstractC0344f = this.f1689e;
            C4753m.m18650c(abstractC0344f);
            LegacySavedStateHandleController.m1759a(abstractC0343e0, c0395a, abstractC0344f);
        }
    }

    /* renamed from: d */
    public final <T extends AbstractC0343e0> T m1784d(String str, Class<T> cls) {
        T t10;
        Application application;
        C4753m.m18653f(str, Constants.KEY);
        C4753m.m18653f(cls, "modelClass");
        AbstractC0344f abstractC0344f = this.f1689e;
        if (abstractC0344f == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C0334a.class.isAssignableFrom(cls);
        Constructor m1787c = C0339c0.m1787c(cls, (!isAssignableFrom || this.f1686b == null) ? C0339c0.f1692b : C0339c0.f1691a);
        if (m1787c == null) {
            return this.f1686b != null ? (T) this.f1687c.mo1389a(cls) : (T) C0345f0.c.f1721b.m1820a().mo1389a(cls);
        }
        C0395a c0395a = this.f1690f;
        C4753m.m18650c(c0395a);
        SavedStateHandleController m1760b = LegacySavedStateHandleController.m1760b(c0395a, abstractC0344f, str, this.f1688d);
        if (!isAssignableFrom || (application = this.f1686b) == null) {
            t10 = (T) C0339c0.m1788d(cls, m1787c, m1760b.m1771c());
        } else {
            C4753m.m18650c(application);
            t10 = (T) C0339c0.m1788d(cls, m1787c, application, m1760b.m1771c());
        }
        t10.m1799e("androidx.lifecycle.savedstate.vm.tag", m1760b);
        return t10;
    }
}
