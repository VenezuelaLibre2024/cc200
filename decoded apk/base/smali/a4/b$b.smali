.class public final La4/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lx3/t;

.field public final b:I

.field public final c:Lx3/q$a;


# direct methods
.method public constructor <init>(Lx3/t;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/b$b;->a:Lx3/t;

    iput p2, p0, La4/b$b;->b:I

    new-instance p1, Lx3/q$a;

    invoke-direct {p1}, Lx3/q$a;-><init>()V

    iput-object p1, p0, La4/b$b;->c:Lx3/q$a;

    return-void
.end method

.method public synthetic constructor <init>(Lx3/t;ILa4/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La4/b$b;-><init>(Lx3/t;I)V

    return-void
.end method


# virtual methods
.method public a(Lx3/l;J)Lx3/a$e;
    .locals 10

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    invoke-virtual {p0, p1}, La4/b$b;->c(Lx3/l;)J

    move-result-wide v2

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v4

    iget-object v6, p0, La4/b$b;->a:Lx3/t;

    iget v6, v6, Lx3/t;->c:I

    const/4 v7, 0x6

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {p1, v6}, Lx3/l;->h(I)V

    invoke-virtual {p0, p1}, La4/b$b;->c(Lx3/l;)J

    move-result-wide v6

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v8

    cmp-long p1, v2, p2

    if-gtz p1, :cond_0

    cmp-long p1, v6, p2

    if-lez p1, :cond_0

    invoke-static {v4, v5}, Lx3/a$e;->e(J)Lx3/a$e;

    move-result-object p1

    return-object p1

    :cond_0
    cmp-long p1, v6, p2

    if-gtz p1, :cond_1

    invoke-static {v6, v7, v8, v9}, Lx3/a$e;->f(JJ)Lx3/a$e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v2, v3, v0, v1}, Lx3/a$e;->d(JJ)Lx3/a$e;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lx3/l;)J
    .locals 6

    :goto_0
    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v0

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x6

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, La4/b$b;->a:Lx3/t;

    iget v1, p0, La4/b$b;->b:I

    iget-object v2, p0, La4/b$b;->c:Lx3/q$a;

    invoke-static {p1, v0, v1, v2}, Lx3/q;->h(Lx3/l;Lx3/t;ILx3/q$a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lx3/l;->h(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v0

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v2

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lx3/l;->h(I)V

    iget-object p1, p0, La4/b$b;->a:Lx3/t;

    iget-wide v0, p1, Lx3/t;->j:J

    return-wide v0

    :cond_1
    iget-object p1, p0, La4/b$b;->c:Lx3/q$a;

    iget-wide v0, p1, Lx3/q$a;->a:J

    return-wide v0
.end method
