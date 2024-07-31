.class public final Lb6/m;
.super Lb6/p;
.source ""


# direct methods
.method public constructor <init>(Lf6/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lb6/p;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lf6/m;
    .locals 0

    return-object p1
.end method

.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 2

    check-cast p1, Lb6/i;

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lb6/w;

    new-instance v1, Lb6/l;

    invoke-direct {v1, p0}, Lb6/l;-><init>(Lb6/m;)V

    invoke-virtual {p1}, Lb6/i;->c()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lb6/w;->e(Lb6/v;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
