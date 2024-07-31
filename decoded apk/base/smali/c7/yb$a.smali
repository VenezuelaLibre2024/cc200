.class public final Lc7/yb$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/yb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzfi$zze;",
            ">;"
        }
    .end annotation
.end field

.field public d:J

.field public final synthetic e:Lc7/yb;


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    iput-object p1, p0, Lc7/yb$a;->e:Lc7/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc7/yb;Lc7/gc;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/yb$a;-><init>(Lc7/yb;)V

    return-void
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/zzfi$zze;)J
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzd()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    div-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)V
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc7/yb$a;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    return-void
.end method

.method public final b(JLcom/google/android/gms/internal/measurement/zzfi$zze;)Z
    .locals 7

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/yb$a;->c:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc7/yb$a;->c:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lc7/yb$a;->b:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc7/yb$a;->b:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-static {v0}, Lc7/yb$a;->c(Lcom/google/android/gms/internal/measurement/zzfi$zze;)J

    move-result-wide v2

    invoke-static {p3}, Lc7/yb$a;->c(Lcom/google/android/gms/internal/measurement/zzfi$zze;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Lc7/yb$a;->d:J

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzjf;->zzbw()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    iget-object v0, p0, Lc7/yb$a;->e:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->Y()Lc7/h;

    sget-object v0, Lc7/i0;->k:Lc7/m4;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v2, v5

    if-ltz v0, :cond_3

    return v1

    :cond_3
    iput-wide v2, p0, Lc7/yb$a;->d:J

    iget-object v0, p0, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Lc7/yb$a;->b:Ljava/util/List;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lc7/yb$a;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object p2, p0, Lc7/yb$a;->e:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->Y()Lc7/h;

    sget-object p2, Lc7/i0;->l:Lc7/m4;

    invoke-virtual {p2, v4}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x1

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lt p1, p2, :cond_4

    return v1

    :cond_4
    return p3
.end method
