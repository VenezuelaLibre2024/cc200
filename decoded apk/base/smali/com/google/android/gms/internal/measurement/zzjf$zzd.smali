.class public abstract Lcom/google/android/gms/internal/measurement/zzjf$zzd;
.super Lcom/google/android/gms/internal/measurement/zzjf;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzkt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzjf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/zzjf$zzd<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/measurement/zzjf<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/measurement/zzkt;"
    }
.end annotation


# instance fields
.field public zzc:Lcom/google/android/gms/internal/measurement/zziy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zziy<",
            "Lcom/google/android/gms/internal/measurement/zzjf$zzc;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjf;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zziy;->zzb()Lcom/google/android/gms/internal/measurement/zziy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zziy;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/measurement/zziy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zziy<",
            "Lcom/google/android/gms/internal/measurement/zzjf$zzc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zziy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zziy;->zzf()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zziy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zziy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zziy;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zziy;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zziy;

    return-object v0
.end method