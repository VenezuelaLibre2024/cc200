package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p064e6.C1675f;
import p108h6.C2388q;
import p108h6.C2394s;
import p207o6.C3937f;
import p252r6.BinderC4309d;
import p267s6.C4537b;
import p267s6.C4538c;
import p267s6.C4539d;
import p267s6.C4541f;
import p267s6.C4542g;
import p267s6.C4543h;
import p267s6.C4544i;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h */
    public static Boolean f4487h = null;

    /* renamed from: i */
    public static String f4488i = null;

    /* renamed from: j */
    public static boolean f4489j = false;

    /* renamed from: k */
    public static int f4490k = -1;

    /* renamed from: l */
    public static Boolean f4491l;

    /* renamed from: q */
    public static C4543h f4496q;

    /* renamed from: r */
    public static C4544i f4497r;

    /* renamed from: a */
    public final Context f4498a;

    /* renamed from: m */
    public static final ThreadLocal f4492m = new ThreadLocal();

    /* renamed from: n */
    public static final ThreadLocal f4493n = new C4539d();

    /* renamed from: o */
    public static final InterfaceC1166b.a f4494o = new C1167a();

    /* renamed from: b */
    public static final InterfaceC1166b f4481b = new C1168b();

    /* renamed from: c */
    public static final InterfaceC1166b f4482c = new C1169c();

    /* renamed from: d */
    public static final InterfaceC1166b f4483d = new C1170d();

    /* renamed from: e */
    public static final InterfaceC1166b f4484e = new C1171e();

    /* renamed from: f */
    public static final InterfaceC1166b f4485f = new C1172f();

    /* renamed from: g */
    public static final InterfaceC1166b f4486g = new C1173g();

    /* renamed from: p */
    public static final InterfaceC1166b f4495p = new C1174h();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public static class C1165a extends Exception {
        public /* synthetic */ C1165a(String str, Throwable th, C4542g c4542g) {
            super(str, th);
        }

        public /* synthetic */ C1165a(String str, C4542g c4542g) {
            super(str);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1166b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            int mo5007a(Context context, String str, boolean z10);

            /* renamed from: b */
            int mo5008b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a */
            public int f4499a = 0;

            /* renamed from: b */
            public int f4500b = 0;

            /* renamed from: c */
            public int f4501c = 0;
        }

        /* renamed from: a */
        b mo5006a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        C2394s.m9619l(context);
        this.f4498a = context;
    }

    /* renamed from: a */
    public static int m4994a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C2388q.m9592b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m4995c(Context context, String str) {
        return m4997f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023c  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule m4996e(android.content.Context r16, com.google.android.gms.dynamite.DynamiteModule.InterfaceC1166b r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4996e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: f */
    public static int m4997f(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f4487h;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e11.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    m5000i(classLoader);
                                } catch (C1165a unused) {
                                }
                                bool = Boolean.TRUE;
                                f4487h = bool;
                            } else {
                                if (!m5002k(context)) {
                                    return 0;
                                }
                                if (!f4489j) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int m4998g = m4998g(context, str, z10, true);
                                            String str2 = f4488i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader m17967a = C4537b.m17967a();
                                                if (m17967a == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = f4488i;
                                                        C2394s.m9619l(str3);
                                                        m17967a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f4488i;
                                                        C2394s.m9619l(str4);
                                                        m17967a = new C4538c(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                m5000i(m17967a);
                                                declaredField.set(null, m17967a);
                                                f4487h = bool2;
                                                return m4998g;
                                            }
                                            return m4998g;
                                        } catch (C1165a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f4487h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m4998g(context, str, z10, false);
                    } catch (C1165a e12) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e12.getMessage());
                        return 0;
                    }
                }
                C4543h m5003l = m5003l(context);
                if (m5003l != null) {
                    try {
                        try {
                            int zze = m5003l.zze();
                            if (zze >= 3) {
                                C4541f c4541f = (C4541f) f4492m.get();
                                if (c4541f == null || (cursor = c4541f.f17140a) == null) {
                                    Cursor cursor2 = (Cursor) BinderC4309d.m16571e(m5003l.m17970O1(BinderC4309d.m16572g(context), str, z10, ((Long) f4493n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i11 = cursor2.getInt(0);
                                                r2 = (i11 <= 0 || !m5001j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = m5003l.m17972e(BinderC4309d.m16572g(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = m5003l.m17971c(BinderC4309d.m16572g(context), str, z10);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                }
                return i10;
            }
        } catch (Throwable th4) {
            C3937f.m14937a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4998g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m4998g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    public static DynamiteModule m4999h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* renamed from: i */
    public static void m5000i(ClassLoader classLoader) {
        C4544i c4544i;
        C4542g c4542g = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c4544i = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c4544i = queryLocalInterface instanceof C4544i ? (C4544i) queryLocalInterface : new C4544i(iBinder);
            }
            f4497r = c4544i;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new C1165a("Failed to instantiate dynamite loader", e10, c4542g);
        }
    }

    /* renamed from: j */
    public static boolean m5001j(Cursor cursor) {
        C4541f c4541f = (C4541f) f4492m.get();
        if (c4541f == null || c4541f.f17140a != null) {
            return false;
        }
        c4541f.f17140a = cursor;
        return true;
    }

    /* renamed from: k */
    public static boolean m5002k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4491l)) {
            return true;
        }
        boolean z10 = false;
        if (f4491l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1675f.m6715f().mo6698h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f4491l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4489j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* renamed from: l */
    public static C4543h m5003l(Context context) {
        C4543h c4543h;
        synchronized (DynamiteModule.class) {
            C4543h c4543h2 = f4496q;
            if (c4543h2 != null) {
                return c4543h2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c4543h = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c4543h = queryLocalInterface instanceof C4543h ? (C4543h) queryLocalInterface : new C4543h(iBinder);
                }
                if (c4543h != null) {
                    f4496q = c4543h;
                    return c4543h;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public Context m5004b() {
        return this.f4498a;
    }

    /* renamed from: d */
    public IBinder m5005d(String str) {
        try {
            return (IBinder) this.f4498a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new C1165a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
