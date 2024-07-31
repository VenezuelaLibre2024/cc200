package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0426d;
import java.util.HashMap;
import java.util.Map;
import p029c2.AbstractC0592j;
import p044d2.InterfaceC1520b;
import p075f2.C1802a;
import p165l2.C3420p;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public class C0423a implements InterfaceC1520b {

    /* renamed from: k */
    public static final String f2035k = AbstractC0592j.m2972f("CommandHandler");

    /* renamed from: h */
    public final Context f2036h;

    /* renamed from: i */
    public final Map<String, InterfaceC1520b> f2037i = new HashMap();

    /* renamed from: j */
    public final Object f2038j = new Object();

    public C0423a(Context context) {
        this.f2036h = context;
    }

    /* renamed from: a */
    public static Intent m2164a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m2165b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m2166d(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    /* renamed from: e */
    public static Intent m2167e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    public static Intent m2168f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    public static Intent m2169g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: n */
    public static boolean m2170n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        synchronized (this.f2038j) {
            InterfaceC1520b remove = this.f2037i.remove(str);
            if (remove != null) {
                remove.mo2171c(str, z10);
            }
        }
    }

    /* renamed from: h */
    public final void m2172h(Intent intent, int i10, C0426d c0426d) {
        AbstractC0592j.m2970c().mo2973a(f2035k, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new C0424b(this.f2036h, i10, c0426d).m2180a();
    }

    /* renamed from: i */
    public final void m2173i(Intent intent, int i10, C0426d c0426d) {
        Bundle extras = intent.getExtras();
        synchronized (this.f2038j) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            AbstractC0592j m2970c = AbstractC0592j.m2970c();
            String str = f2035k;
            m2970c.mo2973a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f2037i.containsKey(string)) {
                AbstractC0592j.m2970c().mo2973a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                C0425c c0425c = new C0425c(this.f2036h, i10, string, c0426d);
                this.f2037i.put(string, c0425c);
                c0425c.m2185f();
            }
        }
    }

    /* renamed from: j */
    public final void m2174j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC0592j.m2970c().mo2973a(f2035k, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        mo2171c(string, z10);
    }

    /* renamed from: k */
    public final void m2175k(Intent intent, int i10, C0426d c0426d) {
        AbstractC0592j.m2970c().mo2973a(f2035k, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        c0426d.m2192g().m6203s();
    }

    /* renamed from: l */
    public final void m2176l(Intent intent, int i10, C0426d c0426d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC0592j m2970c = AbstractC0592j.m2970c();
        String str = f2035k;
        m2970c.mo2973a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase m6199o = c0426d.m2192g().m6199o();
        m6199o.m14550c();
        try {
            C3420p mo12751n = m6199o.mo2131B().mo12751n(string);
            if (mo12751n == null) {
                AbstractC0592j.m2970c().mo2977h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (mo12751n.f12011b.m2986b()) {
                AbstractC0592j.m2970c().mo2977h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long m12731a = mo12751n.m12731a();
            if (mo12751n.m12732b()) {
                AbstractC0592j.m2970c().mo2973a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(m12731a)), new Throwable[0]);
                C1802a.m7294c(this.f2036h, c0426d.m2192g(), string, m12731a);
                c0426d.m2196k(new C0426d.b(c0426d, m2164a(this.f2036h), i10));
            } else {
                AbstractC0592j.m2970c().mo2973a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(m12731a)), new Throwable[0]);
                C1802a.m7294c(this.f2036h, c0426d.m2192g(), string, m12731a);
            }
            m6199o.m14562r();
        } finally {
            m6199o.m14552g();
        }
    }

    /* renamed from: m */
    public final void m2177m(Intent intent, C0426d c0426d) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC0592j.m2970c().mo2973a(f2035k, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        c0426d.m2192g().m6208x(string);
        C1802a.m7292a(this.f2036h, c0426d.m2192g(), string);
        c0426d.mo2171c(string, false);
    }

    /* renamed from: o */
    public boolean m2178o() {
        boolean z10;
        synchronized (this.f2038j) {
            z10 = !this.f2037i.isEmpty();
        }
        return z10;
    }

    /* renamed from: p */
    public void m2179p(Intent intent, int i10, C0426d c0426d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m2172h(intent, i10, c0426d);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m2175k(intent, i10, c0426d);
            return;
        }
        if (!m2170n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC0592j.m2970c().mo2974b(f2035k, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m2176l(intent, i10, c0426d);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m2173i(intent, i10, c0426d);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m2177m(intent, c0426d);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m2174j(intent, i10);
        } else {
            AbstractC0592j.m2970c().mo2977h(f2035k, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
