package p364z3;

import p126i7.AbstractC2617d1;
import p126i7.AbstractC2651u;
import p222p5.C4015a0;

/* renamed from: z3.f */
/* loaded from: classes.dex */
public final class C5967f implements InterfaceC5962a {

    /* renamed from: a */
    public final AbstractC2651u<InterfaceC5962a> f22170a;

    /* renamed from: b */
    public final int f22171b;

    public C5967f(int i10, AbstractC2651u<InterfaceC5962a> abstractC2651u) {
        this.f22171b = i10;
        this.f22170a = abstractC2651u;
    }

    /* renamed from: a */
    public static InterfaceC5962a m23913a(int i10, int i11, C4015a0 c4015a0) {
        switch (i10) {
            case 1718776947:
                return C5968g.m23919d(i11, c4015a0);
            case 1751742049:
                return C5964c.m23893b(c4015a0);
            case 1752331379:
                return C5965d.m23895c(c4015a0);
            case 1852994675:
                return C5969h.m23921a(c4015a0);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C5967f m23914c(int i10, C4015a0 c4015a0) {
        AbstractC2651u.a aVar = new AbstractC2651u.a();
        int m15232g = c4015a0.m15232g();
        int i11 = -2;
        while (c4015a0.m15226a() > 8) {
            int m15245t = c4015a0.m15245t();
            int m15231f = c4015a0.m15231f() + c4015a0.m15245t();
            c4015a0.m15222S(m15231f);
            InterfaceC5962a m23914c = m15245t == 1414744396 ? m23914c(c4015a0.m15245t(), c4015a0) : m23913a(m15245t, i11, c4015a0);
            if (m23914c != null) {
                if (m23914c.getType() == 1752331379) {
                    i11 = ((C5965d) m23914c).m23897b();
                }
                aVar.mo10749a(m23914c);
            }
            c4015a0.m15223T(m15231f);
            c4015a0.m15222S(m15232g);
        }
        return new C5967f(i10, aVar.m10784k());
    }

    /* renamed from: b */
    public <T extends InterfaceC5962a> T m23915b(Class<T> cls) {
        AbstractC2617d1<InterfaceC5962a> it = this.f22170a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // p364z3.InterfaceC5962a
    public int getType() {
        return this.f22171b;
    }
}
