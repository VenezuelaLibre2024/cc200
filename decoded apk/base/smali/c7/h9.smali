.class public final Lc7/h9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Z

.field public final synthetic l:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/h9;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p3, p0, Lc7/h9;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/h9;->j:Ljava/lang/String;

    iput-boolean p5, p0, Lc7/h9;->k:Z

    iput-object p1, p0, Lc7/h9;->l:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/h9;->l:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->E()Lc7/y9;

    move-result-object v0

    iget-object v1, p0, Lc7/h9;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    iget-object v2, p0, Lc7/h9;->i:Ljava/lang/String;

    iget-object v3, p0, Lc7/h9;->j:Ljava/lang/String;

    iget-boolean v4, p0, Lc7/h9;->k:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lc7/y9;->J(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
