package p023b8;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p098g8.AbstractC2135f0;
import p115hd.C2502n;
import p115hd.C2503o;
import p115hd.C2510v;
import td.C4753m;

/* renamed from: b8.i */
/* loaded from: classes.dex */
public final class C0517i {

    /* renamed from: a */
    public static final C0517i f2318a = new C0517i();

    /* renamed from: c */
    public static /* synthetic */ AbstractC2135f0.e.d.a.c m2494c(C0517i c0517i, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return c0517i.m2496b(str, i10, i11, z10);
    }

    /* renamed from: a */
    public final AbstractC2135f0.e.d.a.c m2495a(String str, int i10, int i11) {
        C4753m.m18653f(str, "processName");
        return m2494c(this, str, i10, i11, false, 8, null);
    }

    /* renamed from: b */
    public final AbstractC2135f0.e.d.a.c m2496b(String str, int i10, int i11, boolean z10) {
        C4753m.m18653f(str, "processName");
        AbstractC2135f0.e.d.a.c mo8630a = AbstractC2135f0.e.d.a.c.m8625a().mo8634e(str).mo8633d(i10).mo8632c(i11).mo8631b(z10).mo8630a();
        C4753m.m18652e(mo8630a, "builder()\n      .setProc…ltProcess)\n      .build()");
        return mo8630a;
    }

    /* renamed from: d */
    public final List<AbstractC2135f0.e.d.a.c> m2497d(Context context) {
        C4753m.m18653f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C2502n.m9989e();
        }
        List m10016o = C2510v.m10016o(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : m10016o) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C2503o.m9995k(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(AbstractC2135f0.e.d.a.c.m8625a().mo8634e(runningAppProcessInfo.processName).mo8633d(runningAppProcessInfo.pid).mo8632c(runningAppProcessInfo.importance).mo8631b(C4753m.m18648a(runningAppProcessInfo.processName, str)).mo8630a());
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final AbstractC2135f0.e.d.a.c m2498e(Context context) {
        Object obj;
        C4753m.m18653f(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = m2497d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC2135f0.e.d.a.c) obj).mo8627c() == myPid) {
                break;
            }
        }
        AbstractC2135f0.e.d.a.c cVar = (AbstractC2135f0.e.d.a.c) obj;
        return cVar == null ? m2494c(this, m2499f(), myPid, 0, false, 12, null) : cVar;
    }

    /* renamed from: f */
    public final String m2499f() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return (i10 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String myProcessName = Process.myProcessName();
        C4753m.m18652e(myProcessName, "{\n      Process.myProcessName()\n    }");
        return myProcessName;
    }
}
