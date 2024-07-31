.class public Lbf/i;
.super Lbf/u;
.source ""


# instance fields
.field public e:Lbf/u;


# direct methods
.method public constructor <init>(Lbf/u;)V
    .locals 1

    invoke-direct {p0}, Lbf/u;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lbf/i;->e:Lbf/u;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->a()Lbf/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->b()Lbf/u;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0, p1, p2}, Lbf/u;->d(J)Lbf/u;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0}, Lbf/u;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    invoke-virtual {v0, p1, p2, p3}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    move-result-object p1

    return-object p1
.end method

.method public final i()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/i;->e:Lbf/u;

    return-object v0
.end method

.method public final j(Lbf/u;)Lbf/i;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lbf/i;->e:Lbf/u;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
