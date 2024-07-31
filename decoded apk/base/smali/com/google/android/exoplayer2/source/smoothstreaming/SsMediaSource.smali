.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;
.super Lu4/a;
.source ""

# interfaces
.implements Lo5/e0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu4/a;",
        "Lo5/e0$b<",
        "Lo5/g0<",
        "Lc5/a;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/c;",
            ">;"
        }
    .end annotation
.end field

.field public B:Lo5/j;

.field public C:Lo5/e0;

.field public D:Lo5/f0;

.field public E:Lo5/m0;

.field public F:J

.field public G:Lc5/a;

.field public H:Landroid/os/Handler;

.field public final o:Z

.field public final p:Landroid/net/Uri;

.field public final q:Ls3/u1$h;

.field public final r:Ls3/u1;

.field public final s:Lo5/j$a;

.field public final t:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

.field public final u:Lu4/h;

.field public final v:Lw3/v;

.field public final w:Lo5/d0;

.field public final x:J

.field public final y:Lu4/a0$a;

.field public final z:Lo5/g0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/g0$a<",
            "+",
            "Lc5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.smoothstreaming"

    invoke-static {v0}, Ls3/j1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ls3/u1;Lc5/a;Lo5/j$a;Lo5/g0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lu4/h;Lw3/v;Lo5/d0;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u1;",
            "Lc5/a;",
            "Lo5/j$a;",
            "Lo5/g0$a<",
            "+",
            "Lc5/a;",
            ">;",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;",
            "Lu4/h;",
            "Lw3/v;",
            "Lo5/d0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Lu4/a;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    iget-boolean v2, p2, Lc5/a;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-static {v2}, Lp5/a;->f(Z)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->r:Ls3/u1;

    iget-object p1, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/u1$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->q:Ls3/u1$h;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-object v2, p1, Ls3/u1$h;->a:Landroid/net/Uri;

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object p1, v3

    goto :goto_2

    :cond_2
    iget-object p1, p1, Ls3/u1$h;->a:Landroid/net/Uri;

    invoke-static {p1}, Lp5/n0;->B(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->p:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->s:Lo5/j$a;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->z:Lo5/g0$a;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->t:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->u:Lu4/h;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Lw3/v;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iput-wide p9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:J

    invoke-virtual {p0, v3}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lu4/a0$a;

    if-eqz p2, :cond_3

    move v0, v1

    :cond_3
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->o:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1;Lc5/a;Lo5/j$a;Lo5/g0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lu4/h;Lw3/v;Lo5/d0;JLcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;-><init>(Ls3/u1;Lc5/a;Lo5/j$a;Lo5/g0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lu4/h;Lw3/v;Lo5/d0;J)V

    return-void
.end method

.method public static synthetic F(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L()V

    return-void
.end method


# virtual methods
.method public C(Lo5/m0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lo5/m0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Lw3/v;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw3/v;->d(Landroid/os/Looper;Lt3/s1;)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Lw3/v;

    invoke-interface {p1}, Lw3/v;->a()V

    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->o:Z

    if-eqz p1, :cond_0

    new-instance p1, Lo5/f0$a;

    invoke-direct {p1}, Lo5/f0$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:Lo5/f0;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->s:Lo5/j$a;

    invoke-interface {p1}, Lo5/j$a;->a()Lo5/j;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lo5/j;

    new-instance p1, Lo5/e0;

    const-string v0, "SsMediaSource"

    invoke-direct {p1, v0}, Lo5/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lo5/e0;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:Lo5/f0;

    invoke-static {}, Lp5/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L()V

    :goto_0
    return-void
.end method

.method public E()V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->o:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lo5/j;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->F:J

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lo5/e0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lo5/e0;->l()V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lo5/e0;

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Landroid/os/Handler;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Landroid/os/Handler;

    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Lw3/v;

    invoke-interface {v0}, Lw3/v;->release()V

    return-void
.end method

.method public G(Lo5/g0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "Lc5/a;",
            ">;JJZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lu4/n;

    iget-wide v3, v1, Lo5/g0;->a:J

    iget-object v5, v1, Lo5/g0;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->a()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iget-wide v3, v1, Lo5/g0;->a:J

    invoke-interface {v2, v3, v4}, Lo5/d0;->b(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lu4/a0$a;

    iget v1, v1, Lo5/g0;->c:I

    invoke-virtual {v2, v14, v1}, Lu4/a0$a;->q(Lu4/n;I)V

    return-void
.end method

.method public H(Lo5/g0;JJ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "Lc5/a;",
            ">;JJ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lu4/n;

    iget-wide v3, v1, Lo5/g0;->a:J

    iget-object v5, v1, Lo5/g0;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->a()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iget-wide v3, v1, Lo5/g0;->a:J

    invoke-interface {v2, v3, v4}, Lo5/d0;->b(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lu4/a0$a;

    iget v3, v1, Lo5/g0;->c:I

    invoke-virtual {v2, v14, v3}, Lu4/a0$a;->t(Lu4/n;I)V

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc5/a;

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    sub-long v1, p2, p4

    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->F:J

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J()V

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->K()V

    return-void
.end method

.method public I(Lo5/g0;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "Lc5/a;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lo5/e0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    new-instance v15, Lu4/n;

    iget-wide v4, v1, Lo5/g0;->a:J

    iget-object v6, v1, Lo5/g0;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->a()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v3, Lu4/q;

    iget v4, v1, Lo5/g0;->c:I

    invoke-direct {v3, v4}, Lu4/q;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    new-instance v5, Lo5/d0$c;

    move/from16 v6, p7

    invoke-direct {v5, v15, v3, v2, v6}, Lo5/d0$c;-><init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V

    invoke-interface {v4, v5}, Lo5/d0;->a(Lo5/d0$c;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    sget-object v3, Lo5/e0;->g:Lo5/e0$c;

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    invoke-static {v5, v3, v4}, Lo5/e0;->h(ZJ)Lo5/e0$c;

    move-result-object v3

    :goto_0
    invoke-virtual {v3}, Lo5/e0$c;->c()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lu4/a0$a;

    iget v6, v1, Lo5/g0;->c:I

    invoke-virtual {v5, v15, v6, v2, v4}, Lu4/a0$a;->x(Lu4/n;ILjava/io/IOException;Z)V

    if-eqz v4, :cond_1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iget-wide v4, v1, Lo5/g0;->a:J

    invoke-interface {v2, v4, v5}, Lo5/d0;->b(J)V

    :cond_1
    return-object v3
.end method

.method public final J()V
    .locals 30

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    invoke-virtual {v3, v4}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v(Lc5/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-object v4, v4, Lc5/a;->f:[Lc5/a$b;

    array-length v5, v4

    const-wide v6, 0x7fffffffffffffffL

    move v8, v1

    move-wide v14, v6

    :goto_1
    if-ge v8, v5, :cond_2

    aget-object v9, v4, v8

    iget v10, v9, Lc5/a$b;->k:I

    if-lez v10, :cond_1

    invoke-virtual {v9, v1}, Lc5/a$b;->e(I)J

    move-result-wide v10

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    iget v10, v9, Lc5/a$b;->k:I

    add-int/lit8 v10, v10, -0x1

    invoke-virtual {v9, v10}, Lc5/a$b;->e(I)J

    move-result-wide v10

    iget v12, v9, Lc5/a$b;->k:I

    add-int/lit8 v12, v12, -0x1

    invoke-virtual {v9, v12}, Lc5/a$b;->c(I)J

    move-result-wide v12

    add-long/2addr v10, v12

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    cmp-long v1, v14, v6

    const-wide/16 v4, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-boolean v1, v1, Lc5/a;->d:Z

    if-eqz v1, :cond_3

    move-wide v9, v6

    goto :goto_2

    :cond_3
    move-wide v9, v4

    :goto_2
    new-instance v1, Lu4/p0;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-boolean v3, v2, Lc5/a;->d:Z

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->r:Ls3/u1;

    move-object v8, v1

    move/from16 v18, v3

    move/from16 v19, v3

    move-object/from16 v20, v2

    move-object/from16 v21, v4

    invoke-direct/range {v8 .. v21}, Lu4/p0;-><init>(JJJJZZZLjava/lang/Object;Ls3/u1;)V

    goto/16 :goto_4

    :cond_4
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-boolean v8, v1, Lc5/a;->d:Z

    if-eqz v8, :cond_7

    iget-wide v8, v1, Lc5/a;->h:J

    cmp-long v1, v8, v6

    if-eqz v1, :cond_5

    cmp-long v1, v8, v4

    if-lez v1, :cond_5

    sub-long v4, v2, v8

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    :cond_5
    move-wide/from16 v21, v14

    sub-long v19, v2, v21

    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:J

    invoke-static {v1, v2}, Lp5/n0;->B0(J)J

    move-result-wide v1

    sub-long v1, v19, v1

    const-wide/32 v3, 0x4c4b40

    cmp-long v5, v1, v3

    if-gez v5, :cond_6

    const-wide/16 v1, 0x2

    div-long v1, v19, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_6
    move-wide/from16 v23, v1

    new-instance v1, Lu4/p0;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v25, 0x1

    const/16 v26, 0x1

    const/16 v27, 0x1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->r:Ls3/u1;

    move-object/from16 v16, v1

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    invoke-direct/range {v16 .. v29}, Lu4/p0;-><init>(JJJJZZZLjava/lang/Object;Ls3/u1;)V

    goto :goto_4

    :cond_7
    iget-wide v4, v1, Lc5/a;->g:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_8

    move-wide v12, v4

    goto :goto_3

    :cond_8
    sub-long/2addr v2, v14

    move-wide v12, v2

    :goto_3
    new-instance v1, Lu4/p0;

    add-long v10, v14, v12

    const-wide/16 v16, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->r:Ls3/u1;

    move-object v9, v1

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    invoke-direct/range {v9 .. v22}, Lu4/p0;-><init>(JJJJZZZLjava/lang/Object;Ls3/u1;)V

    :goto_4
    invoke-virtual {v0, v1}, Lu4/a;->D(Ls3/u3;)V

    return-void
.end method

.method public final K()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-boolean v0, v0, Lc5/a;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->F:J

    const-wide/16 v2, 0x1388

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Landroid/os/Handler;

    new-instance v3, Lb5/a;

    invoke-direct {v3, p0}, Lb5/a;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final L()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lo5/g0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lo5/j;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->p:Landroid/net/Uri;

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->z:Lo5/g0$a;

    invoke-direct {v0, v1, v2, v3, v4}, Lo5/g0;-><init>(Lo5/j;Landroid/net/Uri;ILo5/g0$a;)V

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lo5/e0;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iget v3, v0, Lo5/g0;->c:I

    invoke-interface {v2, v3}, Lo5/d0;->d(I)I

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Lo5/e0;->n(Lo5/e0$e;Lo5/e0$b;I)J

    move-result-wide v7

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lu4/a0$a;

    new-instance v2, Lu4/n;

    iget-wide v4, v0, Lo5/g0;->a:J

    iget-object v6, v0, Lo5/g0;->b:Lo5/n;

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lu4/n;-><init>(JLo5/n;J)V

    iget v0, v0, Lo5/g0;->c:I

    invoke-virtual {v1, v2, v0}, Lu4/a0$a;->z(Lu4/n;I)V

    return-void
.end method

.method public a(Lu4/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->u()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lu4/t$b;Lo5/b;J)Lu4/r;
    .locals 11

    invoke-virtual {p0, p1}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object v8

    invoke-virtual {p0, p1}, Lu4/a;->u(Lu4/t$b;)Lw3/u$a;

    move-result-object v6

    new-instance p1, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Lc5/a;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->t:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lo5/m0;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->u:Lu4/h;

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Lw3/v;

    iget-object v7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lo5/d0;

    iget-object v9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:Lo5/f0;

    move-object v0, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;-><init>(Lc5/a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo5/m0;Lu4/h;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;Lo5/f0;Lo5/b;)V

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public g()Ls3/u1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->r:Ls3/u1;

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:Lo5/f0;

    invoke-interface {v0}, Lo5/f0;->a()V

    return-void
.end method

.method public bridge synthetic k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I(Lo5/g0;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Lo5/e0$e;JJ)V
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H(Lo5/g0;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lo5/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G(Lo5/g0;JJZ)V

    return-void
.end method
