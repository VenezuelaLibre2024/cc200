package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p321w7.C5415v0;
import p321w7.C5418w0;
import p321w7.InterfaceC5424y0;

/* loaded from: classes2.dex */
public class FlutterFirebaseTotpMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Map<String, InterfaceC5424y0> multiFactorSecret = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
            return;
        }
        InterfaceC5424y0 interfaceC5424y0 = (InterfaceC5424y0) task.getResult();
        multiFactorSecret.put(interfaceC5424y0.mo21580i(), interfaceC5424y0);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonTotpSecret.Builder().setCodeIntervalSeconds(Long.valueOf(interfaceC5424y0.mo21578g())).setCodeLength(Long.valueOf(interfaceC5424y0.mo21573b())).setSecretKey(interfaceC5424y0.mo21580i()).setHashingAlgorithm(interfaceC5424y0.mo21572a()).setEnrollmentCompletionDeadline(Long.valueOf(interfaceC5424y0.mo21577f())).build());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void generateSecret(String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> result) {
        C5418w0.m21562a(FlutterFirebaseMultiFactor.multiFactorSessionMap.get(str)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.t0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseTotpMultiFactor.lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForEnrollment(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        C5415v0 m21563b = C5418w0.m21563b(multiFactorSecret.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, m21563b);
        result.success(uuid);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForSignIn(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        C5415v0 m21564c = C5418w0.m21564c(str, str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, m21564c);
        result.success(uuid);
    }
}
