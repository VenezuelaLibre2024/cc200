.class public final Le4/a;
.super Lx3/d;
.source ""

# interfaces
.implements Le4/g;


# direct methods
.method public constructor <init>(JJLu3/f0$a;Z)V
    .locals 8

    iget v5, p5, Lu3/f0$a;->f:I

    iget v6, p5, Lu3/f0$a;->c:I

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lx3/d;-><init>(JJIIZ)V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx3/d;->c(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method
