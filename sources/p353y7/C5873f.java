package p353y7;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p354y8.InterfaceC5896b;

/* renamed from: y7.f */
/* loaded from: classes.dex */
public final class C5873f<T> {

    /* renamed from: a */
    public final T f21879a;

    /* renamed from: b */
    public final c<T> f21880b;

    /* renamed from: y7.f$b */
    /* loaded from: classes.dex */
    public static class b implements c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f21881a;

        public b(Class<? extends Service> cls) {
            this.f21881a = cls;
        }

        /* renamed from: b */
        public final Bundle m23512b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f21881a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f21881a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p353y7.C5873f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo23511a(Context context) {
            Bundle m23512b = m23512b(context);
            if (m23512b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m23512b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m23512b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: y7.f$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        List<String> mo23511a(T t10);
    }

    public C5873f(T t10, c<T> cVar) {
        this.f21879a = t10;
        this.f21880b = cVar;
    }

    /* renamed from: c */
    public static C5873f<Context> m23507c(Context context, Class<? extends Service> cls) {
        return new C5873f<>(context, new b(cls));
    }

    /* renamed from: d */
    public static ComponentRegistrar m23508d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C5890v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new C5890v(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new C5890v(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new C5890v(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new C5890v(String.format("Could not instantiate %s", str), e13);
        }
    }

    /* renamed from: b */
    public List<InterfaceC5896b<ComponentRegistrar>> m23510b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f21880b.mo23511a(this.f21879a)) {
            arrayList.add(new InterfaceC5896b() { // from class: y7.e
                @Override // p354y8.InterfaceC5896b
                public final Object get() {
                    ComponentRegistrar m23508d;
                    m23508d = C5873f.m23508d(str);
                    return m23508d;
                }
            });
        }
        return arrayList;
    }
}
