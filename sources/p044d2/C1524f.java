package p044d2;

import android.content.Context;
import android.os.Build;
import androidx.work.C0416a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import p029c2.AbstractC0592j;
import p075f2.C1803b;
import p092g2.C1962b;
import p165l2.C3420p;
import p165l2.InterfaceC3421q;
import p178m2.C3503d;

/* renamed from: d2.f */
/* loaded from: classes.dex */
public class C1524f {

    /* renamed from: a */
    public static final String f5561a = AbstractC0592j.m2972f("Schedulers");

    /* renamed from: a */
    public static InterfaceC1523e m6169a(Context context, C1527i c1527i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1962b c1962b = new C1962b(context, c1527i);
            C3503d.m13047a(context, SystemJobService.class, true);
            AbstractC0592j.m2970c().mo2973a(f5561a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return c1962b;
        }
        InterfaceC1523e m6171c = m6171c(context);
        if (m6171c != null) {
            return m6171c;
        }
        C1803b c1803b = new C1803b(context);
        C3503d.m13047a(context, SystemAlarmService.class, true);
        AbstractC0592j.m2970c().mo2973a(f5561a, "Created SystemAlarmScheduler", new Throwable[0]);
        return c1803b;
    }

    /* renamed from: b */
    public static void m6170b(C0416a c0416a, WorkDatabase workDatabase, List<InterfaceC1523e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC3421q mo2131B = workDatabase.mo2131B();
        workDatabase.m14550c();
        try {
            List<C3420p> mo12742e = mo2131B.mo12742e(c0416a.m2095h());
            List<C3420p> mo12757t = mo2131B.mo12757t(200);
            if (mo12742e != null && mo12742e.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<C3420p> it = mo12742e.iterator();
                while (it.hasNext()) {
                    mo2131B.mo12739b(it.next().f12010a, currentTimeMillis);
                }
            }
            workDatabase.m14562r();
            if (mo12742e != null && mo12742e.size() > 0) {
                C3420p[] c3420pArr = (C3420p[]) mo12742e.toArray(new C3420p[mo12742e.size()]);
                for (InterfaceC1523e interfaceC1523e : list) {
                    if (interfaceC1523e.mo6166a()) {
                        interfaceC1523e.mo6168f(c3420pArr);
                    }
                }
            }
            if (mo12757t == null || mo12757t.size() <= 0) {
                return;
            }
            C3420p[] c3420pArr2 = (C3420p[]) mo12757t.toArray(new C3420p[mo12757t.size()]);
            for (InterfaceC1523e interfaceC1523e2 : list) {
                if (!interfaceC1523e2.mo6166a()) {
                    interfaceC1523e2.mo6168f(c3420pArr2);
                }
            }
        } finally {
            workDatabase.m14552g();
        }
    }

    /* renamed from: c */
    public static InterfaceC1523e m6171c(Context context) {
        try {
            InterfaceC1523e interfaceC1523e = (InterfaceC1523e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC0592j.m2970c().mo2973a(f5561a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return interfaceC1523e;
        } catch (Throwable th) {
            AbstractC0592j.m2970c().mo2973a(f5561a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
