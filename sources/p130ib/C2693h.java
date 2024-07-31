package p130ib;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import ma.C3593b;
import na.C3782a;
import p113hb.C2474s;
import p113hb.C2475t;

/* renamed from: ib.h */
/* loaded from: classes.dex */
public final class C2693h {

    /* renamed from: n */
    public static final String f10528n = "h";

    /* renamed from: a */
    public Camera f10529a;

    /* renamed from: b */
    public Camera.CameraInfo f10530b;

    /* renamed from: c */
    public C2686a f10531c;

    /* renamed from: d */
    public C3593b f10532d;

    /* renamed from: e */
    public boolean f10533e;

    /* renamed from: f */
    public String f10534f;

    /* renamed from: h */
    public C2698m f10536h;

    /* renamed from: i */
    public C2474s f10537i;

    /* renamed from: j */
    public C2474s f10538j;

    /* renamed from: l */
    public Context f10540l;

    /* renamed from: g */
    public C2694i f10535g = new C2694i();

    /* renamed from: k */
    public int f10539k = -1;

    /* renamed from: m */
    public final a f10541m = new a();

    /* renamed from: ib.h$a */
    /* loaded from: classes.dex */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a */
        public InterfaceC2701p f10542a;

        /* renamed from: b */
        public C2474s f10543b;

        public a() {
        }

        /* renamed from: a */
        public void m10987a(InterfaceC2701p interfaceC2701p) {
            this.f10542a = interfaceC2701p;
        }

        /* renamed from: b */
        public void m10988b(C2474s c2474s) {
            this.f10543b = c2474s;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            C2474s c2474s = this.f10543b;
            InterfaceC2701p interfaceC2701p = this.f10542a;
            if (c2474s == null || interfaceC2701p == null) {
                Log.d(C2693h.f10528n, "Got preview callback, but no handler or resolution available");
                if (interfaceC2701p == null) {
                    return;
                } else {
                    e10 = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    C2475t c2475t = new C2475t(bArr, c2474s.f9897h, c2474s.f9898i, camera.getParameters().getPreviewFormat(), C2693h.this.m10971f());
                    if (C2693h.this.f10530b.facing == 1) {
                        c2475t.m9871e(true);
                    }
                    interfaceC2701p.mo9847a(c2475t);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(C2693h.f10528n, "Camera preview failed", e10);
                }
            }
            interfaceC2701p.mo9848b(e10);
        }
    }

    public C2693h(Context context) {
        this.f10540l = context;
    }

    /* renamed from: i */
    public static List<C2474s> m10967i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new C2474s(previewSize.width, previewSize.height);
                arrayList.add(new C2474s(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new C2474s(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final int m10968c() {
        int m11011c = this.f10536h.m11011c();
        int i10 = 0;
        if (m11011c != 0) {
            if (m11011c == 1) {
                i10 = 90;
            } else if (m11011c == 2) {
                i10 = 180;
            } else if (m11011c == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f10530b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        Log.i(f10528n, "Camera Display Orientation: " + i13);
        return i13;
    }

    /* renamed from: d */
    public void m10969d() {
        Camera camera = this.f10529a;
        if (camera != null) {
            camera.release();
            this.f10529a = null;
        }
    }

    /* renamed from: e */
    public void m10970e() {
        if (this.f10529a == null) {
            throw new RuntimeException("Camera not open");
        }
        m10982r();
    }

    /* renamed from: f */
    public int m10971f() {
        return this.f10539k;
    }

    /* renamed from: g */
    public final Camera.Parameters m10972g() {
        Camera.Parameters parameters = this.f10529a.getParameters();
        String str = this.f10534f;
        if (str == null) {
            this.f10534f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    /* renamed from: h */
    public C2474s m10973h() {
        if (this.f10538j == null) {
            return null;
        }
        return m10974j() ? this.f10538j.m9864c() : this.f10538j;
    }

    /* renamed from: j */
    public boolean m10974j() {
        int i10 = this.f10539k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: k */
    public boolean m10975k() {
        String flashMode;
        Camera.Parameters parameters = this.f10529a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* renamed from: l */
    public void m10976l() {
        Camera m14391b = C3782a.m14391b(this.f10535g.m10990b());
        this.f10529a = m14391b;
        if (m14391b == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int m14390a = C3782a.m14390a(this.f10535g.m10990b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f10530b = cameraInfo;
        Camera.getCameraInfo(m14390a, cameraInfo);
    }

    /* renamed from: m */
    public void m10977m(InterfaceC2701p interfaceC2701p) {
        Camera camera = this.f10529a;
        if (camera == null || !this.f10533e) {
            return;
        }
        this.f10541m.m10987a(interfaceC2701p);
        camera.setOneShotPreviewCallback(this.f10541m);
    }

    /* renamed from: n */
    public final void m10978n(int i10) {
        this.f10529a.setDisplayOrientation(i10);
    }

    /* renamed from: o */
    public void m10979o(C2694i c2694i) {
        this.f10535g = c2694i;
    }

    /* renamed from: p */
    public final void m10980p(boolean z10) {
        Camera.Parameters m10972g = m10972g();
        if (m10972g == null) {
            Log.w(f10528n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f10528n;
        Log.i(str, "Initial camera parameters: " + m10972g.flatten());
        if (z10) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        C2688c.m10928g(m10972g, this.f10535g.m10989a(), z10);
        if (!z10) {
            C2688c.m10932k(m10972g, false);
            if (this.f10535g.m10996h()) {
                C2688c.m10930i(m10972g);
            }
            if (this.f10535g.m10993e()) {
                C2688c.m10924c(m10972g);
            }
            if (this.f10535g.m10995g()) {
                C2688c.m10933l(m10972g);
                C2688c.m10929h(m10972g);
                C2688c.m10931j(m10972g);
            }
        }
        List<C2474s> m10967i = m10967i(m10972g);
        if (m10967i.size() == 0) {
            this.f10537i = null;
        } else {
            C2474s m11009a = this.f10536h.m11009a(m10967i, m10974j());
            this.f10537i = m11009a;
            m10972g.setPreviewSize(m11009a.f9897h, m11009a.f9898i);
        }
        if (Build.DEVICE.equals("glass-1")) {
            C2688c.m10926e(m10972g);
        }
        Log.i(str, "Final camera parameters: " + m10972g.flatten());
        this.f10529a.setParameters(m10972g);
    }

    /* renamed from: q */
    public void m10981q(C2698m c2698m) {
        this.f10536h = c2698m;
    }

    /* renamed from: r */
    public final void m10982r() {
        try {
            int m10968c = m10968c();
            this.f10539k = m10968c;
            m10978n(m10968c);
        } catch (Exception unused) {
            Log.w(f10528n, "Failed to set rotation.");
        }
        try {
            m10980p(false);
        } catch (Exception unused2) {
            try {
                m10980p(true);
            } catch (Exception unused3) {
                Log.w(f10528n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f10529a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f10538j = this.f10537i;
        } else {
            this.f10538j = new C2474s(previewSize.width, previewSize.height);
        }
        this.f10541m.m10988b(this.f10538j);
    }

    /* renamed from: s */
    public void m10983s(C2695j c2695j) {
        c2695j.m11000a(this.f10529a);
    }

    /* renamed from: t */
    public void m10984t(boolean z10) {
        if (this.f10529a != null) {
            try {
                if (z10 != m10975k()) {
                    C2686a c2686a = this.f10531c;
                    if (c2686a != null) {
                        c2686a.m10919j();
                    }
                    Camera.Parameters parameters = this.f10529a.getParameters();
                    C2688c.m10932k(parameters, z10);
                    if (this.f10535g.m10994f()) {
                        C2688c.m10925d(parameters, z10);
                    }
                    this.f10529a.setParameters(parameters);
                    C2686a c2686a2 = this.f10531c;
                    if (c2686a2 != null) {
                        c2686a2.m10918i();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(f10528n, "Failed to set torch", e10);
            }
        }
    }

    /* renamed from: u */
    public void m10985u() {
        Camera camera = this.f10529a;
        if (camera == null || this.f10533e) {
            return;
        }
        camera.startPreview();
        this.f10533e = true;
        this.f10531c = new C2686a(this.f10529a, this.f10535g);
        C3593b c3593b = new C3593b(this.f10540l, this, this.f10535g);
        this.f10532d = c3593b;
        c3593b.m13320d();
    }

    /* renamed from: v */
    public void m10986v() {
        C2686a c2686a = this.f10531c;
        if (c2686a != null) {
            c2686a.m10919j();
            this.f10531c = null;
        }
        C3593b c3593b = this.f10532d;
        if (c3593b != null) {
            c3593b.m13321e();
            this.f10532d = null;
        }
        Camera camera = this.f10529a;
        if (camera == null || !this.f10533e) {
            return;
        }
        camera.stopPreview();
        this.f10541m.m10987a(null);
        this.f10533e = false;
    }
}
