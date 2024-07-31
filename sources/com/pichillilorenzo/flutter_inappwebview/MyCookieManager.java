package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class MyCookieManager implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "MyCookieManager";
    public static CookieManager cookieManager;
    public MethodChannel channel;
    public InAppWebViewFlutterPlugin plugin;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.MyCookieManager$1 */
    /* loaded from: classes.dex */
    public class C14111 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14111(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(Boolean.TRUE);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.MyCookieManager$2 */
    /* loaded from: classes.dex */
    public class C14122 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14122(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(Boolean.TRUE);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.MyCookieManager$3 */
    /* loaded from: classes.dex */
    public class C14133 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14133(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(Boolean.TRUE);
        }
    }

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        MethodChannel methodChannel = new MethodChannel(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public static String getCookieExpirationDate(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l10.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e10;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager2.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.3
                public final /* synthetic */ MethodChannel.Result val$result;

                public C14133(MethodChannel.Result result2) {
                    r2 = result2;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    r2.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            cookieManager2.removeAllCookie();
            result2.success(Boolean.TRUE);
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
        createInstance.startSync();
        cookieManager.removeAllCookie();
        result2.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    public void deleteCookie(String str, String str2, String str3, String str4, MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String str5 = str2 + "=; Path=" + str4 + "; Max-Age=-1";
        if (str3 != null) {
            str5 = str5 + "; Domain=" + str3;
        }
        String str6 = str5 + ";";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str6, new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.2
                public final /* synthetic */ MethodChannel.Result val$result;

                public C14122(MethodChannel.Result result2) {
                    r2 = result2;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    r2.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            cookieManager.setCookie(str, str6);
            result2.success(Boolean.TRUE);
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
        createInstance.startSync();
        cookieManager.setCookie(str, str6);
        result2.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) {
        CookieSyncManager cookieSyncManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            if (Build.VERSION.SDK_INT >= 21 || (inAppWebViewFlutterPlugin = this.plugin) == null) {
                cookieSyncManager = null;
            } else {
                cookieSyncManager = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                cookieSyncManager.startSync();
            }
            for (String str4 : cookie.split(";")) {
                String str5 = str4.split("=", 2)[0].trim() + "=; Path=" + str3 + "; Max-Age=-1";
                if (str2 != null) {
                    str5 = str5 + "; Domain=" + str2;
                }
                String str6 = str5 + ";";
                if (Build.VERSION.SDK_INT >= 21) {
                    cookieManager.setCookie(str, str6, null);
                } else {
                    cookieManager.setCookie(str, str6);
                }
            }
            if (cookieSyncManager != null) {
                cookieSyncManager.stopSync();
                cookieSyncManager.sync();
            } else if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.flush();
            }
        }
        result.success(Boolean.TRUE);
    }

    public void dispose() {
        this.channel.setMethodCallHandler(null);
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String cookie;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null && (cookie = cookieManager2.getCookie(str)) != null) {
            for (String str2 : cookie.split(";")) {
                String[] split = str2.split("=", 2);
                String trim = split[0].trim();
                String trim2 = split.length > 1 ? split[1].trim() : "";
                HashMap hashMap = new HashMap();
                hashMap.put("name", trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", null);
                hashMap.put("isSessionOnly", null);
                hashMap.put("domain", null);
                hashMap.put("sameSite", null);
                hashMap.put("isSecure", null);
                hashMap.put("isHttpOnly", null);
                hashMap.put("path", null);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1222815761:
                if (str.equals("deleteCookie")) {
                    c10 = 0;
                    break;
                }
                break;
            case 126640486:
                if (str.equals("setCookie")) {
                    c10 = 1;
                    break;
                }
                break;
            case 747417188:
                if (str.equals("deleteCookies")) {
                    c10 = 2;
                    break;
                }
                break;
            case 822411705:
                if (str.equals("deleteAllCookies")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1989049945:
                if (str.equals("getCookies")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                deleteCookie((String) methodCall.argument(WebViewActivity.URL_EXTRA), (String) methodCall.argument("name"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                return;
            case 1:
                String str2 = (String) methodCall.argument(WebViewActivity.URL_EXTRA);
                String str3 = (String) methodCall.argument("name");
                String str4 = (String) methodCall.argument("value");
                String str5 = (String) methodCall.argument("domain");
                String str6 = (String) methodCall.argument("path");
                String str7 = (String) methodCall.argument("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) methodCall.argument("maxAge"), (Boolean) methodCall.argument("isSecure"), (Boolean) methodCall.argument("isHttpOnly"), (String) methodCall.argument("sameSite"), result);
                return;
            case 2:
                deleteCookies((String) methodCall.argument(WebViewActivity.URL_EXTRA), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                return;
            case 3:
                deleteAllCookies(result);
                return;
            case 4:
                result.success(getCookies((String) methodCall.argument(WebViewActivity.URL_EXTRA)));
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l10, Integer num, Boolean bool, Boolean bool2, String str6, MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String str7 = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = str7 + "; Domain=" + str4;
        }
        if (l10 != null) {
            str7 = str7 + "; Expires=" + getCookieExpirationDate(l10);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        String str8 = str7 + ";";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str8, new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.1
                public final /* synthetic */ MethodChannel.Result val$result;

                public C14111(MethodChannel.Result result2) {
                    r2 = result2;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool3) {
                    r2.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            cookieManager.setCookie(str, str8);
            result2.success(Boolean.TRUE);
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
        createInstance.startSync();
        cookieManager.setCookie(str, str8);
        result2.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }
}
