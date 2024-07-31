package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HeadlessInAppWebViewManager implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final Map<String, HeadlessInAppWebView> webViews = new HashMap();
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        for (HeadlessInAppWebView headlessInAppWebView : webViews.values()) {
            if (headlessInAppWebView != null) {
                headlessInAppWebView.dispose();
            }
        }
        webViews.clear();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("id");
        String str2 = methodCall.method;
        str2.hashCode();
        if (!str2.equals("run")) {
            result.notImplemented();
        } else {
            run(str, (HashMap) methodCall.argument("params"));
            result.success(Boolean.TRUE);
        }
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            Context context = inAppWebViewFlutterPlugin.activity;
            if (context == null && inAppWebViewFlutterPlugin.applicationContext == null) {
                return;
            }
            if (context == null) {
                context = inAppWebViewFlutterPlugin.applicationContext;
            }
            FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, context, str, hashMap);
            HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
            webViews.put(str, headlessInAppWebView);
            headlessInAppWebView.prepare(hashMap);
            headlessInAppWebView.onWebViewCreated();
            flutterWebView.makeInitialLoad(hashMap);
        }
    }
}
