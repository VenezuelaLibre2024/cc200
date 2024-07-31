.class public final Lcom/google/firebase/auth/c;
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
.field public final synthetic a:Z

.field public final synthetic b:Lw7/a0;

.field public final synthetic c:Lw7/j;

.field public final synthetic d:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;ZLw7/a0;Lw7/j;)V
    .locals 0

    iput-boolean p2, p0, Lcom/google/firebase/auth/c;->a:Z

    iput-object p3, p0, Lcom/google/firebase/auth/c;->b:Lw7/a0;

    iput-object p4, p0, Lcom/google/firebase/auth/c;->c:Lw7/j;

    iput-object p1, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

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

    const-string v0, "Email link login/reauth with empty reCAPTCHA token"

    goto :goto_0

    :cond_0
    const-string v0, "Got reCAPTCHA token for login/reauth with email link"

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/google/firebase/auth/c;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v2

    iget-object v0, p0, Lcom/google/firebase/auth/c;->b:Lw7/a0;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lw7/a0;

    iget-object v4, p0, Lcom/google/firebase/auth/c;->c:Lw7/j;

    new-instance v6, Lcom/google/firebase/auth/FirebaseAuth$c;

    iget-object v0, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v6, v0}, Lcom/google/firebase/auth/FirebaseAuth$c;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zzb(Ln7/g;Lw7/a0;Lw7/j;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->s0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/zzaag;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/FirebaseAuth;)Ln7/g;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/auth/c;->c:Lw7/j;

    new-instance v3, Lcom/google/firebase/auth/FirebaseAuth$d;

    iget-object v4, p0, Lcom/google/firebase/auth/c;->d:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {v3, v4}, Lcom/google/firebase/auth/FirebaseAuth$d;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaag;->zza(Ln7/g;Lw7/j;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
