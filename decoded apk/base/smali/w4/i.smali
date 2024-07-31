.class public Lw4/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/m0;
.implements Lu4/n0;
.implements Lo5/e0$b;
.implements Lo5/e0$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/i$a;,
        Lw4/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lw4/j;",
        ">",
        "Ljava/lang/Object;",
        "Lu4/m0;",
        "Lu4/n0;",
        "Lo5/e0$b<",
        "Lw4/f;",
        ">;",
        "Lo5/e0$f;"
    }
.end annotation


# instance fields
.field public A:J

.field public B:I

.field public C:Lw4/a;

.field public D:Z

.field public final h:I

.field public final i:[I

.field public final j:[Ls3/m1;

.field public final k:[Z

.field public final l:Lw4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final m:Lu4/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4/n0$a<",
            "Lw4/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final n:Lu4/a0$a;

.field public final o:Lo5/d0;

.field public final p:Lo5/e0;

.field public final q:Lw4/h;

.field public final r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lw4/a;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw4/a;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Lu4/l0;

.field public final u:[Lu4/l0;

.field public final v:Lw4/c;

.field public w:Lw4/f;

.field public x:Ls3/m1;

.field public y:Lw4/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw4/i$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public z:J


# direct methods
.method public constructor <init>(I[I[Ls3/m1;Lw4/j;Lu4/n0$a;Lo5/b;JLw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I[",
            "Ls3/m1;",
            "TT;",
            "Lu4/n0$a<",
            "Lw4/i<",
            "TT;>;>;",
            "Lo5/b;",
            "J",
            "Lw3/v;",
            "Lw3/u$a;",
            "Lo5/d0;",
            "Lu4/a0$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw4/i;->h:I

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [I

    :cond_0
    iput-object p2, p0, Lw4/i;->i:[I

    if-nez p3, :cond_1

    new-array p3, v0, [Ls3/m1;

    :cond_1
    iput-object p3, p0, Lw4/i;->j:[Ls3/m1;

    iput-object p4, p0, Lw4/i;->l:Lw4/j;

    iput-object p5, p0, Lw4/i;->m:Lu4/n0$a;

    iput-object p12, p0, Lw4/i;->n:Lu4/a0$a;

    iput-object p11, p0, Lw4/i;->o:Lo5/d0;

    new-instance p3, Lo5/e0;

    const-string p4, "ChunkSampleStream"

    invoke-direct {p3, p4}, Lo5/e0;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lw4/i;->p:Lo5/e0;

    new-instance p3, Lw4/h;

    invoke-direct {p3}, Lw4/h;-><init>()V

    iput-object p3, p0, Lw4/i;->q:Lw4/h;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lw4/i;->s:Ljava/util/List;

    array-length p2, p2

    new-array p3, p2, [Lu4/l0;

    iput-object p3, p0, Lw4/i;->u:[Lu4/l0;

    new-array p3, p2, [Z

    iput-object p3, p0, Lw4/i;->k:[Z

    add-int/lit8 p3, p2, 0x1

    new-array p4, p3, [I

    new-array p3, p3, [Lu4/l0;

    invoke-static {p6, p9, p10}, Lu4/l0;->k(Lo5/b;Lw3/v;Lw3/u$a;)Lu4/l0;

    move-result-object p5

    iput-object p5, p0, Lw4/i;->t:Lu4/l0;

    aput p1, p4, v0

    aput-object p5, p3, v0

    :goto_0
    if-ge v0, p2, :cond_2

    invoke-static {p6}, Lu4/l0;->l(Lo5/b;)Lu4/l0;

    move-result-object p1

    iget-object p5, p0, Lw4/i;->u:[Lu4/l0;

    aput-object p1, p5, v0

    add-int/lit8 p5, v0, 0x1

    aput-object p1, p3, p5

    iget-object p1, p0, Lw4/i;->i:[I

    aget p1, p1, v0

    aput p1, p4, p5

    move v0, p5

    goto :goto_0

    :cond_2
    new-instance p1, Lw4/c;

    invoke-direct {p1, p4, p3}, Lw4/c;-><init>([I[Lu4/l0;)V

    iput-object p1, p0, Lw4/i;->v:Lw4/c;

    iput-wide p7, p0, Lw4/i;->z:J

    iput-wide p7, p0, Lw4/i;->A:J

    return-void
.end method

.method public static synthetic u(Lw4/i;)Lw4/a;
    .locals 0

    iget-object p0, p0, Lw4/i;->C:Lw4/a;

    return-object p0
.end method

.method public static synthetic v(Lw4/i;)[Z
    .locals 0

    iget-object p0, p0, Lw4/i;->k:[Z

    return-object p0
.end method

.method public static synthetic w(Lw4/i;)[I
    .locals 0

    iget-object p0, p0, Lw4/i;->i:[I

    return-object p0
.end method

.method public static synthetic x(Lw4/i;)[Ls3/m1;
    .locals 0

    iget-object p0, p0, Lw4/i;->j:[Ls3/m1;

    return-object p0
.end method

.method public static synthetic y(Lw4/i;)J
    .locals 2

    iget-wide v0, p0, Lw4/i;->A:J

    return-wide v0
.end method

.method public static synthetic z(Lw4/i;)Lu4/a0$a;
    .locals 0

    iget-object p0, p0, Lw4/i;->n:Lu4/a0$a;

    return-object p0
.end method


# virtual methods
.method public final A(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lw4/i;->N(II)I

    move-result p1

    iget v1, p0, Lw4/i;->B:I

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-lez p1, :cond_0

    iget-object v1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-static {v1, v0, p1}, Lp5/n0;->M0(Ljava/util/List;II)V

    iget v0, p0, Lw4/i;->B:I

    sub-int/2addr v0, p1

    iput v0, p0, Lw4/i;->B:I

    :cond_0
    return-void
.end method

.method public final B(I)V
    .locals 7

    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lw4/i;->F(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lw4/i;->E()Lw4/a;

    move-result-object v0

    iget-wide v5, v0, Lw4/f;->h:J

    invoke-virtual {p0, p1}, Lw4/i;->C(I)Lw4/a;

    move-result-object p1

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lw4/i;->A:J

    iput-wide v0, p0, Lw4/i;->z:J

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lw4/i;->D:Z

    iget-object v1, p0, Lw4/i;->n:Lu4/a0$a;

    iget v2, p0, Lw4/i;->h:I

    iget-wide v3, p1, Lw4/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lu4/a0$a;->D(IJJ)V

    return-void
.end method

.method public final C(I)Lw4/a;
    .locals 3

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/a;

    iget-object v1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lp5/n0;->M0(Ljava/util/List;II)V

    iget p1, p0, Lw4/i;->B:I

    iget-object v1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lw4/i;->B:I

    iget-object p1, p0, Lw4/i;->t:Lu4/l0;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lw4/a;->i(I)I

    move-result v2

    invoke-virtual {p1, v2}, Lu4/l0;->u(I)V

    iget-object p1, p0, Lw4/i;->u:[Lu4/l0;

    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget-object p1, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public D()Lw4/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lw4/i;->l:Lw4/j;

    return-object v0
.end method

.method public final E()Lw4/a;
    .locals 2

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/a;

    return-object v0
.end method

.method public final F(I)Z
    .locals 5

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw4/a;

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lw4/a;->i(I)I

    move-result v2

    const/4 v3, 0x1

    if-le v0, v2, :cond_0

    return v3

    :cond_0
    move v0, v1

    :cond_1
    iget-object v2, p0, Lw4/i;->u:[Lu4/l0;

    array-length v4, v2

    if-ge v0, v4, :cond_2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lu4/l0;->C()I

    move-result v2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lw4/a;->i(I)I

    move-result v4

    if-le v2, v4, :cond_1

    return v3

    :cond_2
    return v1
.end method

.method public final G(Lw4/f;)Z
    .locals 0

    instance-of p1, p1, Lw4/a;

    return p1
.end method

.method public H()Z
    .locals 4

    iget-wide v0, p0, Lw4/i;->z:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final I()V
    .locals 3

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v0

    iget v1, p0, Lw4/i;->B:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v0, v1}, Lw4/i;->N(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lw4/i;->B:I

    if-gt v1, v0, :cond_0

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lw4/i;->B:I

    invoke-virtual {p0, v1}, Lw4/i;->J(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final J(I)V
    .locals 8

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw4/a;

    iget-object v7, p1, Lw4/f;->d:Ls3/m1;

    iget-object v0, p0, Lw4/i;->x:Ls3/m1;

    invoke-virtual {v7, v0}, Ls3/m1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4/i;->n:Lu4/a0$a;

    iget v1, p0, Lw4/i;->h:I

    iget v3, p1, Lw4/f;->e:I

    iget-object v4, p1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v5, p1, Lw4/f;->g:J

    move-object v2, v7

    invoke-virtual/range {v0 .. v6}, Lu4/a0$a;->i(ILs3/m1;ILjava/lang/Object;J)V

    :cond_0
    iput-object v7, p0, Lw4/i;->x:Ls3/m1;

    return-void
.end method

.method public K(Lw4/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lw4/i;->w:Lw4/f;

    iput-object v2, v0, Lw4/i;->C:Lw4/a;

    new-instance v2, Lu4/n;

    iget-wide v4, v1, Lw4/f;->a:J

    iget-object v6, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lw4/i;->o:Lo5/d0;

    iget-wide v4, v1, Lw4/f;->a:J

    invoke-interface {v3, v4, v5}, Lo5/d0;->b(J)V

    iget-object v3, v0, Lw4/i;->n:Lu4/a0$a;

    iget v5, v1, Lw4/f;->c:I

    iget v6, v0, Lw4/i;->h:I

    iget-object v7, v1, Lw4/f;->d:Ls3/m1;

    iget v8, v1, Lw4/f;->e:I

    iget-object v9, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw4/f;->g:J

    iget-wide v12, v1, Lw4/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu4/a0$a;->r(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lw4/i;->Q()V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p1}, Lw4/i;->G(Lw4/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lw4/i;->C(I)Lw4/a;

    iget-object v1, v0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, v0, Lw4/i;->A:J

    iput-wide v1, v0, Lw4/i;->z:J

    :cond_1
    :goto_0
    iget-object v1, v0, Lw4/i;->m:Lu4/n0$a;

    invoke-interface {v1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_2
    return-void
.end method

.method public L(Lw4/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lw4/i;->w:Lw4/f;

    iget-object v2, v0, Lw4/i;->l:Lw4/j;

    invoke-interface {v2, v1}, Lw4/j;->i(Lw4/f;)V

    new-instance v2, Lu4/n;

    iget-wide v4, v1, Lw4/f;->a:J

    iget-object v6, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lw4/i;->o:Lo5/d0;

    iget-wide v4, v1, Lw4/f;->a:J

    invoke-interface {v3, v4, v5}, Lo5/d0;->b(J)V

    iget-object v3, v0, Lw4/i;->n:Lu4/a0$a;

    iget v5, v1, Lw4/f;->c:I

    iget v6, v0, Lw4/i;->h:I

    iget-object v7, v1, Lw4/f;->d:Ls3/m1;

    iget v8, v1, Lw4/f;->e:I

    iget-object v9, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw4/f;->g:J

    iget-wide v12, v1, Lw4/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu4/a0$a;->u(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    iget-object v1, v0, Lw4/i;->m:Lu4/n0$a;

    invoke-interface {v1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public M(Lw4/f;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p1}, Lw4/i;->G(Lw4/f;)Z

    move-result v14

    iget-object v2, v0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v15, 0x1

    add-int/lit8 v10, v2, -0x1

    const-wide/16 v2, 0x0

    cmp-long v2, v12, v2

    const/4 v11, 0x0

    if-eqz v2, :cond_1

    if-eqz v14, :cond_1

    invoke-virtual {v0, v10}, Lw4/i;->F(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v8, v11

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v15

    :goto_1
    new-instance v9, Lu4/n;

    iget-wide v3, v1, Lw4/f;->a:J

    iget-object v5, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v7

    move-object v2, v9

    move v15, v8

    move/from16 v17, v14

    move-object v14, v9

    move-wide/from16 v8, p2

    move/from16 v29, v10

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v2, Lu4/q;

    iget v3, v1, Lw4/f;->c:I

    iget v4, v0, Lw4/i;->h:I

    iget-object v5, v1, Lw4/f;->d:Ls3/m1;

    iget v6, v1, Lw4/f;->e:I

    iget-object v7, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v8, v1, Lw4/f;->g:J

    invoke-static {v8, v9}, Lp5/n0;->Y0(J)J

    move-result-wide v24

    iget-wide v8, v1, Lw4/f;->h:J

    invoke-static {v8, v9}, Lp5/n0;->Y0(J)J

    move-result-wide v26

    move-object/from16 v18, v2

    move/from16 v19, v3

    move/from16 v20, v4

    move-object/from16 v21, v5

    move/from16 v22, v6

    move-object/from16 v23, v7

    invoke-direct/range {v18 .. v27}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    new-instance v3, Lo5/d0$c;

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-direct {v3, v14, v2, v4, v5}, Lo5/d0$c;-><init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V

    iget-object v2, v0, Lw4/i;->l:Lw4/j;

    iget-object v5, v0, Lw4/i;->o:Lo5/d0;

    invoke-interface {v2, v1, v15, v3, v5}, Lw4/j;->h(Lw4/f;ZLo5/d0$c;Lo5/d0;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v15, :cond_3

    sget-object v2, Lo5/e0;->f:Lo5/e0$c;

    if-eqz v17, :cond_5

    move/from16 v6, v29

    invoke-virtual {v0, v6}, Lw4/i;->C(I)Lw4/a;

    move-result-object v6

    if-ne v6, v1, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    invoke-static {v11}, Lp5/a;->f(Z)V

    iget-object v6, v0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-wide v6, v0, Lw4/i;->A:J

    iput-wide v6, v0, Lw4/i;->z:J

    goto :goto_3

    :cond_3
    const-string v2, "ChunkSampleStream"

    const-string v6, "Ignoring attempt to cancel non-cancelable load."

    invoke-static {v2, v6}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const/4 v2, 0x0

    :cond_5
    :goto_3
    if-nez v2, :cond_7

    iget-object v2, v0, Lw4/i;->o:Lo5/d0;

    invoke-interface {v2, v3}, Lo5/d0;->a(Lo5/d0$c;)J

    move-result-wide v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v6

    if-eqz v6, :cond_6

    const/4 v6, 0x0

    invoke-static {v6, v2, v3}, Lo5/e0;->h(ZJ)Lo5/e0$c;

    move-result-object v2

    goto :goto_4

    :cond_6
    sget-object v2, Lo5/e0;->g:Lo5/e0$c;

    :cond_7
    :goto_4
    invoke-virtual {v2}, Lo5/e0$c;->c()Z

    move-result v3

    const/4 v6, 0x1

    xor-int/2addr v3, v6

    iget-object v6, v0, Lw4/i;->n:Lu4/a0$a;

    iget v7, v1, Lw4/f;->c:I

    iget v8, v0, Lw4/i;->h:I

    iget-object v9, v1, Lw4/f;->d:Ls3/m1;

    iget v10, v1, Lw4/f;->e:I

    iget-object v11, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v12, v1, Lw4/f;->g:J

    iget-wide v4, v1, Lw4/f;->h:J

    move-object/from16 v16, v6

    move-object/from16 v17, v14

    move/from16 v18, v7

    move/from16 v19, v8

    move-object/from16 v20, v9

    move/from16 v21, v10

    move-object/from16 v22, v11

    move-wide/from16 v23, v12

    move-wide/from16 v25, v4

    move-object/from16 v27, p6

    move/from16 v28, v3

    invoke-virtual/range {v16 .. v28}, Lu4/a0$a;->w(Lu4/n;IILs3/m1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    iput-object v3, v0, Lw4/i;->w:Lw4/f;

    iget-object v3, v0, Lw4/i;->o:Lo5/d0;

    iget-wide v4, v1, Lw4/f;->a:J

    invoke-interface {v3, v4, v5}, Lo5/d0;->b(J)V

    iget-object v1, v0, Lw4/i;->m:Lu4/n0$a;

    invoke-interface {v1, v0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_8
    return-object v2
.end method

.method public final N(II)I
    .locals 2

    :cond_0
    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    iget-object v0, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw4/a;->i(I)I

    move-result v0

    if-le v0, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    return p2

    :cond_1
    iget-object p1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public O()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lw4/i;->P(Lw4/i$b;)V

    return-void
.end method

.method public P(Lw4/i$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lw4/i;->y:Lw4/i$b;

    iget-object p1, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p1}, Lu4/l0;->R()V

    iget-object p1, p0, Lw4/i;->u:[Lu4/l0;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lu4/l0;->R()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {p1, p0}, Lo5/e0;->m(Lo5/e0$f;)V

    return-void
.end method

.method public final Q()V
    .locals 4

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->V()V

    iget-object v0, p0, Lw4/i;->u:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->V()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public R(J)V
    .locals 9

    iput-wide p1, p0, Lw4/i;->A:J

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lw4/i;->z:J

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw4/a;

    iget-wide v4, v3, Lw4/f;->g:J

    cmp-long v4, v4, p1

    if-nez v4, :cond_1

    iget-wide v5, v3, Lw4/a;->k:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    move-object v0, v3

    goto :goto_1

    :cond_1
    if-lez v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x1

    if-eqz v0, :cond_4

    iget-object v3, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0, v1}, Lw4/a;->i(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lu4/l0;->Y(I)Z

    move-result v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p0}, Lw4/i;->b()J

    move-result-wide v3

    cmp-long v3, p1, v3

    if-gez v3, :cond_5

    move v3, v2

    goto :goto_2

    :cond_5
    move v3, v1

    :goto_2
    invoke-virtual {v0, p1, p2, v3}, Lu4/l0;->Z(JZ)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_6

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v0

    invoke-virtual {p0, v0, v1}, Lw4/i;->N(II)I

    move-result v0

    iput v0, p0, Lw4/i;->B:I

    iget-object v0, p0, Lw4/i;->u:[Lu4/l0;

    array-length v3, v0

    :goto_4
    if-ge v1, v3, :cond_9

    aget-object v4, v0, v1

    invoke-virtual {v4, p1, p2, v2}, Lu4/l0;->Z(JZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_6
    iput-wide p1, p0, Lw4/i;->z:J

    iput-boolean v1, p0, Lw4/i;->D:Z

    iget-object p1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iput v1, p0, Lw4/i;->B:I

    iget-object p1, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p1}, Lu4/l0;->r()V

    iget-object p1, p0, Lw4/i;->u:[Lu4/l0;

    array-length p2, p1

    :goto_5
    if-ge v1, p2, :cond_7

    aget-object v0, p1, v1

    invoke-virtual {v0}, Lu4/l0;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_7
    iget-object p1, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->f()V

    goto :goto_6

    :cond_8
    iget-object p1, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->g()V

    invoke-virtual {p0}, Lw4/i;->Q()V

    :cond_9
    :goto_6
    return-void
.end method

.method public S(JI)Lw4/i$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lw4/i<",
            "TT;>.a;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lw4/i;->u:[Lu4/l0;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lw4/i;->i:[I

    aget v1, v1, v0

    if-ne v1, p3, :cond_0

    iget-object p3, p0, Lw4/i;->k:[Z

    aget-boolean p3, p3, v0

    const/4 v1, 0x1

    xor-int/2addr p3, v1

    invoke-static {p3}, Lp5/a;->f(Z)V

    iget-object p3, p0, Lw4/i;->k:[Z

    aput-boolean v1, p3, v0

    iget-object p3, p0, Lw4/i;->u:[Lu4/l0;

    aget-object p3, p3, v0

    invoke-virtual {p3, p1, p2, v1}, Lu4/l0;->Z(JZ)Z

    new-instance p1, Lw4/i$a;

    iget-object p2, p0, Lw4/i;->u:[Lu4/l0;

    aget-object p2, p2, v0

    invoke-direct {p1, p0, p0, p2, v0}, Lw4/i$a;-><init>(Lw4/i;Lw4/i;Lu4/l0;I)V

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->a()V

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->N()V

    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4/i;->l:Lw4/j;

    invoke-interface {v0}, Lw4/j;->a()V

    :cond_0
    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lw4/i;->z:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lw4/i;->D:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lw4/i;->E()Lw4/a;

    move-result-object v0

    iget-wide v0, v0, Lw4/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public c(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lw4/i;->D:Z

    const/4 v2, 0x0

    if-nez v1, :cond_8

    iget-object v1, v0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->j()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lw4/i;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    iget-wide v4, v0, Lw4/i;->z:J

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lw4/i;->s:Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lw4/i;->E()Lw4/a;

    move-result-object v4

    iget-wide v4, v4, Lw4/f;->h:J

    :goto_0
    move-object v11, v3

    move-wide v9, v4

    iget-object v6, v0, Lw4/i;->l:Lw4/j;

    iget-object v12, v0, Lw4/i;->q:Lw4/h;

    move-wide/from16 v7, p1

    invoke-interface/range {v6 .. v12}, Lw4/j;->g(JJLjava/util/List;Lw4/h;)V

    iget-object v3, v0, Lw4/i;->q:Lw4/h;

    iget-boolean v4, v3, Lw4/h;->b:Z

    iget-object v5, v3, Lw4/h;->a:Lw4/f;

    invoke-virtual {v3}, Lw4/h;->a()V

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x1

    if-eqz v4, :cond_2

    iput-wide v6, v0, Lw4/i;->z:J

    iput-boolean v3, v0, Lw4/i;->D:Z

    return v3

    :cond_2
    if-nez v5, :cond_3

    return v2

    :cond_3
    iput-object v5, v0, Lw4/i;->w:Lw4/f;

    invoke-virtual {v0, v5}, Lw4/i;->G(Lw4/f;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v4, v5

    check-cast v4, Lw4/a;

    if-eqz v1, :cond_5

    iget-wide v8, v4, Lw4/f;->g:J

    iget-wide v10, v0, Lw4/i;->z:J

    cmp-long v1, v8, v10

    if-eqz v1, :cond_4

    iget-object v1, v0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v1, v10, v11}, Lu4/l0;->b0(J)V

    iget-object v1, v0, Lw4/i;->u:[Lu4/l0;

    array-length v8, v1

    :goto_1
    if-ge v2, v8, :cond_4

    aget-object v9, v1, v2

    iget-wide v10, v0, Lw4/i;->z:J

    invoke-virtual {v9, v10, v11}, Lu4/l0;->b0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    iput-wide v6, v0, Lw4/i;->z:J

    :cond_5
    iget-object v1, v0, Lw4/i;->v:Lw4/c;

    invoke-virtual {v4, v1}, Lw4/a;->k(Lw4/c;)V

    iget-object v1, v0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    instance-of v1, v5, Lw4/m;

    if-eqz v1, :cond_7

    move-object v1, v5

    check-cast v1, Lw4/m;

    iget-object v2, v0, Lw4/i;->v:Lw4/c;

    invoke-virtual {v1, v2}, Lw4/m;->g(Lw4/g$b;)V

    :cond_7
    :goto_2
    iget-object v1, v0, Lw4/i;->p:Lo5/e0;

    iget-object v2, v0, Lw4/i;->o:Lo5/d0;

    iget v4, v5, Lw4/f;->c:I

    invoke-interface {v2, v4}, Lo5/d0;->d(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Lo5/e0;->n(Lo5/e0$e;Lo5/e0$b;I)J

    move-result-wide v10

    iget-object v12, v0, Lw4/i;->n:Lu4/a0$a;

    new-instance v13, Lu4/n;

    iget-wide v7, v5, Lw4/f;->a:J

    iget-object v9, v5, Lw4/f;->b:Lo5/n;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lu4/n;-><init>(JLo5/n;J)V

    iget v14, v5, Lw4/f;->c:I

    iget v15, v0, Lw4/i;->h:I

    iget-object v1, v5, Lw4/f;->d:Ls3/m1;

    iget v2, v5, Lw4/f;->e:I

    iget-object v4, v5, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lw4/f;->g:J

    iget-wide v8, v5, Lw4/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lu4/a0$a;->A(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return v3

    :cond_8
    :goto_3
    return v2
.end method

.method public d(JLs3/m3;)J
    .locals 1

    iget-object v0, p0, Lw4/i;->l:Lw4/j;

    invoke-interface {v0, p1, p2, p3}, Lw4/j;->d(JLs3/m3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()Z
    .locals 2

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    iget-boolean v1, p0, Lw4/i;->D:Z

    invoke-virtual {v0, v1}, Lu4/l0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()J
    .locals 4

    iget-boolean v0, p0, Lw4/i;->D:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lw4/i;->z:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lw4/i;->A:J

    invoke-virtual {p0}, Lw4/i;->E()Lw4/a;

    move-result-object v2

    invoke-virtual {v2}, Lw4/n;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw4/a;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lw4/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-object v2, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v2}, Lu4/l0;->z()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 3

    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->i()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lw4/i;->w:Lw4/f;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/f;

    invoke-virtual {p0, v0}, Lw4/i;->G(Lw4/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lw4/i;->F(I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lw4/i;->l:Lw4/j;

    iget-object v2, p0, Lw4/i;->s:Ljava/util/List;

    invoke-interface {v1, p1, p2, v0, v2}, Lw4/j;->f(JLw4/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->f()V

    invoke-virtual {p0, v0}, Lw4/i;->G(Lw4/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast v0, Lw4/a;

    iput-object v0, p0, Lw4/i;->C:Lw4/a;

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lw4/i;->l:Lw4/j;

    iget-object v1, p0, Lw4/i;->s:Ljava/util/List;

    invoke-interface {v0, p1, p2, v1}, Lw4/j;->j(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, Lw4/i;->r:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_4

    invoke-virtual {p0, p1}, Lw4/i;->B(I)V

    :cond_4
    :goto_0
    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->T()V

    iget-object v0, p0, Lw4/i;->u:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw4/i;->l:Lw4/j;

    invoke-interface {v0}, Lw4/j;->release()V

    iget-object v0, p0, Lw4/i;->y:Lw4/i$b;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lw4/i$b;->h(Lw4/i;)V

    :cond_1
    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lw4/i;->p:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    return v0
.end method

.method public j(Ls3/n1;Lv3/g;I)I
    .locals 3

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw4/i;->C:Lw4/a;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lw4/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v2}, Lu4/l0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lw4/i;->I()V

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    iget-boolean v1, p0, Lw4/i;->D:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lu4/l0;->S(Ls3/n1;Lv3/g;IZ)I

    move-result p1

    return p1
.end method

.method public bridge synthetic k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p7}, Lw4/i;->M(Lw4/f;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public n(J)I
    .locals 3

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    iget-boolean v2, p0, Lw4/i;->D:Z

    invoke-virtual {v0, p1, p2, v2}, Lu4/l0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lw4/i;->C:Lw4/a;

    if-eqz p2, :cond_1

    invoke-virtual {p2, v1}, Lw4/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p2, p1}, Lu4/l0;->e0(I)V

    invoke-virtual {p0}, Lw4/i;->I()V

    return p1
.end method

.method public bridge synthetic o(Lo5/e0$e;JJ)V
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p5}, Lw4/i;->L(Lw4/f;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lo5/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p6}, Lw4/i;->K(Lw4/f;JJZ)V

    return-void
.end method

.method public t(JZ)V
    .locals 4

    invoke-virtual {p0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->x()I

    move-result v0

    iget-object v1, p0, Lw4/i;->t:Lu4/l0;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, p3, v2}, Lu4/l0;->q(JZZ)V

    iget-object p1, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p1}, Lu4/l0;->x()I

    move-result p1

    if-le p1, v0, :cond_1

    iget-object p2, p0, Lw4/i;->t:Lu4/l0;

    invoke-virtual {p2}, Lu4/l0;->y()J

    move-result-wide v0

    const/4 p2, 0x0

    :goto_0
    iget-object v2, p0, Lw4/i;->u:[Lu4/l0;

    array-length v3, v2

    if-ge p2, v3, :cond_1

    aget-object v2, v2, p2

    iget-object v3, p0, Lw4/i;->k:[Z

    aget-boolean v3, v3, p2

    invoke-virtual {v2, v0, v1, p3, v3}, Lu4/l0;->q(JZZ)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lw4/i;->A(I)V

    return-void
.end method
