package p285u;

/* renamed from: u.h */
/* loaded from: classes.dex */
public class C4778h<E> implements Cloneable {

    /* renamed from: l */
    public static final Object f17798l = new Object();

    /* renamed from: h */
    public boolean f17799h;

    /* renamed from: i */
    public int[] f17800i;

    /* renamed from: j */
    public Object[] f17801j;

    /* renamed from: k */
    public int f17802k;

    public C4778h() {
        this(10);
    }

    public C4778h(int i10) {
        this.f17799h = false;
        if (i10 == 0) {
            this.f17800i = C4773c.f17768a;
            this.f17801j = C4773c.f17770c;
        } else {
            int m18728e = C4773c.m18728e(i10);
            this.f17800i = new int[m18728e];
            this.f17801j = new Object[m18728e];
        }
    }

    /* renamed from: b */
    public void m18766b(int i10, E e10) {
        int i11 = this.f17802k;
        if (i11 != 0 && i10 <= this.f17800i[i11 - 1]) {
            m18773k(i10, e10);
            return;
        }
        if (this.f17799h && i11 >= this.f17800i.length) {
            m18769f();
        }
        int i12 = this.f17802k;
        if (i12 >= this.f17800i.length) {
            int m18728e = C4773c.m18728e(i12 + 1);
            int[] iArr = new int[m18728e];
            Object[] objArr = new Object[m18728e];
            int[] iArr2 = this.f17800i;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17801j;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17800i = iArr;
            this.f17801j = objArr;
        }
        this.f17800i[i12] = i10;
        this.f17801j[i12] = e10;
        this.f17802k = i12 + 1;
    }

    /* renamed from: c */
    public void m18767c() {
        int i10 = this.f17802k;
        Object[] objArr = this.f17801j;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f17802k = 0;
        this.f17799h = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4778h<E> clone() {
        try {
            C4778h<E> c4778h = (C4778h) super.clone();
            c4778h.f17800i = (int[]) this.f17800i.clone();
            c4778h.f17801j = (Object[]) this.f17801j.clone();
            return c4778h;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: f */
    public final void m18769f() {
        int i10 = this.f17802k;
        int[] iArr = this.f17800i;
        Object[] objArr = this.f17801j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f17798l) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f17799h = false;
        this.f17802k = i11;
    }

    /* renamed from: g */
    public E m18770g(int i10) {
        return m18771h(i10, null);
    }

    /* renamed from: h */
    public E m18771h(int i10, E e10) {
        int m18724a = C4773c.m18724a(this.f17800i, this.f17802k, i10);
        if (m18724a >= 0) {
            Object[] objArr = this.f17801j;
            if (objArr[m18724a] != f17798l) {
                return (E) objArr[m18724a];
            }
        }
        return e10;
    }

    /* renamed from: i */
    public int m18772i(int i10) {
        if (this.f17799h) {
            m18769f();
        }
        return this.f17800i[i10];
    }

    /* renamed from: k */
    public void m18773k(int i10, E e10) {
        int m18724a = C4773c.m18724a(this.f17800i, this.f17802k, i10);
        if (m18724a >= 0) {
            this.f17801j[m18724a] = e10;
            return;
        }
        int i11 = ~m18724a;
        int i12 = this.f17802k;
        if (i11 < i12) {
            Object[] objArr = this.f17801j;
            if (objArr[i11] == f17798l) {
                this.f17800i[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f17799h && i12 >= this.f17800i.length) {
            m18769f();
            i11 = ~C4773c.m18724a(this.f17800i, this.f17802k, i10);
        }
        int i13 = this.f17802k;
        if (i13 >= this.f17800i.length) {
            int m18728e = C4773c.m18728e(i13 + 1);
            int[] iArr = new int[m18728e];
            Object[] objArr2 = new Object[m18728e];
            int[] iArr2 = this.f17800i;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17801j;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17800i = iArr;
            this.f17801j = objArr2;
        }
        int i14 = this.f17802k;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f17800i;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f17801j;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f17802k - i11);
        }
        this.f17800i[i11] = i10;
        this.f17801j[i11] = e10;
        this.f17802k++;
    }

    /* renamed from: l */
    public int m18774l() {
        if (this.f17799h) {
            m18769f();
        }
        return this.f17802k;
    }

    /* renamed from: m */
    public E m18775m(int i10) {
        if (this.f17799h) {
            m18769f();
        }
        return (E) this.f17801j[i10];
    }

    public String toString() {
        if (m18774l() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17802k * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17802k; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m18772i(i10));
            sb2.append('=');
            E m18775m = m18775m(i10);
            if (m18775m != this) {
                sb2.append(m18775m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
