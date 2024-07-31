.class abstract Lcom/google/android/gms/internal/location/zzcb;
.super Lcom/google/android/gms/common/api/internal/a;
.source ""


# direct methods
.method public constructor <init>(Lf6/f;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lf6/a;Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lf6/m;
    .locals 2

    new-instance v0, Lw6/r;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lw6/r;-><init>(Lcom/google/android/gms/common/api/Status;Lw6/s;)V

    return-object v0
.end method

.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf6/m;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
