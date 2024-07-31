package p075f2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C0423a;
import p029c2.AbstractC0592j;
import p044d2.InterfaceC1523e;
import p165l2.C3420p;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public class C1803b implements InterfaceC1523e {

    /* renamed from: i */
    public static final String f6624i = AbstractC0592j.m2972f("SystemAlarmScheduler");

    /* renamed from: h */
    public final Context f6625h;

    public C1803b(Context context) {
        this.f6625h = context.getApplicationContext();
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: a */
    public boolean mo6166a() {
        return true;
    }

    /* renamed from: b */
    public final void m7296b(C3420p c3420p) {
        AbstractC0592j.m2970c().mo2973a(f6624i, String.format("Scheduling work with workSpecId %s", c3420p.f12010a), new Throwable[0]);
        this.f6625h.startService(C0423a.m2168f(this.f6625h, c3420p.f12010a));
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: d */
    public void mo6167d(String str) {
        this.f6625h.startService(C0423a.m2169g(this.f6625h, str));
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: f */
    public void mo6168f(C3420p... c3420pArr) {
        for (C3420p c3420p : c3420pArr) {
            m7296b(c3420p);
        }
    }
}
