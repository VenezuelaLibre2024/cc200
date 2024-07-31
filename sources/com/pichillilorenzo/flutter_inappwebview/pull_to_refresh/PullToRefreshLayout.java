package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.C0398c;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PullToRefreshLayout extends C0398c implements MethodChannel.MethodCallHandler {
    public static final String LOG_TAG = "PullToRefreshLayout";
    public MethodChannel channel;
    public PullToRefreshOptions options;

    public PullToRefreshLayout(Context context) {
        super(context);
        this.channel = null;
        this.options = null;
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.channel = null;
        this.options = null;
    }

    public PullToRefreshLayout(Context context, MethodChannel methodChannel, PullToRefreshOptions pullToRefreshOptions) {
        super(context);
        this.channel = methodChannel;
        this.options = pullToRefreshOptions;
    }

    public void dispose() {
        removeAllViews();
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0078. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        Object obj;
        String str = methodCall.method;
        str.hashCode();
        switch (str.hashCode()) {
            case -1790841290:
                if (str.equals("setSlingshotDistance")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 154556713:
                if (str.equals("setRefreshing")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1235582893:
                if (str.equals("getDefaultSlingshotDistance")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1364071551:
                if (str.equals("setEnabled")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1389555745:
                if (str.equals("setColor")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743806995:
                if (str.equals("setBackgroundColor")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1807783361:
                if (str.equals("setDistanceToTriggerSync")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1849446385:
                if (str.equals("isRefreshing")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                setSlingshotDistance(((Integer) methodCall.argument("slingshotDistance")).intValue());
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 1:
                setRefreshing(((Boolean) methodCall.argument("refreshing")).booleanValue());
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 2:
                obj = -1;
                result.success(obj);
                return;
            case 3:
                Boolean bool = (Boolean) methodCall.argument("enabled");
                this.options.enabled = bool;
                setEnabled(bool.booleanValue());
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 4:
                setColorSchemeColors(Color.parseColor((String) methodCall.argument("color")));
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 5:
                setProgressBackgroundColorSchemeColor(Color.parseColor((String) methodCall.argument("color")));
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 6:
                setDistanceToTriggerSync(((Integer) methodCall.argument("distanceToTriggerSync")).intValue());
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            case 7:
                obj = Boolean.valueOf(isRefreshing());
                result.success(obj);
                return;
            case '\b':
                setSize(((Integer) methodCall.argument("size")).intValue());
                obj = Boolean.TRUE;
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void prepare() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        setEnabled(this.options.enabled.booleanValue());
        setOnChildScrollUpCallback(new C0398c.i() { // from class: com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout.1
            @Override // androidx.swiperefreshlayout.widget.C0398c.i
            public boolean canChildScrollUp(C0398c c0398c, View view) {
                if (!(view instanceof InAppWebView)) {
                    return true;
                }
                InAppWebView inAppWebView = (InAppWebView) view;
                if (!inAppWebView.canScrollVertically() || inAppWebView.getScrollY() <= 0) {
                    return !inAppWebView.canScrollVertically() && inAppWebView.getScrollY() == 0;
                }
                return true;
            }
        });
        setOnRefreshListener(new C0398c.j() { // from class: com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout.2
            @Override // androidx.swiperefreshlayout.widget.C0398c.j
            public void onRefresh() {
                if (PullToRefreshLayout.this.channel == null) {
                    this.setRefreshing(false);
                } else {
                    PullToRefreshLayout.this.channel.invokeMethod("onRefresh", new HashMap());
                }
            }
        });
        String str = this.options.color;
        if (str != null) {
            setColorSchemeColors(Color.parseColor(str));
        }
        String str2 = this.options.backgroundColor;
        if (str2 != null) {
            setProgressBackgroundColorSchemeColor(Color.parseColor(str2));
        }
        Integer num = this.options.distanceToTriggerSync;
        if (num != null) {
            setDistanceToTriggerSync(num.intValue());
        }
        Integer num2 = this.options.slingshotDistance;
        if (num2 != null) {
            setSlingshotDistance(num2.intValue());
        }
        Integer num3 = this.options.size;
        if (num3 != null) {
            setSize(num3.intValue());
        }
    }
}
