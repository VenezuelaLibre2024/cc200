package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0416a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p029c2.AbstractC0592j;
import p029c2.C0601s;
import p029c2.InterfaceC0589g;
import p044d2.C1524f;
import p044d2.C1526h;
import p044d2.C1527i;
import p090g0.C1941a;
import p092g2.C1962b;
import p165l2.C3420p;
import p165l2.InterfaceC3418n;
import p165l2.InterfaceC3421q;
import p178m2.C3505f;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: k */
    public static final String f2103k = AbstractC0592j.m2972f("ForceStopRunnable");

    /* renamed from: l */
    public static final long f2104l = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: h */
    public final Context f2105h;

    /* renamed from: i */
    public final C1527i f2106i;

    /* renamed from: j */
    public int f2107j = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f2108a = AbstractC0592j.m2972f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC0592j.m2970c().mo2976g(f2108a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m2216g(context);
        }
    }

    public ForceStopRunnable(Context context, C1527i c1527i) {
        this.f2105h = context.getApplicationContext();
        this.f2106i = c1527i;
    }

    /* renamed from: c */
    public static Intent m2214c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m2215d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, m2214c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static void m2216g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent m2215d = m2215d(context, C1941a.m7847c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f2104l;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, m2215d);
            } else {
                alarmManager.set(0, currentTimeMillis, m2215d);
            }
        }
    }

    /* renamed from: a */
    public boolean m2217a() {
        boolean m7930i = Build.VERSION.SDK_INT >= 23 ? C1962b.m7930i(this.f2105h, this.f2106i) : false;
        WorkDatabase m6199o = this.f2106i.m6199o();
        InterfaceC3421q mo2131B = m6199o.mo2131B();
        InterfaceC3418n mo2130A = m6199o.mo2130A();
        m6199o.m14550c();
        try {
            List<C3420p> mo12747j = mo2131B.mo12747j();
            boolean z10 = (mo12747j == null || mo12747j.isEmpty()) ? false : true;
            if (z10) {
                for (C3420p c3420p : mo12747j) {
                    mo2131B.mo12746i(C0601s.a.ENQUEUED, c3420p.f12010a);
                    mo2131B.mo12739b(c3420p.f12010a, -1L);
                }
            }
            mo2130A.mo12729b();
            m6199o.m14562r();
            return z10 || m7930i;
        } finally {
            m6199o.m14552g();
        }
    }

    /* renamed from: b */
    public void m2218b() {
        boolean m2217a = m2217a();
        if (m2221h()) {
            AbstractC0592j.m2970c().mo2973a(f2103k, "Rescheduling Workers.", new Throwable[0]);
            this.f2106i.m6203s();
            this.f2106i.m6196l().m13050c(false);
        } else if (m2219e()) {
            AbstractC0592j.m2970c().mo2973a(f2103k, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f2106i.m6203s();
        } else if (m2217a) {
            AbstractC0592j.m2970c().mo2973a(f2103k, "Found unfinished work, scheduling it.", new Throwable[0]);
            C1524f.m6170b(this.f2106i.m6195i(), this.f2106i.m6199o(), this.f2106i.m6198n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean m2219e() {
        try {
            PendingIntent m2215d = m2215d(this.f2105h, C1941a.m7847c() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (m2215d != null) {
                    m2215d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f2105h.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        if (historicalProcessExitReasons.get(i10).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (m2215d == null) {
                m2216g(this.f2105h);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC0592j.m2970c().mo2977h(f2103k, "Ignoring exception", e10);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m2220f() {
        C0416a m6195i = this.f2106i.m6195i();
        if (TextUtils.isEmpty(m6195i.m2090c())) {
            AbstractC0592j.m2970c().mo2973a(f2103k, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean m13052b = C3505f.m13052b(this.f2105h, m6195i);
        AbstractC0592j.m2970c().mo2973a(f2103k, String.format("Is default app process = %s", Boolean.valueOf(m13052b)), new Throwable[0]);
        return m13052b;
    }

    /* renamed from: h */
    public boolean m2221h() {
        return this.f2106i.m6196l().m13049a();
    }

    /* renamed from: i */
    public void m2222i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (m2220f()) {
                while (true) {
                    C1526h.m6188e(this.f2105h);
                    AbstractC0592j.m2970c().mo2973a(f2103k, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        m2218b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                        i10 = this.f2107j + 1;
                        this.f2107j = i10;
                        if (i10 >= 3) {
                            AbstractC0592j m2970c = AbstractC0592j.m2970c();
                            String str = f2103k;
                            m2970c.mo2974b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            InterfaceC0589g m2091d = this.f2106i.m6195i().m2091d();
                            if (m2091d == null) {
                                throw illegalStateException;
                            }
                            AbstractC0592j.m2970c().mo2973a(str, "Routing exception to the specified exception handler", illegalStateException);
                            m2091d.m2965a(illegalStateException);
                        } else {
                            AbstractC0592j.m2970c().mo2973a(f2103k, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                            m2222i(this.f2107j * 300);
                        }
                    }
                    AbstractC0592j.m2970c().mo2973a(f2103k, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                    m2222i(this.f2107j * 300);
                }
            }
        } finally {
            this.f2106i.m6202r();
        }
    }
}
