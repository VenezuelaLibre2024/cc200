package p126i7;

import java.util.Comparator;
import p155k7.C3364a;
import p155k7.C3368e;
import p155k7.C3370g;

/* renamed from: i7.n */
/* loaded from: classes.dex */
public abstract class AbstractC2637n {

    /* renamed from: a */
    public static final AbstractC2637n f10332a = new a();

    /* renamed from: b */
    public static final AbstractC2637n f10333b = new b(-1);

    /* renamed from: c */
    public static final AbstractC2637n f10334c = new b(1);

    /* renamed from: i7.n$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2637n {
        public a() {
            super(null);
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: d */
        public AbstractC2637n mo10706d(int i10, int i11) {
            return m10712k(C3368e.m12526e(i10, i11));
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: e */
        public AbstractC2637n mo10707e(long j10, long j11) {
            return m10712k(C3370g.m12537a(j10, j11));
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: f */
        public <T> AbstractC2637n mo10708f(T t10, T t11, Comparator<T> comparator) {
            return m10712k(comparator.compare(t10, t11));
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: g */
        public AbstractC2637n mo10709g(boolean z10, boolean z11) {
            return m10712k(C3364a.m12516a(z10, z11));
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: h */
        public AbstractC2637n mo10710h(boolean z10, boolean z11) {
            return m10712k(C3364a.m12516a(z11, z10));
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: i */
        public int mo10711i() {
            return 0;
        }

        /* renamed from: k */
        public AbstractC2637n m10712k(int i10) {
            return i10 < 0 ? AbstractC2637n.f10333b : i10 > 0 ? AbstractC2637n.f10334c : AbstractC2637n.f10332a;
        }
    }

    /* renamed from: i7.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2637n {

        /* renamed from: d */
        public final int f10335d;

        public b(int i10) {
            super(null);
            this.f10335d = i10;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: d */
        public AbstractC2637n mo10706d(int i10, int i11) {
            return this;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: e */
        public AbstractC2637n mo10707e(long j10, long j11) {
            return this;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: f */
        public <T> AbstractC2637n mo10708f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: g */
        public AbstractC2637n mo10709g(boolean z10, boolean z11) {
            return this;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: h */
        public AbstractC2637n mo10710h(boolean z10, boolean z11) {
            return this;
        }

        @Override // p126i7.AbstractC2637n
        /* renamed from: i */
        public int mo10711i() {
            return this.f10335d;
        }
    }

    public AbstractC2637n() {
    }

    public /* synthetic */ AbstractC2637n(a aVar) {
        this();
    }

    /* renamed from: j */
    public static AbstractC2637n m10705j() {
        return f10332a;
    }

    /* renamed from: d */
    public abstract AbstractC2637n mo10706d(int i10, int i11);

    /* renamed from: e */
    public abstract AbstractC2637n mo10707e(long j10, long j11);

    /* renamed from: f */
    public abstract <T> AbstractC2637n mo10708f(T t10, T t11, Comparator<T> comparator);

    /* renamed from: g */
    public abstract AbstractC2637n mo10709g(boolean z10, boolean z11);

    /* renamed from: h */
    public abstract AbstractC2637n mo10710h(boolean z10, boolean z11);

    /* renamed from: i */
    public abstract int mo10711i();
}
