package p178m2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p165l2.C3408d;
import p262s1.InterfaceC4388b;

/* renamed from: m2.e */
/* loaded from: classes.dex */
public class C3504e {

    /* renamed from: a */
    public final WorkDatabase f12278a;

    public C3504e(WorkDatabase workDatabase) {
        this.f12278a = workDatabase;
    }

    /* renamed from: b */
    public static void m13048b(Context context, InterfaceC4388b interfaceC4388b) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC4388b.mo16972g();
            try {
                interfaceC4388b.mo16969O("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                interfaceC4388b.mo16969O("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                interfaceC4388b.mo16968N();
            } finally {
                interfaceC4388b.mo16971Z();
            }
        }
    }

    /* renamed from: a */
    public boolean m13049a() {
        Long mo12718b = this.f12278a.mo2134x().mo12718b("reschedule_needed");
        return mo12718b != null && mo12718b.longValue() == 1;
    }

    /* renamed from: c */
    public void m13050c(boolean z10) {
        this.f12278a.mo2134x().mo12717a(new C3408d("reschedule_needed", z10));
    }
}
