package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5385l0;
import p321w7.C5391n0;
import p321w7.C5394o0;
import p321w7.C5403r0;
import p321w7.InterfaceC5352d;
import p321w7.InterfaceC5372i;
import p321w7.InterfaceC5412u0;

/* loaded from: classes2.dex */
public class FlutterFirebaseAuthPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_auth";
    public static final HashMap<Integer, AbstractC5368h> authCredentials = new HashMap<>();
    private Activity activity;
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<EventChannel, EventChannel.StreamHandler> streamHandlers = new HashMap();
    private final FlutterFirebaseAuthUser firebaseAuthUser = new FlutterFirebaseAuthUser();
    private final FlutterFirebaseMultiFactor firebaseMultiFactor = new FlutterFirebaseMultiFactor();
    private final FlutterFirebaseTotpMultiFactor firebaseTotpMultiFactor = new FlutterFirebaseTotpMultiFactor();
    private final FlutterFirebaseTotpSecret firebaseTotpSecret = new FlutterFirebaseTotpSecret();

    private Activity getActivity() {
        return this.activity;
    }

    public static FirebaseAuth getAuthFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C3767g.m14335p(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            firebaseAuth.m5263x(authPigeonFirebaseApp.getTenantId());
        }
        String str = FlutterFirebaseCorePlugin.customAuthDomain.get(authPigeonFirebaseApp.getAppName());
        if (str != null) {
            firebaseAuth.m5259v(str);
        }
        return firebaseAuth;
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        this.channel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.setup(binaryMessenger, this);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.setup(binaryMessenger, this.firebaseAuthUser);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.setup(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.setup(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.setup(binaryMessenger, this.firebaseTotpMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.setup(binaryMessenger, this.firebaseTotpSecret);
        this.messenger = binaryMessenger;
    }

    public static /* synthetic */ void lambda$applyActionCode$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$checkActionCode$1(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseActionCodeResult((InterfaceC5352d) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$confirmPasswordReset$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$createUserWithEmailAndPassword$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$didReinitializeFirebaseCore$17(TaskCompletionSource taskCompletionSource) {
        try {
            removeEventListeners();
            authCredentials.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$fetchSignInMethodsForEmail$10(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(((InterfaceC5412u0) task.getResult()).mo21555a());
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$16(C3767g c3767g, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c3767g);
            AbstractC5341a0 m5238j = firebaseAuth.m5238j();
            String m5244m = firebaseAuth.m5244m();
            GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser = m5238j == null ? null : PigeonParser.parseFirebaseUser(m5238j);
            if (m5244m != null) {
                hashMap.put("APP_LANGUAGE_CODE", m5244m);
            }
            if (parseFirebaseUser != null) {
                hashMap.put("APP_CURRENT_USER", parseFirebaseUser.toList());
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$sendPasswordResetEmail$11(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$sendPasswordResetEmail$12(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$sendSignInLinkToEmail$13(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInAnonymously$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithCredential$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithCustomToken$6(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithEmailAndPassword$7(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithEmailLink$8(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithProvider$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$verifyPasswordResetCode$14(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success((String) task.getResult());
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$verifyPhoneNumber$15(C5394o0 c5394o0) {
        authCredentials.put(Integer.valueOf(c5394o0.hashCode()), c5394o0);
    }

    private void removeEventListeners() {
        for (EventChannel eventChannel : this.streamHandlers.keySet()) {
            EventChannel.StreamHandler streamHandler = this.streamHandlers.get(eventChannel);
            if (streamHandler != null) {
                streamHandler.onCancel(null);
            }
            eventChannel.setStreamHandler(null);
        }
        this.streamHandlers.clear();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void applyActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5230d(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.b
            public /* synthetic */ C2868b() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$applyActionCode$0(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void checkActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5231e(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.m
            public /* synthetic */ C2912m() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$checkActionCode$1(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void confirmPasswordReset(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5232f(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.k
            public /* synthetic */ C2904k() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$confirmPasswordReset$2(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void createUserWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5233g(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.s
            public /* synthetic */ C2934s() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$createUserWithEmailAndPassword$3(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.i

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10720i;

            public /* synthetic */ RunnableC2896i(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthPlugin.this.lambda$didReinitializeFirebaseCore$17(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void fetchSignInMethodsForEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<List<String>> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5235h(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.d
            public /* synthetic */ C2876d() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$fetchSignInMethodsForEmail$10(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C3767g c3767g) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.j

            /* renamed from: i */
            public final /* synthetic */ TaskCompletionSource f10725i;

            public /* synthetic */ RunnableC2900j(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthPlugin.lambda$getPluginConstantsForFirebaseApp$16(C3767g.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.setup(this.messenger, null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerAuthStateListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            AuthStateChannelStreamHandler authStateChannelStreamHandler = new AuthStateChannelStreamHandler(authFromPigeon);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + authFromPigeon.m5236i().m14350q();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            eventChannel.setStreamHandler(authStateChannelStreamHandler);
            this.streamHandlers.put(eventChannel, authStateChannelStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerIdTokenListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            IdTokenChannelStreamHandler idTokenChannelStreamHandler = new IdTokenChannelStreamHandler(authFromPigeon);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + authFromPigeon.m5236i().m14350q();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            eventChannel.setStreamHandler(idTokenChannelStreamHandler);
            this.streamHandlers.put(eventChannel, idTokenChannelStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void revokeTokenWithAuthorizationCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendPasswordResetEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        Task<Void> m5255t;
        OnCompleteListener<Void> c2884f;
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        if (pigeonActionCodeSettings == null) {
            m5255t = authFromPigeon.m5254s(str);
            c2884f = new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.t
                public /* synthetic */ C2937t() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$11(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            };
        } else {
            m5255t = authFromPigeon.m5255t(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings));
            c2884f = new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.f
                public /* synthetic */ C2884f() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$12(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            };
        }
        m5255t.addOnCompleteListener(c2884f);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendSignInLinkToEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5257u(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.q
            public /* synthetic */ C2928q() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$sendSignInLinkToEmail$13(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void setLanguageCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            if (str == null) {
                authFromPigeon.m5203F();
            } else {
                authFromPigeon.m5261w(str);
            }
            result.success(authFromPigeon.m5244m());
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void setSettings(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            authFromPigeon.m5242l().mo21560b(pigeonFirebaseAuthSettings.getAppVerificationDisabledForTesting().booleanValue());
            if (pigeonFirebaseAuthSettings.getForceRecaptchaFlow() != null) {
                authFromPigeon.m5242l().mo21559a(pigeonFirebaseAuthSettings.getForceRecaptchaFlow().booleanValue());
            }
            if (pigeonFirebaseAuthSettings.getPhoneNumber() != null && pigeonFirebaseAuthSettings.getSmsCode() != null) {
                authFromPigeon.m5242l().mo21561c(pigeonFirebaseAuthSettings.getPhoneNumber(), pigeonFirebaseAuthSettings.getSmsCode());
            }
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInAnonymously(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5264y().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.o
            public /* synthetic */ C2920o() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInAnonymously$4(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        AbstractC5368h credential = PigeonParser.getCredential(map);
        if (credential == null) {
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        authFromPigeon.m5266z(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.p
            public /* synthetic */ C2924p() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithCredential$5(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCustomToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5195A(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.e
            public /* synthetic */ C2880e() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithCustomToken$6(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5197B(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.g
            public /* synthetic */ C2888g() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailAndPassword$7(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailLink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5198C(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.c
            public /* synthetic */ C2872c() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailLink$8(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        C5391n0.a m21531d = C5391n0.m21531d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            m21531d.m21536c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            m21531d.m21534a(pigeonSignInProvider.getCustomParameters());
        }
        authFromPigeon.m5201E(getActivity(), m21531d.m21535b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.n
            public /* synthetic */ C2916n() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithProvider$9(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signOut(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAuthFromPigeon(authPigeonFirebaseApp).m5200D();
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void useEmulator(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Long l10, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAuthFromPigeon(authPigeonFirebaseApp).m5204G(str, l10.intValue());
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPasswordResetCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<String> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).m5206H(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.l
            public /* synthetic */ C2908l() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$verifyPasswordResetCode$14(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            C5403r0 c5403r0 = null;
            AbstractC5385l0 abstractC5385l0 = pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId() != null ? FlutterFirebaseMultiFactor.multiFactorSessionMap.get(pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId()) : null;
            String multiFactorInfoId = pigeonVerifyPhoneNumberRequest.getMultiFactorInfoId();
            if (multiFactorInfoId != null) {
                Iterator<String> it = FlutterFirebaseMultiFactor.multiFactorResolverMap.keySet().iterator();
                while (it.hasNext()) {
                    Iterator<AbstractC5377j0> it2 = FlutterFirebaseMultiFactor.multiFactorResolverMap.get(it.next()).mo21520J().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AbstractC5377j0 next = it2.next();
                            if (next.mo21515b().equals(multiFactorInfoId) && (next instanceof C5403r0)) {
                                c5403r0 = (C5403r0) next;
                                break;
                            }
                        }
                    }
                }
            }
            PhoneNumberVerificationStreamHandler phoneNumberVerificationStreamHandler = new PhoneNumberVerificationStreamHandler(getActivity(), authPigeonFirebaseApp, pigeonVerifyPhoneNumberRequest, abstractC5385l0, c5403r0, C2892h.f10715a);
            eventChannel.setStreamHandler(phoneNumberVerificationStreamHandler);
            this.streamHandlers.put(eventChannel, phoneNumberVerificationStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }
}
