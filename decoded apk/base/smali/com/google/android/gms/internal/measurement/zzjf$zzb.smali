.class public Lcom/google/android/gms/internal/measurement/zzjf$zzb;
.super Lcom/google/android/gms/internal/measurement/zzhn;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzjf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/zzjf<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/measurement/zzjf$zzb<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/measurement/zzhn<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public zza:Lcom/google/android/gms/internal/measurement/zzjf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field private final zzb:Lcom/google/android/gms/internal/measurement/zzjf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzjf;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzhn;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjf;->zzbz()Lcom/google/android/gms/internal/measurement/zzjf;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static zza(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Ljava/lang/Object;",
            ">(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlf;->zza()Lcom/google/android/gms/internal/measurement/zzlf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/zzlf;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzlj;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzlj;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private final zzb([BIILcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/google/android/gms/internal/measurement/zzis;",
            ")TBuilderType;"
        }
    .end annotation

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzak()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlf;->zza()Lcom/google/android/gms/internal/measurement/zzlf;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/zzlf;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzlj;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    const/4 v4, 0x0

    new-instance v6, Lcom/google/android/gms/internal/measurement/zzht;

    invoke-direct {v6, p4}, Lcom/google/android/gms/internal/measurement/zzht;-><init>(Lcom/google/android/gms/internal/measurement/zzis;)V

    move-object v3, p1

    move v5, p3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzlj;->zza(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/zzht;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzjq; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjq;->zzh()Lcom/google/android/gms/internal/measurement/zzjq;

    move-result-object p1

    throw p1

    :catch_2
    move-exception p1

    throw p1
.end method

.method private final zzc(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzij;",
            "Lcom/google/android/gms/internal/measurement/zzis;",
            ")TBuilderType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzak()V

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzlf;->zza()Lcom/google/android/gms/internal/measurement/zzlf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzlf;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzlj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzin;->zza(Lcom/google/android/gms/internal/measurement/zzij;)Lcom/google/android/gms/internal/measurement/zzin;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/internal/measurement/zzlj;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zzlk;Lcom/google/android/gms/internal/measurement/zzis;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    :cond_1
    throw p1
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb:Lcom/google/android/gms/internal/measurement/zzjf;

    sget v1, Lcom/google/android/gms/internal/measurement/zzjf$zze;->zze:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzjf;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    iput-object v1, v0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    return-object v0
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzhn;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzhn;->zzb(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    return-object p1
.end method

.method public final synthetic zza([BII)Lcom/google/android/gms/internal/measurement/zzhn;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/measurement/zzis;->zza:Lcom/google/android/gms/internal/measurement/zzis;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3, p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb([BIILcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zza([BIILcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzhn;
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb([BIILcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzjf;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzjf;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzak()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final synthetic zzae()Lcom/google/android/gms/internal/measurement/zzhn;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzhn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    return-object v0
.end method

.method public final zzaf()Lcom/google/android/gms/internal/measurement/zzjf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzci()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzmf;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzmf;-><init>(Lcom/google/android/gms/internal/measurement/zzkr;)V

    throw v1
.end method

.method public zzag()Lcom/google/android/gms/internal/measurement/zzjf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    return-object v0
.end method

.method public synthetic zzah()Lcom/google/android/gms/internal/measurement/zzkr;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzaf()Lcom/google/android/gms/internal/measurement/zzjf;

    move-result-object v0

    return-object v0
.end method

.method public synthetic zzai()Lcom/google/android/gms/internal/measurement/zzkr;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzag()Lcom/google/android/gms/internal/measurement/zzjf;

    move-result-object v0

    return-object v0
.end method

.method public final zzaj()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcj()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzak()V

    :cond_0
    return-void
.end method

.method public zzak()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjf;->zzbz()Lcom/google/android/gms/internal/measurement/zzjf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    return-void
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzku;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzc(Lcom/google/android/gms/internal/measurement/zzij;Lcom/google/android/gms/internal/measurement/zzis;)Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzcf()Lcom/google/android/gms/internal/measurement/zzkr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzb:Lcom/google/android/gms/internal/measurement/zzjf;

    return-object v0
.end method

.method public final zzci()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zza:Lcom/google/android/gms/internal/measurement/zzjf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjf;->zza(Lcom/google/android/gms/internal/measurement/zzjf;Z)Z

    move-result v0

    return v0
.end method
