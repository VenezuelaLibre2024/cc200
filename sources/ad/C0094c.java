package ad;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import p000.C0433b;
import p000.C1792f;
import p000.InterfaceC2571i;
import td.C4753m;

/* renamed from: ad.c */
/* loaded from: classes2.dex */
public final class C0094c implements FlutterPlugin, InterfaceC2571i, ActivityAware {

    /* renamed from: h */
    public C0093b f328h;

    @Override // p000.InterfaceC2571i
    /* renamed from: a */
    public void mo399a(C1792f c1792f) {
        C4753m.m18653f(c1792f, "msg");
        C0093b c0093b = this.f328h;
        C4753m.m18650c(c0093b);
        c0093b.m398d(c1792f);
    }

    @Override // p000.InterfaceC2571i
    public C0433b isEnabled() {
        C0093b c0093b = this.f328h;
        C4753m.m18650c(c0093b);
        return c0093b.m396b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "binding");
        C0093b c0093b = this.f328h;
        if (c0093b == null) {
            return;
        }
        c0093b.m397c(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "flutterPluginBinding");
        InterfaceC2571i.a aVar = InterfaceC2571i.f10086a;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "flutterPluginBinding.binaryMessenger");
        aVar.m10276d(binaryMessenger, this);
        this.f328h = new C0093b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C0093b c0093b = this.f328h;
        if (c0093b == null) {
            return;
        }
        c0093b.m397c(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        InterfaceC2571i.a aVar = InterfaceC2571i.f10086a;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        aVar.m10276d(binaryMessenger, null);
        this.f328h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
