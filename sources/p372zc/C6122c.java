package p372zc;

import android.content.Context;
import dev.fluttercommunity.plus.share.C1624a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import td.C4747g;
import td.C4753m;

/* renamed from: zc.c */
/* loaded from: classes2.dex */
public final class C6122c implements FlutterPlugin, ActivityAware {

    /* renamed from: k */
    public static final a f22677k = new a(null);

    /* renamed from: h */
    public C6121b f22678h;

    /* renamed from: i */
    public C1624a f22679i;

    /* renamed from: j */
    public MethodChannel f22680j;

    /* renamed from: zc.c$a */
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
        C4753m.m18653f(activityPluginBinding, "binding");
        C1624a c1624a = this.f22679i;
        C6121b c6121b = null;
        if (c1624a == null) {
            C4753m.m18667t("manager");
            c1624a = null;
        }
        activityPluginBinding.addActivityResultListener(c1624a);
        C6121b c6121b2 = this.f22678h;
        if (c6121b2 == null) {
            C4753m.m18667t("share");
        } else {
            c6121b = c6121b2;
        }
        c6121b.m24428l(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        this.f22680j = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        this.f22679i = new C1624a(applicationContext);
        Context applicationContext2 = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext2, "binding.applicationContext");
        C1624a c1624a = this.f22679i;
        MethodChannel methodChannel = null;
        if (c1624a == null) {
            C4753m.m18667t("manager");
            c1624a = null;
        }
        C6121b c6121b = new C6121b(applicationContext2, null, c1624a);
        this.f22678h = c6121b;
        C1624a c1624a2 = this.f22679i;
        if (c1624a2 == null) {
            C4753m.m18667t("manager");
            c1624a2 = null;
        }
        C6120a c6120a = new C6120a(c6121b, c1624a2);
        MethodChannel methodChannel2 = this.f22680j;
        if (methodChannel2 == null) {
            C4753m.m18667t("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(c6120a);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C6121b c6121b = this.f22678h;
        if (c6121b == null) {
            C4753m.m18667t("share");
            c6121b = null;
        }
        c6121b.m24428l(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f22680j;
        if (methodChannel == null) {
            C4753m.m18667t("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C4753m.m18653f(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
