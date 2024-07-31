package p109h7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: h7.b */
/* loaded from: classes.dex */
public abstract class AbstractC2419b<T> implements Iterator<T> {

    /* renamed from: h */
    public b f9734h = b.NOT_READY;

    /* renamed from: i */
    public T f9735i;

    /* renamed from: h7.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9736a;

        static {
            int[] iArr = new int[b.values().length];
            f9736a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9736a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: h7.b$b */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo9657a();

    /* renamed from: c */
    public final T m9658c() {
        this.f9734h = b.DONE;
        return null;
    }

    /* renamed from: d */
    public final boolean m9659d() {
        this.f9734h = b.FAILED;
        this.f9735i = mo9657a();
        if (this.f9734h == b.DONE) {
            return false;
        }
        this.f9734h = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C2432o.m9709o(this.f9734h != b.FAILED);
        int i10 = a.f9736a[this.f9734h.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m9659d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9734h = b.NOT_READY;
        T t10 = (T) C2427j.m9687a(this.f9735i);
        this.f9735i = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
