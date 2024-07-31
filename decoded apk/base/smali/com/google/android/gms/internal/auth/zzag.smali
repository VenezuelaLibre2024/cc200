.class final Lcom/google/android/gms/internal/auth/zzag;
.super Lcom/google/android/gms/common/api/internal/a;
.source ""


# instance fields
.field public final synthetic zza:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/auth/zzal;Lf6/a;Lf6/f;Landroid/accounts/Account;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/auth/zzag;->zza:Landroid/accounts/Account;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lf6/a;Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final createFailedResult(Lcom/google/android/gms/common/api/Status;)Lf6/m;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzak;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/auth/zzak;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/auth/zzam;

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lu5/g;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzaf;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/zzaf;-><init>(Lcom/google/android/gms/internal/auth/zzag;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/zzag;->zza:Landroid/accounts/Account;

    invoke-interface {p1, v0, v1}, Lu5/g;->h0(Lu5/d;Landroid/accounts/Account;)V

    return-void
.end method

.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf6/m;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
