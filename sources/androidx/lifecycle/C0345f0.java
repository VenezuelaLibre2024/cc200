package androidx.lifecycle;

import android.app.Application;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.InvocationTargetException;
import p059e1.AbstractC1637a;
import p059e1.C1640d;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes.dex */
public class C0345f0 {

    /* renamed from: a */
    public final C0349h0 f1711a;

    /* renamed from: b */
    public final b f1712b;

    /* renamed from: c */
    public final AbstractC1637a f1713c;

    /* renamed from: androidx.lifecycle.f0$a */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: g */
        public static a f1715g;

        /* renamed from: e */
        public final Application f1717e;

        /* renamed from: f */
        public static final C6138a f1714f = new C6138a(null);

        /* renamed from: h */
        public static final AbstractC1637a.b<Application> f1716h = C6138a.C6139a.f1718a;

        /* renamed from: androidx.lifecycle.f0$a$a */
        /* loaded from: classes.dex */
        public static final class C6138a {

            /* renamed from: androidx.lifecycle.f0$a$a$a */
            /* loaded from: classes.dex */
            public static final class C6139a implements AbstractC1637a.b<Application> {

                /* renamed from: a */
                public static final C6139a f1718a = new C6139a();
            }

            public C6138a() {
            }

            public /* synthetic */ C6138a(C4747g c4747g) {
                this();
            }

            /* renamed from: a */
            public final a m1817a(Application application) {
                C4753m.m18653f(application, "application");
                if (a.f1715g == null) {
                    a.f1715g = new a(application);
                }
                a aVar = a.f1715g;
                C4753m.m18650c(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C4753m.m18653f(application, "application");
        }

        public a(Application application, int i10) {
            this.f1717e = application;
        }

        @Override // androidx.lifecycle.C0345f0.c, androidx.lifecycle.C0345f0.b
        /* renamed from: a */
        public <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
            C4753m.m18653f(cls, "modelClass");
            Application application = this.f1717e;
            if (application != null) {
                return (T) m1816g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C0345f0.b
        /* renamed from: b */
        public <T extends AbstractC0343e0> T mo1782b(Class<T> cls, AbstractC1637a abstractC1637a) {
            C4753m.m18653f(cls, "modelClass");
            C4753m.m18653f(abstractC1637a, "extras");
            if (this.f1717e != null) {
                return (T) mo1389a(cls);
            }
            Application application = (Application) abstractC1637a.mo6514a(f1716h);
            if (application != null) {
                return (T) m1816g(cls, application);
            }
            if (C0334a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.mo1389a(cls);
        }

        /* renamed from: g */
        public final <T extends AbstractC0343e0> T m1816g(Class<T> cls, Application application) {
            if (!C0334a.class.isAssignableFrom(cls)) {
                return (T) super.mo1389a(cls);
            }
            try {
                T newInstance = cls.getConstructor(Application.class).newInstance(application);
                C4753m.m18652e(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    /* renamed from: androidx.lifecycle.f0$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final a f1719a = a.f1720a;

        /* renamed from: androidx.lifecycle.f0$b$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            public static final /* synthetic */ a f1720a = new a();
        }

        /* renamed from: a */
        default <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
            C4753m.m18653f(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        /* renamed from: b */
        default <T extends AbstractC0343e0> T mo1782b(Class<T> cls, AbstractC1637a abstractC1637a) {
            C4753m.m18653f(cls, "modelClass");
            C4753m.m18653f(abstractC1637a, "extras");
            return (T) mo1389a(cls);
        }
    }

    /* renamed from: androidx.lifecycle.f0$c */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: c */
        public static c f1722c;

        /* renamed from: b */
        public static final a f1721b = new a(null);

        /* renamed from: d */
        public static final AbstractC1637a.b<String> f1723d = a.C6140a.f1724a;

        /* renamed from: androidx.lifecycle.f0$c$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.f0$c$a$a */
            /* loaded from: classes.dex */
            public static final class C6140a implements AbstractC1637a.b<String> {

                /* renamed from: a */
                public static final C6140a f1724a = new C6140a();
            }

            public a() {
            }

            public /* synthetic */ a(C4747g c4747g) {
                this();
            }

            /* renamed from: a */
            public final c m1820a() {
                if (c.f1722c == null) {
                    c.f1722c = new c();
                }
                c cVar = c.f1722c;
                C4753m.m18650c(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.C0345f0.b
        /* renamed from: a */
        public <T extends AbstractC0343e0> T mo1389a(Class<T> cls) {
            C4753m.m18653f(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C4753m.m18652e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    /* renamed from: androidx.lifecycle.f0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: c */
        public void mo1783c(AbstractC0343e0 abstractC0343e0) {
            C4753m.m18653f(abstractC0343e0, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0345f0(C0349h0 c0349h0, b bVar) {
        this(c0349h0, bVar, null, 4, null);
        C4753m.m18653f(c0349h0, "store");
        C4753m.m18653f(bVar, "factory");
    }

    public C0345f0(C0349h0 c0349h0, b bVar, AbstractC1637a abstractC1637a) {
        C4753m.m18653f(c0349h0, "store");
        C4753m.m18653f(bVar, "factory");
        C4753m.m18653f(abstractC1637a, "defaultCreationExtras");
        this.f1711a = c0349h0;
        this.f1712b = bVar;
        this.f1713c = abstractC1637a;
    }

    public /* synthetic */ C0345f0(C0349h0 c0349h0, b bVar, AbstractC1637a abstractC1637a, int i10, C4747g c4747g) {
        this(c0349h0, bVar, (i10 & 4) != 0 ? AbstractC1637a.a.f6041b : abstractC1637a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0345f0(InterfaceC0351i0 interfaceC0351i0, b bVar) {
        this(interfaceC0351i0.getViewModelStore(), bVar, C0347g0.m1821a(interfaceC0351i0));
        C4753m.m18653f(interfaceC0351i0, "owner");
        C4753m.m18653f(bVar, "factory");
    }

    /* renamed from: a */
    public <T extends AbstractC0343e0> T m1812a(Class<T> cls) {
        C4753m.m18653f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m1813b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: b */
    public <T extends AbstractC0343e0> T m1813b(String str, Class<T> cls) {
        T t10;
        C4753m.m18653f(str, Constants.KEY);
        C4753m.m18653f(cls, "modelClass");
        T t11 = (T) this.f1711a.m1824b(str);
        if (!cls.isInstance(t11)) {
            C1640d c1640d = new C1640d(this.f1713c);
            c1640d.m6518c(c.f1723d, str);
            try {
                t10 = (T) this.f1712b.mo1782b(cls, c1640d);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f1712b.mo1389a(cls);
            }
            this.f1711a.m1826d(str, t10);
            return t10;
        }
        Object obj = this.f1712b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            C4753m.m18650c(t11);
            dVar.mo1783c(t11);
        }
        C4753m.m18651d(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
