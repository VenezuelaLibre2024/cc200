package p071ef;

import android.app.Activity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import p101h.AbstractC2262d;

/* renamed from: ef.c */
/* loaded from: classes2.dex */
public class C1790c implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: h */
    public C1789b f6592h;

    /* renamed from: i */
    public ActivityPluginBinding f6593i;

    static {
        AbstractC2262d.m9030B(true);
    }

    /* renamed from: a */
    public C1789b m7240a(Activity activity) {
        C1789b c1789b = new C1789b(activity);
        this.f6592h = c1789b;
        return c1789b;
    }

    /* renamed from: b */
    public final void m7241b(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "plugins.hunghd.vn/image_cropper").setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m7240a(activityPluginBinding.getActivity());
        this.f6593i = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f6592h);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m7241b(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f6593i.removeActivityResultListener(this.f6592h);
        this.f6593i = null;
        this.f6592h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("cropImage")) {
            this.f6592h.m7239g(methodCall, result);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
