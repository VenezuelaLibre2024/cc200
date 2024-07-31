package p130ib;

import android.graphics.Rect;
import p113hb.C2474s;

/* renamed from: ib.o */
/* loaded from: classes.dex */
public class C2700o extends AbstractC2702q {
    /* renamed from: e */
    public static float m11014e(float f10) {
        return f10 < 1.0f ? 1.0f / f10 : f10;
    }

    @Override // p130ib.AbstractC2702q
    /* renamed from: c */
    public float mo11007c(C2474s c2474s, C2474s c2474s2) {
        int i10 = c2474s.f9897h;
        if (i10 <= 0 || c2474s.f9898i <= 0) {
            return 0.0f;
        }
        float m11014e = (1.0f / m11014e((i10 * 1.0f) / c2474s2.f9897h)) / m11014e((c2474s.f9898i * 1.0f) / c2474s2.f9898i);
        float m11014e2 = m11014e(((c2474s.f9897h * 1.0f) / c2474s.f9898i) / ((c2474s2.f9897h * 1.0f) / c2474s2.f9898i));
        return m11014e * (((1.0f / m11014e2) / m11014e2) / m11014e2);
    }

    @Override // p130ib.AbstractC2702q
    /* renamed from: d */
    public Rect mo11008d(C2474s c2474s, C2474s c2474s2) {
        return new Rect(0, 0, c2474s2.f9897h, c2474s2.f9898i);
    }
}
