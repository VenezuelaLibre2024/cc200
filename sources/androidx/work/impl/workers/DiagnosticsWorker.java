package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p029c2.AbstractC0592j;
import p044d2.C1527i;
import p165l2.C3411g;
import p165l2.C3420p;
import p165l2.InterfaceC3412h;
import p165l2.InterfaceC3415k;
import p165l2.InterfaceC3421q;
import p165l2.InterfaceC3424t;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: n */
    public static final String f2118n = AbstractC0592j.m2972f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: r */
    public static String m2228r(C3420p c3420p, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c3420p.f12010a, c3420p.f12012c, num, c3420p.f12011b.name(), str, str2);
    }

    /* renamed from: s */
    public static String m2229s(InterfaceC3415k interfaceC3415k, InterfaceC3424t interfaceC3424t, InterfaceC3412h interfaceC3412h, List<C3420p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (C3420p c3420p : list) {
            Integer num = null;
            C3411g mo12722c = interfaceC3412h.mo12722c(c3420p.f12010a);
            if (mo12722c != null) {
                num = Integer.valueOf(mo12722c.f11988b);
            }
            sb2.append(m2228r(c3420p, TextUtils.join(",", interfaceC3415k.mo12726b(c3420p.f12010a)), num, TextUtils.join(",", interfaceC3424t.mo12761b(c3420p.f12010a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    /* renamed from: q */
    public ListenableWorker.AbstractC0413a mo2082q() {
        WorkDatabase m6199o = C1527i.m6192k(m2061a()).m6199o();
        InterfaceC3421q mo2131B = m6199o.mo2131B();
        InterfaceC3415k mo2136z = m6199o.mo2136z();
        InterfaceC3424t mo2132C = m6199o.mo2132C();
        InterfaceC3412h mo2135y = m6199o.mo2135y();
        List<C3420p> mo12741d = mo2131B.mo12741d(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<C3420p> mo12747j = mo2131B.mo12747j();
        List<C3420p> mo12757t = mo2131B.mo12757t(200);
        if (mo12741d != null && !mo12741d.isEmpty()) {
            AbstractC0592j m2970c = AbstractC0592j.m2970c();
            String str = f2118n;
            m2970c.mo2975d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC0592j.m2970c().mo2975d(str, m2229s(mo2136z, mo2132C, mo2135y, mo12741d), new Throwable[0]);
        }
        if (mo12747j != null && !mo12747j.isEmpty()) {
            AbstractC0592j m2970c2 = AbstractC0592j.m2970c();
            String str2 = f2118n;
            m2970c2.mo2975d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC0592j.m2970c().mo2975d(str2, m2229s(mo2136z, mo2132C, mo2135y, mo12747j), new Throwable[0]);
        }
        if (mo12757t != null && !mo12757t.isEmpty()) {
            AbstractC0592j m2970c3 = AbstractC0592j.m2970c();
            String str3 = f2118n;
            m2970c3.mo2975d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC0592j.m2970c().mo2975d(str3, m2229s(mo2136z, mo2132C, mo2135y, mo12757t), new Throwable[0]);
        }
        return ListenableWorker.AbstractC0413a.m2077c();
    }
}
