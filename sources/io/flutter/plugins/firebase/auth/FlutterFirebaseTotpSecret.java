package io.flutter.plugins.firebase.auth;

import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import p321w7.InterfaceC5424y0;

/* loaded from: classes2.dex */
public class FlutterFirebaseTotpSecret implements GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void generateQrCodeUrl(String str, String str2, String str3, GeneratedAndroidFirebaseAuth.Result<String> result) {
        InterfaceC5424y0 interfaceC5424y0 = FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str);
        result.success((str2 == null || str3 == null) ? interfaceC5424y0.mo21576e() : interfaceC5424y0.mo21575d(str2, str3));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void openInOtpApp(String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str).mo21579h(str2);
        result.success(null);
    }
}
