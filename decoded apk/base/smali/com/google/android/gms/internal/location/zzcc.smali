.class public final Lcom/google/android/gms/internal/location/zzcc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw6/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final checkLocationSettings(Lf6/f;Lw6/p;)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lw6/p;",
            ")",
            "Lf6/h<",
            "Lw6/r;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzca;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/location/zzca;-><init>(Lcom/google/android/gms/internal/location/zzcc;Lf6/f;Lw6/p;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lf6/f;->a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method
