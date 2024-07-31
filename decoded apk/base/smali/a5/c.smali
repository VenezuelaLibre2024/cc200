.class public final La5/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/l;
.implements Lo5/e0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La5/c$b;,
        La5/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La5/l;",
        "Lo5/e0$b<",
        "Lo5/g0<",
        "La5/i;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final w:La5/l$a;


# instance fields
.field public final h:Lz4/g;

.field public final i:La5/k;

.field public final j:Lo5/d0;

.field public final k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/net/Uri;",
            "La5/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La5/l$b;",
            ">;"
        }
    .end annotation
.end field

.field public final m:D

.field public n:Lu4/a0$a;

.field public o:Lo5/e0;

.field public p:Landroid/os/Handler;

.field public q:La5/l$e;

.field public r:La5/h;

.field public s:Landroid/net/Uri;

.field public t:La5/g;

.field public u:Z

.field public v:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, La5/b;->a:La5/b;

    sput-object v0, La5/c;->w:La5/l$a;

    return-void
.end method

.method public constructor <init>(Lz4/g;Lo5/d0;La5/k;)V
    .locals 6

    const-wide/high16 v4, 0x400c000000000000L    # 3.5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, La5/c;-><init>(Lz4/g;Lo5/d0;La5/k;D)V

    return-void
.end method

.method public constructor <init>(Lz4/g;Lo5/d0;La5/k;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/c;->h:Lz4/g;

    iput-object p3, p0, La5/c;->i:La5/k;

    iput-object p2, p0, La5/c;->j:Lo5/d0;

    iput-wide p4, p0, La5/c;->m:D

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La5/c;->k:Ljava/util/HashMap;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, La5/c;->v:J

    return-void
.end method

.method public static synthetic A(La5/c;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, La5/c;->k:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic B(La5/c;)Lz4/g;
    .locals 0

    iget-object p0, p0, La5/c;->h:Lz4/g;

    return-object p0
.end method

.method public static synthetic C(La5/c;)Lu4/a0$a;
    .locals 0

    iget-object p0, p0, La5/c;->n:Lu4/a0$a;

    return-object p0
.end method

.method public static synthetic D(La5/c;)Lo5/d0;
    .locals 0

    iget-object p0, p0, La5/c;->j:Lo5/d0;

    return-object p0
.end method

.method public static F(La5/g;La5/g;)La5/g$d;
    .locals 4

    iget-wide v0, p1, La5/g;->k:J

    iget-wide v2, p0, La5/g;->k:J

    sub-long/2addr v0, v2

    long-to-int p1, v0

    iget-object p0, p0, La5/g;->r:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La5/g$d;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static synthetic n(La5/c;Landroid/net/Uri;Lo5/d0$c;Z)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, La5/c;->N(Landroid/net/Uri;Lo5/d0$c;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic p(La5/c;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, La5/c;->p:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic q(La5/c;)La5/h;
    .locals 0

    iget-object p0, p0, La5/c;->r:La5/h;

    return-object p0
.end method

.method public static synthetic s(La5/c;)La5/k;
    .locals 0

    iget-object p0, p0, La5/c;->i:La5/k;

    return-object p0
.end method

.method public static synthetic t(La5/c;La5/g;La5/g;)La5/g;
    .locals 0

    invoke-virtual {p0, p1, p2}, La5/c;->G(La5/g;La5/g;)La5/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(La5/c;Landroid/net/Uri;La5/g;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La5/c;->R(Landroid/net/Uri;La5/g;)V

    return-void
.end method

.method public static synthetic v(La5/c;)D
    .locals 2

    iget-wide v0, p0, La5/c;->m:D

    return-wide v0
.end method

.method public static synthetic w(La5/c;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, La5/c;->s:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic x(La5/c;)Z
    .locals 0

    invoke-virtual {p0}, La5/c;->L()Z

    move-result p0

    return p0
.end method

.method public static synthetic y(La5/c;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static synthetic z(La5/c;)La5/g;
    .locals 0

    iget-object p0, p0, La5/c;->t:La5/g;

    return-object p0
.end method


# virtual methods
.method public final E(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    new-instance v3, La5/c$c;

    invoke-direct {v3, p0, v2}, La5/c$c;-><init>(La5/c;Landroid/net/Uri;)V

    iget-object v4, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final G(La5/g;La5/g;)La5/g;
    .locals 2

    invoke-virtual {p2, p1}, La5/g;->f(La5/g;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p2, p2, La5/g;->o:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, La5/g;->d()La5/g;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    invoke-virtual {p0, p1, p2}, La5/c;->I(La5/g;La5/g;)J

    move-result-wide v0

    invoke-virtual {p0, p1, p2}, La5/c;->H(La5/g;La5/g;)I

    move-result p1

    invoke-virtual {p2, v0, v1, p1}, La5/g;->c(JI)La5/g;

    move-result-object p1

    return-object p1
.end method

.method public final H(La5/g;La5/g;)I
    .locals 3

    iget-boolean v0, p2, La5/g;->i:Z

    if-eqz v0, :cond_0

    iget p1, p2, La5/g;->j:I

    return p1

    :cond_0
    iget-object v0, p0, La5/c;->t:La5/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, La5/g;->j:I

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez p1, :cond_2

    return v0

    :cond_2
    invoke-static {p1, p2}, La5/c;->F(La5/g;La5/g;)La5/g$d;

    move-result-object v2

    if-eqz v2, :cond_3

    iget p1, p1, La5/g;->j:I

    iget v0, v2, La5/g$e;->k:I

    add-int/2addr p1, v0

    iget-object p2, p2, La5/g;->r:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La5/g$d;

    iget p2, p2, La5/g$e;->k:I

    sub-int/2addr p1, p2

    return p1

    :cond_3
    return v0
.end method

.method public final I(La5/g;La5/g;)J
    .locals 8

    iget-boolean v0, p2, La5/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide p1, p2, La5/g;->h:J

    return-wide p1

    :cond_0
    iget-object v0, p0, La5/c;->t:La5/g;

    if-eqz v0, :cond_1

    iget-wide v0, v0, La5/g;->h:J

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    if-nez p1, :cond_2

    return-wide v0

    :cond_2
    iget-object v2, p1, La5/g;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, p2}, La5/c;->F(La5/g;La5/g;)La5/g$d;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-wide p1, p1, La5/g;->h:J

    iget-wide v0, v3, La5/g$e;->l:J

    add-long/2addr p1, v0

    return-wide p1

    :cond_3
    int-to-long v2, v2

    iget-wide v4, p2, La5/g;->k:J

    iget-wide v6, p1, La5/g;->k:J

    sub-long/2addr v4, v6

    cmp-long p2, v2, v4

    if-nez p2, :cond_4

    invoke-virtual {p1}, La5/g;->e()J

    move-result-wide p1

    return-wide p1

    :cond_4
    return-wide v0
.end method

.method public final J(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 3

    iget-object v0, p0, La5/c;->t:La5/g;

    if-eqz v0, :cond_1

    iget-object v1, v0, La5/g;->v:La5/g$f;

    iget-boolean v1, v1, La5/g$f;->e:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, La5/g;->t:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La5/g$c;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    iget-wide v1, v0, La5/g$c;->b:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_HLS_msn"

    invoke-virtual {p1, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget v0, v0, La5/g$c;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_HLS_part"

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final K(Landroid/net/Uri;)Z
    .locals 4

    iget-object v0, p0, La5/c;->r:La5/h;

    iget-object v0, v0, La5/h;->e:Ljava/util/List;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La5/h$b;

    iget-object v3, v3, La5/h$b;->a:Landroid/net/Uri;

    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final L()Z
    .locals 9

    iget-object v0, p0, La5/c;->r:La5/h;

    iget-object v0, v0, La5/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_1

    iget-object v6, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La5/h$b;

    iget-object v7, v7, La5/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La5/c$c;

    invoke-static {v6}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La5/c$c;

    invoke-static {v6}, La5/c$c;->d(La5/c$c;)J

    move-result-wide v7

    cmp-long v7, v2, v7

    if-lez v7, :cond_0

    invoke-static {v6}, La5/c$c;->e(La5/c$c;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, La5/c;->s:Landroid/net/Uri;

    invoke-virtual {p0, v0}, La5/c;->J(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v6, v0}, La5/c$c;->f(La5/c$c;Landroid/net/Uri;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public final M(Landroid/net/Uri;)V
    .locals 3

    iget-object v0, p0, La5/c;->s:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, La5/c;->K(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La5/c;->t:La5/g;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, La5/g;->o:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, La5/c;->s:Landroid/net/Uri;

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La5/c$c;

    invoke-static {v0}, La5/c$c;->g(La5/c$c;)La5/g;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-boolean v2, v1, La5/g;->o:Z

    if-eqz v2, :cond_1

    iput-object v1, p0, La5/c;->t:La5/g;

    iget-object p1, p0, La5/c;->q:La5/l$e;

    invoke-interface {p1, v1}, La5/l$e;->p(La5/g;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, La5/c;->J(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {v0, p1}, La5/c$c;->f(La5/c$c;Landroid/net/Uri;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final N(Landroid/net/Uri;Lo5/d0$c;Z)Z
    .locals 3

    iget-object v0, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La5/l$b;

    invoke-interface {v2, p1, p2, p3}, La5/l$b;->e(Landroid/net/Uri;Lo5/d0$c;Z)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public O(Lo5/g0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "La5/i;",
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

    iget-object v2, v0, La5/c;->j:Lo5/d0;

    iget-wide v3, v1, Lo5/g0;->a:J

    invoke-interface {v2, v3, v4}, Lo5/d0;->b(J)V

    iget-object v1, v0, La5/c;->n:Lu4/a0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v14, v2}, Lu4/a0$a;->q(Lu4/n;I)V

    return-void
.end method

.method public P(Lo5/g0;JJ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "La5/i;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La5/i;

    instance-of v3, v2, La5/g;

    if-eqz v3, :cond_0

    iget-object v4, v2, La5/i;->a:Ljava/lang/String;

    invoke-static {v4}, La5/h;->e(Ljava/lang/String;)La5/h;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    check-cast v4, La5/h;

    :goto_0
    iput-object v4, v0, La5/c;->r:La5/h;

    iget-object v5, v4, La5/h;->e:Ljava/util/List;

    const/4 v6, 0x0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La5/h$b;

    iget-object v5, v5, La5/h$b;->a:Landroid/net/Uri;

    iput-object v5, v0, La5/c;->s:Landroid/net/Uri;

    iget-object v5, v0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v6, La5/c$b;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v7}, La5/c$b;-><init>(La5/c;La5/c$a;)V

    invoke-virtual {v5, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v4, La5/h;->d:Ljava/util/List;

    invoke-virtual {v0, v4}, La5/c;->E(Ljava/util/List;)V

    new-instance v4, Lu4/n;

    iget-wide v6, v1, Lo5/g0;->a:J

    iget-object v8, v1, Lo5/g0;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->f()Landroid/net/Uri;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->d()Ljava/util/Map;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lo5/g0;->a()J

    move-result-wide v15

    move-object v5, v4

    move-wide/from16 v11, p2

    move-wide/from16 v13, p4

    invoke-direct/range {v5 .. v16}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v5, v0, La5/c;->k:Ljava/util/HashMap;

    iget-object v6, v0, La5/c;->s:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La5/c$c;

    if-eqz v3, :cond_1

    check-cast v2, La5/g;

    invoke-static {v5, v2, v4}, La5/c$c;->c(La5/c$c;La5/g;Lu4/n;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, La5/c$c;->n()V

    :goto_1
    iget-object v2, v0, La5/c;->j:Lo5/d0;

    iget-wide v5, v1, Lo5/g0;->a:J

    invoke-interface {v2, v5, v6}, Lo5/d0;->b(J)V

    iget-object v1, v0, La5/c;->n:Lu4/a0$a;

    const/4 v2, 0x4

    invoke-virtual {v1, v4, v2}, Lu4/a0$a;->t(Lu4/n;I)V

    return-void
.end method

.method public Q(Lo5/g0;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/g0<",
            "La5/i;",
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

    iget-object v4, v0, La5/c;->j:Lo5/d0;

    new-instance v5, Lo5/d0$c;

    move/from16 v6, p7

    invoke-direct {v5, v15, v3, v2, v6}, Lo5/d0$c;-><init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V

    invoke-interface {v4, v5}, Lo5/d0;->a(Lo5/d0$c;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    iget-object v7, v0, La5/c;->n:Lu4/a0$a;

    iget v8, v1, Lo5/g0;->c:I

    invoke-virtual {v7, v15, v8, v2, v5}, Lu4/a0$a;->x(Lu4/n;ILjava/io/IOException;Z)V

    if-eqz v5, :cond_1

    iget-object v2, v0, La5/c;->j:Lo5/d0;

    iget-wide v7, v1, Lo5/g0;->a:J

    invoke-interface {v2, v7, v8}, Lo5/d0;->b(J)V

    :cond_1
    if-eqz v5, :cond_2

    sget-object v1, Lo5/e0;->g:Lo5/e0$c;

    goto :goto_1

    :cond_2
    invoke-static {v6, v3, v4}, Lo5/e0;->h(ZJ)Lo5/e0$c;

    move-result-object v1

    :goto_1
    return-object v1
.end method

.method public final R(Landroid/net/Uri;La5/g;)V
    .locals 2

    iget-object v0, p0, La5/c;->s:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La5/c;->t:La5/g;

    if-nez p1, :cond_0

    iget-boolean p1, p2, La5/g;->o:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, La5/c;->u:Z

    iget-wide v0, p2, La5/g;->h:J

    iput-wide v0, p0, La5/c;->v:J

    :cond_0
    iput-object p2, p0, La5/c;->t:La5/g;

    iget-object p1, p0, La5/c;->q:La5/l$e;

    invoke-interface {p1, p2}, La5/l$e;->p(La5/g;)V

    :cond_1
    iget-object p1, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La5/l$b;

    invoke-interface {p2}, La5/l$b;->a()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Landroid/net/Uri;)Z
    .locals 1

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La5/c$c;

    invoke-virtual {p1}, La5/c$c;->l()Z

    move-result p1

    return p1
.end method

.method public b(La5/l$b;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La5/c$c;

    invoke-virtual {p1}, La5/c$c;->s()V

    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, La5/c;->v:J

    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, La5/c;->u:Z

    return v0
.end method

.method public f()La5/h;
    .locals 1

    iget-object v0, p0, La5/c;->r:La5/h;

    return-object v0
.end method

.method public g(Landroid/net/Uri;J)Z
    .locals 1

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La5/c$c;

    if-eqz p1, :cond_0

    invoke-static {p1, p2, p3}, La5/c$c;->b(La5/c$c;J)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public h(La5/l$b;)V
    .locals 1

    iget-object v0, p0, La5/c;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, La5/c;->o:Lo5/e0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo5/e0;->a()V

    :cond_0
    iget-object v0, p0, La5/c;->s:Landroid/net/Uri;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, La5/c;->c(Landroid/net/Uri;)V

    :cond_1
    return-void
.end method

.method public j(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La5/c$c;

    invoke-virtual {p1}, La5/c$c;->n()V

    return-void
.end method

.method public bridge synthetic k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p7}, La5/c;->Q(Lo5/g0;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public l(Landroid/net/Uri;Lu4/a0$a;La5/l$e;)V
    .locals 7

    invoke-static {}, Lp5/n0;->w()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, La5/c;->p:Landroid/os/Handler;

    iput-object p2, p0, La5/c;->n:Lu4/a0$a;

    iput-object p3, p0, La5/c;->q:La5/l$e;

    new-instance p3, Lo5/g0;

    iget-object v0, p0, La5/c;->h:Lz4/g;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lz4/g;->a(I)Lo5/j;

    move-result-object v0

    iget-object v2, p0, La5/c;->i:La5/k;

    invoke-interface {v2}, La5/k;->b()Lo5/g0$a;

    move-result-object v2

    invoke-direct {p3, v0, p1, v1, v2}, Lo5/g0;-><init>(Lo5/j;Landroid/net/Uri;ILo5/g0$a;)V

    iget-object p1, p0, La5/c;->o:Lo5/e0;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp5/a;->f(Z)V

    new-instance p1, Lo5/e0;

    const-string v0, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    invoke-direct {p1, v0}, Lo5/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, La5/c;->o:Lo5/e0;

    iget-object v0, p0, La5/c;->j:Lo5/d0;

    iget v1, p3, Lo5/g0;->c:I

    invoke-interface {v0, v1}, Lo5/d0;->d(I)I

    move-result v0

    invoke-virtual {p1, p3, p0, v0}, Lo5/e0;->n(Lo5/e0$e;Lo5/e0$b;I)J

    move-result-wide v5

    new-instance p1, Lu4/n;

    iget-wide v2, p3, Lo5/g0;->a:J

    iget-object v4, p3, Lo5/g0;->b:Lo5/n;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lu4/n;-><init>(JLo5/n;J)V

    iget p3, p3, Lo5/g0;->c:I

    invoke-virtual {p2, p1, p3}, Lu4/a0$a;->z(Lu4/n;I)V

    return-void
.end method

.method public m(Landroid/net/Uri;Z)La5/g;
    .locals 1

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La5/c$c;

    invoke-virtual {v0}, La5/c$c;->j()La5/g;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, La5/c;->M(Landroid/net/Uri;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic o(Lo5/e0$e;JJ)V
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p5}, La5/c;->P(Lo5/g0;JJ)V

    return-void
.end method

.method public bridge synthetic r(Lo5/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lo5/g0;

    invoke-virtual/range {p0 .. p6}, La5/c;->O(Lo5/g0;JJZ)V

    return-void
.end method

.method public stop()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, La5/c;->s:Landroid/net/Uri;

    iput-object v0, p0, La5/c;->t:La5/g;

    iput-object v0, p0, La5/c;->r:La5/h;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, La5/c;->v:J

    iget-object v1, p0, La5/c;->o:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->l()V

    iput-object v0, p0, La5/c;->o:Lo5/e0;

    iget-object v1, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La5/c$c;

    invoke-virtual {v2}, La5/c$c;->x()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, La5/c;->p:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, La5/c;->p:Landroid/os/Handler;

    iget-object v0, p0, La5/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
