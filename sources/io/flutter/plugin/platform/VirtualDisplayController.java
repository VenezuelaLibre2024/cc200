package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(20)
/* loaded from: classes2.dex */
public class VirtualDisplayController {
    private static String TAG = "VirtualDisplayController";
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private final Context context;
    private final int densityDpi;
    private final View.OnFocusChangeListener focusChangeListener;
    public SingleViewPresentation presentation;
    private final PlatformViewRenderTarget renderTarget;
    private final int viewId;
    private VirtualDisplay virtualDisplay;

    /* loaded from: classes2.dex */
    public static class OneTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {
        public Runnable mOnDrawRunnable;
        public final View mView;

        public OneTimeOnDrawListener(View view, Runnable runnable) {
            this.mView = view;
            this.mOnDrawRunnable = runnable;
        }

        public static void schedule(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new OneTimeOnDrawListener(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.mOnDrawRunnable;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.mOnDrawRunnable = null;
            this.mView.post(new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
                @Override // java.lang.Runnable
                public void run() {
                    OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener(OneTimeOnDrawListener.this);
                }
            });
        }
    }

    private VirtualDisplayController(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, VirtualDisplay virtualDisplay, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, View.OnFocusChangeListener onFocusChangeListener, int i10, Object obj) {
        this.context = context;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.renderTarget = platformViewRenderTarget;
        this.focusChangeListener = onFocusChangeListener;
        this.viewId = i10;
        this.virtualDisplay = virtualDisplay;
        this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.virtualDisplay.getDisplay(), platformView, accessibilityEventsDelegate, i10, onFocusChangeListener);
        this.presentation = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static VirtualDisplayController create(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, PlatformView platformView, PlatformViewRenderTarget platformViewRenderTarget, int i10, int i11, int i12, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i10 == 0 || i11 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        platformViewRenderTarget.resize(i10, i11);
        VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i12, i10, i11, displayMetrics.densityDpi, platformViewRenderTarget.getSurface(), 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new VirtualDisplayController(context, accessibilityEventsDelegate, createVirtualDisplay, platformView, platformViewRenderTarget, onFocusChangeListener, i12, obj);
    }

    public void dispatchTouchEvent(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void dispose() {
        this.presentation.cancel();
        this.presentation.detachState();
        this.virtualDisplay.release();
        this.renderTarget.release();
    }

    public int getRenderTargetHeight() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getWidth();
        }
        return 0;
    }

    public View getView() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    public void onFlutterViewAttached(View view) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewAttached(view);
    }

    public void onFlutterViewDetached() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewDetached();
    }

    public void onInputConnectionLocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionLocked();
    }

    public void onInputConnectionUnlocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionUnlocked();
    }

    public void resize(int i10, int i11, final Runnable runnable) {
        boolean isFocused = getView().isFocused();
        SingleViewPresentation.PresentationState detachState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        this.renderTarget.resize(i10, i11);
        this.virtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + this.viewId, i10, i11, this.densityDpi, this.renderTarget.getSurface(), 0);
        final View view = getView();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                OneTimeOnDrawListener.schedule(view, new Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewOnAttachStateChangeListenerC27911 viewOnAttachStateChangeListenerC27911 = ViewOnAttachStateChangeListenerC27911.this;
                        view.postDelayed(runnable, 128L);
                    }
                });
                view.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
            }
        });
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, detachState, this.focusChangeListener, isFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }
}
