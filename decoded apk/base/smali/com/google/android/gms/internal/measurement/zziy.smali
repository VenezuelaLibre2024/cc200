.class final Lcom/google/android/gms/internal/measurement/zziy;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/android/gms/internal/measurement/zzja<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/measurement/zziy;


# instance fields
.field public final zza:Lcom/google/android/gms/internal/measurement/zzlo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzlo<",
            "TT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzc:Z

.field private zzd:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zziy;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zziy;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zziy;->zzb:Lcom/google/android/gms/internal/measurement/zziy;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(I)Lcom/google/android/gms/internal/measurement/zzlo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzlo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzlo<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zziy;->zze()V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(I)Lcom/google/android/gms/internal/measurement/zzlo;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zziy;-><init>(Lcom/google/android/gms/internal/measurement/zzlo;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zziy;->zze()V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzja<",
            "*>;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zzb()Lcom/google/android/gms/internal/measurement/zzmv;

    move-result-object v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zza()I

    move-result v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zze()Z

    move-result v2

    if-eqz v2, :cond_4

    check-cast p1, Ljava/util/List;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zzd()Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    return v2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzmv;Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzio;->zzi(I)I

    move-result p0

    add-int/2addr p0, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzio;->zzj(I)I

    move-result p1

    add-int/2addr p0, p1

    return p0

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzmv;ILjava/lang/Object;)I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_1

    :cond_3
    return v2

    :cond_4
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzmv;ILjava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static zza(Lcom/google/android/gms/internal/measurement/zzmv;ILjava/lang/Object;)I
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzi(I)I

    move-result p1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzmv;->zzj:Lcom/google/android/gms/internal/measurement/zzmv;

    if-ne p0, v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzjh;->zza(Lcom/google/android/gms/internal/measurement/zzkr;)Z

    shl-int/lit8 p1, p1, 0x1

    :cond_0
    invoke-static {p0, p2}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzmv;Ljava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzmv;Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzix;->zzb:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "There is no way to get here, but the compiler thinks otherwise."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzjk;

    if-eqz p0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzjk;->zza()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzd(I)I

    move-result p0

    return p0

    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzd(I)I

    move-result p0

    return p0

    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzf(J)I

    move-result p0

    return p0

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzh(I)I

    move-result p0

    return p0

    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zze(J)I

    move-result p0

    return p0

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzg(I)I

    move-result p0

    return p0

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzj(I)I

    move-result p0

    return p0

    :pswitch_6
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz p0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(Lcom/google/android/gms/internal/measurement/zzhu;)I

    move-result p0

    return p0

    :cond_1
    check-cast p1, [B

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zza([B)I

    move-result p0

    return p0

    :pswitch_7
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz p0, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(Lcom/google/android/gms/internal/measurement/zzhu;)I

    move-result p0

    return p0

    :cond_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_8
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzjr;

    if-eqz p0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Lcom/google/android/gms/internal/measurement/zzjv;)I

    move-result p0

    return p0

    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(Lcom/google/android/gms/internal/measurement/zzkr;)I

    move-result p0

    return p0

    :pswitch_9
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(Lcom/google/android/gms/internal/measurement/zzkr;)I

    move-result p0

    return p0

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Z)I

    move-result p0

    return p0

    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zze(I)I

    move-result p0

    return p0

    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(J)I

    move-result p0

    return p0

    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zzf(I)I

    move-result p0

    return p0

    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzg(J)I

    move-result p0

    return p0

    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzd(J)I

    move-result p0

    return p0

    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzio;->zza(F)I

    move-result p0

    return p0

    :pswitch_11
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zza(D)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zza(Ljava/util/Map$Entry;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zzc()Lcom/google/android/gms/internal/measurement/zznf;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/measurement/zznf;->zzi:Lcom/google/android/gms/internal/measurement/zznf;

    if-ne v2, v3, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zze()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zzd()Z

    move-result v2

    if-nez v2, :cond_1

    instance-of v0, v1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zza()I

    move-result p0

    if-eqz v0, :cond_0

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/measurement/zzio;->zza(ILcom/google/android/gms/internal/measurement/zzjv;)I

    move-result p0

    return p0

    :cond_0
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(ILcom/google/android/gms/internal/measurement/zzkr;)I

    move-result p0

    return p0

    :cond_1
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzja;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzlo;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzjr;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjr;->zza()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private static zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/zzla;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzla;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzla;->zza()Lcom/google/android/gms/internal/measurement/zzla;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, [B

    if-eqz v0, :cond_1

    check-cast p0, [B

    array-length v0, p0

    new-array v0, v0, [B

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static zza(Lcom/google/android/gms/internal/measurement/zzio;Lcom/google/android/gms/internal/measurement/zzmv;ILjava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzmv;->zzj:Lcom/google/android/gms/internal/measurement/zzmv;

    if-ne p1, v0, :cond_0

    check-cast p3, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/zzjh;->zza(Lcom/google/android/gms/internal/measurement/zzkr;)Z

    const/4 p1, 0x3

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(II)V

    invoke-interface {p3, p0}, Lcom/google/android/gms/internal/measurement/zzkr;->zza(Lcom/google/android/gms/internal/measurement/zzio;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(II)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzmv;->zza()I

    move-result v0

    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(II)V

    sget-object p2, Lcom/google/android/gms/internal/measurement/zzix;->zzb:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    instance-of p1, p3, Lcom/google/android/gms/internal/measurement/zzjk;

    if-eqz p1, :cond_1

    check-cast p3, Lcom/google/android/gms/internal/measurement/zzjk;

    invoke-interface {p3}, Lcom/google/android/gms/internal/measurement/zzjk;->zza()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(I)V

    return-void

    :cond_1
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(I)V

    goto/16 :goto_0

    :pswitch_1
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zzh(J)V

    return-void

    :pswitch_2
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzk(I)V

    return-void

    :pswitch_3
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zza(J)V

    return-void

    :pswitch_4
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zza(I)V

    return-void

    :pswitch_5
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzc(I)V

    return-void

    :pswitch_6
    instance-of p1, p3, Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz p1, :cond_2

    check-cast p3, Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Lcom/google/android/gms/internal/measurement/zzhu;)V

    return-void

    :cond_2
    check-cast p3, [B

    const/4 p1, 0x0

    array-length p2, p3

    invoke-virtual {p0, p3, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zzb([BII)V

    return-void

    :pswitch_7
    instance-of p1, p3, Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz p1, :cond_3

    check-cast p3, Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Lcom/google/android/gms/internal/measurement/zzhu;)V

    return-void

    :cond_3
    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Ljava/lang/String;)V

    return-void

    :pswitch_8
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/zzio;->zza(Lcom/google/android/gms/internal/measurement/zzkr;)V

    return-void

    :pswitch_9
    check-cast p3, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-interface {p3, p0}, Lcom/google/android/gms/internal/measurement/zzkr;->zza(Lcom/google/android/gms/internal/measurement/zzio;)V

    return-void

    :pswitch_a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(Z)V

    return-void

    :pswitch_b
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zza(I)V

    return-void

    :pswitch_c
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zza(J)V

    return-void

    :pswitch_d
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(I)V

    return-void

    :pswitch_e
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(J)V

    return-void

    :pswitch_f
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(J)V

    return-void

    :pswitch_10
    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(F)V

    return-void

    :pswitch_11
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzio;->zzb(D)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzb()Lcom/google/android/gms/internal/measurement/zziy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/measurement/zzja<",
            "TT;>;>()",
            "Lcom/google/android/gms/internal/measurement/zziy<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zziy;->zzb:Lcom/google/android/gms/internal/measurement/zziy;

    return-object v0
.end method

.method private final zzb(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzja;->zze()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-static {p1, v2}, Lcom/google/android/gms/internal/measurement/zziy;->zzc(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zziy;->zzc(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V

    :goto_1
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/zzjr;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final zzb(Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zze()Z

    move-result v2

    if-eqz v2, :cond_3

    if-nez v1, :cond_2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzja;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields can not be repeated"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zzc()Lcom/google/android/gms/internal/measurement/zznf;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/measurement/zznf;->zzi:Lcom/google/android/gms/internal/measurement/zznf;

    if-ne v2, v3, :cond_8

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Lcom/google/android/gms/internal/measurement/zzja;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_7

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    return-void

    :cond_4
    if-eqz v1, :cond_5

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjr;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzjr;->zza()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    :cond_5
    instance-of v1, v2, Lcom/google/android/gms/internal/measurement/zzla;

    if-eqz v1, :cond_6

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzla;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzla;

    invoke-interface {v0, v2, p1}, Lcom/google/android/gms/internal/measurement/zzja;->zza(Lcom/google/android/gms/internal/measurement/zzla;Lcom/google/android/gms/internal/measurement/zzla;)Lcom/google/android/gms/internal/measurement/zzla;

    move-result-object p1

    goto :goto_1

    :cond_6
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzkr;->zzce()Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzja;->zza(Lcom/google/android/gms/internal/measurement/zzku;Lcom/google/android/gms/internal/measurement/zzkr;)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzku;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-void

    :cond_8
    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/measurement/zzlo;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Lazy fields must be message-valued"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static zzb(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/zzkt;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzkt;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzkt;->zzci()Z

    move-result p0

    return p0

    :cond_0
    instance-of p0, p0, Lcom/google/android/gms/internal/measurement/zzjr;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zzc(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zzb()Lcom/google/android/gms/internal/measurement/zzmv;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzjh;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzix;->zza:[I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzmv;->zzb()Lcom/google/android/gms/internal/measurement/zznf;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :cond_0
    move v0, v2

    goto :goto_1

    :pswitch_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzkr;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzjr;

    if-eqz v0, :cond_0

    goto :goto_0

    :pswitch_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzjk;

    if-eqz v0, :cond_0

    goto :goto_0

    :pswitch_2
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzhu;

    if-nez v0, :cond_1

    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    :cond_1
    :goto_0
    move v0, v1

    goto :goto_1

    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_1

    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_1

    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_1

    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_1

    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    :goto_1
    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zza()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzja;->zzb()Lcom/google/android/gms/internal/measurement/zzmv;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzmv;->zzb()Lcom/google/android/gms/internal/measurement/zznf;

    move-result-object p0

    aput-object p0, v3, v1

    const/4 p0, 0x2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, p0

    const-string p0, "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"

    invoke-static {p0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zzc(Ljava/util/Map$Entry;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/measurement/zzja<",
            "TT;>;>(",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zzc()Lcom/google/android/gms/internal/measurement/zznf;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/measurement/zznf;->zzi:Lcom/google/android/gms/internal/measurement/zznf;

    if-ne v1, v2, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzja;->zze()Z

    move-result v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/zziy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zziy;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzc()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzja;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Lcom/google/android/gms/internal/measurement/zzja;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zziy;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zziy;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzlo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->hashCode()I

    move-result v0

    return v0
.end method

.method public final zza()I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zzc()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zziy;->zza(Ljava/util/Map$Entry;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return v1
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zziy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zziy<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Ljava/util/Map$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzc()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Ljava/util/Map$Entry;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final zzc()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjw;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzd()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjw;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zzd()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzd:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzjw;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjw;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final zze()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzc:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb(I)Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/google/android/gms/internal/measurement/zzjf;

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjf;->zzcg()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzlo;->zza()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzc:Z

    return-void
.end method

.method public final zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zziy;->zzc:Z

    return v0
.end method

.method public final zzg()Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzb(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zziy;->zzc(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziy;->zza:Lcom/google/android/gms/internal/measurement/zzlo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzlo;->zzc()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zziy;->zzc(Ljava/util/Map$Entry;)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method