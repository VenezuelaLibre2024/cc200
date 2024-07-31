package p264s3;

import android.os.Bundle;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.a3 */
/* loaded from: classes.dex */
public final class C4403a3 implements InterfaceC4436h {

    /* renamed from: k */
    public static final C4403a3 f16149k = new C4403a3(1.0f);

    /* renamed from: l */
    public static final String f16150l = C4041n0.m15478q0(0);

    /* renamed from: m */
    public static final String f16151m = C4041n0.m15478q0(1);

    /* renamed from: n */
    public static final InterfaceC4436h.a<C4403a3> f16152n = new InterfaceC4436h.a() { // from class: s3.z2
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4403a3 m17061c;
            m17061c = C4403a3.m17061c(bundle);
            return m17061c;
        }
    };

    /* renamed from: h */
    public final float f16153h;

    /* renamed from: i */
    public final float f16154i;

    /* renamed from: j */
    public final int f16155j;

    public C4403a3(float f10) {
        this(f10, 1.0f);
    }

    public C4403a3(float f10, float f11) {
        C4014a.m15195a(f10 > 0.0f);
        C4014a.m15195a(f11 > 0.0f);
        this.f16153h = f10;
        this.f16154i = f11;
        this.f16155j = Math.round(f10 * 1000.0f);
    }

    /* renamed from: c */
    public static /* synthetic */ C4403a3 m17061c(Bundle bundle) {
        return new C4403a3(bundle.getFloat(f16150l, 1.0f), bundle.getFloat(f16151m, 1.0f));
    }

    /* renamed from: b */
    public long m17062b(long j10) {
        return j10 * this.f16155j;
    }

    /* renamed from: d */
    public C4403a3 m17063d(float f10) {
        return new C4403a3(f10, this.f16154i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4403a3.class != obj.getClass()) {
            return false;
        }
        C4403a3 c4403a3 = (C4403a3) obj;
        return this.f16153h == c4403a3.f16153h && this.f16154i == c4403a3.f16154i;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f16153h)) * 31) + Float.floatToRawIntBits(this.f16154i);
    }

    public String toString() {
        return C4041n0.m15397C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f16153h), Float.valueOf(this.f16154i));
    }
}
