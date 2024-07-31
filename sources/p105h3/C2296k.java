package p105h3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h3.k */
/* loaded from: classes.dex */
public class C2296k implements InterfaceC2290e {

    /* renamed from: a */
    public final a f9204a;

    /* renamed from: b */
    public final C2294i f9205b;

    /* renamed from: c */
    public final Map<String, InterfaceC2298m> f9206c;

    /* renamed from: h3.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Context f9207a;

        /* renamed from: b */
        public Map<String, String> f9208b = null;

        public a(Context context) {
            this.f9207a = context;
        }

        /* renamed from: d */
        public static Bundle m9315d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> m9316a(Context context) {
            Bundle m9315d = m9315d(context);
            if (m9315d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m9315d.keySet()) {
                Object obj = m9315d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public InterfaceC2289d m9317b(String str) {
            String format;
            String format2;
            String str2 = m9318c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC2289d) Class.forName(str2).asSubclass(InterfaceC2289d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                e = e10;
                format2 = String.format("Class %s is not found.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> m9318c() {
            if (this.f9208b == null) {
                this.f9208b = m9316a(this.f9207a);
            }
            return this.f9208b;
        }
    }

    public C2296k(Context context, C2294i c2294i) {
        this(new a(context), c2294i);
    }

    public C2296k(a aVar, C2294i c2294i) {
        this.f9206c = new HashMap();
        this.f9204a = aVar;
        this.f9205b = c2294i;
    }

    @Override // p105h3.InterfaceC2290e
    public synchronized InterfaceC2298m get(String str) {
        if (this.f9206c.containsKey(str)) {
            return this.f9206c.get(str);
        }
        InterfaceC2289d m9317b = this.f9204a.m9317b(str);
        if (m9317b == null) {
            return null;
        }
        InterfaceC2298m create = m9317b.create(this.f9205b.m9311a(str));
        this.f9206c.put(str, create);
        return create;
    }
}
