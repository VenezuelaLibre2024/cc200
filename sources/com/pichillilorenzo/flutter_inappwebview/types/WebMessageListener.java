package com.pichillilorenzo.flutter_inappwebview.types;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p004a2.AbstractC0031a;
import p004a2.C0036f;
import p004a2.C0038h;
import p004a2.C0039i;

/* loaded from: classes2.dex */
public class WebMessageListener implements MethodChannel.MethodCallHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String LOG_TAG = "WebMessageListener";
    public Set<String> allowedOriginRules;
    public MethodChannel channel;

    /* renamed from: id */
    public String f5382id;
    public String jsObjectName;
    public C0038h.b listener;
    public AbstractC0031a replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, String str2, Set<String> set) {
        this.f5382id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_inappwebview_web_message_listener_" + this.f5382id + "_" + this.jsObjectName);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        if (this.webView instanceof InAppWebView) {
            this.listener = new C0038h.b() { // from class: com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener.1
                @Override // p004a2.C0038h.b
                public void onPostMessage(WebView webView, C0036f c0036f, Uri uri, boolean z10, AbstractC0031a abstractC0031a) {
                    WebMessageListener.this.replyProxy = abstractC0031a;
                    this.onPostMessage(c0036f.m133a(), uri, z10);
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, binaryMessenger, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    private void postMessageForInAppWebView(String str, MethodChannel.Result result) {
        if (this.replyProxy != null && C0039i.m154a("WEB_MESSAGE_LISTENER")) {
            this.replyProxy.mo121a(str);
        }
        result.success(Boolean.TRUE);
    }

    public void assertOriginRulesValid() {
        int i10 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception("allowedOriginRules[" + i10 + "] is null");
            }
            if (str.isEmpty()) {
                throw new Exception("allowedOriginRules[" + i10 + "] is empty");
            }
            if (!"*".equals(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!path.isEmpty()) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (host != null) {
                    int indexOf = host.indexOf("*");
                    if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception("allowedOriginRules " + str + " is invalid");
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                    }
                }
                i10++;
            }
        }
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        String sb2;
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if ("*".equals(str)) {
                    sb2 = "'*'";
                } else {
                    Uri parse = Uri.parse(str);
                    String str2 = parse.getHost() != null ? "'" + Util.replaceAll(parse.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("{scheme: '");
                    sb3.append(parse.getScheme());
                    sb3.append("', host: ");
                    sb3.append(str2);
                    sb3.append(", port: ");
                    sb3.append(parse.getPort() != -1 ? Integer.valueOf(parse.getPort()) : "null");
                    sb3.append("}");
                    sb2 = sb3.toString();
                }
                arrayList.add(sb2);
            }
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, "(function() {  var allowedOriginRules = [" + TextUtils.join(", ", arrayList) + "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['" + replaceAll + "'] = new FlutterInAppWebViewWebMessageListener('" + replaceAll + "');  }})();", UserScriptInjectionTime.AT_DOCUMENT_START, null, false));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|(2:72|(1:74)(1:75))(1:21)|(2:69|(1:71))(1:24)|25|(8:29|30|31|32|33|(1:63)(1:48)|(1:50)|(2:56|57))|68|31|32|33|(1:35)|63|(0)|(1:62)(4:52|54|56|57)) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOriginAllowed(java.lang.String r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener.isOriginAllowed(java.lang.String, java.lang.String, int):boolean");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (!str.equals("postMessage")) {
            result.notImplemented();
        } else if (this.webView instanceof InAppWebView) {
            postMessageForInAppWebView((String) methodCall.argument(Constants.MESSAGE), result);
        } else {
            result.success(Boolean.TRUE);
        }
    }

    public void onPostMessage(String str, Uri uri, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MESSAGE, str);
        hashMap.put("sourceOrigin", uri.toString().equals("null") ? null : uri.toString());
        hashMap.put("isMainFrame", Boolean.valueOf(z10));
        this.channel.invokeMethod("onPostMessage", hashMap);
    }
}
