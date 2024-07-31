package p326wc;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* renamed from: wc.a */
/* loaded from: classes2.dex */
public class C5476a implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public C5478c f20366h;

    public C5476a(C5478c c5478c) {
        this.f20366h = c5478c;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!"share".equals(methodCall.method)) {
            result.notImplemented();
        } else {
            if (!(methodCall.arguments instanceof Map)) {
                throw new IllegalArgumentException("Map argument expected");
            }
            this.f20366h.m21708d(methodCall);
            result.success(null);
        }
    }
}
