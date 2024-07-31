package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class ChromeSafariBrowserManager implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "ChromeBrowserManager";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public MethodChannel channel;

    /* renamed from: id */
    public String f5366id = UUID.randomUUID().toString();
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_chromesafaribrowser");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        shared.put(this.f5366id, this);
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        shared.remove(this.f5366id);
        this.plugin = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool;
        Activity activity;
        String str = (String) methodCall.argument("id");
        String str2 = methodCall.method;
        str2.hashCode();
        if (str2.equals("open")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                open(this.plugin.activity, str, (String) methodCall.argument(WebViewActivity.URL_EXTRA), (HashMap) methodCall.argument("options"), (HashMap) methodCall.argument("actionButton"), (List) methodCall.argument("menuItemList"), result);
                return;
            }
        } else {
            if (!str2.equals("isAvailable")) {
                result.notImplemented();
                return;
            }
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
            if (inAppWebViewFlutterPlugin2 != null && (activity = inAppWebViewFlutterPlugin2.activity) != null) {
                bool = Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity));
                result.success(bool);
            }
        }
        bool = Boolean.FALSE;
        result.success(bool);
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, List<HashMap<String, Object>> list, MethodChannel.Result result) {
        Bundle bundle = new Bundle();
        bundle.putString(WebViewActivity.URL_EXTRA, str2);
        bundle.putBoolean("isData", false);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f5366id);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("actionButton", hashMap2);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap, "isTrustedWebActivity", bool);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            result.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) (!bool2.booleanValue() ? !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class : !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class));
        intent.putExtras(bundle);
        if (((Boolean) Util.getOrDefault(hashMap, "noHistory", bool)).booleanValue()) {
            intent.addFlags(1073741824);
        }
        activity.startActivity(intent);
        result.success(Boolean.TRUE);
    }
}
