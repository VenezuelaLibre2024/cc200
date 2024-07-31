package p340xa;

import p129ia.C2684p;

/* renamed from: xa.c */
/* loaded from: classes.dex */
public final class C5743c {

    /* renamed from: a */
    public final int f21292a;

    /* renamed from: b */
    public final int[] f21293b;

    /* renamed from: c */
    public final C2684p[] f21294c;

    public C5743c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f21292a = i10;
        this.f21293b = iArr;
        float f10 = i13;
        this.f21294c = new C2684p[]{new C2684p(i11, f10), new C2684p(i12, f10)};
    }

    /* renamed from: a */
    public C2684p[] m22853a() {
        return this.f21294c;
    }

    /* renamed from: b */
    public int[] m22854b() {
        return this.f21293b;
    }

    /* renamed from: c */
    public int m22855c() {
        return this.f21292a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5743c) && this.f21292a == ((C5743c) obj).f21292a;
    }

    public int hashCode() {
        return this.f21292a;
    }
}
