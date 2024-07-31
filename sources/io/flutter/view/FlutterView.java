package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.Log;
import io.flutter.app.FlutterPluginRegistry;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.common.ActivityLifecycleListener;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
/* loaded from: classes2.dex */
public class FlutterView extends SurfaceView implements BinaryMessenger, TextureRegistry, MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate {
    private static final String TAG = "FlutterView";
    private final AndroidTouchProcessor androidTouchProcessor;
    private final DartExecutor dartExecutor;
    private boolean didRenderFirstFrame;
    private final FlutterRenderer flutterRenderer;
    private final LifecycleChannel lifecycleChannel;
    private final LocalizationChannel localizationChannel;
    private AccessibilityBridge mAccessibilityNodeProvider;
    private final List<ActivityLifecycleListener> mActivityLifecycleListeners;
    private final List<FirstFrameListener> mFirstFrameListeners;
    private final InputMethodManager mImm;
    private boolean mIsSoftwareRenderingEnabled;
    private final KeyboardManager mKeyboardManager;
    private final LocalizationPlugin mLocalizationPlugin;
    private final ViewportMetrics mMetrics;
    private final MouseCursorPlugin mMouseCursorPlugin;
    private FlutterNativeView mNativeView;
    private final SurfaceHolder.Callback mSurfaceCallback;
    private final TextInputPlugin mTextInputPlugin;
    private final NavigationChannel navigationChannel;
    private final AtomicLong nextTextureId;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformChannel platformChannel;
    private final SettingsChannel settingsChannel;
    private final SystemChannel systemChannel;

    /* renamed from: io.flutter.view.FlutterView$1 */
    /* loaded from: classes2.dex */
    public class C31901 implements AccessibilityBridge.OnAccessibilityChangeListener {
        public C31901() {
        }

        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
        public void onAccessibilityChanged(boolean z10, boolean z11) {
            FlutterView.this.resetWillNotDraw(z10, z11);
        }
    }

    /* renamed from: io.flutter.view.FlutterView$2 */
    /* loaded from: classes2.dex */
    public class SurfaceHolderCallbackC31912 implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC31912() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            FlutterView.this.assertAttached();
            FlutterView.this.mNativeView.getFlutterJNI().onSurfaceChanged(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            FlutterView.this.assertAttached();
            FlutterView.this.mNativeView.getFlutterJNI().onSurfaceCreated(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            FlutterView.this.assertAttached();
            FlutterView.this.mNativeView.getFlutterJNI().onSurfaceDestroyed();
        }
    }

    /* renamed from: io.flutter.view.FlutterView$3 */
    /* loaded from: classes2.dex */
    public class C31923 implements ActivityLifecycleListener {
        public final /* synthetic */ PlatformPlugin val$platformPlugin;

        public C31923(PlatformPlugin platformPlugin) {
            r2 = platformPlugin;
        }

        @Override // io.flutter.plugin.common.ActivityLifecycleListener
        public void onPostResume() {
            r2.updateSystemUiOverlays();
        }
    }

    /* loaded from: classes2.dex */
    public interface FirstFrameListener {
        void onFirstFrame();
    }

    /* loaded from: classes2.dex */
    public interface Provider {
        FlutterView getFlutterView();
    }

    /* loaded from: classes2.dex */
    public final class SurfaceTextureRegistryEntry implements TextureRegistry.SurfaceTextureEntry {

        /* renamed from: id */
        private final long f11025id;
        private SurfaceTexture.OnFrameAvailableListener onFrameListener = new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.view.FlutterView.SurfaceTextureRegistryEntry.1
            public C31931() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (SurfaceTextureRegistryEntry.this.released || FlutterView.this.mNativeView == null) {
                    return;
                }
                FlutterView.this.mNativeView.getFlutterJNI().markTextureFrameAvailable(SurfaceTextureRegistryEntry.this.f11025id);
            }
        };
        private boolean released;
        private final SurfaceTextureWrapper textureWrapper;

        /* renamed from: io.flutter.view.FlutterView$SurfaceTextureRegistryEntry$1 */
        /* loaded from: classes2.dex */
        public class C31931 implements SurfaceTexture.OnFrameAvailableListener {
            public C31931() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (SurfaceTextureRegistryEntry.this.released || FlutterView.this.mNativeView == null) {
                    return;
                }
                FlutterView.this.mNativeView.getFlutterJNI().markTextureFrameAvailable(SurfaceTextureRegistryEntry.this.f11025id);
            }
        }

        public SurfaceTextureRegistryEntry(long j10, SurfaceTexture surfaceTexture) {
            this.f11025id = j10;
            this.textureWrapper = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                surfaceTexture().setOnFrameAvailableListener(this.onFrameListener, new Handler());
            } else {
                surfaceTexture().setOnFrameAvailableListener(this.onFrameListener);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry, io.flutter.view.TextureRegistry.TextureEntry
        /* renamed from: id */
        public long mo11061id() {
            return this.f11025id;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry, io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            surfaceTexture().setOnFrameAvailableListener(null);
            this.textureWrapper.release();
            FlutterView.this.mNativeView.getFlutterJNI().unregisterTexture(this.f11025id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ViewportMetrics {
        public float devicePixelRatio = 1.0f;
        public int physicalWidth = 0;
        public int physicalHeight = 0;
        public int physicalViewPaddingTop = 0;
        public int physicalViewPaddingRight = 0;
        public int physicalViewPaddingBottom = 0;
        public int physicalViewPaddingLeft = 0;
        public int physicalViewInsetTop = 0;
        public int physicalViewInsetRight = 0;
        public int physicalViewInsetBottom = 0;
        public int physicalViewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
    }

    /* loaded from: classes2.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, null);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public FlutterView(Context context, AttributeSet attributeSet, FlutterNativeView flutterNativeView) {
        super(context, attributeSet);
        this.nextTextureId = new AtomicLong(0L);
        this.mIsSoftwareRenderingEnabled = false;
        this.didRenderFirstFrame = false;
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.view.FlutterView.1
            public C31901() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        Activity activity = ViewUtils.getActivity(getContext());
        if (activity == null) {
            throw new IllegalArgumentException("Bad context");
        }
        this.mNativeView = flutterNativeView == null ? new FlutterNativeView(activity.getApplicationContext()) : flutterNativeView;
        DartExecutor dartExecutor = this.mNativeView.getDartExecutor();
        this.dartExecutor = dartExecutor;
        FlutterRenderer flutterRenderer = new FlutterRenderer(this.mNativeView.getFlutterJNI());
        this.flutterRenderer = flutterRenderer;
        this.mIsSoftwareRenderingEnabled = this.mNativeView.getFlutterJNI().getIsSoftwareRenderingEnabled();
        ViewportMetrics viewportMetrics = new ViewportMetrics();
        this.mMetrics = viewportMetrics;
        viewportMetrics.devicePixelRatio = context.getResources().getDisplayMetrics().density;
        viewportMetrics.physicalTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mNativeView.attachViewAndActivity(this, activity);
        SurfaceHolderCallbackC31912 surfaceHolderCallbackC31912 = new SurfaceHolder.Callback() { // from class: io.flutter.view.FlutterView.2
            public SurfaceHolderCallbackC31912() {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
                FlutterView.this.assertAttached();
                FlutterView.this.mNativeView.getFlutterJNI().onSurfaceChanged(i11, i12);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                FlutterView.this.assertAttached();
                FlutterView.this.mNativeView.getFlutterJNI().onSurfaceCreated(surfaceHolder.getSurface());
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                FlutterView.this.assertAttached();
                FlutterView.this.mNativeView.getFlutterJNI().onSurfaceDestroyed();
            }
        };
        this.mSurfaceCallback = surfaceHolderCallbackC31912;
        getHolder().addCallback(surfaceHolderCallbackC31912);
        this.mActivityLifecycleListeners = new ArrayList();
        this.mFirstFrameListeners = new ArrayList();
        this.navigationChannel = new NavigationChannel(dartExecutor);
        this.lifecycleChannel = new LifecycleChannel(dartExecutor);
        LocalizationChannel localizationChannel = new LocalizationChannel(dartExecutor);
        this.localizationChannel = localizationChannel;
        PlatformChannel platformChannel = new PlatformChannel(dartExecutor);
        this.platformChannel = platformChannel;
        this.systemChannel = new SystemChannel(dartExecutor);
        this.settingsChannel = new SettingsChannel(dartExecutor);
        addActivityLifecycleListener(new ActivityLifecycleListener() { // from class: io.flutter.view.FlutterView.3
            public final /* synthetic */ PlatformPlugin val$platformPlugin;

            public C31923(PlatformPlugin platformPlugin) {
                r2 = platformPlugin;
            }

            @Override // io.flutter.plugin.common.ActivityLifecycleListener
            public void onPostResume() {
                r2.updateSystemUiOverlays();
            }
        });
        this.mImm = (InputMethodManager) getContext().getSystemService("input_method");
        PlatformViewsController platformViewsController = this.mNativeView.getPluginRegistry().getPlatformViewsController();
        TextInputPlugin textInputPlugin = new TextInputPlugin(this, new TextInputChannel(dartExecutor), platformViewsController);
        this.mTextInputPlugin = textInputPlugin;
        this.mKeyboardManager = new KeyboardManager(this);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mMouseCursorPlugin = new MouseCursorPlugin(this, new MouseCursorChannel(dartExecutor));
        } else {
            this.mMouseCursorPlugin = null;
        }
        LocalizationPlugin localizationPlugin = new LocalizationPlugin(context, localizationChannel);
        this.mLocalizationPlugin = localizationPlugin;
        this.androidTouchProcessor = new AndroidTouchProcessor(flutterRenderer, false);
        platformViewsController.attachToFlutterRenderer(flutterRenderer);
        this.mNativeView.getPluginRegistry().getPlatformViewsController().attachTextInputPlugin(textInputPlugin);
        this.mNativeView.getFlutterJNI().setLocalizationPlugin(localizationPlugin);
        localizationPlugin.sendLocalesToFlutter(getResources().getConfiguration());
        sendUserPlatformSettingsToDart();
    }

    private ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        int i10 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i10 == 2) {
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? ZeroSides.LEFT : ZeroSides.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    @TargetApi(20)
    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private boolean isAttached() {
        FlutterNativeView flutterNativeView = this.mNativeView;
        return flutterNativeView != null && flutterNativeView.isAttached();
    }

    private void postRun() {
    }

    private void preRun() {
        resetAccessibilityTree();
    }

    private void releaseAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null) {
            accessibilityBridge.release();
            this.mAccessibilityNodeProvider = null;
        }
    }

    public void resetWillNotDraw(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.mIsSoftwareRenderingEnabled && !z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    private void sendUserPlatformSettingsToDart() {
        this.settingsChannel.startMessage().setTextScaleFactor(getResources().getConfiguration().fontScale).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness((getResources().getConfiguration().uiMode & 48) == 32 ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light).send();
    }

    private void updateViewportMetrics() {
        if (isAttached()) {
            FlutterJNI flutterJNI = this.mNativeView.getFlutterJNI();
            ViewportMetrics viewportMetrics = this.mMetrics;
            flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.physicalWidth, viewportMetrics.physicalHeight, viewportMetrics.physicalViewPaddingTop, viewportMetrics.physicalViewPaddingRight, viewportMetrics.physicalViewPaddingBottom, viewportMetrics.physicalViewPaddingLeft, viewportMetrics.physicalViewInsetTop, viewportMetrics.physicalViewInsetRight, viewportMetrics.physicalViewInsetBottom, viewportMetrics.physicalViewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, new int[0], new int[0], new int[0]);
        }
    }

    public void addActivityLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        this.mActivityLifecycleListeners.add(activityLifecycleListener);
    }

    public void addFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.add(firstFrameListener);
    }

    public void assertAttached() {
        if (!isAttached()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.mTextInputPlugin.autofill(sparseArray);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return this.mNativeView.getPluginRegistry().getPlatformViewsController().checkInputConnectionProxy(view);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry createImageTexture() {
        throw new UnsupportedOperationException("Image textures are not supported in this mode.");
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        return registerSurfaceTexture(new SurfaceTexture(0));
    }

    public void destroy() {
        if (isAttached()) {
            getHolder().removeCallback(this.mSurfaceCallback);
            releaseAccessibilityNodeProvider();
            this.mNativeView.destroy();
            this.mNativeView = null;
        }
    }

    public FlutterNativeView detach() {
        if (!isAttached()) {
            return null;
        }
        getHolder().removeCallback(this.mSurfaceCallback);
        this.mNativeView.detachFromFlutterView();
        FlutterNativeView flutterNativeView = this.mNativeView;
        this.mNativeView = null;
        return flutterNativeView;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void disableBufferingIncomingMessages() {
    }

    public void disableTransparentBackground() {
        setZOrderOnTop(false);
        getHolder().setFormat(-1);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Log.m11041e(TAG, "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttached() && this.mKeyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void enableBufferingIncomingMessages() {
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        ViewportMetrics viewportMetrics = this.mMetrics;
        viewportMetrics.physicalViewPaddingTop = rect.top;
        viewportMetrics.physicalViewPaddingRight = rect.right;
        viewportMetrics.physicalViewPaddingBottom = 0;
        viewportMetrics.physicalViewPaddingLeft = rect.left;
        viewportMetrics.physicalViewInsetTop = 0;
        viewportMetrics.physicalViewInsetRight = 0;
        viewportMetrics.physicalViewInsetBottom = rect.bottom;
        viewportMetrics.physicalViewInsetLeft = 0;
        updateViewportMetrics();
        return true;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.mAccessibilityNodeProvider;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public BinaryMessenger getBinaryMessenger() {
        return this;
    }

    public Bitmap getBitmap() {
        assertAttached();
        return this.mNativeView.getFlutterJNI().getBitmap();
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    public float getDevicePixelRatio() {
        return this.mMetrics.devicePixelRatio;
    }

    public FlutterNativeView getFlutterNativeView() {
        return this.mNativeView;
    }

    public String getLookupKeyForAsset(String str) {
        return FlutterMain.getLookupKeyForAsset(str);
    }

    public String getLookupKeyForAsset(String str, String str2) {
        return FlutterMain.getLookupKeyForAsset(str, str2);
    }

    public FlutterPluginRegistry getPluginRegistry() {
        return this.mNativeView.getPluginRegistry();
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    @TargetApi(24)
    public PointerIcon getSystemPointerIcon(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public boolean hasRenderedFirstFrame() {
        return this.didRenderFirstFrame;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return null;
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            ViewportMetrics viewportMetrics = this.mMetrics;
            viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
            viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
            viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
            viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
        }
        boolean z10 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z11 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i10 >= 30) {
            int navigationBars = z11 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z10) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            ViewportMetrics viewportMetrics2 = this.mMetrics;
            viewportMetrics2.physicalViewPaddingTop = insets.top;
            viewportMetrics2.physicalViewPaddingRight = insets.right;
            viewportMetrics2.physicalViewPaddingBottom = insets.bottom;
            viewportMetrics2.physicalViewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            ViewportMetrics viewportMetrics3 = this.mMetrics;
            viewportMetrics3.physicalViewInsetTop = insets2.top;
            viewportMetrics3.physicalViewInsetRight = insets2.right;
            viewportMetrics3.physicalViewInsetBottom = insets2.bottom;
            viewportMetrics3.physicalViewInsetLeft = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            ViewportMetrics viewportMetrics4 = this.mMetrics;
            viewportMetrics4.systemGestureInsetTop = insets3.top;
            viewportMetrics4.systemGestureInsetRight = insets3.right;
            viewportMetrics4.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics4.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                ViewportMetrics viewportMetrics5 = this.mMetrics;
                viewportMetrics5.physicalViewPaddingTop = Math.max(Math.max(viewportMetrics5.physicalViewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                ViewportMetrics viewportMetrics6 = this.mMetrics;
                viewportMetrics6.physicalViewPaddingRight = Math.max(Math.max(viewportMetrics6.physicalViewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                ViewportMetrics viewportMetrics7 = this.mMetrics;
                viewportMetrics7.physicalViewPaddingBottom = Math.max(Math.max(viewportMetrics7.physicalViewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                ViewportMetrics viewportMetrics8 = this.mMetrics;
                viewportMetrics8.physicalViewPaddingLeft = Math.max(Math.max(viewportMetrics8.physicalViewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z11) {
                zeroSides = calculateShouldZeroSides();
            }
            this.mMetrics.physicalViewPaddingTop = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.mMetrics.physicalViewPaddingRight = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.mMetrics.physicalViewPaddingBottom = (z11 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.mMetrics.physicalViewPaddingLeft = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            ViewportMetrics viewportMetrics9 = this.mMetrics;
            viewportMetrics9.physicalViewInsetTop = 0;
            viewportMetrics9.physicalViewInsetRight = 0;
            viewportMetrics9.physicalViewInsetBottom = guessBottomKeyboardInset(windowInsets);
            this.mMetrics.physicalViewInsetLeft = 0;
        }
        updateViewportMetrics();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, new AccessibilityChannel(this.dartExecutor, getFlutterNativeView().getFlutterJNI()), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().getPlatformViewsController());
        this.mAccessibilityNodeProvider = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.mAccessibilityNodeProvider.isAccessibilityEnabled(), this.mAccessibilityNodeProvider.isTouchExplorationEnabled());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mLocalizationPlugin.sendLocalesToFlutter(configuration);
        sendUserPlatformSettingsToDart();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mTextInputPlugin.createInputConnection(this, this.mKeyboardManager, editorInfo);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        releaseAccessibilityNodeProvider();
    }

    public void onFirstFrame() {
        this.didRenderFirstFrame = true;
        Iterator it = new ArrayList(this.mFirstFrameListeners).iterator();
        while (it.hasNext()) {
            ((FirstFrameListener) it.next()).onFirstFrame();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttached() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttached() ? super.onHoverEvent(motionEvent) : this.mAccessibilityNodeProvider.onAccessibilityHoverEvent(motionEvent);
    }

    public void onMemoryPressure() {
        this.mNativeView.getFlutterJNI().notifyLowMemoryWarning();
        this.systemChannel.sendMemoryPressureWarning();
    }

    public void onPause() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onPostResume() {
        Iterator<ActivityLifecycleListener> it = this.mActivityLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPostResume();
        }
        this.lifecycleChannel.appIsResumed();
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.mTextInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        ViewportMetrics viewportMetrics = this.mMetrics;
        viewportMetrics.physicalWidth = i10;
        viewportMetrics.physicalHeight = i11;
        updateViewportMetrics();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void onStart() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onStop() {
        this.lifecycleChannel.appIsPaused();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
        return this.mTextInputPlugin.handleKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttached()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    public void popRoute() {
        this.navigationChannel.popRoute();
    }

    public void pushRoute(String str) {
        this.navigationChannel.pushRoute(str);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        this.mNativeView.getFlutterJNI().registerTexture(surfaceTextureRegistryEntry.mo11061id(), surfaceTextureRegistryEntry.textureWrapper());
        return surfaceTextureRegistryEntry;
    }

    public void removeFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.remove(firstFrameListener);
    }

    public void resetAccessibilityTree() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null) {
            accessibilityBridge.reset();
        }
    }

    public void runFromBundle(FlutterRunArguments flutterRunArguments) {
        assertAttached();
        preRun();
        this.mNativeView.runFromBundle(flutterRunArguments);
        postRun();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(String str, ByteBuffer byteBuffer) {
        send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        if (isAttached()) {
            this.mNativeView.send(str, byteBuffer, binaryReply);
            return;
        }
        Log.m11039d(TAG, "FlutterView.send called on a detached view, channel=" + str);
    }

    public void setInitialRoute(String str) {
        this.navigationChannel.setInitialRoute(str);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.mNativeView.setMessageHandler(str, binaryMessageHandler);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.mNativeView.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }
}
