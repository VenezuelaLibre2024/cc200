.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzmj;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:[I

.field private static final zzb:[I

.field private static final zzc:[I

.field private static final zzd:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb:[I

    const/4 v0, 0x2

    new-array v1, v0, [I

    fill-array-data v1, :array_2

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzc:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzd:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x3
        0x6
        0x9
        0xc
        0x10
        0x13
        0x16
        0x19
        0x1c
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x2
        0x3
        0x5
        0x6
        0x0
        0x1
        0x3
        0x4
        0x6
    .end array-data

    :array_2
    .array-data 4
        0x3ffffff
        0x1ffffff
    .end array-data

    :array_3
    .array-data 4
        0x1a
        0x19
    .end array-data
.end method

.method public static zza([J)V
    .locals 12

    const/16 v0, 0xa

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x1a

    const-wide/32 v6, 0x4000000

    if-ge v4, v0, :cond_0

    aget-wide v8, p0, v4

    div-long/2addr v8, v6

    aget-wide v6, p0, v4

    shl-long v10, v8, v5

    sub-long/2addr v6, v10

    aput-wide v6, p0, v4

    add-int/lit8 v5, v4, 0x1

    aget-wide v6, p0, v5

    add-long/2addr v6, v8

    aput-wide v6, p0, v5

    aget-wide v6, p0, v5

    const-wide/32 v8, 0x2000000

    div-long/2addr v6, v8

    aget-wide v8, p0, v5

    const/16 v10, 0x19

    shl-long v10, v6, v10

    sub-long/2addr v8, v10

    aput-wide v8, p0, v5

    add-int/lit8 v4, v4, 0x2

    aget-wide v8, p0, v4

    add-long/2addr v8, v6

    aput-wide v8, p0, v4

    goto :goto_0

    :cond_0
    aget-wide v8, p0, v3

    aget-wide v10, p0, v0

    const/4 v4, 0x4

    shl-long/2addr v10, v4

    add-long/2addr v8, v10

    aput-wide v8, p0, v3

    aget-wide v8, p0, v3

    aget-wide v10, p0, v0

    const/4 v4, 0x1

    shl-long/2addr v10, v4

    add-long/2addr v8, v10

    aput-wide v8, p0, v3

    aget-wide v8, p0, v3

    aget-wide v10, p0, v0

    add-long/2addr v8, v10

    aput-wide v8, p0, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v3

    div-long/2addr v0, v6

    aget-wide v6, p0, v3

    shl-long v8, v0, v5

    sub-long/2addr v6, v8

    aput-wide v6, p0, v3

    aget-wide v2, p0, v4

    add-long/2addr v2, v0

    aput-wide v2, p0, v4

    return-void
.end method

.method public static zza([J[J)V
    .locals 11

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v4, v0, [J

    new-array v5, v0, [J

    new-array v6, v0, [J

    new-array v7, v0, [J

    new-array v8, v0, [J

    new-array v9, v0, [J

    new-array v10, v0, [J

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v2, v9, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v4, v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v5, v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    const/4 p1, 0x2

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    invoke-static {v6, v10, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    move v1, p1

    :goto_1
    const/16 v2, 0x14

    if-ge v1, v2, :cond_1

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_1
    invoke-static {v9, v10, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    move v1, p1

    :goto_2
    if-ge v1, v0, :cond_2

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_2
    invoke-static {v7, v9, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    move v0, p1

    :goto_3
    const/16 v1, 0x32

    if-ge v0, v1, :cond_3

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_3

    :cond_3
    invoke-static {v8, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v10, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    move v0, p1

    :goto_4
    const/16 v2, 0x64

    if-ge v0, v2, :cond_4

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_4

    :cond_4
    invoke-static {v10, v9, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    :goto_5
    if-ge p1, v1, :cond_5

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    add-int/lit8 p1, p1, 0x2

    goto :goto_5

    :cond_5
    invoke-static {v9, v10, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {v10, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J)V

    invoke-static {p0, v10, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J[J[J)V

    return-void
.end method

.method public static zza([J[JJ)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    mul-long/2addr v1, p2

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static zza([J[J[J)V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [J

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J[J[J)V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zze([J[J)V

    return-void
.end method

.method public static zza([B)[J
    .locals 9

    const/16 v0, 0xa

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza:[I

    aget v4, v3, v2

    aget-byte v4, p0, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    aget v6, v3, v2

    add-int/lit8 v6, v6, 0x1

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    aget v6, v3, v2

    add-int/lit8 v6, v6, 0x2

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    aget v3, v3, v2

    add-int/lit8 v3, v3, 0x3

    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v6, v3

    const/16 v3, 0x18

    shl-long/2addr v6, v3

    or-long v3, v4, v6

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb:[I

    aget v5, v5, v2

    shr-long/2addr v3, v5

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzc:[I

    and-int/lit8 v6, v2, 0x1

    aget v5, v5, v6

    int-to-long v5, v5

    and-long/2addr v3, v5

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static zzb([J)V
    .locals 8

    const/16 v0, 0x8

    aget-wide v1, p0, v0

    const/16 v3, 0x12

    aget-wide v4, p0, v3

    const/4 v6, 0x4

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    const/4 v7, 0x1

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    const/16 v3, 0x11

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    const/16 v3, 0x10

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    const/16 v3, 0xf

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v6

    const/16 v2, 0xe

    aget-wide v3, p0, v2

    shl-long/2addr v3, v6

    add-long/2addr v0, v3

    aput-wide v0, p0, v6

    aget-wide v0, p0, v6

    aget-wide v3, p0, v2

    shl-long/2addr v3, v7

    add-long/2addr v0, v3

    aput-wide v0, p0, v6

    aget-wide v0, p0, v6

    aget-wide v2, p0, v2

    add-long/2addr v0, v2

    aput-wide v0, p0, v6

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    const/16 v3, 0xd

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    const/16 v3, 0xc

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v7

    const/16 v2, 0xb

    aget-wide v3, p0, v2

    shl-long/2addr v3, v6

    add-long/2addr v0, v3

    aput-wide v0, p0, v7

    aget-wide v0, p0, v7

    aget-wide v3, p0, v2

    shl-long/2addr v3, v7

    add-long/2addr v0, v3

    aput-wide v0, p0, v7

    aget-wide v0, p0, v7

    aget-wide v2, p0, v2

    add-long/2addr v0, v2

    aput-wide v0, p0, v7

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    const/16 v3, 0xa

    aget-wide v4, p0, v3

    shl-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v4, p0, v3

    shl-long/2addr v4, v7

    add-long/2addr v1, v4

    aput-wide v1, p0, v0

    aget-wide v1, p0, v0

    aget-wide v3, p0, v3

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method public static zzb([J[J)V
    .locals 24

    const/16 v0, 0x13

    new-array v0, v0, [J

    const/4 v1, 0x0

    aget-wide v2, p1, v1

    aget-wide v4, p1, v1

    mul-long/2addr v2, v4

    aput-wide v2, v0, v1

    aget-wide v2, p1, v1

    const-wide/16 v4, 0x2

    mul-long/2addr v2, v4

    const/4 v6, 0x1

    aget-wide v7, p1, v6

    mul-long/2addr v2, v7

    aput-wide v2, v0, v6

    aget-wide v2, p1, v6

    aget-wide v7, p1, v6

    mul-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/4 v9, 0x2

    aget-wide v10, p1, v9

    mul-long/2addr v7, v10

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v9

    aget-wide v2, p1, v6

    aget-wide v7, p1, v9

    mul-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/4 v10, 0x3

    aget-wide v11, p1, v10

    mul-long/2addr v7, v11

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v10

    aget-wide v2, p1, v9

    aget-wide v7, p1, v9

    mul-long/2addr v2, v7

    aget-wide v7, p1, v6

    const-wide/16 v11, 0x4

    mul-long/2addr v7, v11

    aget-wide v13, p1, v10

    mul-long/2addr v7, v13

    add-long/2addr v2, v7

    aget-wide v7, p1, v1

    mul-long/2addr v7, v4

    const/4 v13, 0x4

    aget-wide v14, p1, v13

    mul-long/2addr v7, v14

    add-long/2addr v2, v7

    aput-wide v2, v0, v13

    aget-wide v2, p1, v9

    aget-wide v7, p1, v10

    mul-long/2addr v2, v7

    aget-wide v7, p1, v6

    aget-wide v14, p1, v13

    mul-long/2addr v7, v14

    add-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/4 v14, 0x5

    aget-wide v15, p1, v14

    mul-long/2addr v7, v15

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v14

    aget-wide v2, p1, v10

    aget-wide v7, p1, v10

    mul-long/2addr v2, v7

    aget-wide v7, p1, v9

    aget-wide v15, p1, v13

    mul-long/2addr v7, v15

    add-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/4 v15, 0x6

    aget-wide v16, p1, v15

    mul-long v7, v7, v16

    add-long/2addr v2, v7

    aget-wide v7, p1, v6

    mul-long/2addr v7, v4

    aget-wide v16, p1, v14

    mul-long v7, v7, v16

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v15

    aget-wide v2, p1, v10

    aget-wide v7, p1, v13

    mul-long/2addr v2, v7

    aget-wide v7, p1, v9

    aget-wide v16, p1, v14

    mul-long v7, v7, v16

    add-long/2addr v2, v7

    aget-wide v7, p1, v6

    aget-wide v16, p1, v15

    mul-long v7, v7, v16

    add-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/16 v16, 0x7

    aget-wide v17, p1, v16

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v16

    aget-wide v2, p1, v13

    aget-wide v7, p1, v13

    mul-long/2addr v2, v7

    aget-wide v7, p1, v9

    aget-wide v17, p1, v15

    mul-long v7, v7, v17

    aget-wide v17, p1, v1

    const/16 v19, 0x8

    aget-wide v20, p1, v19

    mul-long v17, v17, v20

    add-long v7, v7, v17

    aget-wide v17, p1, v6

    aget-wide v20, p1, v16

    mul-long v17, v17, v20

    aget-wide v20, p1, v10

    aget-wide v22, p1, v14

    mul-long v20, v20, v22

    add-long v17, v17, v20

    mul-long v17, v17, v4

    add-long v7, v7, v17

    mul-long/2addr v7, v4

    add-long/2addr v2, v7

    aput-wide v2, v0, v19

    aget-wide v2, p1, v13

    aget-wide v7, p1, v14

    mul-long/2addr v2, v7

    aget-wide v7, p1, v10

    aget-wide v17, p1, v15

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    aget-wide v7, p1, v9

    aget-wide v17, p1, v16

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    aget-wide v7, p1, v6

    aget-wide v17, p1, v19

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    aget-wide v7, p1, v1

    const/16 v1, 0x9

    aget-wide v17, p1, v1

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    aput-wide v2, v0, v1

    aget-wide v2, p1, v14

    aget-wide v7, p1, v14

    mul-long/2addr v2, v7

    aget-wide v7, p1, v13

    aget-wide v17, p1, v15

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    aget-wide v7, p1, v9

    aget-wide v17, p1, v19

    mul-long v7, v7, v17

    add-long/2addr v2, v7

    aget-wide v7, p1, v10

    aget-wide v17, p1, v16

    mul-long v7, v7, v17

    aget-wide v17, p1, v6

    aget-wide v20, p1, v1

    mul-long v17, v17, v20

    add-long v7, v7, v17

    mul-long/2addr v7, v4

    add-long/2addr v2, v7

    mul-long/2addr v2, v4

    const/16 v6, 0xa

    aput-wide v2, v0, v6

    aget-wide v2, p1, v14

    aget-wide v6, p1, v15

    mul-long/2addr v2, v6

    aget-wide v6, p1, v13

    aget-wide v17, p1, v16

    mul-long v6, v6, v17

    add-long/2addr v2, v6

    aget-wide v6, p1, v10

    aget-wide v17, p1, v19

    mul-long v6, v6, v17

    add-long/2addr v2, v6

    aget-wide v6, p1, v9

    aget-wide v8, p1, v1

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    const/16 v6, 0xb

    aput-wide v2, v0, v6

    aget-wide v2, p1, v15

    aget-wide v6, p1, v15

    mul-long/2addr v2, v6

    aget-wide v6, p1, v13

    aget-wide v8, p1, v19

    mul-long/2addr v6, v8

    aget-wide v8, p1, v14

    aget-wide v17, p1, v16

    mul-long v8, v8, v17

    aget-wide v17, p1, v10

    aget-wide v20, p1, v1

    mul-long v17, v17, v20

    add-long v8, v8, v17

    mul-long/2addr v8, v4

    add-long/2addr v6, v8

    mul-long/2addr v6, v4

    add-long/2addr v2, v6

    const/16 v6, 0xc

    aput-wide v2, v0, v6

    aget-wide v2, p1, v15

    aget-wide v6, p1, v16

    mul-long/2addr v2, v6

    aget-wide v6, p1, v14

    aget-wide v8, p1, v19

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    aget-wide v6, p1, v13

    aget-wide v8, p1, v1

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    const/16 v6, 0xd

    aput-wide v2, v0, v6

    aget-wide v2, p1, v16

    aget-wide v6, p1, v16

    mul-long/2addr v2, v6

    aget-wide v6, p1, v15

    aget-wide v8, p1, v19

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    aget-wide v6, p1, v14

    mul-long/2addr v6, v4

    aget-wide v8, p1, v1

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    const/16 v6, 0xe

    aput-wide v2, v0, v6

    aget-wide v2, p1, v16

    aget-wide v6, p1, v19

    mul-long/2addr v2, v6

    aget-wide v6, p1, v15

    aget-wide v8, p1, v1

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    const/16 v6, 0xf

    aput-wide v2, v0, v6

    aget-wide v2, p1, v19

    aget-wide v6, p1, v19

    mul-long/2addr v2, v6

    aget-wide v6, p1, v16

    mul-long/2addr v6, v11

    aget-wide v8, p1, v1

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    const/16 v6, 0x10

    aput-wide v2, v0, v6

    aget-wide v2, p1, v19

    mul-long/2addr v2, v4

    aget-wide v6, p1, v1

    mul-long/2addr v2, v6

    const/16 v6, 0x11

    aput-wide v2, v0, v6

    aget-wide v2, p1, v1

    mul-long/2addr v2, v4

    aget-wide v4, p1, v1

    mul-long/2addr v2, v4

    const/16 v1, 0x12

    aput-wide v2, v0, v1

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zze([J[J)V

    return-void
.end method

.method public static zzb([J[J[J)V
    .locals 18

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    mul-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v1, p1, v0

    const/4 v3, 0x1

    aget-wide v4, p2, v3

    mul-long/2addr v1, v4

    aget-wide v4, p1, v3

    aget-wide v6, p2, v0

    mul-long/2addr v4, v6

    add-long/2addr v1, v4

    aput-wide v1, p0, v3

    aget-wide v1, p1, v3

    const-wide/16 v4, 0x2

    mul-long/2addr v1, v4

    aget-wide v6, p2, v3

    mul-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v8, 0x2

    aget-wide v9, p2, v8

    mul-long/2addr v6, v9

    add-long/2addr v1, v6

    aget-wide v6, p1, v8

    aget-wide v9, p2, v0

    mul-long/2addr v6, v9

    add-long/2addr v1, v6

    aput-wide v1, p0, v8

    aget-wide v1, p1, v3

    aget-wide v6, p2, v8

    mul-long/2addr v1, v6

    aget-wide v6, p1, v8

    aget-wide v9, p2, v3

    mul-long/2addr v6, v9

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v9, 0x3

    aget-wide v10, p2, v9

    mul-long/2addr v6, v10

    add-long/2addr v1, v6

    aget-wide v6, p1, v9

    aget-wide v10, p2, v0

    mul-long/2addr v6, v10

    add-long/2addr v1, v6

    aput-wide v1, p0, v9

    aget-wide v1, p1, v8

    aget-wide v6, p2, v8

    mul-long/2addr v1, v6

    aget-wide v6, p1, v3

    aget-wide v10, p2, v9

    mul-long/2addr v6, v10

    aget-wide v10, p1, v9

    aget-wide v12, p2, v3

    mul-long/2addr v10, v12

    add-long/2addr v6, v10

    mul-long/2addr v6, v4

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v10, 0x4

    aget-wide v11, p2, v10

    mul-long/2addr v6, v11

    add-long/2addr v1, v6

    aget-wide v6, p1, v10

    aget-wide v11, p2, v0

    mul-long/2addr v6, v11

    add-long/2addr v1, v6

    aput-wide v1, p0, v10

    aget-wide v1, p1, v8

    aget-wide v6, p2, v9

    mul-long/2addr v1, v6

    aget-wide v6, p1, v9

    aget-wide v11, p2, v8

    mul-long/2addr v6, v11

    add-long/2addr v1, v6

    aget-wide v6, p1, v3

    aget-wide v11, p2, v10

    mul-long/2addr v6, v11

    add-long/2addr v1, v6

    aget-wide v6, p1, v10

    aget-wide v11, p2, v3

    mul-long/2addr v6, v11

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v11, 0x5

    aget-wide v12, p2, v11

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    aget-wide v6, p1, v11

    aget-wide v12, p2, v0

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    aput-wide v1, p0, v11

    aget-wide v1, p1, v9

    aget-wide v6, p2, v9

    mul-long/2addr v1, v6

    aget-wide v6, p1, v3

    aget-wide v12, p2, v11

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    aget-wide v6, p1, v11

    aget-wide v12, p2, v3

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    mul-long/2addr v1, v4

    aget-wide v6, p1, v8

    aget-wide v12, p2, v10

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    aget-wide v6, p1, v10

    aget-wide v12, p2, v8

    mul-long/2addr v6, v12

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v12, 0x6

    aget-wide v13, p2, v12

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v12

    aget-wide v13, p2, v0

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aput-wide v1, p0, v12

    aget-wide v1, p1, v9

    aget-wide v6, p2, v10

    mul-long/2addr v1, v6

    aget-wide v6, p1, v10

    aget-wide v13, p2, v9

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v8

    aget-wide v13, p2, v11

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v11

    aget-wide v13, p2, v8

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v3

    aget-wide v13, p2, v12

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v12

    aget-wide v13, p2, v3

    mul-long/2addr v6, v13

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/4 v13, 0x7

    aget-wide v14, p2, v13

    mul-long/2addr v6, v14

    add-long/2addr v1, v6

    aget-wide v6, p1, v13

    aget-wide v14, p2, v0

    mul-long/2addr v6, v14

    add-long/2addr v1, v6

    aput-wide v1, p0, v13

    aget-wide v1, p1, v10

    aget-wide v6, p2, v10

    mul-long/2addr v1, v6

    aget-wide v6, p1, v9

    aget-wide v14, p2, v11

    mul-long/2addr v6, v14

    aget-wide v14, p1, v11

    aget-wide v16, p2, v9

    mul-long v14, v14, v16

    add-long/2addr v6, v14

    aget-wide v14, p1, v3

    aget-wide v16, p2, v13

    mul-long v14, v14, v16

    add-long/2addr v6, v14

    aget-wide v14, p1, v13

    aget-wide v16, p2, v3

    mul-long v14, v14, v16

    add-long/2addr v6, v14

    mul-long/2addr v6, v4

    add-long/2addr v1, v6

    aget-wide v6, p1, v8

    aget-wide v14, p2, v12

    mul-long/2addr v6, v14

    add-long/2addr v1, v6

    aget-wide v6, p1, v12

    aget-wide v14, p2, v8

    mul-long/2addr v6, v14

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/16 v14, 0x8

    aget-wide v15, p2, v14

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v14

    aget-wide v15, p2, v0

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aput-wide v1, p0, v14

    aget-wide v1, p1, v10

    aget-wide v6, p2, v11

    mul-long/2addr v1, v6

    aget-wide v6, p1, v11

    aget-wide v15, p2, v10

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v9

    aget-wide v15, p2, v12

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v12

    aget-wide v15, p2, v9

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v8

    aget-wide v15, p2, v13

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v13

    aget-wide v15, p2, v8

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v3

    aget-wide v15, p2, v14

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v14

    aget-wide v15, p2, v3

    mul-long/2addr v6, v15

    add-long/2addr v1, v6

    aget-wide v6, p1, v0

    const/16 v15, 0x9

    aget-wide v16, p2, v15

    mul-long v6, v6, v16

    add-long/2addr v1, v6

    aget-wide v6, p1, v15

    aget-wide v16, p2, v0

    mul-long v6, v6, v16

    add-long/2addr v1, v6

    aput-wide v1, p0, v15

    aget-wide v0, p1, v11

    aget-wide v6, p2, v11

    mul-long/2addr v0, v6

    aget-wide v6, p1, v9

    aget-wide v16, p2, v13

    mul-long v6, v6, v16

    add-long/2addr v0, v6

    aget-wide v6, p1, v13

    aget-wide v16, p2, v9

    mul-long v6, v6, v16

    add-long/2addr v0, v6

    aget-wide v6, p1, v3

    aget-wide v16, p2, v15

    mul-long v6, v6, v16

    add-long/2addr v0, v6

    aget-wide v6, p1, v15

    aget-wide v2, p2, v3

    mul-long/2addr v6, v2

    add-long/2addr v0, v6

    mul-long/2addr v0, v4

    aget-wide v2, p1, v10

    aget-wide v6, p2, v12

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v12

    aget-wide v6, p2, v10

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v8

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v8

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xa

    aput-wide v0, p0, v2

    aget-wide v0, p1, v11

    aget-wide v2, p2, v12

    mul-long/2addr v0, v2

    aget-wide v2, p1, v12

    aget-wide v6, p2, v11

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v10

    aget-wide v6, p2, v13

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v13

    aget-wide v6, p2, v10

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v9

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v9

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v8

    aget-wide v6, p2, v15

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v15

    aget-wide v6, p2, v8

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xb

    aput-wide v0, p0, v2

    aget-wide v0, p1, v12

    aget-wide v2, p2, v12

    mul-long/2addr v0, v2

    aget-wide v2, p1, v11

    aget-wide v6, p2, v13

    mul-long/2addr v2, v6

    aget-wide v6, p1, v13

    aget-wide v16, p2, v11

    mul-long v6, v6, v16

    add-long/2addr v2, v6

    aget-wide v6, p1, v9

    aget-wide v16, p2, v15

    mul-long v6, v6, v16

    add-long/2addr v2, v6

    aget-wide v6, p1, v15

    aget-wide v8, p2, v9

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    aget-wide v2, p1, v10

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v10

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xc

    aput-wide v0, p0, v2

    aget-wide v0, p1, v12

    aget-wide v2, p2, v13

    mul-long/2addr v0, v2

    aget-wide v2, p1, v13

    aget-wide v6, p2, v12

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v11

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v11

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v10

    aget-wide v6, p2, v15

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v15

    aget-wide v6, p2, v10

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xd

    aput-wide v0, p0, v2

    aget-wide v0, p1, v13

    aget-wide v2, p2, v13

    mul-long/2addr v0, v2

    aget-wide v2, p1, v11

    aget-wide v6, p2, v15

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v15

    aget-wide v6, p2, v11

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    mul-long/2addr v0, v4

    aget-wide v2, p1, v12

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v12

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xe

    aput-wide v0, p0, v2

    aget-wide v0, p1, v13

    aget-wide v2, p2, v14

    mul-long/2addr v0, v2

    aget-wide v2, p1, v14

    aget-wide v6, p2, v13

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v12

    aget-wide v6, p2, v15

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    aget-wide v2, p1, v15

    aget-wide v6, p2, v12

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0xf

    aput-wide v0, p0, v2

    aget-wide v0, p1, v14

    aget-wide v2, p2, v14

    mul-long/2addr v0, v2

    aget-wide v2, p1, v13

    aget-wide v6, p2, v15

    mul-long/2addr v2, v6

    aget-wide v6, p1, v15

    aget-wide v8, p2, v13

    mul-long/2addr v6, v8

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    const/16 v2, 0x10

    aput-wide v0, p0, v2

    aget-wide v0, p1, v14

    aget-wide v2, p2, v15

    mul-long/2addr v0, v2

    aget-wide v2, p1, v15

    aget-wide v6, p2, v14

    mul-long/2addr v2, v6

    add-long/2addr v0, v2

    const/16 v2, 0x11

    aput-wide v0, p0, v2

    aget-wide v0, p1, v15

    mul-long/2addr v0, v4

    aget-wide v2, p2, v15

    mul-long/2addr v0, v2

    const/16 v2, 0x12

    aput-wide v0, p0, v2

    return-void
.end method

.method public static zzc([J[J)V
    .locals 0

    invoke-static {p0, p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzc([J[J[J)V

    return-void
.end method

.method public static zzc([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    sub-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static zzc([J)[B
    .locals 17

    const/16 v0, 0xa

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-wide/16 v4, 0x13

    const/16 v6, 0x19

    const/16 v7, 0x1f

    const/4 v8, 0x2

    const/16 v9, 0x9

    if-ge v3, v8, :cond_1

    move v8, v2

    :goto_1
    if-ge v8, v9, :cond_0

    aget-wide v10, v1, v8

    aget-wide v12, v1, v8

    shr-long/2addr v12, v7

    and-long/2addr v10, v12

    sget-object v12, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzd:[I

    and-int/lit8 v13, v8, 0x1

    aget v14, v12, v13

    shr-long/2addr v10, v14

    long-to-int v10, v10

    neg-int v10, v10

    aget-wide v14, v1, v8

    aget v11, v12, v13

    shl-int v11, v10, v11

    int-to-long v11, v11

    add-long/2addr v14, v11

    aput-wide v14, v1, v8

    add-int/lit8 v8, v8, 0x1

    aget-wide v11, v1, v8

    int-to-long v13, v10

    sub-long/2addr v11, v13

    aput-wide v11, v1, v8

    goto :goto_1

    :cond_0
    aget-wide v10, v1, v9

    aget-wide v12, v1, v9

    shr-long v7, v12, v7

    and-long/2addr v7, v10

    shr-long v6, v7, v6

    long-to-int v6, v6

    neg-int v6, v6

    aget-wide v7, v1, v9

    shl-int/lit8 v10, v6, 0x19

    int-to-long v10, v10

    add-long/2addr v7, v10

    aput-wide v7, v1, v9

    aget-wide v7, v1, v2

    int-to-long v9, v6

    mul-long/2addr v9, v4

    sub-long/2addr v7, v9

    aput-wide v7, v1, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    aget-wide v10, v1, v2

    aget-wide v12, v1, v2

    shr-long/2addr v12, v7

    and-long/2addr v10, v12

    const/16 v3, 0x1a

    shr-long/2addr v10, v3

    long-to-int v3, v10

    neg-int v3, v3

    aget-wide v10, v1, v2

    shl-int/lit8 v12, v3, 0x1a

    int-to-long v12, v12

    add-long/2addr v10, v12

    aput-wide v10, v1, v2

    const/4 v10, 0x1

    aget-wide v11, v1, v10

    int-to-long v13, v3

    sub-long/2addr v11, v13

    aput-wide v11, v1, v10

    move v3, v2

    :goto_2
    if-ge v3, v8, :cond_3

    move v11, v2

    :goto_3
    if-ge v11, v9, :cond_2

    aget-wide v12, v1, v11

    sget-object v14, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzd:[I

    and-int/lit8 v15, v11, 0x1

    aget v14, v14, v15

    shr-long/2addr v12, v14

    long-to-int v12, v12

    aget-wide v13, v1, v11

    sget-object v16, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzc:[I

    aget v15, v16, v15

    int-to-long v7, v15

    and-long/2addr v7, v13

    aput-wide v7, v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-wide v7, v1, v11

    int-to-long v12, v12

    add-long/2addr v7, v12

    aput-wide v7, v1, v11

    const/16 v7, 0x1f

    const/4 v8, 0x2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    const/16 v7, 0x1f

    const/4 v8, 0x2

    goto :goto_2

    :cond_3
    aget-wide v7, v1, v9

    shr-long v6, v7, v6

    long-to-int v3, v6

    aget-wide v6, v1, v9

    const-wide/32 v11, 0x1ffffff

    and-long/2addr v6, v11

    aput-wide v6, v1, v9

    aget-wide v6, v1, v2

    int-to-long v8, v3

    mul-long/2addr v8, v4

    add-long/2addr v6, v8

    aput-wide v6, v1, v2

    aget-wide v3, v1, v2

    long-to-int v3, v3

    const v4, 0x3ffffed

    sub-int/2addr v3, v4

    const/16 v5, 0x1f

    shr-int/2addr v3, v5

    not-int v3, v3

    move v5, v10

    :goto_4
    if-ge v5, v0, :cond_4

    aget-wide v6, v1, v5

    long-to-int v6, v6

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzc:[I

    and-int/lit8 v8, v5, 0x1

    aget v7, v7, v8

    xor-int/2addr v6, v7

    not-int v6, v6

    shl-int/lit8 v7, v6, 0x10

    and-int/2addr v6, v7

    shl-int/lit8 v7, v6, 0x8

    and-int/2addr v6, v7

    shl-int/lit8 v7, v6, 0x4

    and-int/2addr v6, v7

    shl-int/lit8 v7, v6, 0x2

    and-int/2addr v6, v7

    shl-int/lit8 v7, v6, 0x1

    and-int/2addr v6, v7

    const/16 v7, 0x1f

    shr-int/2addr v6, v7

    and-int/2addr v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    aget-wide v5, v1, v2

    and-int/2addr v4, v3

    int-to-long v7, v4

    sub-long/2addr v5, v7

    aput-wide v5, v1, v2

    aget-wide v4, v1, v10

    const v6, 0x1ffffff

    and-int/2addr v6, v3

    int-to-long v6, v6

    sub-long/2addr v4, v6

    aput-wide v4, v1, v10

    const/4 v4, 0x2

    :goto_5
    if-ge v4, v0, :cond_5

    aget-wide v8, v1, v4

    const v5, 0x3ffffff

    and-int/2addr v5, v3

    int-to-long v11, v5

    sub-long/2addr v8, v11

    aput-wide v8, v1, v4

    add-int/lit8 v5, v4, 0x1

    aget-wide v8, v1, v5

    sub-long/2addr v8, v6

    aput-wide v8, v1, v5

    add-int/lit8 v4, v4, 0x2

    goto :goto_5

    :cond_5
    move v3, v2

    :goto_6
    if-ge v3, v0, :cond_6

    aget-wide v4, v1, v3

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb:[I

    aget v6, v6, v3

    shl-long/2addr v4, v6

    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_6
    const/16 v3, 0x20

    new-array v3, v3, [B

    :goto_7
    if-ge v2, v0, :cond_7

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza:[I

    aget v5, v4, v2

    aget-byte v6, v3, v5

    int-to-long v6, v6

    aget-wide v8, v1, v2

    const-wide/16 v11, 0xff

    and-long/2addr v8, v11

    or-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    aget v5, v4, v2

    add-int/2addr v5, v10

    aget-byte v6, v3, v5

    int-to-long v6, v6

    aget-wide v8, v1, v2

    const/16 v13, 0x8

    shr-long/2addr v8, v13

    and-long/2addr v8, v11

    or-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    aget v5, v4, v2

    const/4 v6, 0x2

    add-int/2addr v5, v6

    aget-byte v7, v3, v5

    int-to-long v7, v7

    aget-wide v13, v1, v2

    const/16 v9, 0x10

    shr-long/2addr v13, v9

    and-long/2addr v13, v11

    or-long/2addr v7, v13

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v3, v5

    aget v4, v4, v2

    add-int/lit8 v4, v4, 0x3

    aget-byte v5, v3, v4

    int-to-long v7, v5

    aget-wide v13, v1, v2

    const/16 v5, 0x18

    shr-long/2addr v13, v5

    and-long/2addr v11, v13

    or-long/2addr v7, v11

    long-to-int v5, v7

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_7
    return-object v3
.end method

.method public static zzd([J[J)V
    .locals 0

    invoke-static {p0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzd([J[J[J)V

    return-void
.end method

.method public static zzd([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static zze([J[J)V
    .locals 3

    array-length v0, p0

    const/16 v1, 0x13

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-array v0, v1, [J

    array-length v1, p0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zzb([J)V

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzmj;->zza([J)V

    const/16 v0, 0xa

    invoke-static {p0, v2, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
