package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p004a2.C0038h;

/* loaded from: classes2.dex */
public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    public static final String LOG_TAG = "InAppWebView";
    public static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public MethodChannel channel;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;

    /* renamed from: id */
    public Object f5372id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    public int initialPositionScrollStoppedTask;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewOptions options;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public Integer windowId;
    public float zoomScale;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$1 */
    /* loaded from: classes2.dex */
    public class C14311 implements WebView.FindListener {
        public C14311() {
        }

        @Override // android.webkit.WebView.FindListener
        public void onFindResultReceived(int i10, int i11, boolean z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i10));
            hashMap.put("numberOfMatches", Integer.valueOf(i11));
            hashMap.put("isDoneCounting", Boolean.valueOf(z10));
            InAppWebView.this.channel.invokeMethod("onFindResultReceived", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$10 */
    /* loaded from: classes2.dex */
    public class RunnableC143210 implements Runnable {
        public final /* synthetic */ ContentWorld val$contentWorld;
        public final /* synthetic */ String val$finalScriptToInject;
        public final /* synthetic */ ValueCallback val$resultCallback;
        public final /* synthetic */ String val$resultUuid;

        /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$10$1 */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements ValueCallback<String> {
            public AnonymousClass1() {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback;
                RunnableC143210 runnableC143210 = RunnableC143210.this;
                if (r5 != null || (valueCallback = r4) == null) {
                    return;
                }
                valueCallback.onReceiveValue(str);
            }
        }

        public RunnableC143210(String str, ContentWorld contentWorld, ValueCallback valueCallback, String str2) {
            r2 = str;
            r3 = contentWorld;
            r4 = valueCallback;
            r5 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueCallback valueCallback;
            String generateCodeForScriptEvaluation = InAppWebView.this.userContentController.generateCodeForScriptEvaluation(r2, r3);
            if (Build.VERSION.SDK_INT >= 19) {
                InAppWebView.this.evaluateJavascript(generateCodeForScriptEvaluation, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.10.1
                    public AnonymousClass1() {
                    }

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str) {
                        ValueCallback valueCallback2;
                        RunnableC143210 runnableC143210 = RunnableC143210.this;
                        if (r5 != null || (valueCallback2 = r4) == null) {
                            return;
                        }
                        valueCallback2.onReceiveValue(str);
                    }
                });
                return;
            }
            InAppWebView.this.loadUrl("javascript:" + generateCodeForScriptEvaluation.replaceAll("[\r\n]+", ""));
            if (r3 == null || (valueCallback = r4) == null) {
                return;
            }
            valueCallback.onReceiveValue("");
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$11 */
    /* loaded from: classes2.dex */
    public class RunnableC143311 implements Runnable {
        public RunnableC143311() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
            if (InAppWebView.this.containerView == null || inputMethodManager == null || inputMethodManager.isAcceptingText()) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(InAppWebView.this.containerView.getWindowToken(), 2);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$12 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC143412 implements View.OnClickListener {
        public final /* synthetic */ ActionMode val$actionMode;
        public final /* synthetic */ ActionMode.Callback val$callback;
        public final /* synthetic */ int val$itemId;
        public final /* synthetic */ String val$itemTitle;
        public final /* synthetic */ MenuItem val$menuItem;

        public ViewOnClickListenerC143412(ActionMode.Callback callback, ActionMode actionMode, MenuItem menuItem, int i10, String str) {
            r2 = callback;
            r3 = actionMode;
            r4 = menuItem;
            r5 = i10;
            r6 = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InAppWebView.this.hideContextMenu();
            r2.onActionItemClicked(r3, r4);
            HashMap hashMap = new HashMap();
            hashMap.put("androidId", Integer.valueOf(r5));
            hashMap.put("iosId", null);
            hashMap.put("title", r6);
            InAppWebView.this.channel.invokeMethod("onContextMenuActionItemClicked", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$13 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC143513 implements View.OnClickListener {
        public final /* synthetic */ int val$itemId;
        public final /* synthetic */ String val$itemTitle;

        public ViewOnClickListenerC143513(int i10, String str) {
            r2 = i10;
            r3 = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InAppWebView.this.hideContextMenu();
            HashMap hashMap = new HashMap();
            hashMap.put("androidId", Integer.valueOf(r2));
            hashMap.put("iosId", null);
            hashMap.put("title", r3);
            InAppWebView.this.channel.invokeMethod("onContextMenuActionItemClicked", hashMap);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$14 */
    /* loaded from: classes2.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC143614 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ int val$x;
        public final /* synthetic */ int val$y;

        public ViewTreeObserverOnGlobalLayoutListenerC143614(int i10, int i11) {
            r2 = i10;
            r3 = i11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
            if (linearLayout != null) {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                    InAppWebView.this.onScrollStopped();
                } else {
                    InAppWebView.this.onFloatingActionGlobalLayout(r2, r3);
                }
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$15 */
    /* loaded from: classes2.dex */
    public class RunnableC143715 implements Runnable {
        public RunnableC143715() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$16 */
    /* loaded from: classes2.dex */
    public class C143816 implements ValueCallback<String> {
        public C143816() {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            if (InAppWebView.this.floatingContextMenu != null) {
                if (str == null || str.equalsIgnoreCase("null")) {
                    InAppWebView.this.floatingContextMenu.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                    return;
                }
                int i10 = InAppWebView.this.contextMenuPoint.x;
                int parseFloat = (int) ((Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext())) + (InAppWebView.this.floatingContextMenu.getHeight() / 3.5d));
                InAppWebView.this.contextMenuPoint.y = parseFloat;
                InAppWebView.this.onFloatingActionGlobalLayout(i10, parseFloat);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$17 */
    /* loaded from: classes2.dex */
    public class C143917 implements ValueCallback<String> {
        public final /* synthetic */ ValueCallback val$resultCallback;

        public C143917(ValueCallback valueCallback) {
            r2 = valueCallback;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$18 */
    /* loaded from: classes2.dex */
    public class C144018 implements ValueCallback<String> {
        public final /* synthetic */ ValueCallback val$resultCallback;

        public C144018(ValueCallback valueCallback) {
            r2 = valueCallback;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            ValueCallback valueCallback;
            Boolean bool;
            if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                valueCallback = r2;
                bool = Boolean.FALSE;
            } else {
                valueCallback = r2;
                bool = Boolean.TRUE;
            }
            valueCallback.onReceiveValue(bool);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$19 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C144119 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType */
        public static final /* synthetic */ int[] f5373x3e028321;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            f5373x3e028321 = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5373x3e028321[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5373x3e028321[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$2 */
    /* loaded from: classes2.dex */
    public class C14422 extends GestureDetector.SimpleOnGestureListener {
        public C14422() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            InAppWebView inAppWebView = InAppWebView.this;
            if (inAppWebView.floatingContextMenu != null) {
                inAppWebView.hideContextMenu();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$3 */
    /* loaded from: classes2.dex */
    public class RunnableC14433 implements Runnable {
        public RunnableC14433() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int scrollY = InAppWebView.this.getScrollY();
            InAppWebView inAppWebView = InAppWebView.this;
            if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                inAppWebView.onScrollStopped();
                return;
            }
            inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
            InAppWebView inAppWebView2 = InAppWebView.this;
            inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, inAppWebView2.newCheckScrollStoppedTask);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$4 */
    /* loaded from: classes2.dex */
    public class RunnableC14444 implements Runnable {

        /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$4$1 */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements ValueCallback<String> {
            public AnonymousClass1() {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (str != null && !str.equals("true")) {
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.mainLooperHandler.postDelayed(inAppWebView.checkContextMenuShouldBeClosedTask, inAppWebView.newCheckContextMenuShouldBeClosedTaskTask);
                } else {
                    InAppWebView inAppWebView2 = InAppWebView.this;
                    if (inAppWebView2.floatingContextMenu != null) {
                        inAppWebView2.hideContextMenu();
                    }
                }
            }
        }

        public RunnableC14444() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppWebView inAppWebView = InAppWebView.this;
            if (inAppWebView.floatingContextMenu != null) {
                inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.4.1
                    public AnonymousClass1() {
                    }

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str) {
                        if (str != null && !str.equals("true")) {
                            InAppWebView inAppWebView2 = InAppWebView.this;
                            inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                        } else {
                            InAppWebView inAppWebView22 = InAppWebView.this;
                            if (inAppWebView22.floatingContextMenu != null) {
                                inAppWebView22.hideContextMenu();
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$5 */
    /* loaded from: classes2.dex */
    public class ViewOnTouchListenerC14455 implements View.OnTouchListener {
        public float m_downX;
        public float m_downY;

        public ViewOnTouchListenerC14455() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            float x10;
            float f10;
            InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1) {
                InAppWebView.this.checkScrollStoppedTask.run();
            }
            if (InAppWebView.this.options.disableHorizontalScroll.booleanValue() && InAppWebView.this.options.disableVerticalScroll.booleanValue()) {
                return motionEvent.getAction() == 2;
            }
            if (InAppWebView.this.options.disableHorizontalScroll.booleanValue() || InAppWebView.this.options.disableVerticalScroll.booleanValue()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.m_downX = motionEvent.getX();
                    this.m_downY = motionEvent.getY();
                } else if (action == 1 || action == 2 || action == 3) {
                    if (InAppWebView.this.options.disableHorizontalScroll.booleanValue()) {
                        x10 = this.m_downX;
                        f10 = motionEvent.getY();
                    } else {
                        x10 = motionEvent.getX();
                        f10 = this.m_downY;
                    }
                    motionEvent.setLocation(x10, f10);
                }
            }
            return false;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$6 */
    /* loaded from: classes2.dex */
    public class ViewOnLongClickListenerC14466 implements View.OnLongClickListener {
        public ViewOnLongClickListenerC14466() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            InAppWebView.this.channel.invokeMethod("onLongPressHitTestResult", HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult()).toMap());
            return false;
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$7 */
    /* loaded from: classes2.dex */
    public class C14477 implements ValueCallback<Boolean> {
        public C14477() {
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$8 */
    /* loaded from: classes2.dex */
    public class RunnableC14488 implements Runnable {
        public final /* synthetic */ float val$pixelDensity;
        public final /* synthetic */ MethodChannel.Result val$result;
        public final /* synthetic */ Map val$screenshotConfiguration;

        public RunnableC14488(Map map, float f10, MethodChannel.Result result) {
            r2 = map;
            r3 = f10;
            r4 = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                InAppWebView.this.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                int i10 = 100;
                Map map = r2;
                if (map != null) {
                    Map map2 = (Map) map.get("rect");
                    if (map2 != null) {
                        createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map2.get("x")).doubleValue() * r3) + 0.5d), (int) Math.floor((((Double) map2.get("y")).doubleValue() * r3) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map2.get("width")).doubleValue() * r3) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map2.get("height")).doubleValue() * r3) + 0.5d)));
                    }
                    Double d10 = (Double) r2.get("snapshotWidth");
                    if (d10 != null) {
                        int floor = (int) Math.floor((d10.doubleValue() * r3) + 0.5d);
                        createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (floor / (createBitmap.getWidth() / createBitmap.getHeight())), true);
                    }
                    try {
                        compressFormat = Bitmap.CompressFormat.valueOf((String) r2.get("compressFormat"));
                    } catch (IllegalArgumentException e10) {
                        e10.printStackTrace();
                    }
                    i10 = ((Integer) r2.get("quality")).intValue();
                }
                createBitmap.compress(compressFormat, i10, byteArrayOutputStream);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                createBitmap.recycle();
                r4.success(byteArrayOutputStream.toByteArray());
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                r4.success(null);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$9 */
    /* loaded from: classes2.dex */
    public class C14499 implements ValueCallback<String> {
        public final /* synthetic */ boolean val$enable;
        public final /* synthetic */ String val$flagVariable;
        public final /* synthetic */ PluginScript val$pluginScript;

        public C14499(String str, boolean z10, PluginScript pluginScript) {
            r2 = str;
            r3 = z10;
            r4 = pluginScript;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            if (!((str == null || str.equalsIgnoreCase("null")) ? false : true)) {
                if (r3) {
                    InAppWebView.this.evaluateJavascript(r4.getSource(), null, null);
                    InAppWebView.this.userContentController.addPluginScript(r4);
                    return;
                }
                return;
            }
            InAppWebView.this.evaluateJavascript("window." + r2 + " = " + r3 + ";", null, null);
            if (r3) {
                return;
            }
            InAppWebView.this.userContentController.removePluginScript(r4);
        }
    }

    /* loaded from: classes2.dex */
    public class DownloadStartListener implements DownloadListener {
        public DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            InAppWebView.this.channel.invokeMethod("onDownloadStartRequest", new DownloadStartRequest(str, str2, str3, str4, j10, URLUtil.guessFileName(str, str3, str4), null).toMap());
        }
    }

    public InAppWebView(Context context) {
        super(context);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, MethodChannel methodChannel, Object obj, Integer num, InAppWebViewOptions inAppWebViewOptions, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewOptions.useHybridComposition);
        Activity activity;
        this.isLoading = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController();
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = methodChannel;
        this.f5372id = obj;
        this.windowId = num;
        this.options = inAppWebViewOptions;
        this.contextMenu = map;
        this.userContentController.addUserOnlyScripts(list);
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return;
        }
        activity.registerForContextMenu(this);
    }

    private void clearCookies() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.7
                public C14477() {
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                }
            });
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    private void sendOnCreateContextMenuEvent() {
        this.channel.invokeMethod("onCreateContextMenu", HitTestResult.fromWebViewHitTestResult(getHitTestResult()).toMap());
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void addWebMessageListener(WebMessageListener webMessageListener) {
        C0038h.m140a(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
        this.webMessageListeners.add(webMessageListener);
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.16
            public C143816() {
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                        return;
                    }
                    int i10 = InAppWebView.this.contextMenuPoint.x;
                    int parseFloat = (int) ((Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext())) + (InAppWebView.this.floatingContextMenu.getHeight() / 3.5d));
                    InAppWebView.this.contextMenuPoint.y = parseFloat;
                    InAppWebView.this.onFloatingActionGlobalLayout(i10, parseFloat);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String uuid = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(uuid, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String join = TextUtils.join(", ", arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid), contentWorld), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public WebMessageChannel createCompatWebMessageChannel() {
        String uuid = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(uuid, this);
        this.webMessageChannels.put(uuid, webMessageChannel);
        return webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel createCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(createCompatWebMessageChannel);
        return createCompatWebMessageChannel;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_webview.InputAwareWebView
    public void dispose() {
        Integer num = this.windowId;
        if (num != null) {
            InAppWebViewChromeClient.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        this.inAppWebViewChromeClient = null;
        this.inAppWebViewClient = null;
        this.javaScriptBridgeInterface = null;
        this.inAppWebViewRenderProcessClient = null;
        this.plugin = null;
        super.dispose();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void disposeWebMessageListeners() {
        Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(String str, boolean z10, PluginScript pluginScript) {
        evaluateJavascript("window." + str, null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.9
            public final /* synthetic */ boolean val$enable;
            public final /* synthetic */ String val$flagVariable;
            public final /* synthetic */ PluginScript val$pluginScript;

            public C14499(String str2, boolean z102, PluginScript pluginScript2) {
                r2 = str2;
                r3 = z102;
                r4 = pluginScript2;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (!((str2 == null || str2.equalsIgnoreCase("null")) ? false : true)) {
                    if (r3) {
                        InAppWebView.this.evaluateJavascript(r4.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(r4);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript("window." + r2 + " = " + r3 + ";", null, null);
                if (r3) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(r4);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i10);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put(WebViewActivity.URL_EXTRA, itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("history", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Map<String, Object> getOptions() {
        InAppWebViewOptions inAppWebViewOptions = this.options;
        if (inAppWebViewOptions != null) {
            return inAppWebViewOptions.getRealOptions((InAppWebViewInterface) this);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void getSelectedText(ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.17
            public final /* synthetic */ ValueCallback val$resultCallback;

            public C143917(ValueCallback valueCallback2) {
                r2 = valueCallback2;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                r2.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Looper getWebViewLooper() {
        return Build.VERSION.SDK_INT >= 28 ? super.getWebViewLooper() : Looper.getMainLooper();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public float getZoomScale() {
        return this.zoomScale;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        onHideContextMenu();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = "";
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = "";
        }
        injectDeferredObject(str, null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);", null);
    }

    public void injectDeferredObject(String str, ContentWorld contentWorld, String str2, ValueCallback<String> valueCallback) {
        String str3;
        String str4;
        String uuid = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str3 = String.format(str2, jSONArray2.substring(1, jSONArray2.length() - 1));
        } else {
            str3 = str;
        }
        if (uuid == null || valueCallback == null) {
            str4 = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(uuid, valueCallback);
            str4 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid);
        }
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.10
            public final /* synthetic */ ContentWorld val$contentWorld;
            public final /* synthetic */ String val$finalScriptToInject;
            public final /* synthetic */ ValueCallback val$resultCallback;
            public final /* synthetic */ String val$resultUuid;

            /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$10$1 */
            /* loaded from: classes2.dex */
            public class AnonymousClass1 implements ValueCallback<String> {
                public AnonymousClass1() {
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    ValueCallback valueCallback2;
                    RunnableC143210 runnableC143210 = RunnableC143210.this;
                    if (r5 != null || (valueCallback2 = r4) == null) {
                        return;
                    }
                    valueCallback2.onReceiveValue(str);
                }
            }

            public RunnableC143210(String str42, ContentWorld contentWorld2, ValueCallback valueCallback2, String uuid2) {
                r2 = str42;
                r3 = contentWorld2;
                r4 = valueCallback2;
                r5 = uuid2;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueCallback valueCallback2;
                String generateCodeForScriptEvaluation = InAppWebView.this.userContentController.generateCodeForScriptEvaluation(r2, r3);
                if (Build.VERSION.SDK_INT >= 19) {
                    InAppWebView.this.evaluateJavascript(generateCodeForScriptEvaluation, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.10.1
                        public AnonymousClass1() {
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str5) {
                            ValueCallback valueCallback22;
                            RunnableC143210 runnableC143210 = RunnableC143210.this;
                            if (r5 != null || (valueCallback22 = r4) == null) {
                                return;
                            }
                            valueCallback22.onReceiveValue(str5);
                        }
                    });
                    return;
                }
                InAppWebView.this.loadUrl("javascript:" + generateCodeForScriptEvaluation.replaceAll("[\r\n]+", ""));
                if (r3 == null || (valueCallback2 = r4) == null) {
                    return;
                }
                valueCallback2.onReceiveValue("");
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get(ImagePickerCache.MAP_KEY_TYPE);
            if (str3 != null) {
                str2 = " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + replaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + replaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + replaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    @TargetApi(21)
    public void isSecureContext(ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.18
            public final /* synthetic */ ValueCallback val$resultCallback;

            public C144018(ValueCallback valueCallback2) {
                r2 = valueCallback2;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback2;
                Boolean bool;
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback2 = r2;
                    bool = Boolean.FALSE;
                } else {
                    valueCallback2 = r2;
                    bool = Boolean.TRUE;
                }
                valueCallback2.onReceiveValue(bool);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void loadFile(String str) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.11
                public RunnableC143311() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (InAppWebView.this.containerView == null || inputMethodManager == null || inputMethodManager.isAcceptingText()) {
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(InAppWebView.this.containerView.getWindowToken(), 2);
                }
            }, 128L);
        }
        return onCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i10, int i11) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i12 = i10 - (width2 / 2);
        if (i12 < 0) {
            i12 = 0;
        } else if (i12 + width2 > width) {
            i12 = width - width2;
        }
        float f10 = i11 - (height * 1.5f);
        if (f10 < 0.0f) {
            f10 = i11 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i12, ((int) f10) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.15
            public RunnableC143715() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    public void onHideContextMenu() {
        this.channel.invokeMethod("onHideContextMenu", new HashMap());
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.onOverScrolled(i10, i11, z10, z11);
        boolean z12 = canScrollHorizontally() && z10;
        boolean z13 = canScrollVertically() && z11;
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z13 && i11 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.options.enabled.booleanValue());
            setOverScrollMode(this.options.overScrollMode.intValue());
        }
        if (z12 || z13) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i10));
            hashMap.put("y", Integer.valueOf(i11));
            hashMap.put("clampedX", Boolean.valueOf(z12));
            hashMap.put("clampedY", Boolean.valueOf(z13));
            this.channel.invokeMethod("onOverScrolled", hashMap);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(i10));
        hashMap.put("y", Integer.valueOf(i11));
        this.channel.invokeMethod("onScrollChanged", hashMap);
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        adjustFloatingContextMenuPosition();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04e4 A[LOOP:0: B:137:0x04de->B:139:0x04e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepare() {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.prepare():void");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void printCurrentPage() {
        Activity activity;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return;
        }
        String str = getTitle() + " Document";
        printManager.print(str, createPrintDocumentAdapter(str), new PrintAttributes.Builder().build());
    }

    public ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z10;
        View view;
        if (!this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (Build.VERSION.SDK_INT >= 23) {
            actionMode.hide(3000L);
        }
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        menu.clear();
        actionMode.finish();
        if (this.options.disableContextMenu.booleanValue()) {
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C1417R.layout.floating_action_mode, (ViewGroup) this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuOptions contextMenuOptions = new ContextMenuOptions();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map<String, Object> map2 = (Map) this.contextMenu.get("options");
            if (map2 != null) {
                contextMenuOptions.parse(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        Boolean bool = contextMenuOptions.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (MenuItem menuItem : arrayList) {
                int itemId = menuItem.getItemId();
                String charSequence = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C1417R.layout.floating_action_mode_item, (ViewGroup) this, false);
                textView.setText(charSequence);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.12
                    public final /* synthetic */ ActionMode val$actionMode;
                    public final /* synthetic */ ActionMode.Callback val$callback;
                    public final /* synthetic */ int val$itemId;
                    public final /* synthetic */ String val$itemTitle;
                    public final /* synthetic */ MenuItem val$menuItem;

                    public ViewOnClickListenerC143412(ActionMode.Callback callback2, ActionMode actionMode2, MenuItem menuItem2, int itemId2, String charSequence2) {
                        r2 = callback2;
                        r3 = actionMode2;
                        r4 = menuItem2;
                        r5 = itemId2;
                        r6 = charSequence2;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        r2.onActionItemClicked(r3, r4);
                        HashMap hashMap = new HashMap();
                        hashMap.put("androidId", Integer.valueOf(r5));
                        hashMap.put("iosId", null);
                        hashMap.put("title", r6);
                        InAppWebView.this.channel.invokeMethod("onContextMenuActionItemClicked", hashMap);
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            int intValue = ((Integer) map3.get("androidId")).intValue();
            String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(C1417R.layout.floating_action_mode_item, (ViewGroup) this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.13
                public final /* synthetic */ int val$itemId;
                public final /* synthetic */ String val$itemTitle;

                public ViewOnClickListenerC143513(int intValue2, String str2) {
                    r2 = intValue2;
                    r3 = str2;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InAppWebView.this.hideContextMenu();
                    HashMap hashMap = new HashMap();
                    hashMap.put("androidId", Integer.valueOf(r2));
                    hashMap.put("iosId", null);
                    hashMap.put("title", r3);
                    InAppWebView.this.channel.invokeMethod("onContextMenuActionItemClicked", hashMap);
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        int i11 = point != null ? point.x : 0;
        int i12 = point != null ? point.y : 0;
        this.contextMenuPoint = new Point(i11, i12);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.14
                public final /* synthetic */ int val$x;
                public final /* synthetic */ int val$y;

                public ViewTreeObserverOnGlobalLayoutListenerC143614(int i112, int i122) {
                    r2 = i112;
                    r3 = i122;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                    if (linearLayout4 != null) {
                        linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(r2, r3);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i112, i122));
            if (z10) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put(WebViewActivity.URL_EXTRA, peekData.getString(WebViewActivity.URL_EXTRA));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, peekData.getString(WebViewActivity.URL_EXTRA));
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", getScrollX() + num.intValue()), PropertyValuesHolder.ofInt("scrollY", getScrollY() + num2.intValue())).setDuration(300L).start();
        } else {
            scrollBy(num.intValue(), num2.intValue());
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    public void setCacheEnabled(boolean z10) {
        WebSettings settings = getSettings();
        if (!z10) {
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z10) {
        WebSettings settings = getSettings();
        String userAgentString = settings.getUserAgentString();
        settings.setUserAgentString(z10 ? userAgentString.replace("Mobile", "eliboM").replace("Android", "diordnA") : userAgentString.replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z10);
        settings.setLoadWithOverviewMode(z10);
        settings.setSupportZoom(z10);
        settings.setBuiltInZoomControls(z10);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    public void setIncognito(boolean z10) {
        WebSettings settings = getSettings();
        if (!z10) {
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
        clearHistory();
        clearCache(true);
        clearFormData();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setOptions(InAppWebViewOptions inAppWebViewOptions, HashMap<String, Object> hashMap) {
        Map<String, Object> map;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        WebSettings settings = getSettings();
        if (hashMap.get("javaScriptEnabled") != null) {
            Boolean bool = this.options.javaScriptEnabled;
            Boolean bool2 = inAppWebViewOptions.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (hashMap.get("useShouldInterceptAjaxRequest") != null) {
            Boolean bool3 = this.options.useShouldInterceptAjaxRequest;
            Boolean bool4 = inAppWebViewOptions.useShouldInterceptAjaxRequest;
            if (bool3 != bool4) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("useShouldInterceptFetchRequest") != null) {
            Boolean bool5 = this.options.useShouldInterceptFetchRequest;
            Boolean bool6 = inAppWebViewOptions.useShouldInterceptFetchRequest;
            if (bool5 != bool6) {
                enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool6.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("useOnLoadResource") != null) {
            Boolean bool7 = this.options.useOnLoadResource;
            Boolean bool8 = inAppWebViewOptions.useOnLoadResource;
            if (bool7 != bool8) {
                enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool8.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool9 = this.options.javaScriptCanOpenWindowsAutomatically;
            Boolean bool10 = inAppWebViewOptions.javaScriptCanOpenWindowsAutomatically;
            if (bool9 != bool10) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool10.booleanValue());
            }
        }
        if (hashMap.get("builtInZoomControls") != null) {
            Boolean bool11 = this.options.builtInZoomControls;
            Boolean bool12 = inAppWebViewOptions.builtInZoomControls;
            if (bool11 != bool12) {
                settings.setBuiltInZoomControls(bool12.booleanValue());
            }
        }
        if (hashMap.get("displayZoomControls") != null) {
            Boolean bool13 = this.options.displayZoomControls;
            Boolean bool14 = inAppWebViewOptions.displayZoomControls;
            if (bool13 != bool14) {
                settings.setDisplayZoomControls(bool14.booleanValue());
            }
        }
        if (hashMap.get("safeBrowsingEnabled") != null) {
            Boolean bool15 = this.options.safeBrowsingEnabled;
            Boolean bool16 = inAppWebViewOptions.safeBrowsingEnabled;
            if (bool15 != bool16 && Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(bool16.booleanValue());
            }
        }
        if (hashMap.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool17 = this.options.mediaPlaybackRequiresUserGesture;
            Boolean bool18 = inAppWebViewOptions.mediaPlaybackRequiresUserGesture;
            if (bool17 != bool18) {
                settings.setMediaPlaybackRequiresUserGesture(bool18.booleanValue());
            }
        }
        if (hashMap.get("databaseEnabled") != null) {
            Boolean bool19 = this.options.databaseEnabled;
            Boolean bool20 = inAppWebViewOptions.databaseEnabled;
            if (bool19 != bool20) {
                settings.setDatabaseEnabled(bool20.booleanValue());
            }
        }
        if (hashMap.get("domStorageEnabled") != null) {
            Boolean bool21 = this.options.domStorageEnabled;
            Boolean bool22 = inAppWebViewOptions.domStorageEnabled;
            if (bool21 != bool22) {
                settings.setDomStorageEnabled(bool22.booleanValue());
            }
        }
        if (hashMap.get("userAgent") != null && !this.options.userAgent.equals(inAppWebViewOptions.userAgent) && !inAppWebViewOptions.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewOptions.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.options.applicationNameForUserAgent.equals(inAppWebViewOptions.applicationNameForUserAgent) && !inAppWebViewOptions.applicationNameForUserAgent.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str3 = inAppWebViewOptions.userAgent;
            settings.setUserAgentString(((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewOptions.userAgent) + " " + this.options.applicationNameForUserAgent);
        }
        if (hashMap.get("clearCache") != null && inAppWebViewOptions.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewOptions.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (hashMap.get("thirdPartyCookiesEnabled") != null && this.options.thirdPartyCookiesEnabled != inAppWebViewOptions.thirdPartyCookiesEnabled && Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewOptions.thirdPartyCookiesEnabled.booleanValue());
        }
        if (hashMap.get("useWideViewPort") != null) {
            Boolean bool23 = this.options.useWideViewPort;
            Boolean bool24 = inAppWebViewOptions.useWideViewPort;
            if (bool23 != bool24) {
                settings.setUseWideViewPort(bool24.booleanValue());
            }
        }
        if (hashMap.get("supportZoom") != null) {
            Boolean bool25 = this.options.supportZoom;
            Boolean bool26 = inAppWebViewOptions.supportZoom;
            if (bool25 != bool26) {
                settings.setSupportZoom(bool26.booleanValue());
            }
        }
        if (hashMap.get("textZoom") != null && !this.options.textZoom.equals(inAppWebViewOptions.textZoom)) {
            settings.setTextZoom(inAppWebViewOptions.textZoom.intValue());
        }
        if (hashMap.get("verticalScrollBarEnabled") != null) {
            Boolean bool27 = this.options.verticalScrollBarEnabled;
            Boolean bool28 = inAppWebViewOptions.verticalScrollBarEnabled;
            if (bool27 != bool28) {
                setVerticalScrollBarEnabled(bool28.booleanValue());
            }
        }
        if (hashMap.get("horizontalScrollBarEnabled") != null) {
            Boolean bool29 = this.options.horizontalScrollBarEnabled;
            Boolean bool30 = inAppWebViewOptions.horizontalScrollBarEnabled;
            if (bool29 != bool30) {
                setHorizontalScrollBarEnabled(bool30.booleanValue());
            }
        }
        boolean z10 = false;
        if (hashMap.get("transparentBackground") != null) {
            Boolean bool31 = this.options.transparentBackground;
            Boolean bool32 = inAppWebViewOptions.transparentBackground;
            if (bool31 != bool32) {
                if (bool32.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21 && hashMap.get("mixedContentMode") != null && ((num4 = this.options.mixedContentMode) == null || !num4.equals(inAppWebViewOptions.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewOptions.mixedContentMode.intValue());
        }
        if (hashMap.get("supportMultipleWindows") != null) {
            Boolean bool33 = this.options.supportMultipleWindows;
            Boolean bool34 = inAppWebViewOptions.supportMultipleWindows;
            if (bool33 != bool34) {
                settings.setSupportMultipleWindows(bool34.booleanValue());
            }
        }
        if (hashMap.get("useOnDownloadStart") != null) {
            Boolean bool35 = this.options.useOnDownloadStart;
            Boolean bool36 = inAppWebViewOptions.useOnDownloadStart;
            if (bool35 != bool36) {
                if (bool36.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (hashMap.get("allowContentAccess") != null) {
            Boolean bool37 = this.options.allowContentAccess;
            Boolean bool38 = inAppWebViewOptions.allowContentAccess;
            if (bool37 != bool38) {
                settings.setAllowContentAccess(bool38.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccess") != null) {
            Boolean bool39 = this.options.allowFileAccess;
            Boolean bool40 = inAppWebViewOptions.allowFileAccess;
            if (bool39 != bool40) {
                settings.setAllowFileAccess(bool40.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool41 = this.options.allowFileAccessFromFileURLs;
            Boolean bool42 = inAppWebViewOptions.allowFileAccessFromFileURLs;
            if (bool41 != bool42) {
                settings.setAllowFileAccessFromFileURLs(bool42.booleanValue());
            }
        }
        if (hashMap.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool43 = this.options.allowUniversalAccessFromFileURLs;
            Boolean bool44 = inAppWebViewOptions.allowUniversalAccessFromFileURLs;
            if (bool43 != bool44) {
                settings.setAllowUniversalAccessFromFileURLs(bool44.booleanValue());
            }
        }
        if (hashMap.get("cacheEnabled") != null) {
            Boolean bool45 = this.options.cacheEnabled;
            Boolean bool46 = inAppWebViewOptions.cacheEnabled;
            if (bool45 != bool46) {
                setCacheEnabled(bool46.booleanValue());
            }
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.options.appCachePath) == null || !str2.equals(inAppWebViewOptions.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewOptions.appCachePath);
        }
        if (hashMap.get("blockNetworkImage") != null) {
            Boolean bool47 = this.options.blockNetworkImage;
            Boolean bool48 = inAppWebViewOptions.blockNetworkImage;
            if (bool47 != bool48) {
                settings.setBlockNetworkImage(bool48.booleanValue());
            }
        }
        if (hashMap.get("blockNetworkLoads") != null) {
            Boolean bool49 = this.options.blockNetworkLoads;
            Boolean bool50 = inAppWebViewOptions.blockNetworkLoads;
            if (bool49 != bool50) {
                settings.setBlockNetworkLoads(bool50.booleanValue());
            }
        }
        if (hashMap.get("cacheMode") != null && !this.options.cacheMode.equals(inAppWebViewOptions.cacheMode)) {
            settings.setCacheMode(inAppWebViewOptions.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.options.cursiveFontFamily.equals(inAppWebViewOptions.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewOptions.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.options.defaultFixedFontSize.equals(inAppWebViewOptions.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewOptions.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.options.defaultFontSize.equals(inAppWebViewOptions.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewOptions.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.options.defaultTextEncodingName.equals(inAppWebViewOptions.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewOptions.defaultTextEncodingName);
        }
        if (i10 >= 24 && hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.options.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewOptions.disabledActionModeMenuItems))) {
            settings.setDisabledActionModeMenuItems(inAppWebViewOptions.disabledActionModeMenuItems.intValue());
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.options.fantasyFontFamily.equals(inAppWebViewOptions.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewOptions.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.options.fixedFontFamily.equals(inAppWebViewOptions.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewOptions.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.options.forceDark.equals(inAppWebViewOptions.forceDark) && i10 >= 29) {
            settings.setForceDark(inAppWebViewOptions.forceDark.intValue());
        }
        if (hashMap.get("geolocationEnabled") != null) {
            Boolean bool51 = this.options.geolocationEnabled;
            Boolean bool52 = inAppWebViewOptions.geolocationEnabled;
            if (bool51 != bool52) {
                settings.setGeolocationEnabled(bool52.booleanValue());
            }
        }
        if (hashMap.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.options.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewOptions.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                if (i10 >= 19) {
                    layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
                }
                settings.setLayoutAlgorithm(inAppWebViewOptions.layoutAlgorithm);
            }
        }
        if (hashMap.get("loadWithOverviewMode") != null) {
            Boolean bool53 = this.options.loadWithOverviewMode;
            Boolean bool54 = inAppWebViewOptions.loadWithOverviewMode;
            if (bool53 != bool54) {
                settings.setLoadWithOverviewMode(bool54.booleanValue());
            }
        }
        if (hashMap.get("loadsImagesAutomatically") != null) {
            Boolean bool55 = this.options.loadsImagesAutomatically;
            Boolean bool56 = inAppWebViewOptions.loadsImagesAutomatically;
            if (bool55 != bool56) {
                settings.setLoadsImagesAutomatically(bool56.booleanValue());
            }
        }
        if (hashMap.get("minimumFontSize") != null && !this.options.minimumFontSize.equals(inAppWebViewOptions.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewOptions.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.options.minimumLogicalFontSize.equals(inAppWebViewOptions.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewOptions.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.options.initialScale.equals(inAppWebViewOptions.initialScale)) {
            setInitialScale(inAppWebViewOptions.initialScale.intValue());
        }
        if (hashMap.get("needInitialFocus") != null) {
            Boolean bool57 = this.options.needInitialFocus;
            Boolean bool58 = inAppWebViewOptions.needInitialFocus;
            if (bool57 != bool58) {
                settings.setNeedInitialFocus(bool58.booleanValue());
            }
        }
        if (hashMap.get("offscreenPreRaster") != null) {
            Boolean bool59 = this.options.offscreenPreRaster;
            Boolean bool60 = inAppWebViewOptions.offscreenPreRaster;
            if (bool59 != bool60 && i10 >= 23) {
                settings.setOffscreenPreRaster(bool60.booleanValue());
            }
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.options.sansSerifFontFamily.equals(inAppWebViewOptions.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewOptions.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.options.serifFontFamily.equals(inAppWebViewOptions.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewOptions.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.options.standardFontFamily.equals(inAppWebViewOptions.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewOptions.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.options.preferredContentMode.equals(inAppWebViewOptions.preferredContentMode)) {
            int i11 = C144119.f5373x3e028321[PreferredContentModeOptionType.fromValue(inAppWebViewOptions.preferredContentMode.intValue()).ordinal()];
            if (i11 == 1) {
                setDesktopMode(true);
            } else if (i11 == 2 || i11 == 3) {
                setDesktopMode(false);
            }
        }
        if (hashMap.get("saveFormData") != null) {
            Boolean bool61 = this.options.saveFormData;
            Boolean bool62 = inAppWebViewOptions.saveFormData;
            if (bool61 != bool62) {
                settings.setSaveFormData(bool62.booleanValue());
            }
        }
        if (hashMap.get("incognito") != null) {
            Boolean bool63 = this.options.incognito;
            Boolean bool64 = inAppWebViewOptions.incognito;
            if (bool63 != bool64) {
                setIncognito(bool64.booleanValue());
            }
        }
        if (hashMap.get("hardwareAcceleration") != null) {
            Boolean bool65 = this.options.hardwareAcceleration;
            Boolean bool66 = inAppWebViewOptions.hardwareAcceleration;
            if (bool65 != bool66) {
                if (bool66.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(1, null);
                }
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.options.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewOptions.regexToCancelSubFramesLoading))) {
            if (inAppWebViewOptions.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.options.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewOptions.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map2 : inAppWebViewOptions.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.options.scrollBarStyle.equals(inAppWebViewOptions.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewOptions.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.options.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.options.scrollbarFadingEnabled.equals(inAppWebViewOptions.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewOptions.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.options.scrollBarFadeDuration) == null || !num.equals(inAppWebViewOptions.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewOptions.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.options.verticalScrollbarPosition.equals(inAppWebViewOptions.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewOptions.verticalScrollbarPosition.intValue());
        }
        if (hashMap.get("disableVerticalScroll") != null) {
            Boolean bool67 = this.options.disableVerticalScroll;
            Boolean bool68 = inAppWebViewOptions.disableVerticalScroll;
            if (bool67 != bool68) {
                setVerticalScrollBarEnabled(!bool68.booleanValue() && inAppWebViewOptions.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (hashMap.get("disableHorizontalScroll") != null) {
            Boolean bool69 = this.options.disableHorizontalScroll;
            Boolean bool70 = inAppWebViewOptions.disableHorizontalScroll;
            if (bool69 != bool70) {
                if (!bool70.booleanValue() && inAppWebViewOptions.horizontalScrollBarEnabled.booleanValue()) {
                    z10 = true;
                }
                setHorizontalScrollBarEnabled(z10);
            }
        }
        if (hashMap.get("overScrollMode") != null && !this.options.overScrollMode.equals(inAppWebViewOptions.overScrollMode)) {
            setOverScrollMode(inAppWebViewOptions.overScrollMode.intValue());
        }
        if (hashMap.get("networkAvailable") != null) {
            Boolean bool71 = this.options.networkAvailable;
            Boolean bool72 = inAppWebViewOptions.networkAvailable;
            if (bool71 != bool72) {
                setNetworkAvailable(bool72.booleanValue());
            }
        }
        if (hashMap.get("rendererPriorityPolicy") != null && (((map = this.options.rendererPriorityPolicy) == null || map.get("rendererRequestedPriority") != inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority") || this.options.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.options.verticalScrollbarThumbColor, inAppWebViewOptions.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarThumbColor)));
            }
            if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.options.verticalScrollbarTrackColor, inAppWebViewOptions.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarTrackColor)));
            }
            if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.options.horizontalScrollbarThumbColor, inAppWebViewOptions.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.options.horizontalScrollbarTrackColor, inAppWebViewOptions.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarTrackColor)));
            }
        }
        this.options = inAppWebViewOptions;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setUserContentController(UserContentController userContentController) {
        this.userContentController = userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.options.useHybridComposition.booleanValue() && !this.options.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        Map<String, Object> map;
        return (this.options.useHybridComposition.booleanValue() && !this.options.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback, i10) : rebuildActionMode(super.startActionMode(callback, i10), callback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface
    public void takeScreenshot(Map<String, Object> map, MethodChannel.Result result) {
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.8
            public final /* synthetic */ float val$pixelDensity;
            public final /* synthetic */ MethodChannel.Result val$result;
            public final /* synthetic */ Map val$screenshotConfiguration;

            public RunnableC14488(Map map2, float f10, MethodChannel.Result result2) {
                r2 = map2;
                r3 = f10;
                r4 = result2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    int i10 = 100;
                    Map map2 = r2;
                    if (map2 != null) {
                        Map map22 = (Map) map2.get("rect");
                        if (map22 != null) {
                            createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map22.get("x")).doubleValue() * r3) + 0.5d), (int) Math.floor((((Double) map22.get("y")).doubleValue() * r3) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map22.get("width")).doubleValue() * r3) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map22.get("height")).doubleValue() * r3) + 0.5d)));
                        }
                        Double d10 = (Double) r2.get("snapshotWidth");
                        if (d10 != null) {
                            int floor = (int) Math.floor((d10.doubleValue() * r3) + 0.5d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (floor / (createBitmap.getWidth() / createBitmap.getHeight())), true);
                        }
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) r2.get("compressFormat"));
                        } catch (IllegalArgumentException e10) {
                            e10.printStackTrace();
                        }
                        i10 = ((Integer) r2.get("quality")).intValue();
                    }
                    createBitmap.compress(compressFormat, i10, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    createBitmap.recycle();
                    r4.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e12) {
                    e12.printStackTrace();
                    r4.success(null);
                }
            }
        });
    }
}
