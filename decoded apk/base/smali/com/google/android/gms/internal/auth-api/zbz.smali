.class final Lcom/google/android/gms/internal/auth-api/zbz;
.super Lcom/google/android/gms/internal/auth-api/zbi;
.source ""


# instance fields
.field public final synthetic zba:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/auth-api/zbaa;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbz;->zba:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth-api/zbi;-><init>()V

    return-void
.end method


# virtual methods
.method public final zbb(Lcom/google/android/gms/common/api/Status;Lx5/a;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbz;->zba:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbz;->zba:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1}, Lh6/b;->a(Lcom/google/android/gms/common/api/Status;)Lf6/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
