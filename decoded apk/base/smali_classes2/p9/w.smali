.class public final synthetic Lp9/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lp9/e0;

.field public final synthetic b:Lcom/google/android/gms/tasks/Continuation;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic d:Lcom/google/android/gms/tasks/CancellationTokenSource;


# direct methods
.method public synthetic constructor <init>(Lp9/e0;Lcom/google/android/gms/tasks/Continuation;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/CancellationTokenSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/w;->a:Lp9/e0;

    iput-object p2, p0, Lp9/w;->b:Lcom/google/android/gms/tasks/Continuation;

    iput-object p3, p0, Lp9/w;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lp9/w;->d:Lcom/google/android/gms/tasks/CancellationTokenSource;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    iget-object v0, p0, Lp9/w;->a:Lp9/e0;

    iget-object v1, p0, Lp9/w;->b:Lcom/google/android/gms/tasks/Continuation;

    iget-object v2, p0, Lp9/w;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v3, p0, Lp9/w;->d:Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-static {v0, v1, v2, v3, p1}, Lp9/e0;->g(Lp9/e0;Lcom/google/android/gms/tasks/Continuation;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/CancellationTokenSource;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
