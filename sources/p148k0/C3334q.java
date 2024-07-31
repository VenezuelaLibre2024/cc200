package p148k0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: k0.q */
/* loaded from: classes.dex */
public class C3334q {

    /* renamed from: a */
    public ViewParent f11642a;

    /* renamed from: b */
    public ViewParent f11643b;

    /* renamed from: c */
    public final View f11644c;

    /* renamed from: d */
    public boolean f11645d;

    /* renamed from: e */
    public int[] f11646e;

    public C3334q(View view) {
        this.f11644c = view;
    }

    /* renamed from: a */
    public boolean m12370a(float f10, float f11, boolean z10) {
        ViewParent m12378i;
        if (!m12382m() || (m12378i = m12378i(0)) == null) {
            return false;
        }
        return C3316f0.m12222a(m12378i, this.f11644c, f10, f11, z10);
    }

    /* renamed from: b */
    public boolean m12371b(float f10, float f11) {
        ViewParent m12378i;
        if (!m12382m() || (m12378i = m12378i(0)) == null) {
            return false;
        }
        return C3316f0.m12223b(m12378i, this.f11644c, f10, f11);
    }

    /* renamed from: c */
    public boolean m12372c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m12373d(i10, i11, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m12373d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent m12378i;
        int i13;
        int i14;
        if (!m12382m() || (m12378i = m12378i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f11644c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = m12379j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C3316f0.m12224c(m12378i, this.f11644c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f11644c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m12374e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m12377h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: f */
    public boolean m12375f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m12377h(i10, i11, i12, i13, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m12376g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return m12377h(i10, i11, i12, i13, iArr, i14, null);
    }

    /* renamed from: h */
    public final boolean m12377h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent m12378i;
        int i15;
        int i16;
        int[] iArr3;
        if (!m12382m() || (m12378i = m12378i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f11644c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] m12379j = m12379j();
            m12379j[0] = 0;
            m12379j[1] = 0;
            iArr3 = m12379j;
        } else {
            iArr3 = iArr2;
        }
        C3316f0.m12225d(m12378i, this.f11644c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f11644c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* renamed from: i */
    public final ViewParent m12378i(int i10) {
        if (i10 == 0) {
            return this.f11642a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f11643b;
    }

    /* renamed from: j */
    public final int[] m12379j() {
        if (this.f11646e == null) {
            this.f11646e = new int[2];
        }
        return this.f11646e;
    }

    /* renamed from: k */
    public boolean m12380k() {
        return m12381l(0);
    }

    /* renamed from: l */
    public boolean m12381l(int i10) {
        return m12378i(i10) != null;
    }

    /* renamed from: m */
    public boolean m12382m() {
        return this.f11645d;
    }

    /* renamed from: n */
    public void m12383n(boolean z10) {
        if (this.f11645d) {
            C3308b0.m12038m0(this.f11644c);
        }
        this.f11645d = z10;
    }

    /* renamed from: o */
    public final void m12384o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f11642a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f11643b = viewParent;
        }
    }

    /* renamed from: p */
    public boolean m12385p(int i10) {
        return m12386q(i10, 0);
    }

    /* renamed from: q */
    public boolean m12386q(int i10, int i11) {
        if (m12381l(i11)) {
            return true;
        }
        if (!m12382m()) {
            return false;
        }
        View view = this.f11644c;
        for (ViewParent parent = this.f11644c.getParent(); parent != null; parent = parent.getParent()) {
            if (C3316f0.m12227f(parent, view, this.f11644c, i10, i11)) {
                m12384o(i11, parent);
                C3316f0.m12226e(parent, view, this.f11644c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m12387r() {
        m12388s(0);
    }

    /* renamed from: s */
    public void m12388s(int i10) {
        ViewParent m12378i = m12378i(i10);
        if (m12378i != null) {
            C3316f0.m12228g(m12378i, this.f11644c, i10);
            m12384o(i10, null);
        }
    }
}
