package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class InAppWebViewClient extends WebViewClient {
    public static final String LOG_TAG = "IAWebViewClient";
    private static List<URLCredential> credentialsProposed;
    private static int previousAuthRequestFailureCount;
    private final MethodChannel channel;
    private InAppBrowserDelegate inAppBrowserDelegate;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$1 */
    /* loaded from: classes2.dex */
    public class C14681 implements MethodChannel.Result {
        public final /* synthetic */ Map val$headers;
        public final /* synthetic */ boolean val$isForMainFrame;
        public final /* synthetic */ String val$url;
        public final /* synthetic */ InAppWebView val$webView;

        public C14681(InAppWebView inAppWebView, String str, Map map, boolean z10) {
            r2 = inAppWebView;
            r3 = str;
            r4 = map;
            r5 = z10;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
            InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if (obj != null) {
                Integer num = (Integer) ((Map) obj).get("action");
                NavigationActionPolicy fromValue = NavigationActionPolicy.fromValue(Integer.valueOf(num != null ? num.intValue() : NavigationActionPolicy.CANCEL.rawValue()).intValue());
                if (fromValue == null || C14747.f5374x15cd6333[fromValue.ordinal()] != 1) {
                    return;
                }
            }
            InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$2 */
    /* loaded from: classes2.dex */
    public class C14692 implements MethodChannel.Result {
        public final /* synthetic */ int val$finalPort;
        public final /* synthetic */ String val$finalProtocol;
        public final /* synthetic */ HttpAuthHandler val$handler;
        public final /* synthetic */ String val$host;
        public final /* synthetic */ String val$realm;
        public final /* synthetic */ WebView val$view;

        public C14692(WebView webView, String str, String str2, String str3, int i10, HttpAuthHandler httpAuthHandler) {
            r2 = webView;
            r3 = str;
            r4 = str2;
            r5 = str3;
            r6 = i10;
            r7 = httpAuthHandler;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.super.onReceivedHttpAuthRequest(r2, r7, r3, r5);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if (obj != null) {
                Map map = (Map) obj;
                Integer num = (Integer) map.get("action");
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        String str = (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
                        String str2 = (String) map.get("password");
                        Boolean bool = (Boolean) map.get("permanentPersistence");
                        if (bool != null && bool.booleanValue()) {
                            CredentialDatabase.getInstance(r2.getContext()).setHttpAuthCredential(r3, r4, r5, Integer.valueOf(r6), str, str2);
                        }
                        r7.proceed(str, str2);
                        return;
                    }
                    if (intValue != 2) {
                        List unused = InAppWebViewClient.credentialsProposed = null;
                        int unused2 = InAppWebViewClient.previousAuthRequestFailureCount = 0;
                        r7.cancel();
                        return;
                    } else if (InAppWebViewClient.credentialsProposed.size() <= 0) {
                        r7.cancel();
                        return;
                    } else {
                        URLCredential uRLCredential = (URLCredential) InAppWebViewClient.credentialsProposed.remove(0);
                        r7.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                        return;
                    }
                }
            }
            InAppWebViewClient.super.onReceivedHttpAuthRequest(r2, r7, r3, r5);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$3 */
    /* loaded from: classes2.dex */
    public class C14703 implements MethodChannel.Result {
        public final /* synthetic */ SslErrorHandler val$handler;
        public final /* synthetic */ SslError val$sslError;
        public final /* synthetic */ WebView val$view;

        public C14703(SslErrorHandler sslErrorHandler, WebView webView, SslError sslError) {
            r2 = sslErrorHandler;
            r3 = webView;
            r4 = sslError;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.super.onReceivedSslError(r3, r2, r4);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            Integer num;
            if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                InAppWebViewClient.super.onReceivedSslError(r3, r2, r4);
            } else if (num.intValue() != 1) {
                r2.cancel();
            } else {
                r2.proceed();
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$4 */
    /* loaded from: classes2.dex */
    public class C14714 implements MethodChannel.Result {
        public final /* synthetic */ ClientCertRequest val$request;
        public final /* synthetic */ WebView val$view;

        public C14714(WebView webView, ClientCertRequest clientCertRequest) {
            r2 = webView;
            r3 = clientCertRequest;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if (obj != null) {
                Map map = (Map) obj;
                Integer num = (Integer) map.get("action");
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            r3.cancel();
                            return;
                        } else {
                            r3.ignore();
                            return;
                        }
                    }
                    InAppWebView inAppWebView = (InAppWebView) r2;
                    Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, (String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("androidKeyStoreType"));
                    r3.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                    return;
                }
            }
            InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$5 */
    /* loaded from: classes2.dex */
    public class C14725 implements MethodChannel.Result {
        public final /* synthetic */ SafeBrowsingResponse val$callback;
        public final /* synthetic */ WebResourceRequest val$request;
        public final /* synthetic */ int val$threatType;
        public final /* synthetic */ WebView val$view;

        public C14725(SafeBrowsingResponse safeBrowsingResponse, WebView webView, WebResourceRequest webResourceRequest, int i10) {
            r2 = safeBrowsingResponse;
            r3 = webView;
            r4 = webResourceRequest;
            r5 = i10;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.super.onSafeBrowsingHit(r3, r4, r5, r2);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if (obj != null) {
                Map map = (Map) obj;
                Boolean bool = (Boolean) map.get("report");
                Integer num = (Integer) map.get("action");
                Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        r2.backToSafety(valueOf.booleanValue());
                        return;
                    } else if (intValue != 1) {
                        r2.showInterstitial(valueOf.booleanValue());
                        return;
                    } else {
                        r2.proceed(valueOf.booleanValue());
                        return;
                    }
                }
            }
            InAppWebViewClient.super.onSafeBrowsingHit(r3, r4, r5, r2);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$6 */
    /* loaded from: classes2.dex */
    public class C14736 implements MethodChannel.Result {
        public final /* synthetic */ Message val$dontResend;
        public final /* synthetic */ Message val$resend;
        public final /* synthetic */ WebView val$view;

        public C14736(Message message, Message message2, WebView webView) {
            r2 = message;
            r3 = message2;
            r4 = webView;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            Log.e(InAppWebViewClient.LOG_TAG, "ERROR: " + str + " " + str2);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewClient.super.onFormResubmission(r4, r3, r2);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            Integer num;
            if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                InAppWebViewClient.super.onFormResubmission(r4, r3, r2);
            } else if (num.intValue() != 0) {
                r3.sendToTarget();
            } else {
                r2.sendToTarget();
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$7 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C14747 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy */
        public static final /* synthetic */ int[] f5374x15cd6333;

        static {
            int[] iArr = new int[NavigationActionPolicy.values().length];
            f5374x15cd6333 = iArr;
            try {
                iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5374x15cd6333[NavigationActionPolicy.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public InAppWebViewClient(MethodChannel methodChannel, InAppBrowserDelegate inAppBrowserDelegate) {
        this.channel = methodChannel;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.loadUrl(str, map);
            } else {
                webView.loadUrl(str);
            }
        }
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        super.doUpdateVisitedHistory(webView, str, z10);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didUpdateVisitedHistory(url);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, url);
        hashMap.put("androidIsReload", Boolean.valueOf(z10));
        this.channel.invokeMethod("onUpdateVisitedHistory", hashMap);
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        String generateWrappedCodeForDocumentEnd = inAppWebView.userContentController.generateWrappedCodeForDocumentEnd();
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentEnd, null);
            return;
        }
        inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentEnd.replaceAll("[\r\n]+", ""));
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        String generateWrappedCodeForDocumentStart = inAppWebView.userContentController.generateWrappedCodeForDocumentStart();
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentStart, null);
            return;
        }
        inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentStart.replaceAll("[\r\n]+", ""));
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, webView.getUrl());
        this.channel.invokeMethod("onFormResubmission", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.6
            public final /* synthetic */ Message val$dontResend;
            public final /* synthetic */ Message val$resend;
            public final /* synthetic */ WebView val$view;

            public C14736(Message message22, Message message3, WebView webView2) {
                r2 = message22;
                r3 = message3;
                r4 = webView2;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                Log.e(InAppWebViewClient.LOG_TAG, "ERROR: " + str + " " + str2);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewClient.super.onFormResubmission(r4, r3, r2);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                    InAppWebViewClient.super.onFormResubmission(r4, r3, r2);
                } else if (num.intValue() != 0) {
                    r3.sendToTarget();
                } else {
                    r2.sendToTarget();
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        this.channel.invokeMethod("onPageCommitVisible", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFinishNavigation(str);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
        if (i10 >= 19) {
            inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, null);
        } else {
            inAppWebView.loadUrl("javascript:" + JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE.replaceAll("[\r\n]+", ""));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        this.channel.invokeMethod("onLoadStop", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didStartNavigation(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        this.channel.invokeMethod("onLoadStart", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        String scheme;
        String url = webView.getUrl();
        String host = clientCertRequest.getHost();
        int port = clientCertRequest.getPort();
        if (url != null) {
            try {
                scheme = new URI(url).getScheme();
            } catch (URISyntaxException e10) {
                e10.printStackTrace();
            }
            this.channel.invokeMethod("onReceivedClientCertRequest", new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes()).toMap(), new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.4
                public final /* synthetic */ ClientCertRequest val$request;
                public final /* synthetic */ WebView val$view;

                public C14714(WebView webView2, ClientCertRequest clientCertRequest2) {
                    r2 = webView2;
                    r3 = clientCertRequest2;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", ");
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        if (num != null) {
                            int intValue = num.intValue();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    r3.cancel();
                                    return;
                                } else {
                                    r3.ignore();
                                    return;
                                }
                            }
                            InAppWebView inAppWebView = (InAppWebView) r2;
                            Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, (String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("androidKeyStoreType"));
                            r3.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                            return;
                        }
                    }
                    InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
                }
            });
        }
        scheme = "https";
        this.channel.invokeMethod("onReceivedClientCertRequest", new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView2.getCertificate(), null), clientCertRequest2.getPrincipals(), clientCertRequest2.getKeyTypes()).toMap(), new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.4
            public final /* synthetic */ ClientCertRequest val$request;
            public final /* synthetic */ WebView val$view;

            public C14714(WebView webView2, ClientCertRequest clientCertRequest2) {
                r2 = webView2;
                r3 = clientCertRequest2;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                if (obj != null) {
                    Map map = (Map) obj;
                    Integer num = (Integer) map.get("action");
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue != 1) {
                            if (intValue != 2) {
                                r3.cancel();
                                return;
                            } else {
                                r3.ignore();
                                return;
                            }
                        }
                        InAppWebView inAppWebView = (InAppWebView) r2;
                        Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, (String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("androidKeyStoreType"));
                        r3.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                        return;
                    }
                }
                InAppWebViewClient.super.onReceivedClientCertRequest(r2, r3);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.options.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFailNavigation(str2, i10, str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str2);
        hashMap.put("code", Integer.valueOf(i10));
        hashMap.put(Constants.MESSAGE, str);
        this.channel.invokeMethod("onLoadError", hashMap);
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceivedHttpAuthRequest(android.webkit.WebView r16, android.webkit.HttpAuthHandler r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            java.lang.String r0 = r16.getUrl()
            r1 = 0
            java.lang.String r2 = "https"
            if (r0 == 0) goto L1b
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L17
            r3.<init>(r0)     // Catch: java.net.URISyntaxException -> L17
            java.lang.String r2 = r3.getScheme()     // Catch: java.net.URISyntaxException -> L17
            int r0 = r3.getPort()     // Catch: java.net.URISyntaxException -> L17
            goto L1c
        L17:
            r0 = move-exception
            r0.printStackTrace()
        L1b:
            r0 = r1
        L1c:
            int r3 = com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.previousAuthRequestFailureCount
            int r3 = r3 + 1
            com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.previousAuthRequestFailureCount = r3
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r3 = com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.credentialsProposed
            if (r3 != 0) goto L3d
            android.content.Context r3 = r16.getContext()
            com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase r3 = com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase.getInstance(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r10 = r18
            r11 = r19
            java.util.List r3 = r3.getHttpAuthCredentials(r10, r2, r11, r4)
            com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.credentialsProposed = r3
            goto L41
        L3d:
            r10 = r18
            r11 = r19
        L41:
            r3 = 0
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r4 = com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.credentialsProposed
            if (r4 == 0) goto L55
            int r4 = r4.size()
            if (r4 <= 0) goto L55
            java.util.List<com.pichillilorenzo.flutter_inappwebview.types.URLCredential> r3 = com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.credentialsProposed
            java.lang.Object r1 = r3.get(r1)
            r3 = r1
            com.pichillilorenzo.flutter_inappwebview.types.URLCredential r3 = (com.pichillilorenzo.flutter_inappwebview.types.URLCredential) r3
        L55:
            r1 = r3
            com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace r12 = new com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace
            android.net.http.SslCertificate r8 = r16.getCertificate()
            r9 = 0
            r3 = r12
            r4 = r18
            r5 = r2
            r6 = r19
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge r3 = new com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge
            int r4 = com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.previousAuthRequestFailureCount
            r3.<init>(r12, r4, r1)
            r1 = r15
            io.flutter.plugin.common.MethodChannel r12 = r1.channel
            java.util.Map r13 = r3.toMap()
            com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$2 r14 = new com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$2
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r18
            r7 = r2
            r8 = r19
            r9 = r0
            r10 = r17
            r3.<init>()
            java.lang.String r0 = "onReceivedHttpAuthRequest"
            r12.invokeMethod(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.onReceivedHttpAuthRequest(android.webkit.WebView, android.webkit.HttpAuthHandler, java.lang.String, java.lang.String):void");
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, webResourceRequest.getUrl().toString());
            hashMap.put("statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
            hashMap.put("description", webResourceResponse.getReasonPhrase());
            this.channel.invokeMethod("onLoadHttpError", hashMap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
        hashMap.put("account", str2);
        hashMap.put("args", str3);
        this.channel.invokeMethod("onReceivedLoginRequest", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i10;
        String str = "";
        String str2 = "https";
        try {
            URI uri = new URI(sslError.getUrl());
            str = uri.getHost();
            str2 = uri.getScheme();
            i10 = uri.getPort();
        } catch (URISyntaxException e10) {
            e10.printStackTrace();
            i10 = 0;
        }
        this.channel.invokeMethod("onReceivedServerTrustAuthRequest", new ServerTrustChallenge(new URLProtectionSpace(str, str2, null, i10, sslError.getCertificate(), sslError)).toMap(), new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.3
            public final /* synthetic */ SslErrorHandler val$handler;
            public final /* synthetic */ SslError val$sslError;
            public final /* synthetic */ WebView val$view;

            public C14703(SslErrorHandler sslErrorHandler2, WebView webView2, SslError sslError2) {
                r2 = sslErrorHandler2;
                r3 = webView2;
                r4 = sslError2;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str3, String str22, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(", ");
                if (str22 == null) {
                    str22 = "";
                }
                sb2.append(str22);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewClient.super.onReceivedSslError(r3, r2, r4);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                    InAppWebViewClient.super.onReceivedSslError(r3, r2, r4);
                } else if (num.intValue() != 1) {
                    r2.cancel();
                } else {
                    r2.proceed();
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!((InAppWebView) webView).options.useOnRenderProcessGone.booleanValue()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Boolean valueOf = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        Integer valueOf2 = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
        HashMap hashMap = new HashMap();
        hashMap.put("didCrash", valueOf);
        hashMap.put("rendererPriorityAtExit", valueOf2);
        this.channel.invokeMethod("onRenderProcessGone", hashMap);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, webResourceRequest.getUrl().toString());
        hashMap.put("threatType", Integer.valueOf(i10));
        this.channel.invokeMethod("onSafeBrowsingHit", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.5
            public final /* synthetic */ SafeBrowsingResponse val$callback;
            public final /* synthetic */ WebResourceRequest val$request;
            public final /* synthetic */ int val$threatType;
            public final /* synthetic */ WebView val$view;

            public C14725(SafeBrowsingResponse safeBrowsingResponse2, WebView webView2, WebResourceRequest webResourceRequest2, int i102) {
                r2 = safeBrowsingResponse2;
                r3 = webView2;
                r4 = webResourceRequest2;
                r5 = i102;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewClient.super.onSafeBrowsingHit(r3, r4, r5, r2);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                if (obj != null) {
                    Map map = (Map) obj;
                    Boolean bool = (Boolean) map.get("report");
                    Integer num = (Integer) map.get("action");
                    Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            r2.backToSafety(valueOf.booleanValue());
                            return;
                        } else if (intValue != 1) {
                            r2.showInterstitial(valueOf.booleanValue());
                            return;
                        } else {
                            r2.proceed(valueOf.booleanValue());
                            return;
                        }
                    }
                }
                InAppWebViewClient.super.onSafeBrowsingHit(r3, r4, r5, r2);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        super.onScaleChanged(webView, f10, f11);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f11 / Util.getPixelDensity(inAppWebView.getContext());
        HashMap hashMap = new HashMap();
        hashMap.put("oldScale", Float.valueOf(f10));
        hashMap.put("newScale", Float.valueOf(f11));
        this.channel.invokeMethod("onZoomScaleChanged", hashMap);
    }

    public WebResourceResponse onShouldInterceptRequest(Object obj) {
        boolean z10;
        boolean z11;
        Map<String, String> map;
        String str = obj instanceof String ? (String) obj : null;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21 || !(obj instanceof WebResourceRequest)) {
            z10 = true;
            z11 = false;
            map = null;
        } else {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            str = webResourceRequest.getUrl().toString();
            map = webResourceRequest.getRequestHeaders();
            boolean hasGesture = webResourceRequest.hasGesture();
            z10 = webResourceRequest.isForMainFrame();
            z11 = i10 >= 24 ? webResourceRequest.isRedirect() : false;
            r5 = hasGesture;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put(Constants.METHOD, "GET");
        hashMap.put("headers", map);
        hashMap.put("isForMainFrame", Boolean.valueOf(z10));
        hashMap.put("hasGesture", Boolean.valueOf(r5));
        hashMap.put("isRedirect", Boolean.valueOf(z11));
        try {
            Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(this.channel, "shouldInterceptRequest", hashMap);
            String str2 = invokeMethodAndWait.error;
            if (str2 != null) {
                Log.e(LOG_TAG, str2);
            } else {
                Object obj2 = invokeMethodAndWait.result;
                if (obj2 != null) {
                    Map map2 = (Map) obj2;
                    String str3 = (String) map2.get("contentType");
                    String str4 = (String) map2.get("contentEncoding");
                    byte[] bArr = (byte[]) map2.get("data");
                    Map map3 = (Map) map2.get("headers");
                    Integer num = (Integer) map2.get("statusCode");
                    String str5 = (String) map2.get("reasonPhrase");
                    ByteArrayInputStream byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
                    return (!(map3 == null && num == null && str5 == null) && i10 >= 21) ? new WebResourceResponse(str3, str4, num.intValue(), str5, map3, byteArrayInputStream) : new WebResourceResponse(str3, str4, byteArrayInputStream);
                }
            }
            return null;
        } catch (InterruptedException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void onShouldOverrideUrlLoading(InAppWebView inAppWebView, String str, String str2, Map<String, String> map, boolean z10, boolean z11, boolean z12) {
        this.channel.invokeMethod("shouldOverrideUrlLoading", new NavigationAction(new URLRequest(str, str2, null, map), z10, z11, z12).toMap(), new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.1
            public final /* synthetic */ Map val$headers;
            public final /* synthetic */ boolean val$isForMainFrame;
            public final /* synthetic */ String val$url;
            public final /* synthetic */ InAppWebView val$webView;

            public C14681(InAppWebView inAppWebView2, String str3, Map map2, boolean z102) {
                r2 = inAppWebView2;
                r3 = str3;
                r4 = map2;
                r5 = z102;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str3, String str22, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(", ");
                if (str22 == null) {
                    str22 = "";
                }
                sb2.append(str22);
                Log.e(InAppWebViewClient.LOG_TAG, sb2.toString());
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                if (obj != null) {
                    Integer num = (Integer) ((Map) obj).get("action");
                    NavigationActionPolicy fromValue = NavigationActionPolicy.fromValue(Integer.valueOf(num != null ? num.intValue() : NavigationActionPolicy.CANCEL.rawValue()).intValue());
                    if (fromValue == null || C14747.f5374x15cd6333[fromValue.ordinal()] != 1) {
                        return;
                    }
                }
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(r2, r3, r4, r5);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ((InAppWebView) webView).options.useShouldInterceptRequest.booleanValue() ? onShouldInterceptRequest(webResourceRequest) : shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        URI uri;
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.options.useShouldInterceptRequest.booleanValue()) {
            return onShouldInterceptRequest(str);
        }
        WebResourceResponse webResourceResponse = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            String str2 = str.split(":")[0];
            try {
                URL url = new URL(str.replace(str2, "https"));
                uri = new URI(str2, url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
        String scheme = uri.getScheme();
        List<String> list = inAppWebView.options.resourceCustomSchemes;
        if (list != null && list.contains(scheme)) {
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, str);
            try {
                Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(this.channel, "onLoadResourceCustomScheme", hashMap);
                String str3 = invokeMethodAndWait.error;
                if (str3 != null) {
                    Log.e(LOG_TAG, str3);
                } else {
                    Object obj = invokeMethodAndWait.result;
                    if (obj != null) {
                        Map map = (Map) obj;
                        try {
                            webResourceResponse = inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, str, map.get("contentType").toString());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (webResourceResponse != null) {
                            return webResourceResponse;
                        }
                        return new WebResourceResponse(map.get("contentType").toString(), map.get("contentEncoding").toString(), new ByteArrayInputStream((byte[]) map.get("data")));
                    }
                }
            } catch (InterruptedException e12) {
                e12.printStackTrace();
                return null;
            }
        }
        if (inAppWebView.contentBlockerHandler.getRuleList().size() <= 0) {
            return null;
        }
        try {
            return inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, str);
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.options.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), Build.VERSION.SDK_INT >= 24 ? webResourceRequest.isRedirect() : false);
        if (inAppWebView.regexToCancelSubFramesLoadingCompiled == null) {
            return webResourceRequest.isForMainFrame();
        }
        if (webResourceRequest.isForMainFrame()) {
            return true;
        }
        return inAppWebView.regexToCancelSubFramesLoadingCompiled.matcher(webResourceRequest.getUrl().toString()).matches();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.options.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, "GET", null, true, false, false);
        return true;
    }
}
