package p126i7;

import java.util.NoSuchElementException;
import p109h7.C2432o;

/* renamed from: i7.b */
/* loaded from: classes.dex */
public abstract class AbstractC2609b<T> extends AbstractC2617d1<T> {

    /* renamed from: h */
    public b f10237h = b.NOT_READY;

    /* renamed from: i */
    public T f10238i;

    /* renamed from: i7.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10239a;

        static {
            int[] iArr = new int[b.values().length];
            f10239a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10239a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: i7.b$b */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract T mo10498a();

    /* renamed from: c */
    public final T m10499c() {
        this.f10237h = b.DONE;
        return null;
    }

    /* renamed from: d */
    public final boolean m10500d() {
        this.f10237h = b.FAILED;
        this.f10238i = mo10498a();
        if (this.f10237h == b.DONE) {
            return false;
        }
        this.f10237h = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C2432o.m9709o(this.f10237h != b.FAILED);
        int i10 = a.f10239a[this.f10237h.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m10500d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10237h = b.NOT_READY;
        T t10 = (T) C2638n0.m10713a(this.f10238i);
        this.f10238i = null;
        return t10;
    }
}
