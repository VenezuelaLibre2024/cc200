.class public final Lc7/ha;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic i:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ha;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p1, p0, Lc7/ha;->i:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/ha;->i:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    iget-object v1, p0, Lc7/ha;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    iget-object v2, p0, Lc7/ha;->i:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->j()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lc7/qc;->T(Lcom/google/android/gms/internal/measurement/zzcv;Z)V

    return-void
.end method
