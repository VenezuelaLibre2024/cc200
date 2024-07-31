package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C1260b;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p082f9.C1885a;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5369h0;
import p321w7.AbstractC5373i0;
import p321w7.AbstractC5381k0;
import p321w7.AbstractC5385l0;
import p321w7.C5400q0;
import p321w7.InterfaceC5372i;

/* loaded from: classes2.dex */
public class FlutterFirebaseMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi, GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Map<String, Map<String, AbstractC5369h0>> multiFactorUserMap = new HashMap();
    public static final Map<String, AbstractC5385l0> multiFactorSessionMap = new HashMap();
    public static final Map<String, AbstractC5381k0> multiFactorResolverMap = new HashMap();
    public static final Map<String, AbstractC5373i0> multiFactorAssertionMap = new HashMap();

    public static /* synthetic */ void lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
            return;
        }
        AbstractC5385l0 abstractC5385l0 = (AbstractC5385l0) task.getResult();
        String uuid = UUID.randomUUID().toString();
        multiFactorSessionMap.put(uuid, abstractC5385l0);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.Builder().setId(uuid).build());
    }

    public static /* synthetic */ void lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$unenroll$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).mo21501a(C5400q0.m21549a(C1260b.m5291a(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())), str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.r0
                public /* synthetic */ C2932r0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (C1885a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).mo21501a(multiFactorAssertionMap.get(str), str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.p0
                public /* synthetic */ C2925p0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (C1885a e10) {
            result.error(e10);
        }
    }

    public AbstractC5369h0 getAppMultiFactor(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        AbstractC5341a0 currentUserFromPigeon = FlutterFirebaseAuthUser.getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            throw new C1885a("No user is signed in");
        }
        Map<String, Map<String, AbstractC5369h0>> map = multiFactorUserMap;
        if (map.get(authPigeonFirebaseApp.getAppName()) == null) {
            map.put(authPigeonFirebaseApp.getAppName(), new HashMap());
        }
        Map<String, AbstractC5369h0> map2 = map.get(authPigeonFirebaseApp.getAppName());
        if (map2.get(currentUserFromPigeon.mo21427b()) == null) {
            map2.put(currentUserFromPigeon.mo21427b(), currentUserFromPigeon.mo21411L());
        }
        return map2.get(currentUserFromPigeon.mo21427b());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> result) {
        try {
            result.success(PigeonParser.multiFactorInfoToPigeon(getAppMultiFactor(authPigeonFirebaseApp).mo21502b()));
        } catch (C1885a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).mo21503c().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.o0
                public /* synthetic */ C2921o0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (C1885a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi
    public void resolveSignIn(String str, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5381k0 abstractC5381k0 = multiFactorResolverMap.get(str);
        if (abstractC5381k0 == null) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(new Exception("Resolver not found")));
        } else {
            abstractC5381k0.mo21522L(pigeonPhoneMultiFactorAssertion != null ? C5400q0.m21549a(C1260b.m5291a(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())) : multiFactorAssertionMap.get(str2)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.q0
                public /* synthetic */ C2929q0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).mo21504d(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.s0
                public /* synthetic */ C2935s0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$unenroll$3(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (C1885a e10) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }
}
