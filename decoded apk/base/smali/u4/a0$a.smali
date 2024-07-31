.class public Lu4/a0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/a0$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lu4/t$b;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lu4/a0$a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lu4/a0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lu4/a0$a$a;",
            ">;I",
            "Lu4/t$b;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lu4/a0$a;->a:I

    iput-object p3, p0, Lu4/a0$a;->b:Lu4/t$b;

    iput-wide p4, p0, Lu4/a0$a;->d:J

    return-void
.end method

.method public static synthetic a(Lu4/a0$a;Lu4/a0;Lu4/t$b;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/a0$a;->p(Lu4/a0;Lu4/t$b;Lu4/q;)V

    return-void
.end method

.method public static synthetic b(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu4/a0$a;->n(Lu4/a0;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic c(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/a0$a;->m(Lu4/a0;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic d(Lu4/a0$a;Lu4/a0;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu4/a0$a;->k(Lu4/a0;Lu4/q;)V

    return-void
.end method

.method public static synthetic e(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/a0$a;->o(Lu4/a0;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic f(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/a0$a;->l(Lu4/a0;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic k(Lu4/a0;Lu4/q;)V
    .locals 2

    iget v0, p0, Lu4/a0$a;->a:I

    iget-object v1, p0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2}, Lu4/a0;->H(ILu4/t$b;Lu4/q;)V

    return-void
.end method

.method private synthetic l(Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 2

    iget v0, p0, Lu4/a0$a;->a:I

    iget-object v1, p0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu4/a0;->J(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic m(Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 2

    iget v0, p0, Lu4/a0$a;->a:I

    iget-object v1, p0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu4/a0;->u(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic n(Lu4/a0;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 7

    iget v1, p0, Lu4/a0$a;->a:I

    iget-object v2, p0, Lu4/a0$a;->b:Lu4/t$b;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lu4/a0;->I(ILu4/t$b;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic o(Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 2

    iget v0, p0, Lu4/a0$a;->a:I

    iget-object v1, p0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2, p3}, Lu4/a0;->y(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic p(Lu4/a0;Lu4/t$b;Lu4/q;)V
    .locals 1

    iget v0, p0, Lu4/a0$a;->a:I

    invoke-interface {p1, v0, p2, p3}, Lu4/a0;->z(ILu4/t$b;Lu4/q;)V

    return-void
.end method


# virtual methods
.method public A(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu4/a0$a;->B(Lu4/n;Lu4/q;)V

    return-void
.end method

.method public B(Lu4/n;Lu4/q;)V
    .locals 4

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v2, v1, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v1, v1, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu4/v;

    invoke-direct {v3, p0, v2, p1, p2}, Lu4/v;-><init>(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public C(Lu4/a0;)V
    .locals 3

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v2, v1, Lu4/a0$a$a;->b:Lu4/a0;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public D(IJJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide v1, p2

    invoke-virtual {p0, p2, p3}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p4

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v9

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v1, v11

    move v3, p1

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lu4/a0$a;->E(Lu4/q;)V

    return-void
.end method

.method public E(Lu4/q;)V
    .locals 5

    iget-object v0, p0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/t$b;

    iget-object v1, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu4/a0$a$a;

    iget-object v3, v2, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v2, v2, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v4, Lu4/z;

    invoke-direct {v4, p0, v3, v0, p1}, Lu4/z;-><init>(Lu4/a0$a;Lu4/a0;Lu4/t$b;Lu4/q;)V

    invoke-static {v2, v4}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public F(ILu4/t$b;J)Lu4/a0$a;
    .locals 7

    new-instance v6, Lu4/a0$a;

    iget-object v1, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    move-object v0, v6

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Lu4/a0$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;J)V

    return-object v6
.end method

.method public g(Landroid/os/Handler;Lu4/a0;)V
    .locals 2

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lu4/a0$a$a;

    invoke-direct {v1, p1, p2}, Lu4/a0$a$a;-><init>(Landroid/os/Handler;Lu4/a0;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h(J)J
    .locals 3

    invoke-static {p1, p2}, Lp5/n0;->Y0(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lu4/a0$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method public i(ILs3/m1;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide/from16 v1, p5

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    const/4 v2, 0x1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lu4/a0$a;->j(Lu4/q;)V

    return-void
.end method

.method public j(Lu4/q;)V
    .locals 4

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v2, v1, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v1, v1, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu4/y;

    invoke-direct {v3, p0, v2, p1}, Lu4/y;-><init>(Lu4/a0$a;Lu4/a0;Lu4/q;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(Lu4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu4/a0$a;->r(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public r(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu4/a0$a;->s(Lu4/n;Lu4/q;)V

    return-void
.end method

.method public s(Lu4/n;Lu4/q;)V
    .locals 4

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v2, v1, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v1, v1, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu4/w;

    invoke-direct {v3, p0, v2, p1, p2}, Lu4/w;-><init>(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lu4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu4/a0$a;->u(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public u(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lu4/a0$a;->v(Lu4/n;Lu4/q;)V

    return-void
.end method

.method public v(Lu4/n;Lu4/q;)V
    .locals 4

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v2, v1, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v1, v1, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lu4/u;

    invoke-direct {v3, p0, v2, p1, p2}, Lu4/u;-><init>(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lu4/n;IILs3/m1;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lu4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lu4/a0$a;->h(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    invoke-virtual {p0, p1, v11, v2, v3}, Lu4/a0$a;->y(Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public x(Lu4/n;ILjava/io/IOException;Z)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    invoke-virtual/range {v0 .. v12}, Lu4/a0$a;->w(Lu4/n;IILs3/m1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-void
.end method

.method public y(Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lu4/a0$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/a0$a$a;

    iget-object v4, v1, Lu4/a0$a$a;->b:Lu4/a0;

    iget-object v1, v1, Lu4/a0$a$a;->a:Landroid/os/Handler;

    new-instance v9, Lu4/x;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lu4/x;-><init>(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z(Lu4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lu4/a0$a;->A(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return-void
.end method
