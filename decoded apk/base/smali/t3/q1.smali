.class public final Lt3/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/b;
.implements Lt3/r1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/q1$b;,
        Lt3/q1$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public final a:Landroid/content/Context;

.field public final b:Lt3/r1;

.field public final c:Landroid/media/metrics/PlaybackSession;

.field public final d:J

.field public final e:Ls3/u3$d;

.field public final f:Ls3/u3$b;

.field public final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/String;

.field public j:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public k:I

.field public l:I

.field public m:I

.field public n:Ls3/x2;

.field public o:Lt3/q1$b;

.field public p:Lt3/q1$b;

.field public q:Lt3/q1$b;

.field public r:Ls3/m1;

.field public s:Ls3/m1;

.field public t:Ls3/m1;

.field public u:Z

.field public v:I

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lt3/q1;->a:Landroid/content/Context;

    iput-object p2, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    new-instance p1, Ls3/u3$d;

    invoke-direct {p1}, Ls3/u3$d;-><init>()V

    iput-object p1, p0, Lt3/q1;->e:Ls3/u3$d;

    new-instance p1, Ls3/u3$b;

    invoke-direct {p1}, Ls3/u3$b;-><init>()V

    iput-object p1, p0, Lt3/q1;->f:Ls3/u3$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt3/q1;->h:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt3/q1;->g:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lt3/q1;->d:J

    const/4 p1, 0x0

    iput p1, p0, Lt3/q1;->l:I

    iput p1, p0, Lt3/q1;->m:I

    new-instance p1, Lt3/p1;

    invoke-direct {p1}, Lt3/p1;-><init>()V

    iput-object p1, p0, Lt3/q1;->b:Lt3/r1;

    invoke-interface {p1, p0}, Lt3/r1;->g(Lt3/r1$a;)V

    return-void
.end method

.method public static A0(Landroid/content/Context;)Lt3/q1;
    .locals 2

    const-string v0, "media_metrics"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/MediaMetricsManager;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lt3/q1;

    invoke-virtual {v0}, Landroid/media/metrics/MediaMetricsManager;->createPlaybackSession()Landroid/media/metrics/PlaybackSession;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lt3/q1;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static C0(I)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    invoke-static {p0}, Lp5/n0;->U(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    const/16 p0, 0x1b

    return p0

    :pswitch_0
    const/16 p0, 0x1a

    return p0

    :pswitch_1
    const/16 p0, 0x19

    return p0

    :pswitch_2
    const/16 p0, 0x1c

    return p0

    :pswitch_3
    const/16 p0, 0x18

    return p0

    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static D0(Li7/u;)Lw3/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/u<",
            "Ls3/z3$a;",
            ">;)",
            "Lw3/m;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/u;->j()Li7/d1;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/z3$a;

    const/4 v1, 0x0

    :goto_0
    iget v2, v0, Ls3/z3$a;->h:I

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ls3/z3$a;->e(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ls3/z3$a;->b(I)Ls3/m1;

    move-result-object v2

    iget-object v2, v2, Ls3/m1;->v:Lw3/m;

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static E0(Lw3/m;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lw3/m;->k:I

    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Lw3/m;->f(I)Lw3/m$b;

    move-result-object v1

    iget-object v1, v1, Lw3/m$b;->i:Ljava/util/UUID;

    sget-object v2, Ls3/i;->d:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    sget-object v2, Ls3/i;->e:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    sget-object v2, Ls3/i;->c:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x6

    return p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static F0(Ls3/x2;Landroid/content/Context;Z)Lt3/q1$a;
    .locals 9

    iget v0, p0, Ls3/x2;->h:I

    const/4 v1, 0x0

    const/16 v2, 0x3e9

    if-ne v0, v2, :cond_0

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x14

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_0
    instance-of v0, p0, Ls3/q;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ls3/q;

    iget v3, v0, Ls3/q;->p:I

    if-ne v3, v2, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    iget v0, v0, Ls3/q;->t:I

    goto :goto_1

    :cond_2
    move v0, v1

    move v3, v0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Throwable;

    instance-of v5, v4, Ljava/io/IOException;

    const/4 v6, 0x3

    const/16 v7, 0x12

    const/16 v8, 0x17

    if-eqz v5, :cond_17

    instance-of v0, v4, Lo5/a0;

    if-eqz v0, :cond_3

    check-cast v4, Lo5/a0;

    iget p0, v4, Lo5/a0;->k:I

    new-instance p1, Lt3/q1$a;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p0}, Lt3/q1$a;-><init>(II)V

    return-object p1

    :cond_3
    instance-of v0, v4, Lo5/z;

    if-nez v0, :cond_15

    instance-of v0, v4, Ls3/t2;

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    instance-of p2, v4, Lo5/y;

    if-nez p2, :cond_10

    instance-of p2, v4, Lo5/n0$a;

    if-eqz p2, :cond_5

    goto/16 :goto_2

    :cond_5
    iget p0, p0, Ls3/x2;->h:I

    const/16 p1, 0x3ea

    const/16 p2, 0x15

    if-ne p0, p1, :cond_6

    new-instance p0, Lt3/q1$a;

    invoke-direct {p0, p2, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_6
    instance-of p0, v4, Lw3/n$a;

    if-eqz p0, :cond_d

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    sget p1, Lp5/n0;->a:I

    if-lt p1, p2, :cond_7

    instance-of p2, p0, Landroid/media/MediaDrm$MediaDrmStateException;

    if-eqz p2, :cond_7

    check-cast p0, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {p0}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp5/n0;->V(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lt3/q1;->C0(I)I

    move-result p1

    new-instance p2, Lt3/q1$a;

    invoke-direct {p2, p1, p0}, Lt3/q1$a;-><init>(II)V

    return-object p2

    :cond_7
    if-lt p1, v8, :cond_8

    instance-of p2, p0, Landroid/media/MediaDrmResetException;

    if-eqz p2, :cond_8

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x1b

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_8
    if-lt p1, v7, :cond_9

    instance-of p2, p0, Landroid/media/NotProvisionedException;

    if-eqz p2, :cond_9

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x18

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_9
    if-lt p1, v7, :cond_a

    instance-of p1, p0, Landroid/media/DeniedByServerException;

    if-eqz p1, :cond_a

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x1d

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_a
    instance-of p1, p0, Lw3/k0;

    if-eqz p1, :cond_b

    new-instance p0, Lt3/q1$a;

    invoke-direct {p0, v8, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_b
    instance-of p0, p0, Lw3/h$e;

    if-eqz p0, :cond_c

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x1c

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_c
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x1e

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_d
    instance-of p0, v4, Lo5/w$b;

    if-eqz p0, :cond_f

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Ljava/io/FileNotFoundException;

    if-eqz p0, :cond_f

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    sget p1, Lp5/n0;->a:I

    if-lt p1, p2, :cond_e

    instance-of p1, p0, Landroid/system/ErrnoException;

    if-eqz p1, :cond_e

    check-cast p0, Landroid/system/ErrnoException;

    iget p0, p0, Landroid/system/ErrnoException;->errno:I

    sget p1, Landroid/system/OsConstants;->EACCES:I

    if-ne p0, p1, :cond_e

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x20

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_e
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x1f

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_f
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x9

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_10
    :goto_2
    invoke-static {p1}, Lp5/y;->d(Landroid/content/Context;)Lp5/y;

    move-result-object p0

    invoke-virtual {p0}, Lp5/y;->f()I

    move-result p0

    if-ne p0, v2, :cond_11

    new-instance p0, Lt3/q1$a;

    invoke-direct {p0, v6, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/net/UnknownHostException;

    if-eqz p1, :cond_12

    new-instance p0, Lt3/q1$a;

    const/4 p1, 0x6

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_12
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    if-eqz p0, :cond_13

    new-instance p0, Lt3/q1$a;

    const/4 p1, 0x7

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_13
    instance-of p0, v4, Lo5/y;

    if-eqz p0, :cond_14

    check-cast v4, Lo5/y;

    iget p0, v4, Lo5/y;->j:I

    if-ne p0, v2, :cond_14

    new-instance p0, Lt3/q1$a;

    const/4 p1, 0x4

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_14
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x8

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_15
    :goto_3
    new-instance p0, Lt3/q1$a;

    if-eqz p2, :cond_16

    const/16 p1, 0xa

    goto :goto_4

    :cond_16
    const/16 p1, 0xb

    :goto_4
    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_17
    if-eqz v3, :cond_19

    if-eqz v0, :cond_18

    if-ne v0, v2, :cond_19

    :cond_18
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x23

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_19
    if-eqz v3, :cond_1a

    if-ne v0, v6, :cond_1a

    new-instance p0, Lt3/q1$a;

    const/16 p1, 0xf

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_1a
    if-eqz v3, :cond_1b

    const/4 p0, 0x2

    if-ne v0, p0, :cond_1b

    new-instance p0, Lt3/q1$a;

    invoke-direct {p0, v8, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_1b
    instance-of p0, v4, Lj4/o$b;

    if-eqz p0, :cond_1c

    check-cast v4, Lj4/o$b;

    iget-object p0, v4, Lj4/o$b;->k:Ljava/lang/String;

    invoke-static {p0}, Lp5/n0;->V(Ljava/lang/String;)I

    move-result p0

    new-instance p1, Lt3/q1$a;

    const/16 p2, 0xd

    invoke-direct {p1, p2, p0}, Lt3/q1$a;-><init>(II)V

    return-object p1

    :cond_1c
    instance-of p0, v4, Lj4/m;

    const/16 p1, 0xe

    if-eqz p0, :cond_1d

    check-cast v4, Lj4/m;

    iget-object p0, v4, Lj4/m;->i:Ljava/lang/String;

    invoke-static {p0}, Lp5/n0;->V(Ljava/lang/String;)I

    move-result p0

    new-instance p2, Lt3/q1$a;

    invoke-direct {p2, p1, p0}, Lt3/q1$a;-><init>(II)V

    return-object p2

    :cond_1d
    instance-of p0, v4, Ljava/lang/OutOfMemoryError;

    if-eqz p0, :cond_1e

    new-instance p0, Lt3/q1$a;

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0

    :cond_1e
    instance-of p0, v4, Lu3/t$b;

    if-eqz p0, :cond_1f

    check-cast v4, Lu3/t$b;

    iget p0, v4, Lu3/t$b;->h:I

    new-instance p1, Lt3/q1$a;

    const/16 p2, 0x11

    invoke-direct {p1, p2, p0}, Lt3/q1$a;-><init>(II)V

    return-object p1

    :cond_1f
    instance-of p0, v4, Lu3/t$e;

    if-eqz p0, :cond_20

    check-cast v4, Lu3/t$e;

    iget p0, v4, Lu3/t$e;->h:I

    new-instance p1, Lt3/q1$a;

    invoke-direct {p1, v7, p0}, Lt3/q1$a;-><init>(II)V

    return-object p1

    :cond_20
    sget p0, Lp5/n0;->a:I

    const/16 p1, 0x10

    if-lt p0, p1, :cond_21

    instance-of p0, v4, Landroid/media/MediaCodec$CryptoException;

    if-eqz p0, :cond_21

    check-cast v4, Landroid/media/MediaCodec$CryptoException;

    invoke-virtual {v4}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result p0

    invoke-static {p0}, Lt3/q1;->C0(I)I

    move-result p1

    new-instance p2, Lt3/q1$a;

    invoke-direct {p2, p1, p0}, Lt3/q1$a;-><init>(II)V

    return-object p2

    :cond_21
    new-instance p0, Lt3/q1$a;

    const/16 p1, 0x16

    invoke-direct {p0, p1, v1}, Lt3/q1$a;-><init>(II)V

    return-object p0
.end method

.method public static G0(Ljava/lang/String;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "-"

    invoke-static {p0, v0}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    aget-object p0, p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static I0(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lp5/y;->d(Landroid/content/Context;)Lp5/y;

    move-result-object p0

    invoke-virtual {p0}, Lp5/y;->f()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_1
    const/4 p0, 0x7

    return p0

    :pswitch_2
    const/16 p0, 0x8

    return p0

    :pswitch_3
    const/4 p0, 0x3

    return p0

    :pswitch_4
    const/4 p0, 0x6

    return p0

    :pswitch_5
    const/4 p0, 0x5

    return p0

    :pswitch_6
    const/4 p0, 0x4

    return p0

    :pswitch_7
    const/4 p0, 0x2

    return p0

    :pswitch_8
    const/16 p0, 0x9

    return p0

    :pswitch_9
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static J0(Ls3/u1;)I
    .locals 2

    iget-object p0, p0, Ls3/u1;->i:Ls3/u1$h;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-object v0, p0, Ls3/u1$h;->a:Landroid/net/Uri;

    iget-object p0, p0, Ls3/u1$h;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Lp5/n0;->o0(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x4

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, 0x3

    return p0
.end method

.method public static K0(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x4

    return p0

    :cond_1
    return v2

    :cond_2
    return v0
.end method


# virtual methods
.method public final B0()V
    .locals 7

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lt3/q1;->A:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lt3/q1;->z:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setAudioUnderrunCount(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lt3/q1;->x:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesDropped(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lt3/q1;->y:I

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setVideoFramesPlayed(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lt3/q1;->g:Ljava/util/HashMap;

    iget-object v2, p0, Lt3/q1;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    move-wide v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkTransferDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lt3/q1;->h:Ljava/util/HashMap;

    iget-object v2, p0, Lt3/q1;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez v0, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_1
    invoke-virtual {v2, v5, v6}, Landroid/media/metrics/PlaybackMetrics$Builder;->setNetworkBytesRead(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v2, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-virtual {v2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamSource(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    iget-object v2, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-virtual {v2}, Landroid/media/metrics/PlaybackMetrics$Builder;->build()Landroid/media/metrics/PlaybackMetrics;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/metrics/PlaybackSession;->reportPlaybackMetrics(Landroid/media/metrics/PlaybackMetrics;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-object v0, p0, Lt3/q1;->i:Ljava/lang/String;

    iput v1, p0, Lt3/q1;->z:I

    iput v1, p0, Lt3/q1;->x:I

    iput v1, p0, Lt3/q1;->y:I

    iput-object v0, p0, Lt3/q1;->r:Ls3/m1;

    iput-object v0, p0, Lt3/q1;->s:Ls3/m1;

    iput-object v0, p0, Lt3/q1;->t:Ls3/m1;

    iput-boolean v1, p0, Lt3/q1;->A:Z

    return-void
.end method

.method public H0()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {v0}, Landroid/media/metrics/PlaybackSession;->getSessionId()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    return-object v0
.end method

.method public final L0(Lt3/b$b;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lt3/b$b;->d()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lt3/b$b;->b(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lt3/b$b;->c(I)Lt3/b$a;

    move-result-object v2

    if-nez v1, :cond_0

    iget-object v1, p0, Lt3/q1;->b:Lt3/r1;

    invoke-interface {v1, v2}, Lt3/r1;->f(Lt3/b$a;)V

    goto :goto_1

    :cond_0
    const/16 v3, 0xb

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lt3/q1;->b:Lt3/r1;

    iget v3, p0, Lt3/q1;->k:I

    invoke-interface {v1, v2, v3}, Lt3/r1;->a(Lt3/b$a;I)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lt3/q1;->b:Lt3/r1;

    invoke-interface {v1, v2}, Lt3/r1;->d(Lt3/b$a;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final M0(J)V
    .locals 4

    iget-object v0, p0, Lt3/q1;->a:Landroid/content/Context;

    invoke-static {v0}, Lt3/q1;->I0(Landroid/content/Context;)I

    move-result v0

    iget v1, p0, Lt3/q1;->m:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lt3/q1;->m:I

    iget-object v1, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    new-instance v2, Landroid/media/metrics/NetworkEvent$Builder;

    invoke-direct {v2}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    invoke-virtual {v2, v0}, Landroid/media/metrics/NetworkEvent$Builder;->setNetworkType(I)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v0

    iget-wide v2, p0, Lt3/q1;->d:J

    sub-long/2addr p1, v2

    invoke-virtual {v0, p1, p2}, Landroid/media/metrics/NetworkEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/metrics/NetworkEvent$Builder;->build()Landroid/media/metrics/NetworkEvent;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/media/metrics/PlaybackSession;->reportNetworkEvent(Landroid/media/metrics/NetworkEvent;)V

    :cond_0
    return-void
.end method

.method public N(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    iget p1, p3, Lu4/q;->a:I

    iput p1, p0, Lt3/q1;->v:I

    return-void
.end method

.method public final N0(J)V
    .locals 7

    iget-object v0, p0, Lt3/q1;->n:Ls3/x2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lt3/q1;->a:Landroid/content/Context;

    iget v2, p0, Lt3/q1;->v:I

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lt3/q1;->F0(Ls3/x2;Landroid/content/Context;Z)Lt3/q1$a;

    move-result-object v1

    iget-object v2, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    new-instance v3, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    invoke-direct {v3}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    iget-wide v5, p0, Lt3/q1;->d:J

    sub-long/2addr p1, v5

    invoke-virtual {v3, p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    iget p2, v1, Lt3/q1$a;->a:I

    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    iget p2, v1, Lt3/q1$a;->b:I

    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setSubErrorCode(I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->setException(Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/metrics/PlaybackErrorEvent$Builder;->build()Landroid/media/metrics/PlaybackErrorEvent;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/media/metrics/PlaybackSession;->reportPlaybackErrorEvent(Landroid/media/metrics/PlaybackErrorEvent;)V

    iput-boolean v4, p0, Lt3/q1;->A:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lt3/q1;->n:Ls3/x2;

    return-void
.end method

.method public final O0(Ls3/b3;Lt3/b$b;J)V
    .locals 3

    invoke-interface {p1}, Ls3/b3;->v()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lt3/q1;->u:Z

    :cond_0
    invoke-interface {p1}, Ls3/b3;->q()Ls3/x2;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lt3/q1;->w:Z

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    invoke-virtual {p2, v0}, Lt3/b$b;->a(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iput-boolean v2, p0, Lt3/q1;->w:Z

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lt3/q1;->W0(Ls3/b3;)I

    move-result p1

    iget p2, p0, Lt3/q1;->l:I

    if-eq p2, p1, :cond_3

    iput p1, p0, Lt3/q1;->l:I

    iput-boolean v2, p0, Lt3/q1;->A:Z

    iget-object p1, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    new-instance p2, Landroid/media/metrics/PlaybackStateEvent$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    iget v0, p0, Lt3/q1;->l:I

    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setState(I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object p2

    iget-wide v0, p0, Lt3/q1;->d:J

    sub-long/2addr p3, v0

    invoke-virtual {p2, p3, p4}, Landroid/media/metrics/PlaybackStateEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/media/metrics/PlaybackStateEvent$Builder;->build()Landroid/media/metrics/PlaybackStateEvent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/media/metrics/PlaybackSession;->reportPlaybackStateEvent(Landroid/media/metrics/PlaybackStateEvent;)V

    :cond_3
    return-void
.end method

.method public final P0(Ls3/b3;Lt3/b$b;J)V
    .locals 3

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lt3/b$b;->a(I)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ls3/b3;->x()Ls3/z3;

    move-result-object p1

    invoke-virtual {p1, v0}, Ls3/z3;->c(I)Z

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ls3/z3;->c(I)Z

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Ls3/z3;->c(I)Z

    move-result p1

    if-nez p2, :cond_0

    if-nez v0, :cond_0

    if-eqz p1, :cond_3

    :cond_0
    const/4 v2, 0x0

    if-nez p2, :cond_1

    invoke-virtual {p0, p3, p4, v1, v2}, Lt3/q1;->U0(JLs3/m1;I)V

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p0, p3, p4, v1, v2}, Lt3/q1;->Q0(JLs3/m1;I)V

    :cond_2
    if-nez p1, :cond_3

    invoke-virtual {p0, p3, p4, v1, v2}, Lt3/q1;->S0(JLs3/m1;I)V

    :cond_3
    iget-object p1, p0, Lt3/q1;->o:Lt3/q1$b;

    invoke-virtual {p0, p1}, Lt3/q1;->z0(Lt3/q1$b;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lt3/q1;->o:Lt3/q1$b;

    iget-object p2, p1, Lt3/q1$b;->a:Ls3/m1;

    iget v0, p2, Ls3/m1;->y:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    iget p1, p1, Lt3/q1$b;->b:I

    invoke-virtual {p0, p3, p4, p2, p1}, Lt3/q1;->U0(JLs3/m1;I)V

    iput-object v1, p0, Lt3/q1;->o:Lt3/q1$b;

    :cond_4
    iget-object p1, p0, Lt3/q1;->p:Lt3/q1$b;

    invoke-virtual {p0, p1}, Lt3/q1;->z0(Lt3/q1$b;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lt3/q1;->p:Lt3/q1$b;

    iget-object p2, p1, Lt3/q1$b;->a:Ls3/m1;

    iget p1, p1, Lt3/q1$b;->b:I

    invoke-virtual {p0, p3, p4, p2, p1}, Lt3/q1;->Q0(JLs3/m1;I)V

    iput-object v1, p0, Lt3/q1;->p:Lt3/q1$b;

    :cond_5
    iget-object p1, p0, Lt3/q1;->q:Lt3/q1$b;

    invoke-virtual {p0, p1}, Lt3/q1;->z0(Lt3/q1$b;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lt3/q1;->q:Lt3/q1$b;

    iget-object p2, p1, Lt3/q1$b;->a:Ls3/m1;

    iget p1, p1, Lt3/q1$b;->b:I

    invoke-virtual {p0, p3, p4, p2, p1}, Lt3/q1;->S0(JLs3/m1;I)V

    iput-object v1, p0, Lt3/q1;->q:Lt3/q1$b;

    :cond_6
    return-void
.end method

.method public final Q0(JLs3/m1;I)V
    .locals 6

    iget-object v0, p0, Lt3/q1;->s:Ls3/m1;

    invoke-static {v0, p3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt3/q1;->s:Ls3/m1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lt3/q1;->s:Ls3/m1;

    const/4 v1, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lt3/q1;->V0(IJLs3/m1;I)V

    return-void
.end method

.method public R(Lt3/b$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final R0(Ls3/b3;Lt3/b$b;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lt3/b$b;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lt3/b$b;->c(I)Lt3/b$a;

    move-result-object v0

    iget-object v1, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lt3/b$a;->b:Ls3/u3;

    iget-object v0, v0, Lt3/b$a;->d:Lu4/t$b;

    invoke-virtual {p0, v1, v0}, Lt3/q1;->T0(Ls3/u3;Lu4/t$b;)V

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lt3/b$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ls3/b3;->x()Ls3/z3;

    move-result-object p1

    invoke-virtual {p1}, Ls3/z3;->b()Li7/u;

    move-result-object p1

    invoke-static {p1}, Lt3/q1;->D0(Li7/u;)Lw3/m;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {p1}, Lt3/q1;->E0(Lw3/m;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setDrmType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_1
    const/16 p1, 0x3f3

    invoke-virtual {p2, p1}, Lt3/b$b;->a(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lt3/q1;->z:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lt3/q1;->z:I

    :cond_2
    return-void
.end method

.method public final S0(JLs3/m1;I)V
    .locals 6

    iget-object v0, p0, Lt3/q1;->t:Ls3/m1;

    invoke-static {v0, p3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt3/q1;->t:Ls3/m1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lt3/q1;->t:Ls3/m1;

    const/4 v1, 0x2

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lt3/q1;->V0(IJLs3/m1;I)V

    return-void
.end method

.method public final T0(Ls3/u3;Lu4/t$b;)V
    .locals 5

    iget-object v0, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lt3/q1;->f:Ls3/u3$b;

    invoke-virtual {p1, p2, v1}, Ls3/u3;->j(ILs3/u3$b;)Ls3/u3$b;

    iget-object p2, p0, Lt3/q1;->f:Ls3/u3$b;

    iget p2, p2, Ls3/u3$b;->j:I

    iget-object v1, p0, Lt3/q1;->e:Ls3/u3$d;

    invoke-virtual {p1, p2, v1}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    iget-object p1, p0, Lt3/q1;->e:Ls3/u3$d;

    iget-object p1, p1, Ls3/u3$d;->j:Ls3/u1;

    invoke-static {p1}, Lt3/q1;->J0(Ls3/u1;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setStreamType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p1, p0, Lt3/q1;->e:Ls3/u3$d;

    iget-wide v1, p1, Ls3/u3$d;->u:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v1, v3

    if-eqz p2, :cond_2

    iget-boolean p2, p1, Ls3/u3$d;->s:Z

    if-nez p2, :cond_2

    iget-boolean p2, p1, Ls3/u3$d;->p:Z

    if-nez p2, :cond_2

    invoke-virtual {p1}, Ls3/u3$d;->g()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lt3/q1;->e:Ls3/u3$d;

    invoke-virtual {p1}, Ls3/u3$d;->f()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Landroid/media/metrics/PlaybackMetrics$Builder;->setMediaDurationMillis(J)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_2
    iget-object p1, p0, Lt3/q1;->e:Ls3/u3$d;

    invoke-virtual {p1}, Ls3/u3$d;->g()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    move p1, p2

    :goto_0
    invoke-virtual {v0, p1}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlaybackType(I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-boolean p2, p0, Lt3/q1;->A:Z

    return-void
.end method

.method public final U0(JLs3/m1;I)V
    .locals 6

    iget-object v0, p0, Lt3/q1;->r:Ls3/m1;

    invoke-static {v0, p3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt3/q1;->r:Ls3/m1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lt3/q1;->r:Ls3/m1;

    const/4 v1, 0x1

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lt3/q1;->V0(IJLs3/m1;I)V

    return-void
.end method

.method public final V0(IJLs3/m1;I)V
    .locals 3

    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    iget-wide v1, p0, Lt3/q1;->d:J

    sub-long/2addr p2, v1

    invoke-virtual {v0, p2, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTimeSinceCreatedMillis(J)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p4, :cond_9

    invoke-virtual {p1, p2}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-static {p5}, Lt3/q1;->K0(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackChangeReason(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p3, p4, Ls3/m1;->r:Ljava/lang/String;

    if-eqz p3, :cond_0

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setContainerMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_0
    iget-object p3, p4, Ls3/m1;->s:Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setSampleMimeType(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_1
    iget-object p3, p4, Ls3/m1;->p:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setCodecName(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_2
    iget p3, p4, Ls3/m1;->o:I

    const/4 p5, -0x1

    if-eq p3, p5, :cond_3

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setBitrate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_3
    iget p3, p4, Ls3/m1;->x:I

    if-eq p3, p5, :cond_4

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setWidth(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_4
    iget p3, p4, Ls3/m1;->y:I

    if-eq p3, p5, :cond_5

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setHeight(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_5
    iget p3, p4, Ls3/m1;->F:I

    if-eq p3, p5, :cond_6

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setChannelCount(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_6
    iget p3, p4, Ls3/m1;->G:I

    if-eq p3, p5, :cond_7

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setAudioSampleRate(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_7
    iget-object p3, p4, Ls3/m1;->j:Ljava/lang/String;

    if-eqz p3, :cond_8

    invoke-static {p3}, Lt3/q1;->G0(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p3

    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    invoke-virtual {p1, p5}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguage(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p3, :cond_8

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setLanguageRegion(Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_8
    iget p3, p4, Ls3/m1;->z:F

    const/high16 p4, -0x40800000    # -1.0f

    cmpl-float p4, p3, p4

    if-eqz p4, :cond_a

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setVideoFrameRate(F)Landroid/media/metrics/TrackChangeEvent$Builder;

    goto :goto_0

    :cond_9
    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/media/metrics/TrackChangeEvent$Builder;->setTrackState(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_a
    :goto_0
    iput-boolean p2, p0, Lt3/q1;->A:Z

    iget-object p2, p0, Lt3/q1;->c:Landroid/media/metrics/PlaybackSession;

    invoke-virtual {p1}, Landroid/media/metrics/TrackChangeEvent$Builder;->build()Landroid/media/metrics/TrackChangeEvent;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/media/metrics/PlaybackSession;->reportTrackChangeEvent(Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method

.method public final W0(Ls3/b3;)I
    .locals 3

    invoke-interface {p1}, Ls3/b3;->v()I

    move-result v0

    iget-boolean v1, p0, Lt3/q1;->u:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x5

    return p1

    :cond_0
    iget-boolean v1, p0, Lt3/q1;->w:Z

    if-eqz v1, :cond_1

    const/16 p1, 0xd

    return p1

    :cond_1
    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/16 p1, 0xb

    return p1

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_7

    iget v0, p0, Lt3/q1;->l:I

    if-eqz v0, :cond_6

    if-ne v0, v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ls3/b3;->j()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 p1, 0x7

    return p1

    :cond_4
    invoke-interface {p1}, Ls3/b3;->D()I

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0xa

    goto :goto_0

    :cond_5
    const/4 p1, 0x6

    :goto_0
    return p1

    :cond_6
    :goto_1
    return v2

    :cond_7
    const/4 v2, 0x3

    if-ne v0, v2, :cond_a

    invoke-interface {p1}, Ls3/b3;->j()Z

    move-result v0

    if-nez v0, :cond_8

    return v1

    :cond_8
    invoke-interface {p1}, Ls3/b3;->D()I

    move-result p1

    if-eqz p1, :cond_9

    const/16 v2, 0x9

    :cond_9
    return v2

    :cond_a
    const/4 p1, 0x1

    if-ne v0, p1, :cond_b

    iget p1, p0, Lt3/q1;->l:I

    if-eqz p1, :cond_b

    const/16 p1, 0xc

    return p1

    :cond_b
    iget p1, p0, Lt3/q1;->l:I

    return p1
.end method

.method public f0(Lt3/b$a;IJJ)V
    .locals 5

    iget-object p5, p1, Lt3/b$a;->d:Lu4/t$b;

    if-eqz p5, :cond_2

    iget-object p6, p0, Lt3/q1;->b:Lt3/r1;

    iget-object p1, p1, Lt3/b$a;->b:Ls3/u3;

    invoke-static {p5}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lu4/t$b;

    invoke-interface {p6, p1, p5}, Lt3/r1;->e(Ls3/u3;Lu4/t$b;)Ljava/lang/String;

    move-result-object p1

    iget-object p5, p0, Lt3/q1;->h:Ljava/util/HashMap;

    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Long;

    iget-object p6, p0, Lt3/q1;->g:Ljava/util/HashMap;

    invoke-virtual {p6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/Long;

    iget-object v0, p0, Lt3/q1;->h:Ljava/util/HashMap;

    const-wide/16 v1, 0x0

    if-nez p5, :cond_0

    move-wide v3, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    add-long/2addr v3, p3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lt3/q1;->g:Ljava/util/HashMap;

    if-nez p6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :goto_1
    int-to-long p4, p2

    add-long/2addr v1, p4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public g0(Lt3/b$a;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p1, Lt3/b$a;->d:Lu4/t$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lt3/q1;->B0()V

    iput-object p2, p0, Lt3/q1;->i:Ljava/lang/String;

    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    const-string v0, "ExoPlayerLib"

    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerName(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v0, "2.18.7"

    invoke-virtual {p2, v0}, Landroid/media/metrics/PlaybackMetrics$Builder;->setPlayerVersion(Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    iput-object p2, p0, Lt3/q1;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p2, p1, Lt3/b$a;->b:Ls3/u3;

    iget-object p1, p1, Lt3/b$a;->d:Lu4/t$b;

    invoke-virtual {p0, p2, p1}, Lt3/q1;->T0(Ls3/u3;Lu4/t$b;)V

    return-void
.end method

.method public h(Lt3/b$a;Lu4/q;)V
    .locals 5

    iget-object v0, p1, Lt3/b$a;->d:Lu4/t$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lt3/q1$b;

    iget-object v1, p2, Lu4/q;->c:Ls3/m1;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/m1;

    iget v2, p2, Lu4/q;->d:I

    iget-object v3, p0, Lt3/q1;->b:Lt3/r1;

    iget-object v4, p1, Lt3/b$a;->b:Ls3/u3;

    iget-object p1, p1, Lt3/b$a;->d:Lu4/t$b;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/t$b;

    invoke-interface {v3, v4, p1}, Lt3/r1;->e(Ls3/u3;Lu4/t$b;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lt3/q1$b;-><init>(Ls3/m1;ILjava/lang/String;)V

    iget p1, p2, Lu4/q;->b:I

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lt3/q1;->q:Lt3/q1$b;

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lt3/q1;->p:Lt3/q1$b;

    goto :goto_0

    :cond_3
    iput-object v0, p0, Lt3/q1;->o:Lt3/q1$b;

    :goto_0
    return-void
.end method

.method public h0(Lt3/b$a;Ls3/x2;)V
    .locals 0

    iput-object p2, p0, Lt3/q1;->n:Ls3/x2;

    return-void
.end method

.method public m0(Lt3/b$a;Ljava/lang/String;Z)V
    .locals 0

    iget-object p1, p1, Lt3/b$a;->d:Lu4/t$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu4/s;->b()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    iget-object p1, p0, Lt3/q1;->i:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lt3/q1;->B0()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lt3/q1;->g:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lt3/q1;->h:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o(Lt3/b$a;Lq5/y;)V
    .locals 3

    iget-object p1, p0, Lt3/q1;->o:Lt3/q1$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lt3/q1$b;->a:Ls3/m1;

    iget v1, v0, Ls3/m1;->y:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v0

    iget v1, p2, Lq5/y;->h:I

    invoke-virtual {v0, v1}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v0

    iget p2, p2, Lq5/y;->i:I

    invoke-virtual {v0, p2}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p2

    new-instance v0, Lt3/q1$b;

    iget v1, p1, Lt3/q1$b;->b:I

    iget-object p1, p1, Lt3/q1$b;->c:Ljava/lang/String;

    invoke-direct {v0, p2, v1, p1}, Lt3/q1$b;-><init>(Ls3/m1;ILjava/lang/String;)V

    iput-object v0, p0, Lt3/q1;->o:Lt3/q1$b;

    :cond_0
    return-void
.end method

.method public r(Ls3/b3;Lt3/b$b;)V
    .locals 2

    invoke-virtual {p2}, Lt3/b$b;->d()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lt3/q1;->L0(Lt3/b$b;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2}, Lt3/q1;->R0(Ls3/b3;Lt3/b$b;)V

    invoke-virtual {p0, v0, v1}, Lt3/q1;->N0(J)V

    invoke-virtual {p0, p1, p2, v0, v1}, Lt3/q1;->P0(Ls3/b3;Lt3/b$b;J)V

    invoke-virtual {p0, v0, v1}, Lt3/q1;->M0(J)V

    invoke-virtual {p0, p1, p2, v0, v1}, Lt3/q1;->O0(Ls3/b3;Lt3/b$b;J)V

    const/16 p1, 0x404

    invoke-virtual {p2, p1}, Lt3/b$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt3/q1;->b:Lt3/r1;

    invoke-virtual {p2, p1}, Lt3/b$b;->c(I)Lt3/b$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lt3/r1;->c(Lt3/b$a;)V

    :cond_1
    return-void
.end method

.method public s(Lt3/b$a;Ls3/b3$e;Ls3/b3$e;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    iput-boolean p1, p0, Lt3/q1;->u:Z

    :cond_0
    iput p4, p0, Lt3/q1;->k:I

    return-void
.end method

.method public x(Lt3/b$a;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public y(Lt3/b$a;Lv3/e;)V
    .locals 1

    iget p1, p0, Lt3/q1;->x:I

    iget v0, p2, Lv3/e;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lt3/q1;->x:I

    iget p1, p0, Lt3/q1;->y:I

    iget p2, p2, Lv3/e;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Lt3/q1;->y:I

    return-void
.end method

.method public final z0(Lt3/q1$b;)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lt3/q1$b;->c:Ljava/lang/String;

    iget-object v0, p0, Lt3/q1;->b:Lt3/r1;

    invoke-interface {v0}, Lt3/r1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
