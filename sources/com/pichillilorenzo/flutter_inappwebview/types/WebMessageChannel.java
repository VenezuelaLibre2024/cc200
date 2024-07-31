package com.pichillilorenzo.flutter_inappwebview.types;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p004a2.AbstractC0037g;
import p004a2.C0036f;
import p004a2.C0038h;
import p004a2.C0039i;

/* loaded from: classes2.dex */
public class WebMessageChannel implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "WebMessageChannel";
    public MethodChannel channel;
    public final List<AbstractC0037g> compatPorts;

    /* renamed from: id */
    public String f5381id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel$1 */
    /* loaded from: classes2.dex */
    public class C14841 implements ValueCallback<String> {
        public final /* synthetic */ ValueCallback val$callback;
        public final /* synthetic */ WebMessageChannel val$webMessageChannel;

        public C14841(ValueCallback valueCallback, WebMessageChannel webMessageChannel) {
            r2 = valueCallback;
            r3 = webMessageChannel;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.onReceiveValue(r3);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel$2 */
    /* loaded from: classes2.dex */
    public class C14852 extends AbstractC0037g.a {
        public final /* synthetic */ Integer val$index;

        public C14852(Integer num) {
            r2 = num;
        }

        @Override // p004a2.AbstractC0037g.a
        public void onMessage(AbstractC0037g abstractC0037g, C0036f c0036f) {
            super.onMessage(abstractC0037g, c0036f);
            HashMap hashMap = new HashMap();
            hashMap.put("index", r2);
            hashMap.put(Constants.MESSAGE, c0036f != null ? c0036f.m133a() : null);
            WebMessageChannel.this.channel.invokeMethod("onMessage", hashMap);
        }
    }

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.f5381id = str;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewInterface.getPlugin().messenger, "com.pichillilorenzo/flutter_inappwebview_web_message_channel_" + str);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(C0038h.m142c((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    private void closeForInAppWebView(Integer num, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C0039i.m154a("WEB_MESSAGE_PORT_CLOSE")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).mo135a();
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    private void postMessageForInAppWebView(Integer num, Map<String, Object> map, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C0039i.m154a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            result.success(Boolean.TRUE);
            return;
        }
        AbstractC0037g abstractC0037g = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<Map> list = (List) map.get("ports");
        if (list != null) {
            for (Map map2 : list) {
                String str = (String) map2.get("webMessageChannelId");
                Integer num2 = (Integer) map2.get("index");
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(str);
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(num2.intValue()));
                }
            }
        }
        try {
            abstractC0037g.mo138d(new C0036f((String) map.get("data"), (AbstractC0037g[]) arrayList.toArray(new AbstractC0037g[0])));
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    private void setWebMessageCallbackForInAppWebView(Integer num, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C0039i.m154a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).mo139e(new AbstractC0037g.a() { // from class: com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel.2
                public final /* synthetic */ Integer val$index;

                public C14852(Integer num2) {
                    r2 = num2;
                }

                @Override // p004a2.AbstractC0037g.a
                public void onMessage(AbstractC0037g abstractC0037g, C0036f c0036f) {
                    super.onMessage(abstractC0037g, c0036f);
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", r2);
                    hashMap.put(Constants.MESSAGE, c0036f != null ? c0036f.m133a() : null);
                    WebMessageChannel.this.channel.invokeMethod("onMessage", hashMap);
                }
            });
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public void dispose() {
        if (C0039i.m154a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<AbstractC0037g> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo135a();
                } catch (Exception unused) {
                }
            }
        }
        this.channel.setMethodCallHandler(null);
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(this);
            return;
        }
        inAppWebViewInterface.evaluateJavascript("(function() {window.flutter_inappwebview._webMessageChannels['" + this.f5381id + "'] = new MessageChannel();})();", null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel.1
            public final /* synthetic */ ValueCallback val$callback;
            public final /* synthetic */ WebMessageChannel val$webMessageChannel;

            public C14841(ValueCallback valueCallback2, WebMessageChannel this) {
                r2 = valueCallback2;
                r3 = this;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                r2.onReceiveValue(r3);
            }
        });
    }

    public void onMessage(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("index", num);
        hashMap.put(Constants.MESSAGE, str);
        this.channel.invokeMethod("onMessage", hashMap);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 94756344:
                if (str.equals("close")) {
                    c10 = 0;
                    break;
                }
                break;
            case 556190586:
                if (str.equals("setWebMessageCallback")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (this.webView instanceof InAppWebView) {
                    closeForInAppWebView((Integer) methodCall.argument("index"), result);
                    return;
                }
                break;
            case 1:
                if (this.webView instanceof InAppWebView) {
                    setWebMessageCallbackForInAppWebView((Integer) methodCall.argument("index"), result);
                    return;
                }
                break;
            case 2:
                if (this.webView instanceof InAppWebView) {
                    postMessageForInAppWebView((Integer) methodCall.argument("index"), (Map) methodCall.argument(Constants.MESSAGE), result);
                    return;
                }
                break;
            default:
                result.notImplemented();
                return;
        }
        result.success(Boolean.TRUE);
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f5381id);
        return hashMap;
    }
}
