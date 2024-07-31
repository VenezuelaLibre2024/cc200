package p212ob;

import android.opengl.EGL14;
import android.opengl.GLSurfaceView;
import android.util.Log;
import gd.C2241o;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import p115hd.C2497j;
import td.C4753m;

/* renamed from: ob.a */
/* loaded from: classes.dex */
public final class C3977a {

    /* renamed from: d */
    public static final C3977a f14349d = new C3977a();

    /* renamed from: a */
    public static final String f14346a = C3977a.class.getSimpleName();

    /* renamed from: b */
    public static final GLSurfaceView.EGLConfigChooser f14347b = new a(2);

    /* renamed from: c */
    public static final GLSurfaceView.EGLConfigChooser f14348c = new a(3);

    /* renamed from: ob.a$a */
    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a */
        public final int f14350a;

        public a(int i10) {
            this.f14350a = i10;
        }

        /* renamed from: a */
        public final EGLConfig m15099a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int m15100b = m15100b(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int m15100b2 = m15100b(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (m15100b >= 0 && m15100b2 >= 0) {
                    int m15100b3 = m15100b(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int m15100b4 = m15100b(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int m15100b5 = m15100b(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int m15100b6 = m15100b(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (m15100b3 == 8 && m15100b4 == 8 && m15100b5 == 8 && m15100b6 == 8) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final int m15100b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
            int[] iArr = new int[1];
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr) ? iArr[0] : i11;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            C4753m.m18654g(egl10, "egl");
            C4753m.m18654g(eGLDisplay, "display");
            int[] iArr = new int[1];
            int[] m15098c = C3977a.f14349d.m15098c(this.f14350a, true);
            if (!egl10.eglChooseConfig(eGLDisplay, m15098c, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i10 = iArr[0];
            if (i10 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            if (!egl10.eglChooseConfig(eGLDisplay, m15098c, eGLConfigArr, i10, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            List m9964i = C2497j.m9964i(eGLConfigArr);
            if (m9964i == null) {
                throw new C2241o("null cannot be cast to non-null type java.util.Collection<T>");
            }
            Object[] array = m9964i.toArray(new EGLConfig[0]);
            if (array == null) {
                throw new C2241o("null cannot be cast to non-null type kotlin.Array<T>");
            }
            EGLConfig m15099a = m15099a(egl10, eGLDisplay, (EGLConfig[]) array);
            if (m15099a != null) {
                return m15099a;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    /* renamed from: b */
    public static final android.opengl.EGLConfig m15097b(android.opengl.EGLDisplay eGLDisplay, int i10, boolean z10) {
        C4753m.m18654g(eGLDisplay, "display");
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, f14349d.m15098c(i10, z10), 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        Log.w(f14346a, "Unable to find RGB8888 / " + i10 + " EGLConfig");
        return null;
    }

    /* renamed from: c */
    public final int[] m15098c(int i10, boolean z10) {
        int i11 = i10 >= 3 ? 68 : 4;
        int[] iArr = new int[15];
        iArr[0] = 12324;
        iArr[1] = 8;
        iArr[2] = 12323;
        iArr[3] = 8;
        iArr[4] = 12322;
        iArr[5] = 8;
        iArr[6] = 12321;
        iArr[7] = 8;
        iArr[8] = 12339;
        iArr[9] = 5;
        iArr[10] = 12352;
        iArr[11] = i11;
        iArr[12] = z10 ? 12610 : 12344;
        iArr[13] = z10 ? 1 : 0;
        iArr[14] = 12344;
        return iArr;
    }
}
