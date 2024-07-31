package p126i7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p109h7.C2432o;
import p109h7.InterfaceC2438u;

/* renamed from: i7.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC2630j0<K0, V0> {

    /* renamed from: i7.j0$a */
    /* loaded from: classes.dex */
    public class a extends d<K0> {

        /* renamed from: a */
        public final /* synthetic */ Comparator f10302a;

        public a(Comparator comparator) {
            this.f10302a = comparator;
        }

        @Override // p126i7.AbstractC2630j0.d
        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo10626c() {
            return new TreeMap(this.f10302a);
        }
    }

    /* renamed from: i7.j0$b */
    /* loaded from: classes.dex */
    public static final class b<V> implements InterfaceC2438u<List<V>>, Serializable {

        /* renamed from: h */
        public final int f10303h;

        public b(int i10) {
            this.f10303h = C2627i.m10619b(i10, "expectedValuesPerKey");
        }

        @Override // p109h7.InterfaceC2438u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f10303h);
        }
    }

    /* renamed from: i7.j0$c */
    /* loaded from: classes.dex */
    public static abstract class c<K0, V0> extends AbstractC2630j0<K0, V0> {
        public c() {
            super(null);
        }

        /* renamed from: c */
        public abstract <K extends K0, V extends V0> InterfaceC2616d0<K, V> mo10628c();
    }

    /* renamed from: i7.j0$d */
    /* loaded from: classes.dex */
    public static abstract class d<K0> {

        /* renamed from: i7.j0$d$a */
        /* loaded from: classes.dex */
        public class a extends c<K0, Object> {

            /* renamed from: a */
            public final /* synthetic */ int f10304a;

            public a(int i10) {
                this.f10304a = i10;
            }

            @Override // p126i7.AbstractC2630j0.c
            /* renamed from: c */
            public <K extends K0, V> InterfaceC2616d0<K, V> mo10628c() {
                return C2632k0.m10687b(d.this.mo10626c(), new b(this.f10304a));
            }
        }

        /* renamed from: a */
        public c<K0, Object> m10629a() {
            return m10630b(2);
        }

        /* renamed from: b */
        public c<K0, Object> m10630b(int i10) {
            C2627i.m10619b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo10626c();
    }

    public AbstractC2630j0() {
    }

    public /* synthetic */ AbstractC2630j0(C2628i0 c2628i0) {
        this();
    }

    /* renamed from: a */
    public static d<Comparable> m10624a() {
        return m10625b(AbstractC2642p0.m10725c());
    }

    /* renamed from: b */
    public static <K0> d<K0> m10625b(Comparator<K0> comparator) {
        C2432o.m9704j(comparator);
        return new a(comparator);
    }
}
