package p092g2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p029c2.AbstractC0592j;
import p029c2.C0601s;
import p029c2.EnumC0596n;
import p044d2.C1527i;
import p044d2.InterfaceC1523e;
import p165l2.C3411g;
import p165l2.C3420p;
import p165l2.InterfaceC3421q;
import p178m2.C3502c;

/* renamed from: g2.b */
/* loaded from: classes.dex */
public class C1962b implements InterfaceC1523e {

    /* renamed from: l */
    public static final String f7807l = AbstractC0592j.m2972f("SystemJobScheduler");

    /* renamed from: h */
    public final Context f7808h;

    /* renamed from: i */
    public final JobScheduler f7809i;

    /* renamed from: j */
    public final C1527i f7810j;

    /* renamed from: k */
    public final C1961a f7811k;

    public C1962b(Context context, C1527i c1527i) {
        this(context, c1527i, (JobScheduler) context.getSystemService("jobscheduler"), new C1961a(context));
    }

    public C1962b(Context context, C1527i c1527i, JobScheduler jobScheduler, C1961a c1961a) {
        this.f7808h = context;
        this.f7810j = c1527i;
        this.f7809i = jobScheduler;
        this.f7811k = c1961a;
    }

    /* renamed from: b */
    public static void m7925b(Context context) {
        List<JobInfo> m7928g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (m7928g = m7928g(context, jobScheduler)) == null || m7928g.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = m7928g.iterator();
        while (it.hasNext()) {
            m7926c(jobScheduler, it.next().getId());
        }
    }

    /* renamed from: c */
    public static void m7926c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            AbstractC0592j.m2970c().mo2974b(f7807l, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    /* renamed from: e */
    public static List<Integer> m7927e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m7928g = m7928g(context, jobScheduler);
        if (m7928g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m7928g) {
            if (str.equals(m7929h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<JobInfo> m7928g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC0592j.m2970c().mo2974b(f7807l, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m7929h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m7930i(Context context, C1527i c1527i) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m7928g = m7928g(context, jobScheduler);
        List<String> mo12720a = c1527i.m6199o().mo2135y().mo12720a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(m7928g != null ? m7928g.size() : 0);
        if (m7928g != null && !m7928g.isEmpty()) {
            for (JobInfo jobInfo : m7928g) {
                String m7929h = m7929h(jobInfo);
                if (TextUtils.isEmpty(m7929h)) {
                    m7926c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(m7929h);
                }
            }
        }
        Iterator<String> it = mo12720a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                AbstractC0592j.m2970c().mo2973a(f7807l, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase m6199o = c1527i.m6199o();
            m6199o.m14550c();
            try {
                InterfaceC3421q mo2131B = m6199o.mo2131B();
                Iterator<String> it2 = mo12720a.iterator();
                while (it2.hasNext()) {
                    mo2131B.mo12739b(it2.next(), -1L);
                }
                m6199o.m14562r();
            } finally {
                m6199o.m14552g();
            }
        }
        return z10;
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: a */
    public boolean mo6166a() {
        return true;
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: d */
    public void mo6167d(String str) {
        List<Integer> m7927e = m7927e(this.f7808h, this.f7809i, str);
        if (m7927e == null || m7927e.isEmpty()) {
            return;
        }
        Iterator<Integer> it = m7927e.iterator();
        while (it.hasNext()) {
            m7926c(this.f7809i, it.next().intValue());
        }
        this.f7810j.m6199o().mo2135y().mo12723d(str);
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: f */
    public void mo6168f(C3420p... c3420pArr) {
        List<Integer> m7927e;
        WorkDatabase m6199o = this.f7810j.m6199o();
        C3502c c3502c = new C3502c(m6199o);
        for (C3420p c3420p : c3420pArr) {
            m6199o.m14550c();
            try {
                C3420p mo12751n = m6199o.mo2131B().mo12751n(c3420p.f12010a);
                if (mo12751n == null) {
                    AbstractC0592j.m2970c().mo2977h(f7807l, "Skipping scheduling " + c3420p.f12010a + " because it's no longer in the DB", new Throwable[0]);
                } else if (mo12751n.f12011b != C0601s.a.ENQUEUED) {
                    AbstractC0592j.m2970c().mo2977h(f7807l, "Skipping scheduling " + c3420p.f12010a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    C3411g mo12722c = m6199o.mo2135y().mo12722c(c3420p.f12010a);
                    int m13045d = mo12722c != null ? mo12722c.f11988b : c3502c.m13045d(this.f7810j.m6195i().m2096i(), this.f7810j.m6195i().m2094g());
                    if (mo12722c == null) {
                        this.f7810j.m6199o().mo2135y().mo12721b(new C3411g(c3420p.f12010a, m13045d));
                    }
                    m7931j(c3420p, m13045d);
                    if (Build.VERSION.SDK_INT == 23 && (m7927e = m7927e(this.f7808h, this.f7809i, c3420p.f12010a)) != null) {
                        int indexOf = m7927e.indexOf(Integer.valueOf(m13045d));
                        if (indexOf >= 0) {
                            m7927e.remove(indexOf);
                        }
                        m7931j(c3420p, !m7927e.isEmpty() ? m7927e.get(0).intValue() : c3502c.m13045d(this.f7810j.m6195i().m2096i(), this.f7810j.m6195i().m2094g()));
                    }
                }
                m6199o.m14562r();
                m6199o.m14552g();
            } catch (Throwable th) {
                m6199o.m14552g();
                throw th;
            }
        }
    }

    /* renamed from: j */
    public void m7931j(C3420p c3420p, int i10) {
        JobInfo m7924a = this.f7811k.m7924a(c3420p, i10);
        AbstractC0592j m2970c = AbstractC0592j.m2970c();
        String str = f7807l;
        m2970c.mo2973a(str, String.format("Scheduling work ID %s Job ID %s", c3420p.f12010a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f7809i.schedule(m7924a) == 0) {
                AbstractC0592j.m2970c().mo2977h(str, String.format("Unable to schedule work ID %s", c3420p.f12010a), new Throwable[0]);
                if (c3420p.f12026q && c3420p.f12027r == EnumC0596n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c3420p.f12026q = false;
                    AbstractC0592j.m2970c().mo2973a(str, String.format("Scheduling a non-expedited job (work ID %s)", c3420p.f12010a), new Throwable[0]);
                    m7931j(c3420p, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> m7928g = m7928g(this.f7808h, this.f7809i);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(m7928g != null ? m7928g.size() : 0), Integer.valueOf(this.f7810j.m6199o().mo2131B().mo12743f().size()), Integer.valueOf(this.f7810j.m6195i().m2095h()));
            AbstractC0592j.m2970c().mo2974b(f7807l, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            AbstractC0592j.m2970c().mo2974b(f7807l, String.format("Unable to schedule %s", c3420p), th);
        }
    }
}
