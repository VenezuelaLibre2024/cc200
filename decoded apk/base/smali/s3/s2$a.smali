.class public final Ls3/s2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/a0;
.implements Lw3/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/s2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ls3/s2$c;

.field public final synthetic b:Ls3/s2;


# direct methods
.method public constructor <init>(Ls3/s2;Ls3/s2$c;)V
    .locals 0

    iput-object p1, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls3/s2$a;->a:Ls3/s2$c;

    return-void
.end method

.method public static synthetic K(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls3/s2$a;->g0(Landroid/util/Pair;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic L(Ls3/s2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/s2$a;->c0(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic M(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls3/s2$a;->e0(Landroid/util/Pair;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic N(Ls3/s2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/s2$a;->X(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic O(Ls3/s2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/s2$a;->Y(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic P(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/s2$a;->h0(Landroid/util/Pair;Lu4/q;)V

    return-void
.end method

.method public static synthetic Q(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ls3/s2$a;->f0(Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic R(Ls3/s2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/s2$a;->Z(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic S(Ls3/s2$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/s2$a;->a0(Landroid/util/Pair;I)V

    return-void
.end method

.method public static synthetic T(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls3/s2$a;->d0(Landroid/util/Pair;Lu4/n;Lu4/q;)V

    return-void
.end method

.method public static synthetic U(Ls3/s2$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/s2$a;->b0(Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic W(Landroid/util/Pair;Lu4/q;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2}, Lu4/a0;->H(ILu4/t$b;Lu4/q;)V

    return-void
.end method

.method private synthetic X(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1}, Lw3/u;->s(ILu4/t$b;)V

    return-void
.end method

.method private synthetic Y(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1}, Lw3/u;->A(ILu4/t$b;)V

    return-void
.end method

.method private synthetic Z(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1}, Lw3/u;->E(ILu4/t$b;)V

    return-void
.end method

.method private synthetic a0(Landroid/util/Pair;I)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2}, Lw3/u;->G(ILu4/t$b;I)V

    return-void
.end method

.method private synthetic b0(Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2}, Lw3/u;->F(ILu4/t$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic c0(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1}, Lw3/u;->t(ILu4/t$b;)V

    return-void
.end method

.method private synthetic d0(Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu4/a0;->J(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic e0(Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu4/a0;->u(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic f0(Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 8

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v1

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu4/t$b;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v1 .. v7}, Lu4/a0;->I(ILu4/t$b;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic g0(Landroid/util/Pair;Lu4/n;Lu4/q;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lu4/a0;->y(ILu4/t$b;Lu4/n;Lu4/q;)V

    return-void
.end method

.method private synthetic h0(Landroid/util/Pair;Lu4/q;)V
    .locals 2

    iget-object v0, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {v0}, Ls3/s2;->e(Ls3/s2;)Lt3/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lu4/t$b;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/t$b;

    invoke-interface {v0, v1, p1, p2}, Lu4/a0;->z(ILu4/t$b;Lu4/q;)V

    return-void
.end method

.method public static synthetic v(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/s2$a;->W(Landroid/util/Pair;Lu4/q;)V

    return-void
.end method


# virtual methods
.method public A(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/k2;

    invoke-direct {v0, p0, p1}, Ls3/k2;-><init>(Ls3/s2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public E(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/l2;

    invoke-direct {v0, p0, p1}, Ls3/l2;-><init>(Ls3/s2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public F(ILu4/t$b;Ljava/lang/Exception;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/n2;

    invoke-direct {v0, p0, p1, p3}, Ls3/n2;-><init>(Ls3/s2$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public G(ILu4/t$b;I)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/m2;

    invoke-direct {v0, p0, p1, p3}, Ls3/m2;-><init>(Ls3/s2$a;Landroid/util/Pair;I)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public H(ILu4/t$b;Lu4/q;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/h2;

    invoke-direct {v0, p0, p1, p3}, Ls3/h2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public I(ILu4/t$b;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 7

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p1}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p1

    new-instance p2, Ls3/r2;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Ls3/r2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public J(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/q2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls3/q2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final V(ILu4/t$b;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu4/t$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lu4/t$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object v1, p0, Ls3/s2$a;->a:Ls3/s2$c;

    invoke-static {v1, p2}, Ls3/s2;->c(Ls3/s2$c;Lu4/t$b;)Lu4/t$b;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    move-object v0, p2

    :cond_1
    iget-object p2, p0, Ls3/s2$a;->a:Ls3/s2$c;

    invoke-static {p2, p1}, Ls3/s2;->d(Ls3/s2$c;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public s(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/j2;

    invoke-direct {v0, p0, p1}, Ls3/j2;-><init>(Ls3/s2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public t(ILu4/t$b;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/g2;

    invoke-direct {v0, p0, p1}, Ls3/g2;-><init>(Ls3/s2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public u(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/p2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls3/p2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public y(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/o2;

    invoke-direct {v0, p0, p1, p3, p4}, Ls3/o2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/n;Lu4/q;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public z(ILu4/t$b;Lu4/q;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Ls3/s2$a;->V(ILu4/t$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ls3/s2$a;->b:Ls3/s2;

    invoke-static {p2}, Ls3/s2;->b(Ls3/s2;)Lp5/n;

    move-result-object p2

    new-instance v0, Ls3/i2;

    invoke-direct {v0, p0, p1, p3}, Ls3/i2;-><init>(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V

    invoke-interface {p2, v0}, Lp5/n;->b(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
