package p222p5;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: p5.m */
/* loaded from: classes.dex */
public final class C4038m {

    /* renamed from: a */
    public static final int[] f14509a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b */
    public static final int[] f14510b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c */
    public static final int[] f14511c = {12344};

    /* renamed from: p5.m$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m15389a() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    /* renamed from: b */
    public static void m15390b(boolean z10, String str) {
        if (!z10) {
            throw new a(str);
        }
    }

    /* renamed from: c */
    public static boolean m15391c(Context context) {
        String eglQueryString;
        int i10 = C4041n0.f14513a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(C4041n0.f14515c) || "XT1650".equals(C4041n0.f14516d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m15392d() {
        String eglQueryString;
        return C4041n0.f14513a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }
}
