package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public class FlutterOverlaySurface {

    /* renamed from: id */
    private final int f10593id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.f10593id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f10593id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
