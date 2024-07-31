package p092g2;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p029c2.AbstractC0592j;
import p029c2.C0584b;
import p029c2.C0585c;
import p029c2.EnumC0583a;
import p029c2.EnumC0593k;
import p090g0.C1941a;
import p165l2.C3420p;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public class C1961a {

    /* renamed from: b */
    public static final String f7804b = AbstractC0592j.m2972f("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f7805a;

    /* renamed from: g2.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7806a;

        static {
            int[] iArr = new int[EnumC0593k.values().length];
            f7806a = iArr;
            try {
                iArr[EnumC0593k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7806a[EnumC0593k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7806a[EnumC0593k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7806a[EnumC0593k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7806a[EnumC0593k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C1961a(Context context) {
        this.f7805a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* renamed from: b */
    public static JobInfo.TriggerContentUri m7921b(C0585c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.m2959a(), aVar.m2960b() ? 1 : 0);
    }

    /* renamed from: c */
    public static int m7922c(EnumC0593k enumC0593k) {
        int i10 = a.f7806a[enumC0593k.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC0592j.m2970c().mo2973a(f7804b, String.format("API version too low. Cannot convert network type value %s", enumC0593k), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    public static void m7923d(JobInfo.Builder builder, EnumC0593k enumC0593k) {
        if (Build.VERSION.SDK_INT < 30 || enumC0593k != EnumC0593k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m7922c(enumC0593k));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    public JobInfo m7924a(C3420p c3420p, int i10) {
        C0584b c0584b = c3420p.f12019j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c3420p.f12010a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c3420p.m12734d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f7805a).setRequiresCharging(c0584b.m2942g()).setRequiresDeviceIdle(c0584b.m2943h()).setExtras(persistableBundle);
        m7923d(extras, c0584b.m2937b());
        if (!c0584b.m2943h()) {
            extras.setBackoffCriteria(c3420p.f12022m, c3420p.f12021l == EnumC0583a.LINEAR ? 0 : 1);
        }
        long max = Math.max(c3420p.m12731a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c3420p.f12026q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && c0584b.m2940e()) {
            Iterator<C0585c.a> it = c0584b.m2936a().m2957b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m7921b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c0584b.m2938c());
            extras.setTriggerContentMaxDelay(c0584b.m2939d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c0584b.m2941f());
            extras.setRequiresStorageNotLow(c0584b.m2944i());
        }
        boolean z10 = c3420p.f12020k > 0;
        boolean z11 = max > 0;
        if (C1941a.m7847c() && c3420p.f12026q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
