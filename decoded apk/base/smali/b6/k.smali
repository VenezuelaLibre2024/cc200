.class public final Lb6/k;
.super Lb6/p;
.source ""


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method public constructor <init>(Lf6/f;Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 0

    iput-object p2, p0, Lb6/k;->a:Landroid/content/Context;

    iput-object p3, p0, Lb6/k;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p0, p1}, Lb6/p;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lf6/m;
    .locals 2

    new-instance v0, La6/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, La6/c;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 2

    check-cast p1, Lb6/i;

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lb6/w;

    new-instance v0, Lb6/j;

    invoke-direct {v0, p0}, Lb6/j;-><init>(Lb6/k;)V

    iget-object v1, p0, Lb6/k;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-virtual {p1, v0, v1}, Lb6/w;->g(Lb6/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
