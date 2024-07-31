.class public final Lu3/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/a0$c;,
        Lu3/a0$b;,
        Lu3/a0$d;,
        Lu3/a0$k;,
        Lu3/a0$g;,
        Lu3/a0$l;,
        Lu3/a0$j;,
        Lu3/a0$m;,
        Lu3/a0$f;,
        Lu3/a0$e;,
        Lu3/a0$h;,
        Lu3/a0$i;
    }
.end annotation


# static fields
.field public static e0:Z = false

.field public static final f0:Ljava/lang/Object;

.field public static g0:Ljava/util/concurrent/ExecutorService;

.field public static h0:I


# instance fields
.field public A:Ljava/nio/ByteBuffer;

.field public B:I

.field public C:J

.field public D:J

.field public E:J

.field public F:J

.field public G:I

.field public H:Z

.field public I:Z

.field public J:J

.field public K:F

.field public L:[Lu3/g;

.field public M:[Ljava/nio/ByteBuffer;

.field public N:Ljava/nio/ByteBuffer;

.field public O:I

.field public P:Ljava/nio/ByteBuffer;

.field public Q:[B

.field public R:I

.field public S:I

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:Lu3/w;

.field public Z:Lu3/a0$d;

.field public final a:Lu3/f;

.field public a0:Z

.field public final b:Lu3/h;

.field public b0:J

.field public final c:Z

.field public c0:Z

.field public final d:Lu3/y;

.field public d0:Z

.field public final e:Lu3/l0;

.field public final f:[Lu3/g;

.field public final g:[Lu3/g;

.field public final h:Lp5/g;

.field public final i:Lu3/v;

.field public final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lu3/a0$j;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Z

.field public final l:I

.field public m:Lu3/a0$m;

.field public final n:Lu3/a0$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/a0$k<",
            "Lu3/t$b;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lu3/a0$k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/a0$k<",
            "Lu3/t$e;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lu3/a0$e;

.field public final q:Ls3/r$a;

.field public r:Lt3/s1;

.field public s:Lu3/t$c;

.field public t:Lu3/a0$g;

.field public u:Lu3/a0$g;

.field public v:Landroid/media/AudioTrack;

.field public w:Lu3/e;

.field public x:Lu3/a0$j;

.field public y:Lu3/a0$j;

.field public z:Ls3/a3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu3/a0;->f0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu3/a0$f;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu3/a0$f;->a(Lu3/a0$f;)Lu3/f;

    move-result-object v0

    iput-object v0, p0, Lu3/a0;->a:Lu3/f;

    invoke-static {p1}, Lu3/a0$f;->b(Lu3/a0$f;)Lu3/h;

    move-result-object v0

    iput-object v0, p0, Lu3/a0;->b:Lu3/h;

    sget v1, Lp5/n0;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x15

    if-lt v1, v4, :cond_0

    invoke-static {p1}, Lu3/a0$f;->c(Lu3/a0$f;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    iput-boolean v4, p0, Lu3/a0;->c:Z

    const/16 v4, 0x17

    if-lt v1, v4, :cond_1

    invoke-static {p1}, Lu3/a0$f;->d(Lu3/a0$f;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    iput-boolean v4, p0, Lu3/a0;->k:Z

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_2

    invoke-static {p1}, Lu3/a0$f;->e(Lu3/a0$f;)I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    iput v1, p0, Lu3/a0;->l:I

    iget-object v1, p1, Lu3/a0$f;->f:Lu3/a0$e;

    iput-object v1, p0, Lu3/a0;->p:Lu3/a0$e;

    new-instance v1, Lp5/g;

    sget-object v4, Lp5/d;->a:Lp5/d;

    invoke-direct {v1, v4}, Lp5/g;-><init>(Lp5/d;)V

    iput-object v1, p0, Lu3/a0;->h:Lp5/g;

    invoke-virtual {v1}, Lp5/g;->e()Z

    new-instance v1, Lu3/v;

    new-instance v4, Lu3/a0$l;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lu3/a0$l;-><init>(Lu3/a0;Lu3/a0$a;)V

    invoke-direct {v1, v4}, Lu3/v;-><init>(Lu3/v$a;)V

    iput-object v1, p0, Lu3/a0;->i:Lu3/v;

    new-instance v1, Lu3/y;

    invoke-direct {v1}, Lu3/y;-><init>()V

    iput-object v1, p0, Lu3/a0;->d:Lu3/y;

    new-instance v4, Lu3/l0;

    invoke-direct {v4}, Lu3/l0;-><init>()V

    iput-object v4, p0, Lu3/a0;->e:Lu3/l0;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x3

    new-array v6, v6, [Lu3/x;

    new-instance v7, Lu3/h0;

    invoke-direct {v7}, Lu3/h0;-><init>()V

    aput-object v7, v6, v3

    aput-object v1, v6, v2

    const/4 v1, 0x2

    aput-object v4, v6, v1

    invoke-static {v5, v6}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-interface {v0}, Lu3/h;->e()[Lu3/g;

    move-result-object v0

    invoke-static {v5, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-array v0, v3, [Lu3/g;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu3/g;

    iput-object v0, p0, Lu3/a0;->f:[Lu3/g;

    new-array v0, v2, [Lu3/g;

    new-instance v1, Lu3/d0;

    invoke-direct {v1}, Lu3/d0;-><init>()V

    aput-object v1, v0, v3

    iput-object v0, p0, Lu3/a0;->g:[Lu3/g;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lu3/a0;->K:F

    sget-object v0, Lu3/e;->n:Lu3/e;

    iput-object v0, p0, Lu3/a0;->w:Lu3/e;

    iput v3, p0, Lu3/a0;->X:I

    new-instance v0, Lu3/w;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v1}, Lu3/w;-><init>(IF)V

    iput-object v0, p0, Lu3/a0;->Y:Lu3/w;

    new-instance v0, Lu3/a0$j;

    sget-object v1, Ls3/a3;->k:Ls3/a3;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v0

    move-object v5, v1

    invoke-direct/range {v4 .. v11}, Lu3/a0$j;-><init>(Ls3/a3;ZJJLu3/a0$a;)V

    iput-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    iput-object v1, p0, Lu3/a0;->z:Ls3/a3;

    const/4 v0, -0x1

    iput v0, p0, Lu3/a0;->S:I

    new-array v0, v3, [Lu3/g;

    iput-object v0, p0, Lu3/a0;->L:[Lu3/g;

    new-array v0, v3, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu3/a0;->M:[Ljava/nio/ByteBuffer;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    new-instance v0, Lu3/a0$k;

    const-wide/16 v1, 0x64

    invoke-direct {v0, v1, v2}, Lu3/a0$k;-><init>(J)V

    iput-object v0, p0, Lu3/a0;->n:Lu3/a0$k;

    new-instance v0, Lu3/a0$k;

    invoke-direct {v0, v1, v2}, Lu3/a0$k;-><init>(J)V

    iput-object v0, p0, Lu3/a0;->o:Lu3/a0$k;

    iget-object p1, p1, Lu3/a0$f;->g:Ls3/r$a;

    iput-object p1, p0, Lu3/a0;->q:Ls3/r$a;

    return-void
.end method

.method public synthetic constructor <init>(Lu3/a0$f;Lu3/a0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/a0;-><init>(Lu3/a0$f;)V

    return-void
.end method

.method public static synthetic A(Lu3/a0;)J
    .locals 2

    invoke-virtual {p0}, Lu3/a0;->U()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic B(Lu3/a0;)J
    .locals 2

    invoke-virtual {p0}, Lu3/a0;->V()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic C(Lu3/a0;)J
    .locals 2

    iget-wide v0, p0, Lu3/a0;->b0:J

    return-wide v0
.end method

.method public static synthetic D(III)Landroid/media/AudioFormat;
    .locals 0

    invoke-static {p0, p1, p2}, Lu3/a0;->N(III)Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lu3/a0;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    return-object p0
.end method

.method public static synthetic F(Lu3/a0;)Lu3/t$c;
    .locals 0

    iget-object p0, p0, Lu3/a0;->s:Lu3/t$c;

    return-object p0
.end method

.method public static N(III)Landroid/media/AudioFormat;
    .locals 1

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    return-object p0
.end method

.method public static P(III)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p0

    const/4 p1, -0x2

    if-eq p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp5/a;->f(Z)V

    return p0
.end method

.method public static Q(ILjava/nio/ByteBuffer;)I
    .locals 2

    const/16 v0, 0x400

    const/4 v1, -0x1

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected audio encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-static {p1}, Lu3/g0;->g(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_2
    invoke-static {p1}, Lu3/c;->c(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_3
    return v0

    :pswitch_4
    const/16 p0, 0x200

    return p0

    :pswitch_5
    invoke-static {p1}, Lu3/b;->b(Ljava/nio/ByteBuffer;)I

    move-result p0

    if-ne p0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1, p0}, Lu3/b;->i(Ljava/nio/ByteBuffer;I)I

    move-result p0

    mul-int/lit8 p0, p0, 0x10

    :goto_0
    return p0

    :pswitch_6
    const/16 p0, 0x800

    return p0

    :pswitch_7
    return v0

    :pswitch_8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p0

    invoke-static {p1, p0}, Lp5/n0;->I(Ljava/nio/ByteBuffer;I)I

    move-result p0

    invoke-static {p0}, Lu3/f0;->m(I)I

    move-result p0

    if-eq p0, v1, :cond_1

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_9
    invoke-static {p1}, Lu3/c0;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    :pswitch_a
    invoke-static {p1}, Lu3/b;->e(Ljava/nio/ByteBuffer;)I

    move-result p0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_a
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static X(I)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, -0x6

    if-eq p0, v0, :cond_1

    :cond_0
    const/16 v0, -0x20

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static Z(Landroid/media/AudioTrack;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/media/AudioTrack;->isOffloadedPlayback()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic a0(Landroid/media/AudioTrack;Lp5/g;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {p1}, Lp5/g;->e()Z

    sget-object p0, Lu3/a0;->f0:Ljava/lang/Object;

    monitor-enter p0

    :try_start_1
    sget p1, Lu3/a0;->h0:I

    add-int/lit8 p1, p1, -0x1

    sput p1, Lu3/a0;->h0:I

    if-nez p1, :cond_0

    sget-object p1, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p0

    invoke-virtual {p1}, Lp5/g;->e()Z

    sget-object p1, Lu3/a0;->f0:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    sget v1, Lu3/a0;->h0:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Lu3/a0;->h0:I

    if-nez v1, :cond_1

    sget-object v1, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v0, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw p0

    :catchall_2
    move-exception p0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0
.end method

.method public static f0(Landroid/media/AudioTrack;Lp5/g;)V
    .locals 3

    invoke-virtual {p1}, Lp5/g;->c()Z

    sget-object v0, Lu3/a0;->f0:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    const-string v1, "ExoPlayer:AudioTrackReleaseThread"

    invoke-static {v1}, Lp5/n0;->C0(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    sput-object v1, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    :cond_0
    sget v1, Lu3/a0;->h0:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lu3/a0;->h0:I

    sget-object v1, Lu3/a0;->g0:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lu3/z;

    invoke-direct {v2, p0, p1}, Lu3/z;-><init>(Landroid/media/AudioTrack;Lp5/g;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static k0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void
.end method

.method public static l0(Landroid/media/AudioTrack;F)V
    .locals 0

    invoke-virtual {p0, p1, p1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method public static r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p0

    return p0
.end method

.method public static synthetic y(Landroid/media/AudioTrack;Lp5/g;)V
    .locals 0

    invoke-static {p0, p1}, Lu3/a0;->a0(Landroid/media/AudioTrack;Lp5/g;)V

    return-void
.end method

.method public static synthetic z(Lu3/a0;)Z
    .locals 0

    iget-boolean p0, p0, Lu3/a0;->V:Z

    return p0
.end method


# virtual methods
.method public final G(J)V
    .locals 11

    invoke-virtual {p0}, Lu3/a0;->n0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->b:Lu3/h;

    invoke-virtual {p0}, Lu3/a0;->O()Ls3/a3;

    move-result-object v1

    invoke-interface {v0, v1}, Lu3/h;->b(Ls3/a3;)Ls3/a3;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ls3/a3;->k:Ls3/a3;

    :goto_0
    move-object v2, v0

    invoke-virtual {p0}, Lu3/a0;->n0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/a0;->b:Lu3/h;

    invoke-virtual {p0}, Lu3/a0;->T()Z

    move-result v1

    invoke-interface {v0, v1}, Lu3/h;->d(Z)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v9, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    new-instance v10, Lu3/a0$j;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iget-object p1, p0, Lu3/a0;->u:Lu3/a0$g;

    invoke-virtual {p0}, Lu3/a0;->V()J

    move-result-wide v6

    invoke-virtual {p1, v6, v7}, Lu3/a0$g;->h(J)J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v1, v10

    move v3, v0

    invoke-direct/range {v1 .. v8}, Lu3/a0$j;-><init>(Ls3/a3;ZJJLu3/a0$a;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lu3/a0;->m0()V

    iget-object p1, p0, Lu3/a0;->s:Lu3/t$c;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lu3/t$c;->onSkipSilenceEnabledChanged(Z)V

    :cond_2
    return-void
.end method

.method public final H(J)J
    .locals 4

    :goto_0
    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$j;

    iget-wide v0, v0, Lu3/a0$j;->d:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$j;

    iput-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    iget-wide v1, v0, Lu3/a0$j;->d:J

    sub-long v1, p1, v1

    iget-object v0, v0, Lu3/a0$j;->a:Ls3/a3;

    sget-object v3, Ls3/a3;->k:Ls3/a3;

    invoke-virtual {v0, v3}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lu3/a0;->y:Lu3/a0$j;

    iget-wide p1, p1, Lu3/a0$j;->c:J

    add-long/2addr p1, v1

    return-wide p1

    :cond_1
    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lu3/a0;->b:Lu3/h;

    invoke-interface {p1, v1, v2}, Lu3/h;->a(J)J

    move-result-wide p1

    iget-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    iget-wide v0, v0, Lu3/a0$j;->c:J

    add-long/2addr v0, p1

    return-wide v0

    :cond_2
    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$j;

    iget-wide v1, v0, Lu3/a0$j;->d:J

    sub-long/2addr v1, p1

    iget-object p1, p0, Lu3/a0;->y:Lu3/a0$j;

    iget-object p1, p1, Lu3/a0$j;->a:Ls3/a3;

    iget p1, p1, Ls3/a3;->h:F

    invoke-static {v1, v2, p1}, Lp5/n0;->Z(JF)J

    move-result-wide p1

    iget-wide v0, v0, Lu3/a0$j;->c:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public final I(J)J
    .locals 3

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object v1, p0, Lu3/a0;->b:Lu3/h;

    invoke-interface {v1}, Lu3/h;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu3/a0$g;->h(J)J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final J(Lu3/a0$g;)Landroid/media/AudioTrack;
    .locals 3

    :try_start_0
    iget-boolean v0, p0, Lu3/a0;->a0:Z

    iget-object v1, p0, Lu3/a0;->w:Lu3/e;

    iget v2, p0, Lu3/a0;->X:I

    invoke-virtual {p1, v0, v1, v2}, Lu3/a0$g;->a(ZLu3/e;I)Landroid/media/AudioTrack;

    move-result-object p1

    iget-object v0, p0, Lu3/a0;->q:Ls3/r$a;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lu3/a0;->Z(Landroid/media/AudioTrack;)Z

    move-result v1

    invoke-interface {v0, v1}, Ls3/r$a;->B(Z)V
    :try_end_0
    .catch Lu3/t$b; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lu3/a0;->s:Lu3/t$c;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lu3/t$c;->a(Ljava/lang/Exception;)V

    :cond_1
    throw p1
.end method

.method public final K()Landroid/media/AudioTrack;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$g;

    invoke-virtual {p0, v0}, Lu3/a0;->J(Lu3/a0$g;)Landroid/media/AudioTrack;

    move-result-object v0
    :try_end_0
    .catch Lu3/t$b; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lu3/a0;->u:Lu3/a0$g;

    iget v2, v1, Lu3/a0$g;->h:I

    const v3, 0xf4240

    if-le v2, v3, :cond_0

    invoke-virtual {v1, v3}, Lu3/a0$g;->c(I)Lu3/a0$g;

    move-result-object v1

    :try_start_1
    invoke-virtual {p0, v1}, Lu3/a0;->J(Lu3/a0$g;)Landroid/media/AudioTrack;

    move-result-object v2

    iput-object v1, p0, Lu3/a0;->u:Lu3/a0$g;
    :try_end_1
    .catch Lu3/t$b; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0}, Lu3/a0;->b0()V

    throw v0
.end method

.method public final L()Z
    .locals 9

    iget v0, p0, Lu3/a0;->S:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput v3, p0, Lu3/a0;->S:I

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_1
    iget v4, p0, Lu3/a0;->S:I

    iget-object v5, p0, Lu3/a0;->L:[Lu3/g;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_3

    aget-object v4, v5, v4

    if-eqz v0, :cond_1

    invoke-interface {v4}, Lu3/g;->f()V

    :cond_1
    invoke-virtual {p0, v7, v8}, Lu3/a0;->d0(J)V

    invoke-interface {v4}, Lu3/g;->c()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    :cond_2
    iget v0, p0, Lu3/a0;->S:I

    add-int/2addr v0, v2

    iput v0, p0, Lu3/a0;->S:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0, v7, v8}, Lu3/a0;->q0(Ljava/nio/ByteBuffer;J)V

    iget-object v0, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_4

    return v3

    :cond_4
    iput v1, p0, Lu3/a0;->S:I

    return v2
.end method

.method public final M()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu3/a0;->L:[Lu3/g;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-interface {v1}, Lu3/g;->flush()V

    iget-object v2, p0, Lu3/a0;->M:[Ljava/nio/ByteBuffer;

    invoke-interface {v1}, Lu3/g;->b()Ljava/nio/ByteBuffer;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final O()Ls3/a3;
    .locals 1

    invoke-virtual {p0}, Lu3/a0;->R()Lu3/a0$j;

    move-result-object v0

    iget-object v0, v0, Lu3/a0$j;->a:Ls3/a3;

    return-object v0
.end method

.method public final R()Lu3/a0$j;
    .locals 1

    iget-object v0, p0, Lu3/a0;->x:Lu3/a0$j;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$j;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    :goto_0
    return-object v0
.end method

.method public final S(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/16 p1, 0x1e

    if-ne v0, p1, :cond_2

    sget-object p1, Lp5/n0;->d:Ljava/lang/String;

    const-string p2, "Pixel"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x2

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public T()Z
    .locals 1

    invoke-virtual {p0}, Lu3/a0;->R()Lu3/a0$j;

    move-result-object v0

    iget-boolean v0, v0, Lu3/a0$j;->b:Z

    return v0
.end method

.method public final U()J
    .locals 5

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget v1, v0, Lu3/a0$g;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu3/a0;->C:J

    iget v0, v0, Lu3/a0$g;->b:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu3/a0;->D:J

    :goto_0
    return-wide v1
.end method

.method public final V()J
    .locals 5

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget v1, v0, Lu3/a0$g;->c:I

    if-nez v1, :cond_0

    iget-wide v1, p0, Lu3/a0;->E:J

    iget v0, v0, Lu3/a0$g;->d:I

    int-to-long v3, v0

    div-long/2addr v1, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lu3/a0;->F:J

    :goto_0
    return-wide v1
.end method

.method public final W()Z
    .locals 10

    iget-object v0, p0, Lu3/a0;->h:Lp5/g;

    invoke-virtual {v0}, Lp5/g;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lu3/a0;->K()Landroid/media/AudioTrack;

    move-result-object v0

    iput-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu3/a0;->Z(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {p0, v0}, Lu3/a0;->e0(Landroid/media/AudioTrack;)V

    iget v0, p0, Lu3/a0;->l:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object v2, v2, Lu3/a0$g;->a:Ls3/m1;

    iget v3, v2, Ls3/m1;->I:I

    iget v2, v2, Ls3/m1;->J:I

    invoke-virtual {v0, v3, v2}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    :cond_1
    sget v0, Lp5/n0;->a:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_2

    iget-object v2, p0, Lu3/a0;->r:Lt3/s1;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {v3, v2}, Lu3/a0$c;->a(Landroid/media/AudioTrack;Lt3/s1;)V

    :cond_2
    iget-object v2, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v2

    iput v2, p0, Lu3/a0;->X:I

    iget-object v3, p0, Lu3/a0;->i:Lu3/v;

    iget-object v4, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu3/a0;->u:Lu3/a0$g;

    iget v5, v2, Lu3/a0$g;->c:I

    const/4 v6, 0x2

    const/4 v9, 0x1

    if-ne v5, v6, :cond_3

    move v5, v9

    goto :goto_0

    :cond_3
    move v5, v1

    :goto_0
    iget v6, v2, Lu3/a0$g;->g:I

    iget v7, v2, Lu3/a0$g;->d:I

    iget v8, v2, Lu3/a0$g;->h:I

    invoke-virtual/range {v3 .. v8}, Lu3/v;->s(Landroid/media/AudioTrack;ZIII)V

    invoke-virtual {p0}, Lu3/a0;->j0()V

    iget-object v1, p0, Lu3/a0;->Y:Lu3/w;

    iget v1, v1, Lu3/w;->a:I

    if-eqz v1, :cond_4

    iget-object v2, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v2, v1}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    iget-object v1, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu3/a0;->Y:Lu3/w;

    iget v2, v2, Lu3/w;->b:F

    invoke-virtual {v1, v2}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_4
    iget-object v1, p0, Lu3/a0;->Z:Lu3/a0$d;

    if-eqz v1, :cond_5

    const/16 v2, 0x17

    if-lt v0, v2, :cond_5

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {v0, v1}, Lu3/a0$b;->a(Landroid/media/AudioTrack;Lu3/a0$d;)V

    :cond_5
    iput-boolean v9, p0, Lu3/a0;->I:Z

    return v9
.end method

.method public final Y()Z
    .locals 1

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a(Ls3/m1;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lu3/a0;->s(Ls3/m1;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Lt3/s1;)V
    .locals 0

    iput-object p1, p0, Lu3/a0;->r:Lt3/s1;

    return-void
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    invoke-virtual {v0}, Lu3/a0$g;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/a0;->c0:Z

    return-void
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu3/a0;->T:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu3/a0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final c0()V
    .locals 3

    iget-boolean v0, p0, Lu3/a0;->U:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/a0;->U:Z

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {p0}, Lu3/a0;->V()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu3/v;->g(J)V

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    const/4 v0, 0x0

    iput v0, p0, Lu3/a0;->B:I

    :cond_0
    return-void
.end method

.method public d(Ls3/a3;)V
    .locals 4

    new-instance v0, Ls3/a3;

    iget v1, p1, Ls3/a3;->h:F

    const v2, 0x3dcccccd    # 0.1f

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v1, v2, v3}, Lp5/n0;->p(FFF)F

    move-result v1

    iget p1, p1, Ls3/a3;->i:F

    invoke-static {p1, v2, v3}, Lp5/n0;->p(FFF)F

    move-result p1

    invoke-direct {v0, v1, p1}, Ls3/a3;-><init>(FF)V

    iget-boolean p1, p0, Lu3/a0;->k:Z

    if-eqz p1, :cond_0

    sget p1, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-lt p1, v1, :cond_0

    invoke-virtual {p0, v0}, Lu3/a0;->i0(Ls3/a3;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu3/a0;->T()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lu3/a0;->h0(Ls3/a3;Z)V

    :goto_0
    return-void
.end method

.method public final d0(J)V
    .locals 5

    iget-object v0, p0, Lu3/a0;->L:[Lu3/g;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_6

    if-lez v1, :cond_0

    iget-object v2, p0, Lu3/a0;->M:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lu3/g;->a:Ljava/nio/ByteBuffer;

    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lu3/a0;->q0(Ljava/nio/ByteBuffer;J)V

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lu3/a0;->L:[Lu3/g;

    aget-object v3, v3, v1

    iget v4, p0, Lu3/a0;->S:I

    if-le v1, v4, :cond_3

    invoke-interface {v3, v2}, Lu3/g;->e(Ljava/nio/ByteBuffer;)V

    :cond_3
    invoke-interface {v3}, Lu3/g;->b()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lu3/a0;->M:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_5

    return-void

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public e(F)V
    .locals 1

    iget v0, p0, Lu3/a0;->K:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lu3/a0;->K:F

    invoke-virtual {p0}, Lu3/a0;->j0()V

    :cond_0
    return-void
.end method

.method public final e0(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu3/a0;->m:Lu3/a0$m;

    if-nez v0, :cond_0

    new-instance v0, Lu3/a0$m;

    invoke-direct {v0, p0}, Lu3/a0$m;-><init>(Lu3/a0;)V

    iput-object v0, p0, Lu3/a0;->m:Lu3/a0$m;

    :cond_0
    iget-object v0, p0, Lu3/a0;->m:Lu3/a0$m;

    invoke-virtual {v0, p1}, Lu3/a0$m;->a(Landroid/media/AudioTrack;)V

    return-void
.end method

.method public f(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lu3/a0$d;

    invoke-direct {v0, p1}, Lu3/a0$d;-><init>(Landroid/media/AudioDeviceInfo;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lu3/a0;->Z:Lu3/a0$d;

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lu3/a0$b;->a(Landroid/media/AudioTrack;Lu3/a0$d;)V

    :cond_1
    return-void
.end method

.method public flush()V
    .locals 3

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lu3/a0;->g0()V

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {v0}, Lu3/a0;->Z(Landroid/media/AudioTrack;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/a0;->m:Lu3/a0$m;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/a0$m;

    iget-object v1, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Lu3/a0$m;->b(Landroid/media/AudioTrack;)V

    :cond_1
    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_2

    iget-boolean v0, p0, Lu3/a0;->W:Z

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput v0, p0, Lu3/a0;->X:I

    :cond_2
    iget-object v0, p0, Lu3/a0;->t:Lu3/a0$g;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iput-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iput-object v1, p0, Lu3/a0;->t:Lu3/a0$g;

    :cond_3
    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->q()V

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v2, p0, Lu3/a0;->h:Lp5/g;

    invoke-static {v0, v2}, Lu3/a0;->f0(Landroid/media/AudioTrack;Lp5/g;)V

    iput-object v1, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    :cond_4
    iget-object v0, p0, Lu3/a0;->o:Lu3/a0$k;

    invoke-virtual {v0}, Lu3/a0$k;->a()V

    iget-object v0, p0, Lu3/a0;->n:Lu3/a0$k;

    invoke-virtual {v0}, Lu3/a0$k;->a()V

    return-void
.end method

.method public g(Lu3/w;)V
    .locals 4

    iget-object v0, p0, Lu3/a0;->Y:Lu3/w;

    invoke-virtual {v0, p1}, Lu3/w;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lu3/w;->a:I

    iget v1, p1, Lu3/w;->b:F

    iget-object v2, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lu3/a0;->Y:Lu3/w;

    iget v3, v3, Lu3/w;->a:I

    if-eq v3, v0, :cond_1

    invoke-virtual {v2, v0}, Landroid/media/AudioTrack;->attachAuxEffect(I)I

    :cond_1
    if-eqz v0, :cond_2

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setAuxEffectSendLevel(F)I

    :cond_2
    iput-object p1, p0, Lu3/a0;->Y:Lu3/w;

    return-void
.end method

.method public final g0()V
    .locals 12

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu3/a0;->C:J

    iput-wide v0, p0, Lu3/a0;->D:J

    iput-wide v0, p0, Lu3/a0;->E:J

    iput-wide v0, p0, Lu3/a0;->F:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lu3/a0;->d0:Z

    iput v2, p0, Lu3/a0;->G:I

    new-instance v11, Lu3/a0$j;

    invoke-virtual {p0}, Lu3/a0;->O()Ls3/a3;

    move-result-object v4

    invoke-virtual {p0}, Lu3/a0;->T()Z

    move-result v5

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lu3/a0$j;-><init>(Ls3/a3;ZJJLu3/a0$a;)V

    iput-object v11, p0, Lu3/a0;->y:Lu3/a0$j;

    iput-wide v0, p0, Lu3/a0;->J:J

    const/4 v0, 0x0

    iput-object v0, p0, Lu3/a0;->x:Lu3/a0$j;

    iget-object v1, p0, Lu3/a0;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    iput-object v0, p0, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu3/a0;->O:I

    iput-object v0, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    iput-boolean v2, p0, Lu3/a0;->U:Z

    iput-boolean v2, p0, Lu3/a0;->T:Z

    const/4 v1, -0x1

    iput v1, p0, Lu3/a0;->S:I

    iput-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    iput v2, p0, Lu3/a0;->B:I

    iget-object v0, p0, Lu3/a0;->e:Lu3/l0;

    invoke-virtual {v0}, Lu3/l0;->n()V

    invoke-virtual {p0}, Lu3/a0;->M()V

    return-void
.end method

.method public h()Ls3/a3;
    .locals 1

    iget-boolean v0, p0, Lu3/a0;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->z:Ls3/a3;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu3/a0;->O()Ls3/a3;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final h0(Ls3/a3;Z)V
    .locals 9

    invoke-virtual {p0}, Lu3/a0;->R()Lu3/a0$j;

    move-result-object v0

    iget-object v1, v0, Lu3/a0$j;->a:Ls3/a3;

    invoke-virtual {p1, v1}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lu3/a0$j;->b:Z

    if-eq p2, v0, :cond_2

    :cond_0
    new-instance v0, Lu3/a0$j;

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lu3/a0$j;-><init>(Ls3/a3;ZJJLu3/a0$a;)V

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Lu3/a0;->x:Lu3/a0$j;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lu3/a0;->y:Lu3/a0$j;

    :cond_2
    :goto_0
    return-void
.end method

.method public i(Lu3/e;)V
    .locals 1

    iget-object v0, p0, Lu3/a0;->w:Lu3/e;

    invoke-virtual {v0, p1}, Lu3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lu3/a0;->w:Lu3/e;

    iget-boolean p1, p0, Lu3/a0;->a0:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lu3/a0;->flush()V

    return-void
.end method

.method public final i0(Ls3/a3;)V
    .locals 2

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/media/PlaybackParams;

    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    move-result-object v0

    iget v1, p1, Ls3/a3;->h:F

    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object v0

    iget p1, p1, Ls3/a3;->i:F

    invoke-virtual {v0, p1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "DefaultAudioSink"

    const-string v1, "Failed to set playback params"

    invoke-static {v0, v1, p1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance p1, Ls3/a3;

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    move-result v0

    iget-object v1, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getPitch()F

    move-result v1

    invoke-direct {p1, v0, v1}, Ls3/a3;-><init>(FF)V

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    iget v1, p1, Ls3/a3;->h:F

    invoke-virtual {v0, v1}, Lu3/v;->t(F)V

    :cond_0
    iput-object p1, p0, Lu3/a0;->z:Ls3/a3;

    return-void
.end method

.method public j()V
    .locals 1

    iget-boolean v0, p0, Lu3/a0;->T:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu3/a0;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu3/a0;->c0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/a0;->T:Z

    :cond_0
    return-void
.end method

.method public final j0()V
    .locals 2

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget v1, p0, Lu3/a0;->K:F

    invoke-static {v0, v1}, Lu3/a0;->k0(Landroid/media/AudioTrack;F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget v1, p0, Lu3/a0;->K:F

    invoke-static {v0, v1}, Lu3/a0;->l0(Landroid/media/AudioTrack;F)V

    :goto_0
    return-void
.end method

.method public k()Z
    .locals 3

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {p0}, Lu3/a0;->V()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lu3/v;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l(I)V
    .locals 1

    iget v0, p0, Lu3/a0;->X:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Lu3/a0;->X:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lu3/a0;->W:Z

    invoke-virtual {p0}, Lu3/a0;->flush()V

    :cond_1
    return-void
.end method

.method public m(Z)J
    .locals 4

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu3/a0;->I:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0, p1}, Lu3/v;->d(Z)J

    move-result-wide v0

    iget-object p1, p0, Lu3/a0;->u:Lu3/a0$g;

    invoke-virtual {p0}, Lu3/a0;->V()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lu3/a0$g;->h(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu3/a0;->H(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu3/a0;->I(J)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0
.end method

.method public final m0()V
    .locals 6

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object v0, v0, Lu3/a0$g;->i:[Lu3/g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu3/g;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Lu3/g;->flush()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [Lu3/g;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lu3/g;

    iput-object v1, p0, Lu3/a0;->L:[Lu3/g;

    new-array v0, v0, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu3/a0;->M:[Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lu3/a0;->M()V

    return-void
.end method

.method public n()V
    .locals 1

    iget-boolean v0, p0, Lu3/a0;->a0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/a0;->a0:Z

    invoke-virtual {p0}, Lu3/a0;->flush()V

    :cond_0
    return-void
.end method

.method public final n0()Z
    .locals 2

    iget-boolean v0, p0, Lu3/a0;->a0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object v0, v0, Lu3/a0$g;->a:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object v0, v0, Lu3/a0$g;->a:Ls3/m1;

    iget v0, v0, Ls3/m1;->H:I

    invoke-virtual {p0, v0}, Lu3/a0;->o0(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o0(I)Z
    .locals 1

    iget-boolean v0, p0, Lu3/a0;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lp5/n0;->s0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/a0;->H:Z

    return-void
.end method

.method public final p0(Ls3/m1;Lu3/e;)Z
    .locals 4

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_9

    iget v0, p0, Lu3/a0;->l:I

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p1, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {v0, v2}, Lp5/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget v2, p1, Ls3/m1;->F:I

    invoke-static {v2}, Lp5/n0;->G(I)I

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v3, p1, Ls3/m1;->G:I

    invoke-static {v3, v2, v0}, Lu3/a0;->N(III)Landroid/media/AudioFormat;

    move-result-object v0

    invoke-virtual {p2}, Lu3/e;->b()Lu3/e$d;

    move-result-object p2

    iget-object p2, p2, Lu3/e$d;->a:Landroid/media/AudioAttributes;

    invoke-virtual {p0, v0, p2}, Lu3/a0;->S(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p2

    if-eqz p2, :cond_9

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 p1, 0x2

    if-ne p2, p1, :cond_3

    return v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    iget p2, p1, Ls3/m1;->I:I

    if-nez p2, :cond_6

    iget p1, p1, Ls3/m1;->J:I

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move p1, v1

    goto :goto_1

    :cond_6
    :goto_0
    move p1, v0

    :goto_1
    iget p2, p0, Lu3/a0;->l:I

    if-ne p2, v0, :cond_7

    move p2, v0

    goto :goto_2

    :cond_7
    move p2, v1

    :goto_2
    if-eqz p1, :cond_8

    if-nez p2, :cond_9

    :cond_8
    move v1, v0

    :cond_9
    :goto_3
    return v1
.end method

.method public pause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/a0;->V:Z

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_0
    return-void
.end method

.method public q(Lu3/t$c;)V
    .locals 0

    iput-object p1, p0, Lu3/a0;->s:Lu3/t$c;

    return-void
.end method

.method public final q0(Ljava/nio/ByteBuffer;J)V
    .locals 12

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    const/16 v1, 0x15

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    if-ne v0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {v0}, Lp5/a;->a(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    sget v0, Lp5/n0;->a:I

    if-ge v0, v1, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget-object v4, p0, Lu3/a0;->Q:[B

    if-eqz v4, :cond_3

    array-length v4, v4

    if-ge v4, v0, :cond_4

    :cond_3
    new-array v4, v0, [B

    iput-object v4, p0, Lu3/a0;->Q:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    iget-object v5, p0, Lu3/a0;->Q:[B

    invoke-virtual {p1, v5, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v3, p0, Lu3/a0;->R:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    sget v4, Lp5/n0;->a:I

    if-ge v4, v1, :cond_7

    iget-object p2, p0, Lu3/a0;->i:Lu3/v;

    iget-wide v4, p0, Lu3/a0;->E:J

    invoke-virtual {p2, v4, v5}, Lu3/v;->c(J)I

    move-result p2

    if-lez p2, :cond_6

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object p3, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu3/a0;->Q:[B

    iget v4, p0, Lu3/a0;->R:I

    invoke-virtual {p3, v1, v4, p2}, Landroid/media/AudioTrack;->write([BII)I

    move-result p2

    if-lez p2, :cond_a

    iget p3, p0, Lu3/a0;->R:I

    add-int/2addr p3, p2

    iput p3, p0, Lu3/a0;->R:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_3

    :cond_6
    move p2, v3

    goto :goto_3

    :cond_7
    iget-boolean v1, p0, Lu3/a0;->a0:Z

    if-eqz v1, :cond_9

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p2, v4

    if-eqz v1, :cond_8

    move v1, v2

    goto :goto_2

    :cond_8
    move v1, v3

    :goto_2
    invoke-static {v1}, Lp5/a;->f(Z)V

    iget-object v7, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    move-object v6, p0

    move-object v8, p1

    move v9, v0

    move-wide v10, p2

    invoke-virtual/range {v6 .. v11}, Lu3/a0;->s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I

    move-result p2

    goto :goto_3

    :cond_9
    iget-object p2, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {p2, p1, v0}, Lu3/a0;->r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p2

    :cond_a
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, p0, Lu3/a0;->b0:J

    const-wide/16 v4, 0x0

    if-gez p2, :cond_e

    invoke-static {p2}, Lu3/a0;->X(I)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-wide v0, p0, Lu3/a0;->F:J

    cmp-long p1, v0, v4

    if-lez p1, :cond_b

    goto :goto_4

    :cond_b
    move v2, v3

    :goto_4
    new-instance p1, Lu3/t$e;

    iget-object p3, p0, Lu3/a0;->u:Lu3/a0$g;

    iget-object p3, p3, Lu3/a0$g;->a:Ls3/m1;

    invoke-direct {p1, p2, p3, v2}, Lu3/t$e;-><init>(ILs3/m1;Z)V

    iget-object p2, p0, Lu3/a0;->s:Lu3/t$c;

    if-eqz p2, :cond_c

    invoke-interface {p2, p1}, Lu3/t$c;->a(Ljava/lang/Exception;)V

    :cond_c
    iget-boolean p2, p1, Lu3/t$e;->i:Z

    if-nez p2, :cond_d

    iget-object p2, p0, Lu3/a0;->o:Lu3/a0$k;

    invoke-virtual {p2, p1}, Lu3/a0$k;->b(Ljava/lang/Exception;)V

    return-void

    :cond_d
    throw p1

    :cond_e
    iget-object p3, p0, Lu3/a0;->o:Lu3/a0$k;

    invoke-virtual {p3}, Lu3/a0$k;->a()V

    iget-object p3, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {p3}, Lu3/a0;->Z(Landroid/media/AudioTrack;)Z

    move-result p3

    if-eqz p3, :cond_10

    iget-wide v6, p0, Lu3/a0;->F:J

    cmp-long p3, v6, v4

    if-lez p3, :cond_f

    iput-boolean v3, p0, Lu3/a0;->d0:Z

    :cond_f
    iget-boolean p3, p0, Lu3/a0;->V:Z

    if-eqz p3, :cond_10

    iget-object p3, p0, Lu3/a0;->s:Lu3/t$c;

    if-eqz p3, :cond_10

    if-ge p2, v0, :cond_10

    iget-boolean v1, p0, Lu3/a0;->d0:Z

    if-nez v1, :cond_10

    invoke-interface {p3}, Lu3/t$c;->c()V

    :cond_10
    iget-object p3, p0, Lu3/a0;->u:Lu3/a0$g;

    iget p3, p3, Lu3/a0$g;->c:I

    if-nez p3, :cond_11

    iget-wide v4, p0, Lu3/a0;->E:J

    int-to-long v6, p2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lu3/a0;->E:J

    :cond_11
    if-ne p2, v0, :cond_14

    if-eqz p3, :cond_13

    iget-object p2, p0, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    if-ne p1, p2, :cond_12

    goto :goto_5

    :cond_12
    move v2, v3

    :goto_5
    invoke-static {v2}, Lp5/a;->f(Z)V

    iget-wide p1, p0, Lu3/a0;->F:J

    iget p3, p0, Lu3/a0;->G:I

    int-to-long v0, p3

    iget p3, p0, Lu3/a0;->O:I

    int-to-long v2, p3

    mul-long/2addr v0, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Lu3/a0;->F:J

    :cond_13
    const/4 p1, 0x0

    iput-object p1, p0, Lu3/a0;->P:Ljava/nio/ByteBuffer;

    :cond_14
    return-void
.end method

.method public r()V
    .locals 3

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-boolean v0, p0, Lu3/a0;->W:Z

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-boolean v0, p0, Lu3/a0;->a0:Z

    if-nez v0, :cond_1

    iput-boolean v1, p0, Lu3/a0;->a0:Z

    invoke-virtual {p0}, Lu3/a0;->flush()V

    :cond_1
    return-void
.end method

.method public reset()V
    .locals 5

    invoke-virtual {p0}, Lu3/a0;->flush()V

    iget-object v0, p0, Lu3/a0;->f:[Lu3/g;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu3/g;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu3/a0;->g:[Lu3/g;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lu3/g;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p0, Lu3/a0;->V:Z

    iput-boolean v2, p0, Lu3/a0;->c0:Z

    return-void
.end method

.method public s(Ls3/m1;)I
    .locals 3

    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    iget v0, p1, Ls3/m1;->H:I

    invoke-static {v0}, Lp5/n0;->t0(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid PCM encoding: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Ls3/m1;->H:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DefaultAudioSink"

    invoke-static {v0, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget p1, p1, Ls3/m1;->H:I

    if-eq p1, v2, :cond_2

    iget-boolean v0, p0, Lu3/a0;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2

    :cond_3
    iget-boolean v0, p0, Lu3/a0;->c0:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lu3/a0;->w:Lu3/e;

    invoke-virtual {p0, p1, v0}, Lu3/a0;->p0(Ls3/m1;Lu3/e;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lu3/a0;->a:Lu3/f;

    invoke-virtual {v0, p1}, Lu3/f;->h(Ls3/m1;)Z

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v1
.end method

.method public final s0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;IJ)I
    .locals 10

    sget v0, Lp5/n0;->a:I

    const-wide/16 v1, 0x3e8

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_0

    const/4 v7, 0x1

    mul-long v8, p4, v1

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    const v3, 0x55550001

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_1
    iget v0, p0, Lu3/a0;->B:I

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    const/4 v4, 0x4

    invoke-virtual {v0, v4, p3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    const/16 v4, 0x8

    mul-long/2addr p4, v1

    invoke-virtual {v0, v4, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    iget-object p4, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    invoke-virtual {p4, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput p3, p0, Lu3/a0;->B:I

    :cond_2
    iget-object p4, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p4

    if-lez p4, :cond_4

    iget-object p5, p0, Lu3/a0;->A:Ljava/nio/ByteBuffer;

    const/4 v0, 0x1

    invoke-virtual {p1, p5, p4, v0}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result p5

    if-gez p5, :cond_3

    iput v3, p0, Lu3/a0;->B:I

    return p5

    :cond_3
    if-ge p5, p4, :cond_4

    return v3

    :cond_4
    invoke-static {p1, p2, p3}, Lu3/a0;->r0(Landroid/media/AudioTrack;Ljava/nio/ByteBuffer;I)I

    move-result p1

    if-gez p1, :cond_5

    iput v3, p0, Lu3/a0;->B:I

    return p1

    :cond_5
    iget p2, p0, Lu3/a0;->B:I

    sub-int/2addr p2, p1

    iput p2, p0, Lu3/a0;->B:I

    return p1
.end method

.method public t()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/a0;->V:Z

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->u()V

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public u(Ljava/nio/ByteBuffer;JI)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v4, p4

    iget-object v5, v1, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-ne v0, v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v6

    :goto_1
    invoke-static {v5}, Lp5/a;->a(Z)V

    iget-object v5, v1, Lu3/a0;->t:Lu3/a0$g;

    const/4 v8, 0x0

    if-eqz v5, :cond_7

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->L()Z

    move-result v5

    if-nez v5, :cond_2

    return v7

    :cond_2
    iget-object v5, v1, Lu3/a0;->t:Lu3/a0$g;

    iget-object v9, v1, Lu3/a0;->u:Lu3/a0$g;

    invoke-virtual {v5, v9}, Lu3/a0$g;->b(Lu3/a0$g;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->c0()V

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->k()Z

    move-result v5

    if-eqz v5, :cond_3

    return v7

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lu3/a0;->flush()V

    goto :goto_2

    :cond_4
    iget-object v5, v1, Lu3/a0;->t:Lu3/a0$g;

    iput-object v5, v1, Lu3/a0;->u:Lu3/a0$g;

    iput-object v8, v1, Lu3/a0;->t:Lu3/a0$g;

    iget-object v5, v1, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-static {v5}, Lu3/a0;->Z(Landroid/media/AudioTrack;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, v1, Lu3/a0;->l:I

    const/4 v9, 0x3

    if-eq v5, v9, :cond_6

    iget-object v5, v1, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v5

    if-ne v5, v9, :cond_5

    iget-object v5, v1, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v5}, Landroid/media/AudioTrack;->setOffloadEndOfStream()V

    :cond_5
    iget-object v5, v1, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v9, v1, Lu3/a0;->u:Lu3/a0$g;

    iget-object v9, v9, Lu3/a0$g;->a:Ls3/m1;

    iget v10, v9, Ls3/m1;->I:I

    iget v9, v9, Ls3/m1;->J:I

    invoke-virtual {v5, v10, v9}, Landroid/media/AudioTrack;->setOffloadDelayPadding(II)V

    iput-boolean v6, v1, Lu3/a0;->d0:Z

    :cond_6
    :goto_2
    invoke-virtual {v1, v2, v3}, Lu3/a0;->G(J)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lu3/a0;->Y()Z

    move-result v5

    if-nez v5, :cond_9

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lu3/a0;->W()Z

    move-result v5
    :try_end_0
    .catch Lu3/t$b; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v5, :cond_9

    return v7

    :catch_0
    move-exception v0

    move-object v2, v0

    iget-boolean v0, v2, Lu3/t$b;->i:Z

    if-nez v0, :cond_8

    iget-object v0, v1, Lu3/a0;->n:Lu3/a0$k;

    invoke-virtual {v0, v2}, Lu3/a0$k;->b(Ljava/lang/Exception;)V

    return v7

    :cond_8
    throw v2

    :cond_9
    iget-object v5, v1, Lu3/a0;->n:Lu3/a0$k;

    invoke-virtual {v5}, Lu3/a0$k;->a()V

    iget-boolean v5, v1, Lu3/a0;->I:Z

    const-wide/16 v9, 0x0

    if-eqz v5, :cond_b

    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    iput-wide v11, v1, Lu3/a0;->J:J

    iput-boolean v7, v1, Lu3/a0;->H:Z

    iput-boolean v7, v1, Lu3/a0;->I:Z

    iget-boolean v5, v1, Lu3/a0;->k:Z

    if-eqz v5, :cond_a

    sget v5, Lp5/n0;->a:I

    const/16 v11, 0x17

    if-lt v5, v11, :cond_a

    iget-object v5, v1, Lu3/a0;->z:Ls3/a3;

    invoke-virtual {v1, v5}, Lu3/a0;->i0(Ls3/a3;)V

    :cond_a
    invoke-virtual {v1, v2, v3}, Lu3/a0;->G(J)V

    iget-boolean v5, v1, Lu3/a0;->V:Z

    if-eqz v5, :cond_b

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->t()V

    :cond_b
    iget-object v5, v1, Lu3/a0;->i:Lu3/v;

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->V()J

    move-result-wide v11

    invoke-virtual {v5, v11, v12}, Lu3/v;->k(J)Z

    move-result v5

    if-nez v5, :cond_c

    return v7

    :cond_c
    iget-object v5, v1, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    if-nez v5, :cond_17

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v5, v11, :cond_d

    move v5, v6

    goto :goto_3

    :cond_d
    move v5, v7

    :goto_3
    invoke-static {v5}, Lp5/a;->a(Z)V

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_e

    return v6

    :cond_e
    iget-object v5, v1, Lu3/a0;->u:Lu3/a0$g;

    iget v11, v5, Lu3/a0$g;->c:I

    if-eqz v11, :cond_f

    iget v11, v1, Lu3/a0;->G:I

    if-nez v11, :cond_f

    iget v5, v5, Lu3/a0$g;->g:I

    invoke-static {v5, v0}, Lu3/a0;->Q(ILjava/nio/ByteBuffer;)I

    move-result v5

    iput v5, v1, Lu3/a0;->G:I

    if-nez v5, :cond_f

    return v6

    :cond_f
    iget-object v5, v1, Lu3/a0;->x:Lu3/a0$j;

    if-eqz v5, :cond_11

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->L()Z

    move-result v5

    if-nez v5, :cond_10

    return v7

    :cond_10
    invoke-virtual {v1, v2, v3}, Lu3/a0;->G(J)V

    iput-object v8, v1, Lu3/a0;->x:Lu3/a0$j;

    :cond_11
    iget-wide v11, v1, Lu3/a0;->J:J

    iget-object v5, v1, Lu3/a0;->u:Lu3/a0$g;

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->U()J

    move-result-wide v13

    iget-object v15, v1, Lu3/a0;->e:Lu3/l0;

    invoke-virtual {v15}, Lu3/l0;->m()J

    move-result-wide v15

    sub-long/2addr v13, v15

    invoke-virtual {v5, v13, v14}, Lu3/a0$g;->k(J)J

    move-result-wide v13

    add-long/2addr v11, v13

    iget-boolean v5, v1, Lu3/a0;->H:Z

    if-nez v5, :cond_13

    sub-long v13, v11, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    move-result-wide v13

    const-wide/32 v15, 0x30d40

    cmp-long v5, v13, v15

    if-lez v5, :cond_13

    iget-object v5, v1, Lu3/a0;->s:Lu3/t$c;

    if-eqz v5, :cond_12

    new-instance v13, Lu3/t$d;

    invoke-direct {v13, v2, v3, v11, v12}, Lu3/t$d;-><init>(JJ)V

    invoke-interface {v5, v13}, Lu3/t$c;->a(Ljava/lang/Exception;)V

    :cond_12
    iput-boolean v6, v1, Lu3/a0;->H:Z

    :cond_13
    iget-boolean v5, v1, Lu3/a0;->H:Z

    if-eqz v5, :cond_15

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->L()Z

    move-result v5

    if-nez v5, :cond_14

    return v7

    :cond_14
    sub-long v11, v2, v11

    iget-wide v13, v1, Lu3/a0;->J:J

    add-long/2addr v13, v11

    iput-wide v13, v1, Lu3/a0;->J:J

    iput-boolean v7, v1, Lu3/a0;->H:Z

    invoke-virtual {v1, v2, v3}, Lu3/a0;->G(J)V

    iget-object v5, v1, Lu3/a0;->s:Lu3/t$c;

    if-eqz v5, :cond_15

    cmp-long v9, v11, v9

    if-eqz v9, :cond_15

    invoke-interface {v5}, Lu3/t$c;->e()V

    :cond_15
    iget-object v5, v1, Lu3/a0;->u:Lu3/a0$g;

    iget v5, v5, Lu3/a0$g;->c:I

    if-nez v5, :cond_16

    iget-wide v9, v1, Lu3/a0;->C:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    int-to-long v11, v5

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu3/a0;->C:J

    goto :goto_4

    :cond_16
    iget-wide v9, v1, Lu3/a0;->D:J

    iget v5, v1, Lu3/a0;->G:I

    int-to-long v11, v5

    int-to-long v13, v4

    mul-long/2addr v11, v13

    add-long/2addr v9, v11

    iput-wide v9, v1, Lu3/a0;->D:J

    :goto_4
    iput-object v0, v1, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    iput v4, v1, Lu3/a0;->O:I

    :cond_17
    invoke-virtual {v1, v2, v3}, Lu3/a0;->d0(J)V

    iget-object v0, v1, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_18

    iput-object v8, v1, Lu3/a0;->N:Ljava/nio/ByteBuffer;

    iput v7, v1, Lu3/a0;->O:I

    return v6

    :cond_18
    iget-object v0, v1, Lu3/a0;->i:Lu3/v;

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->V()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lu3/v;->j(J)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "DefaultAudioSink"

    const-string v2, "Resetting stalled audio track"

    invoke-static {v0, v2}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->flush()V

    return v6

    :cond_19
    return v7
.end method

.method public v(Ls3/m1;I[I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v3, Ls3/m1;->s:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, -0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_5

    iget v0, v3, Ls3/m1;->H:I

    invoke-static {v0}, Lp5/n0;->t0(I)Z

    move-result v0

    invoke-static {v0}, Lp5/a;->a(Z)V

    iget v0, v3, Ls3/m1;->H:I

    iget v6, v3, Ls3/m1;->F:I

    invoke-static {v0, v6}, Lp5/n0;->d0(II)I

    move-result v0

    iget v6, v3, Ls3/m1;->H:I

    invoke-virtual {v1, v6}, Lu3/a0;->o0(I)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, v1, Lu3/a0;->g:[Lu3/g;

    goto :goto_0

    :cond_0
    iget-object v6, v1, Lu3/a0;->f:[Lu3/g;

    :goto_0
    iget-object v7, v1, Lu3/a0;->e:Lu3/l0;

    iget v8, v3, Ls3/m1;->I:I

    iget v9, v3, Ls3/m1;->J:I

    invoke-virtual {v7, v8, v9}, Lu3/l0;->o(II)V

    sget v7, Lp5/n0;->a:I

    const/16 v8, 0x15

    if-ge v7, v8, :cond_1

    iget v7, v3, Ls3/m1;->F:I

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    if-nez p3, :cond_1

    const/4 v7, 0x6

    new-array v8, v7, [I

    move v9, v5

    :goto_1
    if-ge v9, v7, :cond_2

    aput v9, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p3

    :cond_2
    iget-object v7, v1, Lu3/a0;->d:Lu3/y;

    invoke-virtual {v7, v8}, Lu3/y;->m([I)V

    new-instance v7, Lu3/g$a;

    iget v8, v3, Ls3/m1;->G:I

    iget v9, v3, Ls3/m1;->F:I

    iget v10, v3, Ls3/m1;->H:I

    invoke-direct {v7, v8, v9, v10}, Lu3/g$a;-><init>(III)V

    array-length v8, v6

    move v9, v5

    :goto_2
    if-ge v9, v8, :cond_4

    aget-object v10, v6, v9

    :try_start_0
    invoke-interface {v10, v7}, Lu3/g;->d(Lu3/g$a;)Lu3/g$a;

    move-result-object v11

    invoke-interface {v10}, Lu3/g;->a()Z

    move-result v10
    :try_end_0
    .catch Lu3/g$b; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v10, :cond_3

    move-object v7, v11

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Lu3/t$a;

    invoke-direct {v2, v0, v3}, Lu3/t$a;-><init>(Ljava/lang/Throwable;Ls3/m1;)V

    throw v2

    :cond_4
    iget v8, v7, Lu3/g$a;->c:I

    iget v9, v7, Lu3/g$a;->a:I

    iget v10, v7, Lu3/g$a;->b:I

    invoke-static {v10}, Lp5/n0;->G(I)I

    move-result v10

    iget v7, v7, Lu3/g$a;->b:I

    invoke-static {v8, v7}, Lp5/n0;->d0(II)I

    move-result v7

    move v15, v5

    move-object/from16 v16, v6

    move v13, v7

    move v11, v8

    move v14, v9

    move v12, v10

    goto :goto_3

    :cond_5
    new-array v0, v5, [Lu3/g;

    iget v6, v3, Ls3/m1;->G:I

    iget-object v7, v1, Lu3/a0;->w:Lu3/e;

    invoke-virtual {v1, v3, v7}, Lu3/a0;->p0(Ls3/m1;Lu3/e;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v3, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v7}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v8, v3, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {v7, v8}, Lp5/v;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    iget v8, v3, Ls3/m1;->F:I

    invoke-static {v8}, Lp5/n0;->G(I)I

    move-result v8

    move-object/from16 v16, v0

    move v0, v2

    move v13, v0

    move v15, v4

    move v14, v6

    move v11, v7

    move v12, v8

    goto :goto_3

    :cond_6
    const/4 v7, 0x2

    iget-object v8, v1, Lu3/a0;->a:Lu3/f;

    invoke-virtual {v8, v3}, Lu3/f;->f(Ls3/m1;)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_d

    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object/from16 v16, v0

    move v0, v2

    move v13, v0

    move v14, v6

    move v15, v7

    move v12, v8

    move v11, v9

    :goto_3
    const-string v6, ") for: "

    if-eqz v11, :cond_c

    if-eqz v12, :cond_b

    if-eqz p2, :cond_7

    move/from16 v10, p2

    move/from16 v19, v11

    move/from16 v20, v12

    move/from16 v22, v13

    move/from16 v21, v14

    goto :goto_6

    :cond_7
    iget-object v6, v1, Lu3/a0;->p:Lu3/a0$e;

    invoke-static {v14, v12, v11}, Lu3/a0;->P(III)I

    move-result v7

    if-eq v13, v2, :cond_8

    move v10, v13

    goto :goto_4

    :cond_8
    move v10, v4

    :goto_4
    iget v2, v3, Ls3/m1;->o:I

    iget-boolean v4, v1, Lu3/a0;->k:Z

    if-eqz v4, :cond_9

    const-wide/high16 v8, 0x4020000000000000L    # 8.0

    goto :goto_5

    :cond_9
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    :goto_5
    move-wide/from16 v17, v8

    move v8, v11

    move v9, v15

    move/from16 v19, v11

    move v11, v14

    move/from16 v20, v12

    move v12, v2

    move/from16 v22, v13

    move/from16 v21, v14

    move-wide/from16 v13, v17

    invoke-interface/range {v6 .. v14}, Lu3/a0$e;->a(IIIIIID)I

    move-result v2

    move v10, v2

    :goto_6
    iput-boolean v5, v1, Lu3/a0;->c0:Z

    new-instance v12, Lu3/a0$g;

    move-object v2, v12

    move-object/from16 v3, p1

    move v4, v0

    move v5, v15

    move/from16 v6, v22

    move/from16 v7, v21

    move/from16 v8, v20

    move/from16 v9, v19

    move-object/from16 v11, v16

    invoke-direct/range {v2 .. v11}, Lu3/a0$g;-><init>(Ls3/m1;IIIIIII[Lu3/g;)V

    invoke-virtual/range {p0 .. p0}, Lu3/a0;->Y()Z

    move-result v0

    if-eqz v0, :cond_a

    iput-object v12, v1, Lu3/a0;->t:Lu3/a0$g;

    goto :goto_7

    :cond_a
    iput-object v12, v1, Lu3/a0;->u:Lu3/a0$g;

    :goto_7
    return-void

    :cond_b
    new-instance v0, Lu3/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output channel config (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu3/t$a;-><init>(Ljava/lang/String;Ls3/m1;)V

    throw v0

    :cond_c
    new-instance v0, Lu3/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid output encoding (mode="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu3/t$a;-><init>(Ljava/lang/String;Ls3/m1;)V

    throw v0

    :cond_d
    new-instance v0, Lu3/t$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to configure passthrough for: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Lu3/t$a;-><init>(Ljava/lang/String;Ls3/m1;)V

    throw v0
.end method

.method public w()V
    .locals 8

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x19

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lu3/a0;->flush()V

    return-void

    :cond_0
    iget-object v0, p0, Lu3/a0;->o:Lu3/a0$k;

    invoke-virtual {v0}, Lu3/a0$k;->a()V

    iget-object v0, p0, Lu3/a0;->n:Lu3/a0$k;

    invoke-virtual {v0}, Lu3/a0$k;->a()V

    invoke-virtual {p0}, Lu3/a0;->Y()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lu3/a0;->g0()V

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_2
    iget-object v0, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    iget-object v0, p0, Lu3/a0;->i:Lu3/v;

    invoke-virtual {v0}, Lu3/v;->q()V

    iget-object v1, p0, Lu3/a0;->i:Lu3/v;

    iget-object v2, p0, Lu3/a0;->v:Landroid/media/AudioTrack;

    iget-object v0, p0, Lu3/a0;->u:Lu3/a0$g;

    iget v3, v0, Lu3/a0$g;->c:I

    const/4 v4, 0x2

    const/4 v7, 0x1

    if-ne v3, v4, :cond_3

    move v3, v7

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget v4, v0, Lu3/a0$g;->g:I

    iget v5, v0, Lu3/a0$g;->d:I

    iget v6, v0, Lu3/a0$g;->h:I

    invoke-virtual/range {v1 .. v6}, Lu3/v;->s(Landroid/media/AudioTrack;ZIII)V

    iput-boolean v7, p0, Lu3/a0;->I:Z

    return-void
.end method

.method public x(Z)V
    .locals 1

    invoke-virtual {p0}, Lu3/a0;->O()Ls3/a3;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lu3/a0;->h0(Ls3/a3;Z)V

    return-void
.end method
