.class public final Lc4/c;
.super Lx3/u;
.source ""


# instance fields
.field public final b:J


# direct methods
.method public constructor <init>(Lx3/l;J)V
    .locals 2

    invoke-direct {p0, p1}, Lx3/u;-><init>(Lx3/l;)V

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp5/a;->a(Z)V

    iput-wide p2, p0, Lc4/c;->b:J

    return-void
.end method


# virtual methods
.method public b()J
    .locals 4

    invoke-super {p0}, Lx3/u;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lc4/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public f()J
    .locals 4

    invoke-super {p0}, Lx3/u;->f()J

    move-result-wide v0

    iget-wide v2, p0, Lc4/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getPosition()J
    .locals 4

    invoke-super {p0}, Lx3/u;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lc4/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method