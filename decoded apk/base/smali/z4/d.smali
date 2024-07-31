.class public final Lz4/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz4/h;


# static fields
.field public static final d:[I


# instance fields
.field public final b:I

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lz4/d;->d:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x8
        0xd
        0xb
        0x2
        0x0
        0x1
        0x7
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lz4/d;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz4/d;->b:I

    iput-boolean p2, p0, Lz4/d;->c:Z

    return-void
.end method

.method public static b(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lz4/d;->d:[I

    invoke-static {v0, p0}, Lk7/e;->h([II)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Lp5/j0;Ls3/m1;Ljava/util/List;)Lf4/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/j0;",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;)",
            "Lf4/g;"
        }
    .end annotation

    new-instance v0, Lf4/g;

    invoke-static {p1}, Lz4/d;->g(Ls3/m1;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    :goto_1
    invoke-direct {v0, p1, p0, v1, p2}, Lf4/g;-><init>(ILp5/j0;Lf4/o;Ljava/util/List;)V

    return-object v0
.end method

.method public static f(IZLs3/m1;Ljava/util/List;Lp5/j0;)Lh4/h0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;",
            "Lp5/j0;",
            ")",
            "Lh4/h0;"
        }
    .end annotation

    or-int/lit8 p0, p0, 0x10

    if-eqz p3, :cond_0

    or-int/lit8 p0, p0, 0x20

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, Ls3/m1$b;

    invoke-direct {p1}, Ls3/m1$b;-><init>()V

    const-string p3, "application/cea-608"

    invoke-virtual {p1, p3}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p3

    :goto_0
    iget-object p1, p2, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, "audio/mp4a-latm"

    invoke-static {p1, p2}, Lp5/v;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    or-int/lit8 p0, p0, 0x2

    :cond_2
    const-string p2, "video/avc"

    invoke-static {p1, p2}, Lp5/v;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    or-int/lit8 p0, p0, 0x4

    :cond_3
    new-instance p1, Lh4/h0;

    new-instance p2, Lh4/j;

    invoke-direct {p2, p0, p3}, Lh4/j;-><init>(ILjava/util/List;)V

    const/4 p0, 0x2

    invoke-direct {p1, p0, p4, p2}, Lh4/h0;-><init>(ILp5/j0;Lh4/i0$c;)V

    return-object p1
.end method

.method public static g(Ls3/m1;)Z
    .locals 4

    iget-object p0, p0, Ls3/m1;->q:Lk4/a;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lk4/a;->f()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v2

    instance-of v3, v2, Lz4/r;

    if-eqz v3, :cond_1

    check-cast v2, Lz4/r;

    iget-object p0, v2, Lz4/r;->j:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static h(Lx3/k;Lx3/l;)Z
    .locals 0

    :try_start_0
    invoke-interface {p0, p1}, Lx3/k;->h(Lx3/l;)Z

    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lx3/l;->l()V

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-interface {p1}, Lx3/l;->l()V

    throw p0

    :catch_0
    invoke-interface {p1}, Lx3/l;->l()V

    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ls3/m1;Ljava/util/List;Lp5/j0;Ljava/util/Map;Lx3/l;Lt3/s1;)Lz4/k;
    .locals 0

    invoke-virtual/range {p0 .. p7}, Lz4/d;->c(Landroid/net/Uri;Ls3/m1;Ljava/util/List;Lp5/j0;Ljava/util/Map;Lx3/l;Lt3/s1;)Lz4/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;Ls3/m1;Ljava/util/List;Lp5/j0;Ljava/util/Map;Lx3/l;Lt3/s1;)Lz4/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;",
            "Lp5/j0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lx3/l;",
            "Lt3/s1;",
            ")",
            "Lz4/b;"
        }
    .end annotation

    iget-object p7, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p7}, Lp5/k;->a(Ljava/lang/String;)I

    move-result p7

    invoke-static {p5}, Lp5/k;->b(Ljava/util/Map;)I

    move-result p5

    invoke-static {p1}, Lp5/k;->c(Landroid/net/Uri;)I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lz4/d;->d:[I

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p7, v0}, Lz4/d;->b(ILjava/util/List;)V

    invoke-static {p5, v0}, Lz4/d;->b(ILjava/util/List;)V

    invoke-static {p1, v0}, Lz4/d;->b(ILjava/util/List;)V

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget v5, v1, v4

    invoke-static {v5, v0}, Lz4/d;->b(ILjava/util/List;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {p6}, Lx3/l;->l()V

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2, p2, p3, p4}, Lz4/d;->d(ILs3/m1;Ljava/util/List;Lp5/j0;)Lx3/k;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx3/k;

    invoke-static {v4, p6}, Lz4/d;->h(Lx3/k;Lx3/l;)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance p1, Lz4/b;

    invoke-direct {p1, v4, p2, p4}, Lz4/b;-><init>(Lx3/k;Ls3/m1;Lp5/j0;)V

    return-object p1

    :cond_1
    if-nez v1, :cond_3

    if-eq v2, p7, :cond_2

    if-eq v2, p5, :cond_2

    if-eq v2, p1, :cond_2

    const/16 v5, 0xb

    if-ne v2, v5, :cond_3

    :cond_2
    move-object v1, v4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, Lz4/b;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx3/k;

    invoke-direct {p1, p3, p2, p4}, Lz4/b;-><init>(Lx3/k;Ls3/m1;Lp5/j0;)V

    return-object p1
.end method

.method public final d(ILs3/m1;Ljava/util/List;Lp5/j0;)Lx3/k;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;",
            "Lp5/j0;",
            ")",
            "Lx3/k;"
        }
    .end annotation

    if-eqz p1, :cond_6

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0xb

    if-eq p1, v0, :cond_1

    const/16 p3, 0xd

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lz4/u;

    iget-object p2, p2, Ls3/m1;->j:Ljava/lang/String;

    invoke-direct {p1, p2, p4}, Lz4/u;-><init>(Ljava/lang/String;Lp5/j0;)V

    return-object p1

    :cond_1
    iget p1, p0, Lz4/d;->b:I

    iget-boolean v0, p0, Lz4/d;->c:Z

    invoke-static {p1, v0, p2, p3, p4}, Lz4/d;->f(IZLs3/m1;Ljava/util/List;Lp5/j0;)Lh4/h0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p4, p2, p3}, Lz4/d;->e(Lp5/j0;Ls3/m1;Ljava/util/List;)Lf4/g;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Le4/f;

    const/4 p2, 0x0

    const-wide/16 p3, 0x0

    invoke-direct {p1, p2, p3, p4}, Le4/f;-><init>(IJ)V

    return-object p1

    :cond_4
    new-instance p1, Lh4/h;

    invoke-direct {p1}, Lh4/h;-><init>()V

    return-object p1

    :cond_5
    new-instance p1, Lh4/e;

    invoke-direct {p1}, Lh4/e;-><init>()V

    return-object p1

    :cond_6
    new-instance p1, Lh4/b;

    invoke-direct {p1}, Lh4/b;-><init>()V

    return-object p1
.end method
