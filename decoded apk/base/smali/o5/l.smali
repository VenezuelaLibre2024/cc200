.class public final Lo5/l;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field public final h:Lo5/j;

.field public final i:Lo5/n;

.field public final j:[B

.field public k:Z

.field public l:Z

.field public m:J


# direct methods
.method public constructor <init>(Lo5/j;Lo5/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo5/l;->k:Z

    iput-boolean v0, p0, Lo5/l;->l:Z

    iput-object p1, p0, Lo5/l;->h:Lo5/j;

    iput-object p2, p0, Lo5/l;->i:Lo5/n;

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Lo5/l;->j:[B

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lo5/l;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo5/l;->h:Lo5/j;

    iget-object v1, p0, Lo5/l;->i:Lo5/n;

    invoke-interface {v0, v1}, Lo5/j;->k(Lo5/n;)J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo5/l;->k:Z

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    iget-boolean v0, p0, Lo5/l;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo5/l;->h:Lo5/j;

    invoke-interface {v0}, Lo5/j;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo5/l;->l:Z

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    invoke-virtual {p0}, Lo5/l;->a()V

    return-void
.end method

.method public read()I
    .locals 2

    iget-object v0, p0, Lo5/l;->j:[B

    invoke-virtual {p0, v0}, Lo5/l;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo5/l;->j:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit16 v1, v0, 0xff

    :goto_0
    return v1
.end method

.method public read([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lo5/l;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 2

    iget-boolean v0, p0, Lo5/l;->l:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->f(Z)V

    invoke-virtual {p0}, Lo5/l;->a()V

    iget-object v0, p0, Lo5/l;->h:Lo5/j;

    invoke-interface {v0, p1, p2, p3}, Lo5/h;->c([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-wide p2, p0, Lo5/l;->m:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lo5/l;->m:J

    return p1
.end method
