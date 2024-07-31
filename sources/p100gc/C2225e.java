package p100gc;

import android.opengl.EGL14;
import android.view.Surface;
import p212ob.C3978b;
import sb.C4564b;

/* renamed from: gc.e */
/* loaded from: classes.dex */
public class C2225e {

    /* renamed from: a */
    public C3978b f8849a = new C3978b(EGL14.EGL_NO_CONTEXT, 1);

    /* renamed from: b */
    public C4564b f8850b;

    public C2225e(Surface surface) {
        C4564b c4564b = new C4564b(this.f8849a, surface, true);
        this.f8850b = c4564b;
        c4564b.m18057c();
    }

    /* renamed from: a */
    public void m8951a(long j10) {
        this.f8850b.m18059e(j10 * 1000);
        this.f8850b.m18060f();
    }

    /* renamed from: b */
    public void m8952b() {
        this.f8850b.mo18058d();
        this.f8849a.m15103c();
    }
}
