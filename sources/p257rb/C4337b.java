package p257rb;

import android.opengl.GLES20;
import gd.C2235i;
import p212ob.C3979c;
import td.C4747g;
import td.C4753m;

/* renamed from: rb.b */
/* loaded from: classes.dex */
public final class C4337b {

    /* renamed from: c */
    public static final a f15675c = new a(null);

    /* renamed from: a */
    public final int f15676a;

    /* renamed from: b */
    public final String f15677b;

    /* renamed from: rb.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C4337b m16624a(int i10, String str) {
            C4753m.m18654g(str, "name");
            return new C4337b(i10, b.ATTRIB, str, null);
        }

        /* renamed from: b */
        public final C4337b m16625b(int i10, String str) {
            C4753m.m18654g(str, "name");
            return new C4337b(i10, b.UNIFORM, str, null);
        }
    }

    /* renamed from: rb.b$b */
    /* loaded from: classes.dex */
    public enum b {
        ATTRIB,
        UNIFORM
    }

    public C4337b(int i10, b bVar, String str) {
        int glGetAttribLocation;
        this.f15677b = str;
        int i11 = C4338c.f15681a[bVar.ordinal()];
        if (i11 == 1) {
            glGetAttribLocation = GLES20.glGetAttribLocation(i10, str);
        } else {
            if (i11 != 2) {
                throw new C2235i();
            }
            glGetAttribLocation = GLES20.glGetUniformLocation(i10, str);
        }
        this.f15676a = glGetAttribLocation;
        C3979c.m15109c(glGetAttribLocation, str);
    }

    public /* synthetic */ C4337b(int i10, b bVar, String str, C4747g c4747g) {
        this(i10, bVar, str);
    }

    /* renamed from: a */
    public final int m16623a() {
        return this.f15676a;
    }
}
