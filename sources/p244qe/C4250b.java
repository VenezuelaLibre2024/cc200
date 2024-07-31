package p244qe;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import td.C4747g;
import td.C4753m;

/* renamed from: qe.b */
/* loaded from: classes2.dex */
public final class C4250b implements FlutterPlugin, ActivityAware {

    /* renamed from: h */
    public static final a f15367h = new a(null);

    /* renamed from: qe.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "activityPluginBinding");
        C4254f c4254f = C4254f.f15386a;
        c4254f.m16335c(activityPluginBinding.getActivity());
        c4254f.m16336d(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "flutterPluginBinding");
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "flutterPluginBinding.binaryMessenger");
        platformViewRegistry.registerViewFactory("net.touchcapture.qr.flutterqr/qrview", new C4252d(binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C4254f c4254f = C4254f.f15386a;
        c4254f.m16335c(null);
        c4254f.m16336d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        C4254f c4254f = C4254f.f15386a;
        c4254f.m16335c(null);
        c4254f.m16336d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "activityPluginBinding");
        C4254f c4254f = C4254f.f15386a;
        c4254f.m16335c(activityPluginBinding.getActivity());
        c4254f.m16336d(activityPluginBinding);
    }
}
