.class public final Lb6/j;
.super Lb6/e;
.source ""


# instance fields
.field public final synthetic a:Lb6/k;


# direct methods
.method public constructor <init>(Lb6/k;)V
    .locals 0

    iput-object p1, p0, Lb6/j;->a:Lb6/k;

    invoke-direct {p0}, Lb6/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final w0(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lb6/j;->a:Lb6/k;

    iget-object v1, v0, Lb6/k;->a:Landroid/content/Context;

    invoke-static {v1}, Lb6/r;->c(Landroid/content/Context;)Lb6/r;

    move-result-object v1

    iget-object v0, v0, Lb6/k;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {v1, v0, p1}, Lb6/r;->e(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    :cond_0
    iget-object v0, p0, Lb6/j;->a:Lb6/k;

    new-instance v1, La6/c;

    invoke-direct {v1, p1, p2}, La6/c;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
