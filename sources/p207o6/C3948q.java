package p207o6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import p108h6.C2394s;
import p237q6.C4195c;
import p345y.C5782a;

/* renamed from: o6.q */
/* loaded from: classes.dex */
public class C3948q {

    /* renamed from: a */
    public static final int f14197a = Process.myUid();

    /* renamed from: b */
    public static final Method f14198b;

    /* renamed from: c */
    public static final Method f14199c;

    /* renamed from: d */
    public static final Method f14200d;

    /* renamed from: e */
    public static final Method f14201e;

    /* renamed from: f */
    public static final Method f14202f;

    /* renamed from: g */
    public static final Method f14203g;

    /* renamed from: h */
    public static final Method f14204h;

    /* renamed from: i */
    public static final Method f14205i;

    /* renamed from: j */
    public static Boolean f14206j;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|3)|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0053, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0041, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            p207o6.C3948q.f14197a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1a
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1a
            r6[r3] = r7     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            p207o6.C3948q.f14198b = r5
            boolean r5 = p207o6.C3944m.m14954c()
            r6 = 2
            if (r5 == 0) goto L33
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L33
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L33
            r7[r3] = r8     // Catch: java.lang.Exception -> L33
            r7[r2] = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r1 = r5.getMethod(r1, r7)     // Catch: java.lang.Exception -> L33
            goto L34
        L33:
            r1 = r4
        L34:
            p207o6.C3948q.f14199c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
            r1 = r4
        L42:
            p207o6.C3948q.f14200d = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L53
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L53
            r7[r3] = r8     // Catch: java.lang.Exception -> L53
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L53
            goto L54
        L53:
            r1 = r4
        L54:
            p207o6.C3948q.f14201e = r1
            boolean r1 = p207o6.C3944m.m14954c()
            if (r1 == 0) goto L6b
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L6b
            r7[r3] = r8     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch: java.lang.Exception -> L6b
            goto L6c
        L6b:
            r1 = r4
        L6c:
            p207o6.C3948q.f14202f = r1
            boolean r1 = p207o6.C3944m.m14960i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r1 == 0) goto L87
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L81
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L81
            goto L88
        L81:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r7, r1)
        L87:
            r1 = r4
        L88:
            p207o6.C3948q.f14203g = r1
            boolean r1 = p207o6.C3944m.m14960i()
            if (r1 == 0) goto Lab
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> La5
            java.lang.String r7 = "addNode"
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> La5
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> La5
            r6[r3] = r8     // Catch: java.lang.Exception -> La5
            r6[r2] = r0     // Catch: java.lang.Exception -> La5
            java.lang.reflect.Method r0 = r1.getMethod(r7, r6)     // Catch: java.lang.Exception -> La5
            goto Lac
        La5:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r5, r1, r0)
        Lab:
            r0 = r4
        Lac:
            p207o6.C3948q.f14204h = r0
            boolean r0 = p207o6.C3944m.m14960i()
            if (r0 == 0) goto Lc2
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lc2
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> Lc2
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lc3
            goto Lc3
        Lc2:
            r0 = r4
        Lc3:
            p207o6.C3948q.f14205i = r0
            p207o6.C3948q.f14206j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p207o6.C3948q.<clinit>():void");
    }

    /* renamed from: a */
    public static void m14969a(WorkSource workSource, int i10, String str) {
        Method method = f14199c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f14198b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m14970b(Context context, String str) {
        String str2;
        ApplicationInfo m16178c;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            m16178c = C4195c.m16183a(context).m16178c(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (m16178c == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i10 = m16178c.uid;
        WorkSource workSource = new WorkSource();
        m14969a(workSource, i10, str);
        return workSource;
    }

    /* renamed from: c */
    public static synchronized boolean m14971c(Context context) {
        synchronized (C3948q.class) {
            Boolean bool = f14206j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(C5782a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
            f14206j = valueOf;
            return valueOf.booleanValue();
        }
    }

    /* renamed from: d */
    public static boolean m14972d(WorkSource workSource) {
        Method method = f14205i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C2394s.m9619l(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return m14973e(workSource) == 0;
    }

    /* renamed from: e */
    public static int m14973e(WorkSource workSource) {
        Method method = f14200d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C2394s.m9619l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
