.class public final Lcom/google/firebase/auth/d;
.super Lx7/s0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx7/s0<",
        "Lw7/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Z

.field public final synthetic c:Lw7/a0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;ZLw7/a0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/d;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/firebase/auth/d;->b:Z

    iput-object p4, p0, Lcom/google/firebase/auth/d;->c:Lw7/a0;

    iput-object p5, p0, Lcom/google/firebase/auth/d;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/d;->e:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lx7/s0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "FirebaseAuth"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/d;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Logging in as "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with empty reCAPTCHA token"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/d;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Got reCAPTCHA token for login with email "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/google/firebase/auth/d;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v2

    iget-object v0, p0, Lcom/google/firebase/auth/d;->c:Lw7/a0;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lw7/a0;

    iget-object v4, p0, Lcom/google/firebase/auth/d;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/firebase/auth/d;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/firebase/auth/d;->e:Ljava/lang/String;

    new-instance v8, Lcom/google/firebase/auth/FirebaseAuth$c;

    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v8, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v7, p1

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Ln7/g;Lw7/a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/auth/d;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/auth/d;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/firebase/auth/d;->e:Ljava/lang/String;

    new-instance v7, Lcom/google/firebase/auth/FirebaseAuth$d;

    iget-object v0, p0, Lcom/google/firebase/auth/d;->f:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v7, v0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v6, p1

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Ln7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
