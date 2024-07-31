.class public Lh6/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;)Lf6/b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lf6/k;

    invoke-direct {v0, p0}, Lf6/k;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    new-instance v0, Lf6/b;

    invoke-direct {v0, p0}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
