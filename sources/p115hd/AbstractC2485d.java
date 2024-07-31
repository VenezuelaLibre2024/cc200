package p115hd;

import java.util.AbstractList;

/* renamed from: hd.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2485d<E> extends AbstractList<E> {
    /* renamed from: a */
    public abstract int mo9890a();

    /* renamed from: b */
    public abstract E mo9891b(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return mo9891b(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo9890a();
    }
}
