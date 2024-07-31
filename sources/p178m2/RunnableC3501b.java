package p178m2;

import android.text.TextUtils;
import androidx.work.C0417b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;
import p029c2.AbstractC0592j;
import p029c2.C0584b;
import p029c2.InterfaceC0595m;
import p044d2.C1521c;
import p044d2.C1524f;
import p044d2.C1525g;
import p044d2.C1527i;
import p044d2.InterfaceC1523e;
import p165l2.C3420p;

/* renamed from: m2.b */
/* loaded from: classes.dex */
public class RunnableC3501b implements Runnable {

    /* renamed from: j */
    public static final String f12273j = AbstractC0592j.m2972f("EnqueueRunnable");

    /* renamed from: h */
    public final C1525g f12274h;

    /* renamed from: i */
    public final C1521c f12275i = new C1521c();

    public RunnableC3501b(C1525g c1525g) {
        this.f12274h = c1525g;
    }

    /* renamed from: b */
    public static boolean m13034b(C1525g c1525g) {
        boolean m13035c = m13035c(c1525g.m6180g(), c1525g.m6179f(), (String[]) C1525g.m6173l(c1525g).toArray(new String[0]), c1525g.m6177d(), c1525g.m6175b());
        c1525g.m6183k();
        return m13035c;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01db A[LOOP:5: B:87:0x01d5->B:89:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m13035c(p044d2.C1527i r19, java.util.List<? extends p029c2.AbstractC0603u> r20, java.lang.String[] r21, java.lang.String r22, p029c2.EnumC0586d r23) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p178m2.RunnableC3501b.m13035c(d2.i, java.util.List, java.lang.String[], java.lang.String, c2.d):boolean");
    }

    /* renamed from: e */
    public static boolean m13036e(C1525g c1525g) {
        List<C1525g> m6178e = c1525g.m6178e();
        boolean z10 = false;
        if (m6178e != null) {
            boolean z11 = false;
            for (C1525g c1525g2 : m6178e) {
                if (c1525g2.m6182j()) {
                    AbstractC0592j.m2970c().mo2977h(f12273j, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c1525g2.m6176c())), new Throwable[0]);
                } else {
                    z11 |= m13036e(c1525g2);
                }
            }
            z10 = z11;
        }
        return m13034b(c1525g) | z10;
    }

    /* renamed from: g */
    public static void m13037g(C3420p c3420p) {
        C0584b c0584b = c3420p.f12019j;
        String str = c3420p.f12012c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c0584b.m2941f() || c0584b.m2944i()) {
            C0417b.a aVar = new C0417b.a();
            aVar.m2120c(c3420p.f12014e).m2125h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            c3420p.f12012c = ConstraintTrackingWorker.class.getName();
            c3420p.f12014e = aVar.m2118a();
        }
    }

    /* renamed from: h */
    public static boolean m13038h(C1527i c1527i, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<InterfaceC1523e> it = c1527i.m6198n().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public boolean m13039a() {
        WorkDatabase m6199o = this.f12274h.m6180g().m6199o();
        m6199o.m14550c();
        try {
            boolean m13036e = m13036e(this.f12274h);
            m6199o.m14562r();
            return m13036e;
        } finally {
            m6199o.m14552g();
        }
    }

    /* renamed from: d */
    public InterfaceC0595m m13040d() {
        return this.f12275i;
    }

    /* renamed from: f */
    public void m13041f() {
        C1527i m6180g = this.f12274h.m6180g();
        C1524f.m6170b(m6180g.m6195i(), m6180g.m6199o(), m6180g.m6198n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f12274h.m6181h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f12274h));
            }
            if (m13039a()) {
                C3503d.m13047a(this.f12274h.m6180g().m6194h(), RescheduleReceiver.class, true);
                m13041f();
            }
            this.f12275i.m6151a(InterfaceC0595m.f2607a);
        } catch (Throwable th) {
            this.f12275i.m6151a(new InterfaceC0595m.b.a(th));
        }
    }
}
