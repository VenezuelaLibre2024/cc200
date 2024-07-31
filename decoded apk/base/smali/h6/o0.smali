.class public final Lh6/o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/h$a;


# instance fields
.field public final synthetic a:Lf6/h;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lh6/r$a;

.field public final synthetic d:Lh6/q0;


# direct methods
.method public constructor <init>(Lf6/h;Lcom/google/android/gms/tasks/TaskCompletionSource;Lh6/r$a;Lh6/q0;)V
    .locals 0

    iput-object p1, p0, Lh6/o0;->a:Lf6/h;

    iput-object p2, p0, Lh6/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lh6/o0;->c:Lh6/r$a;

    iput-object p4, p0, Lh6/o0;->d:Lh6/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lh6/o0;->a:Lf6/h;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lf6/h;->await(JLjava/util/concurrent/TimeUnit;)Lf6/m;

    move-result-object p1

    iget-object v0, p0, Lh6/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v1, p0, Lh6/o0;->c:Lh6/r$a;

    invoke-interface {v1, p1}, Lh6/r$a;->a(Lf6/m;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh6/o0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1}, Lh6/b;->a(Lcom/google/android/gms/common/api/Status;)Lf6/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void
.end method
