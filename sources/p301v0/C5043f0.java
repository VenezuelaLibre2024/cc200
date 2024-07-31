package p301v0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: v0.f0 */
/* loaded from: classes.dex */
public class C5043f0 extends AbstractC5033c<String> implements InterfaceC5046g0, RandomAccess {

    /* renamed from: j */
    public static final C5043f0 f18918j;

    /* renamed from: k */
    public static final InterfaceC5046g0 f18919k;

    /* renamed from: i */
    public final List<Object> f18920i;

    static {
        C5043f0 c5043f0 = new C5043f0();
        f18918j = c5043f0;
        c5043f0.mo19803f();
        f18919k = c5043f0;
    }

    public C5043f0() {
        this(10);
    }

    public C5043f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public C5043f0(ArrayList<Object> arrayList) {
        this.f18920i = arrayList;
    }

    /* renamed from: c */
    public static String m19927c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC5048h ? ((AbstractC5048h) obj).m19970z() : C5028a0.m19798j((byte[]) obj);
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: A */
    public InterfaceC5046g0 mo19928A() {
        return mo19802H() ? new C5077q1(this) : this;
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: F */
    public Object mo19929F(int i10) {
        return this.f18920i.get(i10);
    }

    @Override // p301v0.AbstractC5033c, p301v0.C5028a0.i
    /* renamed from: H */
    public /* bridge */ /* synthetic */ boolean mo19802H() {
        return super.mo19802H();
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        m19821a();
        if (collection instanceof InterfaceC5046g0) {
            collection = ((InterfaceC5046g0) collection).mo19936r();
        }
        boolean addAll = this.f18920i.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        m19821a();
        this.f18920i.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m19821a();
        this.f18920i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f18920i.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5048h) {
            AbstractC5048h abstractC5048h = (AbstractC5048h) obj;
            String m19970z = abstractC5048h.m19970z();
            if (abstractC5048h.mo19961n()) {
                this.f18920i.set(i10, m19970z);
            }
            return m19970z;
        }
        byte[] bArr = (byte[]) obj;
        String m19798j = C5028a0.m19798j(bArr);
        if (C5028a0.m19795g(bArr)) {
            this.f18920i.set(i10, m19798j);
        }
        return m19798j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5043f0 mo19804i(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f18920i);
        return new C5043f0((ArrayList<Object>) arrayList);
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        m19821a();
        Object remove = this.f18920i.remove(i10);
        ((AbstractList) this).modCount++;
        return m19927c(remove);
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        m19821a();
        return m19927c(this.f18920i.set(i10, str));
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: l */
    public void mo19935l(AbstractC5048h abstractC5048h) {
        m19821a();
        this.f18920i.add(abstractC5048h);
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: r */
    public List<?> mo19936r() {
        return Collections.unmodifiableList(this.f18920i);
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18920i.size();
    }
}
