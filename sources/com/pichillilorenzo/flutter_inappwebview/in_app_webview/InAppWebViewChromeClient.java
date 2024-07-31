package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.DialogC0184a;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p089g.C1939i;
import p345y.C5782a;
import p345y.C5783b;

/* loaded from: classes2.dex */
public class InAppWebViewChromeClient extends WebChromeClient implements PluginRegistry.ActivityResultListener, ActivityResultListener {
    public static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    public static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    public static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String fileProviderAuthorityExtension = "flutter_inappwebview.fileprovider";
    private static Uri imageOutputFileUri;
    private static Uri videoOutputFileUri;
    public final String DEFAULT_MIME_TYPES = "*/*";
    private final MethodChannel channel;
    private InAppBrowserDelegate inAppBrowserDelegate;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    public static Map<Integer, Message> windowWebViewMessages = new HashMap();
    private static int windowAutoincrementId = 0;
    public static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$1 */
    /* loaded from: classes2.dex */
    public class C14501 implements MethodChannel.Result {
        public final /* synthetic */ String val$message;
        public final /* synthetic */ JsResult val$result;
        public final /* synthetic */ WebView val$view;

        public C14501(JsResult jsResult, WebView webView, String str) {
            r2 = jsResult;
            r3 = webView;
            r4 = str;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.cancel();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewChromeClient.this.createAlertDialog(r3, r4, r2, null, null);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            String str;
            String str2;
            if (obj != null) {
                Map map = (Map) obj;
                String str3 = (String) map.get(Constants.MESSAGE);
                String str4 = (String) map.get("confirmButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool != null && bool.booleanValue()) {
                    Integer num = (Integer) map.get("action");
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        r2.cancel();
                        return;
                    } else {
                        r2.confirm();
                        return;
                    }
                }
                str = str3;
                str2 = str4;
            } else {
                str = null;
                str2 = null;
            }
            InAppWebViewChromeClient.this.createAlertDialog(r3, r4, r2, str, str2);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$10 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC145110 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsPromptResult val$result;

        public DialogInterfaceOnClickListenerC145110(JsPromptResult jsPromptResult) {
            r2 = jsPromptResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$11 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnCancelListenerC145211 implements DialogInterface.OnCancelListener {
        public final /* synthetic */ JsPromptResult val$result;

        public DialogInterfaceOnCancelListenerC145211(JsPromptResult jsPromptResult) {
            r2 = jsPromptResult;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$12 */
    /* loaded from: classes2.dex */
    public class C145312 implements MethodChannel.Result {
        public final /* synthetic */ String val$message;
        public final /* synthetic */ JsResult val$result;
        public final /* synthetic */ WebView val$view;

        public C145312(JsResult jsResult, WebView webView, String str) {
            r2 = jsResult;
            r3 = webView;
            r4 = str;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.cancel();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, null, null, null);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj != null) {
                Map map = (Map) obj;
                String str4 = (String) map.get(Constants.MESSAGE);
                String str5 = (String) map.get("confirmButtonTitle");
                String str6 = (String) map.get("cancelButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool != null && bool.booleanValue()) {
                    Integer num = (Integer) map.get("action");
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        r2.cancel();
                        return;
                    } else {
                        r2.confirm();
                        return;
                    }
                }
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            InAppWebViewChromeClient.this.createBeforeUnloadDialog(r3, r4, r2, str, str2, str3);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$13 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC145413 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnClickListenerC145413(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$14 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC145514 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnClickListenerC145514(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$15 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnCancelListenerC145615 implements DialogInterface.OnCancelListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnCancelListenerC145615(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$16 */
    /* loaded from: classes2.dex */
    public class C145716 implements MethodChannel.Result {
        public final /* synthetic */ int val$windowId;

        public C145716(int i10) {
            r2 = i10;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if ((obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) || !InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                return;
            }
            InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$17 */
    /* loaded from: classes2.dex */
    public class C145817 implements MethodChannel.Result {
        public final /* synthetic */ GeolocationPermissions.Callback val$callback;
        public final /* synthetic */ String val$origin;

        public C145817(GeolocationPermissions.Callback callback, String str) {
            r2 = callback;
            r3 = str;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.invoke(r3, false, false);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            r2.invoke(r3, false, false);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                r2.invoke((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
            } else {
                r2.invoke(r3, false, false);
            }
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$18 */
    /* loaded from: classes2.dex */
    public class C145918 implements MethodChannel.Result {
        public final /* synthetic */ PermissionRequest val$request;

        public C145918(PermissionRequest permissionRequest) {
            r2 = permissionRequest;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.deny();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            r2.deny();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            if (obj != null) {
                Map map = (Map) obj;
                Integer num = (Integer) map.get("action");
                List list = (List) map.get("resources");
                if (list == null) {
                    list = new ArrayList();
                }
                String[] strArr = (String[]) list.toArray(new String[list.size()]);
                if (num != null) {
                    if (num.intValue() != 1) {
                        r2.deny();
                        return;
                    } else {
                        r2.grant(strArr);
                        return;
                    }
                }
            }
            r2.deny();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$2 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC14602 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnClickListenerC14602(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$3 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnCancelListenerC14613 implements DialogInterface.OnCancelListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnCancelListenerC14613(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$4 */
    /* loaded from: classes2.dex */
    public class C14624 implements MethodChannel.Result {
        public final /* synthetic */ String val$message;
        public final /* synthetic */ JsResult val$result;
        public final /* synthetic */ WebView val$view;

        public C14624(JsResult jsResult, WebView webView, String str) {
            r2 = jsResult;
            r3 = webView;
            r4 = str;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.cancel();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, null, null, null);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj != null) {
                Map map = (Map) obj;
                String str4 = (String) map.get(Constants.MESSAGE);
                String str5 = (String) map.get("confirmButtonTitle");
                String str6 = (String) map.get("cancelButtonTitle");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool != null && bool.booleanValue()) {
                    Integer num = (Integer) map.get("action");
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        r2.cancel();
                        return;
                    } else {
                        r2.confirm();
                        return;
                    }
                }
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, str, str2, str3);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$5 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC14635 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnClickListenerC14635(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.confirm();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$6 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC14646 implements DialogInterface.OnClickListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnClickListenerC14646(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$7 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnCancelListenerC14657 implements DialogInterface.OnCancelListener {
        public final /* synthetic */ JsResult val$result;

        public DialogInterfaceOnCancelListenerC14657(JsResult jsResult) {
            r2 = jsResult;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r2.cancel();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$8 */
    /* loaded from: classes2.dex */
    public class C14668 implements MethodChannel.Result {
        public final /* synthetic */ String val$defaultValue;
        public final /* synthetic */ String val$message;
        public final /* synthetic */ JsPromptResult val$result;
        public final /* synthetic */ WebView val$view;

        public C14668(JsPromptResult jsPromptResult, WebView webView, String str, String str2) {
            r2 = jsPromptResult;
            r3 = webView;
            r4 = str;
            r5 = str2;
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
            Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
            r2.cancel();
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            InAppWebViewChromeClient.this.createPromptDialog(r3, r4, r5, r2, null, null, null, null, null);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj != null) {
                Map map = (Map) obj;
                String str6 = (String) map.get(Constants.MESSAGE);
                String str7 = (String) map.get("defaultValue");
                String str8 = (String) map.get("confirmButtonTitle");
                String str9 = (String) map.get("cancelButtonTitle");
                String str10 = (String) map.get("value");
                Boolean bool = (Boolean) map.get("handledByClient");
                if (bool != null && bool.booleanValue()) {
                    Integer num = (Integer) map.get("action");
                    if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                        r2.cancel();
                        return;
                    } else {
                        r2.confirm(str10);
                        return;
                    }
                }
                str = str6;
                str2 = str7;
                str5 = str8;
                str4 = str9;
                str3 = str10;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            InAppWebViewChromeClient.this.createPromptDialog(r3, r4, r5, r2, str, str2, str3, str4, str5);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient$9 */
    /* loaded from: classes2.dex */
    public class DialogInterfaceOnClickListenerC14679 implements DialogInterface.OnClickListener {
        public final /* synthetic */ String val$finalValue;
        public final /* synthetic */ EditText val$input;
        public final /* synthetic */ JsPromptResult val$result;

        public DialogInterfaceOnClickListenerC14679(EditText editText, JsPromptResult jsPromptResult, String str) {
            r2 = editText;
            r3 = jsPromptResult;
            r4 = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            String obj = r2.getText().toString();
            JsPromptResult jsPromptResult = r3;
            String str = r4;
            if (str != null) {
                obj = str;
            }
            jsPromptResult.confirm(obj);
            dialogInterface.dismiss();
        }
    }

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, MethodChannel methodChannel, InAppBrowserDelegate inAppBrowserDelegate) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = methodChannel;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().add(this);
        }
        PluginRegistry.Registrar registrar = inAppWebViewFlutterPlugin.registrar;
        if (registrar != null) {
            registrar.addActivityResultListener(this);
            return;
        }
        ActivityPluginBinding activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this);
        }
    }

    private Boolean acceptsAny(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return Boolean.TRUE;
        }
        for (String str : strArr) {
            if (str.equals("*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "video").booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                strArr2[i10] = getMimeTypeFromExtension(str.replace(".", ""));
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    private Activity getActivity() {
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            return inAppBrowserDelegate.getActivity();
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            return inAppWebViewFlutterPlugin.activity;
        }
        return null;
    }

    private File getCapturedFile(String str) {
        String str2;
        String str3;
        String str4 = "";
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = "video";
            str3 = ".mp4";
        } else {
            str2 = "";
            str3 = str2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory(str4), String.format("%s-%d%s", str2, Long.valueOf(System.currentTimeMillis()), str3));
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir(null));
    }

    private Uri getCapturedMediaFile() {
        Uri uri = imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return imageOutputFileUri;
        }
        Uri uri2 = videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return videoOutputFileUri;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e10) {
            Log.e(LOG_TAG, "Error occurred while creating the File", e10);
            e10.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        String packageName = activity.getApplicationContext().getPackageName();
        return C5783b.getUriForFile(activity.getApplicationContext(), packageName + "." + fileProviderAuthorityExtension, file);
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i10) {
        if (intent != null && intent.getData() != null) {
            if (i10 != -1 || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
        if (intent == null || intent.getClipData() == null) {
            Uri capturedMediaFile = getCapturedMediaFile();
            if (capturedMediaFile != null) {
                return new Uri[]{capturedMediaFile};
            }
            return null;
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i11 = 0; i11 < itemCount; i11++) {
            uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z10 = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private boolean isFileNotEmpty(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, "r");
            long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            return length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public void createAlertDialog(WebView webView, String str, JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterfaceOnClickListenerC14602 dialogInterfaceOnClickListenerC14602 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.2
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnClickListenerC14602(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.confirm();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        DialogC0184a.a aVar = new DialogC0184a.a(activity, C1939i.f7500c);
        aVar.m681f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.m686k(R.string.ok, dialogInterfaceOnClickListenerC14602);
        } else {
            aVar.m687l(str3, dialogInterfaceOnClickListenerC14602);
        }
        aVar.m684i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.3
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnCancelListenerC14613(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.m676a().show();
    }

    public void createBeforeUnloadDialog(WebView webView, String str, JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterfaceOnClickListenerC145413 dialogInterfaceOnClickListenerC145413 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.13
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnClickListenerC145413(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.confirm();
                dialogInterface.dismiss();
            }
        };
        DialogInterfaceOnClickListenerC145514 dialogInterfaceOnClickListenerC145514 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.14
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnClickListenerC145514(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        DialogC0184a.a aVar = new DialogC0184a.a(activity, C1939i.f7500c);
        aVar.m681f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.m686k(R.string.ok, dialogInterfaceOnClickListenerC145413);
        } else {
            aVar.m687l(str3, dialogInterfaceOnClickListenerC145413);
        }
        if (str4 == null || str4.isEmpty()) {
            aVar.m682g(R.string.cancel, dialogInterfaceOnClickListenerC145514);
        } else {
            aVar.m683h(str4, dialogInterfaceOnClickListenerC145514);
        }
        aVar.m684i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.15
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnCancelListenerC145615(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.m676a().show();
    }

    public void createConfirmDialog(WebView webView, String str, JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        DialogInterfaceOnClickListenerC14635 dialogInterfaceOnClickListenerC14635 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.5
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnClickListenerC14635(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.confirm();
                dialogInterface.dismiss();
            }
        };
        DialogInterfaceOnClickListenerC14646 dialogInterfaceOnClickListenerC14646 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.6
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnClickListenerC14646(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        DialogC0184a.a aVar = new DialogC0184a.a(activity, C1939i.f7500c);
        aVar.m681f(str);
        if (str3 == null || str3.isEmpty()) {
            aVar.m686k(R.string.ok, dialogInterfaceOnClickListenerC14635);
        } else {
            aVar.m687l(str3, dialogInterfaceOnClickListenerC14635);
        }
        if (str4 == null || str4.isEmpty()) {
            aVar.m682g(R.string.cancel, dialogInterfaceOnClickListenerC14646);
        } else {
            aVar.m683h(str4, dialogInterfaceOnClickListenerC14646);
        }
        aVar.m684i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.7
            public final /* synthetic */ JsResult val$result;

            public DialogInterfaceOnCancelListenerC14657(JsResult jsResult2) {
                r2 = jsResult2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        });
        aVar.m676a().show();
    }

    public void createPromptDialog(WebView webView, String str, String str2, JsPromptResult jsPromptResult, String str3, String str4, String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        DialogInterfaceOnClickListenerC14679 dialogInterfaceOnClickListenerC14679 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.9
            public final /* synthetic */ String val$finalValue;
            public final /* synthetic */ EditText val$input;
            public final /* synthetic */ JsPromptResult val$result;

            public DialogInterfaceOnClickListenerC14679(EditText editText2, JsPromptResult jsPromptResult2, String str52) {
                r2 = editText2;
                r3 = jsPromptResult2;
                r4 = str52;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                String obj = r2.getText().toString();
                JsPromptResult jsPromptResult2 = r3;
                String str8 = r4;
                if (str8 != null) {
                    obj = str8;
                }
                jsPromptResult2.confirm(obj);
                dialogInterface.dismiss();
            }
        };
        DialogInterfaceOnClickListenerC145110 dialogInterfaceOnClickListenerC145110 = new DialogInterface.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.10
            public final /* synthetic */ JsPromptResult val$result;

            public DialogInterfaceOnClickListenerC145110(JsPromptResult jsPromptResult2) {
                r2 = jsPromptResult2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        DialogC0184a.a aVar = new DialogC0184a.a(activity, C1939i.f7500c);
        aVar.m681f(str);
        if (str7 == null || str7.isEmpty()) {
            aVar.m686k(R.string.ok, dialogInterfaceOnClickListenerC14679);
        } else {
            aVar.m687l(str7, dialogInterfaceOnClickListenerC14679);
        }
        if (str6 == null || str6.isEmpty()) {
            aVar.m682g(R.string.cancel, dialogInterfaceOnClickListenerC145110);
        } else {
            aVar.m683h(str6, dialogInterfaceOnClickListenerC145110);
        }
        aVar.m684i(new DialogInterface.OnCancelListener() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.11
            public final /* synthetic */ JsPromptResult val$result;

            public DialogInterfaceOnCancelListenerC145211(JsPromptResult jsPromptResult2) {
                r2 = jsPromptResult2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                r2.cancel();
                dialogInterface.dismiss();
            }
        });
        DialogC0184a m676a = aVar.m676a();
        m676a.m675k(frameLayout);
        m676a.show();
    }

    public void dispose() {
        ActivityPluginBinding activityPluginBinding;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (activityPluginBinding = inAppWebViewFlutterPlugin.activityPluginBinding) != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.plugin = null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    public ViewGroup getRootView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(R.id.content);
    }

    public boolean needsCameraPermission() {
        Activity activity = getActivity();
        if (activity == null) {
            return true;
        }
        try {
            if (Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (C5782a.checkSelfPermission(activity, "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (InAppWebViewFlutterPlugin.filePathCallback == null && InAppWebViewFlutterPlugin.filePathCallbackLegacy == null) {
            return true;
        }
        if (i10 == 1) {
            Uri[] selectedFiles = i11 == -1 ? getSelectedFiles(intent, i11) : null;
            ValueCallback<Uri[]> valueCallback = InAppWebViewFlutterPlugin.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i10 == 3) {
            InAppWebViewFlutterPlugin.filePathCallbackLegacy.onReceiveValue(i11 == -1 ? intent != null ? intent.getData() : getCapturedMediaFile() : null);
        }
        InAppWebViewFlutterPlugin.filePathCallback = null;
        InAppWebViewFlutterPlugin.filePathCallbackLegacy = null;
        imageOutputFileUri = null;
        videoOutputFileUri = null;
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        this.channel.invokeMethod("onCloseWindow", new HashMap());
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MESSAGE, consoleMessage.message());
        hashMap.put("messageLevel", Integer.valueOf(consoleMessage.messageLevel().ordinal()));
        this.channel.invokeMethod("onConsoleMessage", hashMap);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        String string;
        int i10 = windowAutoincrementId + 1;
        windowAutoincrementId = i10;
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            Message obtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            Bundle data = obtainMessage.getData();
            if (data != null && (string = data.getString(WebViewActivity.URL_EXTRA)) != null && !string.isEmpty()) {
                extra = string;
            }
        }
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", null, null), true, z11, false, i10, z10);
        windowWebViewMessages.put(Integer.valueOf(i10), message);
        this.channel.invokeMethod("onCreateWindow", createWindowAction.toMap(), new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.16
            public final /* synthetic */ int val$windowId;

            public C145716(int i102) {
                r2 = i102;
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
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
                }
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
                }
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                if ((obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) || !InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(r2))) {
                    return;
                }
                InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(r2));
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        this.channel.invokeMethod("onGeolocationPermissionsHidePrompt", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        this.channel.invokeMethod("onGeolocationPermissionsShowPrompt", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.17
            public final /* synthetic */ GeolocationPermissions.Callback val$callback;
            public final /* synthetic */ String val$origin;

            public C145817(GeolocationPermissions.Callback callback2, String str2) {
                r2 = callback2;
                r3 = str2;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str2, String str22, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(", ");
                if (str22 == null) {
                    str22 = "";
                }
                sb2.append(str22);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                r2.invoke(r3, false, false);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                r2.invoke(r3, false, false);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                Map map = (Map) obj;
                if (map != null) {
                    r2.invoke((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
                } else {
                    r2.invoke(r3, false, false);
                }
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        ViewGroup rootView;
        Activity activity = getActivity();
        if (activity == null || (rootView = getRootView()) == null) {
            return;
        }
        ((FrameLayout) rootView).removeView(this.mCustomView);
        this.mCustomView = null;
        rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
        activity.setRequestedOrientation(this.mOriginalOrientation);
        this.mCustomViewCallback.onCustomViewHidden();
        this.mCustomViewCallback = null;
        activity.getWindow().clearFlags(512);
        this.channel.invokeMethod("onExitFullscreen", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("iosIsMainFrame", null);
        this.channel.invokeMethod("onJsAlert", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.1
            public final /* synthetic */ String val$message;
            public final /* synthetic */ JsResult val$result;
            public final /* synthetic */ WebView val$view;

            public C14501(JsResult jsResult2, WebView webView2, String str22) {
                r2 = jsResult2;
                r3 = webView2;
                r4 = str22;
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
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                r2.cancel();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewChromeClient.this.createAlertDialog(r3, r4, r2, null, null);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                String str3;
                String str22;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str32 = (String) map.get(Constants.MESSAGE);
                    String str4 = (String) map.get("confirmButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            r2.cancel();
                            return;
                        } else {
                            r2.confirm();
                            return;
                        }
                    }
                    str3 = str32;
                    str22 = str4;
                } else {
                    str3 = null;
                    str22 = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(r3, r4, r2, str3, str22);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put(Constants.MESSAGE, str2);
        this.channel.invokeMethod("onJsBeforeUnload", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.12
            public final /* synthetic */ String val$message;
            public final /* synthetic */ JsResult val$result;
            public final /* synthetic */ WebView val$view;

            public C145312(JsResult jsResult2, WebView webView2, String str22) {
                r2 = jsResult2;
                r3 = webView2;
                r4 = str22;
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
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                r2.cancel();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, null, null, null);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                String str3;
                String str22;
                String str32;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str4 = (String) map.get(Constants.MESSAGE);
                    String str5 = (String) map.get("confirmButtonTitle");
                    String str6 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            r2.cancel();
                            return;
                        } else {
                            r2.confirm();
                            return;
                        }
                    }
                    str3 = str4;
                    str22 = str5;
                    str32 = str6;
                } else {
                    str3 = null;
                    str22 = null;
                    str32 = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(r3, r4, r2, str3, str22, str32);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("iosIsMainFrame", null);
        this.channel.invokeMethod("onJsConfirm", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.4
            public final /* synthetic */ String val$message;
            public final /* synthetic */ JsResult val$result;
            public final /* synthetic */ WebView val$view;

            public C14624(JsResult jsResult2, WebView webView2, String str22) {
                r2 = jsResult2;
                r3 = webView2;
                r4 = str22;
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
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                r2.cancel();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, null, null, null);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                String str3;
                String str22;
                String str32;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str4 = (String) map.get(Constants.MESSAGE);
                    String str5 = (String) map.get("confirmButtonTitle");
                    String str6 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            r2.cancel();
                            return;
                        } else {
                            r2.confirm();
                            return;
                        }
                    }
                    str3 = str4;
                    str22 = str5;
                    str32 = str6;
                } else {
                    str3 = null;
                    str22 = null;
                    str32 = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(r3, r4, r2, str3, str22, str32);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put(Constants.MESSAGE, str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("iosIsMainFrame", null);
        this.channel.invokeMethod("onJsPrompt", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.8
            public final /* synthetic */ String val$defaultValue;
            public final /* synthetic */ String val$message;
            public final /* synthetic */ JsPromptResult val$result;
            public final /* synthetic */ WebView val$view;

            public C14668(JsPromptResult jsPromptResult2, WebView webView2, String str22, String str32) {
                r2 = jsPromptResult2;
                r3 = webView2;
                r4 = str22;
                r5 = str32;
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void error(String str4, String str22, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(", ");
                if (str22 == null) {
                    str22 = "";
                }
                sb2.append(str22);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                r2.cancel();
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void notImplemented() {
                InAppWebViewChromeClient.this.createPromptDialog(r3, r4, r5, r2, null, null, null, null, null);
            }

            @Override // io.flutter.plugin.common.MethodChannel.Result
            public void success(Object obj) {
                String str4;
                String str22;
                String str32;
                String str42;
                String str5;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str6 = (String) map.get(Constants.MESSAGE);
                    String str7 = (String) map.get("defaultValue");
                    String str8 = (String) map.get("confirmButtonTitle");
                    String str9 = (String) map.get("cancelButtonTitle");
                    String str10 = (String) map.get("value");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool != null && bool.booleanValue()) {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            r2.cancel();
                            return;
                        } else {
                            r2.confirm(str10);
                            return;
                        }
                    }
                    str4 = str6;
                    str22 = str7;
                    str5 = str8;
                    str42 = str9;
                    str32 = str10;
                } else {
                    str4 = null;
                    str22 = null;
                    str32 = null;
                    str42 = null;
                    str5 = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(r3, r4, r5, r2, str4, str22, str32, str42, str5);
            }
        });
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            HashMap hashMap = new HashMap();
            hashMap.put("origin", permissionRequest.getOrigin().toString());
            hashMap.put("resources", Arrays.asList(permissionRequest.getResources()));
            this.channel.invokeMethod("onPermissionRequest", hashMap, new MethodChannel.Result() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.18
                public final /* synthetic */ PermissionRequest val$request;

                public C145918(PermissionRequest permissionRequest2) {
                    r2 = permissionRequest2;
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
                    Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                    r2.deny();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    r2.deny();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        List list = (List) map.get("resources");
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String[] strArr = (String[]) list.toArray(new String[list.size()]);
                        if (num != null) {
                            if (num.intValue() != 1) {
                                r2.deny();
                                return;
                            } else {
                                r2.grant(strArr);
                                return;
                            }
                        }
                    }
                    r2.deny();
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        InAppWebView inAppWebView = (InAppWebView) webView;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeProgress(i10);
        }
        InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("progress", Integer.valueOf(i10));
        this.channel.invokeMethod("onProgressChanged", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e10) {
            e10.printStackTrace();
            String message = e10.getMessage();
            if (message != null) {
                Log.e(LOG_TAG, message);
            }
        }
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        hashMap.put("icon", byteArrayOutputStream.toByteArray());
        this.channel.invokeMethod("onReceivedIcon", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didChangeTitle(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        this.channel.invokeMethod("onTitleChanged", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        super.onReceivedTouchIconUrl(webView, str, z10);
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put("precomposed", Boolean.valueOf(z10));
        this.channel.invokeMethod("onReceivedTouchIconUrl", hashMap);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup rootView;
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        Activity activity = getActivity();
        if (activity == null || (rootView = getRootView()) == null) {
            return;
        }
        this.mCustomView = view;
        this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
        this.mOriginalOrientation = activity.getRequestedOrientation();
        this.mCustomViewCallback = customViewCallback;
        this.mCustomView.setBackgroundColor(-16777216);
        rootView.setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT : FULLSCREEN_SYSTEM_UI_VISIBILITY);
        activity.getWindow().setFlags(512, 512);
        ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
        this.channel.invokeMethod("onEnterFullscreen", new HashMap());
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return startPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1, fileChooserParams.isCaptureEnabled());
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPickerIntent(valueCallback, "", null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPickerIntent(valueCallback, str, null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPickerIntent(valueCallback, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startPickerIntent(android.webkit.ValueCallback<android.net.Uri> r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin.filePathCallbackLegacy = r3
            java.lang.Boolean r3 = r2.acceptsImages(r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo(r4)
            boolean r0 = r0.booleanValue()
            if (r5 == 0) goto L28
            boolean r5 = r2.needsCameraPermission()
            if (r5 != 0) goto L28
            if (r3 == 0) goto L21
            android.content.Intent r5 = r2.getPhotoIntent()
            goto L29
        L21:
            if (r0 == 0) goto L28
            android.content.Intent r5 = r2.getVideoIntent()
            goto L29
        L28:
            r5 = 0
        L29:
            if (r5 != 0) goto L60
            android.content.Intent r4 = r2.getFileChooserIntent(r4)
            java.lang.String r5 = ""
            android.content.Intent r5 = android.content.Intent.createChooser(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L52
            if (r3 == 0) goto L49
            android.content.Intent r3 = r2.getPhotoIntent()
            r4.add(r3)
        L49:
            if (r0 == 0) goto L52
            android.content.Intent r3 = r2.getVideoIntent()
            r4.add(r3)
        L52:
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
            r5.putExtra(r4, r3)
        L60:
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L75
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            android.content.ComponentName r4 = r5.resolveActivity(r4)
            if (r4 == 0) goto L75
            r4 = 3
            r3.startActivityForResult(r5, r4)
            goto L7c
        L75:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r4 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r4)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean startPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r3, java.lang.String[] r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin.filePathCallback = r3
            java.lang.Boolean r3 = r2.acceptsImages(r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo(r4)
            boolean r0 = r0.booleanValue()
            if (r6 == 0) goto L28
            boolean r6 = r2.needsCameraPermission()
            if (r6 != 0) goto L28
            if (r3 == 0) goto L21
            android.content.Intent r6 = r2.getPhotoIntent()
            goto L29
        L21:
            if (r0 == 0) goto L28
            android.content.Intent r6 = r2.getVideoIntent()
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 != 0) goto L67
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L48
            if (r3 == 0) goto L3f
            android.content.Intent r3 = r2.getPhotoIntent()
            r6.add(r3)
        L3f:
            if (r0 == 0) goto L48
            android.content.Intent r3 = r2.getVideoIntent()
            r6.add(r3)
        L48:
            android.content.Intent r3 = r2.getFileChooserIntent(r4, r5)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.CHOOSER"
            r4.<init>(r5)
            java.lang.String r5 = "android.intent.extra.INTENT"
            r4.putExtra(r5, r3)
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r6.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r5 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r5, r3)
            r6 = r4
        L67:
            android.app.Activity r3 = r2.getActivity()
            r4 = 1
            if (r3 == 0) goto L7c
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            android.content.ComponentName r5 = r6.resolveActivity(r5)
            if (r5 == 0) goto L7c
            r3.startActivityForResult(r6, r4)
            goto L83
        L7c:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r5 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r5)
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }
}
