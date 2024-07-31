package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: jd.c */
/* loaded from: classes2.dex */
public final class C3280c implements InterfaceC3284g, Serializable {

    /* renamed from: h */
    public final InterfaceC3284g f11446h;

    /* renamed from: i */
    public final InterfaceC3284g.b f11447i;

    /* renamed from: jd.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<String, InterfaceC3284g.b, String> {

        /* renamed from: h */
        public static final a f11448h = new a();

        public a() {
            super(2);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, InterfaceC3284g.b bVar) {
            C4753m.m18653f(str, "acc");
            C4753m.m18653f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C3280c(InterfaceC3284g interfaceC3284g, InterfaceC3284g.b bVar) {
        C4753m.m18653f(interfaceC3284g, "left");
        C4753m.m18653f(bVar, "element");
        this.f11446h = interfaceC3284g;
        this.f11447i = bVar;
    }

    /* renamed from: b */
    public final boolean m11883b(InterfaceC3284g.b bVar) {
        return C4753m.m18648a(mo4368d(bVar.getKey()), bVar);
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: b0 */
    public InterfaceC3284g mo4367b0(InterfaceC3284g.c<?> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        if (this.f11447i.mo4368d(cVar) != null) {
            return this.f11446h;
        }
        InterfaceC3284g mo4367b0 = this.f11446h.mo4367b0(cVar);
        return mo4367b0 == this.f11446h ? this : mo4367b0 == C3285h.f11452h ? this.f11447i : new C3280c(mo4367b0, this.f11447i);
    }

    /* renamed from: c */
    public final boolean m11884c(C3280c c3280c) {
        while (m11883b(c3280c.f11447i)) {
            InterfaceC3284g interfaceC3284g = c3280c.f11446h;
            if (!(interfaceC3284g instanceof C3280c)) {
                C4753m.m18651d(interfaceC3284g, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m11883b((InterfaceC3284g.b) interfaceC3284g);
            }
            c3280c = (C3280c) interfaceC3284g;
        }
        return false;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: d */
    public <E extends InterfaceC3284g.b> E mo4368d(InterfaceC3284g.c<E> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        C3280c c3280c = this;
        while (true) {
            E e10 = (E) c3280c.f11447i.mo4368d(cVar);
            if (e10 != null) {
                return e10;
            }
            InterfaceC3284g interfaceC3284g = c3280c.f11446h;
            if (!(interfaceC3284g instanceof C3280c)) {
                return (E) interfaceC3284g.mo4368d(cVar);
            }
            c3280c = (C3280c) interfaceC3284g;
        }
    }

    /* renamed from: e */
    public final int m11885e() {
        int i10 = 2;
        C3280c c3280c = this;
        while (true) {
            InterfaceC3284g interfaceC3284g = c3280c.f11446h;
            c3280c = interfaceC3284g instanceof C3280c ? (C3280c) interfaceC3284g : null;
            if (c3280c == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: e0 */
    public InterfaceC3284g mo4369e0(InterfaceC3284g interfaceC3284g) {
        return InterfaceC3284g.a.m11890a(this, interfaceC3284g);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3280c) {
                C3280c c3280c = (C3280c) obj;
                if (c3280c.m11885e() != m11885e() || !c3280c.m11884c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f11446h.hashCode() + this.f11447i.hashCode();
    }

    public String toString() {
        return '[' + ((String) mo4370z0("", a.f11448h)) + ']';
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: z0 */
    public <R> R mo4370z0(R r10, InterfaceC4584p<? super R, ? super InterfaceC3284g.b, ? extends R> interfaceC4584p) {
        C4753m.m18653f(interfaceC4584p, "operation");
        return interfaceC4584p.invoke((Object) this.f11446h.mo4370z0(r10, interfaceC4584p), this.f11447i);
    }
}
