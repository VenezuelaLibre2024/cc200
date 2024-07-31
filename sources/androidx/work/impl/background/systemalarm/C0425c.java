package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C0426d;
import java.util.Collections;
import java.util.List;
import p029c2.AbstractC0592j;
import p044d2.InterfaceC1520b;
import p104h2.C2285d;
import p104h2.InterfaceC2284c;
import p165l2.C3420p;
import p178m2.C3509j;
import p178m2.C3513n;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
public class C0425c implements InterfaceC2284c, InterfaceC1520b, C3513n.b {

    /* renamed from: q */
    public static final String f2044q = AbstractC0592j.m2972f("DelayMetCommandHandler");

    /* renamed from: h */
    public final Context f2045h;

    /* renamed from: i */
    public final int f2046i;

    /* renamed from: j */
    public final String f2047j;

    /* renamed from: k */
    public final C0426d f2048k;

    /* renamed from: l */
    public final C2285d f2049l;

    /* renamed from: o */
    public PowerManager.WakeLock f2052o;

    /* renamed from: p */
    public boolean f2053p = false;

    /* renamed from: n */
    public int f2051n = 0;

    /* renamed from: m */
    public final Object f2050m = new Object();

    public C0425c(Context context, int i10, String str, C0426d c0426d) {
        this.f2045h = context;
        this.f2046i = i10;
        this.f2048k = c0426d;
        this.f2047j = str;
        this.f2049l = new C2285d(context, c0426d.m2191f(), this);
    }

    @Override // p178m2.C3513n.b
    /* renamed from: a */
    public void mo2181a(String str) {
        AbstractC0592j.m2970c().mo2973a(f2044q, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m2186g();
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: b */
    public void mo2182b(List<String> list) {
        m2186g();
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        AbstractC0592j.m2970c().mo2973a(f2044q, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        m2183d();
        if (z10) {
            Intent m2168f = C0423a.m2168f(this.f2045h, this.f2047j);
            C0426d c0426d = this.f2048k;
            c0426d.m2196k(new C0426d.b(c0426d, m2168f, this.f2046i));
        }
        if (this.f2053p) {
            Intent m2164a = C0423a.m2164a(this.f2045h);
            C0426d c0426d2 = this.f2048k;
            c0426d2.m2196k(new C0426d.b(c0426d2, m2164a, this.f2046i));
        }
    }

    /* renamed from: d */
    public final void m2183d() {
        synchronized (this.f2050m) {
            this.f2049l.m9293e();
            this.f2048k.m2193h().m13060c(this.f2047j);
            PowerManager.WakeLock wakeLock = this.f2052o;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC0592j.m2970c().mo2973a(f2044q, String.format("Releasing wakelock %s for WorkSpec %s", this.f2052o, this.f2047j), new Throwable[0]);
                this.f2052o.release();
            }
        }
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: e */
    public void mo2184e(List<String> list) {
        if (list.contains(this.f2047j)) {
            synchronized (this.f2050m) {
                if (this.f2051n == 0) {
                    this.f2051n = 1;
                    AbstractC0592j.m2970c().mo2973a(f2044q, String.format("onAllConstraintsMet for %s", this.f2047j), new Throwable[0]);
                    if (this.f2048k.m2190e().m6160j(this.f2047j)) {
                        this.f2048k.m2193h().m13059b(this.f2047j, 600000L, this);
                    } else {
                        m2183d();
                    }
                } else {
                    AbstractC0592j.m2970c().mo2973a(f2044q, String.format("Already started work for %s", this.f2047j), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public void m2185f() {
        this.f2052o = C3509j.m13056b(this.f2045h, String.format("%s (%s)", this.f2047j, Integer.valueOf(this.f2046i)));
        AbstractC0592j m2970c = AbstractC0592j.m2970c();
        String str = f2044q;
        m2970c.mo2973a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2052o, this.f2047j), new Throwable[0]);
        this.f2052o.acquire();
        C3420p mo12751n = this.f2048k.m2192g().m6199o().mo2131B().mo12751n(this.f2047j);
        if (mo12751n == null) {
            m2186g();
            return;
        }
        boolean m12732b = mo12751n.m12732b();
        this.f2053p = m12732b;
        if (m12732b) {
            this.f2049l.m9292d(Collections.singletonList(mo12751n));
        } else {
            AbstractC0592j.m2970c().mo2973a(str, String.format("No constraints for %s", this.f2047j), new Throwable[0]);
            mo2184e(Collections.singletonList(this.f2047j));
        }
    }

    /* renamed from: g */
    public final void m2186g() {
        synchronized (this.f2050m) {
            if (this.f2051n < 2) {
                this.f2051n = 2;
                AbstractC0592j m2970c = AbstractC0592j.m2970c();
                String str = f2044q;
                m2970c.mo2973a(str, String.format("Stopping work for WorkSpec %s", this.f2047j), new Throwable[0]);
                Intent m2169g = C0423a.m2169g(this.f2045h, this.f2047j);
                C0426d c0426d = this.f2048k;
                c0426d.m2196k(new C0426d.b(c0426d, m2169g, this.f2046i));
                if (this.f2048k.m2190e().m6157g(this.f2047j)) {
                    AbstractC0592j.m2970c().mo2973a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2047j), new Throwable[0]);
                    Intent m2168f = C0423a.m2168f(this.f2045h, this.f2047j);
                    C0426d c0426d2 = this.f2048k;
                    c0426d2.m2196k(new C0426d.b(c0426d2, m2168f, this.f2046i));
                } else {
                    AbstractC0592j.m2970c().mo2973a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2047j), new Throwable[0]);
                }
            } else {
                AbstractC0592j.m2970c().mo2973a(f2044q, String.format("Already stopped work for %s", this.f2047j), new Throwable[0]);
            }
        }
    }
}
