package p329x;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* renamed from: x.e */
/* loaded from: classes.dex */
public final class C5487e {

    /* renamed from: x.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m21780a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* renamed from: x.e$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static AlarmManager.AlarmClockInfo m21781a(long j10, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j10, pendingIntent);
        }

        /* renamed from: b */
        public static void m21782b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* renamed from: x.e$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static void m21783a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        /* renamed from: b */
        public static void m21784b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static void m21776a(AlarmManager alarmManager, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.m21782b(alarmManager, b.m21781a(j10, pendingIntent), pendingIntent2);
        } else {
            m21778c(alarmManager, 0, j10, pendingIntent2);
        }
    }

    /* renamed from: b */
    public static void m21777b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            c.m21783a(alarmManager, i10, j10, pendingIntent);
        } else {
            alarmManager.set(i10, j10, pendingIntent);
        }
    }

    /* renamed from: c */
    public static void m21778c(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.m21780a(alarmManager, i10, j10, pendingIntent);
        } else {
            alarmManager.set(i10, j10, pendingIntent);
        }
    }

    /* renamed from: d */
    public static void m21779d(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            c.m21784b(alarmManager, i10, j10, pendingIntent);
        } else {
            m21778c(alarmManager, i10, j10, pendingIntent);
        }
    }
}
