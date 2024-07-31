package cd;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import ne.C3819c;

/* renamed from: cd.a */
/* loaded from: classes2.dex */
public class C1012a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: h */
    public Context f3961h;

    /* renamed from: i */
    public MethodChannel f3962i;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "g123k/flutter_app_badger");
        this.f3962i = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f3961h = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f3962i.setMethodCallHandler(null);
        this.f3961h = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("updateBadgeCount")) {
            C3819c.m14521a(this.f3961h, Integer.valueOf(methodCall.argument("count").toString()).intValue());
        } else {
            if (!methodCall.method.equals("removeBadge")) {
                if (methodCall.method.equals("isAppBadgeSupported")) {
                    result.success(Boolean.valueOf(C3819c.m14524d(this.f3961h)));
                    return;
                } else {
                    result.notImplemented();
                    return;
                }
            }
            C3819c.m14525e(this.f3961h);
        }
        result.success(null);
    }
}
