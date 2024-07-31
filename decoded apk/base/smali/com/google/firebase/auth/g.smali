.class public final Lcom/google/firebase/auth/g;
.super Lcom/google/firebase/auth/b$b;
.source ""


# instance fields
.field public final synthetic a:Lcom/google/firebase/auth/b$b;

.field public final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/b$b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/g;->a:Lcom/google/firebase/auth/b$b;

    iput-object p1, p0, Lcom/google/firebase/auth/g;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lcom/google/firebase/auth/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V
    .locals 1

    iget-object p2, p0, Lcom/google/firebase/auth/g;->a:Lcom/google/firebase/auth/b$b;

    iget-object v0, p0, Lcom/google/firebase/auth/g;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->x0(Lcom/google/firebase/auth/FirebaseAuth;)Lx7/f;

    move-result-object v0

    invoke-virtual {v0}, Lx7/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/firebase/auth/b;->a(Ljava/lang/String;Ljava/lang/String;)Lw7/o0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/b$b;->onVerificationCompleted(Lw7/o0;)V

    return-void
.end method

.method public final onVerificationCompleted(Lw7/o0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/g;->a:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationCompleted(Lw7/o0;)V

    return-void
.end method

.method public final onVerificationFailed(Ln7/m;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/g;->a:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationFailed(Ln7/m;)V

    return-void
.end method
