.class public final Lcom/google/android/gms/internal/measurement/zzqf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh7/u<",
        "Lcom/google/android/gms/internal/measurement/zzqe;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzqf;


# instance fields
.field private final zzb:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Lcom/google/android/gms/internal/measurement/zzqe;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzqf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzqf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzqf;->zza:Lcom/google/android/gms/internal/measurement/zzqf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzqh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzqh;-><init>()V

    invoke-static {v0}, Lh7/v;->b(Ljava/lang/Object;)Lh7/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzqf;->zzb:Lh7/u;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqf;->zza:Lcom/google/android/gms/internal/measurement/zzqf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzqf;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzqe;->zza()Z

    move-result v0

    return v0
.end method

.method public static zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqf;->zza:Lcom/google/android/gms/internal/measurement/zzqf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzqf;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzqe;->zzb()Z

    move-result v0

    return v0
.end method

.method public static zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzqf;->zza:Lcom/google/android/gms/internal/measurement/zzqf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzqf;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzqe;->zzc()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzqf;->zzb:Lh7/u;

    invoke-interface {v0}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzqe;

    return-object v0
.end method