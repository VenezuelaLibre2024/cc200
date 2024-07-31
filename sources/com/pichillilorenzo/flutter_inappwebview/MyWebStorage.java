package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MyWebStorage implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "MyWebStorage";
    public static WebStorage webStorageManager;
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.plugin = null;
    }

    public void getOrigins(final MethodChannel.Result result) {
        webStorageManager.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Map map) {
                ArrayList arrayList = new ArrayList();
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                    HashMap hashMap = new HashMap();
                    hashMap.put("origin", origin.getOrigin());
                    hashMap.put("quota", Long.valueOf(origin.getQuota()));
                    hashMap.put("usage", Long.valueOf(origin.getUsage()));
                    arrayList.add(hashMap);
                }
                result.success(arrayList);
            }
        });
    }

    public void getQuotaForOrigin(String str, final MethodChannel.Result result) {
        webStorageManager.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Long l10) {
                result.success(l10);
            }
        });
    }

    public void getUsageForOrigin(String str, final MethodChannel.Result result) {
        webStorageManager.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Long l10) {
                result.success(l10);
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1308548435:
                if (str.equals("getQuotaForOrigin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1117417280:
                if (str.equals("deleteAllData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -876677967:
                if (str.equals("deleteOrigin")) {
                    c10 = 2;
                    break;
                }
                break;
            case -165580329:
                if (str.equals("getOrigins")) {
                    c10 = 3;
                    break;
                }
                break;
            case 843309476:
                if (str.equals("getUsageForOrigin")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                getQuotaForOrigin((String) methodCall.argument("origin"), result);
                return;
            case 1:
                webStorageManager.deleteAllData();
                break;
            case 2:
                webStorageManager.deleteOrigin((String) methodCall.argument("origin"));
                break;
            case 3:
                getOrigins(result);
                return;
            case 4:
                getUsageForOrigin((String) methodCall.argument("origin"), result);
                return;
            default:
                result.notImplemented();
                return;
        }
        result.success(Boolean.TRUE);
    }
}
