.class public final Lw7/j1;
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
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lw7/e;

.field public final synthetic c:Lw7/a0;


# direct methods
.method public constructor <init>(Lw7/a0;Ljava/lang/String;Lw7/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lw7/j1;->a:Ljava/lang/String;

    iput-object p3, p0, Lw7/j1;->b:Lw7/e;

    iput-object p1, p0, Lw7/j1;->c:Lw7/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/c0;

    iget-object v0, p0, Lw7/j1;->c:Lw7/a0;

    invoke-virtual {v0}, Lw7/a0;->d0()Ln7/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {p1}, Lw7/c0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lw7/j1;->a:Ljava/lang/String;

    iget-object v2, p0, Lw7/j1;->b:Lw7/e;

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->M(Ljava/lang/String;Ljava/lang/String;Lw7/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
