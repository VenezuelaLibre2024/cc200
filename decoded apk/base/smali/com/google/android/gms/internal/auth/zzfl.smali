.class abstract Lcom/google/android/gms/internal/auth/zzfl;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Lcom/google/android/gms/internal/auth/zzfl;

.field private static final zzb:Lcom/google/android/gms/internal/auth/zzfl;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/zzfh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/zzfh;-><init>(Lcom/google/android/gms/internal/auth/zzfg;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/zzfl;->zza:Lcom/google/android/gms/internal/auth/zzfl;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzfj;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/zzfj;-><init>(Lcom/google/android/gms/internal/auth/zzfi;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/zzfl;->zzb:Lcom/google/android/gms/internal/auth/zzfl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/zzfk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/auth/zzfl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzfl;->zza:Lcom/google/android/gms/internal/auth/zzfl;

    return-object v0
.end method

.method public static zzd()Lcom/google/android/gms/internal/auth/zzfl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/auth/zzfl;->zzb:Lcom/google/android/gms/internal/auth/zzfl;

    return-object v0
.end method


# virtual methods
.method public abstract zza(Ljava/lang/Object;J)V
.end method

.method public abstract zzb(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
