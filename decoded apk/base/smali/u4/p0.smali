.class public final Lu4/p0;
.super Ls3/u3;
.source ""


# static fields
.field public static final A:Ls3/u1;

.field public static final z:Ljava/lang/Object;


# instance fields
.field public final m:J

.field public final n:J

.field public final o:J

.field public final p:J

.field public final q:J

.field public final r:J

.field public final s:J

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:Ljava/lang/Object;

.field public final x:Ls3/u1;

.field public final y:Ls3/u1$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu4/p0;->z:Ljava/lang/Object;

    new-instance v0, Ls3/u1$c;

    invoke-direct {v0}, Ls3/u1$c;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    invoke-virtual {v0, v1}, Ls3/u1$c;->c(Ljava/lang/String;)Ls3/u1$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls3/u1$c;->e(Landroid/net/Uri;)Ls3/u1$c;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u1$c;->a()Ls3/u1;

    move-result-object v0

    sput-object v0, Lu4/p0;->A:Ls3/u1;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Ls3/u1;Ls3/u1$g;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ls3/u3;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lu4/p0;->m:J

    move-wide v1, p3

    iput-wide v1, v0, Lu4/p0;->n:J

    move-wide v1, p5

    iput-wide v1, v0, Lu4/p0;->o:J

    move-wide v1, p7

    iput-wide v1, v0, Lu4/p0;->p:J

    move-wide v1, p9

    iput-wide v1, v0, Lu4/p0;->q:J

    move-wide v1, p11

    iput-wide v1, v0, Lu4/p0;->r:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lu4/p0;->s:J

    move/from16 v1, p15

    iput-boolean v1, v0, Lu4/p0;->t:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lu4/p0;->u:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lu4/p0;->v:Z

    move-object/from16 v1, p18

    iput-object v1, v0, Lu4/p0;->w:Ljava/lang/Object;

    invoke-static/range {p19 .. p19}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/u1;

    iput-object v1, v0, Lu4/p0;->x:Ls3/u1;

    move-object/from16 v1, p20

    iput-object v1, v0, Lu4/p0;->y:Ls3/u1$g;

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Ls3/u1;)V
    .locals 21

    move-object/from16 v15, p13

    if-eqz p11, :cond_0

    iget-object v0, v15, Ls3/u1;->k:Ls3/u1$g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v20, v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    invoke-direct/range {v0 .. v20}, Lu4/p0;-><init>(JJJJJJJZZZLjava/lang/Object;Ls3/u1;Ls3/u1$g;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Ls3/u1;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    invoke-direct/range {v0 .. v13}, Lu4/p0;-><init>(JJJJZZZLjava/lang/Object;Ls3/u1;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lu4/p0;->z:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public k(ILs3/u3$b;Z)Ls3/u3$b;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lp5/a;->c(III)I

    if-eqz p3, :cond_0

    sget-object p1, Lu4/p0;->z:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Lu4/p0;->p:J

    iget-wide v6, p0, Lu4/p0;->r:J

    neg-long v6, v6

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Ls3/u3$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJ)Ls3/u3$b;

    move-result-object p1

    return-object p1
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public q(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lp5/a;->c(III)I

    sget-object p1, Lu4/p0;->z:Ljava/lang/Object;

    return-object p1
.end method

.method public s(ILs3/u3$d;J)Ls3/u3$d;
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move/from16 v3, p1

    invoke-static {v3, v1, v2}, Lp5/a;->c(III)I

    iget-wide v1, v0, Lu4/p0;->s:J

    iget-boolean v14, v0, Lu4/p0;->u:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v14, :cond_1

    iget-boolean v5, v0, Lu4/p0;->v:Z

    if-nez v5, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v5, p3, v5

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lu4/p0;->q:J

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    :goto_0
    move-wide/from16 v16, v3

    goto :goto_1

    :cond_0
    add-long v1, v1, p3

    cmp-long v5, v1, v5

    if-lez v5, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v16, v1

    :goto_1
    sget-object v4, Ls3/u3$d;->y:Ljava/lang/Object;

    iget-object v5, v0, Lu4/p0;->x:Ls3/u1;

    iget-object v6, v0, Lu4/p0;->w:Ljava/lang/Object;

    iget-wide v7, v0, Lu4/p0;->m:J

    iget-wide v9, v0, Lu4/p0;->n:J

    iget-wide v11, v0, Lu4/p0;->o:J

    iget-boolean v13, v0, Lu4/p0;->t:Z

    iget-object v15, v0, Lu4/p0;->y:Ls3/u1$g;

    iget-wide v1, v0, Lu4/p0;->q:J

    move-wide/from16 v18, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-wide v1, v0, Lu4/p0;->r:J

    move-wide/from16 v22, v1

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v23}, Ls3/u3$d;->h(Ljava/lang/Object;Ls3/u1;Ljava/lang/Object;JJJZZLs3/u1$g;JJIIJ)Ls3/u3$d;

    move-result-object v1

    return-object v1
.end method

.method public t()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
