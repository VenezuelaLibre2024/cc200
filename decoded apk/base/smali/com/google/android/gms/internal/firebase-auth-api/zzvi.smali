.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzvi;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaja;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzakm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaja<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzvi;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;",
        ">;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakm;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

.field private static volatile zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakx<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzvi;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzajg<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaja;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zzl()Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;

    return-object v0
.end method

.method private final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzajg;)Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvi;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvi;Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;)V

    return-void
.end method

.method public static synthetic zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    return-object v0
.end method

.method private final zzc(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zze:I

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;

    return-object p1
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzvj;->zza:[I

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zza;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaja;)V

    sput-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-class p3, Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zzb;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzvi$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzvj;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzvi;-><init>()V

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