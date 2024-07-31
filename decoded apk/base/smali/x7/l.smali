.class public final Lx7/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Lw7/c0;",
        "Lcom/google/android/gms/tasks/Task<",
        "Lw7/l0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lx7/m;


# direct methods
.method public constructor <init>(Lx7/m;)V
    .locals 0

    iput-object p1, p0, Lx7/l;->a:Lx7/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/c0;

    invoke-virtual {p1}, Lw7/c0;->g()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lx7/l;->a:Lx7/m;

    invoke-static {v0}, Lx7/m;->e(Lx7/m;)Lx7/i;

    move-result-object v0

    invoke-static {p1, v0}, Lx7/p;->J(Ljava/lang/String;Lx7/i;)Lx7/p;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
