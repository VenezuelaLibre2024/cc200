.class public abstract Lcom/google/android/gms/internal/measurement/zzij;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile zzd:I = 0x64


# instance fields
.field public zza:I

.field public zzb:I

.field public zzc:Lcom/google/android/gms/internal/measurement/zzin;

.field private zze:I

.field private zzf:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/google/android/gms/internal/measurement/zzij;->zzd:I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzb:I

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zze:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzij;->zzf:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzik;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzij;-><init>()V

    return-void
.end method

.method public static zza(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method

.method public static zza([BIIZ)Lcom/google/android/gms/internal/measurement/zzij;
    .locals 6

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzii;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzii;-><init>([BIIZLcom/google/android/gms/internal/measurement/zzil;)V

    :try_start_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/zzij;->zza(I)I
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzjq; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static zze(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public abstract zza()D
.end method

.method public abstract zza(I)I
.end method

.method public abstract zzb()F
.end method

.method public abstract zzb(I)V
.end method

.method public abstract zzc()I
.end method

.method public abstract zzc(I)V
.end method

.method public abstract zzd()I
.end method

.method public abstract zzd(I)Z
.end method

.method public abstract zze()I
.end method

.method public abstract zzf()I
.end method

.method public abstract zzg()I
.end method

.method public abstract zzh()I
.end method

.method public abstract zzi()I
.end method

.method public abstract zzj()I
.end method

.method public abstract zzk()J
.end method

.method public abstract zzl()J
.end method

.method public abstract zzm()J
.end method

.method public abstract zzn()J
.end method

.method public abstract zzo()J
.end method

.method public abstract zzp()J
.end method

.method public abstract zzq()Lcom/google/android/gms/internal/measurement/zzhu;
.end method

.method public abstract zzr()Ljava/lang/String;
.end method

.method public abstract zzs()Ljava/lang/String;
.end method

.method public abstract zzt()Z
.end method

.method public abstract zzu()Z
.end method
