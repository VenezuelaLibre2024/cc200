package p115hd;

import java.util.Iterator;

/* renamed from: hd.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2482b0 implements Iterator<Long> {
    /* renamed from: a */
    public abstract long mo9882a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(mo9882a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
