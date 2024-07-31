.class public Le8/p$d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/p$d$a;->a()Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/SuccessContinuation<",
        "Ll8/d;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le8/p$d$a;


# direct methods
.method public constructor <init>(Le8/p$d$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Le8/p$d$a$a;->b:Le8/p$d$a;

    iput-object p2, p0, Le8/p$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ll8/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    invoke-virtual {p1, v1}, Lb8/g;->k(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Le8/p$d$a$a;->b:Le8/p$d$a;

    iget-object p1, p1, Le8/p$d$a;->b:Le8/p$d;

    iget-object p1, p1, Le8/p$d;->b:Le8/p;

    invoke-static {p1}, Le8/p;->n(Le8/p;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Le8/p$d$a$a;->b:Le8/p$d$a;

    iget-object p1, p1, Le8/p$d$a;->b:Le8/p$d;

    iget-object p1, p1, Le8/p$d;->b:Le8/p;

    invoke-static {p1}, Le8/p;->h(Le8/p;)Le8/j0;

    move-result-object p1

    iget-object v1, p0, Le8/p$d$a$a;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1}, Le8/j0;->x(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Le8/p$d$a$a;->b:Le8/p$d$a;

    iget-object p1, p1, Le8/p$d$a;->b:Le8/p$d;

    iget-object p1, p1, Le8/p$d;->b:Le8/p;

    iget-object p1, p1, Le8/p;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, Ll8/d;

    invoke-virtual {p0, p1}, Le8/p$d$a$a;->a(Ll8/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
