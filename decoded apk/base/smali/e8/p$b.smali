.class public Le8/p$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/p;->K(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/tasks/Task<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Ljava/lang/Thread;

.field public final synthetic d:Ll8/i;

.field public final synthetic e:Z

.field public final synthetic f:Le8/p;


# direct methods
.method public constructor <init>(Le8/p;JLjava/lang/Throwable;Ljava/lang/Thread;Ll8/i;Z)V
    .locals 0

    iput-object p1, p0, Le8/p$b;->f:Le8/p;

    iput-wide p2, p0, Le8/p$b;->a:J

    iput-object p4, p0, Le8/p$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Le8/p$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Le8/p$b;->d:Ll8/i;

    iput-boolean p7, p0, Le8/p$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Le8/p$b;->a:J

    invoke-static {v0, v1}, Le8/p;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v0}, Le8/p;->c(Le8/p;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Lb8/g;->d(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v2}, Le8/p;->g(Le8/p;)Le8/s;

    move-result-object v2

    invoke-virtual {v2}, Le8/s;->a()Z

    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v2}, Le8/p;->h(Le8/p;)Le8/j0;

    move-result-object v2

    iget-object v3, p0, Le8/p$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Le8/p$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Le8/j0;->t(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    iget-wide v3, p0, Le8/p$b;->a:J

    invoke-static {v2, v3, v4}, Le8/p;->i(Le8/p;J)V

    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    iget-object v3, p0, Le8/p$b;->d:Ll8/i;

    invoke-virtual {v2, v3}, Le8/p;->v(Ll8/i;)V

    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    new-instance v3, Le8/h;

    iget-object v4, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v4}, Le8/p;->j(Le8/p;)Le8/b0;

    move-result-object v4

    invoke-direct {v3, v4}, Le8/h;-><init>(Le8/b0;)V

    invoke-virtual {v3}, Le8/h;->toString()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Le8/p$b;->e:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v3, v4}, Le8/p;->k(Le8/p;Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v2, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v2}, Le8/p;->l(Le8/p;)Le8/x;

    move-result-object v2

    invoke-virtual {v2}, Le8/x;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Le8/p$b;->f:Le8/p;

    invoke-static {v1}, Le8/p;->m(Le8/p;)Le8/n;

    move-result-object v1

    invoke-virtual {v1}, Le8/n;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Le8/p$b;->d:Ll8/i;

    invoke-interface {v2}, Ll8/i;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Le8/p$b$a;

    invoke-direct {v3, p0, v1, v0}, Le8/p$b$a;-><init>(Le8/p$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le8/p$b;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
