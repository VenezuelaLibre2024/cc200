package p060e2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C0416a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p029c2.AbstractC0592j;
import p029c2.C0601s;
import p044d2.C1527i;
import p044d2.InterfaceC1520b;
import p044d2.InterfaceC1523e;
import p104h2.C2285d;
import p104h2.InterfaceC2284c;
import p165l2.C3420p;
import p178m2.C3505f;
import p203o2.InterfaceC3840a;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public class C1644b implements InterfaceC1523e, InterfaceC2284c, InterfaceC1520b {

    /* renamed from: p */
    public static final String f6053p = AbstractC0592j.m2972f("GreedyScheduler");

    /* renamed from: h */
    public final Context f6054h;

    /* renamed from: i */
    public final C1527i f6055i;

    /* renamed from: j */
    public final C2285d f6056j;

    /* renamed from: l */
    public C1643a f6058l;

    /* renamed from: m */
    public boolean f6059m;

    /* renamed from: o */
    public Boolean f6061o;

    /* renamed from: k */
    public final Set<C3420p> f6057k = new HashSet();

    /* renamed from: n */
    public final Object f6060n = new Object();

    public C1644b(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, C1527i c1527i) {
        this.f6054h = context;
        this.f6055i = c1527i;
        this.f6056j = new C2285d(context, interfaceC3840a, this);
        this.f6058l = new C1643a(this, c0416a.m2098k());
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: a */
    public boolean mo6166a() {
        return false;
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: b */
    public void mo2182b(List<String> list) {
        for (String str : list) {
            AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f6055i.m6208x(str);
        }
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        m6525i(str);
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: d */
    public void mo6167d(String str) {
        if (this.f6061o == null) {
            m6523g();
        }
        if (!this.f6061o.booleanValue()) {
            AbstractC0592j.m2970c().mo2975d(f6053p, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m6524h();
        AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C1643a c1643a = this.f6058l;
        if (c1643a != null) {
            c1643a.m6522b(str);
        }
        this.f6055i.m6208x(str);
    }

    @Override // p104h2.InterfaceC2284c
    /* renamed from: e */
    public void mo2184e(List<String> list) {
        for (String str : list) {
            AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f6055i.m6205u(str);
        }
    }

    @Override // p044d2.InterfaceC1523e
    /* renamed from: f */
    public void mo6168f(C3420p... c3420pArr) {
        if (this.f6061o == null) {
            m6523g();
        }
        if (!this.f6061o.booleanValue()) {
            AbstractC0592j.m2970c().mo2975d(f6053p, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m6524h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C3420p c3420p : c3420pArr) {
            long m12731a = c3420p.m12731a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c3420p.f12011b == C0601s.a.ENQUEUED) {
                if (currentTimeMillis < m12731a) {
                    C1643a c1643a = this.f6058l;
                    if (c1643a != null) {
                        c1643a.m6521a(c3420p);
                    }
                } else if (c3420p.m12732b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && c3420p.f12019j.m2943h()) {
                        AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Ignoring WorkSpec %s, Requires device idle.", c3420p), new Throwable[0]);
                    } else if (i10 < 24 || !c3420p.f12019j.m2940e()) {
                        hashSet.add(c3420p);
                        hashSet2.add(c3420p.f12010a);
                    } else {
                        AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c3420p), new Throwable[0]);
                    }
                } else {
                    AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Starting work for %s", c3420p.f12010a), new Throwable[0]);
                    this.f6055i.m6205u(c3420p.f12010a);
                }
            }
        }
        synchronized (this.f6060n) {
            if (!hashSet.isEmpty()) {
                AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f6057k.addAll(hashSet);
                this.f6056j.m9292d(this.f6057k);
            }
        }
    }

    /* renamed from: g */
    public final void m6523g() {
        this.f6061o = Boolean.valueOf(C3505f.m13052b(this.f6054h, this.f6055i.m6195i()));
    }

    /* renamed from: h */
    public final void m6524h() {
        if (this.f6059m) {
            return;
        }
        this.f6055i.m6197m().m6155d(this);
        this.f6059m = true;
    }

    /* renamed from: i */
    public final void m6525i(String str) {
        synchronized (this.f6060n) {
            Iterator<C3420p> it = this.f6057k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3420p next = it.next();
                if (next.f12010a.equals(str)) {
                    AbstractC0592j.m2970c().mo2973a(f6053p, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f6057k.remove(next);
                    this.f6056j.m9292d(this.f6057k);
                    break;
                }
            }
        }
    }
}
