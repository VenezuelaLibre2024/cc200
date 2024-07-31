package p002a0;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: a0.b */
/* loaded from: classes.dex */
public final class C0005b {

    /* renamed from: e */
    public static final C0005b f5e = new C0005b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f6a;

    /* renamed from: b */
    public final int f7b;

    /* renamed from: c */
    public final int f8c;

    /* renamed from: d */
    public final int f9d;

    /* renamed from: a0.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Insets m17a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public C0005b(int i10, int i11, int i12, int i13) {
        this.f6a = i10;
        this.f7b = i11;
        this.f8c = i12;
        this.f9d = i13;
    }

    /* renamed from: a */
    public static C0005b m12a(C0005b c0005b, C0005b c0005b2) {
        return m13b(Math.max(c0005b.f6a, c0005b2.f6a), Math.max(c0005b.f7b, c0005b2.f7b), Math.max(c0005b.f8c, c0005b2.f8c), Math.max(c0005b.f9d, c0005b2.f9d));
    }

    /* renamed from: b */
    public static C0005b m13b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f5e : new C0005b(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C0005b m14c(Rect rect) {
        return m13b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0005b m15d(Insets insets) {
        return m13b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m16e() {
        return a.m17a(this.f6a, this.f7b, this.f8c, this.f9d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0005b.class != obj.getClass()) {
            return false;
        }
        C0005b c0005b = (C0005b) obj;
        return this.f9d == c0005b.f9d && this.f6a == c0005b.f6a && this.f8c == c0005b.f8c && this.f7b == c0005b.f7b;
    }

    public int hashCode() {
        return (((((this.f6a * 31) + this.f7b) * 31) + this.f8c) * 31) + this.f9d;
    }

    public String toString() {
        return "Insets{left=" + this.f6a + ", top=" + this.f7b + ", right=" + this.f8c + ", bottom=" + this.f9d + '}';
    }
}
