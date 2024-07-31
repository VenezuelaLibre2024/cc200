package p130ib;

import android.graphics.Rect;
import android.util.Log;
import p113hb.C2474s;

/* renamed from: ib.l */
/* loaded from: classes.dex */
public class C2697l extends AbstractC2702q {

    /* renamed from: b */
    public static final String f10566b = "l";

    @Override // p130ib.AbstractC2702q
    /* renamed from: c */
    public float mo11007c(C2474s c2474s, C2474s c2474s2) {
        if (c2474s.f9897h <= 0 || c2474s.f9898i <= 0) {
            return 0.0f;
        }
        C2474s m9865f = c2474s.m9865f(c2474s2);
        float f10 = (m9865f.f9897h * 1.0f) / c2474s.f9897h;
        if (f10 > 1.0f) {
            f10 = (float) Math.pow(1.0f / f10, 1.1d);
        }
        float f11 = ((m9865f.f9897h * 1.0f) / c2474s2.f9897h) + ((m9865f.f9898i * 1.0f) / c2474s2.f9898i);
        return f10 * ((1.0f / f11) / f11);
    }

    @Override // p130ib.AbstractC2702q
    /* renamed from: d */
    public Rect mo11008d(C2474s c2474s, C2474s c2474s2) {
        C2474s m9865f = c2474s.m9865f(c2474s2);
        Log.i(f10566b, "Preview: " + c2474s + "; Scaled: " + m9865f + "; Want: " + c2474s2);
        int i10 = (m9865f.f9897h - c2474s2.f9897h) / 2;
        int i11 = (m9865f.f9898i - c2474s2.f9898i) / 2;
        return new Rect(-i10, -i11, m9865f.f9897h - i10, m9865f.f9898i - i11);
    }
}
