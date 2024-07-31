package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsMenuItem;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p260s.C4379a;
import p260s.C4380b;
import p260s.C4382d;
import p260s.C4384f;

/* loaded from: classes.dex */
public class ChromeCustomTabsActivity extends Activity implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "CustomTabsActivity";
    public CustomTabsActionButton actionButton;
    public C4382d.b builder;
    public MethodChannel channel;
    public C4384f customTabsSession;

    /* renamed from: id */
    public String f5365id;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public ChromeCustomTabsOptions options;
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    public final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    public boolean onChromeSafariBrowserOpened = false;
    public boolean onChromeSafariBrowserCompletedInitialLoad = false;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity$1 */
    /* loaded from: classes.dex */
    public class C14201 implements CustomTabActivityHelper.ConnectionCallback {
        public final /* synthetic */ ChromeCustomTabsActivity val$chromeCustomTabsActivity;

        public C14201(ChromeCustomTabsActivity chromeCustomTabsActivity) {
            r2 = chromeCustomTabsActivity;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
        public void onCustomTabsConnected() {
            ChromeCustomTabsActivity.this.customTabsConnected();
        }

        @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
        public void onCustomTabsDisconnected() {
            r2.close();
            ChromeCustomTabsActivity.this.dispose();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity$2 */
    /* loaded from: classes.dex */
    public class C14212 extends C4380b {
        public C14212() {
        }

        @Override // p260s.C4380b
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // p260s.C4380b
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // p260s.C4380b
        public void onNavigationEvent(int i10, Bundle bundle) {
            if (i10 == 5) {
                ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                if (!chromeCustomTabsActivity.onChromeSafariBrowserOpened) {
                    chromeCustomTabsActivity.onChromeSafariBrowserOpened = true;
                    ChromeCustomTabsActivity.this.channel.invokeMethod("onChromeSafariBrowserOpened", new HashMap());
                }
            }
            if (i10 == 2) {
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                if (chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad) {
                    return;
                }
                chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad = true;
                ChromeCustomTabsActivity.this.channel.invokeMethod("onChromeSafariBrowserCompletedInitialLoad", new HashMap());
            }
        }

        @Override // p260s.C4380b
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // p260s.C4380b
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        }
    }

    private PendingIntent createPendingIntent(int i10) {
        if (this.manager == null) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i10);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f5365id);
        bundle.putString(ActionBroadcastReceiver.CHROME_MANAGER_ID, this.manager.f5366id);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, i10, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    private void prepareCustomTabs() {
        ChromeCustomTabsOptions chromeCustomTabsOptions = this.options;
        Boolean bool = chromeCustomTabsOptions.addDefaultShareMenuItem;
        if (bool != null) {
            this.builder.m16956i(bool.booleanValue() ? 1 : 2);
        } else {
            this.builder.m16956i(chromeCustomTabsOptions.shareState.intValue());
        }
        String str = this.options.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.builder.m16952e(new C4379a.a().m16938b(Color.parseColor(this.options.toolbarBackgroundColor)).m16937a());
        }
        this.builder.m16957j(this.options.showTitle.booleanValue());
        this.builder.m16958k(this.options.enableUrlBarHiding.booleanValue());
        this.builder.m16953f(this.options.instantAppsEnabled.booleanValue());
        for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            PendingIntent createPendingIntent = createPendingIntent(customTabsMenuItem.getId());
            if (createPendingIntent != null) {
                this.builder.m16948a(customTabsMenuItem.getLabel(), createPendingIntent);
            }
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options);
            PendingIntent createPendingIntent2 = createPendingIntent(this.actionButton.getId());
            if (createPendingIntent2 != null) {
                this.builder.m16950c(decodeByteArray, this.actionButton.getDescription(), createPendingIntent2, this.actionButton.isShouldTint());
            }
        }
    }

    private void prepareCustomTabsIntent(C4382d c4382d) {
        String str = this.options.packageName;
        if (str != null) {
            c4382d.f16085a.setPackage(str);
        } else {
            c4382d.f16085a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.options.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, c4382d.f16085a);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        this.channel.invokeMethod("onChromeSafariBrowserClosed", new HashMap());
    }

    public void customTabsConnected() {
        this.customTabsSession = this.customTabActivityHelper.getSession();
        Uri parse = Uri.parse(this.initialUrl);
        this.customTabActivityHelper.mayLaunchUrl(parse, null, null);
        this.builder = new C4382d.b(this.customTabsSession);
        prepareCustomTabs();
        C4382d m16949b = this.builder.m16949b();
        prepareCustomTabsIntent(m16949b);
        CustomTabActivityHelper.openCustomTab(this, m16949b, parse, 100);
    }

    public void dispose() {
        onStop();
        onDestroy();
        this.channel.setMethodCallHandler(null);
        this.manager = null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        BinaryMessenger binaryMessenger;
        super.onCreate(bundle);
        setContentView(C1417R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.f5365id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || (binaryMessenger = inAppWebViewFlutterPlugin.messenger) == null) {
            return;
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.pichillilorenzo/flutter_chromesafaribrowser_" + this.f5365id);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.initialUrl = extras.getString(WebViewActivity.URL_EXTRA);
        ChromeCustomTabsOptions chromeCustomTabsOptions = new ChromeCustomTabsOptions();
        this.options = chromeCustomTabsOptions;
        chromeCustomTabsOptions.parse((Map<String, Object>) extras.getSerializable("options"));
        this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
        Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
        }
        this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity.1
            public final /* synthetic */ ChromeCustomTabsActivity val$chromeCustomTabsActivity;

            public C14201(ChromeCustomTabsActivity this) {
                r2 = this;
            }

            @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity.this.customTabsConnected();
            }

            @Override // com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                r2.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new C4380b() { // from class: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeCustomTabsActivity.2
            public C14212() {
            }

            @Override // p260s.C4380b
            public void extraCallback(String str, Bundle bundle2) {
            }

            @Override // p260s.C4380b
            public void onMessageChannelReady(Bundle bundle2) {
            }

            @Override // p260s.C4380b
            public void onNavigationEvent(int i10, Bundle bundle2) {
                if (i10 == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onChromeSafariBrowserOpened) {
                        chromeCustomTabsActivity.onChromeSafariBrowserOpened = true;
                        ChromeCustomTabsActivity.this.channel.invokeMethod("onChromeSafariBrowserOpened", new HashMap());
                    }
                }
                if (i10 == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad) {
                        return;
                    }
                    chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad = true;
                    ChromeCustomTabsActivity.this.channel.invokeMethod("onChromeSafariBrowserCompletedInitialLoad", new HashMap());
                }
            }

            @Override // p260s.C4380b
            public void onPostMessage(String str, Bundle bundle2) {
            }

            @Override // p260s.C4380b
            public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle2) {
            }
        });
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        String str = methodCall.method;
        str.hashCode();
        if (!str.equals("close")) {
            result.notImplemented();
            return;
        }
        onStop();
        onDestroy();
        close();
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && inAppWebViewFlutterPlugin.activity != null) {
            Activity activity = this.manager.plugin.activity;
            Intent intent = new Intent(activity, activity.getClass());
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            this.manager.plugin.activity.startActivity(intent);
        }
        dispose();
        result.success(Boolean.TRUE);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.customTabActivityHelper.bindCustomTabsService(this);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
    }
}
