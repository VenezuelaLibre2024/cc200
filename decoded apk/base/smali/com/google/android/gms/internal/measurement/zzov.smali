.class public final Lcom/google/android/gms/internal/measurement/zzov;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh7/u<",
        "Lcom/google/android/gms/internal/measurement/zzou;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzov;


# instance fields
.field private final zzb:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Lcom/google/android/gms/internal/measurement/zzou;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzov;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzov;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzov;->zza:Lcom/google/android/gms/internal/measurement/zzov;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzox;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzox;-><init>()V

    invoke-static {v0}, Lh7/v;->b(Ljava/lang/Object;)Lh7/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzov;->zzb:Lh7/u;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzov;->zza:Lcom/google/android/gms/internal/measurement/zzov;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzov;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzou;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzou;->zza()Z

    move-result v0

    return v0
.end method

.method public static zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzov;->zza:Lcom/google/android/gms/internal/measurement/zzov;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzov;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzou;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzou;->zzb()Z

    move-result v0

    return v0
.end method

.method public static zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzov;->zza:Lcom/google/android/gms/internal/measurement/zzov;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzov;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzou;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzou;->zzc()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzov;->zzb:Lh7/u;

    invoke-interface {v0}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzou;

    return-object v0
.end method