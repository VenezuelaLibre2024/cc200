.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzpm;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zznn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zznn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpp;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpi;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpx;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzpi;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcf;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbt<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpl;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpl;

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpo;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzpx;

    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpn;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpn;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzry;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;)Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpi;)Lcom/google/android/gms/internal/firebase-auth-api/zzcf;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzqp;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzqs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;)V

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxo;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpi;)Lcom/google/android/gms/internal/firebase-auth-api/zzcf;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzpi;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;)Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zzc()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxt;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzxt;)Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpi$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzpi;

    move-result-object p0

    return-object p0
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zzc()I

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static zza(Z)V
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpr;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznk;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznn;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object p0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzqv;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzpp;

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzpp;

    move-result-object v1

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbt;Z)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzpi;)Lcom/google/android/gms/internal/firebase-auth-api/zzpx;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzqp;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzqs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzpm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzpp;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzre;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzre;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzpi;)V

    return-object v0
.end method
