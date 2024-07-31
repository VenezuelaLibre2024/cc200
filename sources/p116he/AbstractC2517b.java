package p116he;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1101t0;

/* renamed from: he.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2517b<T> extends AbstractC2524e0 {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f9953a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2517b.class, Object.class, "_consensus");
    private volatile Object _consensus = C2515a.f9949a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p116he.AbstractC2524e0
    /* renamed from: a */
    public final Object mo10045a(Object obj) {
        Object obj2 = f9953a.get(this);
        if (obj2 == C2515a.f9949a) {
            obj2 = m10047c(mo4450d(obj));
        }
        mo10046b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo10046b(T t10, Object obj);

    /* renamed from: c */
    public final Object m10047c(Object obj) {
        if (C1101t0.m4573a()) {
            if (!(obj != C2515a.f9949a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9953a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C2515a.f9949a;
        return obj2 != obj3 ? obj2 : C1080o.m4523a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* renamed from: d */
    public abstract Object mo4450d(T t10);
}
