package p115hd;

import java.util.Iterator;

/* renamed from: hd.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2480a0 implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo9877a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(mo9877a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
