.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzsc;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaja;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzakm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaja<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzsc;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;",
        ">;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakm;"
    }
.end annotation


# static fields
.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

.field private static volatile zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzakx<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzsc;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zze:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaja;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;-><init>()V

    return-void
.end method

.method private final zza(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zze:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzsc;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zza(I)V

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zzl()Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;

    return-object v0
.end method

.method public static synthetic zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzsc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    return-object v0
.end method

.method public static zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzsc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zze:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/zzsb;->zza:[I

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zza;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaja;)V

    sput-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    return-object p1

    :pswitch_4
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b"

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzakk;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzsc$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzsb;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzsc;-><init>()V

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