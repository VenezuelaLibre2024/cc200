.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzagx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzacr;


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Ljava/lang/String;

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzagx;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;-><init>()V

    invoke-static {p0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzb:Ljava/lang/String;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzc:Ljava/lang/String;

    iput-boolean p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzf:Z

    return-object v0
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzagx;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;-><init>()V

    invoke-static {p0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zza:Ljava/lang/String;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzd:Ljava/lang/String;

    iput-boolean p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzf:Z

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzd:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zza:Ljava/lang/String;

    const-string v2, "phoneNumber"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzd:Ljava/lang/String;

    const-string v2, "temporaryProof"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzb:Ljava/lang/String;

    const-string v2, "sessionInfo"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzc:Ljava/lang/String;

    const-string v2, "code"

    :goto_0
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zze:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "idToken"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzf:Z

    if-nez v1, :cond_2

    const/4 v1, 0x2

    const-string v2, "operation"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zze:Ljava/lang/String;

    return-void
.end method
