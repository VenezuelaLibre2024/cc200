package p227pb;

import android.graphics.RectF;
import td.C4748h;
import td.C4753m;

/* renamed from: pb.a */
/* loaded from: classes.dex */
public abstract class AbstractC4106a extends AbstractC4107b {

    /* renamed from: f */
    public final int f14819f = 2;

    @Override // p227pb.AbstractC4107b
    /* renamed from: b */
    public final int mo15861b() {
        return this.f14819f;
    }

    /* renamed from: h */
    public final void m15862h(RectF rectF) {
        C4753m.m18654g(rectF, "rect");
        C4748h c4748h = C4748h.f17725a;
        float f10 = -c4748h.m18646a();
        float m18646a = c4748h.m18646a();
        float m18646a2 = c4748h.m18646a();
        float f11 = -c4748h.m18646a();
        int i10 = 0;
        while (mo15865d().hasRemaining()) {
            float f12 = mo15865d().get();
            if (i10 % 2 == 0) {
                m18646a2 = Math.min(m18646a2, f12);
                f11 = Math.max(f11, f12);
            } else {
                f10 = Math.max(f10, f12);
                m18646a = Math.min(m18646a, f12);
            }
            i10++;
        }
        mo15865d().rewind();
        rectF.set(m18646a2, f10, f11, m18646a);
    }
}
