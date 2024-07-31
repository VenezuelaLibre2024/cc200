package p130ib;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

/* renamed from: ib.j */
/* loaded from: classes.dex */
public class C2695j {

    /* renamed from: a */
    public SurfaceHolder f10559a;

    /* renamed from: b */
    public SurfaceTexture f10560b;

    public C2695j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        this.f10560b = surfaceTexture;
    }

    public C2695j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f10559a = surfaceHolder;
    }

    /* renamed from: a */
    public void m11000a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f10559a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f10560b);
        }
    }
}
