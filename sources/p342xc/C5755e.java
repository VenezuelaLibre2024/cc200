package p342xc;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: xc.e */
/* loaded from: classes2.dex */
public class C5755e implements MethodChannel.MethodCallHandler {

    /* renamed from: h */
    public final C5751a f21319h;

    public C5755e(C5751a c5751a) {
        this.f21319h = c5751a;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f21319h.m22874d());
        } else {
            result.notImplemented();
        }
    }
}
