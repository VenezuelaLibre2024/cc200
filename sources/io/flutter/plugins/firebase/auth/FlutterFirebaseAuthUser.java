package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.C5349c0;
import p321w7.C5350c1;
import p321w7.C5391n0;
import p321w7.C5394o0;
import p321w7.InterfaceC5372i;

/* loaded from: classes2.dex */
public class FlutterFirebaseAuthUser implements GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi {
    private Activity activity;

    public static AbstractC5341a0 getCurrentUserFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C3767g.m14335p(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            firebaseAuth.m5263x(authPigeonFirebaseApp.getTenantId());
        }
        return firebaseAuth.m5238j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result result, Boolean bool) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        try {
            result.success(PigeonParser.parseTokenResult((C5349c0) Tasks.await(currentUserFromPigeon.m21409J(bool.booleanValue()))));
        } catch (Exception e10) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reload$6(GeneratedAndroidFirebaseAuth.Result result, AbstractC5341a0 abstractC5341a0, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(abstractC5341a0));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((InterfaceC5372i) task.getResult()));
        } else {
            Exception exception = task.getException();
            result.error(exception.getMessage().contains("User was not linked to an account with the given provider.") ? FlutterFirebaseAuthPluginException.noSuchProvider() : FlutterFirebaseAuthPluginException.parserExceptionToFlutter(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result result, AbstractC5341a0 abstractC5341a0, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(abstractC5341a0));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$11(final AbstractC5341a0 abstractC5341a0, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            abstractC5341a0.m21417R().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.x
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result.this, abstractC5341a0, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result result, AbstractC5341a0 abstractC5341a0, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(abstractC5341a0));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$13(final AbstractC5341a0 abstractC5341a0, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            abstractC5341a0.m21417R().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.v
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result.this, abstractC5341a0, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result result, AbstractC5341a0 abstractC5341a0, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(abstractC5341a0));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$15(final AbstractC5341a0 abstractC5341a0, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            abstractC5341a0.m21417R().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.w
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result.this, abstractC5341a0, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result result, AbstractC5341a0 abstractC5341a0, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(abstractC5341a0));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$17(final AbstractC5341a0 abstractC5341a0, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            abstractC5341a0.m21417R().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result.this, abstractC5341a0, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void delete(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.m21408I().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.h0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$delete$0(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void getIdToken(final GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final Boolean bool, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.e0
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthUser.lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.this, result, bool);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        AbstractC5368h credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.m21415P(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.f0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        C5391n0.a m21531d = C5391n0.m21531d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            m21531d.m21536c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            m21531d.m21534a(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.m21420U(this.activity, m21531d.m21535b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.i0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        AbstractC5368h credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.m21416Q(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        C5391n0.a m21531d = C5391n0.m21531d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            m21531d.m21536c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            m21531d.m21534a(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.m21421V(this.activity, m21531d.m21535b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.l0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reload(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.m21417R().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.z
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$reload$6(GeneratedAndroidFirebaseAuth.Result.this, currentUserFromPigeon, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void sendEmailVerification(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.m21418S().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.k0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } else {
            currentUserFromPigeon.m21419T(PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.u
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void unlink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.m21422W(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.m0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.m21423X(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.b0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updateEmail$11(AbstractC5341a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.m21424Y(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updatePassword$13(AbstractC5341a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        C5394o0 c5394o0 = (C5394o0) PigeonParser.getCredential(map);
        if (c5394o0 == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.m21425Z(c5394o0).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updatePhoneNumber$15(AbstractC5341a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateProfile(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonUserProfile pigeonUserProfile, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        C5350c1.a aVar = new C5350c1.a();
        if (pigeonUserProfile.getDisplayNameChanged().booleanValue()) {
            aVar.m21457b(pigeonUserProfile.getDisplayName());
        }
        if (pigeonUserProfile.getPhotoUrlChanged().booleanValue()) {
            aVar.m21458c(pigeonUserProfile.getPhotoUrl() != null ? Uri.parse(pigeonUserProfile.getPhotoUrl()) : null);
        }
        currentUserFromPigeon.m21426a0(aVar.m21456a()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.d0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$updateProfile$17(AbstractC5341a0.this, result, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void verifyBeforeUpdateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        AbstractC5341a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.m21428b0(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } else {
            currentUserFromPigeon.m21429c0(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.n0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }
}
