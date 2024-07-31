.class public final Lx7/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Ljava/lang/String;

.field public final synthetic i:Lx7/t;


# direct methods
.method public constructor <init>(Lx7/t;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lx7/w;->i:Lx7/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx7/w;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lx7/w;->h:Ljava/lang/String;

    invoke-static {v0}, Ln7/g;->p(Ljava/lang/String;)Ln7/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->j()Lw7/a0;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {}, Lx7/t;->a()Lk6/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Token refreshing started"

    invoke-virtual {v1, v3, v2}, Lk6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lx7/v;

    invoke-direct {v1, p0}, Lx7/v;-><init>(Lx7/w;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method
