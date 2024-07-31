.class public final Lw4/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final h:Lw4/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw4/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final i:Lu4/l0;

.field public final j:I

.field public k:Z

.field public final synthetic l:Lw4/i;


# direct methods
.method public constructor <init>(Lw4/i;Lw4/i;Lu4/l0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i<",
            "TT;>;",
            "Lu4/l0;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lw4/i$a;->l:Lw4/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw4/i$a;->h:Lw4/i;

    iput-object p3, p0, Lw4/i$a;->i:Lu4/l0;

    iput p4, p0, Lw4/i$a;->j:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 8

    iget-boolean v0, p0, Lw4/i$a;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->z(Lw4/i;)Lu4/a0$a;

    move-result-object v1

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->w(Lw4/i;)[I

    move-result-object v0

    iget v2, p0, Lw4/i$a;->j:I

    aget v2, v0, v2

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->x(Lw4/i;)[Ls3/m1;

    move-result-object v0

    iget v3, p0, Lw4/i$a;->j:I

    aget-object v3, v0, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->y(Lw4/i;)J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lu4/a0$a;->i(ILs3/m1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/i$a;->k:Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->v(Lw4/i;)[Z

    move-result-object v0

    iget v1, p0, Lw4/i$a;->j:I

    aget-boolean v0, v0, v1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->v(Lw4/i;)[Z

    move-result-object v0

    iget v1, p0, Lw4/i$a;->j:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-virtual {v0}, Lw4/i;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw4/i$a;->i:Lu4/l0;

    iget-object v1, p0, Lw4/i$a;->l:Lw4/i;

    iget-boolean v1, v1, Lw4/i;->D:Z

    invoke-virtual {v0, v1}, Lu4/l0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Ls3/n1;Lv3/g;I)I
    .locals 3

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-virtual {v0}, Lw4/i;->H()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->u(Lw4/i;)Lw4/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {v0}, Lw4/i;->u(Lw4/i;)Lw4/a;

    move-result-object v0

    iget v2, p0, Lw4/i$a;->j:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lw4/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lw4/i$a;->i:Lu4/l0;

    invoke-virtual {v2}, Lu4/l0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lw4/i$a;->b()V

    iget-object v0, p0, Lw4/i$a;->i:Lu4/l0;

    iget-object v1, p0, Lw4/i$a;->l:Lw4/i;

    iget-boolean v1, v1, Lw4/i;->D:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lu4/l0;->S(Ls3/n1;Lv3/g;IZ)I

    move-result p1

    return p1
.end method

.method public n(J)I
    .locals 2

    iget-object v0, p0, Lw4/i$a;->l:Lw4/i;

    invoke-virtual {v0}, Lw4/i;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lw4/i$a;->i:Lu4/l0;

    iget-object v1, p0, Lw4/i$a;->l:Lw4/i;

    iget-boolean v1, v1, Lw4/i;->D:Z

    invoke-virtual {v0, p1, p2, v1}, Lu4/l0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {p2}, Lw4/i;->u(Lw4/i;)Lw4/a;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lw4/i$a;->l:Lw4/i;

    invoke-static {p2}, Lw4/i;->u(Lw4/i;)Lw4/a;

    move-result-object p2

    iget v0, p0, Lw4/i$a;->j:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lw4/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lw4/i$a;->i:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lw4/i$a;->i:Lu4/l0;

    invoke-virtual {p2, p1}, Lu4/l0;->e0(I)V

    if-lez p1, :cond_2

    invoke-virtual {p0}, Lw4/i$a;->b()V

    :cond_2
    return p1
.end method
