package p287u1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p315w1.C5196a;

/* renamed from: u1.a */
/* loaded from: classes.dex */
public final class C4787a {

    /* renamed from: d */
    public static volatile C4787a f17821d;

    /* renamed from: e */
    public static final Object f17822e = new Object();

    /* renamed from: c */
    public final Context f17825c;

    /* renamed from: b */
    public final Set<Class<? extends InterfaceC4788b<?>>> f17824b = new HashSet();

    /* renamed from: a */
    public final Map<Class<?>, Object> f17823a = new HashMap();

    public C4787a(Context context) {
        this.f17825c = context.getApplicationContext();
    }

    /* renamed from: e */
    public static C4787a m18809e(Context context) {
        if (f17821d == null) {
            synchronized (f17822e) {
                if (f17821d == null) {
                    f17821d = new C4787a(context);
                }
            }
        }
        return f17821d;
    }

    /* renamed from: a */
    public void m18810a() {
        try {
            try {
                C5196a.m21035c("Startup");
                m18811b(this.f17825c.getPackageManager().getProviderInfo(new ComponentName(this.f17825c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C4790d(e10);
            }
        } finally {
            C5196a.m21038f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m18811b(Bundle bundle) {
        String string = this.f17825c.getString(C4789c.f17826a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC4788b.class.isAssignableFrom(cls)) {
                            this.f17824b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC4788b<?>>> it = this.f17824b.iterator();
                while (it.hasNext()) {
                    m18813d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C4790d(e10);
            }
        }
    }

    /* renamed from: c */
    public <T> T m18812c(Class<? extends InterfaceC4788b<?>> cls) {
        T t10;
        synchronized (f17822e) {
            t10 = (T) this.f17823a.get(cls);
            if (t10 == null) {
                t10 = (T) m18813d(cls, new HashSet());
            }
        }
        return t10;
    }

    /* renamed from: d */
    public final <T> T m18813d(Class<? extends InterfaceC4788b<?>> cls, Set<Class<?>> set) {
        T t10;
        if (C5196a.m21040h()) {
            try {
                C5196a.m21035c(cls.getSimpleName());
            } finally {
                C5196a.m21038f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f17823a.containsKey(cls)) {
            t10 = (T) this.f17823a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC4788b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC4788b<?>>> mo1211a = newInstance.mo1211a();
                if (!mo1211a.isEmpty()) {
                    for (Class<? extends InterfaceC4788b<?>> cls2 : mo1211a) {
                        if (!this.f17823a.containsKey(cls2)) {
                            m18813d(cls2, set);
                        }
                    }
                }
                t10 = (T) newInstance.mo1212b(this.f17825c);
                set.remove(cls);
                this.f17823a.put(cls, t10);
            } catch (Throwable th) {
                throw new C4790d(th);
            }
        }
        return t10;
    }

    /* renamed from: f */
    public <T> T m18814f(Class<? extends InterfaceC4788b<T>> cls) {
        return (T) m18812c(cls);
    }

    /* renamed from: g */
    public boolean m18815g(Class<? extends InterfaceC4788b<?>> cls) {
        return this.f17824b.contains(cls);
    }
}
