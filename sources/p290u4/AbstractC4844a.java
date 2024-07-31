package p290u4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p264s3.AbstractC4505u3;
import p275t3.C4674s1;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4882t;
import p317w3.InterfaceC5255u;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public abstract class AbstractC4844a implements InterfaceC4882t {

    /* renamed from: h */
    public final ArrayList<InterfaceC4882t.c> f18206h = new ArrayList<>(1);

    /* renamed from: i */
    public final HashSet<InterfaceC4882t.c> f18207i = new HashSet<>(1);

    /* renamed from: j */
    public final InterfaceC4845a0.a f18208j = new InterfaceC4845a0.a();

    /* renamed from: k */
    public final InterfaceC5255u.a f18209k = new InterfaceC5255u.a();

    /* renamed from: l */
    public Looper f18210l;

    /* renamed from: m */
    public AbstractC4505u3 f18211m;

    /* renamed from: n */
    public C4674s1 f18212n;

    /* renamed from: A */
    public final C4674s1 m19189A() {
        return (C4674s1) C4014a.m15202h(this.f18212n);
    }

    /* renamed from: B */
    public final boolean m19190B() {
        return !this.f18207i.isEmpty();
    }

    /* renamed from: C */
    public abstract void mo4714C(InterfaceC3917m0 interfaceC3917m0);

    /* renamed from: D */
    public final void m19191D(AbstractC4505u3 abstractC4505u3) {
        this.f18211m = abstractC4505u3;
        Iterator<InterfaceC4882t.c> it = this.f18206h.iterator();
        while (it.hasNext()) {
            it.next().mo17221a(this, abstractC4505u3);
        }
    }

    /* renamed from: E */
    public abstract void mo4715E();

    @Override // p290u4.InterfaceC4882t
    /* renamed from: c */
    public final void mo19192c(Handler handler, InterfaceC5255u interfaceC5255u) {
        C4014a.m15199e(handler);
        C4014a.m15199e(interfaceC5255u);
        this.f18209k.m21283g(handler, interfaceC5255u);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: d */
    public final void mo19193d(InterfaceC4882t.c cVar, InterfaceC3917m0 interfaceC3917m0, C4674s1 c4674s1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f18210l;
        C4014a.m15195a(looper == null || looper == myLooper);
        this.f18212n = c4674s1;
        AbstractC4505u3 abstractC4505u3 = this.f18211m;
        this.f18206h.add(cVar);
        if (this.f18210l == null) {
            this.f18210l = myLooper;
            this.f18207i.add(cVar);
            mo4714C(interfaceC3917m0);
        } else if (abstractC4505u3 != null) {
            mo19194e(cVar);
            cVar.mo17221a(this, abstractC4505u3);
        }
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: e */
    public final void mo19194e(InterfaceC4882t.c cVar) {
        C4014a.m15199e(this.f18210l);
        boolean isEmpty = this.f18207i.isEmpty();
        this.f18207i.add(cVar);
        if (isEmpty) {
            mo19206z();
        }
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: i */
    public final void mo19195i(Handler handler, InterfaceC4845a0 interfaceC4845a0) {
        C4014a.m15199e(handler);
        C4014a.m15199e(interfaceC4845a0);
        this.f18208j.m19225g(handler, interfaceC4845a0);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: m */
    public final void mo19196m(InterfaceC4845a0 interfaceC4845a0) {
        this.f18208j.m19221C(interfaceC4845a0);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: n */
    public final void mo19197n(InterfaceC5255u interfaceC5255u) {
        this.f18209k.m21290t(interfaceC5255u);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: q */
    public final void mo19198q(InterfaceC4882t.c cVar) {
        this.f18206h.remove(cVar);
        if (!this.f18206h.isEmpty()) {
            mo19199s(cVar);
            return;
        }
        this.f18210l = null;
        this.f18211m = null;
        this.f18212n = null;
        this.f18207i.clear();
        mo4715E();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: s */
    public final void mo19199s(InterfaceC4882t.c cVar) {
        boolean z10 = !this.f18207i.isEmpty();
        this.f18207i.remove(cVar);
        if (z10 && this.f18207i.isEmpty()) {
            mo19205y();
        }
    }

    /* renamed from: t */
    public final InterfaceC5255u.a m19200t(int i10, InterfaceC4882t.b bVar) {
        return this.f18209k.m21291u(i10, bVar);
    }

    /* renamed from: u */
    public final InterfaceC5255u.a m19201u(InterfaceC4882t.b bVar) {
        return this.f18209k.m21291u(0, bVar);
    }

    /* renamed from: v */
    public final InterfaceC4845a0.a m19202v(int i10, InterfaceC4882t.b bVar, long j10) {
        return this.f18208j.m19224F(i10, bVar, j10);
    }

    /* renamed from: w */
    public final InterfaceC4845a0.a m19203w(InterfaceC4882t.b bVar) {
        return this.f18208j.m19224F(0, bVar, 0L);
    }

    /* renamed from: x */
    public final InterfaceC4845a0.a m19204x(InterfaceC4882t.b bVar, long j10) {
        C4014a.m15199e(bVar);
        return this.f18208j.m19224F(0, bVar, j10);
    }

    /* renamed from: y */
    public void mo19205y() {
    }

    /* renamed from: z */
    public void mo19206z() {
    }
}
