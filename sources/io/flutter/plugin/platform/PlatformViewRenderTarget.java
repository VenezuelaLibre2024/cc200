package io.flutter.plugin.platform;

import android.graphics.Canvas;
import android.view.Surface;

/* loaded from: classes2.dex */
public interface PlatformViewRenderTarget {
    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    boolean isReleased();

    Canvas lockHardwareCanvas();

    void release();

    void resize(int i10, int i11);

    void unlockCanvasAndPost(Canvas canvas);
}
