.class final Lcom/google/android/gms/internal/firebase-auth-api/zzajy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzalf;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzakb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajb;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajb;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakd;-><init>([Lcom/google/android/gms/internal/firebase-auth-api/zzakl;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzakl;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzakl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzajc;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    return-void
.end method

.method private static zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakl;
    .locals 4

    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzakl;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaki;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaka;->zza:[I

    invoke-interface {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzakz;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzalc;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzalc<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zza(Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzakl;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakl;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzaki;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zzc()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzamb;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzait;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzair;

    move-result-object v0

    invoke-interface {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakq;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;)Lcom/google/android/gms/internal/firebase-auth-api/zzakq;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzamb;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzait;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzair;

    move-result-object v0

    invoke-interface {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaki;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakk;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzakq;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakk;)Lcom/google/android/gms/internal/firebase-auth-api/zzakq;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaki;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaku;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaks;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzamb;

    move-result-object v6

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzait;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzair;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzakh;

    move-result-object v8

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzako;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaki;Lcom/google/android/gms/internal/firebase-auth-api/zzaks;Lcom/google/android/gms/internal/firebase-auth-api/zzajt;Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakh;)Lcom/google/android/gms/internal/firebase-auth-api/zzako;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v7, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzakh;

    move-result-object v8

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzako;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaki;Lcom/google/android/gms/internal/firebase-auth-api/zzaks;Lcom/google/android/gms/internal/firebase-auth-api/zzajt;Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakh;)Lcom/google/android/gms/internal/firebase-auth-api/zzako;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzajy;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzaki;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzaku;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzaks;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzajt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzajt;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzale;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzamb;

    move-result-object v6

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzait;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzair;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakh;

    move-result-object v8

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzako;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaki;Lcom/google/android/gms/internal/firebase-auth-api/zzaks;Lcom/google/android/gms/internal/firebase-auth-api/zzajt;Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakh;)Lcom/google/android/gms/internal/firebase-auth-api/zzako;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 v7, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzakj;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzakh;

    move-result-object v8

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzako;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzaki;Lcom/google/android/gms/internal/firebase-auth-api/zzaks;Lcom/google/android/gms/internal/firebase-auth-api/zzajt;Lcom/google/android/gms/internal/firebase-auth-api/zzamb;Lcom/google/android/gms/internal/firebase-auth-api/zzair;Lcom/google/android/gms/internal/firebase-auth-api/zzakh;)Lcom/google/android/gms/internal/firebase-auth-api/zzako;

    move-result-object p1

    return-object p1
.end method
