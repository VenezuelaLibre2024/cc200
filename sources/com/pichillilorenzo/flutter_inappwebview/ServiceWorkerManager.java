package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.Util;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import p004a2.AbstractC0032b;
import p004a2.AbstractC0033c;
import p004a2.AbstractC0034d;
import p004a2.C0039i;

/* loaded from: classes.dex */
public class ServiceWorkerManager implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "ServiceWorkerManager";
    public static AbstractC0033c serviceWorkerController;
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.ServiceWorkerManager$1 */
    /* loaded from: classes.dex */
    public class C14181 extends AbstractC0032b {
        public C14181() {
        }

        @Override // p004a2.AbstractC0032b
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, webResourceRequest.getUrl().toString());
            hashMap.put(Constants.METHOD, webResourceRequest.getMethod());
            hashMap.put("headers", webResourceRequest.getRequestHeaders());
            hashMap.put("isForMainFrame", Boolean.valueOf(webResourceRequest.isForMainFrame()));
            hashMap.put("hasGesture", Boolean.valueOf(webResourceRequest.hasGesture()));
            hashMap.put("isRedirect", Boolean.valueOf(webResourceRequest.isRedirect()));
            try {
                Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(ServiceWorkerManager.this.channel, "shouldInterceptRequest", hashMap);
                String str = invokeMethodAndWait.error;
                if (str != null) {
                    Log.e(ServiceWorkerManager.LOG_TAG, str);
                    return null;
                }
                Object obj = invokeMethodAndWait.result;
                if (obj == null) {
                    return null;
                }
                Map map = (Map) obj;
                String str2 = (String) map.get("contentType");
                String str3 = (String) map.get("contentEncoding");
                byte[] bArr = (byte[]) map.get("data");
                Map map2 = (Map) map.get("headers");
                Integer num = (Integer) map.get("statusCode");
                String str4 = (String) map.get("reasonPhrase");
                ByteArrayInputStream byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
                return (!(map2 == null && num == null && str4 == null) && Build.VERSION.SDK_INT >= 21) ? new WebResourceResponse(str2, str3, num.intValue(), str4, map2, byteArrayInputStream) : new WebResourceResponse(str2, str3, byteArrayInputStream);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class DummyServiceWorkerClientCompat extends AbstractC0032b {
        public static final AbstractC0032b INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        @Override // p004a2.AbstractC0032b
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_serviceworkercontroller");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private AbstractC0032b dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && C0039i.m154a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = AbstractC0033c.m122a();
        }
    }

    private void setServiceWorkerClient(Boolean bool) {
        AbstractC0033c abstractC0033c = serviceWorkerController;
        if (abstractC0033c != null) {
            abstractC0033c.mo124c(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new AbstractC0032b() { // from class: com.pichillilorenzo.flutter_inappwebview.ServiceWorkerManager.1
                public C14181() {
                }

                @Override // p004a2.AbstractC0032b
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(WebViewActivity.URL_EXTRA, webResourceRequest.getUrl().toString());
                    hashMap.put(Constants.METHOD, webResourceRequest.getMethod());
                    hashMap.put("headers", webResourceRequest.getRequestHeaders());
                    hashMap.put("isForMainFrame", Boolean.valueOf(webResourceRequest.isForMainFrame()));
                    hashMap.put("hasGesture", Boolean.valueOf(webResourceRequest.hasGesture()));
                    hashMap.put("isRedirect", Boolean.valueOf(webResourceRequest.isRedirect()));
                    try {
                        Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(ServiceWorkerManager.this.channel, "shouldInterceptRequest", hashMap);
                        String str = invokeMethodAndWait.error;
                        if (str != null) {
                            Log.e(ServiceWorkerManager.LOG_TAG, str);
                            return null;
                        }
                        Object obj = invokeMethodAndWait.result;
                        if (obj == null) {
                            return null;
                        }
                        Map map = (Map) obj;
                        String str2 = (String) map.get("contentType");
                        String str3 = (String) map.get("contentEncoding");
                        byte[] bArr = (byte[]) map.get("data");
                        Map map2 = (Map) map.get("headers");
                        Integer num = (Integer) map.get("statusCode");
                        String str4 = (String) map.get("reasonPhrase");
                        ByteArrayInputStream byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
                        return (!(map2 == null && num == null && str4 == null) && Build.VERSION.SDK_INT >= 21) ? new WebResourceResponse(str2, str3, num.intValue(), str4, map2, byteArrayInputStream) : new WebResourceResponse(str2, str3, byteArrayInputStream);
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                        return null;
                    }
                }
            });
        }
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        AbstractC0033c abstractC0033c = serviceWorkerController;
        if (abstractC0033c != null) {
            abstractC0033c.mo124c(dummyServiceWorkerClientCompat());
            serviceWorkerController = null;
        }
        this.plugin = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x008c. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean mo125a;
        Object valueOf;
        init();
        AbstractC0033c abstractC0033c = serviceWorkerController;
        AbstractC0034d mo123b = abstractC0033c != null ? abstractC0033c.mo123b() : null;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1165005700:
                if (str.equals("setServiceWorkerClient")) {
                    c10 = 1;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c10 = 2;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c10 = 3;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    mo125a = mo123b.mo125a();
                    valueOf = Boolean.valueOf(mo125a);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 1:
                setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 2:
                if (mo123b == null || !C0039i.m154a("SERVICE_WORKER_CACHE_MODE")) {
                    result.success(null);
                    return;
                } else {
                    valueOf = Integer.valueOf(mo123b.mo128d());
                    result.success(valueOf);
                    return;
                }
            case 3:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_FILE_ACCESS")) {
                    mo125a = mo123b.mo126b();
                    valueOf = Boolean.valueOf(mo125a);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 4:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_CACHE_MODE")) {
                    mo123b.mo132h(((Integer) methodCall.argument("mode")).intValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 5:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    mo123b.mo131g(((Boolean) methodCall.argument("flag")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 6:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    mo123b.mo129e(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 7:
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_FILE_ACCESS")) {
                    mo123b.mo130f(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case '\b':
                if (mo123b != null && C0039i.m154a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    mo125a = mo123b.mo127c();
                    valueOf = Boolean.valueOf(mo125a);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
