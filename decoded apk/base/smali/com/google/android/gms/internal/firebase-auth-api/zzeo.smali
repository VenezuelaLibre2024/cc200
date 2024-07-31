.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzeo;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzek;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbh;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbt<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbh;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zznp<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzer;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zznn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbh;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzen;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzen;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzek;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzst;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;)Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzeq;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzep;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzep;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzek;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zzc()I

    move-result v0

    const/16 v1, 0x18

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzek;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer;)Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zzc()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxt;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzxt;)Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzek$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzek;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static zza()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public static zza(Z)V
    .locals 7

    const-class p0, Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzhf;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzgr;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    const-string v3, "AES128_GCM"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v2

    const-string v6, "AES128_GCM_RAW"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzgr;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    const-string v6, "AES256_GCM"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v2

    const-string v3, "AES256_GCM_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznm;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznp;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznk;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznn;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzmn;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzmn;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmn;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbt;Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;Z)V

    return-void
.end method
