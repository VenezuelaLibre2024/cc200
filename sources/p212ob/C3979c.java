package p212ob;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import p241qb.C4224b;
import td.C4753m;

/* renamed from: ob.c */
/* loaded from: classes.dex */
public final class C3979c {

    /* renamed from: a */
    public static final float[] f14357a;

    /* renamed from: b */
    public static final C3979c f14358b = new C3979c();

    static {
        float[] fArr = new float[16];
        C4224b.m16269b(fArr);
        f14357a = fArr;
    }

    /* renamed from: a */
    public static final void m15107a(String str) {
        C4753m.m18654g(str, "opName");
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String str2 = "Error during " + str + ": EGL error 0x" + Integer.toHexString(eglGetError);
        Log.e("Egloo", str2);
        throw new RuntimeException(str2);
    }

    /* renamed from: b */
    public static final void m15108b(String str) {
        C4753m.m18654g(str, "opName");
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = "Error during " + str + ": glError 0x" + Integer.toHexString(glGetError) + ": " + GLU.gluErrorString(glGetError);
        Log.e("Egloo", str2);
        throw new RuntimeException(str2);
    }

    /* renamed from: c */
    public static final void m15109c(int i10, String str) {
        C4753m.m18654g(str, "label");
        if (i10 >= 0) {
            return;
        }
        String str2 = "Unable to locate " + str + " in program";
        Log.e("Egloo", str2);
        throw new RuntimeException(str2);
    }
}
