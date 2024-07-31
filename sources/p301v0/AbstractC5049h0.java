package p301v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p301v0.C5028a0;

/* renamed from: v0.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC5049h0 {

    /* renamed from: a */
    public static final AbstractC5049h0 f18933a;

    /* renamed from: b */
    public static final AbstractC5049h0 f18934b;

    /* renamed from: v0.h0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5049h0 {

        /* renamed from: c */
        public static final Class<?> f18935c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        /* renamed from: f */
        public static <E> List<E> m19984f(Object obj, long j10) {
            return (List) C5080r1.m20462A(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static <L> List<L> m19985g(Object obj, long j10, int i10) {
            List<L> mo19804i;
            C5043f0 c5043f0;
            List<L> m19984f = m19984f(obj, j10);
            if (!m19984f.isEmpty()) {
                if (f18935c.isAssignableFrom(m19984f.getClass())) {
                    ArrayList arrayList = new ArrayList(m19984f.size() + i10);
                    arrayList.addAll(m19984f);
                    c5043f0 = arrayList;
                } else if (m19984f instanceof C5077q1) {
                    C5043f0 c5043f02 = new C5043f0(m19984f.size() + i10);
                    c5043f02.addAll((C5077q1) m19984f);
                    c5043f0 = c5043f02;
                } else {
                    if (!(m19984f instanceof InterfaceC5029a1) || !(m19984f instanceof C5028a0.i)) {
                        return m19984f;
                    }
                    C5028a0.i iVar = (C5028a0.i) m19984f;
                    if (iVar.mo19802H()) {
                        return m19984f;
                    }
                    mo19804i = iVar.mo19804i(m19984f.size() + i10);
                }
                C5080r1.m20476O(obj, j10, c5043f0);
                return c5043f0;
            }
            mo19804i = m19984f instanceof InterfaceC5046g0 ? new C5043f0(i10) : ((m19984f instanceof InterfaceC5029a1) && (m19984f instanceof C5028a0.i)) ? ((C5028a0.i) m19984f).mo19804i(i10) : new ArrayList<>(i10);
            C5080r1.m20476O(obj, j10, mo19804i);
            return mo19804i;
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: c */
        public void mo19981c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) C5080r1.m20462A(obj, j10);
            if (list instanceof InterfaceC5046g0) {
                unmodifiableList = ((InterfaceC5046g0) list).mo19928A();
            } else {
                if (f18935c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC5029a1) && (list instanceof C5028a0.i)) {
                    C5028a0.i iVar = (C5028a0.i) list;
                    if (iVar.mo19802H()) {
                        iVar.mo19803f();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C5080r1.m20476O(obj, j10, unmodifiableList);
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: d */
        public <E> void mo19982d(Object obj, Object obj2, long j10) {
            List m19984f = m19984f(obj2, j10);
            List m19985g = m19985g(obj, j10, m19984f.size());
            int size = m19985g.size();
            int size2 = m19984f.size();
            if (size > 0 && size2 > 0) {
                m19985g.addAll(m19984f);
            }
            if (size > 0) {
                m19984f = m19985g;
            }
            C5080r1.m20476O(obj, j10, m19984f);
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: e */
        public <L> List<L> mo19983e(Object obj, long j10) {
            return m19985g(obj, j10, 10);
        }
    }

    /* renamed from: v0.h0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC5049h0 {
        public c() {
            super();
        }

        /* renamed from: f */
        public static <E> C5028a0.i<E> m19986f(Object obj, long j10) {
            return (C5028a0.i) C5080r1.m20462A(obj, j10);
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: c */
        public void mo19981c(Object obj, long j10) {
            m19986f(obj, j10).mo19803f();
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: d */
        public <E> void mo19982d(Object obj, Object obj2, long j10) {
            C5028a0.i m19986f = m19986f(obj, j10);
            C5028a0.i m19986f2 = m19986f(obj2, j10);
            int size = m19986f.size();
            int size2 = m19986f2.size();
            if (size > 0 && size2 > 0) {
                if (!m19986f.mo19802H()) {
                    m19986f = m19986f.mo19804i(size2 + size);
                }
                m19986f.addAll(m19986f2);
            }
            if (size > 0) {
                m19986f2 = m19986f;
            }
            C5080r1.m20476O(obj, j10, m19986f2);
        }

        @Override // p301v0.AbstractC5049h0
        /* renamed from: e */
        public <L> List<L> mo19983e(Object obj, long j10) {
            C5028a0.i m19986f = m19986f(obj, j10);
            if (m19986f.mo19802H()) {
                return m19986f;
            }
            int size = m19986f.size();
            C5028a0.i mo19804i = m19986f.mo19804i(size == 0 ? 10 : size * 2);
            C5080r1.m20476O(obj, j10, mo19804i);
            return mo19804i;
        }
    }

    static {
        f18933a = new b();
        f18934b = new c();
    }

    public AbstractC5049h0() {
    }

    /* renamed from: a */
    public static AbstractC5049h0 m19979a() {
        return f18933a;
    }

    /* renamed from: b */
    public static AbstractC5049h0 m19980b() {
        return f18934b;
    }

    /* renamed from: c */
    public abstract void mo19981c(Object obj, long j10);

    /* renamed from: d */
    public abstract <L> void mo19982d(Object obj, Object obj2, long j10);

    /* renamed from: e */
    public abstract <L> List<L> mo19983e(Object obj, long j10);
}
