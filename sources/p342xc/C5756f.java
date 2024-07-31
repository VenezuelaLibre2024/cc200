package p342xc;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: xc.f */
/* loaded from: classes2.dex */
public class C5756f implements FlutterPlugin {

    /* renamed from: h */
    public MethodChannel f21320h;

    /* renamed from: i */
    public EventChannel f21321i;

    /* renamed from: j */
    public C5754d f21322j;

    /* renamed from: a */
    public final void m22885a(BinaryMessenger binaryMessenger, Context context) {
        this.f21320h = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f21321i = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        C5751a c5751a = new C5751a((ConnectivityManager) context.getSystemService("connectivity"));
        C5755e c5755e = new C5755e(c5751a);
        this.f21322j = new C5754d(context, c5751a);
        this.f21320h.setMethodCallHandler(c5755e);
        this.f21321i.setStreamHandler(this.f21322j);
    }

    /* renamed from: b */
    public final void m22886b() {
        this.f21320h.setMethodCallHandler(null);
        this.f21321i.setStreamHandler(null);
        this.f21322j.onCancel(null);
        this.f21320h = null;
        this.f21321i = null;
        this.f21322j = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m22885a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m22886b();
    }
}
