.class public Lac/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lac/b;


# instance fields
.field public final a:Lac/b;


# direct methods
.method public constructor <init>(Lac/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lac/c;->a:Lac/b;

    return-void
.end method


# virtual methods
.method public a()Lac/b;
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    return-object v0
.end method

.method public b(J)J
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1, p2}, Lac/b;->b(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(Lvb/d;)Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object p1

    return-object p1
.end method

.method public f(Lvb/d;)V
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1}, Lac/b;->f(Lvb/d;)V

    return-void
.end method

.method public g(Lvb/d;)V
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1}, Lac/b;->g(Lvb/d;)V

    return-void
.end method

.method public getOrientation()I
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->getOrientation()I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->h()Z

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public j(Lac/b$a;)V
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1}, Lac/b;->j(Lac/b$a;)V

    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->k()V

    return-void
.end method

.method public l(Lvb/d;)Z
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0, p1}, Lac/b;->l(Lvb/d;)Z

    move-result p1

    return p1
.end method

.method public m()[D
    .locals 1

    iget-object v0, p0, Lac/c;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->m()[D

    move-result-object v0

    return-object v0
.end method
