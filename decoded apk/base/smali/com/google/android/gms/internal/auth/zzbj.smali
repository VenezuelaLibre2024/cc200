.class abstract Lcom/google/android/gms/internal/auth/zzbj;
.super Lcom/google/android/gms/common/api/internal/a;
.source ""


# direct methods
.method public constructor <init>(Lf6/f;)V
    .locals 1

    sget-object v0, Lv5/b;->a:Lf6/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lf6/a;Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lf6/m;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbv;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/auth/zzbv;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/auth/zzbe;

    invoke-virtual {p1}, Lh6/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth/zzbh;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/auth/zzbj;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/auth/zzbh;)V

    return-void
.end method

.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf6/m;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method

.method public abstract zza(Landroid/content/Context;Lcom/google/android/gms/internal/auth/zzbh;)V
.end method
