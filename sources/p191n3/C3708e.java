package p191n3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p093g3.AbstractC1978p;
import p151k3.C3347a;
import p204o3.InterfaceC3848d;
import p249r3.C4292a;

/* renamed from: n3.e */
/* loaded from: classes.dex */
public class C3708e implements InterfaceC3728y {

    /* renamed from: a */
    public final Context f13215a;

    /* renamed from: b */
    public final InterfaceC3848d f13216b;

    /* renamed from: c */
    public final AbstractC3710g f13217c;

    public C3708e(Context context, InterfaceC3848d interfaceC3848d, AbstractC3710g abstractC3710g) {
        this.f13215a = context;
        this.f13216b = interfaceC3848d;
        this.f13217c = abstractC3710g;
    }

    @Override // p191n3.InterfaceC3728y
    /* renamed from: a */
    public void mo13983a(AbstractC1978p abstractC1978p, int i10) {
        mo13984b(abstractC1978p, i10, false);
    }

    @Override // p191n3.InterfaceC3728y
    /* renamed from: b */
    public void mo13984b(AbstractC1978p abstractC1978p, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f13215a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f13215a.getSystemService("jobscheduler");
        int m13995c = m13995c(abstractC1978p);
        if (!z10 && m13996d(jobScheduler, m13995c, i10)) {
            C3347a.m12404b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC1978p);
            return;
        }
        long mo14637a0 = this.f13216b.mo14637a0(abstractC1978p);
        JobInfo.Builder m14002c = this.f13217c.m14002c(new JobInfo.Builder(m13995c, componentName), abstractC1978p.mo7966d(), mo14637a0, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC1978p.mo7964b());
        persistableBundle.putInt("priority", C4292a.m16516a(abstractC1978p.mo7966d()));
        if (abstractC1978p.mo7965c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC1978p.mo7965c(), 0));
        }
        m14002c.setExtras(persistableBundle);
        C3347a.m12405c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC1978p, Integer.valueOf(m13995c), Long.valueOf(this.f13217c.m14003g(abstractC1978p.mo7966d(), mo14637a0, i10)), Long.valueOf(mo14637a0), Integer.valueOf(i10));
        jobScheduler.schedule(m14002c.build());
    }

    /* renamed from: c */
    public int m13995c(AbstractC1978p abstractC1978p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f13215a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC1978p.mo7964b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C4292a.m16516a(abstractC1978p.mo7966d())).array());
        if (abstractC1978p.mo7965c() != null) {
            adler32.update(abstractC1978p.mo7965c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean m13996d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }
}
