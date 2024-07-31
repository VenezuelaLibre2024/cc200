.class final Lcom/google/android/play/core/integrity/aq;
.super Lg7/d0;
.source ""


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/google/android/play/core/integrity/ax;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/integrity/aq;->b:Lcom/google/android/play/core/integrity/ax;

    iput-object p3, p0, Lcom/google/android/play/core/integrity/aq;->a:Landroid/content/Context;

    invoke-direct {p0, p2}, Lg7/d0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/integrity/aq;->b:Lcom/google/android/play/core/integrity/ax;

    invoke-static {v0}, Lcom/google/android/play/core/integrity/ax;->e(Lcom/google/android/play/core/integrity/ax;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/integrity/aq;->a:Landroid/content/Context;

    invoke-static {v1}, Lg7/h;->a(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method
