package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {
    public static final String CHROME_MANAGER_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.CHROME_MANAGER_ID";
    public static final String KEY_ACTION_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID";
    public static final String KEY_ACTION_VIEW_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID";
    public static final String KEY_URL_TITLE = "android.intent.extra.SUBJECT";
    public static final String LOG_TAG = "ActionBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ChromeSafariBrowserManager chromeSafariBrowserManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        BinaryMessenger binaryMessenger;
        String dataString = intent.getDataString();
        if (dataString != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getString(KEY_ACTION_VIEW_ID);
            int i10 = extras.getInt(KEY_ACTION_ID);
            String string2 = extras.getString(KEY_URL_TITLE);
            String string3 = extras.getString(CHROME_MANAGER_ID);
            if (string3 == null || (chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(string3)) == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || (binaryMessenger = inAppWebViewFlutterPlugin.messenger) == null) {
                return;
            }
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_chromesafaribrowser_" + string);
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, dataString);
            hashMap.put("title", string2);
            hashMap.put("id", Integer.valueOf(i10));
            methodChannel.invokeMethod("onChromeSafariBrowserItemActionPerform", hashMap);
        }
    }
}
