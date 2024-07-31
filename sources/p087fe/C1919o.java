package p087fe;

import gd.C2237k;
import gd.C2245s;
import ge.AbstractC2249d;
import ge.C2248c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1084p;
import p038ce.C1101t0;
import p116he.C2538l0;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3474h;
import td.C4753m;

/* renamed from: fe.o */
/* loaded from: classes2.dex */
public final class C1919o extends AbstractC2249d<C1917m<?>> {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f7267a = AtomicReferenceFieldUpdater.newUpdater(C1919o.class, Object.class, "_state");
    private volatile Object _state;

    @Override // ge.AbstractC2249d
    /* renamed from: d */
    public boolean mo7808a(C1917m<?> c1917m) {
        C2538l0 c2538l0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7267a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        c2538l0 = C1918n.f7265a;
        atomicReferenceFieldUpdater.set(this, c2538l0);
        return true;
    }

    /* renamed from: e */
    public final Object m7811e(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
        c1084p.m4530B();
        if (C1101t0.m4573a() && !(!(f7267a.get(this) instanceof C1084p))) {
            throw new AssertionError();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7267a;
        c2538l0 = C1918n.f7265a;
        if (!C1080o.m4523a(atomicReferenceFieldUpdater, this, c2538l0, c1084p)) {
            if (C1101t0.m4573a()) {
                Object obj = f7267a.get(this);
                c2538l02 = C1918n.f7266b;
                if (!(obj == c2538l02)) {
                    throw new AssertionError();
                }
            }
            C2237k.a aVar = C2237k.f8865i;
            c1084p.resumeWith(C2237k.m8966b(C2245s.f8873a));
        }
        Object m4553y = c1084p.m4553y();
        if (m4553y == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
    }

    @Override // ge.AbstractC2249d
    /* renamed from: f */
    public InterfaceC3281d<C2245s>[] mo7809b(C1917m<?> c1917m) {
        f7267a.set(this, null);
        return C2248c.f8878a;
    }

    /* renamed from: g */
    public final void m7813g() {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        C2538l0 c2538l04;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7267a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            c2538l0 = C1918n.f7266b;
            if (obj == c2538l0) {
                return;
            }
            c2538l02 = C1918n.f7265a;
            if (obj == c2538l02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7267a;
                c2538l03 = C1918n.f7266b;
                if (C1080o.m4523a(atomicReferenceFieldUpdater2, this, obj, c2538l03)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f7267a;
                c2538l04 = C1918n.f7265a;
                if (C1080o.m4523a(atomicReferenceFieldUpdater3, this, obj, c2538l04)) {
                    C2237k.a aVar = C2237k.f8865i;
                    ((C1084p) obj).resumeWith(C2237k.m8966b(C2245s.f8873a));
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m7814h() {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7267a;
        c2538l0 = C1918n.f7265a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c2538l0);
        C4753m.m18650c(andSet);
        if (C1101t0.m4573a() && !(!(andSet instanceof C1084p))) {
            throw new AssertionError();
        }
        c2538l02 = C1918n.f7266b;
        return andSet == c2538l02;
    }
}
