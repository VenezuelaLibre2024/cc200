.class public final Lf6/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lf6/m;Lf6/f;)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lf6/m;",
            ">(TR;",
            "Lf6/f;",
            ")",
            "Lf6/h<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lf6/m;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->N()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Lf6/v;

    invoke-direct {v0, p1, p0}, Lf6/v;-><init>(Lf6/f;Lf6/m;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-object v0
.end method

.method public static b(Lf6/m;Lf6/f;)Lf6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lf6/m;",
            ">(TR;",
            "Lf6/f;",
            ")",
            "Lf6/g<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lf6/w;

    invoke-direct {v0, p1}, Lf6/w;-><init>(Lf6/f;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    new-instance p0, Lg6/n;

    invoke-direct {p0, v0}, Lg6/n;-><init>(Lf6/h;)V

    return-object p0
.end method

.method public static c(Lcom/google/android/gms/common/api/Status;Lf6/f;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Lf6/f;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lg6/u;

    invoke-direct {v0, p1}, Lg6/u;-><init>(Lf6/f;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-object v0
.end method
