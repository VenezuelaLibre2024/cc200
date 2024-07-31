package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.view.FlutterView;

/* loaded from: classes.dex */
public class InAppWebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    public static final String LOG_TAG = "InAppWebViewFlutterPL";
    public static ValueCallback<Uri[]> filePathCallback;
    public static ValueCallback<Uri> filePathCallbackLegacy;
    public Activity activity;
    public ActivityPluginBinding activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public FlutterPlugin.FlutterAssets flutterAssets;
    public FlutterView flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewStatic inAppWebViewStatic;
    public BinaryMessenger messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public PlatformUtil platformUtil;
    public PluginRegistry.Registrar registrar;
    public ServiceWorkerManager serviceWorkerManager;
    public WebViewFeatureManager webViewFeatureManager;

    private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger, Activity activity, PlatformViewRegistry platformViewRegistry, FlutterView flutterView) {
        this.applicationContext = context;
        this.activity = activity;
        this.messenger = binaryMessenger;
        this.flutterView = flutterView;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        FlutterWebViewFactory flutterWebViewFactory = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory;
        platformViewRegistry.registerViewFactory("com.pichillilorenzo/flutter_inappwebview", flutterWebViewFactory);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewStatic = new InAppWebViewStatic(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            this.serviceWorkerManager = new ServiceWorkerManager(this);
        }
        if (i10 >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = new InAppWebViewFlutterPlugin();
        inAppWebViewFlutterPlugin.registrar = registrar;
        inAppWebViewFlutterPlugin.onAttachedToEngine(registrar.context(), registrar.messenger(), registrar.activity(), registrar.platformViewRegistry(), registrar.view());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        this.activity = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.flutterAssets = flutterPluginBinding.getFlutterAssets();
        onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger(), this.activity, flutterPluginBinding.getPlatformViewRegistry(), null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        PlatformUtil platformUtil = this.platformUtil;
        if (platformUtil != null) {
            platformUtil.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager = this.inAppBrowserManager;
        if (inAppBrowserManager != null) {
            inAppBrowserManager.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager != null) {
            headlessInAppWebViewManager.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager != null) {
            chromeSafariBrowserManager.dispose();
            this.chromeSafariBrowserManager = null;
        }
        MyCookieManager myCookieManager = this.myCookieManager;
        if (myCookieManager != null) {
            myCookieManager.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage = this.myWebStorage;
        if (myWebStorage != null) {
            myWebStorage.dispose();
            this.myWebStorage = null;
        }
        CredentialDatabaseHandler credentialDatabaseHandler = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler != null && Build.VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewStatic inAppWebViewStatic = this.inAppWebViewStatic;
        if (inAppWebViewStatic != null) {
            inAppWebViewStatic.dispose();
            this.inAppWebViewStatic = null;
        }
        ServiceWorkerManager serviceWorkerManager = this.serviceWorkerManager;
        if (serviceWorkerManager != null && Build.VERSION.SDK_INT >= 24) {
            serviceWorkerManager.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager = this.webViewFeatureManager;
        if (webViewFeatureManager != null) {
            webViewFeatureManager.dispose();
            this.webViewFeatureManager = null;
        }
        filePathCallbackLegacy = null;
        filePathCallback = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        this.activity = activityPluginBinding.getActivity();
    }
}
