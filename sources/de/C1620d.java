package de;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p038ce.C1045g1;
import p038ce.C1046g2;
import p038ce.C1087p2;
import p038ce.InterfaceC1055i1;
import p146jd.InterfaceC3284g;
import p343xd.C5767k;
import td.C4747g;
import td.C4753m;

/* renamed from: de.d */
/* loaded from: classes2.dex */
public final class C1620d extends AbstractC1621e {
    private volatile C1620d _immediate;

    /* renamed from: j */
    public final Handler f5957j;

    /* renamed from: k */
    public final String f5958k;

    /* renamed from: l */
    public final boolean f5959l;

    /* renamed from: m */
    public final C1620d f5960m;

    public C1620d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ C1620d(Handler handler, String str, int i10, C4747g c4747g) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C1620d(Handler handler, String str, boolean z10) {
        super(null);
        this.f5957j = handler;
        this.f5958k = str;
        this.f5959l = z10;
        this._immediate = z10 ? this : null;
        C1620d c1620d = this._immediate;
        if (c1620d == null) {
            c1620d = new C1620d(handler, str, true);
            this._immediate = c1620d;
        }
        this.f5960m = c1620d;
    }

    /* renamed from: P0 */
    public static final void m6475P0(C1620d c1620d, Runnable runnable) {
        c1620d.f5957j.removeCallbacks(runnable);
    }

    @Override // de.AbstractC1621e, p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        if (this.f5957j.postDelayed(runnable, C5767k.m22907d(j10, 4611686018427387903L))) {
            return new InterfaceC1055i1() { // from class: de.c

                /* renamed from: i */
                public final /* synthetic */ Runnable f5956i;

                public /* synthetic */ C1619c(Runnable runnable2) {
                    r2 = runnable2;
                }

                @Override // p038ce.InterfaceC1055i1
                public final void dispose() {
                    C1620d.m6475P0(C1620d.this, r2);
                }
            };
        }
        m6476N0(interfaceC3284g, runnable2);
        return C1087p2.f4072h;
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        if (this.f5957j.post(runnable)) {
            return;
        }
        m6476N0(interfaceC3284g, runnable);
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: I0 */
    public boolean mo4340I0(InterfaceC3284g interfaceC3284g) {
        return (this.f5959l && C4753m.m18648a(Looper.myLooper(), this.f5957j.getLooper())) ? false : true;
    }

    /* renamed from: N0 */
    public final void m6476N0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        C1046g2.m4331c(interfaceC3284g, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1045g1.m4327b().mo4339H0(interfaceC3284g, runnable);
    }

    @Override // p038ce.AbstractC1079n2
    /* renamed from: O0 */
    public C1620d mo4521K0() {
        return this.f5960m;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1620d) && ((C1620d) obj).f5957j == this.f5957j;
    }

    public int hashCode() {
        return System.identityHashCode(this.f5957j);
    }

    @Override // p038ce.AbstractC1079n2, p038ce.AbstractC1064k0
    public String toString() {
        String m4522L0 = m4522L0();
        if (m4522L0 != null) {
            return m4522L0;
        }
        String str = this.f5958k;
        if (str == null) {
            str = this.f5957j.toString();
        }
        if (!this.f5959l) {
            return str;
        }
        return str + ".immediate";
    }
}
