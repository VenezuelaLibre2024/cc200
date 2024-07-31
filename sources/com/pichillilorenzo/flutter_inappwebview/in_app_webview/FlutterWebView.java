package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshOptions;
import com.pichillilorenzo.flutter_inappwebview.types.PlatformWebView;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p004a2.C0038h;
import p004a2.C0039i;

/* loaded from: classes2.dex */
public class FlutterWebView implements PlatformWebView {
    public static final String LOG_TAG = "IAWFlutterWebView";
    public final MethodChannel channel;
    public InAppWebViewMethodHandler methodCallDelegate;
    public PullToRefreshLayout pullToRefreshLayout;
    public InAppWebView webView;

    public FlutterWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context, Object obj, HashMap<String, Object> hashMap) {
        this.channel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_" + obj);
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        Map<String, Object> map = (Map) hashMap.get("initialOptions");
        Map map2 = (Map) hashMap.get("contextMenu");
        Integer num = (Integer) hashMap.get("windowId");
        List list = (List) hashMap.get("initialUserScripts");
        Map<String, Object> map3 = (Map) hashMap.get("pullToRefreshOptions");
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse(map);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UserScript.fromMap((Map) it.next()));
            }
        }
        this.webView = new InAppWebView(context, inAppWebViewFlutterPlugin, this.channel, obj, num, inAppWebViewOptions, map2, inAppWebViewOptions.useHybridComposition.booleanValue() ? null : inAppWebViewFlutterPlugin.flutterView, arrayList);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_" + obj);
        PullToRefreshOptions pullToRefreshOptions = new PullToRefreshOptions();
        pullToRefreshOptions.parse(map3);
        PullToRefreshLayout pullToRefreshLayout = new PullToRefreshLayout(context, methodChannel, pullToRefreshOptions);
        this.pullToRefreshLayout = pullToRefreshLayout;
        pullToRefreshLayout.addView(this.webView);
        this.pullToRefreshLayout.prepare();
        InAppWebViewMethodHandler inAppWebViewMethodHandler = new InAppWebViewMethodHandler(this.webView);
        this.methodCallDelegate = inAppWebViewMethodHandler;
        this.channel.setMethodCallHandler(inAppWebViewMethodHandler);
        this.webView.prepare();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.channel.setMethodCallHandler(null);
        InAppWebViewMethodHandler inAppWebViewMethodHandler = this.methodCallDelegate;
        if (inAppWebViewMethodHandler != null) {
            inAppWebViewMethodHandler.dispose();
            this.methodCallDelegate = null;
        }
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
            if (Build.VERSION.SDK_INT >= 29 && C0039i.m154a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
                C0038h.m152m(this.webView, null);
            }
            this.webView.setWebChromeClient(new WebChromeClient());
            this.webView.setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView.1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = FlutterWebView.this.webView.inAppWebViewRenderProcessClient;
                    if (inAppWebViewRenderProcessClient != null) {
                        inAppWebViewRenderProcessClient.dispose();
                    }
                    FlutterWebView.this.webView.inAppWebViewChromeClient.dispose();
                    FlutterWebView.this.webView.inAppWebViewClient.dispose();
                    FlutterWebView.this.webView.javaScriptBridgeInterface.dispose();
                    FlutterWebView.this.webView.dispose();
                    FlutterWebView.this.webView.destroy();
                    FlutterWebView flutterWebView = FlutterWebView.this;
                    flutterWebView.webView = null;
                    PullToRefreshLayout pullToRefreshLayout = flutterWebView.pullToRefreshLayout;
                    if (pullToRefreshLayout != null) {
                        pullToRefreshLayout.dispose();
                        FlutterWebView.this.pullToRefreshLayout = null;
                    }
                }
            });
            this.webView.getSettings().setJavaScriptEnabled(false);
            this.webView.loadUrl("about:blank");
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
        return pullToRefreshLayout != null ? pullToRefreshLayout : this.webView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.PlatformWebView
    public void makeInitialLoad(HashMap<String, Object> hashMap) {
        Integer num = (Integer) hashMap.get("windowId");
        Map map = (Map) hashMap.get("initialUrlRequest");
        String str = (String) hashMap.get("initialFile");
        Map map2 = (Map) hashMap.get("initialData");
        if (num != null) {
            Message message = InAppWebViewChromeClient.windowWebViewMessages.get(num);
            if (message != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                message.sendToTarget();
                return;
            }
            return;
        }
        if (str != null) {
            try {
                this.webView.loadFile(str);
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
                Log.e(LOG_TAG, str + " asset file cannot be found!", e10);
                return;
            }
        }
        if (map2 == null) {
            if (map != null) {
                this.webView.loadUrl(URLRequest.fromMap(map));
                return;
            }
            return;
        }
        this.webView.loadDataWithBaseURL((String) map2.get("baseUrl"), (String) map2.get("data"), (String) map2.get("mimeType"), (String) map2.get("encoding"), (String) map2.get("historyUrl"));
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(View view) {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.options.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.setContainerView(view);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewDetached() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.options.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.setContainerView(null);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionLocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.options.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.lockInputConnection();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionUnlocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.options.useHybridComposition.booleanValue()) {
            return;
        }
        this.webView.unlockInputConnection();
    }
}
