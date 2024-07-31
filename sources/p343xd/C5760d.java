package p343xd;

import p115hd.AbstractC2480a0;
import p199nd.C3816c;
import td.C4747g;

/* renamed from: xd.d */
/* loaded from: classes2.dex */
public class C5760d implements Iterable<Integer> {

    /* renamed from: k */
    public static final a f21333k = new a(null);

    /* renamed from: h */
    public final int f21334h;

    /* renamed from: i */
    public final int f21335i;

    /* renamed from: j */
    public final int f21336j;

    /* renamed from: xd.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C5760d m22894a(int i10, int i11, int i12) {
            return new C5760d(i10, i11, i12);
        }
    }

    public C5760d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f21334h = i10;
        this.f21335i = C3816c.m14517c(i10, i11, i12);
        this.f21336j = i12;
    }

    /* renamed from: a */
    public final int m22890a() {
        return this.f21334h;
    }

    /* renamed from: b */
    public final int m22891b() {
        return this.f21335i;
    }

    /* renamed from: c */
    public final int m22892c() {
        return this.f21336j;
    }

    @Override // java.lang.Iterable
    /* renamed from: d */
    public AbstractC2480a0 iterator() {
        return new C5761e(this.f21334h, this.f21335i, this.f21336j);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5760d) {
            if (!isEmpty() || !((C5760d) obj).isEmpty()) {
                C5760d c5760d = (C5760d) obj;
                if (this.f21334h != c5760d.f21334h || this.f21335i != c5760d.f21335i || this.f21336j != c5760d.f21336j) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f21334h * 31) + this.f21335i) * 31) + this.f21336j;
    }

    public boolean isEmpty() {
        if (this.f21336j > 0) {
            if (this.f21334h > this.f21335i) {
                return true;
            }
        } else if (this.f21334h < this.f21335i) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f21336j > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f21334h);
            sb2.append("..");
            sb2.append(this.f21335i);
            sb2.append(" step ");
            i10 = this.f21336j;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f21334h);
            sb2.append(" downTo ");
            sb2.append(this.f21335i);
            sb2.append(" step ");
            i10 = -this.f21336j;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
