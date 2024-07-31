package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview.types.WebViewImplementation;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FlutterWebViewFactory extends PlatformViewFactory {
    private final InAppWebViewFlutterPlugin plugin;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.FlutterWebViewFactory$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C13991 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$WebViewImplementation */
        public static final /* synthetic */ int[] f5361xd1763954;

        static {
            int[] iArr = new int[WebViewImplementation.values().length];
            f5361xd1763954 = iArr;
            try {
                iArr[WebViewImplementation.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(StandardMessageCodec.INSTANCE);
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        HashMap<String, Object> hashMap = (HashMap) obj;
        int i11 = C13991.f5361xd1763954[WebViewImplementation.fromValue(((Integer) hashMap.get("implementation")).intValue()).ordinal()];
        FlutterWebView flutterWebView = new FlutterWebView(this.plugin, context, Integer.valueOf(i10), hashMap);
        flutterWebView.makeInitialLoad(hashMap);
        return flutterWebView;
    }
}
