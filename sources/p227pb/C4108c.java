package p227pb;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.Arrays;
import p212ob.C3979c;
import p241qb.C4223a;
import td.C4747g;

/* renamed from: pb.c */
/* loaded from: classes.dex */
public class C4108c extends AbstractC4106a {

    /* renamed from: g */
    public FloatBuffer f14824g;

    /* renamed from: i */
    public static final a f14823i = new a(null);

    /* renamed from: h */
    public static final float[] f14822h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: pb.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C4108c() {
        float[] fArr = (float[]) f14822h.clone();
        this.f14824g = C4223a.m16266b(Arrays.copyOf(fArr, fArr.length));
    }

    @Override // p227pb.AbstractC4107b
    /* renamed from: a */
    public void mo15863a() {
        C3979c.m15108b("glDrawArrays start");
        GLES20.glDrawArrays(5, 0, m15867f());
        C3979c.m15108b("glDrawArrays end");
    }

    @Override // p227pb.AbstractC4107b
    /* renamed from: d */
    public FloatBuffer mo15865d() {
        return this.f14824g;
    }
}
