.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzck;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zza:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field private zzb:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcl;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcm<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field private final zzc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcm<",
            "TP;>;>;"
        }
    .end annotation
.end field

.field private zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcm<",
            "TP;>;"
        }
    .end annotation
.end field

.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/zzrl;


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzc:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zza:Ljava/lang/Class;

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/zzrl;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzrl;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzrl;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzcj;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzck;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method private final zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzck;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;",
            "Z)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzck<",
            "TP;>;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_a

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "at least one of the `fullPrimitive` or `primitive` must be set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzvb;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzvb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzvb;

    if-ne v1, v2, :cond_9

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zza()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzvt;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    const/4 v11, 0x0

    if-ne v2, v3, :cond_2

    move-object v1, v11

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    move-result-object v2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzux;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzux;->zzf()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzux;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzux;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzahm;

    move-result-object v4

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzux;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzux;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;

    move-result-object v5

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    move-result-object v6

    invoke-static {v3, v4, v5, v6, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzot;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzahm;Lcom/google/android/gms/internal/firebase-auth-api/zzux$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzvt;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/zzot;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzct;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzct;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzot;Lcom/google/android/gms/internal/firebase-auth-api/zzct;)Lcom/google/android/gms/internal/firebase-auth-api/zzbu;

    move-result-object v10

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzbn;->zza:[I

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_5

    const/4 v5, 0x3

    if-eq v2, v5, :cond_4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzbo;->zza:[B

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "unknown output prefix type"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    goto :goto_1

    :cond_5
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    :goto_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zza()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    :goto_2
    move-object v5, v2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzvb;

    move-result-object v6

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzvt;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zza()I

    move-result v8

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzux;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzux;->zzf()Ljava/lang/String;

    move-result-object v9

    move-object v2, v1

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzcm;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLcom/google/android/gms/internal/firebase-auth-api/zzvb;Lcom/google/android/gms/internal/firebase-auth-api/zzvt;ILjava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzbu;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzc:Ljava/util/List;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/zzcl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzcm;->zzh()[B

    move-result-object v6

    invoke-direct {v5, v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzcl;-><init>([BLcom/google/android/gms/internal/firebase-auth-api/zzco;)V

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v5, v4}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_6

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v5, v4}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_8

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    if-nez v2, :cond_7

    iput-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    goto :goto_3

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "you cannot set two primary primitives"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_3
    return-object v0

    :cond_9
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "only ENABLED key is allowed"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "addPrimitive cannot be called after build"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzch;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzch<",
            "TP;>;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_0

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/zzch;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzc:Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzcm;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzrl;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zza:Ljava/lang/Class;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzch;-><init>(Ljava/util/concurrent/ConcurrentMap;Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/zzcm;Lcom/google/android/gms/internal/firebase-auth-api/zzrl;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzcn;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    return-object v7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzrl;)Lcom/google/android/gms/internal/firebase-auth-api/zzck;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzrl;",
            ")",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzck<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zzb:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzrl;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzck;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;",
            ")",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzck<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzck;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzck;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;TP;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;",
            ")",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzck<",
            "TP;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzck;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/zzvh$zza;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzck;

    move-result-object p1

    return-object p1
.end method
