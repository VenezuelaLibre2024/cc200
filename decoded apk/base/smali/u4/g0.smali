.class public final Lu4/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/r;
.implements Lx3/m;
.implements Lo5/e0$b;
.implements Lo5/e0$f;
.implements Lu4/l0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/g0$d;,
        Lu4/g0$e;,
        Lu4/g0$a;,
        Lu4/g0$c;,
        Lu4/g0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu4/r;",
        "Lx3/m;",
        "Lo5/e0$b<",
        "Lu4/g0$a;",
        ">;",
        "Lo5/e0$f;",
        "Lu4/l0$d;"
    }
.end annotation


# static fields
.field public static final T:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final U:Ls3/m1;


# instance fields
.field public A:[Lu4/g0$d;

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Lu4/g0$e;

.field public F:Lx3/z;

.field public G:J

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public L:I

.field public M:Z

.field public N:J

.field public O:J

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:Z

.field public final h:Landroid/net/Uri;

.field public final i:Lo5/j;

.field public final j:Lw3/v;

.field public final k:Lo5/d0;

.field public final l:Lu4/a0$a;

.field public final m:Lw3/u$a;

.field public final n:Lu4/g0$b;

.field public final o:Lo5/b;

.field public final p:Ljava/lang/String;

.field public final q:J

.field public final r:Lo5/e0;

.field public final s:Lu4/b0;

.field public final t:Lp5/g;

.field public final u:Ljava/lang/Runnable;

.field public final v:Ljava/lang/Runnable;

.field public final w:Landroid/os/Handler;

.field public x:Lu4/r$a;

.field public y:Lo4/b;

.field public z:[Lu4/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lu4/g0;->K()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lu4/g0;->T:Ljava/util/Map;

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    const-string v1, "icy"

    invoke-virtual {v0, v1}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    sput-object v0, Lu4/g0;->U:Ls3/m1;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lo5/j;Lu4/b0;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;Lu4/g0$b;Lo5/b;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/g0;->h:Landroid/net/Uri;

    iput-object p2, p0, Lu4/g0;->i:Lo5/j;

    iput-object p4, p0, Lu4/g0;->j:Lw3/v;

    iput-object p5, p0, Lu4/g0;->m:Lw3/u$a;

    iput-object p6, p0, Lu4/g0;->k:Lo5/d0;

    iput-object p7, p0, Lu4/g0;->l:Lu4/a0$a;

    iput-object p8, p0, Lu4/g0;->n:Lu4/g0$b;

    iput-object p9, p0, Lu4/g0;->o:Lo5/b;

    iput-object p10, p0, Lu4/g0;->p:Ljava/lang/String;

    int-to-long p1, p11

    iput-wide p1, p0, Lu4/g0;->q:J

    new-instance p1, Lo5/e0;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lo5/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lu4/g0;->r:Lo5/e0;

    iput-object p3, p0, Lu4/g0;->s:Lu4/b0;

    new-instance p1, Lp5/g;

    invoke-direct {p1}, Lp5/g;-><init>()V

    iput-object p1, p0, Lu4/g0;->t:Lp5/g;

    new-instance p1, Lu4/c0;

    invoke-direct {p1, p0}, Lu4/c0;-><init>(Lu4/g0;)V

    iput-object p1, p0, Lu4/g0;->u:Ljava/lang/Runnable;

    new-instance p1, Lu4/e0;

    invoke-direct {p1, p0}, Lu4/e0;-><init>(Lu4/g0;)V

    iput-object p1, p0, Lu4/g0;->v:Ljava/lang/Runnable;

    invoke-static {}, Lp5/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lu4/g0;->w:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lu4/g0$d;

    iput-object p2, p0, Lu4/g0;->A:[Lu4/g0$d;

    new-array p1, p1, [Lu4/l0;

    iput-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu4/g0;->O:J

    iput-wide p1, p0, Lu4/g0;->G:J

    const/4 p1, 0x1

    iput p1, p0, Lu4/g0;->I:I

    return-void
.end method

.method public static synthetic A(Lu4/g0;Z)J
    .locals 0

    invoke-virtual {p0, p1}, Lu4/g0;->M(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic B()Ljava/util/Map;
    .locals 1

    sget-object v0, Lu4/g0;->T:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic C(Lu4/g0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lu4/g0;->p:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic D(Lu4/g0;)V
    .locals 0

    invoke-virtual {p0}, Lu4/g0;->Y()V

    return-void
.end method

.method public static synthetic E(Lu4/g0;)Lo4/b;
    .locals 0

    iget-object p0, p0, Lu4/g0;->y:Lo4/b;

    return-object p0
.end method

.method public static synthetic F(Lu4/g0;Lo4/b;)Lo4/b;
    .locals 0

    iput-object p1, p0, Lu4/g0;->y:Lo4/b;

    return-object p1
.end method

.method public static synthetic G()Ls3/m1;
    .locals 1

    sget-object v0, Lu4/g0;->U:Ls3/m1;

    return-object v0
.end method

.method public static synthetic H(Lu4/g0;)J
    .locals 2

    iget-wide v0, p0, Lu4/g0;->q:J

    return-wide v0
.end method

.method public static K()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private synthetic Q()V
    .locals 1

    iget-boolean v0, p0, Lu4/g0;->S:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu4/g0;->x:Lu4/r$a;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r$a;

    invoke-interface {v0, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_0
    return-void
.end method

.method private synthetic R()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/g0;->M:Z

    return-void
.end method

.method private synthetic S(Lx3/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Lu4/g0;->g0(Lx3/z;)V

    return-void
.end method

.method public static synthetic u(Lu4/g0;)V
    .locals 0

    invoke-virtual {p0}, Lu4/g0;->T()V

    return-void
.end method

.method public static synthetic v(Lu4/g0;)V
    .locals 0

    invoke-direct {p0}, Lu4/g0;->R()V

    return-void
.end method

.method public static synthetic w(Lu4/g0;Lx3/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lu4/g0;->S(Lx3/z;)V

    return-void
.end method

.method public static synthetic x(Lu4/g0;)V
    .locals 0

    invoke-direct {p0}, Lu4/g0;->Q()V

    return-void
.end method

.method public static synthetic y(Lu4/g0;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lu4/g0;->v:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic z(Lu4/g0;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lu4/g0;->w:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final I()V
    .locals 1

    iget-boolean v0, p0, Lu4/g0;->C:Z

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/g0;->F:Lx3/z;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final J(Lu4/g0$a;I)Z
    .locals 6

    iget-boolean v0, p0, Lu4/g0;->M:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lu4/g0;->F:Lx3/z;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx3/z;->d()J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean p2, p0, Lu4/g0;->C:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lu4/g0;->j0()Z

    move-result p2

    if-nez p2, :cond_1

    iput-boolean v1, p0, Lu4/g0;->P:Z

    return v0

    :cond_1
    iget-boolean p2, p0, Lu4/g0;->C:Z

    iput-boolean p2, p0, Lu4/g0;->K:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lu4/g0;->N:J

    iput v0, p0, Lu4/g0;->Q:I

    iget-object p2, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v4, p2

    :goto_0
    if-ge v0, v4, :cond_2

    aget-object v5, p2, v0

    invoke-virtual {v5}, Lu4/l0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {p1, v2, v3, v2, v3}, Lu4/g0$a;->h(Lu4/g0$a;JJ)V

    return v1

    :cond_3
    :goto_1
    iput p2, p0, Lu4/g0;->Q:I

    return v1
.end method

.method public final L()I
    .locals 5

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lu4/l0;->G()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final M(Z)J
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    if-nez p1, :cond_0

    iget-object v3, p0, Lu4/g0;->E:Lu4/g0$e;

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu4/g0$e;

    iget-object v3, v3, Lu4/g0$e;->c:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lu4/l0;->z()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public N()Lx3/b0;
    .locals 3

    new-instance v0, Lu4/g0$d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lu4/g0$d;-><init>(IZ)V

    invoke-virtual {p0, v0}, Lu4/g0;->c0(Lu4/g0$d;)Lx3/b0;

    move-result-object v0

    return-object v0
.end method

.method public final O()Z
    .locals 4

    iget-wide v0, p0, Lu4/g0;->O:J

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

.method public P(I)Z
    .locals 1

    invoke-virtual {p0}, Lu4/g0;->j0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lu4/g0;->R:Z

    invoke-virtual {p1, v0}, Lu4/l0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final T()V
    .locals 11

    iget-boolean v0, p0, Lu4/g0;->S:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lu4/g0;->C:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lu4/g0;->B:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lu4/g0;->F:Lx3/z;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lu4/l0;->F()Ls3/m1;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lu4/g0;->t:Lp5/g;

    invoke-virtual {v0}, Lp5/g;->c()Z

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v0, v0

    new-array v1, v0, [Lu4/s0;

    new-array v3, v0, [Z

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v0, :cond_9

    iget-object v6, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v6, v6, v4

    invoke-virtual {v6}, Lu4/l0;->F()Ls3/m1;

    move-result-object v6

    invoke-static {v6}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls3/m1;

    iget-object v7, v6, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v7}, Lp5/v;->o(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lp5/v;->s(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move v7, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v7, v5

    :goto_3
    aput-boolean v7, v3, v4

    iget-boolean v9, p0, Lu4/g0;->D:Z

    or-int/2addr v7, v9

    iput-boolean v7, p0, Lu4/g0;->D:Z

    iget-object v7, p0, Lu4/g0;->y:Lo4/b;

    if-eqz v7, :cond_8

    if-nez v8, :cond_5

    iget-object v9, p0, Lu4/g0;->A:[Lu4/g0$d;

    aget-object v9, v9, v4

    iget-boolean v9, v9, Lu4/g0$d;->b:Z

    if-eqz v9, :cond_7

    :cond_5
    iget-object v9, v6, Ls3/m1;->q:Lk4/a;

    if-nez v9, :cond_6

    new-instance v9, Lk4/a;

    new-array v10, v5, [Lk4/a$b;

    aput-object v7, v10, v2

    invoke-direct {v9, v10}, Lk4/a;-><init>([Lk4/a$b;)V

    goto :goto_4

    :cond_6
    new-array v10, v5, [Lk4/a$b;

    aput-object v7, v10, v2

    invoke-virtual {v9, v10}, Lk4/a;->a([Lk4/a$b;)Lk4/a;

    move-result-object v9

    :goto_4
    invoke-virtual {v6}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6, v9}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v6

    :cond_7
    if-eqz v8, :cond_8

    iget v8, v6, Ls3/m1;->m:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_8

    iget v8, v6, Ls3/m1;->n:I

    if-ne v8, v9, :cond_8

    iget v8, v7, Lo4/b;->h:I

    if-eq v8, v9, :cond_8

    invoke-virtual {v6}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v6

    iget v7, v7, Lo4/b;->h:I

    invoke-virtual {v6, v7}, Ls3/m1$b;->I(I)Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v6

    :cond_8
    iget-object v7, p0, Lu4/g0;->j:Lw3/v;

    invoke-interface {v7, v6}, Lw3/v;->e(Ls3/m1;)I

    move-result v7

    invoke-virtual {v6, v7}, Ls3/m1;->c(I)Ls3/m1;

    move-result-object v6

    new-instance v7, Lu4/s0;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    new-array v5, v5, [Ls3/m1;

    aput-object v6, v5, v2

    invoke-direct {v7, v8, v5}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v7, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lu4/g0$e;

    new-instance v2, Lu4/u0;

    invoke-direct {v2, v1}, Lu4/u0;-><init>([Lu4/s0;)V

    invoke-direct {v0, v2, v3}, Lu4/g0$e;-><init>(Lu4/u0;[Z)V

    iput-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iput-boolean v5, p0, Lu4/g0;->C:Z

    iget-object v0, p0, Lu4/g0;->x:Lu4/r$a;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r$a;

    invoke-interface {v0, p0}, Lu4/r$a;->k(Lu4/r;)V

    :cond_a
    :goto_5
    return-void
.end method

.method public final U(I)V
    .locals 10

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v1, v0, Lu4/g0$e;->d:[Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lu4/g0$e;->a:Lu4/u0;

    invoke-virtual {v0, p1}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v5

    iget-object v3, p0, Lu4/g0;->l:Lu4/a0$a;

    iget-object v0, v5, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/v;->k(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-wide v8, p0, Lu4/g0;->N:J

    invoke-virtual/range {v3 .. v9}, Lu4/a0$a;->i(ILs3/m1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method public final V(I)V
    .locals 3

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v0, v0, Lu4/g0$e;->b:[Z

    iget-boolean v1, p0, Lu4/g0;->P:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lu4/l0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lu4/g0;->O:J

    iput-boolean v0, p0, Lu4/g0;->P:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu4/g0;->K:Z

    iput-wide v1, p0, Lu4/g0;->N:J

    iput v0, p0, Lu4/g0;->Q:I

    iget-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    invoke-virtual {v2}, Lu4/l0;->V()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu4/g0;->x:Lu4/r$a;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public W()V
    .locals 3

    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    iget-object v1, p0, Lu4/g0;->k:Lo5/d0;

    iget v2, p0, Lu4/g0;->I:I

    invoke-interface {v1, v2}, Lo5/d0;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo5/e0;->k(I)V

    return-void
.end method

.method public X(I)V
    .locals 1

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lu4/l0;->N()V

    invoke-virtual {p0}, Lu4/g0;->W()V

    return-void
.end method

.method public final Y()V
    .locals 2

    iget-object v0, p0, Lu4/g0;->w:Landroid/os/Handler;

    new-instance v1, Lu4/d0;

    invoke-direct {v1, p0}, Lu4/d0;-><init>(Lu4/g0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public Z(Lu4/g0$a;JJZ)V
    .locals 15

    move-object v0, p0

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->d(Lu4/g0$a;)Lo5/l0;

    move-result-object v1

    new-instance v14, Lu4/n;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->f(Lu4/g0$a;)Lo5/n;

    move-result-object v5

    invoke-virtual {v1}, Lo5/l0;->r()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Lo5/l0;->s()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Lo5/l0;->q()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lu4/g0;->k:Lo5/d0;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lo5/d0;->b(J)V

    iget-object v2, v0, Lu4/g0;->l:Lu4/a0$a;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->g(Lu4/g0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lu4/g0;->G:J

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v14

    invoke-virtual/range {v2 .. v12}, Lu4/a0$a;->r(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    iget-object v1, v0, Lu4/g0;->z:[Lu4/l0;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lu4/l0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lu4/g0;->L:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lu4/g0;->x:Lu4/r$a;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/r$a;

    invoke-interface {v1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_1
    return-void
.end method

.method public a(Ls3/m1;)V
    .locals 1

    iget-object p1, p0, Lu4/g0;->w:Landroid/os/Handler;

    iget-object v0, p0, Lu4/g0;->u:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a0(Lu4/g0$a;JJ)V
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lu4/g0;->G:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, v0, Lu4/g0;->F:Lx3/z;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lx3/z;->f()Z

    move-result v1

    invoke-virtual {v0, v2}, Lu4/g0;->M(Z)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x2710

    add-long/2addr v3, v5

    :goto_0
    iput-wide v3, v0, Lu4/g0;->G:J

    iget-object v5, v0, Lu4/g0;->n:Lu4/g0$b;

    iget-boolean v6, v0, Lu4/g0;->H:Z

    invoke-interface {v5, v3, v4, v1, v6}, Lu4/g0$b;->f(JZZ)V

    :cond_1
    invoke-static/range {p1 .. p1}, Lu4/g0$a;->d(Lu4/g0$a;)Lo5/l0;

    move-result-object v1

    new-instance v15, Lu4/n;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v4

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->f(Lu4/g0$a;)Lo5/n;

    move-result-object v6

    invoke-virtual {v1}, Lo5/l0;->r()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v1}, Lo5/l0;->s()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v1}, Lo5/l0;->q()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v1, v0, Lu4/g0;->k:Lo5/d0;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lo5/d0;->b(J)V

    iget-object v3, v0, Lu4/g0;->l:Lu4/a0$a;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->g(Lu4/g0$a;)J

    move-result-wide v10

    iget-wide v12, v0, Lu4/g0;->G:J

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lu4/a0$a;->u(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    iput-boolean v2, v0, Lu4/g0;->R:Z

    iget-object v1, v0, Lu4/g0;->x:Lu4/r$a;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/r$a;

    invoke-interface {v1, v0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lu4/g0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public b0(Lu4/g0$a;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 25

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->d(Lu4/g0$a;)Lo5/l0;

    move-result-object v1

    new-instance v14, Lu4/n;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->f(Lu4/g0$a;)Lo5/n;

    move-result-object v5

    invoke-virtual {v1}, Lo5/l0;->r()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1}, Lo5/l0;->s()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1}, Lo5/l0;->q()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v1, Lu4/q;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->g(Lu4/g0$a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lp5/n0;->Y0(J)J

    move-result-wide v21

    iget-wide v2, v0, Lu4/g0;->G:J

    invoke-static {v2, v3}, Lp5/n0;->Y0(J)J

    move-result-wide v23

    const/16 v16, 0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v15, v1

    invoke-direct/range {v15 .. v24}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    iget-object v2, v0, Lu4/g0;->k:Lo5/d0;

    new-instance v3, Lo5/d0$c;

    move-object/from16 v13, p6

    move/from16 v4, p7

    invoke-direct {v3, v14, v1, v13, v4}, Lo5/d0$c;-><init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V

    invoke-interface {v2, v3}, Lo5/d0;->a(Lo5/d0$c;)J

    move-result-wide v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    sget-object v1, Lo5/e0;->g:Lo5/e0$c;

    move-object/from16 v15, p1

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lu4/g0;->L()I

    move-result v3

    iget v5, v0, Lu4/g0;->Q:I

    if-le v3, v5, :cond_1

    move-object/from16 v15, p1

    move v5, v4

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    move-object/from16 v15, p1

    :goto_0
    invoke-virtual {v0, v15, v3}, Lu4/g0;->J(Lu4/g0$a;I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v5, v1, v2}, Lo5/e0;->h(ZJ)Lo5/e0$c;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v1, Lo5/e0;->f:Lo5/e0$c;

    :goto_1
    invoke-virtual {v1}, Lo5/e0$c;->c()Z

    move-result v2

    xor-int/lit8 v16, v2, 0x1

    iget-object v2, v0, Lu4/g0;->l:Lu4/a0$a;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->g(Lu4/g0$a;)J

    move-result-wide v9

    iget-wide v11, v0, Lu4/g0;->G:J

    move-object v3, v14

    move-object/from16 v13, p6

    move/from16 v14, v16

    invoke-virtual/range {v2 .. v14}, Lu4/a0$a;->w(Lu4/n;IILs3/m1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v16, :cond_3

    iget-object v2, v0, Lu4/g0;->k:Lo5/d0;

    invoke-static/range {p1 .. p1}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, Lo5/d0;->b(J)V

    :cond_3
    return-object v1
.end method

.method public c(J)Z
    .locals 0

    iget-boolean p1, p0, Lu4/g0;->R:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lu4/g0;->P:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lu4/g0;->C:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lu4/g0;->L:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu4/g0;->t:Lp5/g;

    invoke-virtual {p1}, Lp5/g;->e()Z

    move-result p1

    iget-object p2, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {p2}, Lo5/e0;->j()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lu4/g0;->i0()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c0(Lu4/g0$d;)Lx3/b0;
    .locals 4

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lu4/g0;->A:[Lu4/g0$d;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lu4/g0$d;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lu4/g0;->o:Lo5/b;

    iget-object v2, p0, Lu4/g0;->j:Lw3/v;

    iget-object v3, p0, Lu4/g0;->m:Lw3/u$a;

    invoke-static {v1, v2, v3}, Lu4/l0;->k(Lo5/b;Lw3/v;Lw3/u$a;)Lu4/l0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lu4/l0;->d0(Lu4/l0$d;)V

    iget-object v2, p0, Lu4/g0;->A:[Lu4/g0$d;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lu4/g0$d;

    aput-object p1, v2, v0

    invoke-static {v2}, Lp5/n0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lu4/g0$d;

    iput-object p1, p0, Lu4/g0;->A:[Lu4/g0$d;

    iget-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lu4/l0;

    aput-object v1, p1, v0

    invoke-static {p1}, Lp5/n0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lu4/l0;

    iput-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    return-object v1
.end method

.method public d(JLs3/m3;)J
    .locals 9

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->F:Lx3/z;

    invoke-interface {v0}, Lx3/z;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lu4/g0;->F:Lx3/z;

    invoke-interface {v0, p1, p2}, Lx3/z;->i(J)Lx3/z$a;

    move-result-object v0

    iget-object v1, v0, Lx3/z$a;->a:Lx3/a0;

    iget-wide v5, v1, Lx3/a0;->a:J

    iget-object v0, v0, Lx3/z$a;->b:Lx3/a0;

    iget-wide v7, v0, Lx3/a0;->a:J

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v2 .. v8}, Ls3/m3;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public d0(ILs3/n1;Lv3/g;I)I
    .locals 3

    invoke-virtual {p0}, Lu4/g0;->j0()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lu4/g0;->U(I)V

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lu4/g0;->R:Z

    invoke-virtual {v0, p2, p3, p4, v2}, Lu4/l0;->S(Ls3/n1;Lv3/g;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p1}, Lu4/g0;->V(I)V

    :cond_1
    return p2
.end method

.method public e(II)Lx3/b0;
    .locals 1

    new-instance p2, Lu4/g0$d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lu4/g0$d;-><init>(IZ)V

    invoke-virtual {p0, p2}, Lu4/g0;->c0(Lu4/g0$d;)Lx3/b0;

    move-result-object p1

    return-object p1
.end method

.method public e0()V
    .locals 4

    iget-boolean v0, p0, Lu4/g0;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {v0, p0}, Lo5/e0;->m(Lo5/e0$f;)V

    iget-object v0, p0, Lu4/g0;->w:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lu4/g0;->x:Lu4/r$a;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/g0;->S:Z

    return-void
.end method

.method public f()J
    .locals 11

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-boolean v0, p0, Lu4/g0;->R:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Lu4/g0;->L:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lu4/g0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lu4/g0;->O:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lu4/g0;->D:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v0, v0

    move v6, v3

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v10, v9, Lu4/g0$e;->b:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Lu4/g0$e;->c:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lu4/l0;->J()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lu4/l0;->z()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-virtual {p0, v3}, Lu4/g0;->M(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v7, p0, Lu4/g0;->N:J

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public final f0([ZJ)Z
    .locals 4

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v3, v3, v2

    invoke-virtual {v3, p2, p3, v1}, Lu4/l0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    aget-boolean v3, p1, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lu4/g0;->D:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public g(J)V
    .locals 0

    return-void
.end method

.method public final g0(Lx3/z;)V
    .locals 6

    iget-object v0, p0, Lu4/g0;->y:Lo4/b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Lx3/z$b;

    invoke-direct {v0, v1, v2}, Lx3/z$b;-><init>(J)V

    :goto_0
    iput-object v0, p0, Lu4/g0;->F:Lx3/z;

    invoke-interface {p1}, Lx3/z;->d()J

    move-result-wide v3

    iput-wide v3, p0, Lu4/g0;->G:J

    iget-boolean v0, p0, Lu4/g0;->M:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Lx3/z;->d()J

    move-result-wide v4

    cmp-long v0, v4, v1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lu4/g0;->H:Z

    if-eqz v0, :cond_2

    const/4 v3, 0x7

    :cond_2
    iput v3, p0, Lu4/g0;->I:I

    iget-object v0, p0, Lu4/g0;->n:Lu4/g0$b;

    iget-wide v1, p0, Lu4/g0;->G:J

    invoke-interface {p1}, Lx3/z;->f()Z

    move-result p1

    iget-boolean v3, p0, Lu4/g0;->H:Z

    invoke-interface {v0, v1, v2, p1, v3}, Lu4/g0$b;->f(JZZ)V

    iget-boolean p1, p0, Lu4/g0;->C:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lu4/g0;->T()V

    :cond_3
    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu4/g0;->s:Lu4/b0;

    invoke-interface {v0}, Lu4/b0;->release()V

    return-void
.end method

.method public h0(IJ)I
    .locals 2

    invoke-virtual {p0}, Lu4/g0;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lu4/g0;->U(I)V

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lu4/g0;->R:Z

    invoke-virtual {v0, p2, p3, v1}, Lu4/l0;->E(JZ)I

    move-result p2

    invoke-virtual {v0, p2}, Lu4/l0;->e0(I)V

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lu4/g0;->V(I)V

    :cond_1
    return p2
.end method

.method public i(Lu4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lu4/g0;->x:Lu4/r$a;

    iget-object p1, p0, Lu4/g0;->t:Lp5/g;

    invoke-virtual {p1}, Lp5/g;->e()Z

    invoke-virtual {p0}, Lu4/g0;->i0()V

    return-void
.end method

.method public final i0()V
    .locals 26

    move-object/from16 v7, p0

    new-instance v8, Lu4/g0$a;

    iget-object v2, v7, Lu4/g0;->h:Landroid/net/Uri;

    iget-object v3, v7, Lu4/g0;->i:Lo5/j;

    iget-object v4, v7, Lu4/g0;->s:Lu4/b0;

    iget-object v6, v7, Lu4/g0;->t:Lp5/g;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v6}, Lu4/g0$a;-><init>(Lu4/g0;Landroid/net/Uri;Lo5/j;Lu4/b0;Lx3/m;Lp5/g;)V

    iget-boolean v0, v7, Lu4/g0;->C:Z

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lu4/g0;->O()Z

    move-result v0

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-wide v0, v7, Lu4/g0;->G:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, v7, Lu4/g0;->O:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, v7, Lu4/g0;->R:Z

    iput-wide v2, v7, Lu4/g0;->O:J

    return-void

    :cond_0
    iget-object v0, v7, Lu4/g0;->F:Lx3/z;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/z;

    iget-wide v4, v7, Lu4/g0;->O:J

    invoke-interface {v0, v4, v5}, Lx3/z;->i(J)Lx3/z$a;

    move-result-object v0

    iget-object v0, v0, Lx3/z$a;->a:Lx3/a0;

    iget-wide v0, v0, Lx3/a0;->b:J

    iget-wide v4, v7, Lu4/g0;->O:J

    invoke-static {v8, v0, v1, v4, v5}, Lu4/g0$a;->h(Lu4/g0$a;JJ)V

    iget-object v0, v7, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, v0, v4

    iget-wide v9, v7, Lu4/g0;->O:J

    invoke-virtual {v5, v9, v10}, Lu4/l0;->b0(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput-wide v2, v7, Lu4/g0;->O:J

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lu4/g0;->L()I

    move-result v0

    iput v0, v7, Lu4/g0;->Q:I

    iget-object v0, v7, Lu4/g0;->r:Lo5/e0;

    iget-object v1, v7, Lu4/g0;->k:Lo5/d0;

    iget v2, v7, Lu4/g0;->I:I

    invoke-interface {v1, v2}, Lo5/d0;->d(I)I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Lo5/e0;->n(Lo5/e0$e;Lo5/e0$b;I)J

    move-result-wide v13

    invoke-static {v8}, Lu4/g0$a;->f(Lu4/g0$a;)Lo5/n;

    move-result-object v12

    iget-object v15, v7, Lu4/g0;->l:Lu4/a0$a;

    new-instance v16, Lu4/n;

    invoke-static {v8}, Lu4/g0$a;->e(Lu4/g0$a;)J

    move-result-wide v10

    move-object/from16 v9, v16

    invoke-direct/range {v9 .. v14}, Lu4/n;-><init>(JLo5/n;J)V

    const/16 v17, 0x1

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static {v8}, Lu4/g0$a;->g(Lu4/g0$a;)J

    move-result-wide v22

    iget-wide v0, v7, Lu4/g0;->G:J

    move-wide/from16 v24, v0

    invoke-virtual/range {v15 .. v25}, Lu4/a0$a;->A(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/g0;->t:Lp5/g;

    invoke-virtual {v0}, Lp5/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Lx3/z;)V
    .locals 2

    iget-object v0, p0, Lu4/g0;->w:Landroid/os/Handler;

    new-instance v1, Lu4/f0;

    invoke-direct {v1, p0, p1}, Lu4/f0;-><init>(Lu4/g0;Lx3/z;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final j0()Z
    .locals 1

    iget-boolean v0, p0, Lu4/g0;->K:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lu4/g0;->O()Z

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
    return v0
.end method

.method public bridge synthetic k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    check-cast p1, Lu4/g0$a;

    invoke-virtual/range {p0 .. p7}, Lu4/g0;->b0(Lu4/g0$a;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public l()V
    .locals 2

    invoke-virtual {p0}, Lu4/g0;->W()V

    iget-boolean v0, p0, Lu4/g0;->R:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu4/g0;->C:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public m(J)J
    .locals 4

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v0, v0, Lu4/g0$e;->b:[Z

    iget-object v1, p0, Lu4/g0;->F:Lx3/z;

    invoke-interface {v1}, Lx3/z;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lu4/g0;->K:Z

    iput-wide p1, p0, Lu4/g0;->N:J

    invoke-virtual {p0}, Lu4/g0;->O()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide p1, p0, Lu4/g0;->O:J

    return-wide p1

    :cond_1
    iget v2, p0, Lu4/g0;->I:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_2

    invoke-virtual {p0, v0, p1, p2}, Lu4/g0;->f0([ZJ)Z

    move-result v0

    if-eqz v0, :cond_2

    return-wide p1

    :cond_2
    iput-boolean v1, p0, Lu4/g0;->P:Z

    iput-wide p1, p0, Lu4/g0;->O:J

    iput-boolean v1, p0, Lu4/g0;->R:Z

    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lu4/l0;->r()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->f()V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->g()V

    iget-object v0, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v2, v0

    :goto_2
    if-ge v1, v2, :cond_5

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lu4/l0;->V()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    return-wide p1
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/g0;->B:Z

    iget-object v0, p0, Lu4/g0;->w:Landroid/os/Handler;

    iget-object v1, p0, Lu4/g0;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic o(Lo5/e0$e;JJ)V
    .locals 0

    check-cast p1, Lu4/g0$a;

    invoke-virtual/range {p0 .. p5}, Lu4/g0;->a0(Lu4/g0$a;JJ)V

    return-void
.end method

.method public p()J
    .locals 2

    iget-boolean v0, p0, Lu4/g0;->K:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lu4/g0;->R:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu4/g0;->L()I

    move-result v0

    iget v1, p0, Lu4/g0;->Q:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lu4/g0;->K:Z

    iget-wide v0, p0, Lu4/g0;->N:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public q([Ln5/s;[Z[Lu4/m0;[ZJ)J
    .locals 8

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v1, v0, Lu4/g0$e;->a:Lu4/u0;

    iget-object v0, v0, Lu4/g0$e;->c:[Z

    iget v2, p0, Lu4/g0;->L:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v5, p1, v4

    if-eqz v5, :cond_0

    aget-boolean v5, p2, v4

    if-nez v5, :cond_1

    :cond_0
    aget-object v5, p3, v4

    check-cast v5, Lu4/g0$c;

    invoke-static {v5}, Lu4/g0$c;->b(Lu4/g0$c;)I

    move-result v5

    aget-boolean v7, v0, v5

    invoke-static {v7}, Lp5/a;->f(Z)V

    iget v7, p0, Lu4/g0;->L:I

    sub-int/2addr v7, v6

    iput v7, p0, Lu4/g0;->L:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lu4/g0;->J:Z

    if-eqz p2, :cond_3

    if-nez v2, :cond_4

    goto :goto_1

    :cond_3
    const-wide/16 v4, 0x0

    cmp-long p2, p5, v4

    if-eqz p2, :cond_4

    :goto_1
    move p2, v6

    goto :goto_2

    :cond_4
    move p2, v3

    :goto_2
    move v2, v3

    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_9

    aget-object v4, p3, v2

    if-nez v4, :cond_8

    aget-object v4, p1, v2

    if-eqz v4, :cond_8

    aget-object v4, p1, v2

    invoke-interface {v4}, Ln5/v;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v5}, Lp5/a;->f(Z)V

    invoke-interface {v4, v3}, Ln5/v;->d(I)I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    move v5, v3

    :goto_5
    invoke-static {v5}, Lp5/a;->f(Z)V

    invoke-interface {v4}, Ln5/v;->b()Lu4/s0;

    move-result-object v4

    invoke-virtual {v1, v4}, Lu4/u0;->c(Lu4/s0;)I

    move-result v4

    aget-boolean v5, v0, v4

    xor-int/2addr v5, v6

    invoke-static {v5}, Lp5/a;->f(Z)V

    iget v5, p0, Lu4/g0;->L:I

    add-int/2addr v5, v6

    iput v5, p0, Lu4/g0;->L:I

    aput-boolean v6, v0, v4

    new-instance v5, Lu4/g0$c;

    invoke-direct {v5, p0, v4}, Lu4/g0$c;-><init>(Lu4/g0;I)V

    aput-object v5, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_8

    iget-object p2, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object p2, p2, v4

    invoke-virtual {p2, p5, p6, v6}, Lu4/l0;->Z(JZ)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {p2}, Lu4/l0;->C()I

    move-result p2

    if-eqz p2, :cond_7

    move p2, v6

    goto :goto_6

    :cond_7
    move p2, v3

    :cond_8
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    iget p1, p0, Lu4/g0;->L:I

    if-nez p1, :cond_c

    iput-boolean v3, p0, Lu4/g0;->P:Z

    iput-boolean v3, p0, Lu4/g0;->K:Z

    iget-object p1, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    array-length p2, p1

    :goto_7
    if-ge v3, p2, :cond_a

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lu4/l0;->r()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    iget-object p1, p0, Lu4/g0;->r:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->f()V

    goto :goto_a

    :cond_b
    iget-object p1, p0, Lu4/g0;->z:[Lu4/l0;

    array-length p2, p1

    :goto_8
    if-ge v3, p2, :cond_e

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lu4/l0;->V()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p0, p5, p6}, Lu4/g0;->m(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_e

    aget-object p1, p3, v3

    if-eqz p1, :cond_d

    aput-boolean v6, p4, v3

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_e
    :goto_a
    iput-boolean v6, p0, Lu4/g0;->J:Z

    return-wide p5
.end method

.method public bridge synthetic r(Lo5/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lu4/g0$a;

    invoke-virtual/range {p0 .. p6}, Lu4/g0;->Z(Lu4/g0$a;JJZ)V

    return-void
.end method

.method public s()Lu4/u0;
    .locals 1

    invoke-virtual {p0}, Lu4/g0;->I()V

    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v0, v0, Lu4/g0$e;->a:Lu4/u0;

    return-object v0
.end method

.method public t(JZ)V
    .locals 5

    invoke-virtual {p0}, Lu4/g0;->I()V

    invoke-virtual {p0}, Lu4/g0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu4/g0;->E:Lu4/g0$e;

    iget-object v0, v0, Lu4/g0$e;->c:[Z

    iget-object v1, p0, Lu4/g0;->z:[Lu4/l0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lu4/g0;->z:[Lu4/l0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, p3, v4}, Lu4/l0;->q(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
