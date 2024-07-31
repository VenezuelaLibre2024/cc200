.class public abstract Lo5/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/j;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo5/m0;",
            ">;"
        }
    .end annotation
.end field

.field public c:I

.field public d:Lo5/n;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lo5/f;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lo5/f;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final g(Lo5/m0;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lo5/f;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lo5/f;->c:I

    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 4

    iget-object v0, p0, Lo5/f;->d:Lo5/n;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/n;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lo5/f;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/m0;

    iget-boolean v3, p0, Lo5/f;->a:Z

    invoke-interface {v2, p0, v0, v3, p1}, Lo5/m0;->c(Lo5/j;Lo5/n;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final r()V
    .locals 4

    iget-object v0, p0, Lo5/f;->d:Lo5/n;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/n;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lo5/f;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/m0;

    iget-boolean v3, p0, Lo5/f;->a:Z

    invoke-interface {v2, p0, v0, v3}, Lo5/m0;->i(Lo5/j;Lo5/n;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo5/f;->d:Lo5/n;

    return-void
.end method

.method public final s(Lo5/n;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lo5/f;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/m0;

    iget-boolean v2, p0, Lo5/f;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lo5/m0;->d(Lo5/j;Lo5/n;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final t(Lo5/n;)V
    .locals 3

    iput-object p1, p0, Lo5/f;->d:Lo5/n;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lo5/f;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/m0;

    iget-boolean v2, p0, Lo5/f;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lo5/m0;->a(Lo5/j;Lo5/n;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
