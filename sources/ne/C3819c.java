package ne;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import p215oe.C3985a;
import p215oe.C3986b;
import p215oe.C3987c;
import p215oe.C3988d;
import p215oe.C3989e;
import p215oe.C3990f;
import p215oe.C3991g;
import p215oe.C3992h;

/* renamed from: ne.c */
/* loaded from: classes2.dex */
public final class C3819c {

    /* renamed from: a */
    public static final List<Class<? extends InterfaceC3817a>> f13742a;

    /* renamed from: b */
    public static volatile Boolean f13743b;

    /* renamed from: c */
    public static final Object f13744c;

    /* renamed from: d */
    public static InterfaceC3817a f13745d;

    /* renamed from: e */
    public static ComponentName f13746e;

    static {
        LinkedList linkedList = new LinkedList();
        f13742a = linkedList;
        f13744c = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C3985a.class);
        linkedList.add(C3987c.class);
        linkedList.add(C3988d.class);
        linkedList.add(C3989e.class);
        linkedList.add(C3992h.class);
        linkedList.add(C3990f.class);
        linkedList.add(C3991g.class);
        linkedList.add(C3986b.class);
    }

    /* renamed from: a */
    public static boolean m14521a(Context context, int i10) {
        try {
            m14522b(context, i10);
            return true;
        } catch (C3818b e10) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e10);
            return false;
        }
    }

    /* renamed from: b */
    public static void m14522b(Context context, int i10) {
        if (f13745d == null && !m14523c(context)) {
            throw new C3818b("No default launcher available");
        }
        try {
            f13745d.mo13373b(context, f13746e, i10);
        } catch (Exception e10) {
            throw new C3818b("Unable to execute badge", e10);
        }
    }

    /* renamed from: c */
    public static boolean m14523c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f13746e = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends InterfaceC3817a>> it2 = f13742a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC3817a interfaceC3817a = null;
                try {
                    interfaceC3817a = it2.next().newInstance();
                } catch (Exception unused) {
                }
                if (interfaceC3817a != null && interfaceC3817a.mo13372a().contains(str)) {
                    f13745d = interfaceC3817a;
                    break;
                }
            }
            if (f13745d != null) {
                break;
            }
        }
        if (f13745d != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f13745d = str2.equalsIgnoreCase("ZUK") ? new C3992h() : str2.equalsIgnoreCase("OPPO") ? new C3988d() : str2.equalsIgnoreCase("VIVO") ? new C3990f() : str2.equalsIgnoreCase("ZTE") ? new C3991g() : new DefaultBadger();
        return true;
    }

    /* renamed from: d */
    public static boolean m14524d(Context context) {
        if (f13743b == null) {
            synchronized (f13744c) {
                if (f13743b == null) {
                    String str = null;
                    for (int i10 = 0; i10 < 3; i10++) {
                        try {
                            Log.i("ShortcutBadger", "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i10 + 1), 3));
                        } catch (Exception e10) {
                            str = e10.getMessage();
                        }
                        if (m14523c(context)) {
                            f13745d.mo13373b(context, f13746e, 0);
                            f13743b = Boolean.TRUE;
                            Log.i("ShortcutBadger", "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                    }
                    if (f13743b == null) {
                        Log.w("ShortcutBadger", "Badge counter seems not supported for this platform: " + str);
                        f13743b = Boolean.FALSE;
                    }
                }
            }
        }
        return f13743b.booleanValue();
    }

    /* renamed from: e */
    public static boolean m14525e(Context context) {
        return m14521a(context, 0);
    }
}
