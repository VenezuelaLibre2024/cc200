package p373zd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import td.C4753m;

/* renamed from: zd.a */
/* loaded from: classes2.dex */
public final class C6123a<T> implements InterfaceC6124b<T> {

    /* renamed from: a */
    public final AtomicReference<InterfaceC6124b<T>> f22681a;

    public C6123a(InterfaceC6124b<? extends T> interfaceC6124b) {
        C4753m.m18653f(interfaceC6124b, "sequence");
        this.f22681a = new AtomicReference<>(interfaceC6124b);
    }

    @Override // p373zd.InterfaceC6124b
    public Iterator<T> iterator() {
        InterfaceC6124b<T> andSet = this.f22681a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
