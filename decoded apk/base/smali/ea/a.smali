.class public Lea/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D

.field public final d:D

.field public final e:D

.field public final f:D


# direct methods
.method public constructor <init>(DDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lea/a;->a:D

    iput-wide p5, p0, Lea/a;->b:D

    iput-wide p3, p0, Lea/a;->c:D

    iput-wide p7, p0, Lea/a;->d:D

    add-double/2addr p1, p3

    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    div-double/2addr p1, p3

    iput-wide p1, p0, Lea/a;->e:D

    add-double/2addr p5, p7

    div-double/2addr p5, p3

    iput-wide p5, p0, Lea/a;->f:D

    return-void
.end method


# virtual methods
.method public a(DD)Z
    .locals 2

    iget-wide v0, p0, Lea/a;->a:D

    cmpg-double v0, v0, p1

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lea/a;->c:D

    cmpg-double p1, p1, v0

    if-gtz p1, :cond_0

    iget-wide p1, p0, Lea/a;->b:D

    cmpg-double p1, p1, p3

    if-gtz p1, :cond_0

    iget-wide p1, p0, Lea/a;->d:D

    cmpg-double p1, p3, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Lea/a;)Z
    .locals 4

    iget-wide v0, p1, Lea/a;->a:D

    iget-wide v2, p0, Lea/a;->a:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    iget-wide v0, p1, Lea/a;->c:D

    iget-wide v2, p0, Lea/a;->c:D

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    iget-wide v0, p1, Lea/a;->b:D

    iget-wide v2, p0, Lea/a;->b:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    iget-wide v0, p1, Lea/a;->d:D

    iget-wide v2, p0, Lea/a;->d:D

    cmpg-double p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Lea/b;)Z
    .locals 4

    iget-wide v0, p1, Lea/b;->a:D

    iget-wide v2, p1, Lea/b;->b:D

    invoke-virtual {p0, v0, v1, v2, v3}, Lea/a;->a(DD)Z

    move-result p1

    return p1
.end method

.method public d(DDDD)Z
    .locals 2

    iget-wide v0, p0, Lea/a;->c:D

    cmpg-double p1, p1, v0

    if-gez p1, :cond_0

    iget-wide p1, p0, Lea/a;->a:D

    cmpg-double p1, p1, p3

    if-gez p1, :cond_0

    iget-wide p1, p0, Lea/a;->d:D

    cmpg-double p1, p5, p1

    if-gez p1, :cond_0

    iget-wide p1, p0, Lea/a;->b:D

    cmpg-double p1, p1, p7

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(Lea/a;)Z
    .locals 9

    iget-wide v1, p1, Lea/a;->a:D

    iget-wide v3, p1, Lea/a;->c:D

    iget-wide v5, p1, Lea/a;->b:D

    iget-wide v7, p1, Lea/a;->d:D

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lea/a;->d(DDDD)Z

    move-result p1

    return p1
.end method
