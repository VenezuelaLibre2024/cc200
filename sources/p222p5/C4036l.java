package p222p5;

import android.util.SparseBooleanArray;

/* renamed from: p5.l */
/* loaded from: classes.dex */
public final class C4036l {

    /* renamed from: a */
    public final SparseBooleanArray f14506a;

    /* renamed from: p5.l$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final SparseBooleanArray f14507a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f14508b;

        /* renamed from: a */
        public b m15379a(int i10) {
            C4014a.m15200f(!this.f14508b);
            this.f14507a.append(i10, true);
            return this;
        }

        /* renamed from: b */
        public b m15380b(C4036l c4036l) {
            for (int i10 = 0; i10 < c4036l.m15378c(); i10++) {
                m15379a(c4036l.m15377b(i10));
            }
            return this;
        }

        /* renamed from: c */
        public b m15381c(int... iArr) {
            for (int i10 : iArr) {
                m15379a(i10);
            }
            return this;
        }

        /* renamed from: d */
        public b m15382d(int i10, boolean z10) {
            return z10 ? m15379a(i10) : this;
        }

        /* renamed from: e */
        public C4036l m15383e() {
            C4014a.m15200f(!this.f14508b);
            this.f14508b = true;
            return new C4036l(this.f14507a);
        }
    }

    public C4036l(SparseBooleanArray sparseBooleanArray) {
        this.f14506a = sparseBooleanArray;
    }

    /* renamed from: a */
    public boolean m15376a(int i10) {
        return this.f14506a.get(i10);
    }

    /* renamed from: b */
    public int m15377b(int i10) {
        C4014a.m15197c(i10, 0, m15378c());
        return this.f14506a.keyAt(i10);
    }

    /* renamed from: c */
    public int m15378c() {
        return this.f14506a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4036l)) {
            return false;
        }
        C4036l c4036l = (C4036l) obj;
        if (C4041n0.f14513a >= 24) {
            return this.f14506a.equals(c4036l.f14506a);
        }
        if (m15378c() != c4036l.m15378c()) {
            return false;
        }
        for (int i10 = 0; i10 < m15378c(); i10++) {
            if (m15377b(i10) != c4036l.m15377b(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C4041n0.f14513a >= 24) {
            return this.f14506a.hashCode();
        }
        int m15378c = m15378c();
        for (int i10 = 0; i10 < m15378c(); i10++) {
            m15378c = (m15378c * 31) + m15377b(i10);
        }
        return m15378c;
    }
}
