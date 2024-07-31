.class public final Ls3/w0;
.super Ls3/e;
.source ""

# interfaces
.implements Ls3/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/w0$b;,
        Ls3/w0$d;,
        Ls3/w0$c;,
        Ls3/w0$e;
    }
.end annotation


# instance fields
.field public final A:Ls3/d;

.field public final B:Ls3/p3;

.field public final C:Ls3/a4;

.field public final D:Ls3/b4;

.field public final E:J

.field public F:I

.field public G:Z

.field public H:I

.field public I:I

.field public J:Z

.field public K:I

.field public L:Ls3/m3;

.field public M:Lu4/o0;

.field public N:Z

.field public O:Ls3/b3$b;

.field public P:Ls3/z1;

.field public Q:Ls3/z1;

.field public R:Ls3/m1;

.field public S:Ls3/m1;

.field public T:Landroid/media/AudioTrack;

.field public U:Ljava/lang/Object;

.field public V:Landroid/view/Surface;

.field public W:Landroid/view/SurfaceHolder;

.field public X:Lr5/f;

.field public Y:Z

.field public Z:Landroid/view/TextureView;

.field public a0:I

.field public final b:Ln5/c0;

.field public b0:I

.field public final c:Ls3/b3$b;

.field public c0:Lp5/d0;

.field public final d:Lp5/g;

.field public d0:Lv3/e;

.field public final e:Landroid/content/Context;

.field public e0:Lv3/e;

.field public final f:Ls3/b3;

.field public f0:I

.field public final g:[Ls3/i3;

.field public g0:Lu3/e;

.field public final h:Ln5/b0;

.field public h0:F

.field public final i:Lp5/n;

.field public i0:Z

.field public final j:Ls3/i1$f;

.field public j0:Ld5/e;

.field public final k:Ls3/i1;

.field public k0:Z

.field public final l:Lp5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/q<",
            "Ls3/b3$d;",
            ">;"
        }
    .end annotation
.end field

.field public l0:Z

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ls3/r$a;",
            ">;"
        }
    .end annotation
.end field

.field public m0:Lp5/c0;

.field public final n:Ls3/u3$b;

.field public n0:Z

.field public final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/w0$e;",
            ">;"
        }
    .end annotation
.end field

.field public o0:Z

.field public final p:Z

.field public p0:Ls3/o;

.field public final q:Lu4/t$a;

.field public q0:Lq5/y;

.field public final r:Lt3/a;

.field public r0:Ls3/z1;

.field public final s:Landroid/os/Looper;

.field public s0:Ls3/y2;

.field public final t:Lo5/e;

.field public t0:I

.field public final u:J

.field public u0:I

.field public final v:J

.field public v0:J

.field public final w:Lp5/d;

.field public final x:Ls3/w0$c;

.field public final y:Ls3/w0$d;

.field public final z:Ls3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.exoplayer"

    invoke-static {v0}, Ls3/j1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ls3/r$b;Ls3/b3;)V
    .locals 38
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-direct/range {p0 .. p0}, Ls3/e;-><init>()V

    new-instance v2, Lp5/g;

    invoke-direct {v2}, Lp5/g;-><init>()V

    iput-object v2, v1, Ls3/w0;->d:Lp5/g;

    :try_start_0
    const-string v3, "ExoPlayerImpl"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Init "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "ExoPlayerLib/2.18.7"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lp5/n0;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lp5/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Ls3/r$b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v1, Ls3/w0;->e:Landroid/content/Context;

    iget-object v4, v0, Ls3/r$b;->i:Lh7/g;

    iget-object v5, v0, Ls3/r$b;->b:Lp5/d;

    invoke-interface {v4, v5}, Lh7/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt3/a;

    iput-object v4, v1, Ls3/w0;->r:Lt3/a;

    iget-object v5, v0, Ls3/r$b;->k:Lp5/c0;

    iput-object v5, v1, Ls3/w0;->m0:Lp5/c0;

    iget-object v5, v0, Ls3/r$b;->l:Lu3/e;

    iput-object v5, v1, Ls3/w0;->g0:Lu3/e;

    iget v5, v0, Ls3/r$b;->q:I

    iput v5, v1, Ls3/w0;->a0:I

    iget v5, v0, Ls3/r$b;->r:I

    iput v5, v1, Ls3/w0;->b0:I

    iget-boolean v5, v0, Ls3/r$b;->p:Z

    iput-boolean v5, v1, Ls3/w0;->i0:Z

    iget-wide v5, v0, Ls3/r$b;->y:J

    iput-wide v5, v1, Ls3/w0;->E:J

    new-instance v15, Ls3/w0$c;

    const/4 v14, 0x0

    invoke-direct {v15, v1, v14}, Ls3/w0$c;-><init>(Ls3/w0;Ls3/w0$a;)V

    iput-object v15, v1, Ls3/w0;->x:Ls3/w0$c;

    new-instance v13, Ls3/w0$d;

    invoke-direct {v13, v14}, Ls3/w0$d;-><init>(Ls3/w0$a;)V

    iput-object v13, v1, Ls3/w0;->y:Ls3/w0$d;

    new-instance v6, Landroid/os/Handler;

    iget-object v5, v0, Ls3/r$b;->j:Landroid/os/Looper;

    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Ls3/r$b;->d:Lh7/u;

    invoke-interface {v5}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ls3/l3;

    move-object v8, v6

    move-object v9, v15

    move-object v10, v15

    move-object v11, v15

    move-object v12, v15

    invoke-interface/range {v7 .. v12}, Ls3/l3;->a(Landroid/os/Handler;Lq5/w;Lu3/s;Ld5/n;Lk4/e;)[Ls3/i3;

    move-result-object v7

    iput-object v7, v1, Ls3/w0;->g:[Ls3/i3;

    array-length v5, v7

    const/4 v12, 0x0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v12

    :goto_0
    invoke-static {v5}, Lp5/a;->f(Z)V

    iget-object v5, v0, Ls3/r$b;->f:Lh7/u;

    invoke-interface {v5}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ln5/b0;

    iput-object v10, v1, Ls3/w0;->h:Ln5/b0;

    iget-object v5, v0, Ls3/r$b;->e:Lh7/u;

    invoke-interface {v5}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu4/t$a;

    iput-object v5, v1, Ls3/w0;->q:Lu4/t$a;

    iget-object v5, v0, Ls3/r$b;->h:Lh7/u;

    invoke-interface {v5}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lo5/e;

    iput-object v9, v1, Ls3/w0;->t:Lo5/e;

    iget-boolean v5, v0, Ls3/r$b;->s:Z

    iput-boolean v5, v1, Ls3/w0;->p:Z

    iget-object v5, v0, Ls3/r$b;->t:Ls3/m3;

    iput-object v5, v1, Ls3/w0;->L:Ls3/m3;

    move-object/from16 v16, v15

    iget-wide v14, v0, Ls3/r$b;->u:J

    iput-wide v14, v1, Ls3/w0;->u:J

    iget-wide v14, v0, Ls3/r$b;->v:J

    iput-wide v14, v1, Ls3/w0;->v:J

    iget-boolean v5, v0, Ls3/r$b;->z:Z

    iput-boolean v5, v1, Ls3/w0;->N:Z

    iget-object v15, v0, Ls3/r$b;->j:Landroid/os/Looper;

    iput-object v15, v1, Ls3/w0;->s:Landroid/os/Looper;

    iget-object v14, v0, Ls3/r$b;->b:Lp5/d;

    iput-object v14, v1, Ls3/w0;->w:Lp5/d;

    if-nez p2, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    iput-object v5, v1, Ls3/w0;->f:Ls3/b3;

    new-instance v8, Lp5/q;

    new-instance v11, Ls3/m0;

    invoke-direct {v11, v1}, Ls3/m0;-><init>(Ls3/w0;)V

    invoke-direct {v8, v15, v14, v11}, Lp5/q;-><init>(Landroid/os/Looper;Lp5/d;Lp5/q$b;)V

    iput-object v8, v1, Ls3/w0;->l:Lp5/q;

    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Ls3/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Ls3/w0;->o:Ljava/util/List;

    new-instance v8, Lu4/o0$a;

    invoke-direct {v8, v12}, Lu4/o0$a;-><init>(I)V

    iput-object v8, v1, Ls3/w0;->M:Lu4/o0;

    new-instance v8, Ln5/c0;

    array-length v11, v7

    new-array v11, v11, [Ls3/k3;

    array-length v12, v7

    new-array v12, v12, [Ln5/s;

    move-object/from16 v20, v6

    sget-object v6, Ls3/z3;->i:Ls3/z3;

    move-object/from16 v21, v9

    const/4 v9, 0x0

    invoke-direct {v8, v11, v12, v6, v9}, Ln5/c0;-><init>([Ls3/k3;[Ln5/s;Ls3/z3;Ljava/lang/Object;)V

    iput-object v8, v1, Ls3/w0;->b:Ln5/c0;

    new-instance v6, Ls3/u3$b;

    invoke-direct {v6}, Ls3/u3$b;-><init>()V

    iput-object v6, v1, Ls3/w0;->n:Ls3/u3$b;

    new-instance v6, Ls3/b3$b$a;

    invoke-direct {v6}, Ls3/b3$b$a;-><init>()V

    const/16 v12, 0x15

    new-array v9, v12, [I

    const/4 v11, 0x1

    const/16 v18, 0x0

    aput v11, v9, v18

    const/4 v12, 0x2

    aput v12, v9, v11

    move-object/from16 v24, v2

    const/4 v2, 0x3

    aput v2, v9, v12

    const/16 v19, 0xd

    aput v19, v9, v2

    const/16 v22, 0xe

    const/4 v2, 0x4

    aput v22, v9, v2

    const/16 v23, 0xf

    const/4 v2, 0x5

    aput v23, v9, v2

    const/16 v25, 0x10

    const/4 v2, 0x6

    aput v25, v9, v2

    const/16 v26, 0x11

    const/4 v2, 0x7

    aput v26, v9, v2

    const/16 v27, 0x12

    const/16 v2, 0x8

    aput v27, v9, v2

    const/16 v28, 0x13

    const/16 v2, 0x9

    aput v28, v9, v2

    const/16 v11, 0x1f

    const/16 v2, 0xa

    aput v11, v9, v2

    const/16 v29, 0xb

    const/16 v30, 0x14

    aput v30, v9, v29

    const/16 v29, 0xc

    const/16 v31, 0x1e

    aput v31, v9, v29

    const/16 v29, 0x15

    aput v29, v9, v19

    const/16 v19, 0x16

    aput v19, v9, v22

    const/16 v19, 0x17

    aput v19, v9, v23

    const/16 v19, 0x18

    aput v19, v9, v25

    const/16 v19, 0x19

    aput v19, v9, v26

    const/16 v19, 0x1a

    aput v19, v9, v27

    const/16 v19, 0x1b

    aput v19, v9, v28

    const/16 v19, 0x1c

    aput v19, v9, v30

    invoke-virtual {v6, v9}, Ls3/b3$b$a;->c([I)Ls3/b3$b$a;

    move-result-object v6

    const/16 v9, 0x1d

    invoke-virtual {v10}, Ln5/b0;->d()Z

    move-result v12

    invoke-virtual {v6, v9, v12}, Ls3/b3$b$a;->d(IZ)Ls3/b3$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ls3/b3$b$a;->e()Ls3/b3$b;

    move-result-object v6

    iput-object v6, v1, Ls3/w0;->c:Ls3/b3$b;

    new-instance v9, Ls3/b3$b$a;

    invoke-direct {v9}, Ls3/b3$b$a;-><init>()V

    invoke-virtual {v9, v6}, Ls3/b3$b$a;->b(Ls3/b3$b;)Ls3/b3$b$a;

    move-result-object v6

    const/4 v9, 0x4

    invoke-virtual {v6, v9}, Ls3/b3$b$a;->a(I)Ls3/b3$b$a;

    move-result-object v6

    invoke-virtual {v6, v2}, Ls3/b3$b$a;->a(I)Ls3/b3$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ls3/b3$b$a;->e()Ls3/b3$b;

    move-result-object v6

    iput-object v6, v1, Ls3/w0;->O:Ls3/b3$b;

    const/4 v12, 0x0

    invoke-interface {v14, v15, v12}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object v6

    iput-object v6, v1, Ls3/w0;->i:Lp5/n;

    new-instance v9, Ls3/n0;

    invoke-direct {v9, v1}, Ls3/n0;-><init>(Ls3/w0;)V

    iput-object v9, v1, Ls3/w0;->j:Ls3/i1$f;

    invoke-static {v8}, Ls3/y2;->j(Ln5/c0;)Ls3/y2;

    move-result-object v6

    iput-object v6, v1, Ls3/w0;->s0:Ls3/y2;

    invoke-interface {v4, v5, v15}, Lt3/a;->D(Ls3/b3;Landroid/os/Looper;)V

    sget v6, Lp5/n0;->a:I

    if-ge v6, v11, :cond_2

    new-instance v5, Lt3/s1;

    invoke-direct {v5}, Lt3/s1;-><init>()V

    goto :goto_2

    :cond_2
    iget-boolean v5, v0, Ls3/r$b;->A:Z

    invoke-static {v3, v1, v5}, Ls3/w0$b;->a(Landroid/content/Context;Ls3/w0;Z)Lt3/s1;

    move-result-object v5

    :goto_2
    move-object/from16 v22, v5

    new-instance v11, Ls3/i1;

    iget-object v5, v0, Ls3/r$b;->g:Lh7/u;

    invoke-interface {v5}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Ls3/s1;

    iget v5, v1, Ls3/w0;->F:I

    iget-boolean v12, v1, Ls3/w0;->G:Z

    iget-object v2, v1, Ls3/w0;->L:Ls3/m3;

    move-object/from16 v23, v15

    iget-object v15, v0, Ls3/r$b;->w:Ls3/r1;

    move-object/from16 v27, v2

    move-object/from16 v26, v3

    iget-wide v2, v0, Ls3/r$b;->x:J

    move-wide/from16 v30, v2

    iget-boolean v2, v1, Ls3/w0;->N:Z

    iget-object v3, v0, Ls3/r$b;->B:Landroid/os/Looper;

    move/from16 v28, v5

    move-object v5, v11

    move v0, v6

    move-object/from16 v32, v20

    move-object v6, v7

    move-object v7, v10

    move-object/from16 v33, v21

    move-object/from16 v21, v9

    move-object/from16 v9, v17

    move-object/from16 v34, v10

    move-object/from16 v10, v33

    move/from16 v35, v0

    move-object v0, v11

    move/from16 v11, v28

    const/16 v17, 0x0

    move-object/from16 v36, v13

    move-object v13, v4

    move-object/from16 v20, v14

    move-object/from16 v28, v17

    move-object/from16 v14, v27

    move-object/from16 v37, v16

    move-object/from16 p2, v23

    move-wide/from16 v16, v30

    move/from16 v18, v2

    move-object/from16 v19, p2

    move-object/from16 v23, v3

    invoke-direct/range {v5 .. v23}, Ls3/i1;-><init>([Ls3/i3;Ln5/b0;Ln5/c0;Ls3/s1;Lo5/e;IZLt3/a;Ls3/m3;Ls3/r1;JZLandroid/os/Looper;Lp5/d;Ls3/i1$f;Lt3/s1;Landroid/os/Looper;)V

    iput-object v0, v1, Ls3/w0;->k:Ls3/i1;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Ls3/w0;->h0:F

    const/4 v2, 0x0

    iput v2, v1, Ls3/w0;->F:I

    sget-object v3, Ls3/z1;->P:Ls3/z1;

    iput-object v3, v1, Ls3/w0;->P:Ls3/z1;

    iput-object v3, v1, Ls3/w0;->Q:Ls3/z1;

    iput-object v3, v1, Ls3/w0;->r0:Ls3/z1;

    const/4 v3, -0x1

    iput v3, v1, Ls3/w0;->t0:I

    move/from16 v3, v35

    const/16 v5, 0x15

    if-ge v3, v5, :cond_3

    invoke-virtual {v1, v2}, Ls3/w0;->j1(I)I

    move-result v3

    :goto_3
    iput v3, v1, Ls3/w0;->f0:I

    goto :goto_4

    :cond_3
    invoke-static/range {v26 .. v26}, Lp5/n0;->F(Landroid/content/Context;)I

    move-result v3

    goto :goto_3

    :goto_4
    sget-object v3, Ld5/e;->j:Ld5/e;

    iput-object v3, v1, Ls3/w0;->j0:Ld5/e;

    const/4 v3, 0x1

    iput-boolean v3, v1, Ls3/w0;->k0:Z

    invoke-virtual {v1, v4}, Ls3/w0;->o(Ls3/b3$d;)V

    new-instance v5, Landroid/os/Handler;

    move-object/from16 v6, p2

    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v6, v33

    invoke-interface {v6, v5, v4}, Lo5/e;->h(Landroid/os/Handler;Lo5/e$a;)V

    move-object/from16 v4, v37

    invoke-virtual {v1, v4}, Ls3/w0;->Q0(Ls3/r$a;)V

    move-object/from16 v5, p1

    iget-wide v6, v5, Ls3/r$b;->c:J

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-lez v8, :cond_4

    invoke-virtual {v0, v6, v7}, Ls3/i1;->u(J)V

    :cond_4
    new-instance v0, Ls3/b;

    iget-object v6, v5, Ls3/r$b;->a:Landroid/content/Context;

    move-object/from16 v7, v32

    invoke-direct {v0, v6, v7, v4}, Ls3/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls3/b$b;)V

    iput-object v0, v1, Ls3/w0;->z:Ls3/b;

    iget-boolean v6, v5, Ls3/r$b;->o:Z

    invoke-virtual {v0, v6}, Ls3/b;->b(Z)V

    new-instance v0, Ls3/d;

    iget-object v6, v5, Ls3/r$b;->a:Landroid/content/Context;

    invoke-direct {v0, v6, v7, v4}, Ls3/d;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls3/d$b;)V

    iput-object v0, v1, Ls3/w0;->A:Ls3/d;

    iget-boolean v6, v5, Ls3/r$b;->m:Z

    if-eqz v6, :cond_5

    iget-object v14, v1, Ls3/w0;->g0:Lu3/e;

    goto :goto_5

    :cond_5
    move-object/from16 v14, v28

    :goto_5
    invoke-virtual {v0, v14}, Ls3/d;->m(Lu3/e;)V

    new-instance v0, Ls3/p3;

    iget-object v6, v5, Ls3/r$b;->a:Landroid/content/Context;

    invoke-direct {v0, v6, v7, v4}, Ls3/p3;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls3/p3$b;)V

    iput-object v0, v1, Ls3/w0;->B:Ls3/p3;

    iget-object v4, v1, Ls3/w0;->g0:Lu3/e;

    iget v4, v4, Lu3/e;->j:I

    invoke-static {v4}, Lp5/n0;->f0(I)I

    move-result v4

    invoke-virtual {v0, v4}, Ls3/p3;->h(I)V

    new-instance v4, Ls3/a4;

    iget-object v6, v5, Ls3/r$b;->a:Landroid/content/Context;

    invoke-direct {v4, v6}, Ls3/a4;-><init>(Landroid/content/Context;)V

    iput-object v4, v1, Ls3/w0;->C:Ls3/a4;

    iget v6, v5, Ls3/r$b;->n:I

    if-eqz v6, :cond_6

    move v12, v3

    goto :goto_6

    :cond_6
    move v12, v2

    :goto_6
    invoke-virtual {v4, v12}, Ls3/a4;->a(Z)V

    new-instance v4, Ls3/b4;

    iget-object v6, v5, Ls3/r$b;->a:Landroid/content/Context;

    invoke-direct {v4, v6}, Ls3/b4;-><init>(Landroid/content/Context;)V

    iput-object v4, v1, Ls3/w0;->D:Ls3/b4;

    iget v5, v5, Ls3/r$b;->n:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_7

    move v12, v3

    goto :goto_7

    :cond_7
    move v12, v2

    :goto_7
    invoke-virtual {v4, v12}, Ls3/b4;->a(Z)V

    invoke-static {v0}, Ls3/w0;->T0(Ls3/p3;)Ls3/o;

    move-result-object v0

    iput-object v0, v1, Ls3/w0;->p0:Ls3/o;

    sget-object v0, Lq5/y;->l:Lq5/y;

    iput-object v0, v1, Ls3/w0;->q0:Lq5/y;

    sget-object v0, Lp5/d0;->c:Lp5/d0;

    iput-object v0, v1, Ls3/w0;->c0:Lp5/d0;

    iget-object v0, v1, Ls3/w0;->g0:Lu3/e;

    move-object/from16 v5, v34

    invoke-virtual {v5, v0}, Ln5/b0;->h(Lu3/e;)V

    iget v0, v1, Ls3/w0;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    invoke-virtual {v1, v3, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget v0, v1, Ls3/w0;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v6, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget-object v0, v1, Ls3/w0;->g0:Lu3/e;

    const/4 v2, 0x3

    invoke-virtual {v1, v3, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget v0, v1, Ls3/w0;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v1, v6, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget v0, v1, Ls3/w0;->b0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {v1, v6, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget-boolean v0, v1, Ls3/w0;->i0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    invoke-virtual {v1, v3, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    move-object/from16 v0, v36

    const/4 v2, 0x7

    invoke-virtual {v1, v6, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    const/16 v2, 0x8

    const/4 v3, 0x6

    invoke-virtual {v1, v3, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {v24 .. v24}, Lp5/g;->e()Z

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Ls3/w0;->d:Lp5/g;

    invoke-virtual {v2}, Lp5/g;->e()Z

    throw v0
.end method

.method public static synthetic A0(Ls3/w0;)V
    .locals 0

    invoke-virtual {p0}, Ls3/w0;->Q1()V

    return-void
.end method

.method public static synthetic A1(Ls3/z1;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onMediaMetadataChanged(Ls3/z1;)V

    return-void
.end method

.method public static synthetic B0(ZI)I
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->d1(ZI)I

    move-result p0

    return p0
.end method

.method public static synthetic B1(Ls3/y2;Ls3/b3$d;)V
    .locals 1

    iget-boolean v0, p0, Ls3/y2;->g:Z

    invoke-interface {p1, v0}, Ls3/b3$d;->onLoadingChanged(Z)V

    iget-boolean p0, p0, Ls3/y2;->g:Z

    invoke-interface {p1, p0}, Ls3/b3$d;->onIsLoadingChanged(Z)V

    return-void
.end method

.method public static synthetic C0(Ls3/w0;ZII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ls3/w0;->Z1(ZII)V

    return-void
.end method

.method public static synthetic C1(Ls3/y2;Ls3/b3$d;)V
    .locals 1

    iget-boolean v0, p0, Ls3/y2;->l:Z

    iget p0, p0, Ls3/y2;->e:I

    invoke-interface {p1, v0, p0}, Ls3/b3$d;->onPlayerStateChanged(ZI)V

    return-void
.end method

.method public static synthetic D0(Ls3/w0;)Ls3/p3;
    .locals 0

    iget-object p0, p0, Ls3/w0;->B:Ls3/p3;

    return-object p0
.end method

.method public static synthetic D1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget p0, p0, Ls3/y2;->e:I

    invoke-interface {p1, p0}, Ls3/b3$d;->onPlaybackStateChanged(I)V

    return-void
.end method

.method public static synthetic E0(Ls3/p3;)Ls3/o;
    .locals 0

    invoke-static {p0}, Ls3/w0;->T0(Ls3/p3;)Ls3/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E1(Ls3/y2;ILs3/b3$d;)V
    .locals 0

    iget-boolean p0, p0, Ls3/y2;->l:Z

    invoke-interface {p2, p0, p1}, Ls3/b3$d;->onPlayWhenReadyChanged(ZI)V

    return-void
.end method

.method public static synthetic F0(Ls3/w0;)Ls3/o;
    .locals 0

    iget-object p0, p0, Ls3/w0;->p0:Ls3/o;

    return-object p0
.end method

.method public static synthetic F1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget p0, p0, Ls3/y2;->m:I

    invoke-interface {p1, p0}, Ls3/b3$d;->onPlaybackSuppressionReasonChanged(I)V

    return-void
.end method

.method public static synthetic G0(Ls3/w0;Ls3/o;)Ls3/o;
    .locals 0

    iput-object p1, p0, Ls3/w0;->p0:Ls3/o;

    return-object p1
.end method

.method public static synthetic G1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0}, Ls3/w0;->k1(Ls3/y2;)Z

    move-result p0

    invoke-interface {p1, p0}, Ls3/b3$d;->onIsPlayingChanged(Z)V

    return-void
.end method

.method public static synthetic H0(Ls3/w0;)V
    .locals 0

    invoke-virtual {p0}, Ls3/w0;->c2()V

    return-void
.end method

.method public static synthetic H1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget-object p0, p0, Ls3/y2;->n:Ls3/a3;

    invoke-interface {p1, p0}, Ls3/b3$d;->onPlaybackParametersChanged(Ls3/a3;)V

    return-void
.end method

.method public static synthetic I0(Ls3/w0;Lv3/e;)Lv3/e;
    .locals 0

    iput-object p1, p0, Ls3/w0;->d0:Lv3/e;

    return-object p1
.end method

.method public static synthetic J0(Ls3/w0;)Lt3/a;
    .locals 0

    iget-object p0, p0, Ls3/w0;->r:Lt3/a;

    return-object p0
.end method

.method public static synthetic K0(Ls3/w0;Ls3/m1;)Ls3/m1;
    .locals 0

    iput-object p1, p0, Ls3/w0;->R:Ls3/m1;

    return-object p1
.end method

.method public static synthetic L0(Ls3/w0;Lq5/y;)Lq5/y;
    .locals 0

    iput-object p1, p0, Ls3/w0;->q0:Lq5/y;

    return-object p1
.end method

.method public static synthetic M0(Ls3/w0;)Lp5/q;
    .locals 0

    iget-object p0, p0, Ls3/w0;->l:Lp5/q;

    return-object p0
.end method

.method public static synthetic N0(Ls3/w0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ls3/w0;->U:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic O0(Ls3/w0;Lv3/e;)Lv3/e;
    .locals 0

    iput-object p1, p0, Ls3/w0;->e0:Lv3/e;

    return-object p1
.end method

.method public static synthetic Q(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->x1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic R(Ls3/w0;Ls3/b3$d;Lp5/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/w0;->m1(Ls3/b3$d;Lp5/l;)V

    return-void
.end method

.method public static synthetic S(FLs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->s1(FLs3/b3$d;)V

    return-void
.end method

.method public static synthetic T(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->D1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static T0(Ls3/p3;)Ls3/o;
    .locals 3

    new-instance v0, Ls3/o;

    invoke-virtual {p0}, Ls3/p3;->d()I

    move-result v1

    invoke-virtual {p0}, Ls3/p3;->c()I

    move-result p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0}, Ls3/o;-><init>(III)V

    return-object v0
.end method

.method public static synthetic U(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->z1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic V(IILs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls3/w0;->l1(IILs3/b3$d;)V

    return-void
.end method

.method public static synthetic W(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->F1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic X(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->H1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic Y(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->G1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic Z(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->y1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic a0(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->C1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic b0(Ls3/w0;Ls3/i1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/w0;->o1(Ls3/i1$e;)V

    return-void
.end method

.method public static synthetic c0(ILs3/b3$e;Ls3/b3$e;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls3/w0;->v1(ILs3/b3$e;Ls3/b3$e;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic d0(Lu3/e;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->q1(Lu3/e;Ls3/b3$d;)V

    return-void
.end method

.method public static d1(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method public static synthetic e0(Ls3/z1;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->A1(Ls3/z1;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic f0(Ls3/w0;Ls3/b3$d;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/w0;->t1(Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic g0(ILs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->r1(ILs3/b3$d;)V

    return-void
.end method

.method public static synthetic h0(Ls3/u1;ILs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls3/w0;->w1(Ls3/u1;ILs3/b3$d;)V

    return-void
.end method

.method public static h1(Ls3/y2;)J
    .locals 6

    new-instance v0, Ls3/u3$d;

    invoke-direct {v0}, Ls3/u3$d;-><init>()V

    new-instance v1, Ls3/u3$b;

    invoke-direct {v1}, Ls3/u3$b;-><init>()V

    iget-object v2, p0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, p0, Ls3/y2;->b:Lu4/t$b;

    iget-object v3, v3, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-wide v2, p0, Ls3/y2;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object p0, p0, Ls3/y2;->a:Ls3/u3;

    iget v1, v1, Ls3/u3$b;->j:I

    invoke-virtual {p0, v1, v0}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object p0

    invoke-virtual {p0}, Ls3/u3$d;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ls3/u3$b;->q()J

    move-result-wide v0

    iget-wide v2, p0, Ls3/y2;->c:J

    add-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public static synthetic i0(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0;->B1(Ls3/y2;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic j0(Ls3/y2;ILs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls3/w0;->u1(Ls3/y2;ILs3/b3$d;)V

    return-void
.end method

.method public static synthetic k0(Ls3/b3$d;)V
    .locals 0

    invoke-static {p0}, Ls3/w0;->p1(Ls3/b3$d;)V

    return-void
.end method

.method public static k1(Ls3/y2;)Z
    .locals 2

    iget v0, p0, Ls3/y2;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ls3/y2;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Ls3/y2;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic l0(Ls3/w0;Ls3/i1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/w0;->n1(Ls3/i1$e;)V

    return-void
.end method

.method public static synthetic l1(IILs3/b3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls3/b3$d;->onSurfaceSizeChanged(II)V

    return-void
.end method

.method public static synthetic m0(Ls3/y2;ILs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls3/w0;->E1(Ls3/y2;ILs3/b3$d;)V

    return-void
.end method

.method private synthetic m1(Ls3/b3$d;Lp5/l;)V
    .locals 2

    iget-object v0, p0, Ls3/w0;->f:Ls3/b3;

    new-instance v1, Ls3/b3$c;

    invoke-direct {v1, p2}, Ls3/b3$c;-><init>(Lp5/l;)V

    invoke-interface {p1, v0, v1}, Ls3/b3$d;->onEvents(Ls3/b3;Ls3/b3$c;)V

    return-void
.end method

.method public static synthetic n0(Ls3/w0;Ls3/m1;)Ls3/m1;
    .locals 0

    iput-object p1, p0, Ls3/w0;->S:Ls3/m1;

    return-object p1
.end method

.method private synthetic n1(Ls3/i1$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Ls3/w0;->i1(Ls3/i1$e;)V

    return-void
.end method

.method public static synthetic o0(Ls3/w0;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/w0;->i0:Z

    return p0
.end method

.method private synthetic o1(Ls3/i1$e;)V
    .locals 2

    iget-object v0, p0, Ls3/w0;->i:Lp5/n;

    new-instance v1, Ls3/y;

    invoke-direct {v1, p0, p1}, Ls3/y;-><init>(Ls3/w0;Ls3/i1$e;)V

    invoke-interface {v0, v1}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic p0(Ls3/w0;Z)Z
    .locals 0

    iput-boolean p1, p0, Ls3/w0;->i0:Z

    return p1
.end method

.method public static synthetic p1(Ls3/b3$d;)V
    .locals 2

    new-instance v0, Ls3/k1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls3/k1;-><init>(I)V

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Ls3/q;->i(Ljava/lang/RuntimeException;I)Ls3/q;

    move-result-object v0

    invoke-interface {p0, v0}, Ls3/b3$d;->onPlayerError(Ls3/x2;)V

    return-void
.end method

.method public static synthetic q0(Ls3/w0;Ld5/e;)Ld5/e;
    .locals 0

    iput-object p1, p0, Ls3/w0;->j0:Ld5/e;

    return-object p1
.end method

.method public static synthetic q1(Lu3/e;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onAudioAttributesChanged(Lu3/e;)V

    return-void
.end method

.method public static synthetic r0(Ls3/w0;)Ls3/z1;
    .locals 0

    iget-object p0, p0, Ls3/w0;->r0:Ls3/z1;

    return-object p0
.end method

.method public static synthetic r1(ILs3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onRepeatModeChanged(I)V

    return-void
.end method

.method public static synthetic s0(Ls3/w0;Ls3/z1;)Ls3/z1;
    .locals 0

    iput-object p1, p0, Ls3/w0;->r0:Ls3/z1;

    return-object p1
.end method

.method public static synthetic s1(FLs3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onVolumeChanged(F)V

    return-void
.end method

.method public static synthetic t0(Ls3/w0;)Ls3/z1;
    .locals 0

    invoke-virtual {p0}, Ls3/w0;->S0()Ls3/z1;

    move-result-object p0

    return-object p0
.end method

.method private synthetic t1(Ls3/b3$d;)V
    .locals 1

    iget-object v0, p0, Ls3/w0;->O:Ls3/b3$b;

    invoke-interface {p1, v0}, Ls3/b3$d;->onAvailableCommandsChanged(Ls3/b3$b;)V

    return-void
.end method

.method public static synthetic u0(Ls3/w0;)Ls3/z1;
    .locals 0

    iget-object p0, p0, Ls3/w0;->P:Ls3/z1;

    return-object p0
.end method

.method public static synthetic u1(Ls3/y2;ILs3/b3$d;)V
    .locals 0

    iget-object p0, p0, Ls3/y2;->a:Ls3/u3;

    invoke-interface {p2, p0, p1}, Ls3/b3$d;->onTimelineChanged(Ls3/u3;I)V

    return-void
.end method

.method public static synthetic v0(Ls3/w0;Ls3/z1;)Ls3/z1;
    .locals 0

    iput-object p1, p0, Ls3/w0;->P:Ls3/z1;

    return-object p1
.end method

.method public static synthetic v1(ILs3/b3$e;Ls3/b3$e;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p3, p0}, Ls3/b3$d;->onPositionDiscontinuity(I)V

    invoke-interface {p3, p1, p2, p0}, Ls3/b3$d;->onPositionDiscontinuity(Ls3/b3$e;Ls3/b3$e;I)V

    return-void
.end method

.method public static synthetic w0(Ls3/w0;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/w0;->Y:Z

    return p0
.end method

.method public static synthetic w1(Ls3/u1;ILs3/b3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls3/b3$d;->onMediaItemTransition(Ls3/u1;I)V

    return-void
.end method

.method public static synthetic x0(Ls3/w0;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Ls3/w0;->V1(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget-object p0, p0, Ls3/y2;->f:Ls3/q;

    invoke-interface {p1, p0}, Ls3/b3$d;->onPlayerErrorChanged(Ls3/x2;)V

    return-void
.end method

.method public static synthetic y0(Ls3/w0;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls3/w0;->K1(II)V

    return-void
.end method

.method public static synthetic y1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget-object p0, p0, Ls3/y2;->f:Ls3/q;

    invoke-interface {p1, p0}, Ls3/b3$d;->onPlayerError(Ls3/x2;)V

    return-void
.end method

.method public static synthetic z0(Ls3/w0;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-virtual {p0, p1}, Ls3/w0;->U1(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public static synthetic z1(Ls3/y2;Ls3/b3$d;)V
    .locals 0

    iget-object p0, p0, Ls3/y2;->i:Ln5/c0;

    iget-object p0, p0, Ln5/c0;->d:Ls3/z3;

    invoke-interface {p1, p0}, Ls3/b3$d;->onTracksChanged(Ls3/z3;)V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->b1()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public B(I)V
    .locals 3

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget v0, p0, Ls3/w0;->F:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Ls3/w0;->F:I

    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {v0, p1}, Ls3/i1;->U0(I)V

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v1, 0x8

    new-instance v2, Ls3/o0;

    invoke-direct {v2, p1}, Ls3/o0;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->i(ILp5/q$a;)V

    invoke-virtual {p0}, Ls3/w0;->Y1()V

    iget-object p1, p0, Ls3/w0;->l:Lp5/q;

    invoke-virtual {p1}, Lp5/q;->f()V

    :cond_0
    return-void
.end method

.method public D()I
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget v0, v0, Ls3/y2;->m:I

    return v0
.end method

.method public E()I
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget v0, p0, Ls3/w0;->F:I

    return v0
.end method

.method public F()Ls3/u3;
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    return-object v0
.end method

.method public G()Z
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-boolean v0, p0, Ls3/w0;->G:Z

    return v0
.end method

.method public H()J
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    invoke-virtual {p0, v0}, Ls3/w0;->a1(Ls3/y2;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final I1(Ls3/y2;Ls3/u3;Landroid/util/Pair;)Ls3/y2;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/y2;",
            "Ls3/u3;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Ls3/y2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Ls3/u3;->u()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v4

    :goto_1
    invoke-static {v3}, Lp5/a;->a(Z)V

    move-object/from16 v3, p1

    iget-object v5, v3, Ls3/y2;->a:Ls3/u3;

    invoke-virtual/range {p1 .. p2}, Ls3/y2;->i(Ls3/u3;)Ls3/y2;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Ls3/u3;->u()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Ls3/y2;->k()Lu4/t$b;

    move-result-object v1

    iget-wide v2, v0, Ls3/w0;->v0:J

    invoke-static {v2, v3}, Lp5/n0;->B0(J)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    sget-object v16, Lu4/u0;->k:Lu4/u0;

    iget-object v2, v0, Ls3/w0;->b:Ln5/c0;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v18

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v17, v2

    invoke-virtual/range {v6 .. v18}, Ls3/y2;->c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;

    move-result-object v2

    invoke-virtual {v2, v1}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object v1

    iget-wide v2, v1, Ls3/y2;->r:J

    iput-wide v2, v1, Ls3/y2;->p:J

    return-object v1

    :cond_2
    iget-object v3, v6, Ls3/y2;->b:Lu4/t$b;

    iget-object v3, v3, Lu4/s;->a:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    new-instance v8, Lu4/t$b;

    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v8, v9}, Lu4/t$b;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v8, v6, Ls3/y2;->b:Lu4/t$b;

    :goto_2
    move-object v14, v8

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Ls3/w0;->s()J

    move-result-wide v8

    invoke-static {v8, v9}, Lp5/n0;->B0(J)J

    move-result-wide v8

    invoke-virtual {v5}, Ls3/u3;->u()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v5, v3, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v2

    invoke-virtual {v2}, Ls3/u3$b;->q()J

    move-result-wide v2

    sub-long/2addr v8, v2

    :cond_4
    if-nez v7, :cond_b

    cmp-long v2, v12, v8

    if-gez v2, :cond_5

    goto/16 :goto_6

    :cond_5
    if-nez v2, :cond_9

    iget-object v2, v6, Ls3/y2;->k:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    iget-object v3, v0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v2, v3}, Ls3/u3;->j(ILs3/u3$b;)Ls3/u3$b;

    move-result-object v2

    iget v2, v2, Ls3/u3$b;->j:I

    iget-object v3, v14, Lu4/s;->a:Ljava/lang/Object;

    iget-object v4, v0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v3, v4}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v3

    iget v3, v3, Ls3/u3$b;->j:I

    if-eq v2, v3, :cond_8

    :cond_6
    iget-object v2, v14, Lu4/s;->a:Ljava/lang/Object;

    iget-object v3, v0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v2, v3}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    invoke-virtual {v14}, Lu4/s;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Ls3/w0;->n:Ls3/u3$b;

    iget v2, v14, Lu4/s;->b:I

    iget v3, v14, Lu4/s;->c:I

    invoke-virtual {v1, v2, v3}, Ls3/u3$b;->e(II)J

    move-result-wide v1

    goto :goto_3

    :cond_7
    iget-object v1, v0, Ls3/w0;->n:Ls3/u3$b;

    iget-wide v1, v1, Ls3/u3$b;->k:J

    :goto_3
    iget-wide v8, v6, Ls3/y2;->r:J

    iget-wide v10, v6, Ls3/y2;->r:J

    iget-wide v12, v6, Ls3/y2;->d:J

    iget-wide v3, v6, Ls3/y2;->r:J

    sub-long v3, v1, v3

    iget-object v5, v6, Ls3/y2;->h:Lu4/u0;

    iget-object v15, v6, Ls3/y2;->i:Ln5/c0;

    iget-object v7, v6, Ls3/y2;->j:Ljava/util/List;

    move-object/from16 v18, v7

    move-object v7, v14

    move-object v0, v14

    move-object/from16 v17, v15

    move-wide v14, v3

    move-object/from16 v16, v5

    invoke-virtual/range {v6 .. v18}, Ls3/y2;->c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object v6

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_9
    move-object v0, v14

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lp5/a;->f(Z)V

    const-wide/16 v1, 0x0

    iget-wide v3, v6, Ls3/y2;->q:J

    sub-long v7, v12, v8

    sub-long/2addr v3, v7

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    iget-wide v1, v6, Ls3/y2;->p:J

    iget-object v3, v6, Ls3/y2;->k:Lu4/t$b;

    iget-object v4, v6, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v3, v4}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    add-long v1, v12, v14

    :cond_a
    iget-object v3, v6, Ls3/y2;->h:Lu4/u0;

    iget-object v4, v6, Ls3/y2;->i:Ln5/c0;

    iget-object v5, v6, Ls3/y2;->j:Ljava/util/List;

    move-object v7, v0

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-virtual/range {v6 .. v18}, Ls3/y2;->c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;

    move-result-object v6

    :goto_5
    iput-wide v1, v6, Ls3/y2;->p:J

    goto :goto_4

    :cond_b
    :goto_6
    move-object v0, v14

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lp5/a;->f(Z)V

    const-wide/16 v14, 0x0

    if-eqz v7, :cond_c

    sget-object v1, Lu4/u0;->k:Lu4/u0;

    goto :goto_7

    :cond_c
    iget-object v1, v6, Ls3/y2;->h:Lu4/u0;

    :goto_7
    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, p0

    if-eqz v7, :cond_d

    iget-object v2, v0, Ls3/w0;->b:Ln5/c0;

    goto :goto_8

    :cond_d
    iget-object v2, v6, Ls3/y2;->i:Ln5/c0;

    :goto_8
    move-object/from16 v17, v2

    if-eqz v7, :cond_e

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v2

    goto :goto_9

    :cond_e
    iget-object v2, v6, Ls3/y2;->j:Ljava/util/List;

    :goto_9
    move-object/from16 v18, v2

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-wide v2, v12

    invoke-virtual/range {v6 .. v18}, Ls3/y2;->c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;

    move-result-object v4

    invoke-virtual {v4, v1}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object v6

    iput-wide v2, v6, Ls3/y2;->p:J

    :goto_a
    return-object v6
.end method

.method public final J1(Ls3/u3;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u3;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iput p2, p0, Ls3/w0;->t0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const-wide/16 p3, 0x0

    :cond_0
    iput-wide p3, p0, Ls3/w0;->v0:J

    const/4 p1, 0x0

    iput p1, p0, Ls3/w0;->u0:I

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    invoke-virtual {p1}, Ls3/u3;->t()I

    move-result v0

    if-lt p2, v0, :cond_3

    :cond_2
    iget-boolean p2, p0, Ls3/w0;->G:Z

    invoke-virtual {p1, p2}, Ls3/u3;->e(Z)I

    move-result p2

    iget-object p3, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {p1, p2, p3}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object p3

    invoke-virtual {p3}, Ls3/u3$d;->d()J

    move-result-wide p3

    :cond_3
    move v3, p2

    iget-object v1, p0, Ls3/e;->a:Ls3/u3$d;

    iget-object v2, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-static {p3, p4}, Lp5/n0;->B0(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final K1(II)V
    .locals 3

    iget-object v0, p0, Ls3/w0;->c0:Lp5/d0;

    invoke-virtual {v0}, Lp5/d0;->b()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ls3/w0;->c0:Lp5/d0;

    invoke-virtual {v0}, Lp5/d0;->a()I

    move-result v0

    if-eq p2, v0, :cond_1

    :cond_0
    new-instance v0, Lp5/d0;

    invoke-direct {v0, p1, p2}, Lp5/d0;-><init>(II)V

    iput-object v0, p0, Ls3/w0;->c0:Lp5/d0;

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v1, 0x18

    new-instance v2, Ls3/p0;

    invoke-direct {v2, p1, p2}, Ls3/p0;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->k(ILp5/q$a;)V

    :cond_1
    return-void
.end method

.method public final L1(Ls3/u3;Lu4/t$b;J)J
    .locals 1

    iget-object p2, p2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v0, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {p1, p2, v0}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object p1, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {p1}, Ls3/u3$b;->q()J

    move-result-wide p1

    add-long/2addr p3, p1

    return-wide p3
.end method

.method public final M1(II)Ls3/y2;
    .locals 6

    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v0

    invoke-virtual {p0}, Ls3/w0;->F()Ls3/u3;

    move-result-object v1

    iget-object v2, p0, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Ls3/w0;->H:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, Ls3/w0;->H:I

    invoke-virtual {p0, p1, p2}, Ls3/w0;->N1(II)V

    invoke-virtual {p0}, Ls3/w0;->U0()Ls3/u3;

    move-result-object v3

    iget-object v5, p0, Ls3/w0;->s0:Ls3/y2;

    invoke-virtual {p0, v1, v3}, Ls3/w0;->c1(Ls3/u3;Ls3/u3;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {p0, v5, v3, v1}, Ls3/w0;->I1(Ls3/y2;Ls3/u3;Landroid/util/Pair;)Ls3/y2;

    move-result-object v1

    iget v3, v1, Ls3/y2;->e:I

    const/4 v5, 0x4

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-ge p1, p2, :cond_0

    if-ne p2, v2, :cond_0

    iget-object v2, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v2}, Ls3/u3;->t()I

    move-result v2

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v1, v5}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    iget-object v2, p0, Ls3/w0;->M:Lu4/o0;

    invoke-virtual {v0, p1, p2, v2}, Ls3/i1;->n0(IILu4/o0;)V

    return-object v1
.end method

.method public N(IJIZ)V
    .locals 12

    move-object v11, p0

    move v0, p1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    const/4 v1, 0x1

    if-ltz v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lp5/a;->a(Z)V

    iget-object v2, v11, Ls3/w0;->r:Lt3/a;

    invoke-interface {v2}, Lt3/a;->w()V

    iget-object v2, v11, Ls3/w0;->s0:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v2}, Ls3/u3;->u()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ls3/u3;->t()I

    move-result v3

    if-lt v0, v3, :cond_1

    return-void

    :cond_1
    iget v3, v11, Ls3/w0;->H:I

    add-int/2addr v3, v1

    iput v3, v11, Ls3/w0;->H:I

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "ExoPlayerImpl"

    const-string v2, "seekTo ignored because an ad is playing"

    invoke-static {v0, v2}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ls3/i1$e;

    iget-object v2, v11, Ls3/w0;->s0:Ls3/y2;

    invoke-direct {v0, v2}, Ls3/i1$e;-><init>(Ls3/y2;)V

    invoke-virtual {v0, v1}, Ls3/i1$e;->b(I)V

    iget-object v1, v11, Ls3/w0;->j:Ls3/i1$f;

    invoke-interface {v1, v0}, Ls3/i1$f;->a(Ls3/i1$e;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Ls3/w0;->v()I

    move-result v3

    if-ne v3, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x2

    :goto_1
    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v9

    iget-object v3, v11, Ls3/w0;->s0:Ls3/y2;

    invoke-virtual {v3, v1}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object v1

    move-wide v3, p2

    invoke-virtual {p0, v2, p1, p2, p3}, Ls3/w0;->J1(Ls3/u3;IJ)Landroid/util/Pair;

    move-result-object v5

    invoke-virtual {p0, v1, v2, v5}, Ls3/w0;->I1(Ls3/y2;Ls3/u3;Landroid/util/Pair;)Ls3/y2;

    move-result-object v1

    iget-object v5, v11, Ls3/w0;->k:Ls3/i1;

    invoke-static {p2, p3}, Lp5/n0;->B0(J)J

    move-result-wide v3

    invoke-virtual {v5, v2, p1, v3, v4}, Ls3/i1;->A0(Ls3/u3;IJ)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-virtual {p0, v1}, Ls3/w0;->a1(Ls3/y2;)J

    move-result-wide v7

    move-object v0, p0

    move/from16 v10, p5

    invoke-virtual/range {v0 .. v10}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public final N1(II)V
    .locals 2

    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-lt v0, p1, :cond_0

    iget-object v1, p0, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/w0;->M:Lu4/o0;

    invoke-interface {v0, p1, p2}, Lu4/o0;->c(II)Lu4/o0;

    move-result-object p1

    iput-object p1, p0, Ls3/w0;->M:Lu4/o0;

    return-void
.end method

.method public final O1()V
    .locals 3

    iget-object v0, p0, Ls3/w0;->X:Lr5/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0;->y:Ls3/w0$d;

    invoke-virtual {p0, v0}, Ls3/w0;->V0(Ls3/e3$b;)Ls3/e3;

    move-result-object v0

    const/16 v2, 0x2710

    invoke-virtual {v0, v2}, Ls3/e3;->n(I)Ls3/e3;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls3/e3;->m(Ljava/lang/Object;)Ls3/e3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/e3;->l()Ls3/e3;

    iget-object v0, p0, Ls3/w0;->X:Lr5/f;

    iget-object v2, p0, Ls3/w0;->x:Ls3/w0$c;

    invoke-virtual {v0, v2}, Lr5/f;->d(Lr5/f$a;)V

    iput-object v1, p0, Ls3/w0;->X:Lr5/f;

    :cond_0
    iget-object v0, p0, Ls3/w0;->Z:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    iget-object v2, p0, Ls3/w0;->x:Ls3/w0$c;

    if-eq v0, v2, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v2, "SurfaceTextureListener already unset or replaced."

    invoke-static {v0, v2}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ls3/w0;->Z:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v1, p0, Ls3/w0;->Z:Landroid/view/TextureView;

    :cond_2
    iget-object v0, p0, Ls3/w0;->W:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    iget-object v2, p0, Ls3/w0;->x:Ls3/w0$c;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v1, p0, Ls3/w0;->W:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method public P0(Lt3/b;)V
    .locals 1

    iget-object v0, p0, Ls3/w0;->r:Lt3/a;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt3/b;

    invoke-interface {v0, p1}, Lt3/a;->B(Lt3/b;)V

    return-void
.end method

.method public final P1(IILjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Ls3/w0;->g:[Ls3/i3;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ls3/i3;->i()I

    move-result v4

    if-ne v4, p1, :cond_0

    invoke-virtual {p0, v3}, Ls3/w0;->V0(Ls3/e3$b;)Ls3/e3;

    move-result-object v3

    invoke-virtual {v3, p2}, Ls3/e3;->n(I)Ls3/e3;

    move-result-object v3

    invoke-virtual {v3, p3}, Ls3/e3;->m(Ljava/lang/Object;)Ls3/e3;

    move-result-object v3

    invoke-virtual {v3}, Ls3/e3;->l()Ls3/e3;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public Q0(Ls3/r$a;)V
    .locals 1

    iget-object v0, p0, Ls3/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final Q1()V
    .locals 3

    iget v0, p0, Ls3/w0;->h0:F

    iget-object v1, p0, Ls3/w0;->A:Ls3/d;

    invoke-virtual {v1}, Ls3/d;->g()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2, v0}, Ls3/w0;->P1(IILjava/lang/Object;)V

    return-void
.end method

.method public final R0(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lu4/t;",
            ">;)",
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ls3/s2$c;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu4/t;

    iget-boolean v4, p0, Ls3/w0;->p:Z

    invoke-direct {v2, v3, v4}, Ls3/s2$c;-><init>(Lu4/t;Z)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Ls3/w0;->o:Ljava/util/List;

    add-int v4, v1, p1

    new-instance v5, Ls3/w0$e;

    iget-object v6, v2, Ls3/s2$c;->b:Ljava/lang/Object;

    iget-object v2, v2, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v2}, Lu4/p;->Z()Ls3/u3;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Ls3/w0$e;-><init>(Ljava/lang/Object;Ls3/u3;)V

    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ls3/w0;->M:Lu4/o0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2, p1, v1}, Lu4/o0;->g(II)Lu4/o0;

    move-result-object p1

    iput-object p1, p0, Ls3/w0;->M:Lu4/o0;

    return-object v0
.end method

.method public R1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu4/t;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ls3/w0;->d2()V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls3/w0;->S1(Ljava/util/List;Z)V

    return-void
.end method

.method public final S0()Ls3/z1;
    .locals 3

    invoke-virtual {p0}, Ls3/w0;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Ls3/w0;->r0:Ls3/z1;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    iget-object v0, v0, Ls3/u3$d;->j:Ls3/u1;

    iget-object v1, p0, Ls3/w0;->r0:Ls3/z1;

    invoke-virtual {v1}, Ls3/z1;->b()Ls3/z1$b;

    move-result-object v1

    iget-object v0, v0, Ls3/u1;->l:Ls3/z1;

    invoke-virtual {v1, v0}, Ls3/z1$b;->J(Ls3/z1;)Ls3/z1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/z1$b;->H()Ls3/z1;

    move-result-object v0

    return-object v0
.end method

.method public S1(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu4/t;",
            ">;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Ls3/w0;->d2()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Ls3/w0;->T1(Ljava/util/List;IJZ)V

    return-void
.end method

.method public final T1(Ljava/util/List;IJZ)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu4/t;",
            ">;IJZ)V"
        }
    .end annotation

    move-object/from16 v11, p0

    move/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Ls3/w0;->b1()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Ls3/w0;->H()J

    move-result-wide v2

    iget v4, v11, Ls3/w0;->H:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v11, Ls3/w0;->H:I

    iget-object v4, v11, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    iget-object v4, v11, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v11, v6, v4}, Ls3/w0;->N1(II)V

    :cond_0
    move-object/from16 v4, p1

    invoke-virtual {v11, v6, v4}, Ls3/w0;->R0(ILjava/util/List;)Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Ls3/w0;->U0()Ls3/u3;

    move-result-object v4

    invoke-virtual {v4}, Ls3/u3;->u()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v4}, Ls3/u3;->t()I

    move-result v7

    if-ge v0, v7, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ls3/q1;

    move-wide/from16 v7, p3

    invoke-direct {v1, v4, v0, v7, v8}, Ls3/q1;-><init>(Ls3/u3;IJ)V

    throw v1

    :cond_2
    :goto_0
    move-wide/from16 v7, p3

    const/4 v9, -0x1

    if-eqz p5, :cond_3

    iget-boolean v0, v11, Ls3/w0;->G:Z

    invoke-virtual {v4, v0}, Ls3/u3;->e(Z)I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move v14, v0

    goto :goto_1

    :cond_3
    if-ne v0, v9, :cond_4

    move v14, v1

    move-wide v1, v2

    goto :goto_1

    :cond_4
    move v14, v0

    move-wide v1, v7

    :goto_1
    iget-object v0, v11, Ls3/w0;->s0:Ls3/y2;

    invoke-virtual {v11, v4, v14, v1, v2}, Ls3/w0;->J1(Ls3/u3;IJ)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {v11, v0, v4, v3}, Ls3/w0;->I1(Ls3/y2;Ls3/u3;Landroid/util/Pair;)Ls3/y2;

    move-result-object v0

    iget v3, v0, Ls3/y2;->e:I

    if-eq v14, v9, :cond_7

    if-eq v3, v5, :cond_7

    invoke-virtual {v4}, Ls3/u3;->u()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v4}, Ls3/u3;->t()I

    move-result v3

    if-lt v14, v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x2

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v3, 0x4

    :cond_7
    :goto_3
    invoke-virtual {v0, v3}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object v3

    iget-object v12, v11, Ls3/w0;->k:Ls3/i1;

    invoke-static {v1, v2}, Lp5/n0;->B0(J)J

    move-result-wide v15

    iget-object v0, v11, Ls3/w0;->M:Lu4/o0;

    move-object/from16 v17, v0

    invoke-virtual/range {v12 .. v17}, Ls3/i1;->N0(Ljava/util/List;IJLu4/o0;)V

    iget-object v0, v11, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    iget-object v1, v3, Ls3/y2;->b:Lu4/t$b;

    iget-object v1, v1, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v11, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    move v5, v6

    :goto_4
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    invoke-virtual {v11, v3}, Ls3/w0;->a1(Ls3/y2;)J

    move-result-wide v8

    const/4 v10, -0x1

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object v1, v3

    move v3, v4

    move v4, v6

    move v6, v7

    move-wide v7, v8

    move v9, v10

    move v10, v12

    invoke-virtual/range {v0 .. v10}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public final U0()Ls3/u3;
    .locals 3

    new-instance v0, Ls3/f3;

    iget-object v1, p0, Ls3/w0;->o:Ljava/util/List;

    iget-object v2, p0, Ls3/w0;->M:Lu4/o0;

    invoke-direct {v0, v1, v2}, Ls3/f3;-><init>(Ljava/util/Collection;Lu4/o0;)V

    return-object v0
.end method

.method public final U1(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v0}, Ls3/w0;->V1(Ljava/lang/Object;)V

    iput-object v0, p0, Ls3/w0;->V:Landroid/view/Surface;

    return-void
.end method

.method public final V0(Ls3/e3$b;)Ls3/e3;
    .locals 9

    invoke-virtual {p0}, Ls3/w0;->b1()I

    move-result v0

    new-instance v8, Ls3/e3;

    iget-object v2, p0, Ls3/w0;->k:Ls3/i1;

    iget-object v1, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v4, v1, Ls3/y2;->a:Ls3/u3;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v5, v0

    iget-object v6, p0, Ls3/w0;->w:Lp5/d;

    invoke-virtual {v2}, Ls3/i1;->B()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Ls3/e3;-><init>(Ls3/e3$a;Ls3/e3$b;Ls3/u3;ILp5/d;Landroid/os/Looper;)V

    return-object v8
.end method

.method public final V1(Ljava/lang/Object;)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ls3/w0;->g:[Ls3/i3;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    invoke-interface {v6}, Ls3/i3;->i()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_0

    invoke-virtual {p0, v6}, Ls3/w0;->V0(Ls3/e3$b;)Ls3/e3;

    move-result-object v6

    invoke-virtual {v6, v5}, Ls3/e3;->n(I)Ls3/e3;

    move-result-object v5

    invoke-virtual {v5, p1}, Ls3/e3;->m(Ljava/lang/Object;)Ls3/e3;

    move-result-object v5

    invoke-virtual {v5}, Ls3/e3;->l()Ls3/e3;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ls3/w0;->U:Ljava/lang/Object;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/e3;

    iget-wide v6, p0, Ls3/w0;->E:J

    invoke-virtual {v1, v6, v7}, Ls3/e3;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    move v5, v3

    :catch_1
    iget-object v0, p0, Ls3/w0;->U:Ljava/lang/Object;

    iget-object v1, p0, Ls3/w0;->V:Landroid/view/Surface;

    if-ne v0, v1, :cond_4

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/w0;->V:Landroid/view/Surface;

    goto :goto_2

    :cond_3
    move v5, v3

    :cond_4
    :goto_2
    iput-object p1, p0, Ls3/w0;->U:Ljava/lang/Object;

    if-eqz v5, :cond_5

    new-instance p1, Ls3/k1;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ls3/k1;-><init>(I)V

    const/16 v0, 0x3eb

    invoke-static {p1, v0}, Ls3/q;->i(Ljava/lang/RuntimeException;I)Ls3/q;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Ls3/w0;->X1(ZLs3/q;)V

    :cond_5
    return-void
.end method

.method public final W0(Ls3/y2;Ls3/y2;ZIZZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/y2;",
            "Ls3/y2;",
            "ZIZZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p2, Ls3/y2;->a:Ls3/u3;

    iget-object v1, p1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v4

    const/4 v5, 0x3

    if-eq v2, v4, :cond_1

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    iget-object v2, p2, Ls3/y2;->b:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v4, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v0, v2, v4}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v2

    iget v2, v2, Ls3/u3$b;->j:I

    iget-object v4, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v2, v4}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    iget-object v0, v0, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object v2, p1, Ls3/y2;->b:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v4, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v2, v4}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v2

    iget v2, v2, Ls3/u3$b;->j:I

    iget-object v4, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v1, v2, v4}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v1

    iget-object v1, v1, Ls3/u3$d;->h:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_5

    if-eqz p3, :cond_2

    if-nez p4, :cond_2

    move v5, v2

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    if-ne p4, v2, :cond_3

    move v5, v1

    goto :goto_0

    :cond_3
    if-eqz p5, :cond_4

    :goto_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    if-eqz p3, :cond_6

    if-nez p4, :cond_6

    iget-object p2, p2, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, p2, Lu4/s;->d:J

    iget-object p1, p1, Ls3/y2;->b:Lu4/t$b;

    iget-wide p1, p1, Lu4/s;->d:J

    cmp-long p1, v4, p1

    if-gez p1, :cond_6

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_6
    if-eqz p3, :cond_7

    if-ne p4, v2, :cond_7

    if-eqz p6, :cond_7

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_7
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public W1(Z)V
    .locals 3

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->A:Ls3/d;

    invoke-virtual {p0}, Ls3/w0;->j()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ls3/d;->p(ZI)I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls3/w0;->X1(ZLs3/q;)V

    new-instance p1, Ld5/e;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    iget-object v1, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v1, v1, Ls3/y2;->r:J

    invoke-direct {p1, v0, v1, v2}, Ld5/e;-><init>(Ljava/util/List;J)V

    iput-object p1, p0, Ls3/w0;->j0:Ld5/e;

    return-void
.end method

.method public X0()Z
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-boolean v0, v0, Ls3/y2;->o:Z

    return v0
.end method

.method public final X1(ZLs3/q;)V
    .locals 13

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Ls3/w0;->M1(II)Ls3/y2;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ls3/y2;->e(Ls3/q;)Ls3/y2;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, p1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {p1, v1}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object p1

    iget-wide v1, p1, Ls3/y2;->r:J

    iput-wide v1, p1, Ls3/y2;->p:J

    const-wide/16 v1, 0x0

    iput-wide v1, p1, Ls3/y2;->q:J

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Ls3/y2;->e(Ls3/q;)Ls3/y2;

    move-result-object p1

    :cond_1
    move-object v3, p1

    iget p1, p0, Ls3/w0;->H:I

    add-int/2addr p1, v1

    iput p1, p0, Ls3/w0;->H:I

    iget-object p1, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {p1}, Ls3/i1;->g1()V

    iget-object p1, v3, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object p1, p1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result p1

    if-nez p1, :cond_2

    move v7, v1

    goto :goto_1

    :cond_2
    move v7, v0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x4

    invoke-virtual {p0, v3}, Ls3/w0;->a1(Ls3/y2;)J

    move-result-wide v9

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v12}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public Y0()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Ls3/w0;->s:Landroid/os/Looper;

    return-object v0
.end method

.method public final Y1()V
    .locals 3

    iget-object v0, p0, Ls3/w0;->O:Ls3/b3$b;

    iget-object v1, p0, Ls3/w0;->f:Ls3/b3;

    iget-object v2, p0, Ls3/w0;->c:Ls3/b3$b;

    invoke-static {v1, v2}, Lp5/n0;->H(Ls3/b3;Ls3/b3$b;)Ls3/b3$b;

    move-result-object v1

    iput-object v1, p0, Ls3/w0;->O:Ls3/b3$b;

    invoke-virtual {v1, v0}, Ls3/b3$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v1, 0xd

    new-instance v2, Ls3/r0;

    invoke-direct {v2, p0}, Ls3/r0;-><init>(Ls3/w0;)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->i(ILp5/q$a;)V

    :cond_0
    return-void
.end method

.method public Z0()J
    .locals 5

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ls3/w0;->v0:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->k:Lu4/t$b;

    iget-wide v1, v1, Lu4/s;->d:J

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v3, v3, Lu4/s;->d:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3$d;->f()J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, v0, Ls3/y2;->p:J

    iget-object v2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->k:Lu4/t$b;

    invoke-virtual {v2}, Lu4/s;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->k:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v0, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget-object v1, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->k:Lu4/t$b;

    iget v1, v1, Lu4/s;->b:I

    invoke-virtual {v0, v1}, Ls3/u3$b;->i(I)J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, v1, v3

    if-nez v3, :cond_2

    iget-wide v0, v0, Ls3/u3$b;->k:J

    goto :goto_0

    :cond_2
    move-wide v0, v1

    :cond_3
    :goto_0
    iget-object v2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v3, v2, Ls3/y2;->a:Ls3/u3;

    iget-object v2, v2, Ls3/y2;->k:Lu4/t$b;

    invoke-virtual {p0, v3, v2, v0, v1}, Ls3/w0;->L1(Ls3/u3;Lu4/t$b;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final Z1(ZII)V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    if-eq p2, v2, :cond_1

    move v1, v2

    :cond_1
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-boolean v4, v0, Ls3/y2;->l:Z

    if-ne v4, v3, :cond_2

    iget v4, v0, Ls3/y2;->m:I

    if-ne v4, v1, :cond_2

    return-void

    :cond_2
    iget v4, p0, Ls3/w0;->H:I

    add-int/2addr v4, v2

    iput v4, p0, Ls3/w0;->H:I

    invoke-virtual {v0, v3, v1}, Ls3/y2;->d(ZI)Ls3/y2;

    move-result-object v2

    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {v0, v3, v1}, Ls3/i1;->Q0(ZI)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, v2

    move v2, v3

    move v3, p3

    invoke-virtual/range {v0 .. v10}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public a()V
    .locals 15

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->j()Z

    move-result v0

    iget-object v1, p0, Ls3/w0;->A:Ls3/d;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Ls3/d;->p(ZI)I

    move-result v1

    invoke-static {v0, v1}, Ls3/w0;->d1(ZI)I

    move-result v3

    invoke-virtual {p0, v0, v1, v3}, Ls3/w0;->Z1(ZII)V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget v1, v0, Ls3/y2;->e:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls3/y2;->e(Ls3/q;)Ls3/y2;

    move-result-object v0

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    :cond_1
    invoke-virtual {v0, v2}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object v5

    iget v0, p0, Ls3/w0;->H:I

    add-int/2addr v0, v3

    iput v0, p0, Ls3/w0;->H:I

    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->i0()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v4, p0

    invoke-virtual/range {v4 .. v14}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public final a1(Ls3/y2;)J
    .locals 4

    iget-object v0, p1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ls3/w0;->v0:J

    invoke-static {v0, v1}, Lp5/n0;->B0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Ls3/y2;->r:J

    return-wide v0

    :cond_1
    iget-object v0, p1, Ls3/y2;->a:Ls3/u3;

    iget-object v1, p1, Ls3/y2;->b:Lu4/t$b;

    iget-wide v2, p1, Ls3/y2;->r:J

    invoke-virtual {p0, v0, v1, v2, v3}, Ls3/w0;->L1(Ls3/u3;Lu4/t$b;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a2(Ls3/y2;IIZZIJIZ)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p6

    iget-object v10, v7, Ls3/w0;->s0:Ls3/y2;

    iput-object v8, v7, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v10, Ls3/y2;->a:Ls3/u3;

    iget-object v1, v8, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0, v1}, Ls3/u3;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v11, 0x1

    xor-int/lit8 v12, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move/from16 v3, p5

    move/from16 v4, p6

    move v5, v12

    move/from16 v6, p10

    invoke-virtual/range {v0 .. v6}, Ls3/w0;->W0(Ls3/y2;Ls3/y2;ZIZZ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, v7, Ls3/w0;->P:Ls3/z1;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, v8, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v4}, Ls3/u3;->u()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v8, Ls3/y2;->a:Ls3/u3;

    iget-object v4, v8, Ls3/y2;->b:Lu4/t$b;

    iget-object v4, v4, Lu4/s;->a:Ljava/lang/Object;

    iget-object v5, v7, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v3, v4, v5}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v3

    iget v3, v3, Ls3/u3$b;->j:I

    iget-object v4, v8, Ls3/y2;->a:Ls3/u3;

    iget-object v5, v7, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v4, v3, v5}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v3

    iget-object v3, v3, Ls3/u3$d;->j:Ls3/u1;

    :cond_0
    sget-object v4, Ls3/z1;->P:Ls3/z1;

    iput-object v4, v7, Ls3/w0;->r0:Ls3/z1;

    :cond_1
    if-nez v1, :cond_2

    iget-object v4, v10, Ls3/y2;->j:Ljava/util/List;

    iget-object v5, v8, Ls3/y2;->j:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    iget-object v2, v7, Ls3/w0;->r0:Ls3/z1;

    invoke-virtual {v2}, Ls3/z1;->b()Ls3/z1$b;

    move-result-object v2

    iget-object v4, v8, Ls3/y2;->j:Ljava/util/List;

    invoke-virtual {v2, v4}, Ls3/z1$b;->K(Ljava/util/List;)Ls3/z1$b;

    move-result-object v2

    invoke-virtual {v2}, Ls3/z1$b;->H()Ls3/z1;

    move-result-object v2

    iput-object v2, v7, Ls3/w0;->r0:Ls3/z1;

    invoke-virtual/range {p0 .. p0}, Ls3/w0;->S0()Ls3/z1;

    move-result-object v2

    :cond_3
    iget-object v4, v7, Ls3/w0;->P:Ls3/z1;

    invoke-virtual {v2, v4}, Ls3/z1;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v11

    iput-object v2, v7, Ls3/w0;->P:Ls3/z1;

    iget-boolean v2, v10, Ls3/y2;->l:Z

    iget-boolean v5, v8, Ls3/y2;->l:Z

    const/4 v6, 0x0

    if-eq v2, v5, :cond_4

    move v2, v11

    goto :goto_0

    :cond_4
    move v2, v6

    :goto_0
    iget v5, v10, Ls3/y2;->e:I

    iget v13, v8, Ls3/y2;->e:I

    if-eq v5, v13, :cond_5

    move v5, v11

    goto :goto_1

    :cond_5
    move v5, v6

    :goto_1
    if-nez v5, :cond_6

    if-eqz v2, :cond_7

    :cond_6
    invoke-virtual/range {p0 .. p0}, Ls3/w0;->c2()V

    :cond_7
    iget-boolean v13, v10, Ls3/y2;->g:Z

    iget-boolean v14, v8, Ls3/y2;->g:Z

    if-eq v13, v14, :cond_8

    move v13, v11

    goto :goto_2

    :cond_8
    move v13, v6

    :goto_2
    if-eqz v13, :cond_9

    invoke-virtual {v7, v14}, Ls3/w0;->b2(Z)V

    :cond_9
    if-eqz v12, :cond_a

    iget-object v12, v7, Ls3/w0;->l:Lp5/q;

    new-instance v14, Ls3/g0;

    move/from16 v15, p2

    invoke-direct {v14, v8, v15}, Ls3/g0;-><init>(Ls3/y2;I)V

    invoke-virtual {v12, v6, v14}, Lp5/q;->i(ILp5/q$a;)V

    :cond_a
    if-eqz p5, :cond_b

    move/from16 v6, p9

    invoke-virtual {v7, v9, v10, v6}, Ls3/w0;->g1(ILs3/y2;I)Ls3/b3$e;

    move-result-object v6

    move-wide/from16 v14, p7

    invoke-virtual {v7, v14, v15}, Ls3/w0;->f1(J)Ls3/b3$e;

    move-result-object v12

    iget-object v14, v7, Ls3/w0;->l:Lp5/q;

    const/16 v15, 0xb

    new-instance v11, Ls3/q0;

    invoke-direct {v11, v9, v6, v12}, Ls3/q0;-><init>(ILs3/b3$e;Ls3/b3$e;)V

    invoke-virtual {v14, v15, v11}, Lp5/q;->i(ILp5/q$a;)V

    :cond_b
    if-eqz v1, :cond_c

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    new-instance v6, Ls3/s0;

    invoke-direct {v6, v3, v0}, Ls3/s0;-><init>(Ls3/u1;I)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0, v6}, Lp5/q;->i(ILp5/q$a;)V

    :cond_c
    iget-object v0, v10, Ls3/y2;->f:Ls3/q;

    iget-object v1, v8, Ls3/y2;->f:Ls3/q;

    if-eq v0, v1, :cond_d

    iget-object v0, v7, Ls3/w0;->l:Lp5/q;

    new-instance v1, Ls3/u0;

    invoke-direct {v1, v8}, Ls3/u0;-><init>(Ls3/y2;)V

    const/16 v3, 0xa

    invoke-virtual {v0, v3, v1}, Lp5/q;->i(ILp5/q$a;)V

    iget-object v0, v8, Ls3/y2;->f:Ls3/q;

    if-eqz v0, :cond_d

    iget-object v0, v7, Ls3/w0;->l:Lp5/q;

    new-instance v1, Ls3/d0;

    invoke-direct {v1, v8}, Ls3/d0;-><init>(Ls3/y2;)V

    invoke-virtual {v0, v3, v1}, Lp5/q;->i(ILp5/q$a;)V

    :cond_d
    iget-object v0, v10, Ls3/y2;->i:Ln5/c0;

    iget-object v1, v8, Ls3/y2;->i:Ln5/c0;

    if-eq v0, v1, :cond_e

    iget-object v0, v7, Ls3/w0;->h:Ln5/b0;

    iget-object v1, v1, Ln5/c0;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ln5/b0;->e(Ljava/lang/Object;)V

    iget-object v0, v7, Ls3/w0;->l:Lp5/q;

    const/4 v1, 0x2

    new-instance v3, Ls3/z;

    invoke-direct {v3, v8}, Ls3/z;-><init>(Ls3/y2;)V

    invoke-virtual {v0, v1, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_e
    if-eqz v4, :cond_f

    iget-object v0, v7, Ls3/w0;->P:Ls3/z1;

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/16 v3, 0xe

    new-instance v4, Ls3/t0;

    invoke-direct {v4, v0}, Ls3/t0;-><init>(Ls3/z1;)V

    invoke-virtual {v1, v3, v4}, Lp5/q;->i(ILp5/q$a;)V

    :cond_f
    if-eqz v13, :cond_10

    iget-object v0, v7, Ls3/w0;->l:Lp5/q;

    const/4 v1, 0x3

    new-instance v3, Ls3/f0;

    invoke-direct {v3, v8}, Ls3/f0;-><init>(Ls3/y2;)V

    invoke-virtual {v0, v1, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_10
    const/4 v0, -0x1

    if-nez v5, :cond_11

    if-eqz v2, :cond_12

    :cond_11
    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    new-instance v3, Ls3/e0;

    invoke-direct {v3, v8}, Ls3/e0;-><init>(Ls3/y2;)V

    invoke-virtual {v1, v0, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_12
    if-eqz v5, :cond_13

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/4 v3, 0x4

    new-instance v4, Ls3/v0;

    invoke-direct {v4, v8}, Ls3/v0;-><init>(Ls3/y2;)V

    invoke-virtual {v1, v3, v4}, Lp5/q;->i(ILp5/q$a;)V

    :cond_13
    if-eqz v2, :cond_14

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/4 v2, 0x5

    new-instance v3, Ls3/h0;

    move/from16 v4, p3

    invoke-direct {v3, v8, v4}, Ls3/h0;-><init>(Ls3/y2;I)V

    invoke-virtual {v1, v2, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_14
    iget v1, v10, Ls3/y2;->m:I

    iget v2, v8, Ls3/y2;->m:I

    if-eq v1, v2, :cond_15

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/4 v2, 0x6

    new-instance v3, Ls3/a0;

    invoke-direct {v3, v8}, Ls3/a0;-><init>(Ls3/y2;)V

    invoke-virtual {v1, v2, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_15
    invoke-static {v10}, Ls3/w0;->k1(Ls3/y2;)Z

    move-result v1

    invoke-static/range {p1 .. p1}, Ls3/w0;->k1(Ls3/y2;)Z

    move-result v2

    if-eq v1, v2, :cond_16

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/4 v2, 0x7

    new-instance v3, Ls3/c0;

    invoke-direct {v3, v8}, Ls3/c0;-><init>(Ls3/y2;)V

    invoke-virtual {v1, v2, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_16
    iget-object v1, v10, Ls3/y2;->n:Ls3/a3;

    iget-object v2, v8, Ls3/y2;->n:Ls3/a3;

    invoke-virtual {v1, v2}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    const/16 v2, 0xc

    new-instance v3, Ls3/b0;

    invoke-direct {v3, v8}, Ls3/b0;-><init>(Ls3/y2;)V

    invoke-virtual {v1, v2, v3}, Lp5/q;->i(ILp5/q$a;)V

    :cond_17
    if-eqz p4, :cond_18

    iget-object v1, v7, Ls3/w0;->l:Lp5/q;

    sget-object v2, Ls3/l0;->a:Ls3/l0;

    invoke-virtual {v1, v0, v2}, Lp5/q;->i(ILp5/q$a;)V

    :cond_18
    invoke-virtual/range {p0 .. p0}, Ls3/w0;->Y1()V

    iget-object v0, v7, Ls3/w0;->l:Lp5/q;

    invoke-virtual {v0}, Lp5/q;->f()V

    iget-boolean v0, v10, Ls3/y2;->o:Z

    iget-boolean v1, v8, Ls3/y2;->o:Z

    if-eq v0, v1, :cond_19

    iget-object v0, v7, Ls3/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/r$a;

    iget-boolean v2, v8, Ls3/y2;->o:Z

    invoke-interface {v1, v2}, Ls3/r$a;->v(Z)V

    goto :goto_3

    :cond_19
    return-void
.end method

.method public final b1()I
    .locals 3

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ls3/w0;->t0:I

    return v0

    :cond_0
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v0, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object v0

    iget v0, v0, Ls3/u3$b;->j:I

    return v0
.end method

.method public final b2(Z)V
    .locals 3

    iget-object v0, p0, Ls3/w0;->m0:Lp5/c0;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Ls3/w0;->n0:Z

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp5/c0;->a(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls3/w0;->n0:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Ls3/w0;->n0:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0, v1}, Lp5/c0;->b(I)V

    iput-boolean v1, p0, Ls3/w0;->n0:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public c()J
    .locals 4

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v2, v1, Lu4/s;->a:Ljava/lang/Object;

    iget-object v3, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v0, v2, v3}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v0, p0, Ls3/w0;->n:Ls3/u3$b;

    iget v2, v1, Lu4/s;->b:I

    iget v1, v1, Lu4/s;->c:I

    invoke-virtual {v0, v2, v1}, Ls3/u3$b;->e(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ls3/e;->J()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c1(Ls3/u3;Ls3/u3;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u3;",
            "Ls3/u3;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ls3/w0;->s()J

    move-result-wide v0

    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    if-nez v2, :cond_3

    invoke-virtual {p2}, Ls3/u3;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v9

    iget-object v7, p0, Ls3/e;->a:Ls3/u3$d;

    iget-object v8, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-static {v0, v1}, Lp5/n0;->B0(J)J

    move-result-wide v10

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p2, v10}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v5, :cond_1

    return-object v0

    :cond_1
    iget-object v6, p0, Ls3/e;->a:Ls3/u3$d;

    iget-object v7, p0, Ls3/w0;->n:Ls3/u3$b;

    iget v8, p0, Ls3/w0;->F:I

    iget-boolean v9, p0, Ls3/w0;->G:Z

    move-object v11, p1

    move-object v12, p2

    invoke-static/range {v6 .. v12}, Ls3/i1;->y0(Ls3/u3$d;Ls3/u3$b;IZLjava/lang/Object;Ls3/u3;Ls3/u3;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {p2, p1, v0}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object p1, p0, Ls3/w0;->n:Ls3/u3$b;

    iget p1, p1, Ls3/u3$b;->j:I

    iget-object v0, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {p2, p1, v0}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3$d;->d()J

    move-result-wide v0

    invoke-virtual {p0, p2, p1, v0, v1}, Ls3/w0;->J1(Ls3/u3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0, p2, v5, v3, v4}, Ls3/w0;->J1(Ls3/u3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Ls3/u3;->u()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Ls3/w0;->b1()I

    move-result v5

    :goto_2
    if-eqz p1, :cond_6

    move-wide v0, v3

    :cond_6
    invoke-virtual {p0, p2, v5, v0, v1}, Ls3/w0;->J1(Ls3/u3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final c2()V
    .locals 5

    invoke-virtual {p0}, Ls3/w0;->v()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Ls3/w0;->X0()Z

    move-result v0

    iget-object v3, p0, Ls3/w0;->C:Ls3/a4;

    invoke-virtual {p0}, Ls3/w0;->j()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {v3, v1}, Ls3/a4;->b(Z)V

    iget-object v0, p0, Ls3/w0;->D:Ls3/b4;

    invoke-virtual {p0}, Ls3/w0;->j()Z

    move-result v1

    invoke-virtual {v0, v1}, Ls3/b4;->b(Z)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Ls3/w0;->C:Ls3/a4;

    invoke-virtual {v0, v2}, Ls3/a4;->b(Z)V

    iget-object v0, p0, Ls3/w0;->D:Ls3/b4;

    invoke-virtual {v0, v2}, Ls3/b4;->b(Z)V

    :goto_2
    return-void
.end method

.method public d(Ls3/a3;)V
    .locals 12

    invoke-virtual {p0}, Ls3/w0;->d2()V

    if-nez p1, :cond_0

    sget-object p1, Ls3/a3;->k:Ls3/a3;

    :cond_0
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->n:Ls3/a3;

    invoke-virtual {v0, p1}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    invoke-virtual {v0, p1}, Ls3/y2;->f(Ls3/a3;)Ls3/y2;

    move-result-object v2

    iget v0, p0, Ls3/w0;->H:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ls3/w0;->H:I

    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {v0, p1}, Ls3/i1;->S0(Ls3/a3;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, -0x1

    const/4 v11, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v11}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    return-void
.end method

.method public final d2()V
    .locals 4

    iget-object v0, p0, Ls3/w0;->d:Lp5/g;

    invoke-virtual {v0}, Lp5/g;->b()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Ls3/w0;->Y0()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0}, Ls3/w0;->Y0()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    invoke-static {v1, v0}, Lp5/n0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Ls3/w0;->k0:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ls3/w0;->l0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v3, "ExoPlayerImpl"

    invoke-static {v3, v0, v1}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Ls3/w0;->l0:Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    return-void
.end method

.method public e(F)V
    .locals 3

    invoke-virtual {p0}, Ls3/w0;->d2()V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lp5/n0;->p(FFF)F

    move-result p1

    iget v0, p0, Ls3/w0;->h0:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Ls3/w0;->h0:F

    invoke-virtual {p0}, Ls3/w0;->Q1()V

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v1, 0x16

    new-instance v2, Ls3/j0;

    invoke-direct {v2, p1}, Ls3/j0;-><init>(F)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public e1()Ls3/q;
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->f:Ls3/q;

    return-object v0
.end method

.method public f(Landroid/view/Surface;)V
    .locals 0

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->O1()V

    invoke-virtual {p0, p1}, Ls3/w0;->V1(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    invoke-virtual {p0, p1, p1}, Ls3/w0;->K1(II)V

    return-void
.end method

.method public final f1(J)Ls3/b3$e;
    .locals 13

    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v2

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v1, v1, Lu4/s;->a:Ljava/lang/Object;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v0, v1, v3}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0, v1}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v3, v3, Ls3/y2;->a:Ls3/u3;

    iget-object v4, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v3, v2, v4}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v3

    iget-object v3, v3, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object v4, p0, Ls3/e;->a:Ls3/u3$d;

    iget-object v4, v4, Ls3/u3$d;->j:Ls3/u1;

    move v5, v0

    move-object v12, v4

    move-object v4, v1

    move-object v1, v3

    move-object v3, v12

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    move v5, v0

    move-object v3, v1

    move-object v4, v3

    :goto_0
    invoke-static {p1, p2}, Lp5/n0;->Y0(J)J

    move-result-wide v6

    new-instance p1, Ls3/b3$e;

    iget-object p2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object p2, p2, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {p2}, Lu4/s;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Ls3/w0;->s0:Ls3/y2;

    invoke-static {p2}, Ls3/w0;->h1(Ls3/y2;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lp5/n0;->Y0(J)J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide v8, v6

    :goto_1
    iget-object p2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object p2, p2, Ls3/y2;->b:Lu4/t$b;

    iget v10, p2, Lu4/s;->b:I

    iget v11, p2, Lu4/s;->c:I

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Ls3/b3$e;-><init>(Ljava/lang/Object;ILs3/u1;Ljava/lang/Object;IJJII)V

    return-object p1
.end method

.method public g()Z
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0}, Lu4/s;->b()Z

    move-result v0

    return v0
.end method

.method public final g1(ILs3/y2;I)Ls3/b3$e;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Ls3/u3$b;

    invoke-direct {v2}, Ls3/u3$b;-><init>()V

    iget-object v3, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v3}, Ls3/u3;->u()Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    iget-object v3, v1, Ls3/y2;->b:Lu4/t$b;

    iget-object v5, v3, Lu4/s;->a:Ljava/lang/Object;

    iget-object v3, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v3, v5, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget v3, v2, Ls3/u3$b;->j:I

    iget-object v6, v1, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v6, v5}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v6

    iget-object v7, v1, Ls3/y2;->a:Ls3/u3;

    iget-object v8, v0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v7, v3, v8}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v7

    iget-object v7, v7, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object v8, v0, Ls3/e;->a:Ls3/u3$d;

    iget-object v8, v8, Ls3/u3$d;->j:Ls3/u1;

    move v11, v3

    move-object v13, v5

    move v14, v6

    move-object v10, v7

    move-object v12, v8

    goto :goto_0

    :cond_0
    move/from16 v11, p3

    move v14, v4

    move-object v10, v5

    move-object v12, v10

    move-object v13, v12

    :goto_0
    iget-object v3, v1, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v3}, Lu4/s;->b()Z

    move-result v3

    if-nez p1, :cond_3

    if-eqz v3, :cond_1

    iget-object v3, v1, Ls3/y2;->b:Lu4/t$b;

    iget v4, v3, Lu4/s;->b:I

    iget v3, v3, Lu4/s;->c:I

    invoke-virtual {v2, v4, v3}, Ls3/u3$b;->e(II)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    iget-object v3, v1, Ls3/y2;->b:Lu4/t$b;

    iget v3, v3, Lu4/s;->e:I

    if-eq v3, v4, :cond_2

    iget-object v2, v0, Ls3/w0;->s0:Ls3/y2;

    invoke-static {v2}, Ls3/w0;->h1(Ls3/y2;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    iget-wide v3, v2, Ls3/u3$b;->l:J

    iget-wide v5, v2, Ls3/u3$b;->k:J

    add-long v2, v3, v5

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    iget-wide v2, v1, Ls3/y2;->r:J

    :goto_1
    invoke-static/range {p2 .. p2}, Ls3/w0;->h1(Ls3/y2;)J

    move-result-wide v4

    goto :goto_3

    :cond_4
    iget-wide v2, v2, Ls3/u3$b;->l:J

    iget-wide v4, v1, Ls3/y2;->r:J

    add-long/2addr v2, v4

    :goto_2
    move-wide v4, v2

    :goto_3
    new-instance v6, Ls3/b3$e;

    invoke-static {v2, v3}, Lp5/n0;->Y0(J)J

    move-result-wide v15

    invoke-static {v4, v5}, Lp5/n0;->Y0(J)J

    move-result-wide v17

    iget-object v1, v1, Ls3/y2;->b:Lu4/t$b;

    iget v2, v1, Lu4/s;->b:I

    iget v1, v1, Lu4/s;->c:I

    move-object v9, v6

    move/from16 v19, v2

    move/from16 v20, v1

    invoke-direct/range {v9 .. v20}, Ls3/b3$e;-><init>(Ljava/lang/Object;ILs3/u1;Ljava/lang/Object;IJJII)V

    return-object v6
.end method

.method public h(Lu3/e;Z)V
    .locals 3

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-boolean v0, p0, Ls3/w0;->o0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls3/w0;->g0:Lu3/e;

    invoke-static {v0, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Ls3/w0;->g0:Lu3/e;

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1, p1}, Ls3/w0;->P1(IILjava/lang/Object;)V

    iget-object v0, p0, Ls3/w0;->B:Ls3/p3;

    iget v1, p1, Lu3/e;->j:I

    invoke-static {v1}, Lp5/n0;->f0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ls3/p3;->h(I)V

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v1, 0x14

    new-instance v2, Ls3/i0;

    invoke-direct {v2, p1}, Ls3/i0;-><init>(Lu3/e;)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->i(ILp5/q$a;)V

    :cond_1
    iget-object v0, p0, Ls3/w0;->A:Ls3/d;

    if-eqz p2, :cond_2

    move-object p2, p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Ls3/d;->m(Lu3/e;)V

    iget-object p2, p0, Ls3/w0;->h:Ln5/b0;

    invoke-virtual {p2, p1}, Ln5/b0;->h(Lu3/e;)V

    invoke-virtual {p0}, Ls3/w0;->j()Z

    move-result p1

    iget-object p2, p0, Ls3/w0;->A:Ls3/d;

    invoke-virtual {p0}, Ls3/w0;->v()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Ls3/d;->p(ZI)I

    move-result p2

    invoke-static {p1, p2}, Ls3/w0;->d1(ZI)I

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Ls3/w0;->Z1(ZII)V

    iget-object p1, p0, Ls3/w0;->l:Lp5/q;

    invoke-virtual {p1}, Lp5/q;->f()V

    return-void
.end method

.method public i()J
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v0, v0, Ls3/y2;->q:J

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i1(Ls3/i1$e;)V
    .locals 11

    iget v1, p0, Ls3/w0;->H:I

    iget v2, p1, Ls3/i1$e;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Ls3/w0;->H:I

    iget-boolean v2, p1, Ls3/i1$e;->d:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget v2, p1, Ls3/i1$e;->e:I

    iput v2, p0, Ls3/w0;->I:I

    iput-boolean v3, p0, Ls3/w0;->J:Z

    :cond_0
    iget-boolean v2, p1, Ls3/i1$e;->f:Z

    if-eqz v2, :cond_1

    iget v2, p1, Ls3/i1$e;->g:I

    iput v2, p0, Ls3/w0;->K:I

    :cond_1
    if-nez v1, :cond_b

    iget-object v1, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-object v1, v1, Ls3/y2;->a:Ls3/u3;

    iget-object v2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v2}, Ls3/u3;->u()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    iput v2, p0, Ls3/w0;->t0:I

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Ls3/w0;->v0:J

    iput v4, p0, Ls3/w0;->u0:I

    :cond_2
    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    if-nez v2, :cond_4

    move-object v2, v1

    check-cast v2, Ls3/f3;

    invoke-virtual {v2}, Ls3/f3;->I()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v5, v6, :cond_3

    move v5, v3

    goto :goto_0

    :cond_3
    move v5, v4

    :goto_0
    invoke-static {v5}, Lp5/a;->f(Z)V

    move v5, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Ls3/w0;->o:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls3/w0$e;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls3/u3;

    invoke-static {v6, v7}, Ls3/w0$e;->a(Ls3/w0$e;Ls3/u3;)Ls3/u3;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    iget-boolean v2, p0, Ls3/w0;->J:Z

    if-eqz v2, :cond_a

    iget-object v2, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->b:Lu4/t$b;

    iget-object v7, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v7, v7, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v2, v7}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-wide v7, v2, Ls3/y2;->d:J

    iget-object v2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v9, v2, Ls3/y2;->r:J

    cmp-long v2, v7, v9

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ls3/u3;->u()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-object v2, v2, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v2}, Lu4/s;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-object v5, v2, Ls3/y2;->b:Lu4/t$b;

    iget-wide v6, v2, Ls3/y2;->d:J

    invoke-virtual {p0, v1, v5, v6, v7}, Ls3/w0;->L1(Ls3/u3;Lu4/t$b;J)J

    move-result-wide v1

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v1, p1, Ls3/i1$e;->b:Ls3/y2;

    iget-wide v1, v1, Ls3/y2;->d:J

    :goto_4
    move-wide v7, v1

    goto :goto_5

    :cond_9
    move-wide v7, v5

    :goto_5
    move v5, v3

    goto :goto_6

    :cond_a
    move-wide v7, v5

    move v5, v4

    :goto_6
    iput-boolean v4, p0, Ls3/w0;->J:Z

    iget-object v1, p1, Ls3/i1$e;->b:Ls3/y2;

    const/4 v2, 0x1

    iget v3, p0, Ls3/w0;->K:I

    const/4 v4, 0x0

    iget v6, p0, Ls3/w0;->I:I

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v10}, Ls3/w0;->a2(Ls3/y2;IIZZIJIZ)V

    :cond_b
    return-void
.end method

.method public j()Z
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-boolean v0, v0, Ls3/y2;->l:Z

    return v0
.end method

.method public final j1(I)I
    .locals 9

    iget-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    if-nez v0, :cond_1

    const/16 v3, 0xfa0

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x2

    new-instance v0, Landroid/media/AudioTrack;

    const/4 v2, 0x3

    const/4 v7, 0x0

    move-object v1, v0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    :cond_1
    iget-object p1, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result p1

    return p1
.end method

.method public k()I
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ls3/w0;->u0:I

    return v0

    :cond_0
    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public l(Lu4/t;)V
    .locals 0

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls3/w0;->R1(Ljava/util/List;)V

    return-void
.end method

.method public o(Ls3/b3$d;)V
    .locals 1

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/b3$d;

    invoke-virtual {v0, p1}, Lp5/q;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public p()I
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget v0, v0, Lu4/s;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public bridge synthetic q()Ls3/x2;
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->e1()Ls3/q;

    move-result-object v0

    return-object v0
.end method

.method public r(Z)V
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->A:Ls3/d;

    invoke-virtual {p0}, Ls3/w0;->v()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ls3/d;->p(ZI)I

    move-result v0

    invoke-static {p1, v0}, Ls3/w0;->d1(ZI)I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ls3/w0;->Z1(ZII)V

    return-void
.end method

.method public release()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ExoPlayerLib/2.18.7"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lp5/n0;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ls3/j1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    invoke-static {v1, v0}, Lp5/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ls3/w0;->d2()V

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Ls3/w0;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Ls3/w0;->z:Ls3/b;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ls3/b;->b(Z)V

    iget-object v0, p0, Ls3/w0;->B:Ls3/p3;

    invoke-virtual {v0}, Ls3/p3;->g()V

    iget-object v0, p0, Ls3/w0;->C:Ls3/a4;

    invoke-virtual {v0, v2}, Ls3/a4;->b(Z)V

    iget-object v0, p0, Ls3/w0;->D:Ls3/b4;

    invoke-virtual {v0, v2}, Ls3/b4;->b(Z)V

    iget-object v0, p0, Ls3/w0;->A:Ls3/d;

    invoke-virtual {v0}, Ls3/d;->i()V

    iget-object v0, p0, Ls3/w0;->k:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->k0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    const/16 v3, 0xa

    sget-object v4, Ls3/k0;->a:Ls3/k0;

    invoke-virtual {v0, v3, v4}, Lp5/q;->k(ILp5/q$a;)V

    :cond_1
    iget-object v0, p0, Ls3/w0;->l:Lp5/q;

    invoke-virtual {v0}, Lp5/q;->j()V

    iget-object v0, p0, Ls3/w0;->i:Lp5/n;

    invoke-interface {v0, v1}, Lp5/n;->k(Ljava/lang/Object;)V

    iget-object v0, p0, Ls3/w0;->t:Lo5/e;

    iget-object v3, p0, Ls3/w0;->r:Lt3/a;

    invoke-interface {v0, v3}, Lo5/e;->f(Lo5/e$a;)V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ls3/y2;->g(I)Ls3/y2;

    move-result-object v0

    iput-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v4, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v0, v4}, Ls3/y2;->b(Lu4/t$b;)Ls3/y2;

    move-result-object v0

    iput-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v4, v0, Ls3/y2;->r:J

    iput-wide v4, v0, Ls3/y2;->p:J

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    const-wide/16 v4, 0x0

    iput-wide v4, v0, Ls3/y2;->q:J

    iget-object v0, p0, Ls3/w0;->r:Lt3/a;

    invoke-interface {v0}, Lt3/a;->release()V

    iget-object v0, p0, Ls3/w0;->h:Ln5/b0;

    invoke-virtual {v0}, Ln5/b0;->f()V

    invoke-virtual {p0}, Ls3/w0;->O1()V

    iget-object v0, p0, Ls3/w0;->V:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Ls3/w0;->V:Landroid/view/Surface;

    :cond_2
    iget-boolean v0, p0, Ls3/w0;->n0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ls3/w0;->m0:Lp5/c0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/c0;

    invoke-virtual {v0, v2}, Lp5/c0;->b(I)V

    iput-boolean v2, p0, Ls3/w0;->n0:Z

    :cond_3
    sget-object v0, Ld5/e;->j:Ld5/e;

    iput-object v0, p0, Ls3/w0;->j0:Ld5/e;

    iput-boolean v3, p0, Ls3/w0;->o0:Z

    return-void
.end method

.method public s()J
    .locals 5

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget-object v0, v0, Lu4/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v1, v0, v2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v1, v0, Ls3/y2;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v0, v0, Ls3/y2;->a:Ls3/u3;

    invoke-virtual {p0}, Ls3/w0;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3$d;->d()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/w0;->n:Ls3/u3$b;

    invoke-virtual {v0}, Ls3/u3$b;->p()J

    move-result-wide v0

    iget-object v2, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v2, v2, Ls3/y2;->c:J

    invoke-static {v2, v3}, Lp5/n0;->Y0(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ls3/w0;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method public stop()V
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls3/w0;->W1(Z)V

    return-void
.end method

.method public t()J
    .locals 2

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v1, v0, Ls3/y2;->k:Lu4/t$b;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    invoke-virtual {v1, v0}, Lu4/s;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-wide v0, v0, Ls3/y2;->p:J

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/w0;->c()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ls3/w0;->Z0()J

    move-result-wide v0

    return-wide v0
.end method

.method public v()I
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget v0, v0, Ls3/y2;->e:I

    return v0
.end method

.method public w()Ls3/m1;
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->R:Ls3/m1;

    return-object v0
.end method

.method public x()Ls3/z3;
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v0, v0, Ln5/c0;->d:Ls3/z3;

    return-object v0
.end method

.method public z()I
    .locals 1

    invoke-virtual {p0}, Ls3/w0;->d2()V

    invoke-virtual {p0}, Ls3/w0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0;->s0:Ls3/y2;

    iget-object v0, v0, Ls3/y2;->b:Lu4/t$b;

    iget v0, v0, Lu4/s;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
