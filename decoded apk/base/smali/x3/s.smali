.class public final Lx3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# instance fields
.field public final a:Lx3/t;

.field public final b:J


# direct methods
.method public constructor <init>(Lx3/t;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/s;->a:Lx3/t;

    iput-wide p2, p0, Lx3/s;->b:J

    return-void
.end method


# virtual methods
.method public final b(JJ)Lx3/a0;
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iget-object v0, p0, Lx3/s;->a:Lx3/t;

    iget v0, v0, Lx3/t;->e:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    iget-wide v0, p0, Lx3/s;->b:J

    add-long/2addr v0, p3

    new-instance p3, Lx3/a0;

    invoke-direct {p3, p1, p2, v0, v1}, Lx3/a0;-><init>(JJ)V

    return-object p3
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lx3/s;->a:Lx3/t;

    invoke-virtual {v0}, Lx3/t;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 9

    iget-object v0, p0, Lx3/s;->a:Lx3/t;

    iget-object v0, v0, Lx3/t;->k:Lx3/t$a;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx3/s;->a:Lx3/t;

    iget-object v1, v0, Lx3/t;->k:Lx3/t$a;

    iget-object v2, v1, Lx3/t$a;->a:[J

    iget-object v1, v1, Lx3/t$a;->b:[J

    invoke-virtual {v0, p1, p2}, Lx3/t;->i(J)J

    move-result-wide v3

    const/4 v0, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v0, v5}, Lp5/n0;->i([JJZZ)I

    move-result v3

    const-wide/16 v4, 0x0

    const/4 v6, -0x1

    if-ne v3, v6, :cond_0

    move-wide v7, v4

    goto :goto_0

    :cond_0
    aget-wide v7, v2, v3

    :goto_0
    if-ne v3, v6, :cond_1

    goto :goto_1

    :cond_1
    aget-wide v4, v1, v3

    :goto_1
    invoke-virtual {p0, v7, v8, v4, v5}, Lx3/s;->b(JJ)Lx3/a0;

    move-result-object v4

    iget-wide v5, v4, Lx3/a0;->a:J

    cmp-long p1, v5, p1

    if-eqz p1, :cond_3

    array-length p1, v2

    sub-int/2addr p1, v0

    if-ne v3, p1, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v3, v0

    aget-wide p1, v2, v3

    aget-wide v0, v1, v3

    invoke-virtual {p0, p1, p2, v0, v1}, Lx3/s;->b(JJ)Lx3/a0;

    move-result-object p1

    new-instance p2, Lx3/z$a;

    invoke-direct {p2, v4, p1}, Lx3/z$a;-><init>(Lx3/a0;Lx3/a0;)V

    return-object p2

    :cond_3
    :goto_2
    new-instance p1, Lx3/z$a;

    invoke-direct {p1, v4}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object p1
.end method
