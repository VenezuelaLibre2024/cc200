package p109h7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: h7.q */
/* loaded from: classes.dex */
public final class C2434q {

    /* renamed from: h7.q$b */
    /* loaded from: classes.dex */
    public static class b<T> implements InterfaceC2433p<T>, Serializable {

        /* renamed from: h */
        public final List<? extends InterfaceC2433p<? super T>> f9762h;

        public b(List<? extends InterfaceC2433p<? super T>> list) {
            this.f9762h = list;
        }

        @Override // p109h7.InterfaceC2433p
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f9762h.size(); i10++) {
                if (!this.f9762h.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9762h.equals(((b) obj).f9762h);
            }
            return false;
        }

        public int hashCode() {
            return this.f9762h.hashCode() + 306654252;
        }

        public String toString() {
            return C2434q.m9715d("and", this.f9762h);
        }
    }

    /* renamed from: b */
    public static <T> InterfaceC2433p<T> m9713b(InterfaceC2433p<? super T> interfaceC2433p, InterfaceC2433p<? super T> interfaceC2433p2) {
        return new b(m9714c((InterfaceC2433p) C2432o.m9704j(interfaceC2433p), (InterfaceC2433p) C2432o.m9704j(interfaceC2433p2)));
    }

    /* renamed from: c */
    public static <T> List<InterfaceC2433p<? super T>> m9714c(InterfaceC2433p<? super T> interfaceC2433p, InterfaceC2433p<? super T> interfaceC2433p2) {
        return Arrays.asList(interfaceC2433p, interfaceC2433p2);
    }

    /* renamed from: d */
    public static String m9715d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
