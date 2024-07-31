package p115hd;

import java.util.Iterator;

/* renamed from: hd.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2500l implements Iterator<Character> {
    /* renamed from: a */
    public abstract char mo9984a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(mo9984a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
