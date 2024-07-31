.class public Lg4/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final d:Lx3/p;


# instance fields
.field public a:Lx3/m;

.field public b:Lg4/i;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lg4/c;->b:Lg4/c;

    sput-object v0, Lg4/d;->d:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Lg4/d;->d()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lg4/d;

    invoke-direct {v1}, Lg4/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(Lp5/a0;)Lp5/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    return-object p0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 0

    iput-object p1, p0, Lg4/d;->a:Lx3/m;

    return-void
.end method

.method public c(JJ)V
    .locals 1

    iget-object v0, p0, Lg4/d;->b:Lg4/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lg4/i;->m(JJ)V

    :cond_0
    return-void
.end method

.method public final f(Lx3/l;)Z
    .locals 5

    new-instance v0, Lg4/f;

    invoke-direct {v0}, Lg4/f;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lg4/f;->a(Lx3/l;Z)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget v2, v0, Lg4/f;->b:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    iget v0, v0, Lg4/f;->i:I

    const/16 v2, 0x8

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v2, Lp5/a0;

    invoke-direct {v2, v0}, Lp5/a0;-><init>(I)V

    invoke-virtual {v2}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-interface {p1, v4, v3, v0}, Lx3/l;->p([BII)V

    invoke-static {v2}, Lg4/d;->e(Lp5/a0;)Lp5/a0;

    move-result-object p1

    invoke-static {p1}, Lg4/b;->p(Lp5/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lg4/b;

    invoke-direct {p1}, Lg4/b;-><init>()V

    :goto_0
    iput-object p1, p0, Lg4/d;->b:Lg4/i;

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lg4/d;->e(Lp5/a0;)Lp5/a0;

    move-result-object p1

    invoke-static {p1}, Lg4/j;->r(Lp5/a0;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lg4/j;

    invoke-direct {p1}, Lg4/j;-><init>()V

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lg4/d;->e(Lp5/a0;)Lp5/a0;

    move-result-object p1

    invoke-static {p1}, Lg4/h;->o(Lp5/a0;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lg4/h;

    invoke-direct {p1}, Lg4/h;-><init>()V

    goto :goto_0

    :goto_1
    return v1

    :cond_3
    :goto_2
    return v3
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 4

    iget-object v0, p0, Lg4/d;->a:Lx3/m;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg4/d;->b:Lg4/i;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lg4/d;->f(Lx3/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx3/l;->l()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Failed to determine bitstream type"

    invoke-static {p2, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lg4/d;->c:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lg4/d;->a:Lx3/m;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iget-object v1, p0, Lg4/d;->a:Lx3/m;

    invoke-interface {v1}, Lx3/m;->n()V

    iget-object v1, p0, Lg4/d;->b:Lg4/i;

    iget-object v3, p0, Lg4/d;->a:Lx3/m;

    invoke-virtual {v1, v3, v0}, Lg4/i;->d(Lx3/m;Lx3/b0;)V

    iput-boolean v2, p0, Lg4/d;->c:Z

    :cond_2
    iget-object v0, p0, Lg4/d;->b:Lg4/i;

    invoke-virtual {v0, p1, p2}, Lg4/i;->g(Lx3/l;Lx3/y;)I

    move-result p1

    return p1
.end method

.method public h(Lx3/l;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1}, Lg4/d;->f(Lx3/l;)Z

    move-result p1
    :try_end_0
    .catch Ls3/t2; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
