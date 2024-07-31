package gb;

import p129ia.C2684p;

/* renamed from: gb.d */
/* loaded from: classes.dex */
public final class C2218d extends C2684p {

    /* renamed from: c */
    public final float f8806c;

    /* renamed from: d */
    public final int f8807d;

    public C2218d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public C2218d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f8806c = f12;
        this.f8807d = i10;
    }

    /* renamed from: f */
    public boolean m8909f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m10909d()) > f10 || Math.abs(f12 - m10908c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f8806c);
        return abs <= 1.0f || abs <= this.f8806c;
    }

    /* renamed from: g */
    public C2218d m8910g(float f10, float f11, float f12) {
        int i10 = this.f8807d;
        int i11 = i10 + 1;
        float m10908c = (i10 * m10908c()) + f11;
        float f13 = i11;
        return new C2218d(m10908c / f13, ((this.f8807d * m10909d()) + f10) / f13, ((this.f8807d * this.f8806c) + f12) / f13, i11);
    }

    /* renamed from: h */
    public int m8911h() {
        return this.f8807d;
    }

    /* renamed from: i */
    public float m8912i() {
        return this.f8806c;
    }
}
