.class public final Lcom/google/firebase/auth/i;
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
.field public final synthetic a:Lw7/a0;

.field public final synthetic b:Lw7/j;

.field public final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;Lw7/j;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/auth/i;->a:Lw7/a0;

    iput-object p3, p0, Lcom/google/firebase/auth/i;->b:Lw7/j;

    iput-object p1, p0, Lcom/google/firebase/auth/i;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Lx7/s0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7
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

    const-string v0, "Linking email account with empty reCAPTCHA token"

    goto :goto_0

    :cond_0
    const-string v0, "Got reCAPTCHA token for linking email account"

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/auth/i;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/auth/i;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/auth/i;->a:Lw7/a0;

    iget-object v4, p0, Lcom/google/firebase/auth/i;->b:Lw7/j;

    new-instance v6, Lcom/google/firebase/auth/FirebaseAuth$c;

    iget-object v0, p0, Lcom/google/firebase/auth/i;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v6, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Ln7/g;Lw7/a0;Lw7/h;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
