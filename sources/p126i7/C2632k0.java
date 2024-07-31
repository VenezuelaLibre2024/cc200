package p126i7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p109h7.C2432o;
import p109h7.InterfaceC2438u;

/* renamed from: i7.k0 */
/* loaded from: classes.dex */
public final class C2632k0 {

    /* renamed from: i7.k0$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends AbstractC2612c<K, V> {

        /* renamed from: m */
        public transient InterfaceC2438u<? extends List<V>> f10329m;

        public a(Map<K, Collection<V>> map, InterfaceC2438u<? extends List<V>> interfaceC2438u) {
            super(map);
            this.f10329m = (InterfaceC2438u) C2432o.m9704j(interfaceC2438u);
        }

        @Override // p126i7.AbstractC2621f
        /* renamed from: c */
        public Map<K, Collection<V>> mo10596c() {
            return m10549q();
        }

        @Override // p126i7.AbstractC2621f
        /* renamed from: d */
        public Set<K> mo10597d() {
            return m10550r();
        }

        @Override // p126i7.AbstractC2615d
        /* renamed from: x */
        public List<V> mo10547o() {
            return this.f10329m.get();
        }
    }

    /* renamed from: a */
    public static boolean m10686a(InterfaceC2626h0<?, ?> interfaceC2626h0, Object obj) {
        if (obj == interfaceC2626h0) {
            return true;
        }
        if (obj instanceof InterfaceC2626h0) {
            return interfaceC2626h0.mo10514a().equals(((InterfaceC2626h0) obj).mo10514a());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> InterfaceC2616d0<K, V> m10687b(Map<K, Collection<V>> map, InterfaceC2438u<? extends List<V>> interfaceC2438u) {
        return new a(map, interfaceC2438u);
    }
}
