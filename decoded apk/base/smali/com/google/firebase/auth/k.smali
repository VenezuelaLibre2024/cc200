.class public final Lcom/google/firebase/auth/k;
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

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/k;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/k;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/auth/k;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lx7/s0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 8
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

    iget-object v0, p0, Lcom/google/firebase/auth/k;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Creating user with "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with empty reCAPTCHA token"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/k;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Got reCAPTCHA token for sign up with email "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/auth/k;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/auth/k;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/auth/k;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/auth/k;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/k;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->B0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/google/firebase/auth/FirebaseAuth$d;

    iget-object v0, p0, Lcom/google/firebase/auth/k;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v7, v0}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v6, p1

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Ln7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
