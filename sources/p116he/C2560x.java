package p116he;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;

/* renamed from: he.x */
/* loaded from: classes2.dex */
public class C2560x<E> {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f10025a = AtomicReferenceFieldUpdater.newUpdater(C2560x.class, Object.class, "_cur");
    private volatile Object _cur;

    public C2560x(boolean z10) {
        this._cur = new C2561y(8, z10);
    }

    /* renamed from: a */
    public final boolean m10195a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10025a;
        while (true) {
            C2561y c2561y = (C2561y) atomicReferenceFieldUpdater.get(this);
            int m10199a = c2561y.m10199a(e10);
            if (m10199a == 0) {
                return true;
            }
            if (m10199a == 1) {
                C1080o.m4523a(f10025a, this, c2561y, c2561y.m10207i());
            } else if (m10199a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m10196b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10025a;
        while (true) {
            C2561y c2561y = (C2561y) atomicReferenceFieldUpdater.get(this);
            if (c2561y.m10202d()) {
                return;
            } else {
                C1080o.m4523a(f10025a, this, c2561y, c2561y.m10207i());
            }
        }
    }

    /* renamed from: c */
    public final int m10197c() {
        return ((C2561y) f10025a.get(this)).m10204f();
    }

    /* renamed from: d */
    public final E m10198d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10025a;
        while (true) {
            C2561y c2561y = (C2561y) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) c2561y.m10208j();
            if (e10 != C2561y.f10029h) {
                return e10;
            }
            C1080o.m4523a(f10025a, this, c2561y, c2561y.m10207i());
        }
    }
}
