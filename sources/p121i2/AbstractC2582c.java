package p121i2;

import java.util.ArrayList;
import java.util.List;
import p104h2.InterfaceC2282a;
import p135j2.AbstractC3212d;
import p165l2.C3420p;

/* renamed from: i2.c */
/* loaded from: classes.dex */
public abstract class AbstractC2582c<T> implements InterfaceC2282a<T> {

    /* renamed from: a */
    public final List<String> f10139a = new ArrayList();

    /* renamed from: b */
    public T f10140b;

    /* renamed from: c */
    public AbstractC3212d<T> f10141c;

    /* renamed from: d */
    public a f10142d;

    /* renamed from: i2.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo9289a(List<String> list);

        /* renamed from: b */
        void mo9290b(List<String> list);
    }

    public AbstractC2582c(AbstractC3212d<T> abstractC3212d) {
        this.f10141c = abstractC3212d;
    }

    @Override // p104h2.InterfaceC2282a
    /* renamed from: a */
    public void mo9284a(T t10) {
        this.f10140b = t10;
        m10345h(this.f10142d, t10);
    }

    /* renamed from: b */
    public abstract boolean mo10337b(C3420p c3420p);

    /* renamed from: c */
    public abstract boolean mo10338c(T t10);

    /* renamed from: d */
    public boolean m10341d(String str) {
        T t10 = this.f10140b;
        return t10 != null && mo10338c(t10) && this.f10139a.contains(str);
    }

    /* renamed from: e */
    public void m10342e(Iterable<C3420p> iterable) {
        this.f10139a.clear();
        for (C3420p c3420p : iterable) {
            if (mo10337b(c3420p)) {
                this.f10139a.add(c3420p.f12010a);
            }
        }
        if (this.f10139a.isEmpty()) {
            this.f10141c.m11434c(this);
        } else {
            this.f10141c.m11433a(this);
        }
        m10345h(this.f10142d, this.f10140b);
    }

    /* renamed from: f */
    public void m10343f() {
        if (this.f10139a.isEmpty()) {
            return;
        }
        this.f10139a.clear();
        this.f10141c.m11434c(this);
    }

    /* renamed from: g */
    public void m10344g(a aVar) {
        if (this.f10142d != aVar) {
            this.f10142d = aVar;
            m10345h(aVar, this.f10140b);
        }
    }

    /* renamed from: h */
    public final void m10345h(a aVar, T t10) {
        if (this.f10139a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || mo10338c(t10)) {
            aVar.mo9290b(this.f10139a);
        } else {
            aVar.mo9289a(this.f10139a);
        }
    }
}
