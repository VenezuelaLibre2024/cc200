.class public Lx7/d0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Ljava/lang/String; = "d0"

.field public static final c:Lx7/d0;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/d0;

    invoke-direct {v0}, Lx7/d0;-><init>()V

    sput-object v0, Lx7/d0;->c:Lx7/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lx7/d0;
    .locals 1

    sget-object v0, Lx7/d0;->c:Lx7/d0;

    return-object v0
.end method

.method public static bridge synthetic g(Lx7/d0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lx7/d0;->a:Ljava/lang/String;

    return-void
.end method

.method public static h(Ljava/lang/Exception;)Z
    .locals 1

    instance-of v0, p0, Lw7/t;

    if-nez v0, :cond_1

    instance-of v0, p0, Lw7/q;

    if-eqz v0, :cond_0

    check-cast p0, Lw7/q;

    invoke-virtual {p0}, Lw7/q;->a()Ljava/lang/String;

    move-result-object p0

    const-string v0, "UNAUTHORIZED_DOMAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lx7/d0;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "ZZZ",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx7/r1;",
            ">;"
        }
    .end annotation

    move/from16 v0, p5

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lw7/w;

    move-result-object v1

    check-cast v1, Lx7/f;

    invoke-static {}, Lx7/j1;->f()Lx7/j1;

    move-result-object v11

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaec;->zza(Ln7/g;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lx7/f;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v2, Lx7/d0;->b:Ljava/lang/String;

    invoke-virtual {v1}, Lx7/f;->f()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ForceRecaptchaV2Flow from phoneAuthOptions = "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", ForceRecaptchav2Flow from firebaseSettings = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lx7/f;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {v11}, Lx7/j1;->e()Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v0, Lx7/u1;

    invoke-direct {v0}, Lx7/u1;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lx7/q1;->d(Ljava/lang/String;)Lx7/q1;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Lx7/q1;->b()Lx7/r1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error in previous reCAPTCHAV2 flow: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v3, "Continuing with application verification as normal"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v12, Lx7/c;

    const/4 v10, 0x0

    move-object v2, v12

    move-object v3, p0

    move-object v4, v1

    move-object v5, p1

    move-object/from16 v6, p7

    move-object v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    invoke-direct/range {v2 .. v11}, Lx7/c;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/recaptcha/RecaptchaAction;Ljava/lang/String;Landroid/app/Activity;ZZLx7/j1;)V

    invoke-virtual {v0, v12}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    goto :goto_3

    :cond_5
    const/4 v7, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object v8, v11

    move-object v9, v1

    invoke-virtual/range {v2 .. v9}, Lx7/d0;->e(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLx7/j1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    :goto_3
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_4
    new-instance v0, Lx7/u1;

    invoke-direct {v0}, Lx7/u1;-><init>()V

    goto :goto_2
.end method

.method public final synthetic c(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/recaptcha/RecaptchaAction;Ljava/lang/String;Landroid/app/Activity;ZZLx7/j1;Lcom/google/android/gms/tasks/Task;)V
    .locals 9

    move-object v8, p0

    move-object v7, p1

    invoke-virtual/range {p9 .. p9}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lx7/d0;->b:Ljava/lang/String;

    invoke-virtual/range {p9 .. p9}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to initialize reCAPTCHA config: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->p0()Lx7/b1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->p0()Lx7/b1;

    move-result-object v0

    const-string v1, "PHONE_PROVIDER"

    invoke-virtual {v0, v1}, Lx7/b1;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->p0()Lx7/b1;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->n()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v3, p3

    invoke-virtual {v0, v1, v2, p3}, Lx7/b1;->b(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lx7/n1;

    invoke-direct {v1, p0, p1}, Lx7/n1;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lx7/e1;

    invoke-direct {v1, p0, p1}, Lx7/e1;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move v4, p6

    move/from16 v5, p7

    move-object/from16 v6, p8

    move-object v7, p1

    invoke-virtual/range {v0 .. v7}, Lx7/d0;->e(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLx7/j1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final synthetic d(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;

    invoke-virtual {v0}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance p2, Lx7/u1;

    invoke-direct {p2}, Lx7/u1;-><init>()V

    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;

    invoke-virtual {p3}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lx7/q1;->a(Ljava/lang/String;)Lx7/q1;

    move-result-object p2

    invoke-virtual {p2}, Lx7/q1;->b()Lx7/r1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p5, ""

    goto :goto_1

    :cond_2
    invoke-virtual {p5}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p5

    :goto_1
    sget-object v0, Lx7/d0;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Play Integrity Token fetch failed, falling back to Recaptcha"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {v0, p5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2, p3, p4, p1}, Lx7/d0;->f(Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final e(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLx7/j1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Ljava/lang/String;",
            "Landroid/app/Activity;",
            "ZZ",
            "Lx7/j1;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lx7/r1;",
            ">;)V"
        }
    .end annotation

    if-eqz p4, :cond_1

    if-nez p5, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object p4

    invoke-virtual {p4}, Ln7/g;->m()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;

    move-result-object p4

    iget-object p5, p0, Lx7/d0;->a:Ljava/lang/String;

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_0

    new-instance p5, Lcom/google/android/gms/internal/firebase-auth-api/zzafi;

    iget-object v0, p0, Lx7/d0;->a:Ljava/lang/String;

    invoke-direct {p5, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzafi;-><init>(Ljava/lang/String;)V

    invoke-static {p5}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->I()Lcom/google/android/gms/tasks/Task;

    move-result-object p5

    :goto_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->C0()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lx7/m1;

    invoke-direct {v1, p0, p2, p4}, Lx7/m1;-><init>(Lx7/d0;Ljava/lang/String;Lcom/google/android/play/core/integrity/IntegrityManager;)V

    invoke-virtual {p5, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance p4, Lx7/l1;

    move-object v0, p4

    move-object v1, p0

    move-object v2, p7

    move-object v3, p1

    move-object v4, p6

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lx7/l1;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;)V

    invoke-virtual {p2, p4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    invoke-virtual {p0, p1, p6, p3, p7}, Lx7/d0;->f(Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final f(Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lx7/j1;",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lx7/r1;",
            ">;)V"
        }
    .end annotation

    if-nez p3, :cond_0

    new-instance p1, Lw7/t;

    invoke-direct {p1}, Lw7/t;-><init>()V

    invoke-virtual {p4, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object p2

    invoke-virtual {p2}, Ln7/g;->m()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lx7/p0;->d(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-static {}, Lx7/a0;->b()Lx7/a0;

    move-result-object v0

    invoke-virtual {v0, p3, p2}, Lx7/a0;->h(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x42a1

    const-string p3, "reCAPTCHA flow already in progress"

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadq;

    invoke-direct {v0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadq;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadq;->zza()V

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_0
    new-instance p2, Lx7/o1;

    invoke-direct {p2, p0, p4}, Lx7/o1;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lx7/p1;

    invoke-direct {p2, p0, p4}, Lx7/p1;-><init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
