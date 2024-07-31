package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p133j0.InterfaceC3202a;
import p345y.C5782a;

/* loaded from: classes2.dex */
public class FlutterView extends FrameLayout implements MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate {
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidTouchProcessor androidTouchProcessor;
    private FlutterEngine flutterEngine;
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    private FlutterImageView flutterImageView;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private KeyboardManager keyboardManager;
    private LocalizationPlugin localizationPlugin;
    private MouseCursorPlugin mouseCursorPlugin;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private RenderSurface previousRenderSurface;
    public RenderSurface renderSurface;
    private SpellCheckPlugin spellCheckPlugin;
    private final ContentObserver systemSettingsObserver;
    private TextInputPlugin textInputPlugin;
    private TextServicesManager textServicesManager;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;
    private final InterfaceC3202a<WindowLayoutInfo> windowInfoListener;
    private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    /* renamed from: io.flutter.embedding.android.FlutterView$1 */
    /* loaded from: classes2.dex */
    public class C27181 implements AccessibilityBridge.OnAccessibilityChangeListener {
        public C27181() {
        }

        @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
        public void onAccessibilityChanged(boolean z10, boolean z11) {
            FlutterView.this.resetWillNotDraw(z10, z11);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$2 */
    /* loaded from: classes2.dex */
    public class C27192 extends ContentObserver {
        public C27192(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (FlutterView.this.flutterEngine == null) {
                return;
            }
            Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
            FlutterView.this.sendUserSettingsToFlutter();
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$3 */
    /* loaded from: classes2.dex */
    public class C27203 implements FlutterUiDisplayListener {
        public C27203() {
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            FlutterView.this.isFlutterUiDisplayed = true;
            Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
            while (it.hasNext()) {
                ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
            FlutterView.this.isFlutterUiDisplayed = false;
            Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
            while (it.hasNext()) {
                ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$4 */
    /* loaded from: classes2.dex */
    public class C27214 implements InterfaceC3202a<WindowLayoutInfo> {
        public C27214() {
        }

        @Override // p133j0.InterfaceC3202a
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterView$5 */
    /* loaded from: classes2.dex */
    public class C27225 implements FlutterUiDisplayListener {
        public final /* synthetic */ Runnable val$onDone;
        public final /* synthetic */ FlutterRenderer val$renderer;

        public C27225(FlutterRenderer flutterRenderer, Runnable runnable) {
            r2 = flutterRenderer;
            r3 = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            r2.removeIsDisplayingFlutterUiListener(this);
            r3.run();
            FlutterView flutterView = FlutterView.this;
            if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
                return;
            }
            FlutterView.this.flutterImageView.detachFromRenderer();
            FlutterView.this.releaseImageView();
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* loaded from: classes2.dex */
    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    /* loaded from: classes2.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    @TargetApi(19)
    private FlutterView(Context context, AttributeSet attributeSet, FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            public C27181() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            public C27192(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            public C27203() {
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new InterfaceC3202a<WindowLayoutInfo>() { // from class: io.flutter.embedding.android.FlutterView.4
            public C27214() {
            }

            @Override // p133j0.InterfaceC3202a
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            public C27181() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            public C27192(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            public C27203() {
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new InterfaceC3202a<WindowLayoutInfo>() { // from class: io.flutter.embedding.android.FlutterView.4
            public C27214() {
            }

            @Override // p133j0.InterfaceC3202a
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            public C27181() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            public C27192(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            public C27203() {
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new InterfaceC3202a<WindowLayoutInfo>() { // from class: io.flutter.embedding.android.FlutterView.4
            public C27214() {
            }

            @Override // p133j0.InterfaceC3202a
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    @TargetApi(19)
    public FlutterView(Context context, FlutterImageView flutterImageView) {
        this(context, (AttributeSet) null, flutterImageView);
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        super(context, null);
        FlutterTextureView flutterTextureView;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            public C27181() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            public C27192(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            public C27203() {
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new InterfaceC3202a<WindowLayoutInfo>() { // from class: io.flutter.embedding.android.FlutterView.4
            public C27214() {
            }

            @Override // p133j0.InterfaceC3202a
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            flutterTextureView = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                throw new IllegalArgumentException(String.format("RenderMode not supported with this constructor: %s", renderMode));
            }
            FlutterTextureView flutterTextureView2 = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView2;
            flutterTextureView = flutterTextureView2;
        }
        this.renderSurface = flutterTextureView;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        super(context, null);
        FlutterTextureView flutterTextureView;
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            public C27181() {
            }

            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z10, boolean z11) {
                FlutterView.this.resetWillNotDraw(z10, z11);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            public C27192(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                Log.m11045v(FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            public C27203() {
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.windowInfoListener = new InterfaceC3202a<WindowLayoutInfo>() { // from class: io.flutter.embedding.android.FlutterView.4
            public C27214() {
            }

            @Override // p133j0.InterfaceC3202a
            public void accept(WindowLayoutInfo windowLayoutInfo) {
                FlutterView.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
            }
        };
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            flutterTextureView = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                throw new IllegalArgumentException(String.format("RenderMode not supported with this constructor: %s", renderMode));
            }
            FlutterTextureView flutterTextureView2 = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView2;
            flutterTextureView = flutterTextureView2;
        }
        this.renderSurface = flutterTextureView;
        init();
    }

    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
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

    @SuppressLint({"DiscouragedPrivateApi"})
    private View findViewByAccessibilityIdRootedAtCurrentView(int i10, View view) {
        int i11;
        Method declaredMethod;
        try {
            i11 = 0;
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, new Object[0]).equals(Integer.valueOf(i10))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i11 >= viewGroup.getChildCount()) {
                    break;
                }
                View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i10, viewGroup.getChildAt(i11));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i11++;
            }
        }
        return null;
    }

    @TargetApi(20)
    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        View view;
        Log.m11045v(TAG, "Initializing FlutterView");
        if (this.flutterSurfaceView != null) {
            Log.m11045v(TAG, "Internally using a FlutterSurfaceView.");
            view = this.flutterSurfaceView;
        } else if (this.flutterTextureView != null) {
            Log.m11045v(TAG, "Internally using a FlutterTextureView.");
            view = this.flutterTextureView;
        } else {
            Log.m11045v(TAG, "Internally using a FlutterImageView.");
            view = this.flutterImageView;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    public static /* synthetic */ boolean lambda$sendUserSettingsToFlutter$0(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void releaseImageView() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    public void resetWillNotDraw(boolean z10, boolean z11) {
        boolean z12 = false;
        if (!this.flutterEngine.getRenderer().isSoftwareRenderingEnabled() && !z10 && !z11) {
            z12 = true;
        }
        setWillNotDraw(z12);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            Log.m11047w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachOverlaySurfaceToRender(FlutterImageView flutterImageView) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine) {
        Log.m11045v(TAG, "Attaching to a FlutterEngine: " + flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                Log.m11045v(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                Log.m11045v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        FlutterRenderer renderer = flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mouseCursorPlugin = new MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
        }
        this.textInputPlugin = new TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getPlatformViewsController());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new SpellCheckPlugin(textServicesManager, this.flutterEngine.getSpellCheckChannel());
        } catch (Exception unused) {
            Log.m11041e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.keyboardManager = new KeyboardManager(this);
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        AccessibilityBridge accessibilityBridge = new AccessibilityBridge(this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.flutterEngine.getPlatformViewsController());
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        flutterEngine.getPlatformViewsController().attachToView(this);
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.textInputPlugin.autofill(sparseArray);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null ? flutterEngine.getPlatformViewsController().checkInputConnectionProxy(view) : super.checkInputConnectionProxy(view);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            FlutterImageView createImageView = createImageView();
            this.flutterImageView = createImageView;
            addView(createImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            return new WindowInfoRepositoryCallbackAdapterWrapper(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        Log.m11045v(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            Log.m11045v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineDetachedFromFlutterView();
        }
        getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
        if (spellCheckPlugin != null) {
            spellCheckPlugin.destroy();
        }
        MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
        if (mouseCursorPlugin != null) {
            mouseCursorPlugin.destroy();
        }
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.stopRenderingToSurface();
        renderer.setSemanticsEnabled(false);
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface != null && this.renderSurface == this.flutterImageView) {
            this.renderSurface = renderSurface;
        }
        this.renderSurface.detachFromRenderer();
        releaseImageView();
        this.previousRenderSurface = null;
        this.flutterEngine = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public View findViewByAccessibilityIdTraversal(int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i10, this);
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i10));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.viewPaddingTop = rect.top;
        viewportMetrics.viewPaddingRight = rect.right;
        viewportMetrics.viewPaddingBottom = 0;
        viewportMetrics.viewPaddingLeft = rect.left;
        viewportMetrics.viewInsetTop = 0;
        viewportMetrics.viewInsetRight = 0;
        viewportMetrics.viewInsetBottom = rect.bottom;
        viewportMetrics.viewInsetLeft = 0;
        Log.m11045v(TAG, "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight);
        sendViewportMetricsToFlutter();
        return true;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public BinaryMessenger getBinaryMessenger() {
        return this.flutterEngine.getDartExecutor();
    }

    public FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    @TargetApi(24)
    public PointerIcon getSystemPointerIcon(int i10) {
        return PointerIcon.getSystemIcon(getContext(), i10);
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
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
            FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
            viewportMetrics2.viewPaddingTop = insets.top;
            viewportMetrics2.viewPaddingRight = insets.right;
            viewportMetrics2.viewPaddingBottom = insets.bottom;
            viewportMetrics2.viewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
            viewportMetrics3.viewInsetTop = insets2.top;
            viewportMetrics3.viewInsetRight = insets2.right;
            viewportMetrics3.viewInsetBottom = insets2.bottom;
            viewportMetrics3.viewInsetLeft = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
            viewportMetrics4.systemGestureInsetTop = insets3.top;
            viewportMetrics4.systemGestureInsetRight = insets3.right;
            viewportMetrics4.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics4.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
                viewportMetrics5.viewPaddingTop = Math.max(Math.max(viewportMetrics5.viewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.ViewportMetrics viewportMetrics6 = this.viewportMetrics;
                viewportMetrics6.viewPaddingRight = Math.max(Math.max(viewportMetrics6.viewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.ViewportMetrics viewportMetrics7 = this.viewportMetrics;
                viewportMetrics7.viewPaddingBottom = Math.max(Math.max(viewportMetrics7.viewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.ViewportMetrics viewportMetrics8 = this.viewportMetrics;
                viewportMetrics8.viewPaddingLeft = Math.max(Math.max(viewportMetrics8.viewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSides = ZeroSides.NONE;
            if (!z11) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.viewPaddingTop = z10 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.viewPaddingRight = (zeroSides == ZeroSides.RIGHT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.viewPaddingBottom = (z11 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.viewportMetrics.viewPaddingLeft = (zeroSides == ZeroSides.LEFT || zeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.ViewportMetrics viewportMetrics9 = this.viewportMetrics;
            viewportMetrics9.viewInsetTop = 0;
            viewportMetrics9.viewInsetRight = 0;
            viewportMetrics9.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
            this.viewportMetrics.viewInsetLeft = 0;
        }
        Log.m11045v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity activity = ViewUtils.getActivity(getContext());
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper == null || activity == null) {
            return;
        }
        windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activity, C5782a.getMainExecutor(getContext()), this.windowInfoListener);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            Log.m11045v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.localizationPlugin.sendLocalesToFlutter(configuration);
            sendUserSettingsToFlutter();
            ViewUtils.calculateMaximumDisplayMetrics(getContext(), this.flutterEngine);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(this.windowInfoListener);
        }
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        super.onProvideAutofillVirtualStructure(viewStructure, i10);
        this.textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Log.m11045v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i12 + " x " + i13 + ", it is now " + i10 + " x " + i11);
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = i10;
        viewportMetrics.height = i11;
        sendViewportMetricsToFlutter();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(KeyEvent keyEvent) {
        return this.textInputPlugin.handleKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void revertImageView(Runnable runnable) {
        if (this.flutterImageView == null) {
            Log.m11045v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface == null) {
            Log.m11045v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.renderSurface = renderSurface;
        this.previousRenderSurface = null;
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        if (this.flutterEngine != null && renderer != null) {
            this.renderSurface.attachToRenderer(renderer);
            renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.5
                public final /* synthetic */ Runnable val$onDone;
                public final /* synthetic */ FlutterRenderer val$renderer;

                public C27225(FlutterRenderer renderer2, Runnable runnable2) {
                    r2 = renderer2;
                    r3 = runnable2;
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiDisplayed() {
                    r2.removeIsDisplayingFlutterUiListener(this);
                    r3.run();
                    FlutterView flutterView = FlutterView.this;
                    if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
                        return;
                    }
                    FlutterView.this.flutterImageView.detachFromRenderer();
                    FlutterView.this.releaseImageView();
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiNoLongerDisplayed() {
                }
            });
        } else {
            this.flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable2.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r3 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendUserSettingsToFlutter() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark
            goto L1c
        L1a:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.textServicesManager
            if (r3 == 0) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.a r4 = io.flutter.embedding.android.C2727a.f10583a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.textServicesManager
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L40
            if (r3 == 0) goto L40
        L3e:
            r3 = r2
            goto L41
        L40:
            r3 = r1
        L41:
            io.flutter.embedding.engine.FlutterEngine r4 = r6.flutterEngine
            io.flutter.embedding.engine.systemchannels.SettingsChannel r4 = r4.getSettingsChannel()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.startMessage()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setTextScaleFactor(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setDisplayMetrics(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r3 = r4.setNativeSpellCheckServiceDefined(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L7a
            r1 = r2
        L7a:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r3.setBrieflyShowPassword(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setUse24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r0 = r1.setPlatformBrightness(r0)
            r0.send()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.sendUserSettingsToFlutter():void");
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        RenderSurface renderSurface = this.renderSurface;
        if (renderSurface instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) renderSurface).setVisibility(i10);
        }
    }

    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            Log.m11045v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new FlutterRenderer.DisplayFeature(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.DisplayFeature(displayFeature.getBounds(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                Log.m11045v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.DisplayFeature(rect, FlutterRenderer.DisplayFeatureType.CUTOUT));
            }
        }
        this.viewportMetrics.displayFeatures = arrayList;
        sendViewportMetricsToFlutter();
    }
}
