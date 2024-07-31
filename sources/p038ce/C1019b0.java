package p038ce;

import gd.C2245s;
import sd.InterfaceC4580l;
import td.C4747g;
import td.C4753m;

/* renamed from: ce.b0 */
/* loaded from: classes2.dex */
public final class C1019b0 {

    /* renamed from: a */
    public final Object f3966a;

    /* renamed from: b */
    public final AbstractC1068l f3967b;

    /* renamed from: c */
    public final InterfaceC4580l<Throwable, C2245s> f3968c;

    /* renamed from: d */
    public final Object f3969d;

    /* renamed from: e */
    public final Throwable f3970e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1019b0(Object obj, AbstractC1068l abstractC1068l, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, Object obj2, Throwable th) {
        this.f3966a = obj;
        this.f3967b = abstractC1068l;
        this.f3968c = interfaceC4580l;
        this.f3969d = obj2;
        this.f3970e = th;
    }

    public /* synthetic */ C1019b0(Object obj, AbstractC1068l abstractC1068l, InterfaceC4580l interfaceC4580l, Object obj2, Throwable th, int i10, C4747g c4747g) {
        this(obj, (i10 & 2) != 0 ? null : abstractC1068l, (i10 & 4) != 0 ? null : interfaceC4580l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C1019b0 m4261b(C1019b0 c1019b0, Object obj, AbstractC1068l abstractC1068l, InterfaceC4580l interfaceC4580l, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c1019b0.f3966a;
        }
        if ((i10 & 2) != 0) {
            abstractC1068l = c1019b0.f3967b;
        }
        AbstractC1068l abstractC1068l2 = abstractC1068l;
        if ((i10 & 4) != 0) {
            interfaceC4580l = c1019b0.f3968c;
        }
        InterfaceC4580l interfaceC4580l2 = interfaceC4580l;
        if ((i10 & 8) != 0) {
            obj2 = c1019b0.f3969d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = c1019b0.f3970e;
        }
        return c1019b0.m4262a(obj, abstractC1068l2, interfaceC4580l2, obj4, th);
    }

    /* renamed from: a */
    public final C1019b0 m4262a(Object obj, AbstractC1068l abstractC1068l, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, Object obj2, Throwable th) {
        return new C1019b0(obj, abstractC1068l, interfaceC4580l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m4263c() {
        return this.f3970e != null;
    }

    /* renamed from: d */
    public final void m4264d(C1084p<?> c1084p, Throwable th) {
        AbstractC1068l abstractC1068l = this.f3967b;
        if (abstractC1068l != null) {
            c1084p.m4545p(abstractC1068l, th);
        }
        InterfaceC4580l<Throwable, C2245s> interfaceC4580l = this.f3968c;
        if (interfaceC4580l != null) {
            c1084p.m4546q(interfaceC4580l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1019b0)) {
            return false;
        }
        C1019b0 c1019b0 = (C1019b0) obj;
        return C4753m.m18648a(this.f3966a, c1019b0.f3966a) && C4753m.m18648a(this.f3967b, c1019b0.f3967b) && C4753m.m18648a(this.f3968c, c1019b0.f3968c) && C4753m.m18648a(this.f3969d, c1019b0.f3969d) && C4753m.m18648a(this.f3970e, c1019b0.f3970e);
    }

    public int hashCode() {
        Object obj = this.f3966a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1068l abstractC1068l = this.f3967b;
        int hashCode2 = (hashCode + (abstractC1068l == null ? 0 : abstractC1068l.hashCode())) * 31;
        InterfaceC4580l<Throwable, C2245s> interfaceC4580l = this.f3968c;
        int hashCode3 = (hashCode2 + (interfaceC4580l == null ? 0 : interfaceC4580l.hashCode())) * 31;
        Object obj2 = this.f3969d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3970e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f3966a + ", cancelHandler=" + this.f3967b + ", onCancellation=" + this.f3968c + ", idempotentResume=" + this.f3969d + ", cancelCause=" + this.f3970e + ')';
    }
}
