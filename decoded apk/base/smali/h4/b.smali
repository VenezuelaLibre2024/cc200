.class public final Lh4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final d:Lx3/p;


# instance fields
.field public final a:Lh4/c;

.field public final b:Lp5/a0;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh4/a;->b:Lh4/a;

    sput-object v0, Lh4/b;->d:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    iput-object v0, p0, Lh4/b;->a:Lh4/c;

    new-instance v0, Lp5/a0;

    const/16 v1, 0xae2

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    iput-object v0, p0, Lh4/b;->b:Lp5/a0;

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Lh4/b;->d()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lh4/b;

    invoke-direct {v1}, Lh4/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 4

    iget-object v0, p0, Lh4/b;->a:Lh4/c;

    new-instance v1, Lh4/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lh4/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Lh4/c;->e(Lx3/m;Lh4/i0$d;)V

    invoke-interface {p1}, Lx3/m;->n()V

    new-instance v0, Lx3/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lx3/z$b;-><init>(J)V

    invoke-interface {p1, v0}, Lx3/m;->j(Lx3/z;)V

    return-void
.end method

.method public c(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh4/b;->c:Z

    iget-object p1, p0, Lh4/b;->a:Lh4/c;

    invoke-virtual {p1}, Lh4/c;->c()V

    return-void
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 3

    iget-object p2, p0, Lh4/b;->b:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    const/4 v0, 0x0

    const/16 v1, 0xae2

    invoke-interface {p1, p2, v0, v1}, Lx3/l;->c([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lh4/b;->b:Lp5/a0;

    invoke-virtual {p2, v0}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lh4/b;->b:Lp5/a0;

    invoke-virtual {p2, p1}, Lp5/a0;->S(I)V

    iget-boolean p1, p0, Lh4/b;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lh4/b;->a:Lh4/c;

    const-wide/16 v1, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v1, v2, p2}, Lh4/c;->f(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh4/b;->c:Z

    :cond_1
    iget-object p1, p0, Lh4/b;->a:Lh4/c;

    iget-object p2, p0, Lh4/b;->b:Lp5/a0;

    invoke-virtual {p1, p2}, Lh4/c;->a(Lp5/a0;)V

    return v0
.end method

.method public h(Lx3/l;)Z
    .locals 7

    new-instance v0, Lp5/a0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v2, v1}, Lx3/l;->p([BII)V

    invoke-virtual {v0, v2}, Lp5/a0;->T(I)V

    invoke-virtual {v0}, Lp5/a0;->J()I

    move-result v4

    const v5, 0x494433

    if-eq v4, v5, :cond_4

    invoke-interface {p1}, Lx3/l;->l()V

    invoke-interface {p1, v3}, Lx3/l;->h(I)V

    move v1, v2

    move v4, v3

    :goto_1
    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v5

    const/4 v6, 0x6

    invoke-interface {p1, v5, v2, v6}, Lx3/l;->p([BII)V

    invoke-virtual {v0, v2}, Lp5/a0;->T(I)V

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result v5

    const/16 v6, 0xb77

    if-eq v5, v6, :cond_1

    invoke-interface {p1}, Lx3/l;->l()V

    add-int/lit8 v4, v4, 0x1

    sub-int v1, v4, v3

    const/16 v5, 0x2000

    if-lt v1, v5, :cond_0

    return v2

    :cond_0
    invoke-interface {p1, v4}, Lx3/l;->h(I)V

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    add-int/2addr v1, v5

    const/4 v6, 0x4

    if-lt v1, v6, :cond_2

    return v5

    :cond_2
    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v5

    invoke-static {v5}, Lu3/b;->g([B)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_3

    return v2

    :cond_3
    add-int/lit8 v5, v5, -0x6

    invoke-interface {p1, v5}, Lx3/l;->h(I)V

    goto :goto_1

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lp5/a0;->U(I)V

    invoke-virtual {v0}, Lp5/a0;->F()I

    move-result v4

    add-int/lit8 v5, v4, 0xa

    add-int/2addr v3, v5

    invoke-interface {p1, v4}, Lx3/l;->h(I)V

    goto :goto_0
.end method

.method public release()V
    .locals 0

    return-void
.end method
