package p070ed;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import td.C4753m;

/* renamed from: ed.a */
/* loaded from: classes2.dex */
public final class C1767a implements FlutterPlugin {

    /* renamed from: h */
    public MethodChannel f6523h;

    /* renamed from: a */
    public final void m7066a(BinaryMessenger binaryMessenger, Context context) {
        this.f6523h = new MethodChannel(binaryMessenger, "PonnamKarthik/fluttertoast");
        C1769c c1769c = new C1769c(context);
        MethodChannel methodChannel = this.f6523h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(c1769c);
        }
    }

    /* renamed from: b */
    public final void m7067b() {
        MethodChannel methodChannel = this.f6523h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f6523h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        m7066a(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "p0");
        m7067b();
    }
}
