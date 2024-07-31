package p212ob;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;
import td.C4747g;
import td.C4753m;

/* renamed from: ob.b */
/* loaded from: classes.dex */
public final class C3978b {

    /* renamed from: a */
    public EGLDisplay f14353a;

    /* renamed from: b */
    public EGLContext f14354b;

    /* renamed from: c */
    public EGLConfig f14355c;

    /* renamed from: d */
    public int f14356d;

    /* renamed from: f */
    public static final a f14352f = new a(null);

    /* renamed from: e */
    public static final String f14351e = C3978b.class.getSimpleName();

    /* renamed from: ob.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C3978b() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public C3978b(EGLContext eGLContext, int i10) {
        C4753m.m18654g(eGLContext, "sharedContext");
        this.f14353a = EGL14.EGL_NO_DISPLAY;
        this.f14354b = EGL14.EGL_NO_CONTEXT;
        this.f14356d = -1;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f14353a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f14353a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        boolean z10 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            EGLDisplay eGLDisplay = this.f14353a;
            if (eGLDisplay == null) {
                C4753m.m18663p();
            }
            EGLConfig m15097b = C3977a.m15097b(eGLDisplay, 3, z10);
            if (m15097b != null) {
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f14353a, m15097b, eGLContext, new int[]{12440, 3, 12344}, 0);
                try {
                    C3979c.m15107a("eglCreateContext (3)");
                    this.f14355c = m15097b;
                    this.f14354b = eglCreateContext;
                    this.f14356d = 3;
                } catch (Exception unused) {
                }
            }
        }
        if (this.f14354b == EGL14.EGL_NO_CONTEXT) {
            EGLDisplay eGLDisplay2 = this.f14353a;
            if (eGLDisplay2 == null) {
                C4753m.m18663p();
            }
            EGLConfig m15097b2 = C3977a.m15097b(eGLDisplay2, 2, z10);
            if (m15097b2 == null) {
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
            EGLContext eglCreateContext2 = EGL14.eglCreateContext(this.f14353a, m15097b2, eGLContext, new int[]{12440, 2, 12344}, 0);
            C3979c.m15107a("eglCreateContext (2)");
            this.f14355c = m15097b2;
            this.f14354b = eglCreateContext2;
            this.f14356d = 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3978b(android.opengl.EGLContext r1, int r2, int r3, td.C4747g r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto Lb
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            java.lang.String r4 = "EGL14.EGL_NO_CONTEXT"
            td.C4753m.m18649b(r1, r4)
        Lb:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212ob.C3978b.<init>(android.opengl.EGLContext, int, int, td.g):void");
    }

    /* renamed from: a */
    public final EGLSurface m15101a(Object obj) {
        C4753m.m18654g(obj, "surface");
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new RuntimeException("invalid surface: " + obj);
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f14353a, this.f14355c, obj, new int[]{12344}, 0);
        C3979c.m15107a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException("surface was null");
    }

    /* renamed from: b */
    public final void m15102b(EGLSurface eGLSurface) {
        C4753m.m18654g(eGLSurface, "eglSurface");
        if (this.f14353a == EGL14.EGL_NO_DISPLAY) {
            Log.d(f14351e, "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f14353a, eGLSurface, eGLSurface, this.f14354b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: c */
    public final void m15103c() {
        EGLDisplay eGLDisplay = this.f14353a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f14353a, this.f14354b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f14353a);
        }
        this.f14353a = EGL14.EGL_NO_DISPLAY;
        this.f14354b = EGL14.EGL_NO_CONTEXT;
        this.f14355c = null;
    }

    /* renamed from: d */
    public final void m15104d(EGLSurface eGLSurface) {
        C4753m.m18654g(eGLSurface, "eglSurface");
        EGL14.eglDestroySurface(this.f14353a, eGLSurface);
    }

    /* renamed from: e */
    public final void m15105e(EGLSurface eGLSurface, long j10) {
        C4753m.m18654g(eGLSurface, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.f14353a, eGLSurface, j10);
    }

    /* renamed from: f */
    public final boolean m15106f(EGLSurface eGLSurface) {
        C4753m.m18654g(eGLSurface, "eglSurface");
        return EGL14.eglSwapBuffers(this.f14353a, eGLSurface);
    }

    public final void finalize() {
        if (this.f14353a != EGL14.EGL_NO_DISPLAY) {
            Log.e(f14351e, "WARNING: EglCore was not explicitly released - state may be leaked");
            m15103c();
        }
    }
}
