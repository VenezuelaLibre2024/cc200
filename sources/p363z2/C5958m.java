package p363z2;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: z2.m */
/* loaded from: classes.dex */
public final class C5958m implements FlutterPlugin, ActivityAware {

    /* renamed from: h */
    public C5959n f22120h;

    /* renamed from: i */
    public MethodChannel f22121i;

    /* renamed from: j */
    public ActivityPluginBinding f22122j;

    /* renamed from: k */
    public C5957l f22123k;

    /* renamed from: a */
    public final void m23849a() {
        ActivityPluginBinding activityPluginBinding = this.f22122j;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f22120h);
            this.f22122j.removeRequestPermissionsResultListener(this.f22120h);
        }
    }

    /* renamed from: b */
    public final void m23850b() {
        ActivityPluginBinding activityPluginBinding = this.f22122j;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f22120h);
            this.f22122j.addRequestPermissionsResultListener(this.f22120h);
        }
    }

    /* renamed from: c */
    public final void m23851c(Context context, BinaryMessenger binaryMessenger) {
        this.f22121i = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        C5957l c5957l = new C5957l(context, new C5946a(), this.f22120h, new C5961p());
        this.f22123k = c5957l;
        this.f22121i.setMethodCallHandler(c5957l);
    }

    /* renamed from: d */
    public final void m23852d(Activity activity) {
        C5959n c5959n = this.f22120h;
        if (c5959n != null) {
            c5959n.m23862h(activity);
        }
    }

    /* renamed from: e */
    public final void m23853e() {
        this.f22121i.setMethodCallHandler(null);
        this.f22121i = null;
        this.f22123k = null;
    }

    /* renamed from: f */
    public final void m23854f() {
        C5959n c5959n = this.f22120h;
        if (c5959n != null) {
            c5959n.m23862h(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m23852d(activityPluginBinding.getActivity());
        this.f22122j = activityPluginBinding;
        m23850b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f22120h = new C5959n(flutterPluginBinding.getApplicationContext());
        m23851c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m23854f();
        m23849a();
        this.f22122j = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m23853e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
