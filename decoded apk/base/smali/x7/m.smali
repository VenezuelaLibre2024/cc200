.class public final Lx7/m;
.super Lw7/h0;
.source ""


# instance fields
.field public final a:Lx7/i;


# direct methods
.method public constructor <init>(Lx7/i;)V
    .locals 0

    invoke-direct {p0}, Lw7/h0;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx7/m;->a:Lx7/i;

    return-void
.end method

.method public static bridge synthetic e(Lx7/m;)Lx7/i;
    .locals 0

    iget-object p0, p0, Lx7/m;->a:Lx7/i;

    return-object p0
.end method


# virtual methods
.method public final a(Lw7/i0;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/i0;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx7/m;->a:Lx7/i;

    invoke-virtual {v0}, Lw7/a0;->d0()Ln7/g;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->S(Lw7/a0;Lw7/i0;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw7/j0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/m;->a:Lx7/i;

    invoke-virtual {v0}, Lx7/i;->zzh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/l0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/m;->a:Lx7/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw7/a0;->J(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lx7/l;

    invoke-direct {v1, p0}, Lx7/l;-><init>(Lx7/m;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lx7/m;->a:Lx7/i;

    invoke-virtual {v0}, Lw7/a0;->d0()Ln7/g;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->Q(Lw7/a0;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
