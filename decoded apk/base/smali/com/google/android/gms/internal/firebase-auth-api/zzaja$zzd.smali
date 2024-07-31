.class public abstract Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaja;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzakm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzaja;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaja<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakm;"
    }
.end annotation


# instance fields
.field public zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzais<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzc;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzais;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzais<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->zzf()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzais;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzais;

    return-object v0
.end method
