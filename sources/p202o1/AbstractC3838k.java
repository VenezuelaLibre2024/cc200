package p202o1;

import java.util.concurrent.atomic.AtomicBoolean;
import p262s1.InterfaceC4392f;

/* renamed from: o1.k */
/* loaded from: classes.dex */
public abstract class AbstractC3838k {

    /* renamed from: a */
    public final AtomicBoolean f13849a = new AtomicBoolean(false);

    /* renamed from: b */
    public final AbstractC3832e f13850b;

    /* renamed from: c */
    public volatile InterfaceC4392f f13851c;

    public AbstractC3838k(AbstractC3832e abstractC3832e) {
        this.f13850b = abstractC3832e;
    }

    /* renamed from: a */
    public InterfaceC4392f m14604a() {
        m14605b();
        return m14607e(this.f13849a.compareAndSet(false, true));
    }

    /* renamed from: b */
    public void m14605b() {
        this.f13850b.m14548a();
    }

    /* renamed from: c */
    public final InterfaceC4392f m14606c() {
        return this.f13850b.m14551d(mo12714d());
    }

    /* renamed from: d */
    public abstract String mo12714d();

    /* renamed from: e */
    public final InterfaceC4392f m14607e(boolean z10) {
        if (!z10) {
            return m14606c();
        }
        if (this.f13851c == null) {
            this.f13851c = m14606c();
        }
        return this.f13851c;
    }

    /* renamed from: f */
    public void m14608f(InterfaceC4392f interfaceC4392f) {
        if (interfaceC4392f == this.f13851c) {
            this.f13849a.set(false);
        }
    }
}
