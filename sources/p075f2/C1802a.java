package p075f2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0423a;
import p029c2.AbstractC0592j;
import p044d2.C1527i;
import p165l2.C3411g;
import p165l2.InterfaceC3412h;
import p178m2.C3502c;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public class C1802a {

    /* renamed from: a */
    public static final String f6623a = AbstractC0592j.m2972f("Alarms");

    /* renamed from: a */
    public static void m7292a(Context context, C1527i c1527i, String str) {
        InterfaceC3412h mo2135y = c1527i.m6199o().mo2135y();
        C3411g mo12722c = mo2135y.mo12722c(str);
        if (mo12722c != null) {
            m7293b(context, str, mo12722c.f11988b);
            AbstractC0592j.m2970c().mo2973a(f6623a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            mo2135y.mo12723d(str);
        }
    }

    /* renamed from: b */
    public static void m7293b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, C0423a.m2165b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f6623a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m7294c(Context context, C1527i c1527i, String str, long j10) {
        int m13043b;
        WorkDatabase m6199o = c1527i.m6199o();
        InterfaceC3412h mo2135y = m6199o.mo2135y();
        C3411g mo12722c = mo2135y.mo12722c(str);
        if (mo12722c != null) {
            m7293b(context, str, mo12722c.f11988b);
            m13043b = mo12722c.f11988b;
        } else {
            m13043b = new C3502c(m6199o).m13043b();
            mo2135y.mo12721b(new C3411g(str, m13043b));
        }
        m7295d(context, str, m13043b, j10);
    }

    /* renamed from: d */
    public static void m7295d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, C0423a.m2165b(context, str), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i11 >= 19) {
                alarmManager.setExact(0, j10, service);
            } else {
                alarmManager.set(0, j10, service);
            }
        }
    }
}
