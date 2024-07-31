package za;

import p129ia.C2674f;

/* renamed from: za.p */
/* loaded from: classes.dex */
public final class C6112p extends AbstractC6113q {

    /* renamed from: b */
    public final int f22642b;

    /* renamed from: c */
    public final int f22643c;

    public C6112p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw C2674f.m10883a();
        }
        this.f22642b = i11;
        this.f22643c = i12;
    }

    /* renamed from: b */
    public int m24374b() {
        return this.f22642b;
    }

    /* renamed from: c */
    public int m24375c() {
        return this.f22643c;
    }

    /* renamed from: d */
    public boolean m24376d() {
        return this.f22642b == 10;
    }

    /* renamed from: e */
    public boolean m24377e() {
        return this.f22643c == 10;
    }
}
