.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super Lcom/google/android/gms/internal/measurement/zzct;
.source ""


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;,
        Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;
    }
.end annotation


# instance fields
.field public a:Lc7/k6;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lc7/r7;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzct;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->t()Lc7/b0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc7/b0;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to perform action before initialize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc7/w7;->T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lc7/w7;->N(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/qc;->R(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->t()Lc7/b0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc7/b0;->y(Ljava/lang/String;J)V

    return-void
.end method

.method public generateEventId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->K0()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->G()Lc7/qc;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Lc7/qc;->P(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    return-void
.end method

.method public getAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/h7;

    invoke-direct {v1, p0, p1}, Lc7/h7;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->e0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/ib;

    invoke-direct {v1, p0, p3, p1, p2}, Lc7/ib;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->f0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public getCurrentScreenName(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->g0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public getGmpAppId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->h0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->e(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    const/16 v0, 0x19

    invoke-virtual {p1, p2, v0}, Lc7/qc;->O(Lcom/google/android/gms/internal/measurement/zzcv;I)V

    return-void
.end method

.method public getSessionId(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/x8;

    invoke-direct {v2, v0, p1}, Lc7/x8;-><init>(Lc7/w7;Lcom/google/android/gms/internal/measurement/zzcv;)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getTestFlag(Lcom/google/android/gms/internal/measurement/zzcv;I)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->a0()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, p1, v0}, Lc7/qc;->T(Lcom/google/android/gms/internal/measurement/zzcv;Z)V

    :goto_0
    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->c0()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lc7/qc;->O(Lcom/google/android/gms/internal/measurement/zzcv;I)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->b0()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "r"

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    :try_start_0
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p2, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    const-string v0, "Error returning double value to wrapper"

    invoke-virtual {p2, v0, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->d0()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Lc7/qc;->P(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lc7/qc;->R(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v7, Lc7/h9;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lc7/h9;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    return-void
.end method

.method public initialize(Lr6/b;Lcom/google/android/gms/internal/measurement/zzdd;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    if-nez v0, :cond_0

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lc7/k6;->a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lc7/k6;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    return-void

    :cond_0
    invoke-virtual {v0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "Attempting to initialize multiple times"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void
.end method

.method public isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/ha;

    invoke-direct {v1, p0, p1}, Lc7/ha;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->C()Lc7/w7;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-wide/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lc7/w7;->V(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    if-eqz p3, :cond_0

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v1, "_o"

    const-string v5, "app"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lc7/g0;

    new-instance v4, Lc7/a0;

    invoke-direct {v4, p3}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    move-object v2, v0

    move-object v3, p2

    move-wide v6, p5

    invoke-direct/range {v2 .. v7}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p2

    new-instance p3, Lc7/g6;

    invoke-direct {p3, p0, p4, v0, p1}, Lc7/g6;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Lc7/g0;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logHealthData(ILjava/lang/String;Lr6/b;Lr6/b;Lr6/b;)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    :goto_0
    if-nez p4, :cond_1

    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {p4}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    :goto_1
    if-nez p5, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p5}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    move-object v8, v0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lc7/v4;->u(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(Lr6/b;Landroid/os/Bundle;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    iget-object p3, p3, Lc7/w7;->c:Lc7/e9;

    if-eqz p3, :cond_0

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p4}, Lc7/k6;->C()Lc7/w7;

    move-result-object p4

    invoke-virtual {p4}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p2}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Lr6/b;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    iget-object p2, p2, Lc7/w7;->c:Lc7/e9;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Lr6/b;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    iget-object p2, p2, Lc7/w7;->c:Lc7/e9;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityPaused(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Lr6/b;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    iget-object p2, p2, Lc7/w7;->c:Lc7/e9;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Lr6/b;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    iget-object p3, p3, Lc7/w7;->c:Lc7/e9;

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p4}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    const-string p3, "Error returning bundle value to wrapper"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(Lr6/b;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    iget-object p2, p2, Lc7/w7;->c:Lc7/e9;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityStarted(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityStopped(Lr6/b;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    iget-object p2, p2, Lc7/w7;->c:Lc7/e9;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w7;->k0()V

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityStopped(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V

    return-void
.end method

.method public registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc7/r7;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1, v1}, Lc7/w7;->H(Lc7/r7;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public resetAnalyticsData(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc7/w7;->P(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/q8;

    invoke-direct {v2, v0, p1, p2}, Lc7/q8;-><init>(Lc7/w7;J)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Conditional user property must not be null"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lc7/w7;->D(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/c8;

    invoke-direct {v2, v0, p1, p2, p3}, Lc7/c8;-><init>(Lc7/w7;Landroid/os/Bundle;J)V

    invoke-virtual {v1, v2}, Lc7/d6;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    const/16 v1, -0x14

    invoke-virtual {v0, p1, v1, p2, p3}, Lc7/w7;->C(Landroid/os/Bundle;IJ)V

    return-void
.end method

.method public setCurrentScreen(Lr6/b;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p4}, Lc7/k6;->D()Lc7/p9;

    move-result-object p4

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p4, p1, p2, p3}, Lc7/p9;->C(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/e3;->q()V

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/k8;

    invoke-direct {v2, v0, p1}, Lc7/k8;-><init>(Lc7/w7;Z)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/z7;

    invoke-direct {v2, v0, p1}, Lc7/z7;-><init>(Lc7/w7;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p1

    invoke-virtual {p1}, Lc7/d6;->E()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/w7;->I(Lc7/s7;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/measurement/internal/a;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/measurement/internal/a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$b;)V

    invoke-virtual {p1, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/zzdb;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->C()Lc7/w7;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lc7/w7;->N(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/m8;

    invoke-direct {v2, v0, p1, p2}, Lc7/m8;-><init>(Lc7/w7;J)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "User ID must be non-empty or null"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v2, Lc7/d8;

    invoke-direct {v2, v1, p1}, Lc7/d8;-><init>(Lc7/w7;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    const/4 v5, 0x1

    const-string v3, "_id"

    move-object v4, p1

    move-wide v6, p2

    invoke-virtual/range {v1 .. v7}, Lc7/w7;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lr6/b;ZJ)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    invoke-static {p3}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object v3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lc7/w7;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Ljava/util/Map;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zza()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc7/r7;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService$a;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1, v1}, Lc7/w7;->t0(Lc7/r7;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
