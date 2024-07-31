package p126i7;

import p109h7.C2432o;

/* renamed from: i7.z0 */
/* loaded from: classes.dex */
public final class C2662z0<E> extends AbstractC2657x<E> {

    /* renamed from: j */
    public final transient E f10406j;

    public C2662z0(E e10) {
        this.f10406j = (E) C2432o.m9704j(e10);
    }

    @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s
    /* renamed from: a */
    public AbstractC2651u<E> mo10741a() {
        return AbstractC2651u.m10771v(this.f10406j);
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        objArr[i10] = this.f10406j;
        return i10 + 1;
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f10406j.equals(obj);
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: h */
    public boolean mo10740h() {
        return false;
    }

    @Override // p126i7.AbstractC2657x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10406j.hashCode();
    }

    @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC2617d1<E> iterator() {
        return C2613c0.m10534r(this.f10406j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f10406j.toString() + ']';
    }
}
