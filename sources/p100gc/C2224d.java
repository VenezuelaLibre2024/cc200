package p100gc;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import p227pb.C4108c;
import p257rb.C4339d;
import p283tb.C4737a;
import p325wb.C5472e;

/* renamed from: gc.d */
/* loaded from: classes.dex */
public class C2224d {

    /* renamed from: j */
    public static final C5472e f8838j = new C5472e(C2224d.class.getSimpleName());

    /* renamed from: a */
    public SurfaceTexture f8839a;

    /* renamed from: b */
    public Surface f8840b;

    /* renamed from: c */
    public C4339d f8841c;

    /* renamed from: d */
    public C4108c f8842d;

    /* renamed from: h */
    public boolean f8846h;

    /* renamed from: e */
    public float f8843e = 1.0f;

    /* renamed from: f */
    public float f8844f = 1.0f;

    /* renamed from: g */
    public int f8845g = 0;

    /* renamed from: i */
    public final Object f8847i = new Object();

    /* renamed from: gc.d$a */
    /* loaded from: classes.dex */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        public a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            C2224d.f8838j.m21686g("New frame available");
            synchronized (C2224d.this.f8847i) {
                if (C2224d.this.f8846h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                C2224d.this.f8846h = true;
                C2224d.this.f8847i.notifyAll();
            }
        }
    }

    public C2224d() {
        C4737a c4737a = new C4737a();
        C4339d c4339d = new C4339d();
        this.f8841c = c4339d;
        c4339d.m16628l(c4737a);
        this.f8842d = new C4108c();
        SurfaceTexture surfaceTexture = new SurfaceTexture(c4737a.m18616c());
        this.f8839a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new a());
        this.f8840b = new Surface(this.f8839a);
    }

    /* renamed from: e */
    public final void m8944e() {
        synchronized (this.f8847i) {
            do {
                if (this.f8846h) {
                    this.f8846h = false;
                } else {
                    try {
                        this.f8847i.wait(10000L);
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            } while (this.f8846h);
            throw new RuntimeException("Surface frame wait timed out");
        }
        this.f8839a.updateTexImage();
    }

    /* renamed from: f */
    public void m8945f() {
        m8944e();
        m8946g();
    }

    /* renamed from: g */
    public final void m8946g() {
        this.f8839a.getTransformMatrix(this.f8841c.m16627k());
        float f10 = 1.0f / this.f8843e;
        float f11 = 1.0f / this.f8844f;
        Matrix.translateM(this.f8841c.m16627k(), 0, (1.0f - f10) / 2.0f, (1.0f - f11) / 2.0f, 0.0f);
        Matrix.scaleM(this.f8841c.m16627k(), 0, f10, f11, 1.0f);
        Matrix.translateM(this.f8841c.m16627k(), 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.f8841c.m16627k(), 0, this.f8845g, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.f8841c.m16627k(), 0, -0.5f, -0.5f, 0.0f);
        this.f8841c.m16613a(this.f8842d);
    }

    /* renamed from: h */
    public Surface m8947h() {
        return this.f8840b;
    }

    /* renamed from: i */
    public void m8948i() {
        this.f8841c.mo16620i();
        this.f8840b.release();
        this.f8840b = null;
        this.f8839a = null;
        this.f8842d = null;
        this.f8841c = null;
    }

    /* renamed from: j */
    public void m8949j(int i10) {
        this.f8845g = i10;
    }

    /* renamed from: k */
    public void m8950k(float f10, float f11) {
        this.f8843e = f10;
        this.f8844f = f11;
    }
}
