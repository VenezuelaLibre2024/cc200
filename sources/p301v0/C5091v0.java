package p301v0;

import java.util.Iterator;
import java.util.Map;
import p301v0.C5037d0;
import p301v0.C5086t1;
import p301v0.C5087u;

/* renamed from: v0.v0 */
/* loaded from: classes.dex */
public final class C5091v0<T> implements InterfaceC5047g1<T> {

    /* renamed from: a */
    public final InterfaceC5079r0 f19211a;

    /* renamed from: b */
    public final AbstractC5068n1<?, ?> f19212b;

    /* renamed from: c */
    public final boolean f19213c;

    /* renamed from: d */
    public final AbstractC5075q<?> f19214d;

    public C5091v0(AbstractC5068n1<?, ?> abstractC5068n1, AbstractC5075q<?> abstractC5075q, InterfaceC5079r0 interfaceC5079r0) {
        this.f19212b = abstractC5068n1;
        this.f19213c = abstractC5075q.mo20442e(interfaceC5079r0);
        this.f19214d = abstractC5075q;
        this.f19211a = interfaceC5079r0;
    }

    /* renamed from: l */
    public static <T> C5091v0<T> m20672l(AbstractC5068n1<?, ?> abstractC5068n1, AbstractC5075q<?> abstractC5075q, InterfaceC5079r0 interfaceC5079r0) {
        return new C5091v0<>(abstractC5068n1, abstractC5075q, interfaceC5079r0);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: a */
    public void mo19938a(T t10, T t11) {
        C5053i1.m20070G(this.f19212b, t10, t11);
        if (this.f19213c) {
            C5053i1.m20068E(this.f19214d, t10, t11);
        }
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: b */
    public void mo19939b(T t10) {
        this.f19212b.mo20385j(t10);
        this.f19214d.mo20443f(t10);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: c */
    public final boolean mo19940c(T t10) {
        return this.f19214d.mo20440c(t10).m20600p();
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: d */
    public void mo19941d(T t10, InterfaceC5089u1 interfaceC5089u1) {
        Iterator<Map.Entry<?, Object>> m20601s = this.f19214d.mo20440c(t10).m20601s();
        while (m20601s.hasNext()) {
            Map.Entry<?, Object> next = m20601s.next();
            C5087u.b bVar = (C5087u.b) next.getKey();
            if (bVar.mo20611j() != C5086t1.c.MESSAGE || bVar.mo20608d() || bVar.mo20612k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC5089u1.mo20314c(bVar.mo20607a(), next instanceof C5037d0.b ? ((C5037d0.b) next).m19832a().m19909e() : next.getValue());
        }
        m20676n(this.f19212b, t10, interfaceC5089u1);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: e */
    public void mo19942e(T t10, InterfaceC5044f1 interfaceC5044f1, C5072p c5072p) {
        m20674k(this.f19212b, this.f19214d, t10, interfaceC5044f1, c5072p);
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: f */
    public boolean mo19943f(T t10, T t11) {
        if (!this.f19212b.mo20382g(t10).equals(this.f19212b.mo20382g(t11))) {
            return false;
        }
        if (this.f19213c) {
            return this.f19214d.mo20440c(t10).equals(this.f19214d.mo20440c(t11));
        }
        return true;
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: g */
    public int mo19944g(T t10) {
        int m20673j = m20673j(this.f19212b, t10) + 0;
        return this.f19213c ? m20673j + this.f19214d.mo20440c(t10).m20595j() : m20673j;
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: h */
    public T mo19945h() {
        return (T) this.f19211a.mo20458h().mo20460E();
    }

    @Override // p301v0.InterfaceC5047g1
    /* renamed from: i */
    public int mo19946i(T t10) {
        int hashCode = this.f19212b.mo20382g(t10).hashCode();
        return this.f19213c ? (hashCode * 53) + this.f19214d.mo20440c(t10).hashCode() : hashCode;
    }

    /* renamed from: j */
    public final <UT, UB> int m20673j(AbstractC5068n1<UT, UB> abstractC5068n1, T t10) {
        return abstractC5068n1.mo20384i(abstractC5068n1.mo20382g(t10));
    }

    /* renamed from: k */
    public final <UT, UB, ET extends C5087u.b<ET>> void m20674k(AbstractC5068n1<UT, UB> abstractC5068n1, AbstractC5075q<ET> abstractC5075q, T t10, InterfaceC5044f1 interfaceC5044f1, C5072p c5072p) {
        UB mo20381f = abstractC5068n1.mo20381f(t10);
        C5087u<ET> mo20441d = abstractC5075q.mo20441d(t10);
        do {
            try {
                if (interfaceC5044f1.mo19842C() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC5068n1.mo20390o(t10, mo20381f);
            }
        } while (m20675m(interfaceC5044f1, c5072p, abstractC5075q, mo20441d, abstractC5068n1, mo20381f));
    }

    /* renamed from: m */
    public final <UT, UB, ET extends C5087u.b<ET>> boolean m20675m(InterfaceC5044f1 interfaceC5044f1, C5072p c5072p, AbstractC5075q<ET> abstractC5075q, C5087u<ET> c5087u, AbstractC5068n1<UT, UB> abstractC5068n1, UB ub2) {
        int mo19900v = interfaceC5044f1.mo19900v();
        if (mo19900v != C5086t1.f19080a) {
            if (C5086t1.m20576b(mo19900v) != 2) {
                return interfaceC5044f1.mo19848I();
            }
            Object mo20439b = abstractC5075q.mo20439b(c5072p, this.f19211a, C5086t1.m20575a(mo19900v));
            if (mo20439b == null) {
                return abstractC5068n1.m20388m(ub2, interfaceC5044f1);
            }
            abstractC5075q.mo20445h(interfaceC5044f1, mo20439b, c5072p, c5087u);
            return true;
        }
        int i10 = 0;
        Object obj = null;
        AbstractC5048h abstractC5048h = null;
        while (interfaceC5044f1.mo19842C() != Integer.MAX_VALUE) {
            int mo19900v2 = interfaceC5044f1.mo19900v();
            if (mo19900v2 == C5086t1.f19082c) {
                i10 = interfaceC5044f1.mo19887l();
                obj = abstractC5075q.mo20439b(c5072p, this.f19211a, i10);
            } else if (mo19900v2 == C5086t1.f19083d) {
                if (obj != null) {
                    abstractC5075q.mo20445h(interfaceC5044f1, obj, c5072p, c5087u);
                } else {
                    abstractC5048h = interfaceC5044f1.mo19845F();
                }
            } else if (!interfaceC5044f1.mo19848I()) {
                break;
            }
        }
        if (interfaceC5044f1.mo19900v() != C5086t1.f19081b) {
            throw C5031b0.m19810a();
        }
        if (abstractC5048h != null) {
            if (obj != null) {
                abstractC5075q.mo20446i(abstractC5048h, obj, c5072p, c5087u);
            } else {
                abstractC5068n1.mo20379d(ub2, i10, abstractC5048h);
            }
        }
        return true;
    }

    /* renamed from: n */
    public final <UT, UB> void m20676n(AbstractC5068n1<UT, UB> abstractC5068n1, T t10, InterfaceC5089u1 interfaceC5089u1) {
        abstractC5068n1.mo20394s(abstractC5068n1.mo20382g(t10), interfaceC5089u1);
    }
}
