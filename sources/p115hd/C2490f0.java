package p115hd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: hd.f0 */
/* loaded from: classes2.dex */
public final class C2490f0<T> extends AbstractC2483c<T> implements RandomAccess {

    /* renamed from: i */
    public final Object[] f9923i;

    /* renamed from: j */
    public final int f9924j;

    /* renamed from: k */
    public int f9925k;

    /* renamed from: l */
    public int f9926l;

    /* renamed from: hd.f0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2481b<T> {

        /* renamed from: j */
        public int f9927j;

        /* renamed from: k */
        public int f9928k;

        /* renamed from: l */
        public final /* synthetic */ C2490f0<T> f9929l;

        public a(C2490f0<T> c2490f0) {
            this.f9929l = c2490f0;
            this.f9927j = c2490f0.size();
            this.f9928k = c2490f0.f9925k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p115hd.AbstractC2481b
        /* renamed from: a */
        public void mo9878a() {
            if (this.f9927j == 0) {
                m9879c();
                return;
            }
            m9880d(this.f9929l.f9923i[this.f9928k]);
            this.f9928k = (this.f9928k + 1) % this.f9929l.f9924j;
            this.f9927j--;
        }
    }

    public C2490f0(int i10) {
        this(new Object[i10], 0);
    }

    public C2490f0(Object[] objArr, int i10) {
        C4753m.m18653f(objArr, "buffer");
        this.f9923i = objArr;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f9924j = objArr.length;
            this.f9926l = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // p115hd.AbstractC2479a
    /* renamed from: a */
    public int mo9875a() {
        return this.f9926l;
    }

    /* renamed from: e */
    public final void m9923e(T t10) {
        if (m9925j()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f9923i[(this.f9925k + size()) % this.f9924j] = t10;
        this.f9926l = size() + 1;
    }

    @Override // p115hd.AbstractC2483c, java.util.List
    public T get(int i10) {
        AbstractC2483c.f9909h.m9883a(i10, size());
        return (T) this.f9923i[(this.f9925k + i10) % this.f9924j];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final C2490f0<T> m9924h(int i10) {
        Object[] array;
        int i11 = this.f9924j;
        int m22906c = C5767k.m22906c(i11 + (i11 >> 1) + 1, i10);
        if (this.f9925k == 0) {
            array = Arrays.copyOf(this.f9923i, m22906c);
            C4753m.m18652e(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[m22906c]);
        }
        return new C2490f0<>(array, size());
    }

    @Override // p115hd.AbstractC2483c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* renamed from: j */
    public final boolean m9925j() {
        return size() == this.f9924j;
    }

    /* renamed from: k */
    public final void m9926k(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f9925k;
            int i12 = (i11 + i10) % this.f9924j;
            if (i11 > i12) {
                C2495i.m9935f(this.f9923i, null, i11, this.f9924j);
                C2495i.m9935f(this.f9923i, null, 0, i12);
            } else {
                C2495i.m9935f(this.f9923i, null, i11, i12);
            }
            this.f9925k = i12;
            this.f9926l = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p115hd.AbstractC2479a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // p115hd.AbstractC2479a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C4753m.m18653f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            C4753m.m18652e(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f9925k; i11 < size && i12 < this.f9924j; i12++) {
            tArr[i11] = this.f9923i[i12];
            i11++;
        }
        while (i11 < size) {
            tArr[i11] = this.f9923i[i10];
            i11++;
            i10++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
