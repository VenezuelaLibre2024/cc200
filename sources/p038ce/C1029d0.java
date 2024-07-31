package p038ce;

import gd.C2245s;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: ce.d0 */
/* loaded from: classes2.dex */
public final class C1029d0 {

    /* renamed from: a */
    public final Object f3982a;

    /* renamed from: b */
    public final InterfaceC4580l<Throwable, C2245s> f3983b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1029d0(Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
        this.f3982a = obj;
        this.f3983b = interfaceC4580l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1029d0)) {
            return false;
        }
        C1029d0 c1029d0 = (C1029d0) obj;
        return C4753m.m18648a(this.f3982a, c1029d0.f3982a) && C4753m.m18648a(this.f3983b, c1029d0.f3983b);
    }

    public int hashCode() {
        Object obj = this.f3982a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f3983b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f3982a + ", onCancellation=" + this.f3983b + ')';
    }
}
