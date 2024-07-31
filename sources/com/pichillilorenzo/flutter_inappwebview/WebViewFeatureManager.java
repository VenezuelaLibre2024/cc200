package com.pichillilorenzo.flutter_inappwebview;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import p004a2.C0039i;

/* loaded from: classes.dex */
public class WebViewFeatureManager implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "WebViewFeatureManager";
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_webviewfeature");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.plugin = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("isFeatureSupported")) {
            result.success(Boolean.valueOf(C0039i.m154a((String) methodCall.argument("feature"))));
        } else {
            result.notImplemented();
        }
    }
}
