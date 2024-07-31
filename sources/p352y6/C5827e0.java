package p352y6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import p064e6.C1677g;
import p064e6.C1681i;
import p108h6.C2394s;
import p252r6.BinderC4309d;
import p336x6.C5631e;
import p367z6.C6038v;

/* renamed from: y6.e0 */
/* loaded from: classes.dex */
public final class C5827e0 {

    /* renamed from: a */
    public static final String f21851a = "e0";

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f21852b;

    /* renamed from: c */
    public static InterfaceC5831g0 f21853c;

    /* renamed from: a */
    public static InterfaceC5831g0 m23441a(Context context, C5631e.a aVar) {
        C2394s.m9619l(context);
        Log.d(f21851a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        InterfaceC5831g0 interfaceC5831g0 = f21853c;
        if (interfaceC5831g0 != null) {
            return interfaceC5831g0;
        }
        int m6722g = C1681i.m6722g(context, 13400000);
        if (m6722g != 0) {
            throw new C1677g(m6722g);
        }
        InterfaceC5831g0 m23444d = m23444d(context, aVar);
        f21853c = m23444d;
        try {
            if (m23444d.zzd() == 2) {
                try {
                    f21853c.mo23450e1(BinderC4309d.m16572g(m23443c(context, aVar)));
                } catch (RemoteException e10) {
                    throw new C6038v(e10);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(f21851a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f21852b = null;
                    f21853c = m23444d(context, C5631e.a.LEGACY);
                }
            }
            try {
                InterfaceC5831g0 interfaceC5831g02 = f21853c;
                Context m23443c = m23443c(context, aVar);
                m23443c.getClass();
                interfaceC5831g02.mo23449a1(BinderC4309d.m16572g(m23443c.getResources()), 18020000);
                return f21853c;
            } catch (RemoteException e11) {
                throw new C6038v(e11);
            }
        } catch (RemoteException e12) {
            throw new C6038v(e12);
        }
    }

    /* renamed from: b */
    public static Context m23442b(Exception exc, Context context) {
        Log.e(f21851a, "Failed to load maps module, use pre-Chimera", exc);
        return C1681i.m6720d(context);
    }

    /* renamed from: c */
    public static Context m23443c(Context context, C5631e.a aVar) {
        Context m23442b;
        Context context2 = f21852b;
        if (context2 != null) {
            return context2;
        }
        String str = aVar == C5631e.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            m23442b = DynamiteModule.m4996e(context, DynamiteModule.f4481b, str).m5004b();
        } catch (Exception e10) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                m23442b = m23442b(e10, context);
            } else {
                try {
                    Log.d(f21851a, "Attempting to load maps_dynamite again.");
                    m23442b = DynamiteModule.m4996e(context, DynamiteModule.f4481b, "com.google.android.gms.maps_dynamite").m5004b();
                } catch (Exception e11) {
                    m23442b = m23442b(e11, context);
                }
            }
        }
        f21852b = m23442b;
        return m23442b;
    }

    /* renamed from: d */
    public static InterfaceC5831g0 m23444d(Context context, C5631e.a aVar) {
        Log.i(f21851a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) m23445e(((ClassLoader) C2394s.m9619l(m23443c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof InterfaceC5831g0 ? (InterfaceC5831g0) queryLocalInterface : new C5829f0(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    /* renamed from: e */
    public static Object m23445e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e11);
        }
    }
}
