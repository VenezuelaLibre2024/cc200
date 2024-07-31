package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.appcompat.app.ActivityC0185b;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshOptions;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p101h.AbstractC2259a;

/* loaded from: classes.dex */
public class InAppBrowserActivity extends ActivityC0185b implements InAppBrowserDelegate {
    public static final String LOG_TAG = "InAppBrowserActivity";
    public AbstractC2259a actionBar;
    public MethodChannel channel;
    public String fromActivity;

    /* renamed from: id */
    public String f5370id;
    public InAppBrowserManager manager;
    public Menu menu;
    public InAppWebViewMethodHandler methodCallDelegate;
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;
    public InAppBrowserOptions options = new InAppBrowserOptions();
    public boolean isHidden = false;
    private List<ActivityResultListener> activityResultListeners = new ArrayList();

    private void prepareView() {
        ProgressBar progressBar;
        int i10;
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.prepare();
        }
        if (this.options.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        this.progressBar = (ProgressBar) findViewById(C1417R.id.progressBar);
        if (this.options.hideProgressBar.booleanValue()) {
            progressBar = this.progressBar;
            i10 = 0;
        } else {
            progressBar = this.progressBar;
            i10 = 100;
        }
        progressBar.setMax(i10);
        AbstractC2259a abstractC2259a = this.actionBar;
        if (abstractC2259a != null) {
            abstractC2259a.mo9019v(!this.options.hideTitleBar.booleanValue());
            if (this.options.hideToolbarTop.booleanValue()) {
                this.actionBar.mo9009l();
            }
            String str = this.options.toolbarTopBackgroundColor;
            if (str != null && !str.isEmpty()) {
                this.actionBar.mo9017t(new ColorDrawable(Color.parseColor(this.options.toolbarTopBackgroundColor)));
            }
            String str2 = this.options.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            this.actionBar.mo9021x(this.options.toolbarTopFixedTitle);
        }
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void close(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onExit", hashMap);
        }
        dispose();
        if (result != null) {
            result.success(Boolean.TRUE);
        }
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didChangeProgress(int i10) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.progressBar.setProgress(i10, true);
            } else {
                this.progressBar.setProgress(i10);
            }
            if (i10 == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didChangeTitle(String str) {
        if (this.actionBar != null) {
            String str2 = this.options.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                this.actionBar.mo9021x(str);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didFailNavigation(String str, int i10, String str2) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didFinishNavigation(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didStartNavigation(String str) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public void didUpdateVisitedHistory(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        ActivityPluginBinding activityPluginBinding;
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
        this.activityResultListeners.clear();
        InAppWebViewMethodHandler inAppWebViewMethodHandler = this.methodCallDelegate;
        if (inAppWebViewMethodHandler != null) {
            inAppWebViewMethodHandler.dispose();
            this.methodCallDelegate = null;
        }
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            InAppBrowserManager inAppBrowserManager = this.manager;
            if (inAppBrowserManager != null && (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) != null && (activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding) != null) {
                activityPluginBinding.removeActivityResultListener(inAppWebView.inAppWebViewChromeClient);
            }
            ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.webView);
            }
            this.webView.setWebChromeClient(new WebChromeClient());
            this.webView.setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.4
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    InAppBrowserActivity.this.webView.dispose();
                    InAppBrowserActivity.this.webView.destroy();
                    InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                    inAppBrowserActivity.webView = null;
                    inAppBrowserActivity.manager = null;
                }
            });
            this.webView.loadUrl("about:blank");
            finish();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public Activity getActivity() {
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate
    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public Map<String, Object> getOptions() {
        InAppWebView inAppWebView = this.webView;
        Map<String, Object> options = inAppWebView != null ? inAppWebView.getOptions() : null;
        InAppBrowserOptions inAppBrowserOptions = this.options;
        if (inAppBrowserOptions == null || options == null) {
            return null;
        }
        Map<String, Object> realOptions = inAppBrowserOptions.getRealOptions(this);
        realOptions.putAll(options);
        return realOptions;
    }

    public void goBack() {
        if (this.webView == null || !canGoBack()) {
            return;
        }
        this.webView.goBack();
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForward() {
        if (this.webView == null || !canGoForward()) {
            return;
        }
        this.webView.goForward();
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void hide() {
        if (this.fromActivity == null) {
            return;
        }
        try {
            this.isHidden = true;
            Intent intent = new Intent(this, Class.forName(this.fromActivity));
            intent.setFlags(131072);
            startActivityIfNeeded(intent, 0);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            Log.d(LOG_TAG, e10.getMessage());
        }
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Iterator<ActivityResultListener> it = this.activityResultListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i10, i11, intent)) {
                return;
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    public void onBrowserCreated() {
        HashMap hashMap = new HashMap();
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onBrowserCreated", hashMap);
        }
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.f5370id = extras.getString("id");
        InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = inAppBrowserManager;
        if (inAppBrowserManager == null || (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            return;
        }
        Map<String, Object> map = (Map) extras.getSerializable("options");
        this.options.parse(map);
        this.windowId = Integer.valueOf(extras.getInt("windowId"));
        this.channel = new MethodChannel(this.manager.plugin.messenger, "com.pichillilorenzo/flutter_inappbrowser_" + this.f5370id);
        setContentView(C1417R.layout.activity_web_view);
        Map<String, Object> map2 = (Map) extras.getSerializable("pullToRefreshInitialOptions");
        MethodChannel methodChannel = new MethodChannel(this.manager.plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_" + this.f5370id);
        PullToRefreshOptions pullToRefreshOptions = new PullToRefreshOptions();
        pullToRefreshOptions.parse(map2);
        PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) findViewById(C1417R.id.pullToRefresh);
        this.pullToRefreshLayout = pullToRefreshLayout;
        pullToRefreshLayout.channel = methodChannel;
        pullToRefreshLayout.options = pullToRefreshOptions;
        pullToRefreshLayout.prepare();
        InAppWebView inAppWebView = (InAppWebView) findViewById(C1417R.id.webView);
        this.webView = inAppWebView;
        inAppWebView.windowId = this.windowId;
        inAppWebView.inAppBrowserDelegate = this;
        inAppWebView.channel = this.channel;
        inAppWebView.plugin = this.manager.plugin;
        InAppWebViewMethodHandler inAppWebViewMethodHandler = new InAppWebViewMethodHandler(inAppWebView);
        this.methodCallDelegate = inAppWebViewMethodHandler;
        this.channel.setMethodCallHandler(inAppWebViewMethodHandler);
        this.fromActivity = extras.getString("fromActivity");
        Map<String, Object> map3 = (Map) extras.getSerializable("contextMenu");
        List list = (List) extras.getSerializable("initialUserScripts");
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse(map);
        InAppWebView inAppWebView2 = this.webView;
        inAppWebView2.options = inAppWebViewOptions;
        inAppWebView2.contextMenu = map3;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UserScript.fromMap((Map) it.next()));
            }
        }
        this.webView.userContentController.addUserOnlyScripts(arrayList);
        this.actionBar = getSupportActionBar();
        prepareView();
        if (this.windowId.intValue() != -1) {
            Message message = InAppWebViewChromeClient.windowWebViewMessages.get(this.windowId);
            if (message != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                message.sendToTarget();
            }
        } else {
            String string = extras.getString("initialFile");
            Map map4 = (Map) extras.getSerializable("initialUrlRequest");
            String string2 = extras.getString("initialData");
            if (string != null) {
                try {
                    this.webView.loadFile(string);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    Log.e(LOG_TAG, string + " asset file cannot be found!", e10);
                    return;
                }
            } else if (string2 != null) {
                this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, extras.getString("initialMimeType"), extras.getString("initialEncoding"), extras.getString("initialHistoryUrl"));
            } else if (map4 != null) {
                this.webView.loadUrl(URLRequest.fromMap(map4));
            }
        }
        onBrowserCreated();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        this.menu = menu;
        if (this.actionBar != null && ((str = this.options.toolbarTopFixedTitle) == null || str.isEmpty())) {
            AbstractC2259a abstractC2259a = this.actionBar;
            InAppWebView inAppWebView = this.webView;
            abstractC2259a.mo9021x(inAppWebView != null ? inAppWebView.getTitle() : "");
        }
        if (this.menu == null) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(C1417R.menu.menu_main, this.menu);
        MenuItem findItem = this.menu.findItem(C1417R.id.menu_search);
        if (findItem != null) {
            if (this.options.hideUrlBar.booleanValue()) {
                findItem.setVisible(false);
            }
            SearchView searchView = (SearchView) findItem.getActionView();
            this.searchView = searchView;
            if (searchView != null) {
                searchView.setFocusable(true);
                SearchView searchView2 = this.searchView;
                InAppWebView inAppWebView2 = this.webView;
                searchView2.setQuery(inAppWebView2 != null ? inAppWebView2.getUrl() : "", false);
                this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.1
                    @Override // android.widget.SearchView.OnQueryTextListener
                    public boolean onQueryTextChange(String str2) {
                        return false;
                    }

                    @Override // android.widget.SearchView.OnQueryTextListener
                    public boolean onQueryTextSubmit(String str2) {
                        if (str2.isEmpty()) {
                            return false;
                        }
                        InAppWebView inAppWebView3 = InAppBrowserActivity.this.webView;
                        if (inAppWebView3 != null) {
                            inAppWebView3.loadUrl(str2);
                        }
                        SearchView searchView3 = InAppBrowserActivity.this.searchView;
                        if (searchView3 != null) {
                            searchView3.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                        return true;
                    }
                });
                this.searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.2
                    @Override // android.widget.SearchView.OnCloseListener
                    public boolean onClose() {
                        SearchView searchView3 = InAppBrowserActivity.this.searchView;
                        if (searchView3 != null && searchView3.getQuery().toString().isEmpty()) {
                            InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                            SearchView searchView4 = inAppBrowserActivity.searchView;
                            InAppWebView inAppWebView3 = inAppBrowserActivity.webView;
                            searchView4.setQuery(inAppWebView3 != null ? inAppWebView3.getUrl() : "", false);
                        }
                        return false;
                    }
                });
                this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserActivity.3
                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z10) {
                        SearchView searchView3;
                        if (z10 || (searchView3 = InAppBrowserActivity.this.searchView) == null) {
                            return;
                        }
                        searchView3.setQuery("", false);
                        InAppBrowserActivity.this.searchView.setIconified(true);
                    }
                });
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActivityC0185b, androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onDestroy() {
        dispose();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.ActivityC0185b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                close(null);
                return true;
            }
            if (this.options.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.options.closeOnCannotGoBack.booleanValue()) {
                    close(null);
                }
                return true;
            }
            if (!this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void setOptions(InAppBrowserOptions inAppBrowserOptions, HashMap<String, Object> hashMap) {
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse((Map<String, Object>) hashMap);
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.setOptions(inAppWebViewOptions, hashMap);
        }
        if (hashMap.get("hidden") != null) {
            Boolean bool = this.options.hidden;
            Boolean bool2 = inAppBrowserOptions.hidden;
            if (bool != bool2) {
                if (bool2.booleanValue()) {
                    hide();
                } else {
                    show();
                }
            }
        }
        if (hashMap.get("hideProgressBar") != null) {
            Boolean bool3 = this.options.hideProgressBar;
            Boolean bool4 = inAppBrowserOptions.hideProgressBar;
            if (bool3 != bool4 && this.progressBar != null) {
                if (bool4.booleanValue()) {
                    this.progressBar.setMax(0);
                } else {
                    this.progressBar.setMax(100);
                }
            }
        }
        if (this.actionBar != null && hashMap.get("hideTitleBar") != null) {
            if (this.options.hideTitleBar != inAppBrowserOptions.hideTitleBar) {
                this.actionBar.mo9019v(!r3.booleanValue());
            }
        }
        if (this.actionBar != null && hashMap.get("hideToolbarTop") != null) {
            Boolean bool5 = this.options.hideToolbarTop;
            Boolean bool6 = inAppBrowserOptions.hideToolbarTop;
            if (bool5 != bool6) {
                if (bool6.booleanValue()) {
                    this.actionBar.mo9009l();
                } else {
                    this.actionBar.mo9023z();
                }
            }
        }
        if (this.actionBar != null && hashMap.get("toolbarTopBackgroundColor") != null && !Util.objEquals(this.options.toolbarTopBackgroundColor, inAppBrowserOptions.toolbarTopBackgroundColor) && !inAppBrowserOptions.toolbarTopBackgroundColor.isEmpty()) {
            this.actionBar.mo9017t(new ColorDrawable(Color.parseColor(inAppBrowserOptions.toolbarTopBackgroundColor)));
        }
        if (this.actionBar != null && hashMap.get("toolbarTopFixedTitle") != null && !Util.objEquals(this.options.toolbarTopFixedTitle, inAppBrowserOptions.toolbarTopFixedTitle) && !inAppBrowserOptions.toolbarTopFixedTitle.isEmpty()) {
            this.actionBar.mo9021x(inAppBrowserOptions.toolbarTopFixedTitle);
        }
        if (this.menu != null && hashMap.get("hideUrlBar") != null) {
            Boolean bool7 = this.options.hideUrlBar;
            Boolean bool8 = inAppBrowserOptions.hideUrlBar;
            if (bool7 != bool8) {
                if (bool8.booleanValue()) {
                    this.menu.findItem(C1417R.id.menu_search).setVisible(false);
                } else {
                    this.menu.findItem(C1417R.id.menu_search).setVisible(true);
                }
            }
        }
        this.options = inAppBrowserOptions;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        InAppWebView inAppWebView = this.webView;
        intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : "");
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, (Class<?>) InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }
}
