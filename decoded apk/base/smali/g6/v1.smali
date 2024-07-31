.class public final Lg6/v1;
.super Lg6/t0;
.source ""


# instance fields
.field public final b:Lg6/v;

.field public final c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final d:Lg6/t;


# direct methods
.method public constructor <init>(ILg6/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg6/t;)V
    .locals 0

    invoke-direct {p0, p1}, Lg6/t0;-><init>(I)V

    iput-object p3, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lg6/v1;->b:Lg6/v;

    iput-object p4, p0, Lg6/v1;->d:Lg6/t;

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    invoke-virtual {p2}, Lg6/v;->c()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v1, p0, Lg6/v1;->d:Lg6/t;

    invoke-interface {v1, p1}, Lg6/t;->a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final c(Lg6/k0;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lg6/v1;->b:Lg6/v;

    invoke-virtual {p1}, Lg6/k0;->v()Lf6/a$f;

    move-result-object p1

    iget-object v1, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1, v1}, Lg6/v;->b(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void

    :catch_1
    move-exception p1

    invoke-static {p1}, Lg6/x1;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg6/v1;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :catch_2
    move-exception p1

    throw p1
.end method

.method public final d(Lg6/a0;Z)V
    .locals 1

    iget-object v0, p0, Lg6/v1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0, p2}, Lg6/a0;->d(Lcom/google/android/gms/tasks/TaskCompletionSource;Z)V

    return-void
.end method

.method public final f(Lg6/k0;)Z
    .locals 0

    iget-object p1, p0, Lg6/v1;->b:Lg6/v;

    invoke-virtual {p1}, Lg6/v;->c()Z

    move-result p1

    return p1
.end method

.method public final g(Lg6/k0;)[Le6/d;
    .locals 0

    iget-object p1, p0, Lg6/v1;->b:Lg6/v;

    invoke-virtual {p1}, Lg6/v;->e()[Le6/d;

    move-result-object p1

    return-object p1
.end method
