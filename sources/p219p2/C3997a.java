package p219p2;

import android.content.Context;
import android.provider.Settings;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import lc.C3466b;
import td.C4753m;

/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class C3997a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public Context f14397h;

    /* renamed from: i */
    public MethodChannel f14398i;

    /* renamed from: a */
    public final boolean m15141a() {
        Context context = this.f14397h;
        if (context == null) {
            C4753m.m18667t("context");
            context = null;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f14398i = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_jailbreak_detection");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        this.f14397h = applicationContext;
        MethodChannel methodChannel = this.f14398i;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f14398i;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean m15141a;
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        if (methodCall.method.equals("jailbroken")) {
            Context context = this.f14397h;
            if (context == null) {
                C4753m.m18667t("context");
                context = null;
            }
            m15141a = new C3466b(context).m12910n();
        } else {
            if (!methodCall.method.equals("developerMode")) {
                result.notImplemented();
                return;
            }
            m15141a = m15141a();
        }
        result.success(Boolean.valueOf(m15141a));
    }
}
