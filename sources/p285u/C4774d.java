package p285u;

/* renamed from: u.d */
/* loaded from: classes.dex */
public class C4774d<E> implements Cloneable {

    /* renamed from: l */
    public static final Object f17771l = new Object();

    /* renamed from: h */
    public boolean f17772h;

    /* renamed from: i */
    public long[] f17773i;

    /* renamed from: j */
    public Object[] f17774j;

    /* renamed from: k */
    public int f17775k;

    public C4774d() {
        this(10);
    }

    public C4774d(int i10) {
        this.f17772h = false;
        if (i10 == 0) {
            this.f17773i = C4773c.f17769b;
            this.f17774j = C4773c.f17770c;
        } else {
            int m18729f = C4773c.m18729f(i10);
            this.f17773i = new long[m18729f];
            this.f17774j = new Object[m18729f];
        }
    }

    /* renamed from: b */
    public void m18730b(long j10, E e10) {
        int i10 = this.f17775k;
        if (i10 != 0 && j10 <= this.f17773i[i10 - 1]) {
            m18738l(j10, e10);
            return;
        }
        if (this.f17772h && i10 >= this.f17773i.length) {
            m18733f();
        }
        int i11 = this.f17775k;
        if (i11 >= this.f17773i.length) {
            int m18729f = C4773c.m18729f(i11 + 1);
            long[] jArr = new long[m18729f];
            Object[] objArr = new Object[m18729f];
            long[] jArr2 = this.f17773i;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f17774j;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17773i = jArr;
            this.f17774j = objArr;
        }
        this.f17773i[i11] = j10;
        this.f17774j[i11] = e10;
        this.f17775k = i11 + 1;
    }

    /* renamed from: c */
    public void m18731c() {
        int i10 = this.f17775k;
        Object[] objArr = this.f17774j;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f17775k = 0;
        this.f17772h = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4774d<E> clone() {
        try {
            C4774d<E> c4774d = (C4774d) super.clone();
            c4774d.f17773i = (long[]) this.f17773i.clone();
            c4774d.f17774j = (Object[]) this.f17774j.clone();
            return c4774d;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: f */
    public final void m18733f() {
        int i10 = this.f17775k;
        long[] jArr = this.f17773i;
        Object[] objArr = this.f17774j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f17771l) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f17772h = false;
        this.f17775k = i11;
    }

    /* renamed from: g */
    public E m18734g(long j10) {
        return m18735h(j10, null);
    }

    /* renamed from: h */
    public E m18735h(long j10, E e10) {
        int m18725b = C4773c.m18725b(this.f17773i, this.f17775k, j10);
        if (m18725b >= 0) {
            Object[] objArr = this.f17774j;
            if (objArr[m18725b] != f17771l) {
                return (E) objArr[m18725b];
            }
        }
        return e10;
    }

    /* renamed from: i */
    public int m18736i(long j10) {
        if (this.f17772h) {
            m18733f();
        }
        return C4773c.m18725b(this.f17773i, this.f17775k, j10);
    }

    /* renamed from: k */
    public long m18737k(int i10) {
        if (this.f17772h) {
            m18733f();
        }
        return this.f17773i[i10];
    }

    /* renamed from: l */
    public void m18738l(long j10, E e10) {
        int m18725b = C4773c.m18725b(this.f17773i, this.f17775k, j10);
        if (m18725b >= 0) {
            this.f17774j[m18725b] = e10;
            return;
        }
        int i10 = ~m18725b;
        int i11 = this.f17775k;
        if (i10 < i11) {
            Object[] objArr = this.f17774j;
            if (objArr[i10] == f17771l) {
                this.f17773i[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f17772h && i11 >= this.f17773i.length) {
            m18733f();
            i10 = ~C4773c.m18725b(this.f17773i, this.f17775k, j10);
        }
        int i12 = this.f17775k;
        if (i12 >= this.f17773i.length) {
            int m18729f = C4773c.m18729f(i12 + 1);
            long[] jArr = new long[m18729f];
            Object[] objArr2 = new Object[m18729f];
            long[] jArr2 = this.f17773i;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f17774j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17773i = jArr;
            this.f17774j = objArr2;
        }
        int i13 = this.f17775k;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f17773i;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f17774j;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f17775k - i10);
        }
        this.f17773i[i10] = j10;
        this.f17774j[i10] = e10;
        this.f17775k++;
    }

    /* renamed from: m */
    public void m18739m(long j10) {
        int m18725b = C4773c.m18725b(this.f17773i, this.f17775k, j10);
        if (m18725b >= 0) {
            Object[] objArr = this.f17774j;
            Object obj = objArr[m18725b];
            Object obj2 = f17771l;
            if (obj != obj2) {
                objArr[m18725b] = obj2;
                this.f17772h = true;
            }
        }
    }

    /* renamed from: n */
    public int m18740n() {
        if (this.f17772h) {
            m18733f();
        }
        return this.f17775k;
    }

    /* renamed from: o */
    public E m18741o(int i10) {
        if (this.f17772h) {
            m18733f();
        }
        return (E) this.f17774j[i10];
    }

    public String toString() {
        if (m18740n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17775k * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17775k; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m18737k(i10));
            sb2.append('=');
            E m18741o = m18741o(i10);
            if (m18741o != this) {
                sb2.append(m18741o);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
