package p326wc;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* renamed from: wc.d */
/* loaded from: classes2.dex */
public class C5479d implements FlutterPlugin, ActivityAware, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: h */
    public FlutterPlugin.FlutterPluginBinding f20370h;

    /* renamed from: i */
    public ActivityPluginBinding f20371i;

    /* renamed from: j */
    public MethodChannel f20372j;

    /* renamed from: k */
    public C5476a f20373k;

    /* renamed from: l */
    public C5478c f20374l;

    /* renamed from: a */
    public final void m21710a(Context context, BinaryMessenger binaryMessenger, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f20372j = new MethodChannel(binaryMessenger, "com.zt.shareextend/share_extend");
        C5478c c5478c = new C5478c(context);
        this.f20374l = c5478c;
        C5476a c5476a = new C5476a(c5478c);
        this.f20373k = c5476a;
        this.f20372j.setMethodCallHandler(c5476a);
        if (registrar != null) {
            registrar.addRequestPermissionsResultListener(this);
        } else {
            activityPluginBinding.addRequestPermissionsResultListener(this);
        }
    }

    /* renamed from: b */
    public final void m21711b() {
        this.f20371i.removeRequestPermissionsResultListener(this);
        this.f20371i = null;
        this.f20372j.setMethodCallHandler(null);
        this.f20372j = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f20371i = activityPluginBinding;
        m21710a(activityPluginBinding.getActivity(), this.f20370h.getBinaryMessenger(), null, this.f20371i);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f20370h = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m21711b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f20370h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 100 && iArr.length > 0 && iArr[0] == 0) {
            this.f20374l.m21707c();
        }
        return false;
    }
}
