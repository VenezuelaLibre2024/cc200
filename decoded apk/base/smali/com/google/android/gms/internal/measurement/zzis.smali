.class public Lcom/google/android/gms/internal/measurement/zzis;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzis$zza;
    }
.end annotation


# static fields
.field public static final zza:Lcom/google/android/gms/internal/measurement/zzis;

.field private static volatile zzb:Z = false

.field private static zzc:Z = true

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/zzis;


# instance fields
.field private final zze:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/internal/measurement/zzis$zza;",
            "Lcom/google/android/gms/internal/measurement/zzjf$zzf<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzis;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzis;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzis;->zza:Lcom/google/android/gms/internal/measurement/zzis;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzis;->zze:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzis;->zze:Ljava/util/Map;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/measurement/zzis;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/measurement/zzis;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzis;->zzd:Lcom/google/android/gms/internal/measurement/zzis;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzis;->zzd:Lcom/google/android/gms/internal/measurement/zzis;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjd;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzis;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzis;->zzd:Lcom/google/android/gms/internal/measurement/zzis;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/measurement/zzkr;I)Lcom/google/android/gms/internal/measurement/zzjf$zzf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/android/gms/internal/measurement/zzkr;",
            ">(TContainingType;I)",
            "Lcom/google/android/gms/internal/measurement/zzjf$zzf<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzis;->zze:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzis$zza;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/measurement/zzis$zza;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjf$zzf;

    return-object p1
.end method
