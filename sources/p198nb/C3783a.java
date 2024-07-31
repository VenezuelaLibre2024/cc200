package p198nb;

import android.os.Environment;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import td.C4753m;

/* renamed from: nb.a */
/* loaded from: classes.dex */
public final class C3783a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public MethodChannel f13631h;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "android_path_provider");
        this.f13631h = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f13631h;
        if (methodChannel == null) {
            C4753m.m18667t("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result, "result");
        if (C4753m.m18648a(methodCall.method, "getAlarmsPath")) {
            str = Environment.DIRECTORY_ALARMS;
        } else if (C4753m.m18648a(methodCall.method, "getDCIMPath")) {
            str = Environment.DIRECTORY_DCIM;
        } else if (C4753m.m18648a(methodCall.method, "getDocumentsPath")) {
            str = Environment.DIRECTORY_DOCUMENTS;
        } else if (C4753m.m18648a(methodCall.method, "getDownloadsPath")) {
            str = Environment.DIRECTORY_DOWNLOADS;
        } else if (C4753m.m18648a(methodCall.method, "getMoviesPath")) {
            str = Environment.DIRECTORY_MOVIES;
        } else if (C4753m.m18648a(methodCall.method, "getMusicPath")) {
            str = Environment.DIRECTORY_MUSIC;
        } else if (C4753m.m18648a(methodCall.method, "getNotificationsPath")) {
            str = Environment.DIRECTORY_NOTIFICATIONS;
        } else if (C4753m.m18648a(methodCall.method, "getPicturesPath")) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (C4753m.m18648a(methodCall.method, "getPodcastsPath")) {
            str = Environment.DIRECTORY_PODCASTS;
        } else {
            if (!C4753m.m18648a(methodCall.method, "getRingtonesPath")) {
                result.notImplemented();
                return;
            }
            str = Environment.DIRECTORY_RINGTONES;
        }
        result.success(Environment.getExternalStoragePublicDirectory(str).getAbsolutePath());
    }
}
