.class public final Ls3/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lu4/r$a;
.implements Ln5/b0$a;
.implements Ls3/s2$d;
.implements Ls3/l$a;
.implements Ls3/e3$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/i1$c;,
        Ls3/i1$b;,
        Ls3/i1$d;,
        Ls3/i1$g;,
        Ls3/i1$h;,
        Ls3/i1$f;,
        Ls3/i1$e;
    }
.end annotation


# instance fields
.field public final A:Ls3/s2;

.field public final B:Ls3/r1;

.field public final C:J

.field public D:Ls3/m3;

.field public E:Ls3/y2;

.field public F:Ls3/i1$e;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:I

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Ls3/i1$h;

.field public S:J

.field public T:I

.field public U:Z

.field public V:Ls3/q;

.field public W:J

.field public X:J

.field public final h:[Ls3/i3;

.field public final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ls3/i3;",
            ">;"
        }
    .end annotation
.end field

.field public final j:[Ls3/j3;

.field public final k:Ln5/b0;

.field public final l:Ln5/c0;

.field public final m:Ls3/s1;

.field public final n:Lo5/e;

.field public final o:Lp5/n;

.field public final p:Landroid/os/HandlerThread;

.field public final q:Landroid/os/Looper;

.field public final r:Ls3/u3$d;

.field public final s:Ls3/u3$b;

.field public final t:J

.field public final u:Z

.field public final v:Ls3/l;

.field public final w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ls3/i1$d;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Lp5/d;

.field public final y:Ls3/i1$f;

.field public final z:Ls3/d2;


# direct methods
.method public constructor <init>([Ls3/i3;Ln5/b0;Ln5/c0;Ls3/s1;Lo5/e;IZLt3/a;Ls3/m3;Ls3/r1;JZLandroid/os/Looper;Lp5/d;Ls3/i1$f;Lt3/s1;Landroid/os/Looper;)V
    .locals 13

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move-wide/from16 v5, p11

    move-object/from16 v7, p15

    move-object/from16 v8, p17

    move-object/from16 v9, p18

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v10, p16

    iput-object v10, v0, Ls3/i1;->y:Ls3/i1$f;

    iput-object v1, v0, Ls3/i1;->h:[Ls3/i3;

    iput-object v2, v0, Ls3/i1;->k:Ln5/b0;

    move-object/from16 v10, p3

    iput-object v10, v0, Ls3/i1;->l:Ln5/c0;

    move-object/from16 v11, p4

    iput-object v11, v0, Ls3/i1;->m:Ls3/s1;

    iput-object v3, v0, Ls3/i1;->n:Lo5/e;

    move/from16 v12, p6

    iput v12, v0, Ls3/i1;->L:I

    move/from16 v12, p7

    iput-boolean v12, v0, Ls3/i1;->M:Z

    move-object/from16 v12, p9

    iput-object v12, v0, Ls3/i1;->D:Ls3/m3;

    move-object/from16 v12, p10

    iput-object v12, v0, Ls3/i1;->B:Ls3/r1;

    iput-wide v5, v0, Ls3/i1;->C:J

    iput-wide v5, v0, Ls3/i1;->W:J

    move/from16 v5, p13

    iput-boolean v5, v0, Ls3/i1;->H:Z

    iput-object v7, v0, Ls3/i1;->x:Lp5/d;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v5, v0, Ls3/i1;->X:J

    invoke-interface/range {p4 .. p4}, Ls3/s1;->c()J

    move-result-wide v5

    iput-wide v5, v0, Ls3/i1;->t:J

    invoke-interface/range {p4 .. p4}, Ls3/s1;->b()Z

    move-result v5

    iput-boolean v5, v0, Ls3/i1;->u:Z

    invoke-static/range {p3 .. p3}, Ls3/y2;->j(Ln5/c0;)Ls3/y2;

    move-result-object v5

    iput-object v5, v0, Ls3/i1;->E:Ls3/y2;

    new-instance v6, Ls3/i1$e;

    invoke-direct {v6, v5}, Ls3/i1$e;-><init>(Ls3/y2;)V

    iput-object v6, v0, Ls3/i1;->F:Ls3/i1$e;

    array-length v5, v1

    new-array v5, v5, [Ls3/j3;

    iput-object v5, v0, Ls3/i1;->j:[Ls3/j3;

    const/4 v5, 0x0

    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_0

    aget-object v6, v1, v5

    invoke-interface {v6, v5, v8}, Ls3/i3;->m(ILt3/s1;)V

    iget-object v6, v0, Ls3/i1;->j:[Ls3/j3;

    aget-object v10, v1, v5

    invoke-interface {v10}, Ls3/i3;->q()Ls3/j3;

    move-result-object v10

    aput-object v10, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ls3/l;

    invoke-direct {v1, p0, v7}, Ls3/l;-><init>(Ls3/l$a;Lp5/d;)V

    iput-object v1, v0, Ls3/i1;->v:Ls3/l;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-static {}, Li7/y0;->h()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Ls3/i1;->i:Ljava/util/Set;

    new-instance v1, Ls3/u3$d;

    invoke-direct {v1}, Ls3/u3$d;-><init>()V

    iput-object v1, v0, Ls3/i1;->r:Ls3/u3$d;

    new-instance v1, Ls3/u3$b;

    invoke-direct {v1}, Ls3/u3$b;-><init>()V

    iput-object v1, v0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p2, p0, v3}, Ln5/b0;->b(Ln5/b0$a;Lo5/e;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ls3/i1;->U:Z

    const/4 v1, 0x0

    move-object/from16 v2, p14

    invoke-interface {v7, v2, v1}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object v2

    new-instance v3, Ls3/d2;

    invoke-direct {v3, v4, v2}, Ls3/d2;-><init>(Lt3/a;Lp5/n;)V

    iput-object v3, v0, Ls3/i1;->z:Ls3/d2;

    new-instance v3, Ls3/s2;

    invoke-direct {v3, p0, v4, v2, v8}, Ls3/s2;-><init>(Ls3/s2$d;Lt3/a;Lp5/n;Lt3/s1;)V

    iput-object v3, v0, Ls3/i1;->A:Ls3/s2;

    if-eqz v9, :cond_1

    iput-object v1, v0, Ls3/i1;->p:Landroid/os/HandlerThread;

    iput-object v9, v0, Ls3/i1;->q:Landroid/os/Looper;

    goto :goto_1

    :cond_1
    new-instance v1, Landroid/os/HandlerThread;

    const/16 v2, -0x10

    const-string v3, "ExoPlayer:Playback"

    invoke-direct {v1, v3, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Ls3/i1;->p:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Ls3/i1;->q:Landroid/os/Looper;

    :goto_1
    iget-object v1, v0, Ls3/i1;->q:Landroid/os/Looper;

    invoke-interface {v7, v1, p0}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object v1

    iput-object v1, v0, Ls3/i1;->o:Lp5/n;

    return-void
.end method

.method public static O(ZLu4/t$b;JLu4/t$b;Ls3/u3$b;J)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_3

    cmp-long p0, p2, p6

    if-nez p0, :cond_3

    iget-object p0, p1, Lu4/s;->a:Ljava/lang/Object;

    iget-object p2, p4, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lu4/s;->b()Z

    move-result p0

    const/4 p2, 0x1

    if-eqz p0, :cond_2

    iget p0, p1, Lu4/s;->b:I

    invoke-virtual {p5, p0}, Ls3/u3$b;->t(I)Z

    move-result p0

    if-eqz p0, :cond_2

    iget p0, p1, Lu4/s;->b:I

    iget p3, p1, Lu4/s;->c:I

    invoke-virtual {p5, p0, p3}, Ls3/u3$b;->k(II)I

    move-result p0

    const/4 p3, 0x4

    if-eq p0, p3, :cond_1

    iget p0, p1, Lu4/s;->b:I

    iget p1, p1, Lu4/s;->c:I

    invoke-virtual {p5, p0, p1}, Ls3/u3$b;->k(II)I

    move-result p0

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    move v0, p2

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p4}, Lu4/s;->b()Z

    move-result p0

    if-eqz p0, :cond_3

    iget p0, p4, Lu4/s;->b:I

    invoke-virtual {p5, p0}, Ls3/u3$b;->t(I)Z

    move-result p0

    if-eqz p0, :cond_3

    move v0, p2

    :cond_3
    :goto_0
    return v0
.end method

.method public static Q(Ls3/i3;)Z
    .locals 0

    invoke-interface {p0}, Ls3/i3;->getState()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static S(Ls3/y2;Ls3/u3$b;)Z
    .locals 2

    iget-object v0, p0, Ls3/y2;->b:Lu4/t$b;

    iget-object p0, p0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p0}, Ls3/u3;->u()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object p0

    iget-boolean p0, p0, Ls3/u3$b;->m:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private synthetic T()Ljava/lang/Boolean;
    .locals 1

    iget-boolean v0, p0, Ls3/i1;->G:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private synthetic U(Ls3/e3;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Ls3/i1;->n(Ls3/e3;)V
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Unexpected error delivering message on external thread."

    invoke-static {v0, v1, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic f(Ls3/i1;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Ls3/i1;->T()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ls3/i1;Ls3/e3;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/i1;->U(Ls3/e3;)V

    return-void
.end method

.method public static synthetic h(Ls3/i1;Z)Z
    .locals 0

    iput-boolean p1, p0, Ls3/i1;->O:Z

    return p1
.end method

.method public static synthetic i(Ls3/i1;)Lp5/n;
    .locals 0

    iget-object p0, p0, Ls3/i1;->o:Lp5/n;

    return-object p0
.end method

.method public static t0(Ls3/u3;Ls3/i1$d;Ls3/u3$d;Ls3/u3$b;)V
    .locals 4

    iget-object v0, p1, Ls3/i1$d;->k:Ljava/lang/Object;

    invoke-virtual {p0, v0, p3}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    invoke-virtual {p0, v0, p2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object p2

    iget p2, p2, Ls3/u3$d;->w:I

    const/4 v0, 0x1

    invoke-virtual {p0, p2, p3, v0}, Ls3/u3;->k(ILs3/u3$b;Z)Ls3/u3$b;

    move-result-object p0

    iget-object p0, p0, Ls3/u3$b;->i:Ljava/lang/Object;

    iget-wide v0, p3, Ls3/u3$b;->k:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Ls3/i1$d;->c(IJLjava/lang/Object;)V

    return-void
.end method

.method public static u0(Ls3/i1$d;Ls3/u3;Ls3/u3;IZLs3/u3$d;Ls3/u3$b;)Z
    .locals 15

    move-object v0, p0

    move-object/from16 v8, p1

    move-object/from16 v1, p2

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    iget-object v2, v0, Ls3/i1$d;->k:Ljava/lang/Object;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-wide/high16 v13, -0x8000000000000000L

    if-nez v2, :cond_3

    iget-object v1, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v1}, Ls3/e3;->f()J

    move-result-wide v1

    cmp-long v1, v1, v13

    if-nez v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v1}, Ls3/e3;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Lp5/n0;->B0(J)J

    move-result-wide v1

    :goto_0
    new-instance v3, Ls3/i1$h;

    iget-object v4, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v4}, Ls3/e3;->h()Ls3/u3;

    move-result-object v4

    iget-object v5, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v5}, Ls3/e3;->d()I

    move-result v5

    invoke-direct {v3, v4, v5, v1, v2}, Ls3/i1$h;-><init>(Ls3/u3;IJ)V

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move-object v2, v3

    move v3, v4

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-static/range {v1 .. v7}, Ls3/i1;->x0(Ls3/u3;Ls3/i1$h;ZIZLs3/u3$d;Ls3/u3$b;)Landroid/util/Pair;

    move-result-object v1

    if-nez v1, :cond_1

    return v11

    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v8, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2, v3, v4, v1}, Ls3/i1$d;->c(IJLjava/lang/Object;)V

    iget-object v1, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v1}, Ls3/e3;->f()J

    move-result-wide v1

    cmp-long v1, v1, v13

    if-nez v1, :cond_2

    invoke-static {v8, p0, v9, v10}, Ls3/i1;->t0(Ls3/u3;Ls3/i1$d;Ls3/u3$d;Ls3/u3$b;)V

    :cond_2
    return v12

    :cond_3
    invoke-virtual {v8, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    return v11

    :cond_4
    iget-object v3, v0, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v3}, Ls3/e3;->f()J

    move-result-wide v3

    cmp-long v3, v3, v13

    if-nez v3, :cond_5

    invoke-static {v8, p0, v9, v10}, Ls3/i1;->t0(Ls3/u3;Ls3/i1$d;Ls3/u3$d;Ls3/u3$b;)V

    return v12

    :cond_5
    iput v2, v0, Ls3/i1$d;->i:I

    iget-object v2, v0, Ls3/i1$d;->k:Ljava/lang/Object;

    invoke-virtual {v1, v2, v10}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-boolean v2, v10, Ls3/u3$b;->m:Z

    if-eqz v2, :cond_6

    iget v2, v10, Ls3/u3$b;->j:I

    invoke-virtual {v1, v2, v9}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v2

    iget v2, v2, Ls3/u3$d;->v:I

    iget-object v3, v0, Ls3/i1$d;->k:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v1

    if-ne v2, v1, :cond_6

    iget-wide v1, v0, Ls3/i1$d;->j:J

    invoke-virtual/range {p6 .. p6}, Ls3/u3$b;->q()J

    move-result-wide v3

    add-long v5, v1, v3

    iget-object v1, v0, Ls3/i1$d;->k:Ljava/lang/Object;

    invoke-virtual {v8, v1, v10}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v1

    iget v4, v1, Ls3/u3$b;->j:I

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual/range {v1 .. v6}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v8, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2, v3, v4, v1}, Ls3/i1$d;->c(IJLjava/lang/Object;)V

    :cond_6
    return v12
.end method

.method public static w0(Ls3/u3;Ls3/y2;Ls3/i1$h;Ls3/d2;IZLs3/u3$d;Ls3/u3$b;)Ls3/i1$g;
    .locals 30

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p5

    move-object/from16 v11, p7

    invoke-virtual/range {p0 .. p0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ls3/i1$g;

    invoke-static {}, Ls3/y2;->k()Lu4/t$b;

    move-result-object v2

    const-wide/16 v3, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Ls3/i1$g;-><init>(Lu4/t$b;JJZZZ)V

    return-object v0

    :cond_0
    iget-object v14, v8, Ls3/y2;->b:Lu4/t$b;

    iget-object v12, v14, Lu4/s;->a:Ljava/lang/Object;

    invoke-static {v8, v11}, Ls3/i1;->S(Ls3/y2;Ls3/u3$b;)Z

    move-result v13

    iget-object v0, v8, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v13, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v0, v8, Ls3/y2;->r:J

    goto :goto_1

    :cond_2
    :goto_0
    iget-wide v0, v8, Ls3/y2;->c:J

    :goto_1
    move-wide v15, v0

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    if-eqz v9, :cond_6

    const/4 v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v21, v14

    move v14, v6

    move-object/from16 v6, p7

    invoke-static/range {v0 .. v6}, Ls3/i1;->x0(Ls3/u3;Ls3/i1$h;ZIZLs3/u3$d;Ls3/u3$b;)Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {v7, v10}, Ls3/u3;->e(Z)I

    move-result v0

    move v6, v0

    move-wide v0, v15

    move/from16 v2, v19

    move v3, v2

    move/from16 v4, v20

    goto :goto_4

    :cond_3
    iget-wide v1, v9, Ls3/i1$h;->c:J

    cmp-long v1, v1, v17

    if-nez v1, :cond_4

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v7, v0, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v6, v0, Ls3/u3$b;->j:I

    move-wide v0, v15

    move/from16 v2, v19

    goto :goto_2

    :cond_4
    iget-object v12, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    move v6, v14

    move/from16 v2, v20

    :goto_2
    iget v3, v8, Ls3/y2;->e:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_5

    move/from16 v3, v20

    goto :goto_3

    :cond_5
    move/from16 v3, v19

    :goto_3
    move/from16 v4, v19

    :goto_4
    move-object/from16 v9, p6

    move/from16 v29, v2

    move/from16 v27, v3

    move/from16 v28, v4

    move v3, v6

    goto :goto_6

    :cond_6
    move-object/from16 v21, v14

    move v14, v6

    iget-object v0, v8, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v7, v10}, Ls3/u3;->e(Z)I

    move-result v0

    :goto_5
    move-object/from16 v9, p6

    move v3, v0

    move-wide v0, v15

    move/from16 v27, v19

    move/from16 v28, v27

    move/from16 v29, v28

    :goto_6
    move-object/from16 v6, v21

    goto/16 :goto_9

    :cond_7
    invoke-virtual {v7, v12}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v14, :cond_9

    iget-object v5, v8, Ls3/y2;->a:Ls3/u3;

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move/from16 v2, p4

    move/from16 v3, p5

    move-object v4, v12

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v6}, Ls3/i1;->y0(Ls3/u3$d;Ls3/u3$b;IZLjava/lang/Object;Ls3/u3;Ls3/u3;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {v7, v10}, Ls3/u3;->e(Z)I

    move-result v0

    move/from16 v4, v20

    goto :goto_7

    :cond_8
    invoke-virtual {v7, v0, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    move/from16 v4, v19

    :goto_7
    move-object/from16 v9, p6

    move v3, v0

    move/from16 v28, v4

    move-wide v0, v15

    move/from16 v27, v19

    move/from16 v29, v27

    goto :goto_6

    :cond_9
    cmp-long v0, v15, v17

    if-nez v0, :cond_a

    invoke-virtual {v7, v12, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    goto :goto_5

    :cond_a
    if-eqz v13, :cond_c

    iget-object v0, v8, Ls3/y2;->a:Ls3/u3;

    move-object/from16 v6, v21

    iget-object v1, v6, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v0, v8, Ls3/y2;->a:Ls3/u3;

    iget v1, v11, Ls3/u3$b;->j:I

    move-object/from16 v9, p6

    invoke-virtual {v0, v1, v9}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    iget v0, v0, Ls3/u3$d;->v:I

    iget-object v1, v8, Ls3/y2;->a:Ls3/u3;

    iget-object v2, v6, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_b

    invoke-virtual/range {p7 .. p7}, Ls3/u3$b;->q()J

    move-result-wide v0

    add-long v4, v15, v0

    invoke-virtual {v7, v12, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v3, v0, Ls3/u3$b;->j:I

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    invoke-virtual/range {v0 .. v5}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object v12, v1

    move-wide v0, v2

    goto :goto_8

    :cond_b
    move-wide v0, v15

    :goto_8
    move v3, v14

    move/from16 v27, v19

    move/from16 v28, v27

    move/from16 v29, v20

    goto :goto_9

    :cond_c
    move-object/from16 v9, p6

    move-object/from16 v6, v21

    move v3, v14

    move-wide v0, v15

    move/from16 v27, v19

    move/from16 v28, v27

    move/from16 v29, v28

    :goto_9
    if-eq v3, v14, :cond_d

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    invoke-virtual/range {v0 .. v5}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v12, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    move-object/from16 v2, p3

    move-wide/from16 v25, v17

    goto :goto_a

    :cond_d
    move-object/from16 v2, p3

    move-wide/from16 v25, v0

    :goto_a
    invoke-virtual {v2, v7, v12, v0, v1}, Ls3/d2;->B(Ls3/u3;Ljava/lang/Object;J)Lu4/t$b;

    move-result-object v2

    iget v3, v2, Lu4/s;->e:I

    if-eq v3, v14, :cond_f

    iget v4, v6, Lu4/s;->e:I

    if-eq v4, v14, :cond_e

    if-lt v3, v4, :cond_e

    goto :goto_b

    :cond_e
    move/from16 v3, v19

    goto :goto_c

    :cond_f
    :goto_b
    move/from16 v3, v20

    :goto_c
    iget-object v4, v6, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v6}, Lu4/s;->b()Z

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual {v2}, Lu4/s;->b()Z

    move-result v4

    if-nez v4, :cond_10

    if-eqz v3, :cond_10

    goto :goto_d

    :cond_10
    move/from16 v20, v19

    :goto_d
    invoke-virtual {v7, v12, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v17

    move v12, v13

    move-object v13, v6

    move-object v3, v6

    move-wide v14, v15

    move-object/from16 v16, v2

    move-wide/from16 v18, v25

    invoke-static/range {v12 .. v19}, Ls3/i1;->O(ZLu4/t$b;JLu4/t$b;Ls3/u3$b;J)Z

    move-result v4

    if-nez v20, :cond_11

    if-eqz v4, :cond_12

    :cond_11
    move-object v2, v3

    :cond_12
    invoke-virtual {v2}, Lu4/s;->b()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v2, v3}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-wide v0, v8, Ls3/y2;->r:J

    goto :goto_e

    :cond_13
    iget-object v0, v2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v7, v0, v11}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget v0, v2, Lu4/s;->c:I

    iget v1, v2, Lu4/s;->b:I

    invoke-virtual {v11, v1}, Ls3/u3$b;->n(I)I

    move-result v1

    if-ne v0, v1, :cond_14

    invoke-virtual/range {p7 .. p7}, Ls3/u3$b;->j()J

    move-result-wide v0

    goto :goto_e

    :cond_14
    const-wide/16 v0, 0x0

    :cond_15
    :goto_e
    move-wide/from16 v23, v0

    new-instance v0, Ls3/i1$g;

    move-object/from16 v21, v0

    move-object/from16 v22, v2

    invoke-direct/range {v21 .. v29}, Ls3/i1$g;-><init>(Lu4/t$b;JJZZZ)V

    return-object v0
.end method

.method public static x(Ln5/s;)[Ls3/m1;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ln5/v;->length()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    new-array v2, v1, [Ls3/m1;

    :goto_1
    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Ln5/v;->c(I)Ls3/m1;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method public static x0(Ls3/u3;Ls3/i1$h;ZIZLs3/u3$d;Ls3/u3$b;)Landroid/util/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u3;",
            "Ls3/i1$h;",
            "ZIZ",
            "Ls3/u3$d;",
            "Ls3/u3$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v8, p6

    iget-object v1, v0, Ls3/i1$h;->a:Ls3/u3;

    invoke-virtual {p0}, Ls3/u3;->u()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    return-object v9

    :cond_0
    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v10, v7

    goto :goto_0

    :cond_1
    move-object v10, v1

    :goto_0
    :try_start_0
    iget v4, v0, Ls3/i1$h;->b:I

    iget-wide v5, v0, Ls3/i1$h;->c:J

    move-object v1, v10

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual/range {v1 .. v6}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, v10}, Ls3/u3;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v2, v8}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v2

    iget-boolean v2, v2, Ls3/u3$b;->m:Z

    if-eqz v2, :cond_3

    iget v2, v8, Ls3/u3$b;->j:I

    move-object/from16 v11, p5

    invoke-virtual {v10, v2, v11}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v2

    iget v2, v2, Ls3/u3$d;->v:I

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v10, v3}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v3

    if-ne v2, v3, :cond_3

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p0, v1, v8}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v1

    iget v3, v1, Ls3/u3$b;->j:I

    iget-wide v4, v0, Ls3/i1$h;->c:J

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v1

    :cond_3
    return-object v1

    :cond_4
    move-object/from16 v11, p5

    if-eqz p2, :cond_5

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move v2, p3

    move/from16 v3, p4

    move-object v5, v10

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Ls3/i1;->y0(Ls3/u3$d;Ls3/u3$b;IZLjava/lang/Object;Ls3/u3;Ls3/u3;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, v8}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v3, v0, Ls3/u3$b;->j:I

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    invoke-virtual/range {v0 .. v5}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :catch_0
    :cond_5
    return-object v9
.end method

.method public static y0(Ls3/u3$d;Ls3/u3$b;IZLjava/lang/Object;Ls3/u3;Ls3/u3;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p5, p4}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result p4

    invoke-virtual {p5}, Ls3/u3;->m()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move v4, p4

    move p4, v1

    :goto_0
    if-ge v2, v0, :cond_1

    if-ne p4, v1, :cond_1

    move-object v3, p5

    move-object v5, p1

    move-object v6, p0

    move v7, p2

    move v8, p3

    invoke-virtual/range {v3 .. v8}, Ls3/u3;->h(ILs3/u3$b;Ls3/u3$d;IZ)I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p5, v4}, Ls3/u3;->q(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p6, p4}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result p4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    const/4 p0, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p6, p4}, Ls3/u3;->q(I)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    return-object p0
.end method


# virtual methods
.method public final A(Ls3/u3;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u3;",
            ")",
            "Landroid/util/Pair<",
            "Lu4/t$b;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Ls3/y2;->k()Lu4/t$b;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    iget-boolean v0, p0, Ls3/i1;->M:Z

    invoke-virtual {p1, v0}, Ls3/u3;->e(Z)I

    move-result v6

    iget-object v4, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-object v5, p0, Ls3/i1;->s:Ls3/u3$b;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    iget-object v3, p0, Ls3/i1;->z:Ls3/d2;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, p1, v4, v1, v2}, Ls3/d2;->B(Ls3/u3;Ljava/lang/Object;J)Lu4/t$b;

    move-result-object v3

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3}, Lu4/s;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v3, Lu4/s;->a:Ljava/lang/Object;

    iget-object v4, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p1, v0, v4}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget p1, v3, Lu4/s;->c:I

    iget-object v0, p0, Ls3/i1;->s:Ls3/u3$b;

    iget v4, v3, Lu4/s;->b:I

    invoke-virtual {v0, v4}, Ls3/u3$b;->n(I)I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p1}, Ls3/u3$b;->j()J

    move-result-wide v1

    :cond_1
    move-wide v4, v1

    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public A0(Ls3/u3;IJ)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    new-instance v1, Ls3/i1$h;

    invoke-direct {v1, p1, p2, p3, p4}, Ls3/i1$h;-><init>(Ls3/u3;IJ)V

    const/4 p1, 0x3

    invoke-interface {v0, p1, v1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public B()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Ls3/i1;->q:Landroid/os/Looper;

    return-object v0
.end method

.method public final B0(Z)V
    .locals 11

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    iget-object v0, v0, Ls3/a2;->f:Ls3/b2;

    iget-object v0, v0, Ls3/b2;->a:Lu4/t$b;

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v3, v1, Ls3/y2;->r:J

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Ls3/i1;->E0(Lu4/t$b;JZZ)J

    move-result-wide v3

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v1, v1, Ls3/y2;->r:J

    cmp-long v1, v3, v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v5, v1, Ls3/y2;->c:J

    iget-wide v7, v1, Ls3/y2;->d:J

    const/4 v10, 0x5

    move-object v1, p0

    move-object v2, v0

    move v9, p1

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object p1

    iput-object p1, p0, Ls3/i1;->E:Ls3/y2;

    :cond_0
    return-void
.end method

.method public final C()J
    .locals 2

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v0, v0, Ls3/y2;->p:J

    invoke-virtual {p0, v0, v1}, Ls3/i1;->D(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final C0(Ls3/i1$h;)V
    .locals 18

    move-object/from16 v11, p0

    move-object/from16 v0, p1

    iget-object v1, v11, Ls3/i1;->F:Ls3/i1$e;

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Ls3/i1$e;->b(I)V

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    iget v4, v11, Ls3/i1;->L:I

    iget-boolean v5, v11, Ls3/i1;->M:Z

    iget-object v6, v11, Ls3/i1;->r:Ls3/u3$d;

    iget-object v7, v11, Ls3/i1;->s:Ls3/u3$b;

    const/4 v3, 0x1

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v7}, Ls3/i1;->x0(Ls3/u3;Ls3/i1$h;ZIZLs3/u3$d;Ls3/u3$b;)Landroid/util/Pair;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    if-nez v1, :cond_0

    iget-object v7, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v7, v7, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v11, v7}, Ls3/i1;->A(Ls3/u3;)Landroid/util/Pair;

    move-result-object v7

    iget-object v9, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lu4/t$b;

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v7, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v7, v7, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v7}, Ls3/u3;->u()Z

    move-result v7

    xor-int/2addr v7, v8

    move v10, v7

    move-wide/from16 v16, v4

    :goto_0
    move-wide v4, v12

    move-wide/from16 v12, v16

    goto/16 :goto_4

    :cond_0
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v9, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-wide v9, v0, Ls3/i1$h;->c:J

    cmp-long v9, v9, v4

    if-nez v9, :cond_1

    move-wide v9, v4

    goto :goto_1

    :cond_1
    move-wide v9, v12

    :goto_1
    iget-object v14, v11, Ls3/i1;->z:Ls3/d2;

    iget-object v15, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v15, v15, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v14, v15, v7, v12, v13}, Ls3/d2;->B(Ls3/u3;Ljava/lang/Object;J)Lu4/t$b;

    move-result-object v7

    invoke-virtual {v7}, Lu4/s;->b()Z

    move-result v14

    if-eqz v14, :cond_3

    iget-object v4, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v4, Ls3/y2;->a:Ls3/u3;

    iget-object v5, v7, Lu4/s;->a:Ljava/lang/Object;

    iget-object v12, v11, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {v4, v5, v12}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v4, v11, Ls3/i1;->s:Ls3/u3$b;

    iget v5, v7, Lu4/s;->b:I

    invoke-virtual {v4, v5}, Ls3/u3$b;->n(I)I

    move-result v4

    iget v5, v7, Lu4/s;->c:I

    if-ne v4, v5, :cond_2

    iget-object v4, v11, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {v4}, Ls3/u3$b;->j()J

    move-result-wide v4

    move-wide v12, v4

    goto :goto_2

    :cond_2
    move-wide v12, v2

    :goto_2
    move-wide v4, v12

    move-wide v12, v9

    move-object v9, v7

    move v10, v8

    goto :goto_4

    :cond_3
    iget-wide v14, v0, Ls3/i1$h;->c:J

    cmp-long v4, v14, v4

    if-nez v4, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    move-wide/from16 v16, v9

    move v10, v4

    move-object v9, v7

    goto :goto_0

    :goto_4
    :try_start_0
    iget-object v7, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v7, v7, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v7}, Ls3/u3;->u()Z

    move-result v7

    if-eqz v7, :cond_5

    iput-object v0, v11, Ls3/i1;->R:Ls3/i1$h;

    goto :goto_5

    :cond_5
    const/4 v0, 0x4

    if-nez v1, :cond_7

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget v1, v1, Ls3/y2;->e:I

    if-eq v1, v8, :cond_6

    invoke-virtual {v11, v0}, Ls3/i1;->Z0(I)V

    :cond_6
    invoke-virtual {v11, v6, v8, v6, v8}, Ls3/i1;->q0(ZZZZ)V

    :goto_5
    move-wide v7, v4

    goto/16 :goto_9

    :cond_7
    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v9, v1}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v11, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-boolean v7, v1, Ls3/a2;->d:Z

    if-eqz v7, :cond_8

    cmp-long v2, v4, v2

    if-eqz v2, :cond_8

    iget-object v1, v1, Ls3/a2;->a:Lu4/r;

    iget-object v2, v11, Ls3/i1;->D:Ls3/m3;

    invoke-interface {v1, v4, v5, v2}, Lu4/r;->d(JLs3/m3;)J

    move-result-wide v1

    goto :goto_6

    :cond_8
    move-wide v1, v4

    :goto_6
    invoke-static {v1, v2}, Lp5/n0;->Y0(J)J

    move-result-wide v14

    iget-object v3, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v6, v3, Ls3/y2;->r:J

    invoke-static {v6, v7}, Lp5/n0;->Y0(J)J

    move-result-wide v6

    cmp-long v3, v14, v6

    if-nez v3, :cond_b

    iget-object v3, v11, Ls3/i1;->E:Ls3/y2;

    iget v6, v3, Ls3/y2;->e:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_9

    const/4 v7, 0x3

    if-ne v6, v7, :cond_b

    :cond_9
    iget-wide v7, v3, Ls3/y2;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v0

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v0

    iput-object v0, v11, Ls3/i1;->E:Ls3/y2;

    return-void

    :cond_a
    move-wide v1, v4

    :cond_b
    :try_start_1
    iget-object v3, v11, Ls3/i1;->E:Ls3/y2;

    iget v3, v3, Ls3/y2;->e:I

    if-ne v3, v0, :cond_c

    move v0, v8

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    invoke-virtual {v11, v9, v1, v2, v0}, Ls3/i1;->D0(Lu4/t$b;JZ)J

    move-result-wide v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    cmp-long v0, v4, v14

    if-eqz v0, :cond_d

    goto :goto_8

    :cond_d
    const/4 v8, 0x0

    :goto_8
    or-int/2addr v10, v8

    :try_start_2
    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v5, v0, Ls3/y2;->b:Lu4/t$b;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v9

    move-wide v6, v12

    invoke-virtual/range {v1 .. v8}, Ls3/i1;->n1(Ls3/u3;Lu4/t$b;Ls3/u3;Lu4/t$b;JZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-wide v7, v14

    :goto_9
    const/4 v0, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v0

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v0

    iput-object v0, v11, Ls3/i1;->E:Ls3/y2;

    return-void

    :catchall_0
    move-exception v0

    move-wide v7, v14

    goto :goto_a

    :catchall_1
    move-exception v0

    move-wide v7, v4

    :goto_a
    const/4 v14, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v14

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v1

    iput-object v1, v11, Ls3/i1;->E:Ls3/y2;

    throw v0
.end method

.method public final D(J)J
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-wide v3, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v3, v4}, Ls3/a2;->y(J)J

    move-result-wide v3

    sub-long/2addr p1, v3

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final D0(Lu4/t$b;JZ)J
    .locals 7

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    iget-object v1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->q()Ls3/a2;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v5, v0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Ls3/i1;->E0(Lu4/t$b;JZZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final E(Lu4/r;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0, p1}, Ls3/d2;->v(Lu4/r;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    iget-wide v0, p0, Ls3/i1;->S:J

    invoke-virtual {p1, v0, v1}, Ls3/d2;->y(J)V

    invoke-virtual {p0}, Ls3/i1;->V()V

    return-void
.end method

.method public final E0(Lu4/t$b;JZZ)J
    .locals 5

    invoke-virtual {p0}, Ls3/i1;->i1()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/i1;->J:Z

    const/4 v1, 0x2

    if-nez p5, :cond_0

    iget-object p5, p0, Ls3/i1;->E:Ls3/y2;

    iget p5, p5, Ls3/y2;->e:I

    const/4 v2, 0x3

    if-ne p5, v2, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, Ls3/i1;->Z0(I)V

    :cond_1
    iget-object p5, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p5}, Ls3/d2;->p()Ls3/a2;

    move-result-object p5

    move-object v2, p5

    :goto_0
    if-eqz v2, :cond_3

    iget-object v3, v2, Ls3/a2;->f:Ls3/b2;

    iget-object v3, v3, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {p1, v3}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ls3/a2;->j()Ls3/a2;

    move-result-object v2

    goto :goto_0

    :cond_3
    :goto_1
    if-nez p4, :cond_4

    if-ne p5, v2, :cond_4

    if-eqz v2, :cond_7

    invoke-virtual {v2, p2, p3}, Ls3/a2;->z(J)J

    move-result-wide p4

    const-wide/16 v3, 0x0

    cmp-long p1, p4, v3

    if-gez p1, :cond_7

    :cond_4
    iget-object p1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length p4, p1

    move p5, v0

    :goto_2
    if-ge p5, p4, :cond_5

    aget-object v3, p1, p5

    invoke-virtual {p0, v3}, Ls3/i1;->o(Ls3/i3;)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    :goto_3
    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1}, Ls3/d2;->p()Ls3/a2;

    move-result-object p1

    if-eq p1, v2, :cond_6

    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1}, Ls3/d2;->b()Ls3/a2;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1, v2}, Ls3/d2;->z(Ls3/a2;)Z

    const-wide p4, 0xe8d4a51000L

    invoke-virtual {v2, p4, p5}, Ls3/a2;->x(J)V

    invoke-virtual {p0}, Ls3/i1;->r()V

    :cond_7
    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    if-eqz v2, :cond_a

    invoke-virtual {p1, v2}, Ls3/d2;->z(Ls3/a2;)Z

    iget-boolean p1, v2, Ls3/a2;->d:Z

    if-nez p1, :cond_8

    iget-object p1, v2, Ls3/a2;->f:Ls3/b2;

    invoke-virtual {p1, p2, p3}, Ls3/b2;->b(J)Ls3/b2;

    move-result-object p1

    iput-object p1, v2, Ls3/a2;->f:Ls3/b2;

    goto :goto_4

    :cond_8
    iget-boolean p1, v2, Ls3/a2;->e:Z

    if-eqz p1, :cond_9

    iget-object p1, v2, Ls3/a2;->a:Lu4/r;

    invoke-interface {p1, p2, p3}, Lu4/r;->m(J)J

    move-result-wide p1

    iget-object p3, v2, Ls3/a2;->a:Lu4/r;

    iget-wide p4, p0, Ls3/i1;->t:J

    sub-long p4, p1, p4

    iget-boolean v2, p0, Ls3/i1;->u:Z

    invoke-interface {p3, p4, p5, v2}, Lu4/r;->t(JZ)V

    move-wide p2, p1

    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Ls3/i1;->s0(J)V

    invoke-virtual {p0}, Ls3/i1;->V()V

    goto :goto_5

    :cond_a
    invoke-virtual {p1}, Ls3/d2;->f()V

    invoke-virtual {p0, p2, p3}, Ls3/i1;->s0(J)V

    :goto_5
    invoke-virtual {p0, v0}, Ls3/i1;->G(Z)V

    iget-object p1, p0, Ls3/i1;->o:Lp5/n;

    invoke-interface {p1, v1}, Lp5/n;->f(I)Z

    return-wide p2
.end method

.method public final F(Ljava/io/IOException;I)V
    .locals 1

    invoke-static {p1, p2}, Ls3/q;->g(Ljava/io/IOException;I)Ls3/q;

    move-result-object p1

    iget-object p2, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p2}, Ls3/d2;->p()Ls3/a2;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p2, Ls3/a2;->f:Ls3/b2;

    iget-object p2, p2, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {p1, p2}, Ls3/q;->e(Lu4/s;)Ls3/q;

    move-result-object p1

    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    const-string v0, "Playback error"

    invoke-static {p2, v0, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p2}, Ls3/i1;->h1(ZZ)V

    iget-object p2, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p2, p1}, Ls3/y2;->e(Ls3/q;)Ls3/y2;

    move-result-object p1

    iput-object p1, p0, Ls3/i1;->E:Ls3/y2;

    return-void
.end method

.method public final F0(Ls3/e3;)V
    .locals 9

    invoke-virtual {p1}, Ls3/e3;->f()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ls3/i1;->G0(Ls3/e3;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    new-instance v1, Ls3/i1$d;

    invoke-direct {v1, p1}, Ls3/i1$d;-><init>(Ls3/e3;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ls3/i1$d;

    invoke-direct {v0, p1}, Ls3/i1$d;-><init>(Ls3/e3;)V

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v1, Ls3/y2;->a:Ls3/u3;

    iget v5, p0, Ls3/i1;->L:I

    iget-boolean v6, p0, Ls3/i1;->M:Z

    iget-object v7, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-object v8, p0, Ls3/i1;->s:Ls3/u3$b;

    move-object v2, v0

    move-object v3, v4

    invoke-static/range {v2 .. v8}, Ls3/i1;->u0(Ls3/i1$d;Ls3/u3;Ls3/u3;IZLs3/u3$d;Ls3/u3$b;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls3/e3;->k(Z)V

    :goto_0
    return-void
.end method

.method public final G(Z)V
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->b:Lu4/t$b;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ls3/a2;->f:Ls3/b2;

    iget-object v1, v1, Ls3/b2;->a:Lu4/t$b;

    :goto_0
    iget-object v2, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->k:Lu4/t$b;

    invoke-virtual {v2, v1}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object v3, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v3, v1}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object v1

    iput-object v1, p0, Ls3/i1;->E:Ls3/y2;

    :cond_1
    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    if-nez v0, :cond_2

    iget-wide v3, v1, Ls3/y2;->r:J

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ls3/a2;->i()J

    move-result-wide v3

    :goto_1
    iput-wide v3, v1, Ls3/y2;->p:J

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p0}, Ls3/i1;->C()J

    move-result-wide v3

    iput-wide v3, v1, Ls3/y2;->q:J

    if-nez v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    if-eqz v0, :cond_4

    iget-boolean p1, v0, Ls3/a2;->d:Z

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ls3/a2;->n()Lu4/u0;

    move-result-object p1

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ls3/i1;->k1(Lu4/u0;Ln5/c0;)V

    :cond_4
    return-void
.end method

.method public final G0(Ls3/e3;)V
    .locals 2

    invoke-virtual {p1}, Ls3/e3;->c()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ls3/i1;->q:Landroid/os/Looper;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Ls3/i1;->n(Ls3/e3;)V

    iget-object p1, p0, Ls3/i1;->E:Ls3/y2;

    iget p1, p1, Ls3/y2;->e:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v0, :cond_0

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Ls3/i1;->o:Lp5/n;

    invoke-interface {p1, v1}, Lp5/n;->f(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0xf

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final H(Ls3/u3;Z)V
    .locals 27

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    iget-object v2, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v3, v11, Ls3/i1;->R:Ls3/i1$h;

    iget-object v4, v11, Ls3/i1;->z:Ls3/d2;

    iget v5, v11, Ls3/i1;->L:I

    iget-boolean v6, v11, Ls3/i1;->M:Z

    iget-object v7, v11, Ls3/i1;->r:Ls3/u3$d;

    iget-object v8, v11, Ls3/i1;->s:Ls3/u3$b;

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v8}, Ls3/i1;->w0(Ls3/u3;Ls3/y2;Ls3/i1$h;Ls3/d2;IZLs3/u3$d;Ls3/u3$b;)Ls3/i1$g;

    move-result-object v7

    iget-object v9, v7, Ls3/i1$g;->a:Lu4/t$b;

    iget-wide v13, v7, Ls3/i1$g;->c:J

    iget-boolean v0, v7, Ls3/i1$g;->d:Z

    iget-wide v5, v7, Ls3/i1$g;->b:J

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v1, v9}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v10, 0x1

    const/4 v15, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v1, v1, Ls3/y2;->r:J

    cmp-long v1, v5, v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v16, v15

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v16, v10

    :goto_1
    const/16 v17, 0x3

    const/4 v8, 0x0

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x4

    :try_start_0
    iget-boolean v1, v7, Ls3/i1$g;->e:Z

    if-eqz v1, :cond_3

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget v1, v1, Ls3/y2;->e:I

    if-eq v1, v10, :cond_2

    invoke-virtual {v11, v4}, Ls3/i1;->Z0(I)V

    :cond_2
    invoke-virtual {v11, v15, v15, v15, v10}, Ls3/i1;->q0(ZZZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :cond_3
    if-nez v16, :cond_4

    :try_start_1
    iget-object v1, v11, Ls3/i1;->z:Ls3/d2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-wide v3, v11, Ls3/i1;->S:J

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->z()J

    move-result-wide v22
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v2, p1

    const/4 v10, -0x1

    const/16 v20, 0x4

    move-wide/from16 v25, v5

    move-wide/from16 v5, v22

    :try_start_3
    invoke-virtual/range {v1 .. v6}, Ls3/d2;->F(Ls3/u3;JJ)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v11, v15}, Ls3/i1;->B0(Z)V

    goto :goto_4

    :catchall_0
    move-exception v0

    const/4 v10, -0x1

    const/16 v20, 0x4

    goto :goto_2

    :catchall_1
    move-exception v0

    move/from16 v20, v4

    const/4 v10, -0x1

    :goto_2
    move-object v15, v8

    goto/16 :goto_9

    :cond_4
    move/from16 v20, v4

    move-wide/from16 v25, v5

    const/4 v10, -0x1

    invoke-virtual/range {p1 .. p1}, Ls3/u3;->u()Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez v1, :cond_7

    :try_start_4
    iget-object v1, v11, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_3
    if-eqz v1, :cond_6

    :try_start_5
    iget-object v2, v1, Ls3/a2;->f:Ls3/b2;

    iget-object v2, v2, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {v2, v9}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v11, Ls3/i1;->z:Ls3/d2;

    iget-object v3, v1, Ls3/a2;->f:Ls3/b2;

    invoke-virtual {v2, v12, v3}, Ls3/d2;->r(Ls3/u3;Ls3/b2;)Ls3/b2;

    move-result-object v2

    iput-object v2, v1, Ls3/a2;->f:Ls3/b2;

    invoke-virtual {v1}, Ls3/a2;->A()V

    :cond_5
    invoke-virtual {v1}, Ls3/a2;->j()Ls3/a2;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_3

    :cond_6
    move-wide/from16 v5, v25

    :try_start_6
    invoke-virtual {v11, v9, v5, v6, v0}, Ls3/i1;->D0(Lu4/t$b;JZ)J

    move-result-wide v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-wide/from16 v21, v0

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_2

    :catchall_3
    move-exception v0

    move-wide/from16 v5, v25

    goto :goto_2

    :cond_7
    :goto_4
    move-wide/from16 v5, v25

    move-wide/from16 v21, v5

    :goto_5
    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v5, v0, Ls3/y2;->b:Lu4/t$b;

    iget-boolean v0, v7, Ls3/i1$g;->f:Z

    if-eqz v0, :cond_8

    move-wide/from16 v6, v21

    goto :goto_6

    :cond_8
    move-wide/from16 v6, v18

    :goto_6
    const/4 v0, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-object v15, v8

    move v8, v0

    invoke-virtual/range {v1 .. v8}, Ls3/i1;->n1(Ls3/u3;Lu4/t$b;Ls3/u3;Lu4/t$b;JZ)V

    if-nez v16, :cond_9

    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v0, v0, Ls3/y2;->c:J

    cmp-long v0, v13, v0

    if-eqz v0, :cond_c

    :cond_9
    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v1, v1, Lu4/s;->a:Ljava/lang/Object;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    if-eqz v16, :cond_a

    if-eqz p2, :cond_a

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, v11, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget-boolean v0, v0, Ls3/u3$b;->m:Z

    if-nez v0, :cond_a

    const/16 v24, 0x1

    goto :goto_7

    :cond_a
    const/16 v24, 0x0

    :goto_7
    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v0, Ls3/y2;->d:J

    invoke-virtual {v12, v1}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v10, :cond_b

    move/from16 v10, v20

    goto :goto_8

    :cond_b
    move/from16 v10, v17

    :goto_8
    move-object/from16 v1, p0

    move-object v2, v9

    move-wide/from16 v3, v21

    move-wide v5, v13

    move/from16 v9, v24

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v0

    iput-object v0, v11, Ls3/i1;->E:Ls3/y2;

    :cond_c
    invoke-virtual/range {p0 .. p0}, Ls3/i1;->r0()V

    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v11, v12, v0}, Ls3/i1;->v0(Ls3/u3;Ls3/u3;)V

    iget-object v0, v11, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v0, v12}, Ls3/y2;->i(Ls3/u3;)Ls3/y2;

    move-result-object v0

    iput-object v0, v11, Ls3/i1;->E:Ls3/y2;

    invoke-virtual/range {p1 .. p1}, Ls3/u3;->u()Z

    move-result v0

    if-nez v0, :cond_d

    iput-object v15, v11, Ls3/i1;->R:Ls3/i1$h;

    :cond_d
    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Ls3/i1;->G(Z)V

    return-void

    :catchall_4
    move-exception v0

    move-object v15, v8

    move-wide/from16 v5, v25

    goto :goto_9

    :catchall_5
    move-exception v0

    move/from16 v20, v4

    move-object v15, v8

    const/4 v10, -0x1

    :goto_9
    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v1, Ls3/y2;->a:Ls3/u3;

    iget-object v8, v1, Ls3/y2;->b:Lu4/t$b;

    iget-boolean v1, v7, Ls3/i1$g;->f:Z

    if-eqz v1, :cond_e

    move-wide/from16 v18, v5

    :cond_e
    const/16 v21, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-wide/from16 v25, v5

    move-object v5, v8

    move-wide/from16 v6, v18

    move/from16 v8, v21

    invoke-virtual/range {v1 .. v8}, Ls3/i1;->n1(Ls3/u3;Lu4/t$b;Ls3/u3;Lu4/t$b;JZ)V

    if-nez v16, :cond_f

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v1, v1, Ls3/y2;->c:J

    cmp-long v1, v13, v1

    if-eqz v1, :cond_12

    :cond_f
    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v2, v1, Ls3/y2;->b:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    if-eqz v16, :cond_10

    if-eqz p2, :cond_10

    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v3

    if-nez v3, :cond_10

    iget-object v3, v11, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {v1, v2, v3}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v1

    iget-boolean v1, v1, Ls3/u3$b;->m:Z

    if-nez v1, :cond_10

    const/16 v24, 0x1

    goto :goto_a

    :cond_10
    const/16 v24, 0x0

    :goto_a
    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v1, Ls3/y2;->d:J

    invoke-virtual {v12, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v1

    if-ne v1, v10, :cond_11

    move/from16 v10, v20

    goto :goto_b

    :cond_11
    move/from16 v10, v17

    :goto_b
    move-object/from16 v1, p0

    move-object v2, v9

    move-wide/from16 v3, v25

    move-wide v5, v13

    move/from16 v9, v24

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v1

    iput-object v1, v11, Ls3/i1;->E:Ls3/y2;

    :cond_12
    invoke-virtual/range {p0 .. p0}, Ls3/i1;->r0()V

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v11, v12, v1}, Ls3/i1;->v0(Ls3/u3;Ls3/u3;)V

    iget-object v1, v11, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v1, v12}, Ls3/y2;->i(Ls3/u3;)Ls3/y2;

    move-result-object v1

    iput-object v1, v11, Ls3/i1;->E:Ls3/y2;

    invoke-virtual/range {p1 .. p1}, Ls3/u3;->u()Z

    move-result v1

    if-nez v1, :cond_13

    iput-object v15, v11, Ls3/i1;->R:Ls3/i1$h;

    :cond_13
    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Ls3/i1;->G(Z)V

    throw v0
.end method

.method public final H0(Ls3/e3;)V
    .locals 3

    invoke-virtual {p1}, Ls3/e3;->c()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "TAG"

    const-string v1, "Trying to send message on a dead thread."

    invoke-static {v0, v1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls3/e3;->k(Z)V

    return-void

    :cond_0
    iget-object v1, p0, Ls3/i1;->x:Lp5/d;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object v0

    new-instance v1, Ls3/h1;

    invoke-direct {v1, p0, p1}, Ls3/h1;-><init>(Ls3/i1;Ls3/e3;)V

    invoke-interface {v0, v1}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final I(Lu4/r;)V
    .locals 11

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0, p1}, Ls3/d2;->v(Lu4/r;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1}, Ls3/d2;->j()Ls3/a2;

    move-result-object p1

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->h()Ls3/a3;

    move-result-object v0

    iget v0, v0, Ls3/a3;->h:F

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p1, v0, v1}, Ls3/a2;->p(FLs3/u3;)V

    invoke-virtual {p1}, Ls3/a2;->n()Lu4/u0;

    move-result-object v0

    invoke-virtual {p1}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ls3/i1;->k1(Lu4/u0;Ln5/c0;)V

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-ne p1, v0, :cond_1

    iget-object v0, p1, Ls3/a2;->f:Ls3/b2;

    iget-wide v0, v0, Ls3/b2;->b:J

    invoke-virtual {p0, v0, v1}, Ls3/i1;->s0(J)V

    invoke-virtual {p0}, Ls3/i1;->r()V

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v2, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object p1, p1, Ls3/a2;->f:Ls3/b2;

    iget-wide v7, p1, Ls3/b2;->b:J

    iget-wide v5, v0, Ls3/y2;->c:J

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object v1, p0

    move-wide v3, v7

    invoke-virtual/range {v1 .. v10}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object p1

    iput-object p1, p0, Ls3/i1;->E:Ls3/y2;

    :cond_1
    invoke-virtual {p0}, Ls3/i1;->V()V

    return-void
.end method

.method public final I0(J)V
    .locals 5

    iget-object v0, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ls3/i3;->g()Lu4/m0;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3, p1, p2}, Ls3/i1;->J0(Ls3/i3;J)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final J(Ls3/a3;FZZ)V
    .locals 3

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    iget-object p3, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Ls3/i1$e;->b(I)V

    :cond_0
    iget-object p3, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p3, p1}, Ls3/y2;->f(Ls3/a3;)Ls3/y2;

    move-result-object p3

    iput-object p3, p0, Ls3/i1;->E:Ls3/y2;

    :cond_1
    iget p3, p1, Ls3/a3;->h:F

    invoke-virtual {p0, p3}, Ls3/i1;->o1(F)V

    iget-object p3, p0, Ls3/i1;->h:[Ls3/i3;

    array-length p4, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_3

    aget-object v1, p3, v0

    if-eqz v1, :cond_2

    iget v2, p1, Ls3/a3;->h:F

    invoke-interface {v1, p2, v2}, Ls3/i3;->t(FF)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final J0(Ls3/i3;J)V
    .locals 1

    invoke-interface {p1}, Ls3/i3;->l()V

    instance-of v0, p1, Ld5/o;

    if-eqz v0, :cond_0

    check-cast p1, Ld5/o;

    invoke-virtual {p1, p2, p3}, Ld5/o;->j0(J)V

    :cond_0
    return-void
.end method

.method public final K(Ls3/a3;Z)V
    .locals 2

    iget v0, p1, Ls3/a3;->h:F

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1, p2}, Ls3/i1;->J(Ls3/a3;FZZ)V

    return-void
.end method

.method public final K0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    iget-boolean v0, p0, Ls3/i1;->N:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Ls3/i1;->N:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-static {v2}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Ls3/i1;->i:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ls3/i3;->reset()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final L(Lu4/t$b;JJJZI)Ls3/y2;
    .locals 14

    move-object v0, p0

    move-object v2, p1

    move-wide/from16 v5, p4

    iget-boolean v1, v0, Ls3/i1;->U:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Ls3/i1;->E:Ls3/y2;

    iget-wide v3, v1, Ls3/y2;->r:J

    cmp-long v1, p2, v3

    if-nez v1, :cond_1

    iget-object v1, v0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {p1, v1}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, v0, Ls3/i1;->U:Z

    invoke-virtual {p0}, Ls3/i1;->r0()V

    iget-object v1, v0, Ls3/i1;->E:Ls3/y2;

    iget-object v3, v1, Ls3/y2;->h:Lu4/u0;

    iget-object v4, v1, Ls3/y2;->i:Ln5/c0;

    iget-object v1, v1, Ls3/y2;->j:Ljava/util/List;

    iget-object v7, v0, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v7}, Ls3/s2;->s()Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v1, v0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v3, Lu4/u0;->k:Lu4/u0;

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ls3/a2;->n()Lu4/u0;

    move-result-object v3

    :goto_2
    if-nez v1, :cond_3

    iget-object v4, v0, Ls3/i1;->l:Ln5/c0;

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ls3/a2;->o()Ln5/c0;

    move-result-object v4

    :goto_3
    iget-object v7, v4, Ln5/c0;->c:[Ln5/s;

    invoke-virtual {p0, v7}, Ls3/i1;->v([Ln5/s;)Li7/u;

    move-result-object v7

    if-eqz v1, :cond_4

    iget-object v8, v1, Ls3/a2;->f:Ls3/b2;

    iget-wide v9, v8, Ls3/b2;->c:J

    cmp-long v9, v9, v5

    if-eqz v9, :cond_4

    invoke-virtual {v8, v5, v6}, Ls3/b2;->a(J)Ls3/b2;

    move-result-object v8

    iput-object v8, v1, Ls3/a2;->f:Ls3/b2;

    :cond_4
    move-object v11, v3

    move-object v12, v4

    move-object v13, v7

    goto :goto_4

    :cond_5
    iget-object v7, v0, Ls3/i1;->E:Ls3/y2;

    iget-object v7, v7, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {p1, v7}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    sget-object v1, Lu4/u0;->k:Lu4/u0;

    iget-object v3, v0, Ls3/i1;->l:Ln5/c0;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v4

    move-object v11, v1

    move-object v12, v3

    move-object v13, v4

    goto :goto_4

    :cond_6
    move-object v13, v1

    move-object v11, v3

    move-object v12, v4

    :goto_4
    if-eqz p8, :cond_7

    iget-object v1, v0, Ls3/i1;->F:Ls3/i1$e;

    move/from16 v3, p9

    invoke-virtual {v1, v3}, Ls3/i1$e;->e(I)V

    :cond_7
    iget-object v1, v0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p0}, Ls3/i1;->C()J

    move-result-wide v9

    move-object v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    invoke-virtual/range {v1 .. v13}, Ls3/y2;->c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;

    move-result-object v1

    return-object v1
.end method

.method public final L0(Ls3/a3;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Lp5/n;->i(I)V

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0, p1}, Ls3/l;->d(Ls3/a3;)V

    return-void
.end method

.method public final M(Ls3/i3;Ls3/a2;)Z
    .locals 2

    invoke-virtual {p2}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    iget-object p2, p2, Ls3/a2;->f:Ls3/b2;

    iget-boolean p2, p2, Ls3/b2;->f:Z

    if-eqz p2, :cond_1

    iget-boolean p2, v0, Ls3/a2;->d:Z

    if-eqz p2, :cond_1

    instance-of p2, p1, Ld5/o;

    if-nez p2, :cond_0

    instance-of p2, p1, Lk4/f;

    if-nez p2, :cond_0

    invoke-interface {p1}, Ls3/i3;->B()J

    move-result-wide p1

    invoke-virtual {v0}, Ls3/a2;->m()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final M0(Ls3/i1$b;)V
    .locals 5

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    invoke-static {p1}, Ls3/i1$b;->a(Ls3/i1$b;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ls3/i1$h;

    new-instance v1, Ls3/f3;

    invoke-static {p1}, Ls3/i1$b;->b(Ls3/i1$b;)Ljava/util/List;

    move-result-object v2

    invoke-static {p1}, Ls3/i1$b;->c(Ls3/i1$b;)Lu4/o0;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ls3/f3;-><init>(Ljava/util/Collection;Lu4/o0;)V

    invoke-static {p1}, Ls3/i1$b;->a(Ls3/i1$b;)I

    move-result v2

    invoke-static {p1}, Ls3/i1$b;->d(Ls3/i1$b;)J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ls3/i1$h;-><init>(Ls3/u3;IJ)V

    iput-object v0, p0, Ls3/i1;->R:Ls3/i1$h;

    :cond_0
    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    invoke-static {p1}, Ls3/i1$b;->b(Ls3/i1$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Ls3/i1$b;->c(Ls3/i1$b;)Lu4/o0;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ls3/s2;->C(Ljava/util/List;Lu4/o0;)Ls3/u3;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final N()Z
    .locals 6

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    iget-boolean v1, v0, Ls3/a2;->d:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    :goto_0
    iget-object v3, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v4, v3

    if-ge v1, v4, :cond_3

    aget-object v3, v3, v1

    iget-object v4, v0, Ls3/a2;->c:[Lu4/m0;

    aget-object v4, v4, v1

    invoke-interface {v3}, Ls3/i3;->g()Lu4/m0;

    move-result-object v5

    if-ne v5, v4, :cond_2

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ls3/i3;->j()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3, v0}, Ls3/i1;->M(Ls3/i3;Ls3/a2;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public N0(Ljava/util/List;IJLu4/o0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;IJ",
            "Lu4/o0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    new-instance v8, Ls3/i1$b;

    const/4 v7, 0x0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p5

    move v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v7}, Ls3/i1$b;-><init>(Ljava/util/List;Lu4/o0;IJLs3/i1$a;)V

    const/16 p1, 0x11

    invoke-interface {v0, p1, v8}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final O0(Z)V
    .locals 1

    iget-boolean v0, p0, Ls3/i1;->P:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Ls3/i1;->P:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Ls3/i1;->E:Ls3/y2;

    iget-boolean p1, p1, Ls3/y2;->o:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls3/i1;->o:Lp5/n;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lp5/n;->f(I)Z

    :cond_1
    return-void
.end method

.method public final P()Z
    .locals 6

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ls3/a2;->k()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final P0(Z)V
    .locals 1

    iput-boolean p1, p0, Ls3/i1;->H:Z

    invoke-virtual {p0}, Ls3/i1;->r0()V

    iget-boolean p1, p0, Ls3/i1;->I:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1}, Ls3/d2;->q()Ls3/a2;

    move-result-object p1

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ls3/i1;->B0(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ls3/i1;->G(Z)V

    :cond_0
    return-void
.end method

.method public Q0(ZI)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1, p2}, Lp5/n;->a(III)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final R()Z
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    iget-object v1, v0, Ls3/a2;->f:Ls3/b2;

    iget-wide v1, v1, Ls3/b2;->e:J

    iget-boolean v0, v0, Ls3/a2;->d:Z

    if-eqz v0, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v3, v0, Ls3/y2;->r:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ls3/i1;->c1()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final R0(ZIZI)V
    .locals 1

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    invoke-virtual {v0, p3}, Ls3/i1$e;->b(I)V

    iget-object p3, p0, Ls3/i1;->F:Ls3/i1$e;

    invoke-virtual {p3, p4}, Ls3/i1$e;->c(I)V

    iget-object p3, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p3, p1, p2}, Ls3/y2;->d(ZI)Ls3/y2;

    move-result-object p2

    iput-object p2, p0, Ls3/i1;->E:Ls3/y2;

    const/4 p2, 0x0

    iput-boolean p2, p0, Ls3/i1;->J:Z

    invoke-virtual {p0, p1}, Ls3/i1;->f0(Z)V

    invoke-virtual {p0}, Ls3/i1;->c1()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ls3/i1;->i1()V

    invoke-virtual {p0}, Ls3/i1;->m1()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Ls3/i1;->E:Ls3/y2;

    iget p1, p1, Ls3/y2;->e:I

    const/4 p2, 0x3

    const/4 p3, 0x2

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Ls3/i1;->f1()V

    :goto_0
    iget-object p1, p0, Ls3/i1;->o:Lp5/n;

    invoke-interface {p1, p3}, Lp5/n;->f(I)Z

    goto :goto_1

    :cond_1
    if-ne p1, p3, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public S0(Ls3/a3;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x4

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final T0(Ls3/a3;)V
    .locals 1

    invoke-virtual {p0, p1}, Ls3/i1;->L0(Ls3/a3;)V

    iget-object p1, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {p1}, Ls3/l;->h()Ls3/a3;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls3/i1;->K(Ls3/a3;Z)V

    return-void
.end method

.method public U0(I)V
    .locals 3

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lp5/n;->a(III)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final V()V
    .locals 3

    invoke-virtual {p0}, Ls3/i1;->b1()Z

    move-result v0

    iput-boolean v0, p0, Ls3/i1;->K:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    iget-wide v1, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v1, v2}, Ls3/a2;->d(J)V

    :cond_0
    invoke-virtual {p0}, Ls3/i1;->j1()V

    return-void
.end method

.method public final V0(I)V
    .locals 2

    iput p1, p0, Ls3/i1;->L:I

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0, v1, p1}, Ls3/d2;->G(Ls3/u3;I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ls3/i1;->B0(Z)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ls3/i1;->G(Z)V

    return-void
.end method

.method public final W()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v0, v1}, Ls3/i1$e;->d(Ls3/y2;)V

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    invoke-static {v0}, Ls3/i1$e;->a(Ls3/i1$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/i1;->y:Ls3/i1$f;

    iget-object v1, p0, Ls3/i1;->F:Ls3/i1$e;

    invoke-interface {v0, v1}, Ls3/i1$f;->a(Ls3/i1$e;)V

    new-instance v0, Ls3/i1$e;

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    invoke-direct {v0, v1}, Ls3/i1$e;-><init>(Ls3/y2;)V

    iput-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    :cond_0
    return-void
.end method

.method public final W0(Ls3/m3;)V
    .locals 0

    iput-object p1, p0, Ls3/i1;->D:Ls3/m3;

    return-void
.end method

.method public final X(JJ)V
    .locals 7

    iget-object v0, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-boolean v0, p0, Ls3/i1;->U:Z

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/i1;->U:Z

    :cond_1
    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Ls3/i1;->T:I

    iget-object v2, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    :goto_0
    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/i1$d;

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_4

    iget v4, v3, Ls3/i1$d;->i:I

    if-gt v4, v0, :cond_3

    if-ne v4, v0, :cond_4

    iget-wide v3, v3, Ls3/i1$d;->j:J

    cmp-long v3, v3, p1

    if-lez v3, :cond_4

    :cond_3
    add-int/lit8 v1, v1, -0x1

    if-lez v1, :cond_2

    goto :goto_0

    :cond_4
    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    :goto_2
    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/i1$d;

    goto :goto_3

    :cond_5
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_7

    iget-object v4, v3, Ls3/i1$d;->k:Ljava/lang/Object;

    if-eqz v4, :cond_7

    iget v4, v3, Ls3/i1$d;->i:I

    if-lt v4, v0, :cond_6

    if-ne v4, v0, :cond_7

    iget-wide v4, v3, Ls3/i1$d;->j:J

    cmp-long v4, v4, p1

    if-gtz v4, :cond_7

    :cond_6
    add-int/lit8 v1, v1, 0x1

    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    goto :goto_2

    :cond_7
    :goto_4
    if-eqz v3, :cond_d

    iget-object v4, v3, Ls3/i1$d;->k:Ljava/lang/Object;

    if-eqz v4, :cond_d

    iget v4, v3, Ls3/i1$d;->i:I

    if-ne v4, v0, :cond_d

    iget-wide v4, v3, Ls3/i1$d;->j:J

    cmp-long v6, v4, p1

    if-lez v6, :cond_d

    cmp-long v4, v4, p3

    if-gtz v4, :cond_d

    :try_start_0
    iget-object v4, v3, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {p0, v4}, Ls3/i1;->G0(Ls3/e3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, v3, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v4}, Ls3/e3;->b()Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v3, v3, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {v3}, Ls3/e3;->j()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_9
    :goto_5
    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :goto_6
    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_a

    iget-object v3, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/i1$d;

    goto :goto_4

    :cond_a
    move-object v3, v2

    goto :goto_4

    :catchall_0
    move-exception p1

    iget-object p2, v3, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {p2}, Ls3/e3;->b()Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p2, v3, Ls3/i1$d;->h:Ls3/e3;

    invoke-virtual {p2}, Ls3/e3;->j()Z

    move-result p2

    if-eqz p2, :cond_c

    :cond_b
    iget-object p2, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_c
    throw p1

    :cond_d
    iput v1, p0, Ls3/i1;->T:I

    :cond_e
    :goto_7
    return-void
.end method

.method public final X0(Z)V
    .locals 2

    iput-boolean p1, p0, Ls3/i1;->M:Z

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0, v1, p1}, Ls3/d2;->H(Ls3/u3;Z)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ls3/i1;->B0(Z)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ls3/i1;->G(Z)V

    return-void
.end method

.method public final Y()V
    .locals 11

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    iget-wide v1, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v1, v2}, Ls3/d2;->y(J)V

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    iget-wide v1, p0, Ls3/i1;->S:J

    iget-object v3, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v0, v1, v2, v3}, Ls3/d2;->o(JLs3/y2;)Ls3/b2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v4, p0, Ls3/i1;->z:Ls3/d2;

    iget-object v5, p0, Ls3/i1;->j:[Ls3/j3;

    iget-object v6, p0, Ls3/i1;->k:Ln5/b0;

    iget-object v1, p0, Ls3/i1;->m:Ls3/s1;

    invoke-interface {v1}, Ls3/s1;->h()Lo5/b;

    move-result-object v7

    iget-object v8, p0, Ls3/i1;->A:Ls3/s2;

    iget-object v10, p0, Ls3/i1;->l:Ln5/c0;

    move-object v9, v0

    invoke-virtual/range {v4 .. v10}, Ls3/d2;->g([Ls3/j3;Ln5/b0;Lo5/b;Ls3/s2;Ls3/b2;Ln5/c0;)Ls3/a2;

    move-result-object v1

    iget-object v2, v1, Ls3/a2;->a:Lu4/r;

    iget-wide v3, v0, Ls3/b2;->b:J

    invoke-interface {v2, p0, v3, v4}, Lu4/r;->i(Lu4/r$a;J)V

    iget-object v2, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->p()Ls3/a2;

    move-result-object v2

    if-ne v2, v1, :cond_0

    iget-wide v0, v0, Ls3/b2;->b:J

    invoke-virtual {p0, v0, v1}, Ls3/i1;->s0(J)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls3/i1;->G(Z)V

    :cond_1
    iget-boolean v0, p0, Ls3/i1;->K:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ls3/i1;->P()Z

    move-result v0

    iput-boolean v0, p0, Ls3/i1;->K:Z

    invoke-virtual {p0}, Ls3/i1;->j1()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ls3/i1;->V()V

    :goto_0
    return-void
.end method

.method public final Y0(Lu4/o0;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v0, p1}, Ls3/s2;->D(Lu4/o0;)Ls3/u3;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final Z()V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Ls3/i1;->a1()Z

    move-result v3

    if-eqz v3, :cond_2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ls3/i1;->W()V

    :cond_0
    iget-object v2, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->b()Ls3/a2;

    move-result-object v2

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/a2;

    iget-object v3, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v3, v3, Ls3/y2;->b:Lu4/t$b;

    iget-object v3, v3, Lu4/s;->a:Ljava/lang/Object;

    iget-object v4, v2, Ls3/a2;->f:Ls3/b2;

    iget-object v4, v4, Ls3/b2;->a:Lu4/t$b;

    iget-object v4, v4, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v3, v3, Ls3/y2;->b:Lu4/t$b;

    iget v4, v3, Lu4/s;->b:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Ls3/a2;->f:Ls3/b2;

    iget-object v4, v4, Ls3/b2;->a:Lu4/t$b;

    iget v6, v4, Lu4/s;->b:I

    if-ne v6, v5, :cond_1

    iget v3, v3, Lu4/s;->e:I

    iget v4, v4, Lu4/s;->e:I

    if-eq v3, v4, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    iget-object v2, v2, Ls3/a2;->f:Ls3/b2;

    iget-object v5, v2, Ls3/b2;->a:Lu4/t$b;

    iget-wide v10, v2, Ls3/b2;->b:J

    iget-wide v8, v2, Ls3/b2;->c:J

    xor-int/lit8 v12, v3, 0x1

    const/4 v13, 0x0

    move-object v4, p0

    move-wide v6, v10

    invoke-virtual/range {v4 .. v13}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v2

    iput-object v2, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p0}, Ls3/i1;->r0()V

    invoke-virtual {p0}, Ls3/i1;->m1()V

    move v2, v1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final Z0(I)V
    .locals 3

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget v1, v0, Ls3/y2;->e:I

    if-eq v1, p1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Ls3/i1;->X:J

    :cond_0
    invoke-virtual {v0, p1}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object p1

    iput-object p1, p0, Ls3/i1;->E:Ls3/y2;

    :cond_1
    return-void
.end method

.method public final a0()V
    .locals 14

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x0

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Ls3/i1;->I:Z

    if-eqz v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0}, Ls3/i1;->N()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v1

    iget-boolean v1, v1, Ls3/a2;->d:Z

    if-nez v1, :cond_3

    iget-wide v1, p0, Ls3/i1;->S:J

    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v3

    invoke-virtual {v3}, Ls3/a2;->m()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gez v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v11

    iget-object v1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->c()Ls3/a2;

    move-result-object v12

    invoke-virtual {v12}, Ls3/a2;->o()Ln5/c0;

    move-result-object v13

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v3, v1, Ls3/y2;->a:Ls3/u3;

    iget-object v1, v12, Ls3/a2;->f:Ls3/b2;

    iget-object v2, v1, Ls3/b2;->a:Lu4/t$b;

    iget-object v0, v0, Ls3/a2;->f:Ls3/b2;

    iget-object v4, v0, Ls3/b2;->a:Lu4/t$b;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, v3

    invoke-virtual/range {v0 .. v7}, Ls3/i1;->n1(Ls3/u3;Lu4/t$b;Ls3/u3;Lu4/t$b;JZ)V

    iget-boolean v0, v12, Ls3/a2;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, v12, Ls3/a2;->a:Lu4/r;

    invoke-interface {v0}, Lu4/r;->p()J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-eqz v0, :cond_4

    invoke-virtual {v12}, Ls3/a2;->m()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ls3/i1;->I0(J)V

    return-void

    :cond_4
    move v0, v10

    :goto_0
    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v1, v1

    if-ge v0, v1, :cond_8

    invoke-virtual {v11, v0}, Ln5/c0;->c(I)Z

    move-result v1

    invoke-virtual {v13, v0}, Ln5/c0;->c(I)Z

    move-result v2

    if-eqz v1, :cond_7

    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v1, v1, v0

    invoke-interface {v1}, Ls3/i3;->D()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Ls3/i1;->j:[Ls3/j3;

    aget-object v1, v1, v0

    invoke-interface {v1}, Ls3/j3;->i()I

    move-result v1

    const/4 v3, -0x2

    if-ne v1, v3, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    move v1, v10

    :goto_1
    iget-object v3, v11, Ln5/c0;->b:[Ls3/k3;

    aget-object v3, v3, v0

    iget-object v4, v13, Ln5/c0;->b:[Ls3/k3;

    aget-object v4, v4, v0

    if-eqz v2, :cond_6

    invoke-virtual {v4, v3}, Ls3/k3;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v1, :cond_7

    :cond_6
    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v1, v1, v0

    invoke-virtual {v12}, Ls3/a2;->m()J

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Ls3/i1;->J0(Ls3/i3;J)V

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_8
    return-void

    :cond_9
    :goto_2
    iget-object v1, v0, Ls3/a2;->f:Ls3/b2;

    iget-boolean v1, v1, Ls3/b2;->i:Z

    if-nez v1, :cond_a

    iget-boolean v1, p0, Ls3/i1;->I:Z

    if-eqz v1, :cond_d

    :cond_a
    :goto_3
    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v2, v1

    if-ge v10, v2, :cond_d

    aget-object v1, v1, v10

    iget-object v2, v0, Ls3/a2;->c:[Lu4/m0;

    aget-object v2, v2, v10

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ls3/i3;->g()Lu4/m0;

    move-result-object v3

    if-ne v3, v2, :cond_c

    invoke-interface {v1}, Ls3/i3;->j()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, v0, Ls3/a2;->f:Ls3/b2;

    iget-wide v2, v2, Ls3/b2;->e:J

    cmp-long v4, v2, v8

    if-eqz v4, :cond_b

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v2, v2, v4

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Ls3/a2;->l()J

    move-result-wide v2

    iget-object v4, v0, Ls3/a2;->f:Ls3/b2;

    iget-wide v4, v4, Ls3/b2;->e:J

    add-long/2addr v2, v4

    goto :goto_4

    :cond_b
    move-wide v2, v8

    :goto_4
    invoke-virtual {p0, v1, v2, v3}, Ls3/i1;->J0(Ls3/i3;J)V

    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_d
    return-void
.end method

.method public final a1()Z
    .locals 6

    invoke-virtual {p0}, Ls3/i1;->c1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ls3/i1;->I:Z

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-wide v2, p0, Ls3/i1;->S:J

    invoke-virtual {v0}, Ls3/a2;->m()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_3

    iget-boolean v0, v0, Ls3/a2;->g:Z

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public declared-synchronized b(Ls3/e3;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ls3/i1;->G:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/i1;->q:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0xe

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    const-string v1, "Ignoring messages sent after release."

    invoke-static {v0, v1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls3/e3;->k(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1

    if-eq v1, v0, :cond_1

    iget-boolean v0, v0, Ls3/a2;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/i1;->o0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls3/i1;->r()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b1()Z
    .locals 12

    invoke-virtual {p0}, Ls3/i1;->P()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    invoke-virtual {v0}, Ls3/a2;->k()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ls3/i1;->D(J)J

    move-result-wide v2

    iget-object v4, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v4}, Ls3/d2;->p()Ls3/a2;

    move-result-object v4

    if-ne v0, v4, :cond_1

    iget-wide v4, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v4, v5}, Ls3/a2;->y(J)J

    move-result-wide v4

    goto :goto_0

    :cond_1
    iget-wide v4, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v4, v5}, Ls3/a2;->y(J)J

    move-result-wide v4

    iget-object v0, v0, Ls3/a2;->f:Ls3/b2;

    iget-wide v6, v0, Ls3/b2;->b:J

    sub-long/2addr v4, v6

    :goto_0
    move-wide v10, v4

    iget-object v4, p0, Ls3/i1;->m:Ls3/s1;

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->h()Ls3/a3;

    move-result-object v0

    iget v9, v0, Ls3/a3;->h:F

    move-wide v5, v10

    move-wide v7, v2

    invoke-interface/range {v4 .. v9}, Ls3/s1;->g(JJF)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide/32 v4, 0x7a120

    cmp-long v4, v2, v4

    if-gez v4, :cond_3

    iget-wide v4, p0, Ls3/i1;->t:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-gtz v4, :cond_2

    iget-boolean v4, p0, Ls3/i1;->u:Z

    if-eqz v4, :cond_3

    :cond_2
    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    iget-object v0, v0, Ls3/a2;->a:Lu4/r;

    iget-object v4, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v4, v4, Ls3/y2;->r:J

    invoke-interface {v0, v4, v5, v1}, Lu4/r;->t(JZ)V

    iget-object v4, p0, Ls3/i1;->m:Ls3/s1;

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->h()Ls3/a3;

    move-result-object v0

    iget v9, v0, Ls3/a3;->h:F

    move-wide v5, v10

    move-wide v7, v2

    invoke-interface/range {v4 .. v9}, Ls3/s1;->g(JJF)Z

    move-result v0

    :cond_3
    return v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lp5/n;->f(I)Z

    return-void
.end method

.method public final c0()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v0}, Ls3/s2;->i()Ls3/u3;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final c1()Z
    .locals 2

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v1, v0, Ls3/y2;->l:Z

    if-eqz v1, :cond_0

    iget v0, v0, Ls3/y2;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x16

    invoke-interface {v0, v1}, Lp5/n;->f(I)Z

    return-void
.end method

.method public final d0(Ls3/i1$c;)V
    .locals 4

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    iget v1, p1, Ls3/i1$c;->a:I

    iget v2, p1, Ls3/i1$c;->b:I

    iget v3, p1, Ls3/i1$c;->c:I

    iget-object p1, p1, Ls3/i1$c;->d:Lu4/o0;

    invoke-virtual {v0, v1, v2, v3, p1}, Ls3/s2;->v(IIILu4/o0;)Ls3/u3;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final d1(Z)Z
    .locals 12

    iget v0, p0, Ls3/i1;->Q:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ls3/i1;->R()Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v1, p1, Ls3/y2;->g:Z

    const/4 v2, 0x1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object p1, p1, Ls3/y2;->a:Ls3/u3;

    iget-object v1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1

    iget-object v1, v1, Ls3/a2;->f:Ls3/b2;

    iget-object v1, v1, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {p0, p1, v1}, Ls3/i1;->e1(Ls3/u3;Lu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ls3/i1;->B:Ls3/r1;

    invoke-interface {p1}, Ls3/r1;->b()J

    move-result-wide v3

    goto :goto_0

    :cond_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    move-wide v10, v3

    iget-object p1, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {p1}, Ls3/d2;->j()Ls3/a2;

    move-result-object p1

    invoke-virtual {p1}, Ls3/a2;->q()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p1, Ls3/a2;->f:Ls3/b2;

    iget-boolean v1, v1, Ls3/b2;->i:Z

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    move v1, v0

    :goto_1
    iget-object v3, p1, Ls3/a2;->f:Ls3/b2;

    iget-object v3, v3, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {v3}, Lu4/s;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-boolean p1, p1, Ls3/a2;->d:Z

    if-nez p1, :cond_5

    move p1, v2

    goto :goto_2

    :cond_5
    move p1, v0

    :goto_2
    if-nez v1, :cond_6

    if-nez p1, :cond_6

    iget-object v5, p0, Ls3/i1;->m:Ls3/s1;

    invoke-virtual {p0}, Ls3/i1;->C()J

    move-result-wide v6

    iget-object p1, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {p1}, Ls3/l;->h()Ls3/a3;

    move-result-object p1

    iget v8, p1, Ls3/a3;->h:F

    iget-boolean v9, p0, Ls3/i1;->J:Z

    invoke-interface/range {v5 .. v11}, Ls3/s1;->f(JFZJ)Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    move v0, v2

    :cond_7
    return v0
.end method

.method public bridge synthetic e(Lu4/n0;)V
    .locals 0

    check-cast p1, Lu4/r;

    invoke-virtual {p0, p1}, Ls3/i1;->h0(Lu4/r;)V

    return-void
.end method

.method public final e0()V
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    iget-object v1, v1, Ln5/c0;->c:[Ln5/s;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-interface {v4}, Ln5/s;->s()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final e1(Ls3/u3;Lu4/t$b;)Z
    .locals 4

    invoke-virtual {p2}, Lu4/s;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v0, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p1, p2, v0}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object p2

    iget p2, p2, Ls3/u3$b;->j:I

    iget-object v0, p0, Ls3/i1;->r:Ls3/u3$d;

    invoke-virtual {p1, p2, v0}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    iget-object p1, p0, Ls3/i1;->r:Ls3/u3$d;

    invoke-virtual {p1}, Ls3/u3$d;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-boolean p2, p1, Ls3/u3$d;->p:Z

    if-eqz p2, :cond_1

    iget-wide p1, p1, Ls3/u3$d;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public final f0(Z)V
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    iget-object v1, v1, Ln5/c0;->c:[Ln5/s;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-interface {v4, p1}, Ln5/s;->k(Z)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f1()V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/i1;->J:Z

    iget-object v1, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v1}, Ls3/l;->f()V

    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    invoke-static {v3}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ls3/i3;->start()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    iget-object v1, v1, Ln5/c0;->c:[Ln5/s;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-interface {v4}, Ln5/s;->u()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public g1()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lp5/n;->c(I)Lp5/n$a;

    move-result-object v0

    invoke-interface {v0}, Lp5/n$a;->a()V

    return-void
.end method

.method public h0(Lu4/r;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final h1(ZZ)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ls3/i1;->N:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Ls3/i1;->q0(ZZZZ)V

    iget-object p1, p0, Ls3/i1;->F:Ls3/i1$e;

    invoke-virtual {p1, p2}, Ls3/i1$e;->b(I)V

    iget-object p1, p0, Ls3/i1;->m:Ls3/s1;

    invoke-interface {p1}, Ls3/s1;->i()V

    invoke-virtual {p0, v1}, Ls3/i1;->Z0(I)V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 7

    const-string v0, "Playback error"

    const-string v1, "ExoPlayerImplInternal"

    const/16 v2, 0x3e8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    iget v5, p1, Landroid/os/Message;->what:I

    packed-switch v5, :pswitch_data_0

    return v3

    :pswitch_0
    invoke-virtual {p0}, Ls3/i1;->m()V

    goto/16 :goto_9

    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-ne p1, v4, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    invoke-virtual {p0, p1}, Ls3/i1;->O0(Z)V

    goto/16 :goto_9

    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_1

    move p1, v4

    goto :goto_1

    :cond_1
    move p1, v3

    :goto_1
    invoke-virtual {p0, p1}, Ls3/i1;->P0(Z)V

    goto/16 :goto_9

    :pswitch_3
    invoke-virtual {p0}, Ls3/i1;->c0()V

    goto/16 :goto_9

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu4/o0;

    invoke-virtual {p0, p1}, Ls3/i1;->Y0(Lu4/o0;)V

    goto/16 :goto_9

    :pswitch_5
    iget v5, p1, Landroid/os/Message;->arg1:I

    iget v6, p1, Landroid/os/Message;->arg2:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu4/o0;

    invoke-virtual {p0, v5, v6, p1}, Ls3/i1;->m0(IILu4/o0;)V

    goto/16 :goto_9

    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/i1$c;

    invoke-virtual {p0, p1}, Ls3/i1;->d0(Ls3/i1$c;)V

    goto/16 :goto_9

    :pswitch_7
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Ls3/i1$b;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v5, p1}, Ls3/i1;->l(Ls3/i1$b;I)V

    goto/16 :goto_9

    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/i1$b;

    invoke-virtual {p0, p1}, Ls3/i1;->M0(Ls3/i1$b;)V

    goto/16 :goto_9

    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/a3;

    invoke-virtual {p0, p1, v3}, Ls3/i1;->K(Ls3/a3;Z)V

    goto/16 :goto_9

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/e3;

    invoke-virtual {p0, p1}, Ls3/i1;->H0(Ls3/e3;)V

    goto/16 :goto_9

    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/e3;

    invoke-virtual {p0, p1}, Ls3/i1;->F0(Ls3/e3;)V

    goto/16 :goto_9

    :pswitch_c
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_2

    move v5, v4

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v5, p1}, Ls3/i1;->K0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    goto/16 :goto_9

    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    if-eqz p1, :cond_3

    move p1, v4

    goto :goto_3

    :cond_3
    move p1, v3

    :goto_3
    invoke-virtual {p0, p1}, Ls3/i1;->X0(Z)V

    goto/16 :goto_9

    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, p1}, Ls3/i1;->V0(I)V

    goto/16 :goto_9

    :pswitch_f
    invoke-virtual {p0}, Ls3/i1;->p0()V

    goto/16 :goto_9

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu4/r;

    invoke-virtual {p0, p1}, Ls3/i1;->E(Lu4/r;)V

    goto/16 :goto_9

    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu4/r;

    invoke-virtual {p0, p1}, Ls3/i1;->I(Lu4/r;)V

    goto/16 :goto_9

    :pswitch_12
    invoke-virtual {p0}, Ls3/i1;->l0()V

    return v4

    :pswitch_13
    invoke-virtual {p0, v3, v4}, Ls3/i1;->h1(ZZ)V

    goto/16 :goto_9

    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/m3;

    invoke-virtual {p0, p1}, Ls3/i1;->W0(Ls3/m3;)V

    goto/16 :goto_9

    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/a3;

    invoke-virtual {p0, p1}, Ls3/i1;->T0(Ls3/a3;)V

    goto/16 :goto_9

    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ls3/i1$h;

    invoke-virtual {p0, p1}, Ls3/i1;->C0(Ls3/i1$h;)V

    goto/16 :goto_9

    :pswitch_17
    invoke-virtual {p0}, Ls3/i1;->p()V

    goto/16 :goto_9

    :pswitch_18
    iget v5, p1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_4

    move v5, v4

    goto :goto_4

    :cond_4
    move v5, v3

    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v5, p1, v4, v4}, Ls3/i1;->R0(ZIZI)V

    goto/16 :goto_9

    :pswitch_19
    invoke-virtual {p0}, Ls3/i1;->j0()V
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lw3/n$a; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ls3/t2; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lo5/k; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lu4/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception p1

    instance-of v5, p1, Ljava/lang/IllegalStateException;

    if-nez v5, :cond_5

    instance-of v5, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v5, :cond_6

    :cond_5
    const/16 v2, 0x3ec

    :cond_6
    invoke-static {p1, v2}, Ls3/q;->i(Ljava/lang/RuntimeException;I)Ls3/q;

    move-result-object p1

    :cond_7
    :goto_5
    invoke-static {v1, v0, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v4, v3}, Ls3/i1;->h1(ZZ)V

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v0, p1}, Ls3/y2;->e(Ls3/q;)Ls3/y2;

    move-result-object p1

    iput-object p1, p0, Ls3/i1;->E:Ls3/y2;

    goto/16 :goto_9

    :catch_1
    move-exception p1

    const/16 v0, 0x7d0

    goto :goto_8

    :catch_2
    move-exception p1

    const/16 v0, 0x3ea

    goto :goto_8

    :catch_3
    move-exception p1

    iget v0, p1, Lo5/k;->h:I

    goto :goto_8

    :catch_4
    move-exception p1

    iget v0, p1, Ls3/t2;->i:I

    if-ne v0, v4, :cond_9

    iget-boolean v0, p1, Ls3/t2;->h:Z

    if-eqz v0, :cond_8

    const/16 v0, 0xbb9

    goto :goto_6

    :cond_8
    const/16 v0, 0xbbb

    :goto_6
    move v2, v0

    goto :goto_7

    :cond_9
    const/4 v1, 0x4

    if-ne v0, v1, :cond_b

    iget-boolean v0, p1, Ls3/t2;->h:Z

    if-eqz v0, :cond_a

    const/16 v0, 0xbba

    goto :goto_6

    :cond_a
    const/16 v0, 0xbbc

    goto :goto_6

    :cond_b
    :goto_7
    invoke-virtual {p0, p1, v2}, Ls3/i1;->F(Ljava/io/IOException;I)V

    goto :goto_9

    :catch_5
    move-exception p1

    iget v0, p1, Lw3/n$a;->h:I

    :goto_8
    invoke-virtual {p0, p1, v0}, Ls3/i1;->F(Ljava/io/IOException;I)V

    goto :goto_9

    :catch_6
    move-exception p1

    iget v2, p1, Ls3/q;->p:I

    if-ne v2, v4, :cond_c

    iget-object v2, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->q()Ls3/a2;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v2, v2, Ls3/a2;->f:Ls3/b2;

    iget-object v2, v2, Ls3/b2;->a:Lu4/t$b;

    invoke-virtual {p1, v2}, Ls3/q;->e(Lu4/s;)Ls3/q;

    move-result-object p1

    :cond_c
    iget-boolean v2, p1, Ls3/q;->v:Z

    if-eqz v2, :cond_d

    iget-object v2, p0, Ls3/i1;->V:Ls3/q;

    if-nez v2, :cond_d

    const-string v0, "Recoverable renderer error"

    invoke-static {v1, v0, p1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Ls3/i1;->V:Ls3/q;

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x19

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lp5/n;->e(Lp5/n$a;)Z

    goto :goto_9

    :cond_d
    iget-object v2, p0, Ls3/i1;->V:Ls3/q;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Ljava/lang/Exception;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ls3/i1;->V:Ls3/q;

    goto :goto_5

    :goto_9
    invoke-virtual {p0}, Ls3/i1;->W()V

    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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

.method public i0()V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lp5/n;->c(I)Lp5/n$a;

    move-result-object v0

    invoke-interface {v0}, Lp5/n$a;->a()V

    return-void
.end method

.method public final i1()V
    .locals 5

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->g()V

    iget-object v0, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-static {v3}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3}, Ls3/i1;->t(Ls3/i3;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j0()V
    .locals 3

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v1}, Ls3/i1;->q0(ZZZZ)V

    iget-object v0, p0, Ls3/i1;->m:Ls3/s1;

    invoke-interface {v0}, Ls3/s1;->a()V

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Ls3/i1;->Z0(I)V

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    iget-object v2, p0, Ls3/i1;->n:Lo5/e;

    invoke-interface {v2}, Lo5/e;->e()Lo5/m0;

    move-result-object v2

    invoke-virtual {v0, v2}, Ls3/s2;->w(Lo5/m0;)V

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    invoke-interface {v0, v1}, Lp5/n;->f(I)Z

    return-void
.end method

.method public final j1()V
    .locals 3

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    iget-boolean v1, p0, Ls3/i1;->K:Z

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls3/a2;->a:Lu4/r;

    invoke-interface {v0}, Lu4/r;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v2, v1, Ls3/y2;->g:Z

    if-eq v0, v2, :cond_2

    invoke-virtual {v1, v0}, Ls3/y2;->a(Z)Ls3/y2;

    move-result-object v0

    iput-object v0, p0, Ls3/i1;->E:Ls3/y2;

    :cond_2
    return-void
.end method

.method public k(Lu4/r;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public declared-synchronized k0()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ls3/i1;->G:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/i1;->q:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lp5/n;->f(I)Z

    new-instance v0, Ls3/g1;

    invoke-direct {v0, p0}, Ls3/g1;-><init>(Ls3/i1;)V

    iget-wide v1, p0, Ls3/i1;->C:J

    invoke-virtual {p0, v0, v1, v2}, Ls3/i1;->p1(Lh7/u;J)V

    iget-boolean v0, p0, Ls3/i1;->G:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final k1(Lu4/u0;Ln5/c0;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->m:Ls3/s1;

    iget-object v1, p0, Ls3/i1;->h:[Ls3/i3;

    iget-object p2, p2, Ln5/c0;->c:[Ln5/s;

    invoke-interface {v0, v1, p1, p2}, Ls3/s1;->d([Ls3/i3;Lu4/u0;[Ln5/s;)V

    return-void
.end method

.method public final l(Ls3/i1$b;I)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    const/4 v1, -0x1

    if-ne p2, v1, :cond_0

    invoke-virtual {v0}, Ls3/s2;->q()I

    move-result p2

    :cond_0
    invoke-static {p1}, Ls3/i1$b;->b(Ls3/i1$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Ls3/i1$b;->c(Ls3/i1$b;)Lu4/o0;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Ls3/s2;->f(ILjava/util/List;Lu4/o0;)Ls3/u3;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final l0()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0, v1}, Ls3/i1;->q0(ZZZZ)V

    iget-object v1, p0, Ls3/i1;->m:Ls3/s1;

    invoke-interface {v1}, Ls3/s1;->e()V

    invoke-virtual {p0, v0}, Ls3/i1;->Z0(I)V

    iget-object v1, p0, Ls3/i1;->p:Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    :cond_0
    monitor-enter p0

    :try_start_0
    iput-boolean v0, p0, Ls3/i1;->G:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final l1()V
    .locals 1

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v0}, Ls3/s2;->s()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/i1;->Y()V

    invoke-virtual {p0}, Ls3/i1;->a0()V

    invoke-virtual {p0}, Ls3/i1;->b0()V

    invoke-virtual {p0}, Ls3/i1;->Z()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ls3/i1;->B0(Z)V

    return-void
.end method

.method public final m0(IILu4/o0;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->F:Ls3/i1$e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    iget-object v0, p0, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v0, p1, p2, p3}, Ls3/s2;->A(IILu4/o0;)Ls3/u3;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ls3/i1;->H(Ls3/u3;Z)V

    return-void
.end method

.method public final m1()V
    .locals 11

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Ls3/a2;->d:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v1, :cond_1

    iget-object v1, v0, Ls3/a2;->a:Lu4/r;

    invoke-interface {v1}, Lu4/r;->p()J

    move-result-wide v4

    move-wide v6, v4

    goto :goto_0

    :cond_1
    move-wide v6, v2

    :goto_0
    cmp-long v1, v6, v2

    const/4 v10, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0, v6, v7}, Ls3/i1;->s0(J)V

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v0, v0, Ls3/y2;->r:J

    cmp-long v0, v6, v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    const/4 v8, 0x1

    const/4 v9, 0x5

    move-object v0, p0

    move-wide v2, v6

    invoke-virtual/range {v0 .. v9}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v0

    iput-object v0, p0, Ls3/i1;->E:Ls3/y2;

    goto :goto_2

    :cond_2
    iget-object v1, p0, Ls3/i1;->v:Ls3/l;

    iget-object v2, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->q()Ls3/a2;

    move-result-object v2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v10

    :goto_1
    invoke-virtual {v1, v2}, Ls3/l;->i(Z)J

    move-result-wide v1

    iput-wide v1, p0, Ls3/i1;->S:J

    invoke-virtual {v0, v1, v2}, Ls3/a2;->y(J)J

    move-result-wide v0

    iget-object v2, p0, Ls3/i1;->E:Ls3/y2;

    iget-wide v2, v2, Ls3/y2;->r:J

    invoke-virtual {p0, v2, v3, v0, v1}, Ls3/i1;->X(JJ)V

    iget-object v2, p0, Ls3/i1;->E:Ls3/y2;

    iput-wide v0, v2, Ls3/y2;->r:J

    :cond_4
    :goto_2
    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->j()Ls3/a2;

    move-result-object v0

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {v0}, Ls3/a2;->i()J

    move-result-wide v2

    iput-wide v2, v1, Ls3/y2;->p:J

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    invoke-virtual {p0}, Ls3/i1;->C()J

    move-result-wide v1

    iput-wide v1, v0, Ls3/y2;->q:J

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v1, v0, Ls3/y2;->l:Z

    if-eqz v1, :cond_5

    iget v1, v0, Ls3/y2;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_5

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {p0, v1, v0}, Ls3/i1;->e1(Ls3/u3;Lu4/t$b;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->n:Ls3/a3;

    iget v0, v0, Ls3/a3;->h:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_5

    iget-object v0, p0, Ls3/i1;->B:Ls3/r1;

    invoke-virtual {p0}, Ls3/i1;->w()J

    move-result-wide v1

    invoke-virtual {p0}, Ls3/i1;->C()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Ls3/r1;->a(JJ)F

    move-result v0

    iget-object v1, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v1}, Ls3/l;->h()Ls3/a3;

    move-result-object v1

    iget v1, v1, Ls3/a3;->h:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_5

    iget-object v1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->n:Ls3/a3;

    invoke-virtual {v1, v0}, Ls3/a3;->d(F)Ls3/a3;

    move-result-object v0

    invoke-virtual {p0, v0}, Ls3/i1;->L0(Ls3/a3;)V

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->n:Ls3/a3;

    iget-object v1, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v1}, Ls3/l;->h()Ls3/a3;

    move-result-object v1

    iget v1, v1, Ls3/a3;->h:F

    invoke-virtual {p0, v0, v1, v10, v10}, Ls3/i1;->J(Ls3/a3;FZZ)V

    :cond_5
    return-void
.end method

.method public final n(Ls3/e3;)V
    .locals 4

    invoke-virtual {p1}, Ls3/e3;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p1}, Ls3/e3;->g()Ls3/e3$b;

    move-result-object v1

    invoke-virtual {p1}, Ls3/e3;->i()I

    move-result v2

    invoke-virtual {p1}, Ls3/e3;->e()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ls3/e3$b;->y(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Ls3/e3;->k(Z)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Ls3/e3;->k(Z)V

    throw v1
.end method

.method public n0(IILu4/o0;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x14

    invoke-interface {v0, v1, p1, p2, p3}, Lp5/n;->g(IIILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final n1(Ls3/u3;Lu4/t$b;Ls3/u3;Lu4/t$b;JZ)V
    .locals 3

    invoke-virtual {p0, p1, p2}, Ls3/i1;->e1(Ls3/u3;Lu4/t$b;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lu4/s;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ls3/a3;->k:Ls3/a3;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ls3/i1;->E:Ls3/y2;

    iget-object p1, p1, Ls3/y2;->n:Ls3/a3;

    :goto_0
    iget-object p2, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {p2}, Ls3/l;->h()Ls3/a3;

    move-result-object p2

    invoke-virtual {p2, p1}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Ls3/i1;->L0(Ls3/a3;)V

    iget-object p2, p0, Ls3/i1;->E:Ls3/y2;

    iget-object p2, p2, Ls3/y2;->n:Ls3/a3;

    iget p1, p1, Ls3/a3;->h:F

    const/4 p3, 0x0

    invoke-virtual {p0, p2, p1, p3, p3}, Ls3/i1;->J(Ls3/a3;FZZ)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v1, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p1, v0, v1}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    iget-object v1, p0, Ls3/i1;->r:Ls3/u3$d;

    invoke-virtual {p1, v0, v1}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    iget-object v0, p0, Ls3/i1;->B:Ls3/r1;

    iget-object v1, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-object v1, v1, Ls3/u3$d;->r:Ls3/u1$g;

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/u1$g;

    invoke-interface {v0, v1}, Ls3/r1;->e(Ls3/u1$g;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p5, v0

    if-eqz v2, :cond_3

    iget-object p3, p0, Ls3/i1;->B:Ls3/r1;

    iget-object p2, p2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, p5, p6}, Ls3/i1;->y(Ls3/u3;Ljava/lang/Object;J)J

    move-result-wide p1

    invoke-interface {p3, p1, p2}, Ls3/r1;->d(J)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-object p1, p1, Ls3/u3$d;->h:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-virtual {p3}, Ls3/u3;->u()Z

    move-result p5

    if-nez p5, :cond_4

    iget-object p2, p4, Lu4/s;->a:Ljava/lang/Object;

    iget-object p4, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p3, p2, p4}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object p2

    iget p2, p2, Ls3/u3$b;->j:I

    iget-object p4, p0, Ls3/i1;->r:Ls3/u3$d;

    invoke-virtual {p3, p2, p4}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object p2

    iget-object p2, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    :cond_4
    invoke-static {p2, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p7, :cond_6

    :cond_5
    iget-object p1, p0, Ls3/i1;->B:Ls3/r1;

    invoke-interface {p1, v0, v1}, Ls3/r1;->d(J)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final o(Ls3/i3;)V
    .locals 1

    invoke-static {p1}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0, p1}, Ls3/l;->a(Ls3/i3;)V

    invoke-virtual {p0, p1}, Ls3/i1;->t(Ls3/i3;)V

    invoke-interface {p1}, Ls3/i3;->f()V

    iget p1, p0, Ls3/i1;->Q:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ls3/i1;->Q:I

    return-void
.end method

.method public final o0()Z
    .locals 15

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    iget-object v5, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v6, v5

    const/4 v7, 0x1

    if-ge v3, v6, :cond_5

    aget-object v8, v5, v3

    invoke-static {v8}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v8}, Ls3/i3;->g()Lu4/m0;

    move-result-object v5

    iget-object v6, v0, Ls3/a2;->c:[Lu4/m0;

    aget-object v6, v6, v3

    if-eq v5, v6, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    invoke-virtual {v1, v3}, Ln5/c0;->c(I)Z

    move-result v6

    if-eqz v6, :cond_2

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v8}, Ls3/i3;->D()Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, v1, Ln5/c0;->c:[Ln5/s;

    aget-object v5, v5, v3

    invoke-static {v5}, Ls3/i1;->x(Ln5/s;)[Ls3/m1;

    move-result-object v9

    iget-object v5, v0, Ls3/a2;->c:[Lu4/m0;

    aget-object v10, v5, v3

    invoke-virtual {v0}, Ls3/a2;->m()J

    move-result-wide v11

    invoke-virtual {v0}, Ls3/a2;->l()J

    move-result-wide v13

    invoke-interface/range {v8 .. v14}, Ls3/i3;->A([Ls3/m1;Lu4/m0;JJ)V

    goto :goto_2

    :cond_3
    invoke-interface {v8}, Ls3/i3;->c()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p0, v8}, Ls3/i1;->o(Ls3/i3;)V

    goto :goto_2

    :cond_4
    move v4, v7

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    xor-int/lit8 v0, v4, 0x1

    return v0
.end method

.method public final o1(F)V
    .locals 5

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    iget-object v1, v1, Ln5/c0;->c:[Ln5/s;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-eqz v4, :cond_0

    invoke-interface {v4, p1}, Ln5/s;->q(F)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls3/a2;->j()Ls3/a2;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onPlaybackParametersChanged(Ls3/a3;)V
    .locals 2

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    const/16 v1, 0x10

    invoke-interface {v0, v1, p1}, Lp5/n;->j(ILjava/lang/Object;)Lp5/n$a;

    move-result-object p1

    invoke-interface {p1}, Lp5/n$a;->a()V

    return-void
.end method

.method public final p()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Ls3/i1;->x:Lp5/d;

    invoke-interface {v1}, Lp5/d;->a()J

    move-result-wide v1

    iget-object v3, v0, Ls3/i1;->o:Lp5/n;

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Lp5/n;->i(I)V

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->l1()V

    iget-object v3, v0, Ls3/i1;->E:Ls3/y2;

    iget v3, v3, Ls3/y2;->e:I

    const/4 v5, 0x1

    if-eq v3, v5, :cond_22

    const/4 v6, 0x4

    if-ne v3, v6, :cond_0

    goto/16 :goto_13

    :cond_0
    iget-object v3, v0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v3}, Ls3/d2;->p()Ls3/a2;

    move-result-object v3

    const-wide/16 v7, 0xa

    if-nez v3, :cond_1

    invoke-virtual {v0, v1, v2, v7, v8}, Ls3/i1;->z0(JJ)V

    return-void

    :cond_1
    const-string v9, "doSomeWork"

    invoke-static {v9}, Lp5/k0;->a(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->m1()V

    iget-boolean v9, v3, Ls3/a2;->d:Z

    const-wide/16 v10, 0x3e8

    const/4 v12, 0x0

    if-eqz v9, :cond_a

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    mul-long/2addr v13, v10

    iget-object v9, v3, Ls3/a2;->a:Lu4/r;

    iget-object v15, v0, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v15, Ls3/y2;->r:J

    iget-wide v10, v0, Ls3/i1;->t:J

    sub-long/2addr v7, v10

    iget-boolean v10, v0, Ls3/i1;->u:Z

    invoke-interface {v9, v7, v8, v10}, Lu4/r;->t(JZ)V

    move v8, v5

    move v9, v8

    move v7, v12

    :goto_0
    iget-object v10, v0, Ls3/i1;->h:[Ls3/i3;

    array-length v11, v10

    if-ge v7, v11, :cond_b

    aget-object v10, v10, v7

    invoke-static {v10}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_7

    :cond_2
    iget-wide v4, v0, Ls3/i1;->S:J

    invoke-interface {v10, v4, v5, v13, v14}, Ls3/i3;->x(JJ)V

    if-eqz v8, :cond_3

    invoke-interface {v10}, Ls3/i3;->c()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    move v8, v12

    :goto_1
    iget-object v4, v3, Ls3/a2;->c:[Lu4/m0;

    aget-object v4, v4, v7

    invoke-interface {v10}, Ls3/i3;->g()Lu4/m0;

    move-result-object v5

    if-eq v4, v5, :cond_4

    const/4 v4, 0x1

    goto :goto_2

    :cond_4
    move v4, v12

    :goto_2
    if-nez v4, :cond_5

    invoke-interface {v10}, Ls3/i3;->j()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    move v5, v12

    :goto_3
    if-nez v4, :cond_7

    if-nez v5, :cond_7

    invoke-interface {v10}, Ls3/i3;->e()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-interface {v10}, Ls3/i3;->c()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    move v4, v12

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v4, 0x1

    :goto_5
    if-eqz v9, :cond_8

    if-eqz v4, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v12

    :goto_6
    if-nez v4, :cond_9

    invoke-interface {v10}, Ls3/i3;->z()V

    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x1

    goto :goto_0

    :cond_a
    iget-object v4, v3, Ls3/a2;->a:Lu4/r;

    invoke-interface {v4}, Lu4/r;->l()V

    const/4 v8, 0x1

    const/4 v9, 0x1

    :cond_b
    iget-object v4, v3, Ls3/a2;->f:Ls3/b2;

    iget-wide v4, v4, Ls3/b2;->e:J

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v8, :cond_d

    iget-boolean v7, v3, Ls3/a2;->d:Z

    if-eqz v7, :cond_d

    cmp-long v7, v4, v13

    if-eqz v7, :cond_c

    iget-object v7, v0, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v7, Ls3/y2;->r:J

    cmp-long v4, v4, v7

    if-gtz v4, :cond_d

    :cond_c
    const/4 v4, 0x1

    goto :goto_8

    :cond_d
    move v4, v12

    :goto_8
    if-eqz v4, :cond_e

    iget-boolean v5, v0, Ls3/i1;->I:Z

    if-eqz v5, :cond_e

    iput-boolean v12, v0, Ls3/i1;->I:Z

    iget-object v5, v0, Ls3/i1;->E:Ls3/y2;

    iget v5, v5, Ls3/y2;->m:I

    const/4 v7, 0x5

    invoke-virtual {v0, v12, v5, v12, v7}, Ls3/i1;->R0(ZIZI)V

    :cond_e
    const/4 v5, 0x3

    if-eqz v4, :cond_10

    iget-object v4, v3, Ls3/a2;->f:Ls3/b2;

    iget-boolean v4, v4, Ls3/b2;->i:Z

    if-eqz v4, :cond_10

    invoke-virtual {v0, v6}, Ls3/i1;->Z0(I)V

    :cond_f
    :goto_9
    invoke-virtual/range {p0 .. p0}, Ls3/i1;->i1()V

    goto :goto_a

    :cond_10
    iget-object v4, v0, Ls3/i1;->E:Ls3/y2;

    iget v4, v4, Ls3/y2;->e:I

    const/4 v7, 0x2

    if-ne v4, v7, :cond_11

    invoke-virtual {v0, v9}, Ls3/i1;->d1(Z)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v0, v5}, Ls3/i1;->Z0(I)V

    const/4 v4, 0x0

    iput-object v4, v0, Ls3/i1;->V:Ls3/q;

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->c1()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->f1()V

    goto :goto_a

    :cond_11
    iget-object v4, v0, Ls3/i1;->E:Ls3/y2;

    iget v4, v4, Ls3/y2;->e:I

    if-ne v4, v5, :cond_14

    iget v4, v0, Ls3/i1;->Q:I

    if-nez v4, :cond_12

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->R()Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_a

    :cond_12
    if-nez v9, :cond_14

    :cond_13
    invoke-virtual/range {p0 .. p0}, Ls3/i1;->c1()Z

    move-result v4

    iput-boolean v4, v0, Ls3/i1;->J:Z

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Ls3/i1;->Z0(I)V

    iget-boolean v4, v0, Ls3/i1;->J:Z

    if-eqz v4, :cond_f

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->g0()V

    iget-object v4, v0, Ls3/i1;->B:Ls3/r1;

    invoke-interface {v4}, Ls3/r1;->c()V

    goto :goto_9

    :cond_14
    :goto_a
    iget-object v4, v0, Ls3/i1;->E:Ls3/y2;

    iget v4, v4, Ls3/y2;->e:I

    const/4 v7, 0x2

    if-ne v4, v7, :cond_17

    move v4, v12

    :goto_b
    iget-object v7, v0, Ls3/i1;->h:[Ls3/i3;

    array-length v8, v7

    if-ge v4, v8, :cond_16

    aget-object v7, v7, v4

    invoke-static {v7}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v7

    if-eqz v7, :cond_15

    iget-object v7, v0, Ls3/i1;->h:[Ls3/i3;

    aget-object v7, v7, v4

    invoke-interface {v7}, Ls3/i3;->g()Lu4/m0;

    move-result-object v7

    iget-object v8, v3, Ls3/a2;->c:[Lu4/m0;

    aget-object v8, v8, v4

    if-ne v7, v8, :cond_15

    iget-object v7, v0, Ls3/i1;->h:[Ls3/i3;

    aget-object v7, v7, v4

    invoke-interface {v7}, Ls3/i3;->z()V

    :cond_15
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_16
    iget-object v3, v0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v4, v3, Ls3/y2;->g:Z

    if-nez v4, :cond_17

    iget-wide v3, v3, Ls3/y2;->q:J

    const-wide/32 v7, 0x7a120

    cmp-long v3, v3, v7

    if-gez v3, :cond_17

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->P()Z

    move-result v3

    if-eqz v3, :cond_17

    const/4 v3, 0x1

    goto :goto_c

    :cond_17
    move v3, v12

    :goto_c
    if-nez v3, :cond_18

    iput-wide v13, v0, Ls3/i1;->X:J

    goto :goto_d

    :cond_18
    iget-wide v3, v0, Ls3/i1;->X:J

    cmp-long v3, v3, v13

    if-nez v3, :cond_19

    iget-object v3, v0, Ls3/i1;->x:Lp5/d;

    invoke-interface {v3}, Lp5/d;->b()J

    move-result-wide v3

    iput-wide v3, v0, Ls3/i1;->X:J

    goto :goto_d

    :cond_19
    iget-object v3, v0, Ls3/i1;->x:Lp5/d;

    invoke-interface {v3}, Lp5/d;->b()J

    move-result-wide v3

    iget-wide v7, v0, Ls3/i1;->X:J

    sub-long/2addr v3, v7

    const-wide/16 v7, 0xfa0

    cmp-long v3, v3, v7

    if-gez v3, :cond_21

    :goto_d
    invoke-virtual/range {p0 .. p0}, Ls3/i1;->c1()Z

    move-result v3

    if-eqz v3, :cond_1a

    iget-object v3, v0, Ls3/i1;->E:Ls3/y2;

    iget v3, v3, Ls3/y2;->e:I

    if-ne v3, v5, :cond_1a

    const/4 v3, 0x1

    goto :goto_e

    :cond_1a
    move v3, v12

    :goto_e
    iget-boolean v4, v0, Ls3/i1;->P:Z

    if-eqz v4, :cond_1b

    iget-boolean v4, v0, Ls3/i1;->O:Z

    if-eqz v4, :cond_1b

    if-eqz v3, :cond_1b

    const/4 v15, 0x1

    goto :goto_f

    :cond_1b
    move v15, v12

    :goto_f
    iget-object v4, v0, Ls3/i1;->E:Ls3/y2;

    iget-boolean v7, v4, Ls3/y2;->o:Z

    if-eq v7, v15, :cond_1c

    invoke-virtual {v4, v15}, Ls3/y2;->h(Z)Ls3/y2;

    move-result-object v4

    iput-object v4, v0, Ls3/i1;->E:Ls3/y2;

    :cond_1c
    iput-boolean v12, v0, Ls3/i1;->O:Z

    if-nez v15, :cond_20

    iget-object v4, v0, Ls3/i1;->E:Ls3/y2;

    iget v4, v4, Ls3/y2;->e:I

    if-ne v4, v6, :cond_1d

    goto :goto_12

    :cond_1d
    if-nez v3, :cond_1f

    const/4 v3, 0x2

    if-ne v4, v3, :cond_1e

    goto :goto_10

    :cond_1e
    if-ne v4, v5, :cond_20

    iget v3, v0, Ls3/i1;->Q:I

    if-eqz v3, :cond_20

    const-wide/16 v3, 0x3e8

    goto :goto_11

    :cond_1f
    :goto_10
    const-wide/16 v3, 0xa

    :goto_11
    invoke-virtual {v0, v1, v2, v3, v4}, Ls3/i1;->z0(JJ)V

    :cond_20
    :goto_12
    invoke-static {}, Lp5/k0;->c()V

    return-void

    :cond_21
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Playback stuck buffering and not loading"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_22
    :goto_13
    return-void
.end method

.method public final p0()V
    .locals 19

    move-object/from16 v10, p0

    iget-object v0, v10, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->h()Ls3/a3;

    move-result-object v0

    iget v0, v0, Ls3/a3;->h:F

    iget-object v1, v10, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v1}, Ls3/d2;->p()Ls3/a2;

    move-result-object v1

    iget-object v2, v10, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->q()Ls3/a2;

    move-result-object v2

    const/4 v3, 0x1

    :goto_0
    if-eqz v1, :cond_b

    iget-boolean v4, v1, Ls3/a2;->d:Z

    if-nez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v4, v10, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v4, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v1, v0, v4}, Ls3/a2;->v(FLs3/u3;)Ln5/c0;

    move-result-object v13

    invoke-virtual {v1}, Ls3/a2;->o()Ln5/c0;

    move-result-object v4

    invoke-virtual {v13, v4}, Ln5/c0;->a(Ln5/c0;)Z

    move-result v4

    const/4 v9, 0x0

    if-nez v4, :cond_9

    const/4 v8, 0x4

    iget-object v0, v10, Ls3/i1;->z:Ls3/d2;

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v6

    iget-object v0, v10, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0, v6}, Ls3/d2;->z(Ls3/a2;)Z

    move-result v16

    iget-object v0, v10, Ls3/i1;->h:[Ls3/i3;

    array-length v0, v0

    new-array v7, v0, [Z

    iget-object v0, v10, Ls3/i1;->E:Ls3/y2;

    iget-wide v14, v0, Ls3/y2;->r:J

    move-object v12, v6

    move-object/from16 v17, v7

    invoke-virtual/range {v12 .. v17}, Ls3/a2;->b(Ln5/c0;JZ[Z)J

    move-result-wide v12

    iget-object v0, v10, Ls3/i1;->E:Ls3/y2;

    iget v1, v0, Ls3/y2;->e:I

    if-eq v1, v8, :cond_1

    iget-wide v0, v0, Ls3/y2;->r:J

    cmp-long v0, v12, v0

    if-eqz v0, :cond_1

    const/4 v14, 0x1

    goto :goto_1

    :cond_1
    move v14, v9

    :goto_1
    iget-object v0, v10, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v2, v0, Ls3/y2;->d:J

    const/4 v15, 0x5

    move-object/from16 v0, p0

    move-wide/from16 v16, v2

    move-wide v2, v12

    move-object v11, v6

    move-object/from16 v18, v7

    move-wide/from16 v6, v16

    move v8, v14

    move v9, v15

    invoke-virtual/range {v0 .. v9}, Ls3/i1;->L(Lu4/t$b;JJJZI)Ls3/y2;

    move-result-object v0

    iput-object v0, v10, Ls3/i1;->E:Ls3/y2;

    if-eqz v14, :cond_2

    invoke-virtual {v10, v12, v13}, Ls3/i1;->s0(J)V

    :cond_2
    iget-object v0, v10, Ls3/i1;->h:[Ls3/i3;

    array-length v0, v0

    new-array v0, v0, [Z

    const/4 v9, 0x0

    :goto_2
    iget-object v1, v10, Ls3/i1;->h:[Ls3/i3;

    array-length v2, v1

    if-ge v9, v2, :cond_5

    aget-object v1, v1, v9

    invoke-static {v1}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v2

    aput-boolean v2, v0, v9

    iget-object v2, v11, Ls3/a2;->c:[Lu4/m0;

    aget-object v2, v2, v9

    aget-boolean v3, v0, v9

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ls3/i3;->g()Lu4/m0;

    move-result-object v3

    if-eq v2, v3, :cond_3

    invoke-virtual {v10, v1}, Ls3/i1;->o(Ls3/i3;)V

    goto :goto_3

    :cond_3
    aget-boolean v2, v18, v9

    if-eqz v2, :cond_4

    iget-wide v2, v10, Ls3/i1;->S:J

    invoke-interface {v1, v2, v3}, Ls3/i3;->C(J)V

    :cond_4
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v10, v0}, Ls3/i1;->s([Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v0, v1}, Ls3/d2;->z(Ls3/a2;)Z

    iget-boolean v0, v1, Ls3/a2;->d:Z

    if-eqz v0, :cond_7

    iget-object v0, v1, Ls3/a2;->f:Ls3/b2;

    iget-wide v2, v0, Ls3/b2;->b:J

    iget-wide v4, v10, Ls3/i1;->S:J

    invoke-virtual {v1, v4, v5}, Ls3/a2;->y(J)J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-virtual {v1, v13, v2, v3, v4}, Ls3/a2;->a(Ln5/c0;JZ)J

    :cond_7
    :goto_4
    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Ls3/i1;->G(Z)V

    iget-object v0, v10, Ls3/i1;->E:Ls3/y2;

    iget v0, v0, Ls3/y2;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_8

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->V()V

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->m1()V

    iget-object v0, v10, Ls3/i1;->o:Lp5/n;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lp5/n;->f(I)Z

    :cond_8
    return-void

    :cond_9
    move v4, v9

    const/4 v5, 0x1

    if-ne v1, v2, :cond_a

    move v3, v4

    :cond_a
    invoke-virtual {v1}, Ls3/a2;->j()Ls3/a2;

    move-result-object v1

    goto/16 :goto_0

    :cond_b
    :goto_5
    return-void
.end method

.method public final declared-synchronized p1(Lh7/u;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/u<",
            "Ljava/lang/Boolean;",
            ">;J)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ls3/i1;->x:Lp5/d;

    invoke-interface {v0}, Lp5/d;->b()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    cmp-long v3, p2, v3

    if-lez v3, :cond_0

    :try_start_1
    iget-object v3, p0, Ls3/i1;->x:Lp5/d;

    invoke-interface {v3}, Lp5/d;->d()V

    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    const/4 p2, 0x1

    move v2, p2

    :goto_1
    :try_start_2
    iget-object p2, p0, Ls3/i1;->x:Lp5/d;

    invoke-interface {p2}, Lp5/d;->b()J

    move-result-wide p2

    sub-long p2, v0, p2

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final q(IZ)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ls3/i1;->h:[Ls3/i3;

    aget-object v1, v1, p1

    invoke-static {v1}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v2}, Ls3/d2;->q()Ls3/a2;

    move-result-object v2

    iget-object v3, v0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v3}, Ls3/d2;->p()Ls3/a2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_1

    move v9, v5

    goto :goto_0

    :cond_1
    move v9, v4

    :goto_0
    invoke-virtual {v2}, Ls3/a2;->o()Ln5/c0;

    move-result-object v3

    iget-object v6, v3, Ln5/c0;->b:[Ls3/k3;

    aget-object v6, v6, p1

    iget-object v3, v3, Ln5/c0;->c:[Ln5/s;

    aget-object v3, v3, p1

    invoke-static {v3}, Ls3/i1;->x(Ln5/s;)[Ls3/m1;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Ls3/i1;->c1()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Ls3/i1;->E:Ls3/y2;

    iget v3, v3, Ls3/y2;->e:I

    const/4 v8, 0x3

    if-ne v3, v8, :cond_2

    move v14, v5

    goto :goto_1

    :cond_2
    move v14, v4

    :goto_1
    if-nez p2, :cond_3

    if-eqz v14, :cond_3

    move v8, v5

    goto :goto_2

    :cond_3
    move v8, v4

    :goto_2
    iget v3, v0, Ls3/i1;->Q:I

    add-int/2addr v3, v5

    iput v3, v0, Ls3/i1;->Q:I

    iget-object v3, v0, Ls3/i1;->i:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v3, v2, Ls3/a2;->c:[Lu4/m0;

    aget-object v5, v3, p1

    iget-wide v10, v0, Ls3/i1;->S:J

    invoke-virtual {v2}, Ls3/a2;->m()J

    move-result-wide v12

    invoke-virtual {v2}, Ls3/a2;->l()J

    move-result-wide v15

    move-object v2, v1

    move-object v3, v6

    move-object v4, v7

    move-wide v6, v10

    move-wide v10, v12

    move-wide v12, v15

    invoke-interface/range {v2 .. v13}, Ls3/i3;->F(Ls3/k3;[Ls3/m1;Lu4/m0;JZZJJ)V

    const/16 v2, 0xb

    new-instance v3, Ls3/i1$a;

    invoke-direct {v3, v0}, Ls3/i1$a;-><init>(Ls3/i1;)V

    invoke-interface {v1, v2, v3}, Ls3/e3$b;->y(ILjava/lang/Object;)V

    iget-object v2, v0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v2, v1}, Ls3/l;->b(Ls3/i3;)V

    if-eqz v14, :cond_4

    invoke-interface {v1}, Ls3/i3;->start()V

    :cond_4
    return-void
.end method

.method public final q0(ZZZZ)V
    .locals 28

    move-object/from16 v1, p0

    iget-object v0, v1, Ls3/i1;->o:Lp5/n;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Lp5/n;->i(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Ls3/i1;->V:Ls3/q;

    const/4 v3, 0x0

    iput-boolean v3, v1, Ls3/i1;->J:Z

    iget-object v0, v1, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0}, Ls3/l;->g()V

    const-wide v4, 0xe8d4a51000L

    iput-wide v4, v1, Ls3/i1;->S:J

    iget-object v4, v1, Ls3/i1;->h:[Ls3/i3;

    array-length v5, v4

    move v6, v3

    :goto_0
    const-string v7, "ExoPlayerImplInternal"

    if-ge v6, v5, :cond_0

    aget-object v0, v4, v6

    :try_start_0
    invoke-virtual {v1, v0}, Ls3/i1;->o(Ls3/i3;)V
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    const-string v8, "Disable failed."

    invoke-static {v7, v8, v0}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    iget-object v4, v1, Ls3/i1;->h:[Ls3/i3;

    array-length v5, v4

    move v6, v3

    :goto_3
    if-ge v6, v5, :cond_2

    aget-object v0, v4, v6

    iget-object v8, v1, Ls3/i1;->i:Ljava/util/Set;

    invoke-interface {v8, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    :try_start_1
    invoke-interface {v0}, Ls3/i3;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v8, v0

    const-string v0, "Reset failed."

    invoke-static {v7, v0, v8}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_2
    iput v3, v1, Ls3/i1;->Q:I

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v4, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v5, v0, Ls3/y2;->r:J

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v7, v1, Ls3/i1;->s:Ls3/u3$b;

    invoke-static {v0, v7}, Ls3/i1;->S(Ls3/y2;Ls3/u3$b;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v0, Ls3/y2;->r:J

    goto :goto_6

    :cond_4
    :goto_5
    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-wide v7, v0, Ls3/y2;->c:J

    :goto_6
    if-eqz p2, :cond_5

    iput-object v2, v1, Ls3/i1;->R:Ls3/i1$h;

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v1, v0}, Ls3/i1;->A(Ls3/u3;)Landroid/util/Pair;

    move-result-object v0

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Lu4/t$b;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v4, v0}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_7

    :cond_5
    move v0, v3

    :goto_7
    move-object/from16 v17, v4

    move-wide/from16 v25, v5

    iget-object v4, v1, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v4}, Ls3/d2;->f()V

    iput-boolean v3, v1, Ls3/i1;->K:Z

    new-instance v3, Ls3/y2;

    iget-object v4, v1, Ls3/i1;->E:Ls3/y2;

    iget-object v5, v4, Ls3/y2;->a:Ls3/u3;

    iget v11, v4, Ls3/y2;->e:I

    if-eqz p4, :cond_6

    goto :goto_8

    :cond_6
    iget-object v2, v4, Ls3/y2;->f:Ls3/q;

    :goto_8
    move-object v12, v2

    const/4 v13, 0x0

    if-eqz v0, :cond_7

    sget-object v2, Lu4/u0;->k:Lu4/u0;

    goto :goto_9

    :cond_7
    iget-object v2, v4, Ls3/y2;->h:Lu4/u0;

    :goto_9
    move-object v14, v2

    if-eqz v0, :cond_8

    iget-object v2, v1, Ls3/i1;->l:Ln5/c0;

    goto :goto_a

    :cond_8
    iget-object v2, v4, Ls3/y2;->i:Ln5/c0;

    :goto_a
    move-object v15, v2

    if-eqz v0, :cond_9

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    goto :goto_b

    :cond_9
    iget-object v0, v4, Ls3/y2;->j:Ljava/util/List;

    :goto_b
    move-object/from16 v16, v0

    iget-object v0, v1, Ls3/i1;->E:Ls3/y2;

    iget-boolean v2, v0, Ls3/y2;->l:Z

    move/from16 v18, v2

    iget v2, v0, Ls3/y2;->m:I

    move/from16 v19, v2

    iget-object v0, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v20, v0

    const-wide/16 v23, 0x0

    const/16 v27, 0x0

    move-object v4, v3

    move-object/from16 v6, v17

    move-wide/from16 v9, v25

    move-wide/from16 v21, v25

    invoke-direct/range {v4 .. v27}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    iput-object v3, v1, Ls3/i1;->E:Ls3/y2;

    if-eqz p3, :cond_a

    iget-object v0, v1, Ls3/i1;->A:Ls3/s2;

    invoke-virtual {v0}, Ls3/s2;->y()V

    :cond_a
    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v0, v0

    new-array v0, v0, [Z

    invoke-virtual {p0, v0}, Ls3/i1;->s([Z)V

    return-void
.end method

.method public final r0()V
    .locals 1

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls3/a2;->f:Ls3/b2;

    iget-boolean v0, v0, Ls3/b2;->h:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ls3/i1;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ls3/i1;->I:Z

    return-void
.end method

.method public final s([Z)V
    .locals 6

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    invoke-virtual {v0}, Ls3/a2;->o()Ln5/c0;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v4, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Ln5/c0;->c(I)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Ls3/i1;->i:Ljava/util/Set;

    iget-object v5, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v5, v5, v3

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v4, v4, v3

    invoke-interface {v4}, Ls3/i3;->reset()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v3, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v3, v3

    if-ge v2, v3, :cond_3

    invoke-virtual {v1, v2}, Ln5/c0;->c(I)Z

    move-result v3

    if-eqz v3, :cond_2

    aget-boolean v3, p1, v2

    invoke-virtual {p0, v2, v3}, Ls3/i1;->q(IZ)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    iput-boolean p1, v0, Ls3/a2;->g:Z

    return-void
.end method

.method public final s0(J)V
    .locals 4

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->p()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide v0, 0xe8d4a51000L

    add-long/2addr p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Ls3/a2;->z(J)J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Ls3/i1;->S:J

    iget-object v0, p0, Ls3/i1;->v:Ls3/l;

    invoke-virtual {v0, p1, p2}, Ls3/l;->c(J)V

    iget-object p1, p0, Ls3/i1;->h:[Ls3/i3;

    array-length p2, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_2

    aget-object v1, p1, v0

    invoke-static {v1}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Ls3/i1;->S:J

    invoke-interface {v1, v2, v3}, Ls3/i3;->C(J)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ls3/i1;->e0()V

    return-void
.end method

.method public final t(Ls3/i3;)V
    .locals 2

    invoke-interface {p1}, Ls3/i3;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ls3/i3;->stop()V

    :cond_0
    return-void
.end method

.method public u(J)V
    .locals 0

    iput-wide p1, p0, Ls3/i1;->W:J

    return-void
.end method

.method public final v([Ln5/s;)Li7/u;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ln5/s;",
            ")",
            "Li7/u<",
            "Lk4/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Li7/u$a;

    invoke-direct {v0}, Li7/u$a;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v5, p1, v3

    if-eqz v5, :cond_1

    invoke-interface {v5, v2}, Ln5/v;->c(I)Ls3/m1;

    move-result-object v5

    iget-object v5, v5, Ls3/m1;->q:Lk4/a;

    if-nez v5, :cond_0

    new-instance v5, Lk4/a;

    new-array v6, v2, [Lk4/a$b;

    invoke-direct {v5, v6}, Lk4/a;-><init>([Lk4/a$b;)V

    invoke-virtual {v0, v5}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v5}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    const/4 v4, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final v0(Ls3/u3;Ls3/u3;)V
    .locals 9

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    iget-object v1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls3/i1$d;

    iget v5, p0, Ls3/i1;->L:I

    iget-boolean v6, p0, Ls3/i1;->M:Z

    iget-object v7, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-object v8, p0, Ls3/i1;->s:Ls3/u3$b;

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v2 .. v8}, Ls3/i1;->u0(Ls3/i1$d;Ls3/u3;Ls3/u3;IZLs3/u3$d;Ls3/u3$b;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/i1$d;

    iget-object v1, v1, Ls3/i1$d;->h:Ls3/e3;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ls3/e3;->k(Z)V

    iget-object v1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ls3/i1;->w:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method public final w()J
    .locals 5

    iget-object v0, p0, Ls3/i1;->E:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v2, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    iget-wide v3, v0, Ls3/y2;->r:J

    invoke-virtual {p0, v1, v2, v3, v4}, Ls3/i1;->y(Ls3/u3;Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final y(Ls3/u3;Ljava/lang/Object;J)J
    .locals 4

    iget-object v0, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {p1, p2, v0}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object p2

    iget p2, p2, Ls3/u3$b;->j:I

    iget-object v0, p0, Ls3/i1;->r:Ls3/u3$d;

    invoke-virtual {p1, p2, v0}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    iget-object p1, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-wide v0, p1, Ls3/u3$d;->m:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ls3/u3$d;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-boolean p2, p1, Ls3/u3$d;->p:Z

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ls3/u3$d;->c()J

    move-result-wide p1

    iget-object v0, p0, Ls3/i1;->r:Ls3/u3$d;

    iget-wide v0, v0, Ls3/u3$d;->m:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Lp5/n0;->B0(J)J

    move-result-wide p1

    iget-object v0, p0, Ls3/i1;->s:Ls3/u3$b;

    invoke-virtual {v0}, Ls3/u3$b;->q()J

    move-result-wide v0

    add-long/2addr p3, v0

    sub-long/2addr p1, p3

    return-wide p1

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final z()J
    .locals 9

    iget-object v0, p0, Ls3/i1;->z:Ls3/d2;

    invoke-virtual {v0}, Ls3/d2;->q()Ls3/a2;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ls3/a2;->l()J

    move-result-wide v1

    iget-boolean v3, v0, Ls3/a2;->d:Z

    if-nez v3, :cond_1

    return-wide v1

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Ls3/i1;->h:[Ls3/i3;

    array-length v5, v4

    if-ge v3, v5, :cond_5

    aget-object v4, v4, v3

    invoke-static {v4}, Ls3/i1;->Q(Ls3/i3;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v4, v4, v3

    invoke-interface {v4}, Ls3/i3;->g()Lu4/m0;

    move-result-object v4

    iget-object v5, v0, Ls3/a2;->c:[Lu4/m0;

    aget-object v5, v5, v3

    if-eq v4, v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Ls3/i1;->h:[Ls3/i3;

    aget-object v4, v4, v3

    invoke-interface {v4}, Ls3/i3;->B()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-nez v8, :cond_3

    return-wide v6

    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-wide v1
.end method

.method public final z0(JJ)V
    .locals 1

    iget-object v0, p0, Ls3/i1;->o:Lp5/n;

    add-long/2addr p1, p3

    const/4 p3, 0x2

    invoke-interface {v0, p3, p1, p2}, Lp5/n;->h(IJ)Z

    return-void
.end method
