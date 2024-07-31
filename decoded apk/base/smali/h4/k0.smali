.class public final Lh4/k0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:[Lx3/b0;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/k0;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lx3/b0;

    iput-object p1, p0, Lh4/k0;->b:[Lx3/b0;

    return-void
.end method


# virtual methods
.method public a(JLp5/a0;)V
    .locals 4

    invoke-virtual {p3}, Lp5/a0;->a()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3}, Lp5/a0;->p()I

    move-result v0

    invoke-virtual {p3}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p3}, Lp5/a0;->G()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lh4/k0;->b:[Lx3/b0;

    invoke-static {p1, p2, p3, v0}, Lx3/b;->b(JLp5/a0;[Lx3/b0;)V

    :cond_1
    return-void
.end method

.method public b(Lx3/m;Lh4/i0$d;)V
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lh4/k0;->b:[Lx3/b0;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p2}, Lh4/i0$d;->a()V

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v2

    iget-object v3, p0, Lh4/k0;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/m1;

    iget-object v4, v3, Ls3/m1;->s:Ljava/lang/String;

    const-string v5, "application/cea-608"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "application/cea-708"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    move v5, v0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v5, 0x1

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid closed caption mime type provided: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lp5/a;->b(ZLjava/lang/Object;)V

    new-instance v5, Ls3/m1$b;

    invoke-direct {v5}, Ls3/m1$b;-><init>()V

    invoke-virtual {p2}, Lh4/i0$d;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    iget v5, v3, Ls3/m1;->k:I

    invoke-virtual {v4, v5}, Ls3/m1$b;->i0(I)Ls3/m1$b;

    move-result-object v4

    iget-object v5, v3, Ls3/m1;->j:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    iget v5, v3, Ls3/m1;->K:I

    invoke-virtual {v4, v5}, Ls3/m1$b;->H(I)Ls3/m1$b;

    move-result-object v4

    iget-object v3, v3, Ls3/m1;->u:Ljava/util/List;

    invoke-virtual {v4, v3}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object v3

    invoke-virtual {v3}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v3

    invoke-interface {v2, v3}, Lx3/b0;->b(Ls3/m1;)V

    iget-object v3, p0, Lh4/k0;->b:[Lx3/b0;

    aput-object v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
