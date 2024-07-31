package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import androidx.annotation.Keep;

/* loaded from: classes2.dex */
public interface TextureRegistry {

    @Keep
    /* loaded from: classes2.dex */
    public interface ImageTextureEntry extends TextureEntry {
        Image acquireLatestImage();

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        /* renamed from: id */
        long mo11061id();

        void pushImage(Image image);

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        void release();
    }

    /* loaded from: classes2.dex */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* loaded from: classes2.dex */
    public interface OnTrimMemoryListener {
        void onTrimMemory(int i10);
    }

    /* loaded from: classes2.dex */
    public interface SurfaceTextureEntry extends TextureEntry {
        @Override // io.flutter.view.TextureRegistry.TextureEntry
        /* renamed from: id */
        long mo11061id();

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        void release();

        default void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener) {
        }

        SurfaceTexture surfaceTexture();
    }

    /* loaded from: classes2.dex */
    public interface TextureEntry {
        /* renamed from: id */
        long mo11061id();

        void release();
    }

    ImageTextureEntry createImageTexture();

    SurfaceTextureEntry createSurfaceTexture();

    default void onTrimMemory(int i10) {
    }

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
}
