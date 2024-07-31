package p153k5;

import android.text.Layout;

/* renamed from: k5.g */
/* loaded from: classes.dex */
public final class C3361g {

    /* renamed from: a */
    public String f11719a;

    /* renamed from: b */
    public int f11720b;

    /* renamed from: c */
    public boolean f11721c;

    /* renamed from: d */
    public int f11722d;

    /* renamed from: e */
    public boolean f11723e;

    /* renamed from: k */
    public float f11729k;

    /* renamed from: l */
    public String f11730l;

    /* renamed from: o */
    public Layout.Alignment f11733o;

    /* renamed from: p */
    public Layout.Alignment f11734p;

    /* renamed from: r */
    public C3356b f11736r;

    /* renamed from: f */
    public int f11724f = -1;

    /* renamed from: g */
    public int f11725g = -1;

    /* renamed from: h */
    public int f11726h = -1;

    /* renamed from: i */
    public int f11727i = -1;

    /* renamed from: j */
    public int f11728j = -1;

    /* renamed from: m */
    public int f11731m = -1;

    /* renamed from: n */
    public int f11732n = -1;

    /* renamed from: q */
    public int f11735q = -1;

    /* renamed from: s */
    public float f11737s = Float.MAX_VALUE;

    /* renamed from: A */
    public C3361g m12469A(String str) {
        this.f11730l = str;
        return this;
    }

    /* renamed from: B */
    public C3361g m12470B(boolean z10) {
        this.f11727i = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C3361g m12471C(boolean z10) {
        this.f11724f = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public C3361g m12472D(Layout.Alignment alignment) {
        this.f11734p = alignment;
        return this;
    }

    /* renamed from: E */
    public C3361g m12473E(int i10) {
        this.f11732n = i10;
        return this;
    }

    /* renamed from: F */
    public C3361g m12474F(int i10) {
        this.f11731m = i10;
        return this;
    }

    /* renamed from: G */
    public C3361g m12475G(float f10) {
        this.f11737s = f10;
        return this;
    }

    /* renamed from: H */
    public C3361g m12476H(Layout.Alignment alignment) {
        this.f11733o = alignment;
        return this;
    }

    /* renamed from: I */
    public C3361g m12477I(boolean z10) {
        this.f11735q = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public C3361g m12478J(C3356b c3356b) {
        this.f11736r = c3356b;
        return this;
    }

    /* renamed from: K */
    public C3361g m12479K(boolean z10) {
        this.f11725g = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C3361g m12480a(C3361g c3361g) {
        return m12497r(c3361g, true);
    }

    /* renamed from: b */
    public int m12481b() {
        if (this.f11723e) {
            return this.f11722d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m12482c() {
        if (this.f11721c) {
            return this.f11720b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m12483d() {
        return this.f11719a;
    }

    /* renamed from: e */
    public float m12484e() {
        return this.f11729k;
    }

    /* renamed from: f */
    public int m12485f() {
        return this.f11728j;
    }

    /* renamed from: g */
    public String m12486g() {
        return this.f11730l;
    }

    /* renamed from: h */
    public Layout.Alignment m12487h() {
        return this.f11734p;
    }

    /* renamed from: i */
    public int m12488i() {
        return this.f11732n;
    }

    /* renamed from: j */
    public int m12489j() {
        return this.f11731m;
    }

    /* renamed from: k */
    public float m12490k() {
        return this.f11737s;
    }

    /* renamed from: l */
    public int m12491l() {
        int i10 = this.f11726h;
        if (i10 == -1 && this.f11727i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f11727i == 1 ? 2 : 0);
    }

    /* renamed from: m */
    public Layout.Alignment m12492m() {
        return this.f11733o;
    }

    /* renamed from: n */
    public boolean m12493n() {
        return this.f11735q == 1;
    }

    /* renamed from: o */
    public C3356b m12494o() {
        return this.f11736r;
    }

    /* renamed from: p */
    public boolean m12495p() {
        return this.f11723e;
    }

    /* renamed from: q */
    public boolean m12496q() {
        return this.f11721c;
    }

    /* renamed from: r */
    public final C3361g m12497r(C3361g c3361g, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c3361g != null) {
            if (!this.f11721c && c3361g.f11721c) {
                m12502w(c3361g.f11720b);
            }
            if (this.f11726h == -1) {
                this.f11726h = c3361g.f11726h;
            }
            if (this.f11727i == -1) {
                this.f11727i = c3361g.f11727i;
            }
            if (this.f11719a == null && (str = c3361g.f11719a) != null) {
                this.f11719a = str;
            }
            if (this.f11724f == -1) {
                this.f11724f = c3361g.f11724f;
            }
            if (this.f11725g == -1) {
                this.f11725g = c3361g.f11725g;
            }
            if (this.f11732n == -1) {
                this.f11732n = c3361g.f11732n;
            }
            if (this.f11733o == null && (alignment2 = c3361g.f11733o) != null) {
                this.f11733o = alignment2;
            }
            if (this.f11734p == null && (alignment = c3361g.f11734p) != null) {
                this.f11734p = alignment;
            }
            if (this.f11735q == -1) {
                this.f11735q = c3361g.f11735q;
            }
            if (this.f11728j == -1) {
                this.f11728j = c3361g.f11728j;
                this.f11729k = c3361g.f11729k;
            }
            if (this.f11736r == null) {
                this.f11736r = c3361g.f11736r;
            }
            if (this.f11737s == Float.MAX_VALUE) {
                this.f11737s = c3361g.f11737s;
            }
            if (z10 && !this.f11723e && c3361g.f11723e) {
                m12500u(c3361g.f11722d);
            }
            if (z10 && this.f11731m == -1 && (i10 = c3361g.f11731m) != -1) {
                this.f11731m = i10;
            }
        }
        return this;
    }

    /* renamed from: s */
    public boolean m12498s() {
        return this.f11724f == 1;
    }

    /* renamed from: t */
    public boolean m12499t() {
        return this.f11725g == 1;
    }

    /* renamed from: u */
    public C3361g m12500u(int i10) {
        this.f11722d = i10;
        this.f11723e = true;
        return this;
    }

    /* renamed from: v */
    public C3361g m12501v(boolean z10) {
        this.f11726h = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C3361g m12502w(int i10) {
        this.f11720b = i10;
        this.f11721c = true;
        return this;
    }

    /* renamed from: x */
    public C3361g m12503x(String str) {
        this.f11719a = str;
        return this;
    }

    /* renamed from: y */
    public C3361g m12504y(float f10) {
        this.f11729k = f10;
        return this;
    }

    /* renamed from: z */
    public C3361g m12505z(int i10) {
        this.f11728j = i10;
        return this;
    }
}
