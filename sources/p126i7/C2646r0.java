package p126i7;

import java.util.Objects;
import p109h7.C2432o;

/* renamed from: i7.r0 */
/* loaded from: classes.dex */
public class C2646r0<E> extends AbstractC2651u<E> {

    /* renamed from: l */
    public static final AbstractC2651u<Object> f10337l = new C2646r0(new Object[0], 0);

    /* renamed from: j */
    public final transient Object[] f10338j;

    /* renamed from: k */
    public final transient int f10339k;

    public C2646r0(Object[] objArr, int i10) {
        this.f10338j = objArr;
        this.f10339k = i10;
    }

    @Override // p126i7.AbstractC2651u, p126i7.AbstractC2647s
    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        System.arraycopy(this.f10338j, 0, objArr, i10, this.f10339k);
        return i10 + this.f10339k;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: c */
    public Object[] mo10737c() {
        return this.f10338j;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: d */
    public int mo10738d() {
        return this.f10339k;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: e */
    public int mo10739e() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i10) {
        C2432o.m9702h(i10, this.f10339k);
        E e10 = (E) this.f10338j[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: h */
    public boolean mo10740h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10339k;
    }
}
