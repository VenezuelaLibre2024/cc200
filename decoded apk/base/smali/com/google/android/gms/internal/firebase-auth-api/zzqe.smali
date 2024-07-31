.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzqe;
.super Lcom/google/android/gms/internal/firebase-auth-api/zznb;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zznb<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzue;",
        ">;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzqb;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpx;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzqb;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcf;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zznp<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzqm;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqh;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqh;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpx;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqg;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqg;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqj;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqj;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzue;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/internal/firebase-auth-api/zzoi;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzqi;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzqi;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznb;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/zzoi;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzui;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzui;)V

    return-void
.end method

.method public static zza(Z)V
    .locals 9

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzrg;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object p0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    const-string v2, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v6, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v5, "HMAC_SHA256_256BITTAG_RAW"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    const/16 v5, 0x40

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v3, "HMAC_SHA512_128BITTAG_RAW"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v3, "HMAC_SHA512_256BITTAG"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v2, "HMAC_SHA512_256BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqv;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    const-string v2, "HMAC_SHA512_512BITTAG"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznm;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznp;Ljava/lang/Class;)V

    return-void
.end method

.method private static zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzui;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqk;->zza:[I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzuc;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzui;->zza()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static zzh()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahm;)Lcom/google/android/gms/internal/firebase-auth-api/zzakk;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaip;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaip;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzue;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzaip;)Lcom/google/android/gms/internal/firebase-auth-api/zzue;

    move-result-object p1

    return-object p1
.end method

.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzna;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzna<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzuf;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzue;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzql;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzuf;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzql;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqe;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzakk;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzue;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzue;->zza()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzxq;->zza(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzue;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzahm;->zzb()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzue;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzui;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqe;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzui;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method
