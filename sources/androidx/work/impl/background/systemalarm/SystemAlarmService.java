package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.ServiceC0358n;
import androidx.work.impl.background.systemalarm.C0426d;
import p029c2.AbstractC0592j;
import p178m2.C3509j;

/* loaded from: classes.dex */
public class SystemAlarmService extends ServiceC0358n implements C0426d.c {

    /* renamed from: k */
    public static final String f2032k = AbstractC0592j.m2972f("SystemAlarmService");

    /* renamed from: i */
    public C0426d f2033i;

    /* renamed from: j */
    public boolean f2034j;

    @Override // androidx.work.impl.background.systemalarm.C0426d.c
    /* renamed from: a */
    public void mo2162a() {
        this.f2034j = true;
        AbstractC0592j.m2970c().mo2973a(f2032k, "All commands completed in dispatcher", new Throwable[0]);
        C3509j.m13055a();
        stopSelf();
    }

    /* renamed from: e */
    public final void m2163e() {
        C0426d c0426d = new C0426d(this);
        this.f2033i = c0426d;
        c0426d.m2198m(this);
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public void onCreate() {
        super.onCreate();
        m2163e();
        this.f2034j = false;
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2034j = true;
        this.f2033i.m2195j();
    }

    @Override // androidx.lifecycle.ServiceC0358n, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2034j) {
            AbstractC0592j.m2970c().mo2975d(f2032k, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2033i.m2195j();
            m2163e();
            this.f2034j = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2033i.m2187a(intent, i11);
        return 3;
    }
}
