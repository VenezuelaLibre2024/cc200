package gb;

import p129ia.C2684p;

/* renamed from: gb.a */
/* loaded from: classes.dex */
public final class C2215a extends C2684p {

    /* renamed from: c */
    public final float f8794c;

    public C2215a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f8794c = f12;
    }

    /* renamed from: f */
    public boolean m8892f(float f10, float f11, float f12) {
        if (Math.abs(f11 - m10909d()) > f10 || Math.abs(f12 - m10908c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f8794c);
        return abs <= 1.0f || abs <= this.f8794c;
    }

    /* renamed from: g */
    public C2215a m8893g(float f10, float f11, float f12) {
        return new C2215a((m10908c() + f11) / 2.0f, (m10909d() + f10) / 2.0f, (this.f8794c + f12) / 2.0f);
    }
}
