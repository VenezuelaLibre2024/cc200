package p373zd;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.C3474h;
import td.C4753m;

/* renamed from: zd.c */
/* loaded from: classes2.dex */
public final class C6125c<T> extends AbstractC6126d<T> implements Iterator<T>, InterfaceC3281d<C2245s> {

    /* renamed from: h */
    public int f22682h;

    /* renamed from: i */
    public T f22683i;

    /* renamed from: j */
    public Iterator<? extends T> f22684j;

    /* renamed from: k */
    public InterfaceC3281d<? super C2245s> f22685k;

    @Override // p373zd.AbstractC6126d
    /* renamed from: a */
    public Object mo24434a(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        this.f22683i = t10;
        this.f22682h = 3;
        this.f22685k = interfaceC3281d;
        Object m12581c = C3385c.m12581c();
        if (m12581c == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m12581c == C3385c.m12581c() ? m12581c : C2245s.f8873a;
    }

    /* renamed from: d */
    public final Throwable m24435d() {
        int i10 = this.f22682h;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22682h);
    }

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        return C3285h.f11452h;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f22682h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m24435d();
                }
                Iterator<? extends T> it = this.f22684j;
                C4753m.m18650c(it);
                if (it.hasNext()) {
                    this.f22682h = 2;
                    return true;
                }
                this.f22684j = null;
            }
            this.f22682h = 5;
            InterfaceC3281d<? super C2245s> interfaceC3281d = this.f22685k;
            C4753m.m18650c(interfaceC3281d);
            this.f22685k = null;
            C2237k.a aVar = C2237k.f8865i;
            interfaceC3281d.resumeWith(C2237k.m8966b(C2245s.f8873a));
        }
    }

    /* renamed from: i */
    public final T m24436i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: j */
    public final void m24437j(InterfaceC3281d<? super C2245s> interfaceC3281d) {
        this.f22685k = interfaceC3281d;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f22682h;
        if (i10 == 0 || i10 == 1) {
            return m24436i();
        }
        if (i10 == 2) {
            this.f22682h = 1;
            Iterator<? extends T> it = this.f22684j;
            C4753m.m18650c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m24435d();
        }
        this.f22682h = 0;
        T t10 = this.f22683i;
        this.f22683i = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p146jd.InterfaceC3281d
    public void resumeWith(Object obj) {
        C2238l.m8975b(obj);
        this.f22682h = 4;
    }
}
