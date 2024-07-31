.class public Lac/e;
.super Lac/c;
.source ""


# static fields
.field public static final e:Lwb/e;


# instance fields
.field public b:J

.field public c:J

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lac/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lac/e;->e:Lwb/e;

    return-void
.end method

.method public constructor <init>(Lac/b;JJ)V
    .locals 4

    invoke-direct {p0, p1}, Lac/c;-><init>(Lac/b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lac/e;->d:Z

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    cmp-long v0, p4, v0

    if-ltz v0, :cond_1

    invoke-interface {p1}, Lac/b;->d()J

    move-result-wide v0

    add-long v2, p2, p4

    cmp-long p1, v2, v0

    if-gez p1, :cond_0

    iput-wide p2, p0, Lac/e;->b:J

    sub-long/2addr v0, p2

    sub-long/2addr v0, p4

    iput-wide v0, p0, Lac/e;->c:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Trim values cannot be greater than media duration."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Trim values cannot be negative."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b(J)J
    .locals 2

    iget-wide v0, p0, Lac/e;->b:J

    add-long/2addr v0, p1

    invoke-super {p0, v0, v1}, Lac/c;->b(J)J

    move-result-wide p1

    iget-wide v0, p0, Lac/e;->b:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lac/e;->c:J

    return-wide v0
.end method

.method public h()Z
    .locals 4

    invoke-super {p0}, Lac/c;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lac/c;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Lac/e;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()V
    .locals 1

    invoke-super {p0}, Lac/c;->k()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lac/e;->d:Z

    return-void
.end method

.method public l(Lvb/d;)Z
    .locals 4

    iget-boolean v0, p0, Lac/e;->d:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lac/e;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lac/c;->a()Lac/b;

    move-result-object v0

    iget-wide v1, p0, Lac/e;->b:J

    invoke-interface {v0, v1, v2}, Lac/b;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Lac/e;->b:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lac/e;->d:Z

    :cond_0
    invoke-super {p0, p1}, Lac/c;->l(Lvb/d;)Z

    move-result p1

    return p1
.end method
