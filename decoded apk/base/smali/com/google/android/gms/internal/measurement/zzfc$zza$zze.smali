.class public final enum Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzjk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzfc$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zze"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzjk;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

.field public static final enum zzb:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

.field public static final enum zzc:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

.field public static final enum zzd:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

.field public static final enum zze:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

.field private static final zzf:Lcom/google/android/gms/internal/measurement/zzjj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjj<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic zzg:[Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;


# instance fields
.field private final zzh:I


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const-string v1, "CONSENT_TYPE_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zza:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const-string v3, "AD_STORAGE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzb:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    new-instance v3, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const-string v5, "ANALYTICS_STORAGE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    new-instance v5, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const-string v7, "AD_USER_DATA"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzd:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const-string v9, "AD_PERSONALIZATION"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zze:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzg:[Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzfg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzf:Lcom/google/android/gms/internal/measurement/zzjj;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzh:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzg:[Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object v0
.end method

.method public static zza(I)Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zze:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzd:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object p0

    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzb:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object p0

    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zza:Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    return-object p0
.end method

.method public static zzb()Lcom/google/android/gms/internal/measurement/zzjm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzff;->zza:Lcom/google/android/gms/internal/measurement/zzjm;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzh:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zza$zze;->zzh:I

    return v0
.end method
