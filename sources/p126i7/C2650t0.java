package p126i7;

/* renamed from: i7.t0 */
/* loaded from: classes.dex */
public final class C2650t0<E> extends AbstractC2657x<E> {

    /* renamed from: o */
    public static final Object[] f10360o;

    /* renamed from: p */
    public static final C2650t0<Object> f10361p;

    /* renamed from: j */
    public final transient Object[] f10362j;

    /* renamed from: k */
    public final transient int f10363k;

    /* renamed from: l */
    public final transient Object[] f10364l;

    /* renamed from: m */
    public final transient int f10365m;

    /* renamed from: n */
    public final transient int f10366n;

    static {
        Object[] objArr = new Object[0];
        f10360o = objArr;
        f10361p = new C2650t0<>(objArr, 0, objArr, 0, 0);
    }

    public C2650t0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f10362j = objArr;
        this.f10363k = i10;
        this.f10364l = objArr2;
        this.f10365m = i11;
        this.f10366n = i12;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        System.arraycopy(this.f10362j, 0, objArr, i10, this.f10366n);
        return i10 + this.f10366n;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: c */
    public Object[] mo10737c() {
        return this.f10362j;
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f10364l;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m10735c = C2645r.m10735c(obj);
        while (true) {
            int i10 = m10735c & this.f10365m;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m10735c = i10 + 1;
        }
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: d */
    public int mo10738d() {
        return this.f10366n;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: e */
    public int mo10739e() {
        return 0;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: h */
    public boolean mo10740h() {
        return false;
    }

    @Override // p126i7.AbstractC2657x, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f10363k;
    }

    @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC2617d1<E> iterator() {
        return mo10741a().iterator();
    }

    @Override // p126i7.AbstractC2657x
    /* renamed from: p */
    public AbstractC2651u<E> mo10760p() {
        return AbstractC2651u.m10765m(this.f10362j, this.f10366n);
    }

    @Override // p126i7.AbstractC2657x
    /* renamed from: q */
    public boolean mo10762q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f10366n;
    }
}
