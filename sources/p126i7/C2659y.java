package p126i7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import p126i7.AbstractC2653v;
import p126i7.AbstractC2655w;

/* renamed from: i7.y */
/* loaded from: classes.dex */
public class C2659y<K, V> extends AbstractC2655w<K, V> {

    /* renamed from: m */
    public final transient AbstractC2657x<V> f10399m;

    /* renamed from: i7.y$a */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends AbstractC2655w.b<K, V> {
        /* renamed from: a */
        public C2659y<K, V> m10833a() {
            Collection entrySet = this.f10393a.entrySet();
            Comparator<? super K> comparator = this.f10394b;
            if (comparator != null) {
                entrySet = AbstractC2642p0.m10724a(comparator).m10727d().m10726b(entrySet);
            }
            return C2659y.m10830m(entrySet, this.f10395c);
        }
    }

    public C2659y(AbstractC2653v<K, AbstractC2657x<V>> abstractC2653v, int i10, Comparator<? super V> comparator) {
        super(abstractC2653v, i10);
        this.f10399m = m10829l(comparator);
    }

    /* renamed from: l */
    public static <V> AbstractC2657x<V> m10829l(Comparator<? super V> comparator) {
        return comparator == null ? AbstractC2657x.m10822s() : AbstractC2661z.m10847I(comparator);
    }

    /* renamed from: m */
    public static <K, V> C2659y<K, V> m10830m(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m10831n();
        }
        AbstractC2653v.a aVar = new AbstractC2653v.a(collection.size());
        int i10 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            AbstractC2657x m10832o = m10832o(comparator, entry.getValue());
            if (!m10832o.isEmpty()) {
                aVar.m10810f(key, m10832o);
                i10 += m10832o.size();
            }
        }
        return new C2659y<>(aVar.m10807c(), i10, comparator);
    }

    /* renamed from: n */
    public static <K, V> C2659y<K, V> m10831n() {
        return C2639o.f10336n;
    }

    /* renamed from: o */
    public static <V> AbstractC2657x<V> m10832o(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? AbstractC2657x.m10820n(collection) : AbstractC2661z.m10846C(comparator, collection);
    }
}
