.class public final Lx7/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Lw7/i;",
        "Lcom/google/android/gms/tasks/Task<",
        "Lw7/i;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lx7/o;


# direct methods
.method public constructor <init>(Lx7/o;)V
    .locals 0

    iput-object p1, p0, Lx7/n;->a:Lx7/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx7/n;->a:Lx7/o;

    invoke-static {v0}, Lx7/o;->M(Lx7/o;)Lw7/z1;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/i;

    new-instance v0, Lx7/h2;

    invoke-interface {p1}, Lw7/i;->B()Lw7/a0;

    move-result-object v1

    check-cast v1, Lx7/i;

    invoke-interface {p1}, Lw7/i;->v()Lw7/g;

    move-result-object p1

    check-cast p1, Lx7/f2;

    iget-object v2, p0, Lx7/n;->a:Lx7/o;

    invoke-static {v2}, Lx7/o;->M(Lx7/o;)Lw7/z1;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lx7/h2;-><init>(Lx7/i;Lx7/f2;Lw7/z1;)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lw7/x;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lw7/x;

    iget-object v1, p0, Lx7/n;->a:Lx7/o;

    invoke-static {v1}, Lx7/o;->M(Lx7/o;)Lw7/z1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw7/x;->e(Lw7/h;)Lw7/x;

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
