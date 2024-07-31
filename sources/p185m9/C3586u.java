package p185m9;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115hd.C2502n;
import p115hd.C2503o;
import p115hd.C2510v;
import p207o6.C3945n;
import td.C4753m;

/* renamed from: m9.u */
/* loaded from: classes.dex */
public final class C3586u {

    /* renamed from: a */
    public static final C3586u f12605a = new C3586u();

    /* renamed from: b */
    public static /* synthetic */ C3585t m13286b(C3586u c3586u, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return c3586u.m13287a(str, i10, i11, z10);
    }

    /* renamed from: a */
    public final C3585t m13287a(String str, int i10, int i11, boolean z10) {
        return new C3585t(str, i10, i11, z10);
    }

    /* renamed from: c */
    public final List<C3585t> m13288c(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            C4753m.m18652e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C3585t(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C4753m.m18648a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final C3585t m13289d(Context context) {
        Object obj;
        C4753m.m18653f(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = m13288c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C3585t) obj).m13283b() == myPid) {
                break;
            }
        }
        C3585t c3585t = (C3585t) obj;
        return c3585t == null ? m13286b(this, m13290e(), myPid, 0, false, 12, null) : c3585t;
    }

    /* renamed from: e */
    public final String m13290e() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            C4753m.m18652e(myProcessName, "myProcessName()");
            return myProcessName;
        }
        if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String m14964a = C3945n.m14964a();
        return m14964a != null ? m14964a : "";
    }
}
