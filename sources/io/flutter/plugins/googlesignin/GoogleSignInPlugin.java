package io.flutter.plugins.googlesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.C1162a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.googlesignin.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p008a6.C0060b;
import p079f6.C1842b;
import p109h7.C2425h;
import p109h7.C2437t;
import p277t5.C4696e;

/* loaded from: classes2.dex */
public class GoogleSignInPlugin implements FlutterPlugin, ActivityAware {
    private ActivityPluginBinding activityPluginBinding;
    private Delegate delegate;
    private BinaryMessenger messenger;

    /* renamed from: io.flutter.plugins.googlesignin.GoogleSignInPlugin$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C30851 {
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType;

        static {
            int[] iArr = new int[Messages.SignInType.values().length];
            $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType = iArr;
            try {
                iArr[Messages.SignInType.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType[Messages.SignInType.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Delegate implements IDelegate, PluginRegistry.ActivityResultListener, Messages.GoogleSignInApi {
        private static final String DEFAULT_GAMES_SIGN_IN = "SignInOption.games";
        private static final String DEFAULT_SIGN_IN = "SignInOption.standard";
        private static final String ERROR_FAILURE_TO_RECOVER_AUTH = "failed_to_recover_auth";
        private static final String ERROR_REASON_EXCEPTION = "exception";
        private static final String ERROR_REASON_NETWORK_ERROR = "network_error";
        private static final String ERROR_REASON_SIGN_IN_CANCELED = "sign_in_canceled";
        private static final String ERROR_REASON_SIGN_IN_FAILED = "sign_in_failed";
        private static final String ERROR_REASON_SIGN_IN_REQUIRED = "sign_in_required";
        private static final String ERROR_REASON_STATUS = "status";
        private static final String ERROR_USER_RECOVERABLE_AUTH = "user_recoverable_auth";
        private static final int REQUEST_CODE_RECOVER_AUTH = 53294;
        public static final int REQUEST_CODE_REQUEST_SCOPE = 53295;
        private static final int REQUEST_CODE_SIGNIN = 53293;
        private Activity activity;
        private final BackgroundTaskRunner backgroundTaskRunner = new BackgroundTaskRunner(1);
        private final Context context;
        private final GoogleSignInWrapper googleSignInWrapper;
        private PendingOperation pendingOperation;
        private PluginRegistry.Registrar registrar;
        private List<String> requestedScopes;
        private C0060b signInClient;

        /* renamed from: io.flutter.plugins.googlesignin.GoogleSignInPlugin$Delegate$1 */
        /* loaded from: classes2.dex */
        public class C30861 extends ErrorConvertingMethodChannelResult<Boolean> {
            public C30861(MethodChannel.Result result) {
                super(result);
            }

            @Override // io.flutter.plugins.googlesignin.Messages.Result
            public void success(Boolean bool) {
                this.result.success(bool);
            }
        }

        /* renamed from: io.flutter.plugins.googlesignin.GoogleSignInPlugin$Delegate$2 */
        /* loaded from: classes2.dex */
        public class C30872 extends ErrorConvertingMethodChannelResult<String> {
            public C30872(MethodChannel.Result result) {
                super(result);
            }

            @Override // io.flutter.plugins.googlesignin.Messages.Result
            public void success(String str) {
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.ACCESS_TOKEN, str);
                this.result.success(hashMap);
            }
        }

        /* loaded from: classes2.dex */
        public static class PendingOperation {
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public final Messages.Result<Boolean> boolResult;
            public final Object data;
            public final String method;
            public final Messages.Result<String> stringResult;
            public final Messages.Result<Messages.UserData> userDataResult;
            public final Messages.Result<Void> voidResult;

            public PendingOperation(String str, Messages.Result<Messages.UserData> result, Messages.Result<Void> result2, Messages.Result<Boolean> result3, Messages.Result<String> result4, Object obj) {
                this.method = str;
                this.userDataResult = result;
                this.voidResult = result2;
                this.boolResult = result3;
                this.stringResult = result4;
                this.data = obj;
            }
        }

        public Delegate(Context context, GoogleSignInWrapper googleSignInWrapper) {
            this.context = context;
            this.googleSignInWrapper = googleSignInWrapper;
        }

        private void checkAndSetPendingAccessTokenOperation(String str, Messages.Result<String> result, Object obj) {
            checkAndSetPendingStringOperation(str, result, obj);
        }

        private void checkAndSetPendingBoolOperation(String str, Messages.Result<Boolean> result) {
            checkAndSetPendingOperation(str, null, null, result, null, null);
        }

        private void checkAndSetPendingOperation(String str, Messages.Result<Messages.UserData> result, Messages.Result<Void> result2, Messages.Result<Boolean> result3, Messages.Result<String> result4, Object obj) {
            if (this.pendingOperation == null) {
                this.pendingOperation = new PendingOperation(str, result, result2, result3, result4, obj);
                return;
            }
            throw new IllegalStateException("Concurrent operations detected: " + this.pendingOperation.method + ", " + str);
        }

        private void checkAndSetPendingSignInOperation(String str, Messages.Result<Messages.UserData> result) {
            checkAndSetPendingOperation(str, result, null, null, null, null);
        }

        private void checkAndSetPendingStringOperation(String str, Messages.Result<String> result, Object obj) {
            checkAndSetPendingOperation(str, null, null, null, result, obj);
        }

        private void checkAndSetPendingVoidOperation(String str, Messages.Result<Void> result) {
            checkAndSetPendingOperation(str, null, result, null, null, null);
        }

        private String errorCodeForStatus(int i10) {
            return i10 != 4 ? i10 != 7 ? i10 != 12501 ? ERROR_REASON_SIGN_IN_FAILED : ERROR_REASON_SIGN_IN_CANCELED : ERROR_REASON_NETWORK_ERROR : ERROR_REASON_SIGN_IN_REQUIRED;
        }

        private void finishWithBoolean(Boolean bool) {
            Messages.Result<Boolean> result = this.pendingOperation.boolResult;
            Objects.requireNonNull(result);
            result.success(bool);
            this.pendingOperation = null;
        }

        private void finishWithError(String str, String str2) {
            PendingOperation pendingOperation = this.pendingOperation;
            Messages.Result result = pendingOperation.userDataResult;
            if (result == null && (result = pendingOperation.boolResult) == null && (result = pendingOperation.stringResult) == null) {
                result = pendingOperation.voidResult;
            }
            Objects.requireNonNull(result);
            result.error(new Messages.FlutterError(str, str2, null));
            this.pendingOperation = null;
        }

        private void finishWithSuccess() {
            Messages.Result<Void> result = this.pendingOperation.voidResult;
            Objects.requireNonNull(result);
            result.success(null);
            this.pendingOperation = null;
        }

        private void finishWithUserData(Messages.UserData userData) {
            Messages.Result<Messages.UserData> result = this.pendingOperation.userDataResult;
            Objects.requireNonNull(result);
            result.success(userData);
            this.pendingOperation = null;
        }

        public /* synthetic */ Void lambda$clearAuthCache$2(String str) {
            C4696e.m18502a(this.context, str);
            return null;
        }

        public static /* synthetic */ void lambda$clearAuthCache$3(Messages.Result result, Future future) {
            try {
                result.success((Void) future.get());
            } catch (InterruptedException e10) {
                result.error(new Messages.FlutterError("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                result.error(new Messages.FlutterError("exception", cause == null ? null : cause.getMessage(), null));
            }
        }

        public /* synthetic */ void lambda$disconnect$1(Task task) {
            if (task.isSuccessful()) {
                finishWithSuccess();
            } else {
                finishWithError(ERROR_REASON_STATUS, "Failed to disconnect.");
            }
        }

        public /* synthetic */ String lambda$getAccessToken$4(String str) {
            return C4696e.m18503b(this.context, new Account(str, "com.google"), "oauth2:" + C2425h.m9674f(' ').m9678d(this.requestedScopes));
        }

        public /* synthetic */ void lambda$getAccessToken$5(Messages.Result result, Boolean bool, String str, Future future) {
            Messages.FlutterError flutterError;
            try {
                result.success((String) future.get());
            } catch (InterruptedException e10) {
                result.error(new Messages.FlutterError("exception", e10.getMessage(), null));
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                if (!(e11.getCause() instanceof UserRecoverableAuthException)) {
                    Throwable cause = e11.getCause();
                    result.error(new Messages.FlutterError("exception", cause == null ? null : cause.getMessage(), null));
                    return;
                }
                if (bool.booleanValue() && this.pendingOperation == null) {
                    Activity activity = getActivity();
                    if (activity != null) {
                        checkAndSetPendingAccessTokenOperation("getTokens", result, str);
                        activity.startActivityForResult(((UserRecoverableAuthException) e11.getCause()).m4892a(), REQUEST_CODE_RECOVER_AUTH);
                        return;
                    } else {
                        flutterError = new Messages.FlutterError(ERROR_USER_RECOVERABLE_AUTH, "Cannot recover auth because app is not in foreground. " + e11.getLocalizedMessage(), null);
                    }
                } else {
                    flutterError = new Messages.FlutterError(ERROR_USER_RECOVERABLE_AUTH, e11.getLocalizedMessage(), null);
                }
                result.error(flutterError);
            }
        }

        public /* synthetic */ void lambda$signOut$0(Task task) {
            if (task.isSuccessful()) {
                finishWithSuccess();
            } else {
                finishWithError(ERROR_REASON_STATUS, "Failed to signout.");
            }
        }

        private void onSignInAccount(GoogleSignInAccount googleSignInAccount) {
            Messages.UserData.Builder displayName = new Messages.UserData.Builder().setEmail(googleSignInAccount.m4924C()).setId(googleSignInAccount.m4928L()).setIdToken(googleSignInAccount.m4929M()).setServerAuthCode(googleSignInAccount.m4931O()).setDisplayName(googleSignInAccount.m4936s());
            if (googleSignInAccount.m4935e() != null) {
                displayName.setPhotoUrl(googleSignInAccount.m4935e().toString());
            }
            finishWithUserData(displayName.build());
        }

        public void onSignInResult(Task<GoogleSignInAccount> task) {
            String errorCodeForStatus;
            String exc;
            try {
                onSignInAccount(task.getResult(C1842b.class));
            } catch (RuntimeExecutionException e10) {
                exc = e10.toString();
                errorCodeForStatus = "exception";
                finishWithError(errorCodeForStatus, exc);
            } catch (C1842b e11) {
                errorCodeForStatus = errorCodeForStatus(e11.getStatusCode());
                exc = e11.toString();
                finishWithError(errorCodeForStatus, exc);
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void clearAuthCache(MethodChannel.Result result, String str) {
            clearAuthCache(str, new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void clearAuthCache(String str, Messages.Result<Void> result) {
            this.backgroundTaskRunner.runInBackground(new Callable() { // from class: io.flutter.plugins.googlesignin.i

                /* renamed from: b */
                public final /* synthetic */ String f10949b;

                public /* synthetic */ CallableC3104i(String str2) {
                    r2 = str2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void lambda$clearAuthCache$2;
                    lambda$clearAuthCache$2 = GoogleSignInPlugin.Delegate.this.lambda$clearAuthCache$2(r2);
                    return lambda$clearAuthCache$2;
                }
            }, new BackgroundTaskRunner.Callback() { // from class: io.flutter.plugins.googlesignin.g
                public /* synthetic */ C3102g() {
                }

                @Override // io.flutter.plugins.googlesignin.BackgroundTaskRunner.Callback
                public final void run(Future future) {
                    GoogleSignInPlugin.Delegate.lambda$clearAuthCache$3(Messages.Result.this, future);
                }
            });
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void disconnect(MethodChannel.Result result) {
            signOut(new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void disconnect(Messages.Result<Void> result) {
            checkAndSetPendingVoidOperation("disconnect", result);
            this.signInClient.m296c().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.googlesignin.c
                public /* synthetic */ C3098c() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    GoogleSignInPlugin.Delegate.this.lambda$disconnect$1(task);
                }
            });
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void getAccessToken(String str, Boolean bool, Messages.Result<String> result) {
            this.backgroundTaskRunner.runInBackground(new Callable() { // from class: io.flutter.plugins.googlesignin.h

                /* renamed from: b */
                public final /* synthetic */ String f10947b;

                public /* synthetic */ CallableC3103h(String str2) {
                    r2 = str2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String lambda$getAccessToken$4;
                    lambda$getAccessToken$4 = GoogleSignInPlugin.Delegate.this.lambda$getAccessToken$4(r2);
                    return lambda$getAccessToken$4;
                }
            }, new BackgroundTaskRunner.Callback() { // from class: io.flutter.plugins.googlesignin.f

                /* renamed from: b */
                public final /* synthetic */ Messages.Result f10942b;

                /* renamed from: c */
                public final /* synthetic */ Boolean f10943c;

                /* renamed from: d */
                public final /* synthetic */ String f10944d;

                public /* synthetic */ C3101f(Messages.Result result2, Boolean bool2, String str2) {
                    r2 = result2;
                    r3 = bool2;
                    r4 = str2;
                }

                @Override // io.flutter.plugins.googlesignin.BackgroundTaskRunner.Callback
                public final void run(Future future) {
                    GoogleSignInPlugin.Delegate.this.lambda$getAccessToken$5(r2, r3, r4, future);
                }
            });
        }

        public Activity getActivity() {
            PluginRegistry.Registrar registrar = this.registrar;
            return registrar != null ? registrar.activity() : this.activity;
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void getTokens(MethodChannel.Result result, String str, boolean z10) {
            getAccessToken(str, Boolean.valueOf(z10), new ErrorConvertingMethodChannelResult<String>(result) { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.2
                public C30872(MethodChannel.Result result2) {
                    super(result2);
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(String str2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.ACCESS_TOKEN, str2);
                    this.result.success(hashMap);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            r6 = io.flutter.plugins.googlesignin.Messages.SignInType.STANDARD;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            throw new java.lang.IllegalStateException("Unknown signInOption");
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r0 != 1) goto L44;
         */
        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void init(io.flutter.plugin.common.MethodChannel.Result r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            /*
                r4 = this;
                r0 = -1
                int r1 = r6.hashCode()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r2 = 849126666(0x329ca50a, float:1.8235841E-8)
                r3 = 1
                if (r1 == r2) goto L1b
                r2 = 2056100820(0x7a8d9bd4, float:3.676372E35)
                if (r1 == r2) goto L11
                goto L24
            L11:
                java.lang.String r1 = "SignInOption.standard"
                boolean r6 = r6.equals(r1)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                if (r6 == 0) goto L24
                r0 = r3
                goto L24
            L1b:
                java.lang.String r1 = "SignInOption.games"
                boolean r6 = r6.equals(r1)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                if (r6 == 0) goto L24
                r0 = 0
            L24:
                if (r0 == 0) goto L33
                if (r0 != r3) goto L2b
                io.flutter.plugins.googlesignin.Messages$SignInType r6 = io.flutter.plugins.googlesignin.Messages.SignInType.STANDARD     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                goto L35
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                java.lang.String r7 = "Unknown signInOption"
                r6.<init>(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                throw r6     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
            L33:
                io.flutter.plugins.googlesignin.Messages$SignInType r6 = io.flutter.plugins.googlesignin.Messages.SignInType.GAMES     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
            L35:
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r0 = new io.flutter.plugins.googlesignin.Messages$InitParams$Builder     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r0.<init>()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r0.setSignInType(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setScopes(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setHostedDomain(r8)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setClientId(r9)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setServerClientId(r10)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams$Builder r6 = r6.setForceCodeForRefreshToken(r7)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                io.flutter.plugins.googlesignin.Messages$InitParams r6 = r6.build()     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r4.init(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                r6 = 0
                r5.success(r6)     // Catch: io.flutter.plugins.googlesignin.Messages.FlutterError -> L62
                goto L6e
            L62:
                r6 = move-exception
                java.lang.String r7 = r6.code
                java.lang.String r8 = r6.getMessage()
                java.lang.Object r6 = r6.details
                r5.error(r7, r8, r6)
            L6e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.init(io.flutter.plugin.common.MethodChannel$Result, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean):void");
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void init(Messages.InitParams initParams) {
            GoogleSignInOptions.C1161a c1161a;
            int identifier;
            try {
                int i10 = C30851.$SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType[initParams.getSignInType().ordinal()];
                if (i10 == 1) {
                    c1161a = new GoogleSignInOptions.C1161a(GoogleSignInOptions.f4427t);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("Unknown signInOption");
                    }
                    c1161a = new GoogleSignInOptions.C1161a(GoogleSignInOptions.f4426s).m4960b();
                }
                String serverClientId = initParams.getServerClientId();
                if (!C2437t.m9729b(initParams.getClientId()) && C2437t.m9729b(serverClientId)) {
                    Log.w("google_sign_in", "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning.");
                    serverClientId = initParams.getClientId();
                }
                if (C2437t.m9729b(serverClientId) && (identifier = this.context.getResources().getIdentifier("default_web_client_id", "string", this.context.getPackageName())) != 0) {
                    serverClientId = this.context.getString(identifier);
                }
                if (!C2437t.m9729b(serverClientId)) {
                    c1161a.m4962d(serverClientId);
                    c1161a.m4965g(serverClientId, initParams.getForceCodeForRefreshToken().booleanValue());
                }
                List<String> scopes = initParams.getScopes();
                this.requestedScopes = scopes;
                Iterator<String> it = scopes.iterator();
                while (it.hasNext()) {
                    c1161a.m4964f(new Scope(it.next()), new Scope[0]);
                }
                if (!C2437t.m9729b(initParams.getHostedDomain())) {
                    c1161a.m4967i(initParams.getHostedDomain());
                }
                this.signInClient = this.googleSignInWrapper.getClient(this.context, c1161a.m4959a());
            } catch (Exception e10) {
                throw new Messages.FlutterError("exception", e10.getMessage(), null);
            }
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public Boolean isSignedIn() {
            return Boolean.valueOf(C1162a.m4972b(this.context) != null);
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void isSignedIn(MethodChannel.Result result) {
            result.success(isSignedIn());
        }

        @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
        public boolean onActivityResult(int i10, int i11, Intent intent) {
            PendingOperation pendingOperation = this.pendingOperation;
            if (pendingOperation == null) {
                return false;
            }
            switch (i10) {
                case REQUEST_CODE_SIGNIN /* 53293 */:
                    if (intent != null) {
                        onSignInResult(C1162a.m4973c(intent));
                    } else {
                        finishWithError(ERROR_REASON_SIGN_IN_FAILED, "Signin failed");
                    }
                    return true;
                case REQUEST_CODE_RECOVER_AUTH /* 53294 */:
                    if (i11 == -1) {
                        Messages.Result<String> result = pendingOperation.stringResult;
                        Objects.requireNonNull(result);
                        Object obj = this.pendingOperation.data;
                        Objects.requireNonNull(obj);
                        this.pendingOperation = null;
                        getAccessToken((String) obj, Boolean.FALSE, result);
                    } else {
                        finishWithError(ERROR_FAILURE_TO_RECOVER_AUTH, "Failed attempt to recover authentication");
                    }
                    return true;
                case REQUEST_CODE_REQUEST_SCOPE /* 53295 */:
                    finishWithBoolean(Boolean.valueOf(i11 == -1));
                    return true;
                default:
                    return false;
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void requestScopes(MethodChannel.Result result, List<String> list) {
            requestScopes(list, new ErrorConvertingMethodChannelResult<Boolean>(result) { // from class: io.flutter.plugins.googlesignin.GoogleSignInPlugin.Delegate.1
                public C30861(MethodChannel.Result result2) {
                    super(result2);
                }

                @Override // io.flutter.plugins.googlesignin.Messages.Result
                public void success(Boolean bool) {
                    this.result.success(bool);
                }
            });
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void requestScopes(List<String> list, Messages.Result<Boolean> result) {
            checkAndSetPendingBoolOperation("requestScopes", result);
            GoogleSignInAccount lastSignedInAccount = this.googleSignInWrapper.getLastSignedInAccount(this.context);
            if (lastSignedInAccount == null) {
                finishWithError(ERROR_REASON_SIGN_IN_REQUIRED, "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Scope scope = new Scope(it.next());
                if (!this.googleSignInWrapper.hasPermissions(lastSignedInAccount, scope)) {
                    arrayList.add(scope);
                }
            }
            if (arrayList.isEmpty()) {
                finishWithBoolean(Boolean.TRUE);
            } else {
                this.googleSignInWrapper.requestPermissions(getActivity(), REQUEST_CODE_REQUEST_SCOPE, lastSignedInAccount, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        public void setActivity(Activity activity) {
            this.activity = activity;
        }

        public void setUpRegistrar(PluginRegistry.Registrar registrar) {
            this.registrar = registrar;
            registrar.addActivityResultListener(this);
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signIn(MethodChannel.Result result) {
            signIn(new UserDataMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void signIn(Messages.Result<Messages.UserData> result) {
            if (getActivity() == null) {
                throw new IllegalStateException("signIn needs a foreground activity");
            }
            checkAndSetPendingSignInOperation("signIn", result);
            getActivity().startActivityForResult(this.signInClient.m295b(), REQUEST_CODE_SIGNIN);
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signInSilently(MethodChannel.Result result) {
            signInSilently(new UserDataMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void signInSilently(Messages.Result<Messages.UserData> result) {
            checkAndSetPendingSignInOperation("signInSilently", result);
            Task<GoogleSignInAccount> m297d = this.signInClient.m297d();
            if (m297d.isComplete()) {
                onSignInResult(m297d);
            } else {
                m297d.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.googlesignin.e
                    public /* synthetic */ C3100e() {
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        GoogleSignInPlugin.Delegate.this.onSignInResult(task);
                    }
                });
            }
        }

        @Override // io.flutter.plugins.googlesignin.GoogleSignInPlugin.IDelegate
        public void signOut(MethodChannel.Result result) {
            signOut(new VoidMethodChannelResult(result));
        }

        @Override // io.flutter.plugins.googlesignin.Messages.GoogleSignInApi
        public void signOut(Messages.Result<Void> result) {
            checkAndSetPendingVoidOperation("signOut", result);
            this.signInClient.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.googlesignin.d
                public /* synthetic */ C3099d() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    GoogleSignInPlugin.Delegate.this.lambda$signOut$0(task);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ErrorConvertingMethodChannelResult<T> implements Messages.Result<T> {
        public final MethodChannel.Result result;

        public ErrorConvertingMethodChannelResult(MethodChannel.Result result) {
            this.result = result;
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void error(Throwable th) {
            if (!(th instanceof Messages.FlutterError)) {
                this.result.error(io.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION, th.getMessage(), null);
            } else {
                Messages.FlutterError flutterError = (Messages.FlutterError) th;
                this.result.error(flutterError.code, flutterError.getMessage(), flutterError.details);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface IDelegate {
        void clearAuthCache(MethodChannel.Result result, String str);

        void disconnect(MethodChannel.Result result);

        void getTokens(MethodChannel.Result result, String str, boolean z10);

        void init(MethodChannel.Result result, String str, List<String> list, String str2, String str3, String str4, boolean z10);

        void isSignedIn(MethodChannel.Result result);

        void requestScopes(MethodChannel.Result result, List<String> list);

        void signIn(MethodChannel.Result result);

        void signInSilently(MethodChannel.Result result);

        void signOut(MethodChannel.Result result);
    }

    /* loaded from: classes2.dex */
    public static class UserDataMethodChannelResult extends ErrorConvertingMethodChannelResult<Messages.UserData> {
        public UserDataMethodChannelResult(MethodChannel.Result result) {
            super(result);
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void success(Messages.UserData userData) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.EMAIL, userData.getEmail());
            hashMap.put("id", userData.getId());
            hashMap.put(Constants.ID_TOKEN, userData.getIdToken());
            hashMap.put(Constants.SERVER_AUTH_CODE, userData.getServerAuthCode());
            hashMap.put("displayName", userData.getDisplayName());
            if (userData.getPhotoUrl() != null) {
                hashMap.put("photoUrl", userData.getPhotoUrl());
            }
            this.result.success(hashMap);
        }
    }

    /* loaded from: classes2.dex */
    public static class VoidMethodChannelResult extends ErrorConvertingMethodChannelResult<Void> {
        public VoidMethodChannelResult(MethodChannel.Result result) {
            super(result);
        }

        @Override // io.flutter.plugins.googlesignin.Messages.Result
        public void success(Void r22) {
            this.result.success(null);
        }
    }

    private void attachToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activityPluginBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.delegate);
        this.delegate.setActivity(activityPluginBinding.getActivity());
    }

    private void dispose() {
        this.delegate = null;
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger != null) {
            Messages.GoogleSignInApi.setup(binaryMessenger, null);
            this.messenger = null;
        }
    }

    private void disposeActivity() {
        this.activityPluginBinding.removeActivityResultListener(this.delegate);
        this.delegate.setActivity(null);
        this.activityPluginBinding = null;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        GoogleSignInPlugin googleSignInPlugin = new GoogleSignInPlugin();
        googleSignInPlugin.initInstance(registrar.messenger(), registrar.context(), new GoogleSignInWrapper());
        googleSignInPlugin.setUpRegistrar(registrar);
    }

    public void initInstance(BinaryMessenger binaryMessenger, Context context, GoogleSignInWrapper googleSignInWrapper) {
        this.messenger = binaryMessenger;
        Delegate delegate = new Delegate(context, googleSignInWrapper);
        this.delegate = delegate;
        Messages.GoogleSignInApi.setup(binaryMessenger, delegate);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new GoogleSignInWrapper());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        disposeActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        dispose();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -902468670:
                if (str.equals("signIn")) {
                    c10 = 0;
                    break;
                }
                break;
            case -638267772:
                if (str.equals("signInSilently")) {
                    c10 = 1;
                    break;
                }
                break;
            case -481441621:
                if (str.equals("isSignedIn")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3237136:
                if (str.equals("init")) {
                    c10 = 3;
                    break;
                }
                break;
            case 24140525:
                if (str.equals("clearAuthCache")) {
                    c10 = 4;
                    break;
                }
                break;
            case 530405532:
                if (str.equals("disconnect")) {
                    c10 = 5;
                    break;
                }
                break;
            case 827828368:
                if (str.equals("getTokens")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1387660302:
                if (str.equals("requestScopes")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2088248401:
                if (str.equals("signOut")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.delegate.signIn(result);
                return;
            case 1:
                this.delegate.signInSilently(result);
                return;
            case 2:
                this.delegate.isSignedIn(result);
                return;
            case 3:
                String str2 = (String) methodCall.argument("signInOption");
                Objects.requireNonNull(str2);
                List<String> list = (List) methodCall.argument("scopes");
                Objects.requireNonNull(list);
                String str3 = (String) methodCall.argument("hostedDomain");
                String str4 = (String) methodCall.argument("clientId");
                String str5 = (String) methodCall.argument("serverClientId");
                Boolean bool = (Boolean) methodCall.argument("forceCodeForRefreshToken");
                Objects.requireNonNull(bool);
                this.delegate.init(result, str2, list, str3, str4, str5, bool.booleanValue());
                return;
            case 4:
                String str6 = (String) methodCall.argument("token");
                Objects.requireNonNull(str6);
                this.delegate.clearAuthCache(result, str6);
                return;
            case 5:
                this.delegate.disconnect(result);
                return;
            case 6:
                String str7 = (String) methodCall.argument(Constants.EMAIL);
                Objects.requireNonNull(str7);
                Boolean bool2 = (Boolean) methodCall.argument("shouldRecoverAuth");
                Objects.requireNonNull(bool2);
                this.delegate.getTokens(result, str7, bool2.booleanValue());
                return;
            case 7:
                List<String> list2 = (List) methodCall.argument("scopes");
                Objects.requireNonNull(list2);
                this.delegate.requestScopes(result, list2);
                return;
            case '\b':
                this.delegate.signOut(result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    public void setUpRegistrar(PluginRegistry.Registrar registrar) {
        this.delegate.setUpRegistrar(registrar);
    }
}
