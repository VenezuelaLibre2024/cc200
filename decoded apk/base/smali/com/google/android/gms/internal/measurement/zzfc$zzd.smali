.class public final Lcom/google/android/gms/internal/measurement/zzfc$zzd;
.super Lcom/google/android/gms/internal/measurement/zzjf;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzkt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzfc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzjf<",
        "Lcom/google/android/gms/internal/measurement/zzfc$zzd;",
        "Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzkt;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

.field private static volatile zzd:Lcom/google/android/gms/internal/measurement/zzle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzle<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzd;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:J

.field private zzg:Ljava/lang/String;

.field private zzh:I

.field private zzi:Lcom/google/android/gms/internal/measurement/zzjn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjn<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzg;",
            ">;"
        }
    .end annotation
.end field

.field private zzj:Lcom/google/android/gms/internal/measurement/zzjn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjn<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzc;",
            ">;"
        }
    .end annotation
.end field

.field private zzk:Lcom/google/android/gms/internal/measurement/zzjn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjn<",
            "Lcom/google/android/gms/internal/measurement/zzew$zza;",
            ">;"
        }
    .end annotation
.end field

.field private zzl:Ljava/lang/String;

.field private zzm:Z

.field private zzn:Lcom/google/android/gms/internal/measurement/zzjn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjn<",
            "Lcom/google/android/gms/internal/measurement/zzfp$zzc;",
            ">;"
        }
    .end annotation
.end field

.field private zzo:Lcom/google/android/gms/internal/measurement/zzjn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzjn<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzb;",
            ">;"
        }
    .end annotation
.end field

.field private zzp:Ljava/lang/String;

.field private zzq:Ljava/lang/String;

.field private zzr:Lcom/google/android/gms/internal/measurement/zzfc$zza;

.field private zzs:Lcom/google/android/gms/internal/measurement/zzfc$zze;

.field private zzt:Lcom/google/android/gms/internal/measurement/zzfc$zzh;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    const-class v1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzjf;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzjf;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzg:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzi:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzk:Lcom/google/android/gms/internal/measurement/zzjn;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzl:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzn:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzo:Lcom/google/android/gms/internal/measurement/zzjn;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzp:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzq:Ljava/lang/String;

    return-void
.end method

.method private final zza(ILcom/google/android/gms/internal/measurement/zzfc$zzc;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzjn;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zza(Lcom/google/android/gms/internal/measurement/zzjn;)Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzfc$zzd;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzt()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzfc$zzd;ILcom/google/android/gms/internal/measurement/zzfc$zzc;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zza(ILcom/google/android/gms/internal/measurement/zzfc$zzc;)V

    return-void
.end method

.method public static zze()Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzbx()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;

    return-object v0
.end method

.method public static synthetic zzf()Lcom/google/android/gms/internal/measurement/zzfc$zzd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    return-object v0
.end method

.method public static zzg()Lcom/google/android/gms/internal/measurement/zzfc$zzd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    return-object v0
.end method

.method private final zzt()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcc()Lcom/google/android/gms/internal/measurement/zzjn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzk:Lcom/google/android/gms/internal/measurement/zzjn;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzn:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zza(I)Lcom/google/android/gms/internal/measurement/zzfc$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzfc$zzc;

    return-object p1
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/measurement/zzfb;->zza:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzle;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzle;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzjf$zza;

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/zzjf$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzjf;)V

    sput-object p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzd:Lcom/google/android/gms/internal/measurement/zzle;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    return-object p1

    :pswitch_4
    const/16 p1, 0x15

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzg"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lcom/google/android/gms/internal/measurement/zzfc$zzg;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lcom/google/android/gms/internal/measurement/zzfc$zzc;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, Lcom/google/android/gms/internal/measurement/zzew$zza;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-class p3, Lcom/google/android/gms/internal/measurement/zzfp$zzc;

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Lcom/google/android/gms/internal/measurement/zzfc$zzb;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzr"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    const-string p3, "zzs"

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzt"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\u0008\u0011\u1009\t"

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzc:Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzjf;->zza(Lcom/google/android/gms/internal/measurement/zzkr;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/zzfc$zzd$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzfb;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzb()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzj:Lcom/google/android/gms/internal/measurement/zzjn;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final zzc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzf:J

    return-wide v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/measurement/zzfc$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzr:Lcom/google/android/gms/internal/measurement/zzfc$zza;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfc$zza;->zzb()Lcom/google/android/gms/internal/measurement/zzfc$zza;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/measurement/zzfc$zzh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzt:Lcom/google/android/gms/internal/measurement/zzfc$zzh;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfc$zzh;->zzb()Lcom/google/android/gms/internal/measurement/zzfc$zzh;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzp:Ljava/lang/String;

    return-object v0
.end method

.method public final zzk()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzew$zza;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzk:Lcom/google/android/gms/internal/measurement/zzjn;

    return-object v0
.end method

.method public final zzl()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzo:Lcom/google/android/gms/internal/measurement/zzjn;

    return-object v0
.end method

.method public final zzm()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfp$zzc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzn:Lcom/google/android/gms/internal/measurement/zzjn;

    return-object v0
.end method

.method public final zzn()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfc$zzg;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzi:Lcom/google/android/gms/internal/measurement/zzjn;

    return-object v0
.end method

.method public final zzo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzm:Z

    return v0
.end method

.method public final zzp()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zze:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzq()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zze:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzr()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zze:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzs()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zze:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
