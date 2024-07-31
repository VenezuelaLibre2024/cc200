package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import re.C4377y;

/* loaded from: classes.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    public static final String LOG_TAG = "Util";

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.Util$1 */
    /* loaded from: classes.dex */
    public class RunnableC14191 implements Runnable {
        public final /* synthetic */ Object val$arguments;
        public final /* synthetic */ Map val$flutterResultMap;
        public final /* synthetic */ CountDownLatch val$latch;
        public final /* synthetic */ String val$method;

        /* renamed from: com.pichillilorenzo.flutter_inappwebview.Util$1$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements MethodChannel.Result {
            public AnonymousClass1() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str, String str2, Object obj) {
                r4.put(ImagePickerCache.MAP_KEY_ERROR, "ERROR: " + str + " " + str2);
                r4.put("result", obj);
                r5.countDown();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                r5.countDown();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                r4.put("result", obj);
                r5.countDown();
            }
        }

        public RunnableC14191(String str, Object obj, Map map, CountDownLatch countDownLatch) {
            r2 = str;
            r3 = obj;
            r4 = map;
            r5 = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodChannel.this.invokeMethod(r2, r3, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.1.1
                public AnonymousClass1() {
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    r4.put(ImagePickerCache.MAP_KEY_ERROR, "ERROR: " + str + " " + str2);
                    r4.put("result", obj);
                    r5.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    r5.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    r4.put("result", obj);
                    r5.countDown();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    /* loaded from: classes.dex */
    public static class WaitFlutterResult {
        public String error;
        public Object result;

        public WaitFlutterResult(Object obj, String str) {
            this.result = obj;
            this.error = str;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        return obj == null ? "null" : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj instanceof List ? new JSONArray((Collection) obj).toString() : obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static C4377y getBasicOkHttpClient() {
        C4377y.b bVar = new C4377y.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return bVar.m16932b(15L, timeUnit).m16934d(15L, timeUnit).m16933c(15L, timeUnit).m16931a();
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        PluginRegistry.Registrar registrar = inAppWebViewFlutterPlugin.registrar;
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(registrar != null ? registrar.lookupKeyForAsset(str) : inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        int i10;
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i11 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i12 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth(bounds.width() - i11);
                i10 = bounds.height() - i12;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth(displayMetrics.widthPixels);
                i10 = displayMetrics.heightPixels;
            }
            size2D.setHeight(i10);
        }
        return size2D;
    }

    public static Object getOrDefault(Map map, String str, Object obj) {
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        PluginRegistry.Registrar registrar = inAppWebViewFlutterPlugin.registrar;
        String lookupKeyForAsset = registrar != null ? registrar.lookupKeyForAsset(str) : inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str);
        IOException e10 = null;
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        if (e10 != null) {
            throw e10;
        }
        return ANDROID_ASSET_URL + lookupKeyForAsset;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
            } catch (CertificateException unused) {
                return null;
            }
        }
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
    }

    public static WaitFlutterResult invokeMethodAndWait(MethodChannel methodChannel, String str, Object obj) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HashMap hashMap = new HashMap();
        hashMap.put("result", null);
        hashMap.put(ImagePickerCache.MAP_KEY_ERROR, null);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.1
            public final /* synthetic */ Object val$arguments;
            public final /* synthetic */ Map val$flutterResultMap;
            public final /* synthetic */ CountDownLatch val$latch;
            public final /* synthetic */ String val$method;

            /* renamed from: com.pichillilorenzo.flutter_inappwebview.Util$1$1 */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements MethodChannel.Result {
                public AnonymousClass1() {
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    r4.put(ImagePickerCache.MAP_KEY_ERROR, "ERROR: " + str + " " + str2);
                    r4.put("result", obj);
                    r5.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    r5.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    r4.put("result", obj);
                    r5.countDown();
                }
            }

            public RunnableC14191(String str2, Object obj2, Map hashMap2, CountDownLatch countDownLatch2) {
                r2 = str2;
                r3 = obj2;
                r4 = hashMap2;
                r5 = countDownLatch2;
            }

            @Override // java.lang.Runnable
            public void run() {
                MethodChannel.this.invokeMethod(r2, r3, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.1.1
                    public AnonymousClass1() {
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(String str2, String str22, Object obj2) {
                        r4.put(ImagePickerCache.MAP_KEY_ERROR, "ERROR: " + str2 + " " + str22);
                        r4.put("result", obj2);
                        r5.countDown();
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        r5.countDown();
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(Object obj2) {
                        r4.put("result", obj2);
                        r5.countDown();
                    }
                });
            }
        });
        countDownLatch2.await();
        return new WaitFlutterResult(hashMap2.get("result"), (String) hashMap2.get(ImagePickerCache.MAP_KEY_ERROR));
    }

    public static <O> Object invokeMethodIfExists(O o10, String str, Object... objArr) {
        for (Method method : o10.getClass().getMethods()) {
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o10, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            Inet6Address.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            try {
                if (inputStream == null) {
                    try {
                        inputStream = new FileInputStream(str);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.e(LOG_TAG, e10.getMessage());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                }
                KeyStore keyStore = KeyStore.getInstance(str3);
                keyStore.load(inputStream, (str2 != null ? str2 : "").toCharArray());
                String nextElement = keyStore.aliases().nextElement();
                if (str2 == null) {
                    str2 = "";
                }
                Key key = keyStore.getKey(nextElement, str2.toCharArray());
                r0 = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(nextElement)}) : null;
                inputStream.close();
                inputStream.close();
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        Log.e(LOG_TAG, e11.getMessage());
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
            Log.e(LOG_TAG, e12.getMessage());
        }
        return r0;
    }

    public static void log(String str, String str2) {
        int min;
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf(10, i10);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i10 + 4000);
                Log.d(str, str2.substring(i10, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i10 = min;
                }
            }
            i10 = min + 1;
        }
    }

    public static String normalizeIPv6(String str) {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
