package p178m2;

import androidx.work.impl.WorkDatabase;
import p029c2.AbstractC0592j;
import p029c2.C0601s;
import p044d2.C1522d;
import p044d2.C1527i;
import p165l2.InterfaceC3421q;

/* renamed from: m2.i */
/* loaded from: classes.dex */
public class RunnableC3508i implements Runnable {

    /* renamed from: k */
    public static final String f12289k = AbstractC0592j.m2972f("StopWorkRunnable");

    /* renamed from: h */
    public final C1527i f12290h;

    /* renamed from: i */
    public final String f12291i;

    /* renamed from: j */
    public final boolean f12292j;

    public RunnableC3508i(C1527i c1527i, String str, boolean z10) {
        this.f12290h = c1527i;
        this.f12291i = str;
        this.f12292j = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m6165o;
        WorkDatabase m6199o = this.f12290h.m6199o();
        C1522d m6197m = this.f12290h.m6197m();
        InterfaceC3421q mo2131B = m6199o.mo2131B();
        m6199o.m14550c();
        try {
            boolean m6158h = m6197m.m6158h(this.f12291i);
            if (this.f12292j) {
                m6165o = this.f12290h.m6197m().m6164n(this.f12291i);
            } else {
                if (!m6158h && mo2131B.mo12750m(this.f12291i) == C0601s.a.RUNNING) {
                    mo2131B.mo12746i(C0601s.a.ENQUEUED, this.f12291i);
                }
                m6165o = this.f12290h.m6197m().m6165o(this.f12291i);
            }
            AbstractC0592j.m2970c().mo2973a(f12289k, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f12291i, Boolean.valueOf(m6165o)), new Throwable[0]);
            m6199o.m14562r();
        } finally {
            m6199o.m14552g();
        }
    }
}
