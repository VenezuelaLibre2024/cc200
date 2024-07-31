package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HeadlessInAppWebView implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "HeadlessInAppWebView";
    public final MethodChannel channel;
    public FlutterWebView flutterWebView;

    /* renamed from: id */
    public final String f5369id;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView) {
        this.f5369id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.flutterWebView = flutterWebView;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview_" + str);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void dispose() {
        Activity activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView;
        this.channel.setMethodCallHandler(null);
        Map<String, HeadlessInAppWebView> map = HeadlessInAppWebViewManager.webViews;
        if (map.containsKey(this.f5369id)) {
            map.put(this.f5369id, null);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (activity = inAppWebViewFlutterPlugin.activity) != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null && (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) != null && (flutterWebView = this.flutterWebView) != null) {
            viewGroup2.removeView(flutterWebView.getView());
        }
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null) {
            flutterWebView2.dispose();
        }
        this.flutterWebView = null;
        this.plugin = null;
    }

    public Size2D getSize() {
        View view;
        FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView == null || flutterWebView.webView == null || (view = flutterWebView.getView()) == null) {
            return null;
        }
        float pixelDensity = Util.getPixelDensity(view.getContext());
        Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        double width = fullscreenSize.getWidth();
        int i10 = layoutParams.width;
        double d10 = width == ((double) i10) ? i10 : i10 / pixelDensity;
        double height = fullscreenSize.getHeight();
        int i11 = layoutParams.height;
        return new Size2D(d10, height == ((double) i11) ? i11 : i11 / pixelDensity);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002e. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object map;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -75151241:
                if (str.equals("getSize")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Size2D size = getSize();
                map = size != null ? size.toMap() : null;
                result.success(map);
                return;
            case 1:
                dispose();
                map = Boolean.TRUE;
                result.success(map);
                return;
            case 2:
                Size2D fromMap = Size2D.fromMap((Map) methodCall.argument("size"));
                if (fromMap != null) {
                    setSize(fromMap);
                }
                map = Boolean.TRUE;
                result.success(map);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void onWebViewCreated() {
        this.channel.invokeMethod("onWebViewCreated", new HashMap());
    }

    public void prepare(Map<String, Object> map) {
        Activity activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView;
        View view;
        View view2;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null && (view2 = flutterWebView2.getView()) != null) {
            Size2D fromMap = Size2D.fromMap((Map) map.get("initialSize"));
            if (fromMap == null) {
                fromMap = new Size2D(-1.0d, -1.0d);
            }
            setSize(fromMap);
            view2.setVisibility(4);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null || (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) == null || (flutterWebView = this.flutterWebView) == null || (view = flutterWebView.getView()) == null) {
            return;
        }
        viewGroup2.addView(view, 0);
    }

    public void setSize(Size2D size2D) {
        View view;
        FlutterWebView flutterWebView = this.flutterWebView;
        if (flutterWebView == null || flutterWebView.webView == null || (view = flutterWebView.getView()) == null) {
            return;
        }
        float pixelDensity = Util.getPixelDensity(view.getContext());
        Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams((int) (size2D.getWidth() == -1.0d ? fullscreenSize.getWidth() : size2D.getWidth() * pixelDensity), (int) (size2D.getWidth() == -1.0d ? fullscreenSize.getHeight() : pixelDensity * size2D.getHeight())));
    }
}
