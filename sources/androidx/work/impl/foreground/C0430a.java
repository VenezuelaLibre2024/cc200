package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p029c2.AbstractC0592j;
import p029c2.C0587e;
import p044d2.C1527i;
import p044d2.InterfaceC1520b;
import p104h2.C2285d;
import p104h2.InterfaceC2284c;
import p165l2.C3420p;
import p203o2.InterfaceC3840a;

/* renamed from: androidx.work.impl.foreground.a */
/* loaded from: classes.dex */
public class C0430a implements InterfaceC2284c, InterfaceC1520b {

    /* renamed from: r */
    public static final String f2089r = AbstractC0592j.m2972f("SystemFgDispatcher");

    /* renamed from: h */
    public Context f2090h;

    /* renamed from: i */
    public C1527i f2091i;

    /* renamed from: j */
    public final InterfaceC3840a f2092j;

    /* renamed from: k */
    public final Object f2093k = new Object();

    /* renamed from: l */
    public String f2094l;

    /* renamed from: m */
    public final Map<String, C0587e> f2095m;

    /* renamed from: n */
    public final Map<String, C3420p> f2096n;

    /* renamed from: o */
    public final Set<C3420p> f2097o;

    /* renamed from: p */
    public final C2285d f2098p;

    /* renamed from: q */
    public b f2099q;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ WorkDatabase f2100h;

        /* renamed from: i */
        public final /* synthetic */ String f2101i;

        public a(WorkDatabase workDatabase, String str) {
            this.f2100h = workDatabase;
            this.f2101i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3420p mo12751n = this.f2100h.mo2131B().mo12751n(this.f2101i);
            if (mo12751n == null || !mo12751n.m12732b()) {
                return;
            }
            synchronized (C0430a.this.f2093k) {
                C0430a.this.f2096n.put(this.f2101i, mo12751n);
                C0430a.this.f2097o.add(mo12751n);
                C0430a c0430a = C0430a.this;
                c0430a.f2098p.m9292d(c0430a.f2097o);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: b */
        void mo2200b(int i10, int i11, Notification notification);

        /* renamed from: c */
        void mo2201c(int i10, Notification notification);

        /* renamed from: d */
        void mo2202d(int i10);

        void stop();
    }

    public C0430a(Context context) {
        this.f2090h = context;
        C1527i m6192k = C1527i.m6192k(context);
        this.f2091i = m6192k;
        InterfaceC3840a m6200p = m6192k.m6200p();
        this.f2092j = m6200p;
        this.f2094l = null;
        this.f2095m = new LinkedHashMap();
        this.f2097o = new HashSet();
        this.f2096n = new HashMap();
        this.f2098p = new C2285d(this.f2090h, m6200p, this);
        this.f2091i.m6197m().m6155d(this);
    }

    /* renamed from: a */
    public static Intent m2204a(Context context, String str, C0587e c0587e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c0587e.m2963c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0587e.m2961a());
        intent.putExtra("KEY_NOTIFICATION", c0587e.m2962b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m2205d(Context context, String str, C0587e c0587e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c0587e.m2963c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c0587e.m2961a());
        intent.putExtra("KEY_NOTIFICATION", c0587e.m2962b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: f */
    public static Intent m2206f(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: b */
    public void mo2182b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            AbstractC0592j.m2970c().mo2973a(f2089r, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f2091i.m6207w(str);
        }
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        Map.Entry<String, C0587e> next;
        synchronized (this.f2093k) {
            C3420p remove = this.f2096n.remove(str);
            if (remove != null ? this.f2097o.remove(remove) : false) {
                this.f2098p.m9292d(this.f2097o);
            }
        }
        C0587e remove2 = this.f2095m.remove(str);
        if (str.equals(this.f2094l) && this.f2095m.size() > 0) {
            Iterator<Map.Entry<String, C0587e>> it = this.f2095m.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f2094l = next.getKey();
            if (this.f2099q != null) {
                C0587e value = next.getValue();
                this.f2099q.mo2200b(value.m2963c(), value.m2961a(), value.m2962b());
                this.f2099q.mo2202d(value.m2963c());
            }
        }
        b bVar = this.f2099q;
        if (remove2 == null || bVar == null) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f2089r, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.m2963c()), str, Integer.valueOf(remove2.m2961a())), new Throwable[0]);
        bVar.mo2202d(remove2.m2963c());
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: e */
    public void mo2184e(List<String> list) {
    }

    /* renamed from: g */
    public final void m2207g(Intent intent) {
        AbstractC0592j.m2970c().mo2975d(f2089r, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f2091i.mo2990b(UUID.fromString(stringExtra));
    }

    /* renamed from: h */
    public final void m2208h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC0592j.m2970c().mo2973a(f2089r, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f2099q == null) {
            return;
        }
        this.f2095m.put(stringExtra, new C0587e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f2094l)) {
            this.f2094l = stringExtra;
            this.f2099q.mo2200b(intExtra, intExtra2, notification);
            return;
        }
        this.f2099q.mo2201c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, C0587e>> it = this.f2095m.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().m2961a();
        }
        C0587e c0587e = this.f2095m.get(this.f2094l);
        if (c0587e != null) {
            this.f2099q.mo2200b(c0587e.m2963c(), i10, c0587e.m2962b());
        }
    }

    /* renamed from: i */
    public final void m2209i(Intent intent) {
        AbstractC0592j.m2970c().mo2975d(f2089r, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f2092j.mo14611b(new a(this.f2091i.m6199o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: j */
    public void m2210j(Intent intent) {
        AbstractC0592j.m2970c().mo2975d(f2089r, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f2099q;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* renamed from: k */
    public void m2211k() {
        this.f2099q = null;
        synchronized (this.f2093k) {
            this.f2098p.m9293e();
        }
        this.f2091i.m6197m().m6159i(this);
    }

    /* renamed from: l */
    public void m2212l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m2209i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m2207g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    m2210j(intent);
                    return;
                }
                return;
            }
        }
        m2208h(intent);
    }

    /* renamed from: m */
    public void m2213m(b bVar) {
        if (this.f2099q != null) {
            AbstractC0592j.m2970c().mo2974b(f2089r, "A callback already exists.", new Throwable[0]);
        } else {
            this.f2099q = bVar;
        }
    }
}
