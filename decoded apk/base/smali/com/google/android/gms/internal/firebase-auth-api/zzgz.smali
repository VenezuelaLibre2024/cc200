.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzgz;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzha;",
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
            "Lcom/google/android/gms/internal/firebase-auth-api/zzhd;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zznn<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzhd;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzbh;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzhc;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzhc;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzha;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzoe;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzog;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvw;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzakx;

    move-result-object v2

    const-string v3, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-static {v3, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zznd;->zza(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzakx;)Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzhb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzhb;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzhe;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzhe;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzhd;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzha;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzhd;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;

    move-result-object p0

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxt;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzha;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzxt;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzha;

    move-result-object p0

    return-object p0
.end method

.method public static zza()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    return-object v0
.end method

.method public static zza(Z)V
    .locals 4

    const-class p0, Lcom/google/android/gms/internal/firebase-auth-api/zzhd;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzhu;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzoe;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzhd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzhd;

    move-result-object v2

    const-string v3, "XCHACHA20_POLY1305"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzhd;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzhd$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzhd;

    move-result-object v2

    const-string v3, "XCHACHA20_POLY1305_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznk;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zznn;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zznk;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznn;Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznm;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zznp;

    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zznm;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zznp;Ljava/lang/Class;)V

    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzbt;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbt;Z)V

    return-void
.end method
