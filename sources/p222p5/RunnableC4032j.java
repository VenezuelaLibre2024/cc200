package p222p5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: p5.j */
/* loaded from: classes.dex */
public final class RunnableC4032j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: o */
    public static final int[] f14494o = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: h */
    public final Handler f14495h;

    /* renamed from: i */
    public final int[] f14496i;

    /* renamed from: j */
    public final a f14497j;

    /* renamed from: k */
    public EGLDisplay f14498k;

    /* renamed from: l */
    public EGLContext f14499l;

    /* renamed from: m */
    public EGLSurface f14500m;

    /* renamed from: n */
    public SurfaceTexture f14501n;

    /* renamed from: p5.j$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m15358a();
    }

    public RunnableC4032j(Handler handler) {
        this(handler, null);
    }

    public RunnableC4032j(Handler handler, a aVar) {
        this.f14495h = handler;
        this.f14497j = aVar;
        this.f14496i = new int[1];
    }

    /* renamed from: a */
    public static EGLConfig m15349a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f14494o, 0, eGLConfigArr, 0, 1, iArr, 0);
        C4038m.m15390b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, C4041n0.m15397C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    public static EGLContext m15350b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C4038m.m15390b(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    /* renamed from: c */
    public static EGLSurface m15351c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C4038m.m15390b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        C4038m.m15390b(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    /* renamed from: e */
    public static void m15352e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C4038m.m15389a();
    }

    /* renamed from: f */
    public static EGLDisplay m15353f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C4038m.m15390b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C4038m.m15390b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    /* renamed from: d */
    public final void m15354d() {
        a aVar = this.f14497j;
        if (aVar != null) {
            aVar.m15358a();
        }
    }

    /* renamed from: g */
    public SurfaceTexture m15355g() {
        return (SurfaceTexture) C4014a.m15199e(this.f14501n);
    }

    /* renamed from: h */
    public void m15356h(int i10) {
        EGLDisplay m15353f = m15353f();
        this.f14498k = m15353f;
        EGLConfig m15349a = m15349a(m15353f);
        EGLContext m15350b = m15350b(this.f14498k, m15349a, i10);
        this.f14499l = m15350b;
        this.f14500m = m15351c(this.f14498k, m15349a, m15350b, i10);
        m15352e(this.f14496i);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14496i[0]);
        this.f14501n = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* renamed from: i */
    public void m15357i() {
        this.f14495h.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f14501n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f14496i, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f14498k;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f14498k;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f14500m;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f14498k, this.f14500m);
            }
            EGLContext eGLContext = this.f14499l;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f14498k, eGLContext);
            }
            if (C4041n0.f14513a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f14498k;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f14498k);
            }
            this.f14498k = null;
            this.f14499l = null;
            this.f14500m = null;
            this.f14501n = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14495h.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m15354d();
        SurfaceTexture surfaceTexture = this.f14501n;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
