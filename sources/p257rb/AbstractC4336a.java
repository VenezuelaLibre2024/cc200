package p257rb;

import android.opengl.GLES20;
import p212ob.C3979c;
import p227pb.AbstractC4107b;
import td.C4747g;
import td.C4753m;

/* renamed from: rb.a */
/* loaded from: classes.dex */
public abstract class AbstractC4336a {

    /* renamed from: a */
    public boolean f15672a;

    /* renamed from: b */
    public final int f15673b;

    /* renamed from: c */
    public final boolean f15674c;

    /* renamed from: e */
    public static final a f15671e = new a(null);

    /* renamed from: d */
    public static final String f15670d = AbstractC4336a.class.getSimpleName();

    /* renamed from: rb.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final int m16621a(String str, String str2) {
            C4753m.m18654g(str, "vertexShaderSource");
            C4753m.m18654g(str2, "fragmentShaderSource");
            int m16622b = m16622b(35632, str2);
            if (m16622b == 0) {
                throw new RuntimeException("Could not load fragment shader");
            }
            int m16622b2 = m16622b(35633, str);
            if (m16622b2 == 0) {
                throw new RuntimeException("Could not load vertex shader");
            }
            int glCreateProgram = GLES20.glCreateProgram();
            C3979c.m15108b("glCreateProgram");
            if (glCreateProgram == 0) {
                throw new RuntimeException("Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, m16622b2);
            C3979c.m15108b("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, m16622b);
            C3979c.m15108b("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            String str3 = "Could not link program: " + GLES20.glGetProgramInfoLog(glCreateProgram);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException(str3);
        }

        /* renamed from: b */
        public final int m16622b(int i10, String str) {
            int glCreateShader = GLES20.glCreateShader(i10);
            C3979c.m15108b("glCreateShader type=" + i10);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String str2 = "Could not compile shader " + i10 + ": " + GLES20.glGetShaderInfoLog(glCreateShader) + " source: " + str;
            GLES20.glDeleteShader(glCreateShader);
            throw new RuntimeException(str2);
        }
    }

    public AbstractC4336a(int i10, boolean z10) {
        this.f15673b = i10;
        this.f15674c = z10;
    }

    /* renamed from: c */
    public static /* synthetic */ void m16612c(AbstractC4336a abstractC4336a, AbstractC4107b abstractC4107b, float[] fArr, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if ((i10 & 2) != 0) {
            fArr = abstractC4107b.m15864c();
        }
        abstractC4336a.m16614b(abstractC4107b, fArr);
    }

    /* renamed from: a */
    public final void m16613a(AbstractC4107b abstractC4107b) {
        m16612c(this, abstractC4107b, null, 2, null);
    }

    /* renamed from: b */
    public final void m16614b(AbstractC4107b abstractC4107b, float[] fArr) {
        C4753m.m18654g(abstractC4107b, "drawable");
        C4753m.m18654g(fArr, "modelViewProjectionMatrix");
        C3979c.m15108b("draw start");
        GLES20.glUseProgram(this.f15673b);
        C3979c.m15108b("glUseProgram");
        mo16619h(abstractC4107b, fArr);
        m16617f(abstractC4107b);
        mo16618g(abstractC4107b);
        GLES20.glUseProgram(0);
        C3979c.m15108b("draw end");
    }

    /* renamed from: d */
    public final C4337b m16615d(String str) {
        C4753m.m18654g(str, "name");
        return C4337b.f15675c.m16624a(this.f15673b, str);
    }

    /* renamed from: e */
    public final C4337b m16616e(String str) {
        C4753m.m18654g(str, "name");
        return C4337b.f15675c.m16625b(this.f15673b, str);
    }

    /* renamed from: f */
    public void m16617f(AbstractC4107b abstractC4107b) {
        C4753m.m18654g(abstractC4107b, "drawable");
        abstractC4107b.mo15863a();
    }

    /* renamed from: g */
    public void mo16618g(AbstractC4107b abstractC4107b) {
        C4753m.m18654g(abstractC4107b, "drawable");
    }

    /* renamed from: h */
    public void mo16619h(AbstractC4107b abstractC4107b, float[] fArr) {
        C4753m.m18654g(abstractC4107b, "drawable");
        C4753m.m18654g(fArr, "modelViewProjectionMatrix");
    }

    /* renamed from: i */
    public void mo16620i() {
        if (this.f15672a || !this.f15674c) {
            return;
        }
        GLES20.glDeleteProgram(this.f15673b);
        this.f15672a = true;
    }
}
