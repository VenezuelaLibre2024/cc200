package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.util.Log;
import android.webkit.WebView;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;
import java.util.Map;
import p004a2.AbstractC0040j;
import p004a2.AbstractC0041k;
import p004a2.C0039i;

/* loaded from: classes2.dex */
public class InAppWebViewRenderProcessClient extends AbstractC0041k {
    public static final String LOG_TAG = "IAWRenderProcessClient";
    private final MethodChannel channel;

    public InAppWebViewRenderProcessClient(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    public void dispose() {
    }

    @Override // p004a2.AbstractC0041k
    public void onRenderProcessResponsive(WebView webView, final AbstractC0040j abstractC0040j) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, webView.getUrl());
        this.channel.invokeMethod("onRenderProcessResponsive", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewRenderProcessClient.2
            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb2.toString());
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null || abstractC0040j == null || num.intValue() != 0 || !C0039i.m154a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return;
                }
                abstractC0040j.mo155a();
            }
        });
    }

    @Override // p004a2.AbstractC0041k
    public void onRenderProcessUnresponsive(WebView webView, final AbstractC0040j abstractC0040j) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, webView.getUrl());
        this.channel.invokeMethod("onRenderProcessUnresponsive", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewRenderProcessClient.1
            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb2.toString());
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null || abstractC0040j == null || num.intValue() != 0 || !C0039i.m154a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return;
                }
                abstractC0040j.mo155a();
            }
        });
    }
}
