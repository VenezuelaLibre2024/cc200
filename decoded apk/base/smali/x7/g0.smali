.class public final Lx7/g0;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lw7/i;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/firebase/auth/FirebaseAuth;

.field public final d:Lw7/a0;

.field public final synthetic e:Lx7/a0;


# direct methods
.method public constructor <init>(Lx7/a0;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lw7/i;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lw7/a0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lx7/g0;->e:Lx7/a0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lx7/g0;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lx7/g0;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p5, p0, Lx7/g0;->d:Lw7/a0;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, Lx7/g0;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p2, "FederatedAuthReceiver"

    const-string v0, "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation."

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x445b

    const-string v2, "Activity that started the web operation is no longer alive; see logcat for details"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    invoke-static {p1}, Lx7/a0;->d(Landroid/content/Context;)V

    return-void

    :cond_0
    const-string v0, "com.google.firebase.auth.internal.OPERATION"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lx7/g0;->e:Lx7/a0;

    iget-object v1, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lx7/g0;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0, p2, v1, v2, p1}, Lx7/a0;->f(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V

    return-void

    :cond_1
    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lx7/g0;->e:Lx7/a0;

    iget-object v1, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lx7/g0;->d:Lw7/a0;

    invoke-static {v0, p2, v1, v2, p1}, Lx7/a0;->g(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lw7/a0;Landroid/content/Context;)V

    return-void

    :cond_2
    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lx7/g0;->e:Lx7/a0;

    iget-object v1, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lx7/g0;->d:Lw7/a0;

    invoke-static {v0, p2, v1, v2, p1}, Lx7/a0;->k(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lw7/a0;Landroid/content/Context;)V

    return-void

    :cond_3
    iget-object p1, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "WEB_CONTEXT_CANCELED:Unknown operation received ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lx7/r;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_4
    invoke-static {p2}, Lx7/k1;->d(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, Lx7/k1;->a(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    iget-object v0, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    invoke-static {p1}, Lx7/a0;->d(Landroid/content/Context;)V

    return-void

    :cond_5
    const-string v0, "com.google.firebase.auth.internal.EXTRA_CANCELED"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lx7/g0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const-string v0, "WEB_CONTEXT_CANCELED"

    invoke-static {v0}, Lx7/r;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    invoke-static {p1}, Lx7/a0;->d(Landroid/content/Context;)V

    :cond_6
    return-void
.end method
