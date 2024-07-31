package p096g6;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.AbstractC1855o;
import p079f6.AbstractC1856p;
import p079f6.AbstractC1857q;
import p079f6.InterfaceC1850j;
import p079f6.InterfaceC1853m;
import p079f6.InterfaceC1854n;
import p108h6.C2394s;

/* renamed from: g6.r1 */
/* loaded from: classes.dex */
public final class C2061r1<R extends InterfaceC1853m> extends AbstractC1857q<R> implements InterfaceC1854n<R> {

    /* renamed from: g */
    public final WeakReference f8139g;

    /* renamed from: h */
    public final HandlerC2055p1 f8140h;

    /* renamed from: a */
    public AbstractC1856p f8133a = null;

    /* renamed from: b */
    public C2061r1 f8134b = null;

    /* renamed from: c */
    public volatile AbstractC1855o f8135c = null;

    /* renamed from: d */
    public AbstractC1848h f8136d = null;

    /* renamed from: e */
    public final Object f8137e = new Object();

    /* renamed from: f */
    public Status f8138f = null;

    /* renamed from: i */
    public boolean f8141i = false;

    public C2061r1(WeakReference weakReference) {
        C2394s.m9620m(weakReference, "GoogleApiClient reference must not be null");
        this.f8139g = weakReference;
        AbstractC1846f abstractC1846f = (AbstractC1846f) weakReference.get();
        this.f8140h = new HandlerC2055p1(this, abstractC1846f != null ? abstractC1846f.mo7591e() : Looper.getMainLooper());
    }

    /* renamed from: o */
    public static final void m8256o(InterfaceC1853m interfaceC1853m) {
        if (interfaceC1853m instanceof InterfaceC1850j) {
            try {
                ((InterfaceC1850j) interfaceC1853m).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(interfaceC1853m)), e10);
            }
        }
    }

    @Override // p079f6.InterfaceC1854n
    /* renamed from: a */
    public final void mo7602a(InterfaceC1853m interfaceC1853m) {
        synchronized (this.f8137e) {
            if (!interfaceC1853m.getStatus().m4991N()) {
                m8259k(interfaceC1853m.getStatus());
                m8256o(interfaceC1853m);
            } else if (this.f8133a != null) {
                C2024g1.m8147a().submit(new RunnableC2052o1(this, interfaceC1853m));
            } else if (m8262n()) {
                ((AbstractC1855o) C2394s.m9619l(this.f8135c)).m7604c(interfaceC1853m);
            }
        }
    }

    /* renamed from: b */
    public final <S extends InterfaceC1853m> AbstractC1857q<S> m8257b(AbstractC1856p<? super R, ? extends S> abstractC1856p) {
        C2061r1 c2061r1;
        synchronized (this.f8137e) {
            boolean z10 = true;
            C2394s.m9623p(this.f8133a == null, "Cannot call then() twice.");
            if (this.f8135c != null) {
                z10 = false;
            }
            C2394s.m9623p(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f8133a = abstractC1856p;
            c2061r1 = new C2061r1(this.f8139g);
            this.f8134b = c2061r1;
            m8260l();
        }
        return c2061r1;
    }

    /* renamed from: j */
    public final void m8258j(AbstractC1848h abstractC1848h) {
        synchronized (this.f8137e) {
            this.f8136d = abstractC1848h;
            m8260l();
        }
    }

    /* renamed from: k */
    public final void m8259k(Status status) {
        synchronized (this.f8137e) {
            this.f8138f = status;
            m8261m(status);
        }
    }

    /* renamed from: l */
    public final void m8260l() {
        if (this.f8133a == null && this.f8135c == null) {
            return;
        }
        AbstractC1846f abstractC1846f = (AbstractC1846f) this.f8139g.get();
        if (!this.f8141i && this.f8133a != null && abstractC1846f != null) {
            abstractC1846f.mo7594h(this);
            this.f8141i = true;
        }
        Status status = this.f8138f;
        if (status != null) {
            m8261m(status);
            return;
        }
        AbstractC1848h abstractC1848h = this.f8136d;
        if (abstractC1848h != null) {
            abstractC1848h.setResultCallback(this);
        }
    }

    /* renamed from: m */
    public final void m8261m(Status status) {
        synchronized (this.f8137e) {
            AbstractC1856p abstractC1856p = this.f8133a;
            if (abstractC1856p != null) {
                ((C2061r1) C2394s.m9619l(this.f8134b)).m8259k((Status) C2394s.m9620m(abstractC1856p.m7605a(status), "onFailure must not return null"));
            } else if (m8262n()) {
                ((AbstractC1855o) C2394s.m9619l(this.f8135c)).m7603b(status);
            }
        }
    }

    /* renamed from: n */
    public final boolean m8262n() {
        return (this.f8135c == null || ((AbstractC1846f) this.f8139g.get()) == null) ? false : true;
    }
}
