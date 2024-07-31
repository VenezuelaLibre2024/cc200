package p178m2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p165l2.C3408d;
import p262s1.InterfaceC4388b;

/* renamed from: m2.c */
/* loaded from: classes.dex */
public class C3502c {

    /* renamed from: a */
    public final WorkDatabase f12276a;

    public C3502c(WorkDatabase workDatabase) {
        this.f12276a = workDatabase;
    }

    /* renamed from: a */
    public static void m13042a(Context context, InterfaceC4388b interfaceC4388b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC4388b.mo16972g();
            try {
                interfaceC4388b.mo16969O("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                interfaceC4388b.mo16969O("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                interfaceC4388b.mo16968N();
            } finally {
                interfaceC4388b.mo16971Z();
            }
        }
    }

    /* renamed from: b */
    public int m13043b() {
        int m13044c;
        synchronized (C3502c.class) {
            m13044c = m13044c("next_alarm_manager_id");
        }
        return m13044c;
    }

    /* renamed from: c */
    public final int m13044c(String str) {
        this.f12276a.m14550c();
        try {
            Long mo12718b = this.f12276a.mo2134x().mo12718b(str);
            int i10 = 0;
            int intValue = mo12718b != null ? mo12718b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            m13046e(str, i10);
            this.f12276a.m14562r();
            return intValue;
        } finally {
            this.f12276a.m14552g();
        }
    }

    /* renamed from: d */
    public int m13045d(int i10, int i11) {
        synchronized (C3502c.class) {
            int m13044c = m13044c("next_job_scheduler_id");
            if (m13044c >= i10 && m13044c <= i11) {
                i10 = m13044c;
            }
            m13046e("next_job_scheduler_id", i10 + 1);
        }
        return i10;
    }

    /* renamed from: e */
    public final void m13046e(String str, int i10) {
        this.f12276a.mo2134x().mo12717a(new C3408d(str, i10));
    }
}
