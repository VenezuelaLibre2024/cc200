.class public final synthetic Lp9/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/SuccessContinuation;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lcom/google/android/gms/tasks/CancellationTokenSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/SuccessContinuation;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/CancellationTokenSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/y;->a:Lcom/google/android/gms/tasks/SuccessContinuation;

    iput-object p2, p0, Lp9/y;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lp9/y;->c:Lcom/google/android/gms/tasks/CancellationTokenSource;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp9/y;->a:Lcom/google/android/gms/tasks/SuccessContinuation;

    iget-object v1, p0, Lp9/y;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lp9/y;->c:Lcom/google/android/gms/tasks/CancellationTokenSource;

    check-cast p1, Lp9/e0$a;

    invoke-static {v0, v1, v2, p1}, Lp9/e0;->a(Lcom/google/android/gms/tasks/SuccessContinuation;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/CancellationTokenSource;Lp9/e0$a;)V

    return-void
.end method
