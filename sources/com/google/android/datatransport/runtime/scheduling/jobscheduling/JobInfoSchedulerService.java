package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p093g3.AbstractC1978p;
import p093g3.C1983u;
import p249r3.C4292a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4701b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C1983u.m8008f(getApplicationContext());
        AbstractC1978p.a mo7970d = AbstractC1978p.m7999a().mo7968b(string).mo7970d(C4292a.m16517b(i10));
        if (string2 != null) {
            mo7970d.mo7969c(Base64.decode(string2, 0));
        }
        C1983u.m8006c().m8010e().m14030v(mo7970d.mo7967a(), i11, new Runnable() { // from class: n3.f
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m4701b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
