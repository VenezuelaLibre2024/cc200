package com.pichillilorenzo.flutter_inappwebview.content_blocker;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLHandshakeException;
import re.C4349b0;
import re.C4353d0;

/* loaded from: classes.dex */
public class ContentBlockerHandler {
    public static final String LOG_TAG = "ContentBlockerHandler";
    public List<ContentBlocker> ruleList;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler$3 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C14243 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType */
        public static final /* synthetic */ int[] f5367x2378908d;

        static {
            int[] iArr = new int[ContentBlockerActionType.values().length];
            f5367x2378908d = iArr;
            try {
                iArr[ContentBlockerActionType.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5367x2378908d[ContentBlockerActionType.CSS_DISPLAY_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5367x2378908d[ContentBlockerActionType.MAKE_HTTPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ContentBlockerHandler() {
        this.ruleList = new ArrayList();
    }

    public ContentBlockerHandler(List<ContentBlocker> list) {
        this.ruleList = new ArrayList();
        this.ruleList = list;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, String str) {
        return checkUrl(inAppWebView, str, getResourceTypeFromUrl(str));
    }

    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, String str, ContentBlockerTriggerResourceType contentBlockerTriggerResourceType) {
        URI uri;
        Iterator it;
        boolean z10;
        C4353d0 c4353d0;
        boolean z11;
        boolean z12;
        WebResourceResponse webResourceResponse = null;
        if (inAppWebView.options.contentBlockers == null) {
            return null;
        }
        boolean z13 = false;
        try {
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            String str2 = str.split(":")[0];
            URL url = new URL(str.replace(str2, "https"));
            uri = new URI(str2, url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        String host = uri.getHost();
        int port = uri.getPort();
        String scheme = uri.getScheme();
        for (Iterator it2 = new CopyOnWriteArrayList(this.ruleList).iterator(); it2.hasNext(); it2 = it) {
            ContentBlocker contentBlocker = (ContentBlocker) it2.next();
            ContentBlockerTrigger trigger = contentBlocker.getTrigger();
            List<ContentBlockerTriggerResourceType> resourceType = trigger.getResourceType();
            if (resourceType.contains(ContentBlockerTriggerResourceType.IMAGE)) {
                ContentBlockerTriggerResourceType contentBlockerTriggerResourceType2 = ContentBlockerTriggerResourceType.SVG_DOCUMENT;
                if (!resourceType.contains(contentBlockerTriggerResourceType2)) {
                    resourceType.add(contentBlockerTriggerResourceType2);
                }
            }
            ContentBlockerAction action = contentBlocker.getAction();
            if (trigger.getUrlFilterPatternCompiled().matcher(str).matches()) {
                if (!resourceType.isEmpty() && !resourceType.contains(contentBlockerTriggerResourceType)) {
                    return webResourceResponse;
                }
                if (!trigger.getIfDomain().isEmpty()) {
                    for (String str3 : trigger.getIfDomain()) {
                        if ((str3.startsWith("*") && host.endsWith(str3.replace("*", ""))) || str3.equals(host)) {
                            z12 = true;
                            break;
                        }
                    }
                    z12 = false;
                    if (!z12) {
                        return null;
                    }
                }
                if (!trigger.getUnlessDomain().isEmpty()) {
                    for (String str4 : trigger.getUnlessDomain()) {
                        if ((str4.startsWith("*") && host.endsWith(str4.replace("*", ""))) || str4.equals(host)) {
                            return null;
                        }
                    }
                }
                final String[] strArr = new String[1];
                if (!trigger.getLoadType().isEmpty() || !trigger.getIfTopUrl().isEmpty() || !trigger.getUnlessTopUrl().isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Handler(inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            strArr[0] = inAppWebView.getUrl();
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await();
                }
                if (strArr[0] != null) {
                    if (trigger.getLoadType().isEmpty()) {
                        it = it2;
                    } else {
                        URI uri2 = new URI(strArr[0]);
                        String host2 = uri2.getHost();
                        int port2 = uri2.getPort();
                        String scheme2 = uri2.getScheme();
                        it = it2;
                        if (trigger.getLoadType().contains("first-party") && host2 != null && (!scheme2.equals(scheme) || !host2.equals(host) || port2 != port)) {
                            return null;
                        }
                        if (trigger.getLoadType().contains("third-party") && host2 != null && host2.equals(host)) {
                            return null;
                        }
                    }
                    if (!trigger.getIfTopUrl().isEmpty()) {
                        Iterator<String> it3 = trigger.getIfTopUrl().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z11 = false;
                                break;
                            }
                            if (strArr[0].startsWith(it3.next())) {
                                z11 = true;
                                break;
                            }
                        }
                        if (!z11) {
                            return null;
                        }
                    }
                    if (!trigger.getUnlessTopUrl().isEmpty()) {
                        Iterator<String> it4 = trigger.getUnlessTopUrl().iterator();
                        while (it4.hasNext()) {
                            if (strArr[0].startsWith(it4.next())) {
                                return null;
                            }
                        }
                    }
                } else {
                    it = it2;
                }
                int i10 = C14243.f5367x2378908d[action.getType().ordinal()];
                if (i10 == 1) {
                    return new WebResourceResponse("", "", null);
                }
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (!scheme.equals("http")) {
                            z10 = false;
                        } else if (port == -1 || port == 80) {
                            try {
                                c4353d0 = Util.getBasicOkHttpClient().m16917t(new C4349b0.a().m16673g(str.replace("http://", "https://")).m16667a()).mo16648d();
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c4353d0.m16703a().m16732d());
                                    String[] split = c4353d0.m16708n("content-type", "text/plain").split(";");
                                    z10 = false;
                                    try {
                                        String trim = split[0].trim();
                                        String trim2 = (split.length <= 1 || !split[1].contains("charset=")) ? "utf-8" : split[1].replace("charset=", "").trim();
                                        c4353d0.m16703a().close();
                                        c4353d0.close();
                                        return new WebResourceResponse(trim, trim2, byteArrayInputStream);
                                    } catch (Exception e10) {
                                        e = e10;
                                        if (c4353d0 != null) {
                                            c4353d0.m16703a().close();
                                            c4353d0.close();
                                        }
                                        if (!(e instanceof SSLHandshakeException)) {
                                            e.printStackTrace();
                                            Log.e(LOG_TAG, e.getMessage());
                                        }
                                        webResourceResponse = null;
                                        z13 = z10;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    z10 = false;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z10 = false;
                                c4353d0 = null;
                            }
                        }
                    }
                    webResourceResponse = null;
                    z10 = false;
                } else {
                    z10 = false;
                    String selector = action.getSelector();
                    final String str5 = "(function(d) {    function hide () {        if (!d.getElementById('css-display-none-style')) {            var c = d.createElement('style');            c.id = 'css-display-none-style';            c.innerHTML = '" + selector + " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('" + selector + "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);";
                    new Handler(inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 19) {
                                inAppWebView.evaluateJavascript(str5, null);
                                return;
                            }
                            inAppWebView.loadUrl("javascript:" + str5);
                        }
                    });
                }
                webResourceResponse = null;
            } else {
                it = it2;
                z10 = z13;
            }
            z13 = z10;
        }
        return webResourceResponse;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, String str, String str2) {
        return checkUrl(inAppWebView, str, getResourceTypeFromContentType(str2));
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String str) {
        return str.equals("text/css") ? ContentBlockerTriggerResourceType.STYLE_SHEET : str.equals("image/svg+xml") ? ContentBlockerTriggerResourceType.SVG_DOCUMENT : str.startsWith("image/") ? ContentBlockerTriggerResourceType.IMAGE : str.startsWith("font/") ? ContentBlockerTriggerResourceType.FONT : (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) ? ContentBlockerTriggerResourceType.MEDIA : str.endsWith("javascript") ? ContentBlockerTriggerResourceType.SCRIPT : str.startsWith("text/") ? ContentBlockerTriggerResourceType.DOCUMENT : ContentBlockerTriggerResourceType.RAW;
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromUrl(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return contentBlockerTriggerResourceType;
        }
        C4353d0 c4353d0 = null;
        try {
            c4353d0 = Util.getBasicOkHttpClient().m16917t(new C4349b0.a().m16673g(str).m16668b().m16667a()).mo16648d();
            if (c4353d0.m16707l("content-type") == null) {
                return contentBlockerTriggerResourceType;
            }
            String[] split = c4353d0.m16707l("content-type").split(";");
            String trim = split[0].trim();
            if (split.length > 1 && split[1].contains("charset=")) {
                split[1].replace("charset=", "").trim();
            }
            c4353d0.m16703a().close();
            c4353d0.close();
            return getResourceTypeFromContentType(trim);
        } catch (Exception e10) {
            if (c4353d0 != null) {
                c4353d0.m16703a().close();
                c4353d0.close();
            }
            if (e10 instanceof SSLHandshakeException) {
                return contentBlockerTriggerResourceType;
            }
            e10.printStackTrace();
            Log.e(LOG_TAG, e10.getMessage());
            return contentBlockerTriggerResourceType;
        }
    }

    public List<ContentBlocker> getRuleList() {
        return this.ruleList;
    }

    public void setRuleList(List<ContentBlocker> list) {
        this.ruleList = list;
    }
}
