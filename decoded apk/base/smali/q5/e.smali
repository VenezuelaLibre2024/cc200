.class public final Lq5/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq5/e$a;
    }
.end annotation


# instance fields
.field public a:Lq5/e$a;

.field public b:Lq5/e$a;

.field public c:Z

.field public d:Z

.field public e:J

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq5/e$a;

    invoke-direct {v0}, Lq5/e$a;-><init>()V

    iput-object v0, p0, Lq5/e;->a:Lq5/e$a;

    new-instance v0, Lq5/e$a;

    invoke-direct {v0}, Lq5/e$a;-><init>()V

    iput-object v0, p0, Lq5/e;->b:Lq5/e$a;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lq5/e;->e:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-virtual {p0}, Lq5/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public b()F
    .locals 4

    invoke-virtual {p0}, Lq5/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, 0x41cdcd6500000000L    # 1.0E9

    iget-object v2, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v2}, Lq5/e$a;->a()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lq5/e;->f:I

    return v0
.end method

.method public d()J
    .locals 2

    invoke-virtual {p0}, Lq5/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->e()Z

    move-result v0

    return v0
.end method

.method public f(J)V
    .locals 7

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0, p1, p2}, Lq5/e$a;->f(J)V

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->e()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lq5/e;->d:Z

    if-nez v0, :cond_0

    iput-boolean v2, p0, Lq5/e;->c:Z

    goto :goto_0

    :cond_0
    iget-wide v3, p0, Lq5/e;->e:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lq5/e;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->g()V

    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    iget-wide v3, p0, Lq5/e;->e:J

    invoke-virtual {v0, v3, v4}, Lq5/e$a;->f(J)V

    :cond_2
    iput-boolean v1, p0, Lq5/e;->c:Z

    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    invoke-virtual {v0, p1, p2}, Lq5/e$a;->f(J)V

    :cond_3
    :goto_0
    iget-boolean v0, p0, Lq5/e;->c:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    iget-object v3, p0, Lq5/e;->b:Lq5/e$a;

    iput-object v3, p0, Lq5/e;->a:Lq5/e$a;

    iput-object v0, p0, Lq5/e;->b:Lq5/e$a;

    iput-boolean v2, p0, Lq5/e;->c:Z

    iput-boolean v2, p0, Lq5/e;->d:Z

    :cond_4
    iput-wide p1, p0, Lq5/e;->e:J

    iget-object p1, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {p1}, Lq5/e$a;->e()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    iget p1, p0, Lq5/e;->f:I

    add-int/lit8 v2, p1, 0x1

    :goto_1
    iput v2, p0, Lq5/e;->f:I

    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lq5/e;->a:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->g()V

    iget-object v0, p0, Lq5/e;->b:Lq5/e$a;

    invoke-virtual {v0}, Lq5/e$a;->g()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq5/e;->c:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lq5/e;->e:J

    iput v0, p0, Lq5/e;->f:I

    return-void
.end method
