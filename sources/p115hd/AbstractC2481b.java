package p115hd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hd.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2481b<T> implements Iterator<T> {

    /* renamed from: h */
    public EnumC2498j0 f9906h = EnumC2498j0.NotReady;

    /* renamed from: i */
    public T f9907i;

    /* renamed from: hd.b$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9908a;

        static {
            int[] iArr = new int[EnumC2498j0.values().length];
            try {
                iArr[EnumC2498j0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2498j0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9908a = iArr;
        }
    }

    /* renamed from: a */
    public abstract void mo9878a();

    /* renamed from: c */
    public final void m9879c() {
        this.f9906h = EnumC2498j0.Done;
    }

    /* renamed from: d */
    public final void m9880d(T t10) {
        this.f9907i = t10;
        this.f9906h = EnumC2498j0.Ready;
    }

    /* renamed from: e */
    public final boolean m9881e() {
        this.f9906h = EnumC2498j0.Failed;
        mo9878a();
        return this.f9906h == EnumC2498j0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        EnumC2498j0 enumC2498j0 = this.f9906h;
        if (!(enumC2498j0 != EnumC2498j0.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f9908a[enumC2498j0.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m9881e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9906h = EnumC2498j0.NotReady;
        return this.f9907i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
