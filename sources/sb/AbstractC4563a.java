package sb;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import p212ob.C3978b;
import td.C4747g;
import td.C4753m;

/* renamed from: sb.a */
/* loaded from: classes.dex */
public abstract class AbstractC4563a {

    /* renamed from: a */
    public int f17200a;

    /* renamed from: b */
    public int f17201b;

    /* renamed from: c */
    public C3978b f17202c;

    /* renamed from: d */
    public EGLSurface f17203d;

    /* renamed from: f */
    public static final a f17199f = new a(null);

    /* renamed from: e */
    public static final String f17198e = AbstractC4563a.class.getSimpleName();

    /* renamed from: sb.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public AbstractC4563a(C3978b c3978b, EGLSurface eGLSurface) {
        C4753m.m18654g(c3978b, "eglCore");
        C4753m.m18654g(eGLSurface, "eglSurface");
        this.f17202c = c3978b;
        this.f17203d = eGLSurface;
        this.f17200a = -1;
        this.f17201b = -1;
    }

    /* renamed from: a */
    public final C3978b m18055a() {
        return this.f17202c;
    }

    /* renamed from: b */
    public final EGLSurface m18056b() {
        return this.f17203d;
    }

    /* renamed from: c */
    public final void m18057c() {
        this.f17202c.m15102b(this.f17203d);
    }

    /* renamed from: d */
    public void mo18058d() {
        this.f17202c.m15104d(this.f17203d);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        C4753m.m18649b(eGLSurface, "EGL14.EGL_NO_SURFACE");
        this.f17203d = eGLSurface;
        this.f17201b = -1;
        this.f17200a = -1;
    }

    /* renamed from: e */
    public final void m18059e(long j10) {
        this.f17202c.m15105e(this.f17203d, j10);
    }
}
