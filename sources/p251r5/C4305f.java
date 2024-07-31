package p251r5;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p236q5.InterfaceC4177j;

/* renamed from: r5.f */
/* loaded from: classes.dex */
public final class C4305f extends GLSurfaceView {

    /* renamed from: h */
    public final CopyOnWriteArrayList<a> f15620h;

    /* renamed from: i */
    public final SensorManager f15621i;

    /* renamed from: j */
    public final Sensor f15622j;

    /* renamed from: k */
    public final C4302c f15623k;

    /* renamed from: l */
    public final Handler f15624l;

    /* renamed from: m */
    public final C4303d f15625m;

    /* renamed from: n */
    public SurfaceTexture f15626n;

    /* renamed from: o */
    public Surface f15627o;

    /* renamed from: p */
    public boolean f15628p;

    /* renamed from: q */
    public boolean f15629q;

    /* renamed from: r */
    public boolean f15630r;

    /* renamed from: r5.f$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: y */
        void mo16554y(Surface surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m16550b() {
        Surface surface = this.f15627o;
        if (surface != null) {
            Iterator<a> it = this.f15620h.iterator();
            while (it.hasNext()) {
                it.next().mo16554y(surface);
            }
        }
        m16551c(this.f15626n, surface);
        this.f15626n = null;
        this.f15627o = null;
    }

    /* renamed from: c */
    public static void m16551c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: d */
    public void m16552d(a aVar) {
        this.f15620h.remove(aVar);
    }

    /* renamed from: e */
    public final void m16553e() {
        boolean z10 = this.f15628p && this.f15629q;
        Sensor sensor = this.f15622j;
        if (sensor == null || z10 == this.f15630r) {
            return;
        }
        if (z10) {
            this.f15621i.registerListener(this.f15623k, sensor, 0);
        } else {
            this.f15621i.unregisterListener(this.f15623k);
        }
        this.f15630r = z10;
    }

    public InterfaceC4300a getCameraMotionListener() {
        return this.f15625m;
    }

    public InterfaceC4177j getVideoFrameMetadataListener() {
        return this.f15625m;
    }

    public Surface getVideoSurface() {
        return this.f15627o;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15624l.post(new Runnable() { // from class: r5.e
            @Override // java.lang.Runnable
            public final void run() {
                C4305f.this.m16550b();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f15629q = false;
        m16553e();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f15629q = true;
        m16553e();
    }

    public void setDefaultStereoMode(int i10) {
        throw null;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f15628p = z10;
        m16553e();
    }
}
