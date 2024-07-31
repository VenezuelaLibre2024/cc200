package p237q6;

import android.content.Context;
import p207o6.C3944m;

/* renamed from: q6.a */
/* loaded from: classes.dex */
public class C4193a {

    /* renamed from: a */
    public static Context f15143a;

    /* renamed from: b */
    public static Boolean f15144b;

    /* renamed from: a */
    public static synchronized boolean m16175a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (C4193a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f15143a;
            if (context2 != null && (bool2 = f15144b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f15144b = null;
            if (!C3944m.m14959h()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f15144b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f15143a = applicationContext;
                return f15144b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f15144b = bool;
            f15143a = applicationContext;
            return f15144b.booleanValue();
        }
    }
}
