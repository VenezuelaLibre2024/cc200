package p241qb;

import android.opengl.Matrix;
import td.C4753m;

/* renamed from: qb.b */
/* loaded from: classes.dex */
public final class C4224b {
    /* renamed from: a */
    public static final void m16268a(float[] fArr) {
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
    }

    /* renamed from: b */
    public static final float[] m16269b(float[] fArr) {
        C4753m.m18654g(fArr, "$this$makeIdentity");
        m16268a(fArr);
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }
}
