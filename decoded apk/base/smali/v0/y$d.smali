.class public final Lv0/y$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv0/u$b<",
        "Lv0/y$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:Lv0/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/a0$d<",
            "*>;"
        }
    .end annotation
.end field

.field public final i:I

.field public final j:Lv0/t1$b;

.field public final k:Z

.field public final l:Z


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lv0/y$d;->i:I

    return v0
.end method

.method public b(Lv0/y$d;)I
    .locals 1

    iget v0, p0, Lv0/y$d;->i:I

    iget p1, p1, Lv0/y$d;->i:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public c()Lv0/a0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/a0$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lv0/y$d;->h:Lv0/a0$d;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv0/y$d;

    invoke-virtual {p0, p1}, Lv0/y$d;->b(Lv0/y$d;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lv0/y$d;->k:Z

    return v0
.end method

.method public e()Lv0/t1$b;
    .locals 1

    iget-object v0, p0, Lv0/y$d;->j:Lv0/t1$b;

    return-object v0
.end method

.method public g(Lv0/r0$a;Lv0/r0;)Lv0/r0$a;
    .locals 0

    check-cast p1, Lv0/y$a;

    check-cast p2, Lv0/y;

    invoke-virtual {p1, p2}, Lv0/y$a;->w(Lv0/y;)Lv0/y$a;

    move-result-object p1

    return-object p1
.end method

.method public j()Lv0/t1$c;
    .locals 1

    iget-object v0, p0, Lv0/y$d;->j:Lv0/t1$b;

    invoke-virtual {v0}, Lv0/t1$b;->b()Lv0/t1$c;

    move-result-object v0

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lv0/y$d;->l:Z

    return v0
.end method
