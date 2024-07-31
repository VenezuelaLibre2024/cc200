package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;
import java.nio.ByteBuffer;
import java.util.Locale;

@TargetApi(19)
/* loaded from: classes2.dex */
public class FlutterImageView extends View implements RenderSurface {
    private static final String TAG = "FlutterImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private FlutterRenderer flutterRenderer;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    /* renamed from: io.flutter.embedding.android.FlutterImageView$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C27141 {

        /* renamed from: $SwitchMap$io$flutter$embedding$android$FlutterImageView$SurfaceKind */
        public static final /* synthetic */ int[] f10581x435d6649;

        static {
            int[] iArr = new int[SurfaceKind.values().length];
            f10581x435d6649 = iArr;
            try {
                iArr[SurfaceKind.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10581x435d6649[SurfaceKind.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    public FlutterImageView(Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(Context context, int i10, int i11, SurfaceKind surfaceKind) {
        this(context, createImageReader(i10, i11), surfaceKind);
    }

    public FlutterImageView(Context context, ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }

    public FlutterImageView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader createImageReader(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i12, i13, 1, 3, 768L) : ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void init() {
        setAlpha(0.0f);
    }

    private static void logW(String str, Object... objArr) {
        Log.m11047w(TAG, String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void updateCurrentBitmap() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.currentImage.getHardwareBuffer();
            this.currentBitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.currentImage.getHeight();
        Bitmap bitmap = this.currentBitmap;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
            this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.currentBitmap.copyPixelsFromBuffer(buffer);
    }

    @TargetApi(19)
    public boolean acquireLatestImage() {
        if (!this.isAttachedToFlutterRenderer) {
            return false;
        }
        Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            closeCurrentImage();
            this.currentImage = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void attachToRenderer(FlutterRenderer flutterRenderer) {
        if (C27141.f10581x435d6649[this.kind.ordinal()] == 1) {
            flutterRenderer.swapSurface(this.imageReader.getSurface());
            flutterRenderer.SetRenderingToImageView(true);
        }
        setAlpha(1.0f);
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        this.imageReader.close();
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void detachFromRenderer() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(0.0f);
            acquireLatestImage();
            this.currentBitmap = null;
            closeCurrentImage();
            invalidate();
            this.isAttachedToFlutterRenderer = false;
            if (this.kind == SurfaceKind.background) {
                this.flutterRenderer.SetRenderingToImageView(false);
            }
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.imageReader.getWidth() && i11 == this.imageReader.getHeight()) && this.kind == SurfaceKind.background && this.isAttachedToFlutterRenderer) {
            resizeIfNeeded(i10, i11);
            this.flutterRenderer.swapSurface(this.imageReader.getSurface());
        }
    }

    @Override // io.flutter.embedding.engine.renderer.RenderSurface
    public void pause() {
    }

    public void resizeIfNeeded(int i10, int i11) {
        if (this.flutterRenderer == null) {
            return;
        }
        if (i10 == this.imageReader.getWidth() && i11 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i10, i11);
    }
}
