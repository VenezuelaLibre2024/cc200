.class public final Lcom/google/firebase/auth/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/OnCompleteListener<",
        "Lx7/r1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/firebase/auth/a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    iput-object p3, p0, Lcom/google/firebase/auth/h;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx7/r1;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const-string v1, "Error while validating application identity: "

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v4, "FirebaseAuth"

    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_1

    invoke-static {v3}, Lx7/d0;->h(Ljava/lang/Exception;)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast v3, Ln7/m;

    iget-object v1, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    iget-object v2, v0, Lcom/google/firebase/auth/h;->b:Ljava/lang/String;

    invoke-static {v3, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->h0(Ln7/m;Lcom/google/firebase/auth/a;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "Proceeding without any application identifier."

    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v11, v2

    move-object v12, v11

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/r1;

    invoke-virtual {v1}, Lx7/r1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/r1;

    invoke-virtual {v1}, Lx7/r1;->a()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    move-object v11, v2

    :goto_0
    iget-object v1, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v1}, Lcom/google/firebase/auth/a;->h()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v1, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->i()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v3}, Lcom/google/firebase/auth/a;->f()Lcom/google/firebase/auth/b$b;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->Z(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/firebase/auth/b$b;)Lcom/google/firebase/auth/b$b;

    move-result-object v1

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v3, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2, v3, v1}, Lcom/google/firebase/auth/FirebaseAuth;->a0(Lcom/google/firebase/auth/a;Lcom/google/firebase/auth/b$b;)Lcom/google/firebase/auth/b$b;

    move-result-object v1

    :cond_3
    move-object v14, v1

    iget-object v1, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v1}, Lcom/google/firebase/auth/a;->d()Lw7/l0;

    move-result-object v1

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lx7/p;

    invoke-virtual {v4}, Lx7/p;->M()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v5, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v5}, Lcom/google/firebase/auth/a;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->z0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    move-result-object v6

    iget-object v9, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v9}, Lcom/google/firebase/auth/a;->e()Lcom/google/firebase/auth/b$a;

    move-result-object v9

    if-eqz v9, :cond_4

    move v9, v2

    goto :goto_1

    :cond_4
    move v9, v3

    :goto_1
    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->l()Z

    move-result v10

    iget-object v2, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->I0()Z

    move-result v13

    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->j()Ljava/util/concurrent/Executor;

    move-result-object v15

    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->a()Landroid/app/Activity;

    move-result-object v16

    move-object v3, v1

    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Lx7/p;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_5
    iget-object v1, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v5, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v5}, Lcom/google/firebase/auth/a;->g()Lw7/r0;

    move-result-object v5

    invoke-static {v5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw7/r0;

    iget-object v6, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->z0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    move-result-object v6

    iget-object v9, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v9}, Lcom/google/firebase/auth/a;->e()Lcom/google/firebase/auth/b$a;

    move-result-object v9

    if-eqz v9, :cond_6

    move v9, v2

    goto :goto_2

    :cond_6
    move v9, v3

    :goto_2
    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->l()Z

    move-result v10

    iget-object v2, v0, Lcom/google/firebase/auth/h;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->I0()Z

    move-result v13

    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->j()Ljava/util/concurrent/Executor;

    move-result-object v15

    iget-object v2, v0, Lcom/google/firebase/auth/h;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v2}, Lcom/google/firebase/auth/a;->a()Landroid/app/Activity;

    move-result-object v16

    move-object v3, v1

    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Lx7/p;Lw7/r0;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
