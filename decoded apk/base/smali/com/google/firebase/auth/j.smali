.class public final Lcom/google/firebase/auth/j;
.super Lcom/google/firebase/auth/b$b;
.source ""


# instance fields
.field public final synthetic a:Lcom/google/firebase/auth/a;

.field public final synthetic b:Lcom/google/firebase/auth/b$b;

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/a;Lcom/google/firebase/auth/b$b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/j;->a:Lcom/google/firebase/auth/a;

    iput-object p3, p0, Lcom/google/firebase/auth/j;->b:Lcom/google/firebase/auth/b$b;

    iput-object p1, p0, Lcom/google/firebase/auth/j;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lcom/google/firebase/auth/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/j;->b:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V

    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/j;->b:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/auth/b$b;->onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V

    return-void
.end method

.method public final onVerificationCompleted(Lw7/o0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/j;->b:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationCompleted(Lw7/o0;)V

    return-void
.end method

.method public final onVerificationFailed(Ln7/m;)V
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Ljava/lang/Exception;)Z

    move-result v0

    const-string v1, "FirebaseAuth"

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/auth/j;->a:Lcom/google/firebase/auth/a;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/firebase/auth/a;->b(Z)V

    iget-object p1, p0, Lcom/google/firebase/auth/j;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {p1}, Lcom/google/firebase/auth/a;->i()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Re-triggering phone verification with Recaptcha flow forced for phone number "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/firebase/auth/j;->a:Lcom/google/firebase/auth/a;

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->f0(Lcom/google/firebase/auth/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/j;->a:Lcom/google/firebase/auth/a;

    invoke-virtual {v0}, Lcom/google/firebase/auth/a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invoking original failure callbacks after phone verification failure for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", error - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/auth/j;->b:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationFailed(Ln7/m;)V

    return-void
.end method
