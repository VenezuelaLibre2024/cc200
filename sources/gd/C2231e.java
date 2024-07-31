package gd;

import p343xd.C5762f;
import td.C4747g;
import td.C4753m;

/* renamed from: gd.e */
/* loaded from: classes2.dex */
public final class C2231e implements Comparable<C2231e> {

    /* renamed from: l */
    public static final a f8856l = new a(null);

    /* renamed from: m */
    public static final C2231e f8857m = C2232f.m8959a();

    /* renamed from: h */
    public final int f8858h;

    /* renamed from: i */
    public final int f8859i;

    /* renamed from: j */
    public final int f8860j;

    /* renamed from: k */
    public final int f8861k;

    /* renamed from: gd.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C2231e(int i10, int i11, int i12) {
        this.f8858h = i10;
        this.f8859i = i11;
        this.f8860j = i12;
        this.f8861k = m8958c(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2231e c2231e) {
        C4753m.m18653f(c2231e, "other");
        return this.f8861k - c2231e.f8861k;
    }

    /* renamed from: c */
    public final int m8958c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new C5762f(0, 255).m22896h(i10) && new C5762f(0, 255).m22896h(i11) && new C5762f(0, 255).m22896h(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2231e c2231e = obj instanceof C2231e ? (C2231e) obj : null;
        return c2231e != null && this.f8861k == c2231e.f8861k;
    }

    public int hashCode() {
        return this.f8861k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8858h);
        sb2.append('.');
        sb2.append(this.f8859i);
        sb2.append('.');
        sb2.append(this.f8860j);
        return sb2.toString();
    }
}
