package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p029c2.AbstractC0592j;
import p044d2.C1527i;
import p044d2.InterfaceC1520b;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1520b {

    /* renamed from: j */
    public static final String f2070j = AbstractC0592j.m2972f("SystemJobService");

    /* renamed from: h */
    public C1527i f2071h;

    /* renamed from: i */
    public final Map<String, JobParameters> f2072i = new HashMap();

    /* renamed from: a */
    public static String m2199a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        JobParameters remove;
        AbstractC0592j.m2970c().mo2973a(f2070j, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2072i) {
            remove = this.f2072i.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C1527i m6192k = C1527i.m6192k(getApplicationContext());
            this.f2071h = m6192k;
            m6192k.m6197m().m6155d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC0592j.m2970c().mo2977h(f2070j, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C1527i c1527i = this.f2071h;
        if (c1527i != null) {
            c1527i.m6197m().m6159i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f2071h == null) {
            AbstractC0592j.m2970c().mo2973a(f2070j, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String m2199a = m2199a(jobParameters);
        if (TextUtils.isEmpty(m2199a)) {
            AbstractC0592j.m2970c().mo2974b(f2070j, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f2072i) {
            if (this.f2072i.containsKey(m2199a)) {
                AbstractC0592j.m2970c().mo2973a(f2070j, String.format("Job is already being executed by SystemJobService: %s", m2199a), new Throwable[0]);
                return false;
            }
            AbstractC0592j.m2970c().mo2973a(f2070j, String.format("onStartJob for %s", m2199a), new Throwable[0]);
            this.f2072i.put(m2199a, jobParameters);
            WorkerParameters.C0415a c0415a = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                c0415a = new WorkerParameters.C0415a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0415a.f1974b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0415a.f1973a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    c0415a.f1975c = jobParameters.getNetwork();
                }
            }
            this.f2071h.m6206v(m2199a, c0415a);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f2071h == null) {
            AbstractC0592j.m2970c().mo2973a(f2070j, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String m2199a = m2199a(jobParameters);
        if (TextUtils.isEmpty(m2199a)) {
            AbstractC0592j.m2970c().mo2974b(f2070j, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC0592j.m2970c().mo2973a(f2070j, String.format("onStopJob for %s", m2199a), new Throwable[0]);
        synchronized (this.f2072i) {
            this.f2072i.remove(m2199a);
        }
        this.f2071h.m6208x(m2199a);
        return !this.f2071h.m6197m().m6156f(m2199a);
    }
}
