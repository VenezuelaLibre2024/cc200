package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class InAppWebViewMethodHandler implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "IAWMethodHandler";
    public InAppWebViewInterface webView;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$1 */
    /* loaded from: classes.dex */
    public class C14001 implements ValueCallback<String> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14001(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$2 */
    /* loaded from: classes.dex */
    public class C14012 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14012(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$3 */
    /* loaded from: classes.dex */
    public class C14023 implements ValueCallback<String> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14023(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$4 */
    /* loaded from: classes.dex */
    public class C14034 implements ValueCallback<String> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14034(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$5 */
    /* loaded from: classes.dex */
    public class C14045 implements ValueCallback<String> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14045(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.success(str);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler$6 */
    /* loaded from: classes.dex */
    public class C14056 implements ValueCallback<Boolean> {
        public final /* synthetic */ MethodChannel.Result val$result;

        public C14056(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    public InAppWebViewMethodHandler(InAppWebViewInterface inAppWebViewInterface) {
        this.webView = inAppWebViewInterface;
    }

    public void dispose() {
        this.webView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0848, code lost:
    
        if (r0.isLoading() != false) goto L1123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0856, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0854, code lost:
    
        if (r0.canGoBack() != false) goto L1123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x09b5, code lost:
    
        if (r0.canGoForward() != false) goto L1123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x09df, code lost:
    
        if (r3.canGoBackOrForward(((java.lang.Integer) r17.argument("steps")).intValue()) != false) goto L1123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:218:0x03f5. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r17, io.flutter.plugin.common.MethodChannel.Result r18) {
        /*
            Method dump skipped, instructions count: 3106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
