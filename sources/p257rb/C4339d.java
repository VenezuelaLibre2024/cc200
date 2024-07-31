package p257rb;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p212ob.C3979c;
import p227pb.AbstractC4106a;
import p227pb.AbstractC4107b;
import p241qb.C4223a;
import p283tb.C4737a;
import td.C4747g;
import td.C4753m;

/* renamed from: rb.d */
/* loaded from: classes.dex */
public class C4339d extends AbstractC4336a {

    /* renamed from: f */
    public float[] f15684f;

    /* renamed from: g */
    public final C4337b f15685g;

    /* renamed from: h */
    public FloatBuffer f15686h;

    /* renamed from: i */
    public final C4337b f15687i;

    /* renamed from: j */
    public final C4337b f15688j;

    /* renamed from: k */
    public final C4337b f15689k;

    /* renamed from: l */
    public final RectF f15690l;

    /* renamed from: m */
    public int f15691m;

    /* renamed from: n */
    public AbstractC4106a f15692n;

    /* renamed from: o */
    public C4737a f15693o;

    /* renamed from: q */
    public static final a f15683q = new a(null);

    /* renamed from: p */
    public static final String f15682p = C4339d.class.getSimpleName();

    /* renamed from: rb.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C4339d() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4339d(int i10, boolean z10, String str, String str2, String str3, String str4) {
        super(i10, z10);
        C4753m.m18654g(str, "vertexPositionName");
        C4753m.m18654g(str2, "vertexMvpMatrixName");
        this.f15684f = (float[]) C3979c.f14357a.clone();
        this.f15685g = str4 != null ? m16616e(str4) : null;
        this.f15686h = C4223a.m16265a(8);
        this.f15687i = str3 != null ? m16615d(str3) : null;
        this.f15688j = m16615d(str);
        this.f15689k = m16616e(str2);
        this.f15690l = new RectF();
        this.f15691m = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4339d(String str, String str2, String str3, String str4, String str5, String str6) {
        this(AbstractC4336a.f15671e.m16621a(str, str2), true, str3, str4, str5, str6);
        C4753m.m18654g(str, "vertexShader");
        C4753m.m18654g(str2, "fragmentShader");
        C4753m.m18654g(str3, "vertexPositionName");
        C4753m.m18654g(str4, "vertexMvpMatrixName");
    }

    public /* synthetic */ C4339d(String str, String str2, String str3, String str4, String str5, String str6, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n" : str, (i10 & 2) != 0 ? "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n" : str2, (i10 & 4) != 0 ? "aPosition" : str3, (i10 & 8) != 0 ? "uMVPMatrix" : str4, (i10 & 16) != 0 ? "aTextureCoord" : str5, (i10 & 32) != 0 ? "uTexMatrix" : str6);
    }

    @Override // p257rb.AbstractC4336a
    /* renamed from: g */
    public void mo16618g(AbstractC4107b abstractC4107b) {
        C4753m.m18654g(abstractC4107b, "drawable");
        super.mo16618g(abstractC4107b);
        GLES20.glDisableVertexAttribArray(this.f15688j.m16623a());
        C4337b c4337b = this.f15687i;
        if (c4337b != null) {
            GLES20.glDisableVertexAttribArray(c4337b.m16623a());
        }
        C4737a c4737a = this.f15693o;
        if (c4737a != null) {
            c4737a.mo15110a();
        }
        C3979c.m15108b("onPostDraw end");
    }

    @Override // p257rb.AbstractC4336a
    /* renamed from: h */
    public void mo16619h(AbstractC4107b abstractC4107b, float[] fArr) {
        C4753m.m18654g(abstractC4107b, "drawable");
        C4753m.m18654g(fArr, "modelViewProjectionMatrix");
        super.mo16619h(abstractC4107b, fArr);
        if (!(abstractC4107b instanceof AbstractC4106a)) {
            throw new RuntimeException("GlTextureProgram only supports 2D drawables.");
        }
        C4737a c4737a = this.f15693o;
        if (c4737a != null) {
            c4737a.mo15111b();
        }
        boolean z10 = true;
        GLES20.glUniformMatrix4fv(this.f15689k.m16623a(), 1, false, fArr, 0);
        C3979c.m15108b("glUniformMatrix4fv");
        C4337b c4337b = this.f15685g;
        if (c4337b != null) {
            GLES20.glUniformMatrix4fv(c4337b.m16623a(), 1, false, this.f15684f, 0);
            C3979c.m15108b("glUniformMatrix4fv");
        }
        C4337b c4337b2 = this.f15688j;
        GLES20.glEnableVertexAttribArray(c4337b2.m16623a());
        C3979c.m15108b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(c4337b2.m16623a(), 2, 5126, false, abstractC4107b.m15868g(), (Buffer) abstractC4107b.mo15865d());
        C3979c.m15108b("glVertexAttribPointer");
        C4337b c4337b3 = this.f15687i;
        if (c4337b3 != null) {
            if ((!C4753m.m18648a(abstractC4107b, this.f15692n)) || abstractC4107b.m15866e() != this.f15691m) {
                AbstractC4106a abstractC4106a = (AbstractC4106a) abstractC4107b;
                this.f15692n = abstractC4106a;
                this.f15691m = abstractC4107b.m15866e();
                abstractC4106a.m15862h(this.f15690l);
                int m15867f = abstractC4107b.m15867f() * 2;
                if (this.f15686h.capacity() < m15867f) {
                    this.f15686h = C4223a.m16265a(m15867f);
                }
                this.f15686h.clear();
                this.f15686h.limit(m15867f);
                int i10 = 0;
                while (i10 < m15867f) {
                    boolean z11 = i10 % 2 == 0 ? z10 : false;
                    float f10 = abstractC4107b.mo15865d().get(i10);
                    RectF rectF = this.f15690l;
                    float f11 = z11 ? rectF.left : rectF.bottom;
                    RectF rectF2 = this.f15690l;
                    int i11 = i10;
                    this.f15686h.put(i11, m16626j(i10 / 2, abstractC4106a, f10, f11, z11 ? rectF2.right : rectF2.top, z11));
                    i10 = i11 + 1;
                    z10 = true;
                }
            } else {
                this.f15686h.rewind();
            }
            GLES20.glEnableVertexAttribArray(c4337b3.m16623a());
            C3979c.m15108b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(c4337b3.m16623a(), 2, 5126, false, abstractC4107b.m15868g(), (Buffer) this.f15686h);
            C3979c.m15108b("glVertexAttribPointer");
        }
    }

    @Override // p257rb.AbstractC4336a
    /* renamed from: i */
    public void mo16620i() {
        super.mo16620i();
        C4737a c4737a = this.f15693o;
        if (c4737a != null) {
            c4737a.m18618e();
        }
        this.f15693o = null;
    }

    /* renamed from: j */
    public float m16626j(int i10, AbstractC4106a abstractC4106a, float f10, float f11, float f12, boolean z10) {
        C4753m.m18654g(abstractC4106a, "drawable");
        return (((f10 - f11) / (f12 - f11)) * 1.0f) + 0.0f;
    }

    /* renamed from: k */
    public final float[] m16627k() {
        return this.f15684f;
    }

    /* renamed from: l */
    public final void m16628l(C4737a c4737a) {
        this.f15693o = c4737a;
    }
}
