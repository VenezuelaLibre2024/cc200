package p030c3;

import ac.C0090e;
import ac.C0091f;
import ac.InterfaceC0087b;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import gd.C2245s;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;
import org.json.JSONObject;
import p025bc.C0541a;
import p025bc.C0543c;
import p025bc.C0544d;
import p025bc.InterfaceC0545e;
import p296ub.C5000a;
import p296ub.InterfaceC5001b;
import p325wb.C5472e;
import td.C4747g;
import td.C4753m;

/* renamed from: c3.c */
/* loaded from: classes.dex */
public final class C0607c implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: n */
    public static final a f2638n = new a(null);

    /* renamed from: h */
    public Context f2639h;

    /* renamed from: i */
    public MethodChannel f2640i;

    /* renamed from: l */
    public Future<Void> f2643l;

    /* renamed from: j */
    public final String f2641j = "VideoCompressPlugin";

    /* renamed from: k */
    public final C5472e f2642k = new C5472e("VideoCompressPlugin");

    /* renamed from: m */
    public String f2644m = "video_compress";

    /* renamed from: c3.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: c3.c$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC5001b {

        /* renamed from: a */
        public final /* synthetic */ MethodChannel f2645a;

        /* renamed from: b */
        public final /* synthetic */ C0607c f2646b;

        /* renamed from: c */
        public final /* synthetic */ Context f2647c;

        /* renamed from: d */
        public final /* synthetic */ String f2648d;

        /* renamed from: e */
        public final /* synthetic */ MethodChannel.Result f2649e;

        /* renamed from: f */
        public final /* synthetic */ boolean f2650f;

        /* renamed from: g */
        public final /* synthetic */ String f2651g;

        public b(MethodChannel methodChannel, C0607c c0607c, Context context, String str, MethodChannel.Result result, boolean z10, String str2) {
            this.f2645a = methodChannel;
            this.f2646b = c0607c;
            this.f2647c = context;
            this.f2648d = str;
            this.f2649e = result;
            this.f2650f = z10;
            this.f2651g = str2;
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: a */
        public void mo3014a(int i10) {
            this.f2645a.invokeMethod("updateProgress", Double.valueOf(100.0d));
            JSONObject m3010d = new C0606b(this.f2646b.m3012a()).m3010d(this.f2647c, this.f2648d);
            m3010d.put("isCancel", false);
            this.f2649e.success(m3010d.toString());
            if (this.f2650f) {
                new File(this.f2651g).delete();
            }
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: b */
        public void mo3015b(double d10) {
            this.f2645a.invokeMethod("updateProgress", Double.valueOf(d10 * 100.0d));
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: c */
        public void mo3016c(Throwable th) {
            C4753m.m18653f(th, Constants.EXCEPTION);
            this.f2649e.success(null);
        }

        @Override // p296ub.InterfaceC5001b
        /* renamed from: d */
        public void mo3017d() {
            this.f2649e.success(null);
        }
    }

    /* renamed from: a */
    public final String m3012a() {
        return this.f2644m;
    }

    /* renamed from: b */
    public final void m3013b(Context context, BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, this.f2644m);
        methodChannel.setMethodCallHandler(this);
        this.f2639h = context;
        this.f2640i = methodChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C4753m.m18652e(applicationContext, "binding.applicationContext");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C4753m.m18652e(binaryMessenger, "binding.binaryMessenger");
        m3013b(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C4753m.m18653f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f2640i;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f2639h = null;
        this.f2640i = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002a. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        InterfaceC0545e c0544d;
        InterfaceC0087b c0090e;
        C0543c c0543c;
        String str;
        String str2;
        MethodChannel.Result result2 = result;
        C4753m.m18653f(methodCall, "call");
        C4753m.m18653f(result2, "result");
        Context context = this.f2639h;
        MethodChannel methodChannel = this.f2640i;
        if (context == null || methodChannel == null) {
            Log.w(this.f2641j, "Calling VideoCompress plugin before initialization");
            return;
        }
        String str3 = methodCall.method;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1335238004:
                    if (str3.equals("cancelCompression")) {
                        Future<Void> future = this.f2643l;
                        if (future != null) {
                            future.cancel(true);
                        }
                        obj = Boolean.FALSE;
                        result2.success(obj);
                        return;
                    }
                    break;
                case -442064102:
                    if (str3.equals("getFileThumbnail")) {
                        String str4 = (String) methodCall.argument("path");
                        Object argument = methodCall.argument("quality");
                        C4753m.m18650c(argument);
                        int intValue = ((Number) argument).intValue();
                        Object argument2 = methodCall.argument("position");
                        C4753m.m18650c(argument2);
                        int intValue2 = ((Number) argument2).intValue();
                        C0605a c0605a = new C0605a("video_compress");
                        C4753m.m18650c(str4);
                        c0605a.m3006b(context, str4, intValue, intValue2, result);
                        return;
                    }
                    break;
                case -309915358:
                    if (str3.equals("setLogLevel")) {
                        Object argument3 = methodCall.argument("logLevel");
                        C4753m.m18650c(argument3);
                        C5472e.m21680e(((Number) argument3).intValue());
                        obj = Boolean.TRUE;
                        result2.success(obj);
                        return;
                    }
                    break;
                case -281136852:
                    if (str3.equals("deleteAllCache")) {
                        result2 = result;
                        new C0606b(this.f2644m).m3007a(context, result2);
                        obj = C2245s.f8873a;
                        result2.success(obj);
                        return;
                    }
                    break;
                case 1306162446:
                    if (str3.equals("getByteThumbnail")) {
                        String str5 = (String) methodCall.argument("path");
                        Object argument4 = methodCall.argument("quality");
                        C4753m.m18650c(argument4);
                        int intValue3 = ((Number) argument4).intValue();
                        Object argument5 = methodCall.argument("position");
                        C4753m.m18650c(argument5);
                        int intValue4 = ((Number) argument5).intValue();
                        C0605a c0605a2 = new C0605a(this.f2644m);
                        C4753m.m18650c(str5);
                        c0605a2.m3005a(str5, intValue3, intValue4, result);
                        return;
                    }
                    break;
                case 1729824313:
                    if (str3.equals("compressVideo")) {
                        Object argument6 = methodCall.argument("path");
                        C4753m.m18650c(argument6);
                        String str6 = (String) argument6;
                        Object argument7 = methodCall.argument("quality");
                        C4753m.m18650c(argument7);
                        int intValue5 = ((Number) argument7).intValue();
                        Object argument8 = methodCall.argument("deleteOrigin");
                        C4753m.m18650c(argument8);
                        boolean booleanValue = ((Boolean) argument8).booleanValue();
                        Integer num = (Integer) methodCall.argument("startTime");
                        Integer num2 = (Integer) methodCall.argument("duration");
                        Boolean bool = (Boolean) methodCall.argument("includeAudio");
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        boolean booleanValue2 = bool.booleanValue();
                        Integer num3 = methodCall.argument("frameRate") == null ? 30 : (Integer) methodCall.argument("frameRate");
                        File externalFilesDir = context.getExternalFilesDir("video_compress");
                        C4753m.m18650c(externalFilesDir);
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        C4753m.m18652e(absolutePath, "context.getExternalFiles…compress\")!!.absolutePath");
                        String str7 = absolutePath + File.separator + "VID_" + new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + str6.hashCode() + ".mp4";
                        C0543c m2682b = C0543c.m2674b(340).m2682b();
                        C4753m.m18652e(m2682b, "atMost(340).build()");
                        switch (intValue5) {
                            case 0:
                                m2682b = C0543c.m2674b(720).m2682b();
                                str2 = "atMost(720).build()";
                                break;
                            case 1:
                                m2682b = C0543c.m2674b(360).m2682b();
                                str2 = "atMost(360).build()";
                                break;
                            case 2:
                                m2682b = C0543c.m2674b(640).m2682b();
                                str2 = "atMost(640).build()";
                                break;
                            case 3:
                                C0543c.b m2681a = new C0543c.b().m2684d(3.0f).m2681a(921600 * 4);
                                C4753m.m18650c(num3);
                                m2682b = m2681a.m2683c(num3.intValue()).m2682b();
                                str2 = "Builder()\n              …                 .build()";
                                break;
                            case 4:
                                m2682b = C0543c.m2675c(480, 640).m2682b();
                                str2 = "atMost(480, 640).build()";
                                break;
                            case 5:
                                m2682b = C0543c.m2675c(540, 960).m2682b();
                                str2 = "atMost(540, 960).build()";
                                break;
                            case 6:
                                m2682b = C0543c.m2675c(720, PlatformPlugin.DEFAULT_SYSTEM_UI).m2682b();
                                str2 = "atMost(720, 1280).build()";
                                break;
                            case 7:
                                m2682b = C0543c.m2675c(1080, 1920).m2682b();
                                str2 = "atMost(1080, 1920).build()";
                                break;
                        }
                        C4753m.m18652e(m2682b, str2);
                        if (booleanValue2) {
                            c0544d = C0541a.m2657b().m2662b(-1).m2664d(-1).m2661a();
                            C4753m.m18652e(c0544d, "{\n                    va…build()\n                }");
                        } else {
                            c0544d = new C0544d();
                        }
                        if (num == null && num2 == null) {
                            c0090e = new C0091f(context, Uri.parse(str6));
                            str = str6;
                            c0543c = m2682b;
                        } else {
                            C0091f c0091f = new C0091f(context, Uri.parse(str6));
                            c0543c = m2682b;
                            long intValue6 = (num != null ? num.intValue() : 0) * 1000000;
                            int intValue7 = num2 != null ? num2.intValue() : 0;
                            str = str6;
                            c0090e = new C0090e(c0091f, intValue6, 1000000 * intValue7);
                        }
                        C4753m.m18650c(str7);
                        this.f2643l = C5000a.m19571d(str7).m19596a(c0090e).m19599d(c0544d).m19601f(c0543c).m19600e(new b(methodChannel, this, context, str7, result, booleanValue, str)).m19602g();
                        return;
                    }
                    break;
                case 2130520060:
                    if (str3.equals("getMediaInfo")) {
                        String str8 = (String) methodCall.argument("path");
                        C0606b c0606b = new C0606b(this.f2644m);
                        C4753m.m18650c(str8);
                        obj = c0606b.m3010d(context, str8).toString();
                        result2.success(obj);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
