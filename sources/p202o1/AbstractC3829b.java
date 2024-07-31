package p202o1;

import p262s1.InterfaceC4392f;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public abstract class AbstractC3829b<T> extends AbstractC3838k {
    public AbstractC3829b(AbstractC3832e abstractC3832e) {
        super(abstractC3832e);
    }

    /* renamed from: g */
    public abstract void mo12715g(InterfaceC4392f interfaceC4392f, T t10);

    /* renamed from: h */
    public final void m14543h(T t10) {
        InterfaceC4392f m14604a = m14604a();
        try {
            mo12715g(m14604a, t10);
            m14604a.mo16986D0();
        } finally {
            m14608f(m14604a);
        }
    }
}
