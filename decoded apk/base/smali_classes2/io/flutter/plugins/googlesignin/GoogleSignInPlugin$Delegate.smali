.class public Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$IDelegate;
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;
.implements Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlesignin/GoogleSignInPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Delegate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;
    }
.end annotation


# static fields
.field private static final DEFAULT_GAMES_SIGN_IN:Ljava/lang/String; = "SignInOption.games"

.field private static final DEFAULT_SIGN_IN:Ljava/lang/String; = "SignInOption.standard"

.field private static final ERROR_FAILURE_TO_RECOVER_AUTH:Ljava/lang/String; = "failed_to_recover_auth"

.field private static final ERROR_REASON_EXCEPTION:Ljava/lang/String; = "exception"

.field private static final ERROR_REASON_NETWORK_ERROR:Ljava/lang/String; = "network_error"

.field private static final ERROR_REASON_SIGN_IN_CANCELED:Ljava/lang/String; = "sign_in_canceled"

.field private static final ERROR_REASON_SIGN_IN_FAILED:Ljava/lang/String; = "sign_in_failed"

.field private static final ERROR_REASON_SIGN_IN_REQUIRED:Ljava/lang/String; = "sign_in_required"

.field private static final ERROR_REASON_STATUS:Ljava/lang/String; = "status"

.field private static final ERROR_USER_RECOVERABLE_AUTH:Ljava/lang/String; = "user_recoverable_auth"

.field private static final REQUEST_CODE_RECOVER_AUTH:I = 0xd02e

.field public static final REQUEST_CODE_REQUEST_SCOPE:I = 0xd02f

.field private static final REQUEST_CODE_SIGNIN:I = 0xd02d


# instance fields
.field private activity:Landroid/app/Activity;

.field private final backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

.field private final context:Landroid/content/Context;

.field private final googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

.field private pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

.field private registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;

.field private requestedScopes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private signInClient:La6/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;-><init>(I)V

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    return-void
.end method

.method private checkAndSetPendingAccessTokenOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingStringOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingBoolOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;-><init>(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    iput-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Concurrent operations detected: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object p4, p4, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->method:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingStringOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    return-void
.end method

.method private errorCodeForStatus(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x30d5

    if-eq p1, v0, :cond_0

    const-string p1, "sign_in_failed"

    return-object p1

    :cond_0
    const-string p1, "sign_in_canceled"

    return-object p1

    :cond_1
    const-string p1, "network_error"

    return-object p1

    :cond_2
    const-string p1, "sign_in_required"

    return-object p1
.end method

.method private finishWithBoolean(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->boolResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->userDataResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->boolResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->stringResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->voidResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    :goto_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lio/flutter/plugins/googlesignin/Messages$Result;

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    iput-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithSuccess()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->voidResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method private finishWithUserData(Lio/flutter/plugins/googlesignin/Messages$UserData;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object v0, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->userDataResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$disconnect$1(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$signOut$0(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private synthetic lambda$clearAuthCache$2(Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lt5/e;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private static synthetic lambda$clearAuthCache$3(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V
    .locals 3

    const-string v0, "exception"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Void;

    invoke-interface {p0, p1}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    new-instance v2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    if-nez p1, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {v2, v0, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, v2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method private synthetic lambda$disconnect$1(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithSuccess()V

    goto :goto_0

    :cond_0
    const-string p1, "status"

    const-string v0, "Failed to disconnect."

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$getAccessToken$4(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v0, Landroid/accounts/Account;

    const-string v1, "com.google"

    invoke-direct {v0, p1, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "oauth2:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-static {v1}, Lh7/h;->f(C)Lh7/h;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestedScopes:Ljava/util/List;

    invoke-virtual {v1, v2}, Lh7/h;->d(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-static {v1, v0, p1}, Lt5/e;->b(Landroid/content/Context;Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic lambda$getAccessToken$5(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V
    .locals 3

    const-string v0, "exception"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-interface {p1, p4}, Lio/flutter/plugins/googlesignin/Messages$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p2

    new-instance p3, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    invoke-virtual {p2}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, v0, p2, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :catch_1
    move-exception p4

    invoke-virtual {p4}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    if-eqz v2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v0, "user_recoverable_auth"

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot recover auth because app is not in foreground. "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/util/concurrent/ExecutionException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v0, p3, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1, p2}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_0
    const-string v0, "getTokens"

    invoke-direct {p0, v0, p1, p3}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingAccessTokenOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Object;)V

    invoke-virtual {p4}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a()Landroid/content/Intent;

    move-result-object p1

    const p3, 0xd02e

    invoke-virtual {p2, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2

    :cond_1
    new-instance p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    invoke-virtual {p4}, Ljava/util/concurrent/ExecutionException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, v0, p3, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p4}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    new-instance p3, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    if-nez p2, :cond_3

    move-object p2, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-direct {p3, v0, p2, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1, p3}, Lio/flutter/plugins/googlesignin/Messages$Result;->error(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method private synthetic lambda$signOut$0(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithSuccess()V

    goto :goto_0

    :cond_0
    const-string p1, "status"

    const-string v0, "Failed to signout."

    invoke-direct {p0, p1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static synthetic m(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$clearAuthCache$3(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$getAccessToken$4(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$clearAuthCache$2(Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private onSignInAccount(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 2

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    invoke-direct {v0}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setEmail(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->L()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->M()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setIdToken(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setServerAuthCode(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setDisplayName(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->e()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->e()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->setPhotoUrl(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;

    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugins/googlesignin/Messages$UserData$Builder;->build()Lio/flutter/plugins/googlesignin/Messages$UserData;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithUserData(Lio/flutter/plugins/googlesignin/Messages$UserData;)V

    return-void
.end method

.method private onSignInResult(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lf6/b;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInAccount(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    :try_end_0
    .catch Lf6/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "exception"

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lf6/b;->getStatusCode()I

    move-result v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->errorCodeForStatus(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static synthetic p(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->lambda$getAccessToken$5(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V

    return-void
.end method


# virtual methods
.method public clearAuthCache(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->clearAuthCache(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public clearAuthCache(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/i;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/i;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    new-instance v1, Lio/flutter/plugins/googlesignin/g;

    invoke-direct {v1, p2}, Lio/flutter/plugins/googlesignin/g;-><init>(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    invoke-virtual {p1, v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V

    return-void
.end method

.method public disconnect(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public disconnect(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "disconnect"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:La6/b;

    invoke-virtual {p1}, La6/b;->c()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/googlesignin/c;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlesignin/c;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/h;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/h;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->backgroundTaskRunner:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;

    new-instance v2, Lio/flutter/plugins/googlesignin/f;

    invoke-direct {v2, p0, p3, p2, p1}, Lio/flutter/plugins/googlesignin/f;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V

    return-void
.end method

.method public getActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->activity()Landroid/app/Activity;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->activity:Landroid/app/Activity;

    :goto_0
    return-object v0
.end method

.method public getTokens(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Z)V
    .locals 1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$2;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$2;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, p3, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public init(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const/4 v0, -0x1

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x329ca50a

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const v2, 0x7a8d9bd4

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "SignInOption.standard"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    move v0, v3

    goto :goto_0

    :cond_1
    const-string v1, "SignInOption.games"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    if-ne v0, v3, :cond_3

    sget-object p2, Lio/flutter/plugins/googlesignin/Messages$SignInType;->STANDARD:Lio/flutter/plugins/googlesignin/Messages$SignInType;

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Unknown signInOption"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    sget-object p2, Lio/flutter/plugins/googlesignin/Messages$SignInType;->GAMES:Lio/flutter/plugins/googlesignin/Messages$SignInType;

    :goto_1
    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    invoke-direct {v0}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;-><init>()V

    invoke-virtual {v0, p2}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setSignInType(Lio/flutter/plugins/googlesignin/Messages$SignInType;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p3}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setScopes(Ljava/util/List;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p4}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setHostedDomain(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p5}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setClientId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2, p6}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setServerClientId(Ljava/lang/String;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-static {p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->setForceCodeForRefreshToken(Ljava/lang/Boolean;)Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lio/flutter/plugins/googlesignin/Messages$InitParams$Builder;->build()Lio/flutter/plugins/googlesignin/Messages$InitParams;

    move-result-object p2

    invoke-virtual {p0, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->init(Lio/flutter/plugins/googlesignin/Messages$InitParams;)V

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/flutter/plugins/googlesignin/Messages$FlutterError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    iget-object p3, p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;->code:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p4

    iget-object p2, p2, Lio/flutter/plugins/googlesignin/Messages$FlutterError;->details:Ljava/lang/Object;

    invoke-interface {p1, p3, p4, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public init(Lio/flutter/plugins/googlesignin/Messages$InitParams;)V
    .locals 6

    :try_start_0
    sget-object v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$1;->$SwitchMap$io$flutter$plugins$googlesignin$Messages$SignInType:[I

    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getSignInType()Lio/flutter/plugins/googlesignin/Messages$SignInType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->s:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown signInOption"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->t:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    :goto_0
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getServerClientId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getClientId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lh7/t;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Lh7/t;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "google_sign_in"

    const-string v2, "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getClientId()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lh7/t;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "default_web_client_id"

    const-string v4, "string"

    iget-object v5, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-static {v1}, Lh7/t;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->d(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getForceCodeForRefreshToken()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->g(Ljava/lang/String;Z)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    :cond_4
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getScopes()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestedScopes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v3, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->f(Lcom/google/android/gms/common/api/Scope;[Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getHostedDomain()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh7/t;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Lio/flutter/plugins/googlesignin/Messages$InitParams;->getHostedDomain()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->i(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;

    :cond_6
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$a;->a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->getClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)La6/b;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:La6/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lio/flutter/plugins/googlesignin/Messages$FlutterError;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "exception"

    invoke-direct {v0, v2, p1, v1}, Lio/flutter/plugins/googlesignin/Messages$FlutterError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
.end method

.method public isSignedIn()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/a;->b(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public isSignedIn(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->isSignedIn()Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, -0x1

    const/4 v3, 0x1

    packed-switch p1, :pswitch_data_0

    return v1

    :pswitch_0
    if-ne p2, v2, :cond_1

    move v1, v3

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithBoolean(Ljava/lang/Boolean;)V

    return v3

    :pswitch_1
    if-ne p2, v2, :cond_2

    iget-object p1, v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->stringResult:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lio/flutter/plugins/googlesignin/Messages$Result;

    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    iget-object p2, p2, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;->data:Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    const/4 p3, 0x0

    iput-object p3, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->pendingOperation:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$PendingOperation;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p2, p3, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getAccessToken(Ljava/lang/String;Ljava/lang/Boolean;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    goto :goto_0

    :cond_2
    const-string p1, "failed_to_recover_auth"

    const-string p2, "Failed attempt to recover authentication"

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v3

    :pswitch_2
    if-eqz p3, :cond_3

    invoke-static {p3}, Lcom/google/android/gms/auth/api/signin/a;->c(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    goto :goto_1

    :cond_3
    const-string p1, "sign_in_failed"

    const-string p2, "Signin failed"

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return v3

    :pswitch_data_0
    .packed-switch 0xd02d
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public requestScopes(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$1;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate$1;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->requestScopes(Ljava/util/List;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public requestScopes(Ljava/util/List;Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requestScopes"

    invoke-direct {p0, v0, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingBoolOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p2, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->context:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p1, "sign_in_required"

    const-string p2, "No account to grant scopes."

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithError(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v2, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    invoke-virtual {v1, p2, v2}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->hasPermissions(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Scope;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->finishWithBoolean(Ljava/lang/Boolean;)V

    return-void

    :cond_3
    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->googleSignInWrapper:Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0xd02f

    const/4 v3, 0x0

    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    invoke-virtual {p1, v1, v2, p2, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInWrapper;->requestPermissions(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V

    return-void
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->activity:Landroid/app/Activity;

    return-void
.end method

.method public setUpRegistrar(Lio/flutter/plugin/common/PluginRegistry$Registrar;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->registrar:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    invoke-interface {p1, p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)Lio/flutter/plugin/common/PluginRegistry$Registrar;

    return-void
.end method

.method public signIn(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signIn(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signIn(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "signIn"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:La6/b;

    invoke-virtual {p1}, La6/b;->b()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0xd02d

    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "signIn needs a foreground activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public signInSilently(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$UserDataMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInSilently(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signInSilently(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Lio/flutter/plugins/googlesignin/Messages$UserData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "signInSilently"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingSignInOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:La6/b;

    invoke-virtual {p1}, La6/b;->d()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->onSignInResult(Lcom/google/android/gms/tasks/Task;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lio/flutter/plugins/googlesignin/e;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlesignin/e;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    :goto_0
    return-void
.end method

.method public signOut(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$VoidMethodChannelResult;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V

    return-void
.end method

.method public signOut(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlesignin/Messages$Result<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const-string v0, "signOut"

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->checkAndSetPendingVoidOperation(Ljava/lang/String;Lio/flutter/plugins/googlesignin/Messages$Result;)V

    iget-object p1, p0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->signInClient:La6/b;

    invoke-virtual {p1}, La6/b;->signOut()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/googlesignin/d;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlesignin/d;-><init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
