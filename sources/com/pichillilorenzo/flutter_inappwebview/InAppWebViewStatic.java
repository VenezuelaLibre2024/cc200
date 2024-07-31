package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p004a2.C0038h;
import p004a2.C0039i;

/* loaded from: classes.dex */
public class InAppWebViewStatic implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "InAppWebViewStatic";
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic$1 */
    /* loaded from: classes.dex */
    public class RunnableC14061 implements Runnable {
        public final /* synthetic */ MethodChannel.Result val$result;

        public RunnableC14061(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            r2.success(Boolean.TRUE);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic$2 */
    /* loaded from: classes.dex */
    public class C14072 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14072(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic$3 */
    /* loaded from: classes.dex */
    public class C14083 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14083(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    public InAppWebViewStatic(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_static");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.plugin = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0053. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Context context;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1600358415:
                if (str.equals("setSafeBrowsingWhitelist")) {
                    c10 = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c10 = 2;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c10 = 3;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (C0039i.m154a("SAFE_BROWSING_ALLOWLIST")) {
                    C0038h.m150k(new HashSet((List) methodCall.argument("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.2
                        public final /* synthetic */ MethodChannel.Result val$result;

                        public C14072(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            r2.success(bool);
                        }
                    });
                    return;
                }
                if (C0039i.m154a("SAFE_BROWSING_WHITELIST")) {
                    C0038h.m151l((List) methodCall.argument("hosts"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.3
                        public final /* synthetic */ MethodChannel.Result val$result;

                        public C14083(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            r2.success(bool);
                        }
                    });
                    return;
                }
                obj = Boolean.FALSE;
                result2.success(obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) methodCall.argument("debuggingEnabled")).booleanValue();
                if (Build.VERSION.SDK_INT >= 19) {
                    WebView.setWebContentsDebuggingEnabled(booleanValue);
                }
                obj = Boolean.TRUE;
                result2.success(obj);
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 21) {
                    WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.1
                        public final /* synthetic */ MethodChannel.Result val$result;

                        public RunnableC14061(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            r2.success(Boolean.TRUE);
                        }
                    });
                    return;
                }
                obj = Boolean.FALSE;
                result2.success(obj);
                return;
            case 3:
                if (C0039i.m154a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    obj = C0038h.m148i().toString();
                    result2.success(obj);
                    return;
                }
                result2.success(null);
                return;
            case 4:
                obj = WebSettings.getDefaultUserAgent(this.plugin.applicationContext);
                result2.success(obj);
                return;
            case 5:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 26 || (inAppWebViewFlutterPlugin = this.plugin) == null || ((context = inAppWebViewFlutterPlugin.activity) == null && inAppWebViewFlutterPlugin.applicationContext == null)) {
                    if (i10 >= 21) {
                        try {
                            result2.success(convertWebViewPackageToMap((PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0])));
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    result2.success(null);
                    return;
                }
                if (context == null) {
                    context = inAppWebViewFlutterPlugin.applicationContext;
                }
                obj = convertWebViewPackageToMap(C0038h.m143d(context));
                result2.success(obj);
                return;
            default:
                result2.notImplemented();
                return;
        }
    }
}
