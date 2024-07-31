package p131ic;

import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import p145jc.C3276b;
import p145jc.EnumC3277c;
import p160kc.InterfaceC3381a;

/* renamed from: ic.a */
/* loaded from: classes2.dex */
public class C2703a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: h */
    public MethodChannel f10575h;

    /* renamed from: i */
    public C3276b f10576i;

    /* renamed from: j */
    public InterfaceC3381a f10577j;

    /* renamed from: ic.a$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC3381a {
        public a() {
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: a */
        public void mo11025a() {
            System.out.println("record complete");
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: b */
        public void mo11026b() {
            C2703a.this.m11020c(15, "IO_EXCEPTION");
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: c */
        public void mo11027c() {
            C2703a.this.m11020c(5, "FILE NOT FOUNT");
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: d */
        public void mo11028d(EnumC3277c enumC3277c) {
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: e */
        public void mo11029e() {
            C2703a.this.m11020c(20, "RECORD_HAS_USED");
        }

        @Override // p160kc.InterfaceC3381a
        /* renamed from: f */
        public void mo11030f() {
            C2703a.this.m11020c(10, "mic permission error");
        }
    }

    /* renamed from: ic.a$b */
    /* loaded from: classes2.dex */
    public class b implements MethodChannel.Result {
        public b() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
        }
    }

    /* renamed from: b */
    public final void m11019b(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "record_mp3");
        this.f10575h = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f10577j = new a();
    }

    /* renamed from: c */
    public final void m11020c(int i10, String str) {
        Log.m11039d("RecordMp3", "error = " + str);
        this.f10575h.invokeMethod("onRecordError", Integer.valueOf(i10), new b());
    }

    /* renamed from: d */
    public final void m11021d() {
        C3276b c3276b = this.f10576i;
        if (c3276b != null) {
            c3276b.m11871r();
        }
    }

    /* renamed from: e */
    public final void m11022e() {
        C3276b c3276b = this.f10576i;
        if (c3276b != null) {
            c3276b.m11875v();
        }
    }

    /* renamed from: f */
    public final void m11023f(String str) {
        C3276b c3276b;
        Log.m11039d("RecordMp3Plugin", "record = " + str);
        File file = new File(str);
        C3276b c3276b2 = this.f10576i;
        if (c3276b2 != null) {
            c3276b2.m11867n();
            this.f10576i.m11876w(file);
            c3276b = this.f10576i;
        } else {
            c3276b = new C3276b(file, this.f10577j);
            this.f10576i = c3276b;
        }
        c3276b.m11879z();
    }

    /* renamed from: g */
    public final void m11024g() {
        C3276b c3276b = this.f10576i;
        if (c3276b != null) {
            c3276b.m11866A();
            this.f10576i = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m11019b(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f10575h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.f10575h = null;
        }
        C3276b c3276b = this.f10576i;
        if (c3276b != null) {
            c3276b.m11867n();
            this.f10576i = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -934426579:
                if (str.equals("resume")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m11022e();
                return;
            case 1:
                m11024g();
                return;
            case 2:
                m11021d();
                return;
            case 3:
                m11023f((String) methodCall.argument("path"));
                return;
            default:
                return;
        }
    }
}
