.class public Ln5/z$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public m:I

.field public n:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:I

.field public q:I

.field public r:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lu4/s0;",
            "Ln5/x;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Ln5/z$a;->a:I

    iput v0, p0, Ln5/z$a;->b:I

    iput v0, p0, Ln5/z$a;->c:I

    iput v0, p0, Ln5/z$a;->d:I

    iput v0, p0, Ln5/z$a;->i:I

    iput v0, p0, Ln5/z$a;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ln5/z$a;->k:Z

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    iput-object v1, p0, Ln5/z$a;->l:Li7/u;

    const/4 v1, 0x0

    iput v1, p0, Ln5/z$a;->m:I

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v2

    iput-object v2, p0, Ln5/z$a;->n:Li7/u;

    iput v1, p0, Ln5/z$a;->o:I

    iput v0, p0, Ln5/z$a;->p:I

    iput v0, p0, Ln5/z$a;->q:I

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->r:Li7/u;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->s:Li7/u;

    iput v1, p0, Ln5/z$a;->t:I

    iput v1, p0, Ln5/z$a;->u:I

    iput-boolean v1, p0, Ln5/z$a;->v:Z

    iput-boolean v1, p0, Ln5/z$a;->w:Z

    iput-boolean v1, p0, Ln5/z$a;->x:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln5/z$a;->y:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln5/z$a;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ln5/z$a;-><init>()V

    invoke-virtual {p0, p1}, Ln5/z$a;->E(Landroid/content/Context;)Ln5/z$a;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ln5/z$a;->H(Landroid/content/Context;Z)Ln5/z$a;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ln5/z;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ln5/z;->H:Ln5/z;

    iget v2, v1, Ln5/z;->h:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->a:I

    invoke-static {}, Ln5/z;->b()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->i:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->b:I

    invoke-static {}, Ln5/z;->m()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->j:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->c:I

    invoke-static {}, Ln5/z;->t()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->k:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->d:I

    invoke-static {}, Ln5/z;->u()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->l:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->e:I

    invoke-static {}, Ln5/z;->v()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->m:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->f:I

    invoke-static {}, Ln5/z;->w()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->n:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->g:I

    invoke-static {}, Ln5/z;->x()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->o:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->h:I

    invoke-static {}, Ln5/z;->y()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->p:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->i:I

    invoke-static {}, Ln5/z;->z()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Ln5/z;->q:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->j:I

    invoke-static {}, Ln5/z;->c()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Ln5/z;->r:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln5/z$a;->k:Z

    invoke-static {}, Ln5/z;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Li7/u;->q([Ljava/lang/Object;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->l:Li7/u;

    invoke-static {}, Ln5/z;->e()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->t:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->m:I

    invoke-static {}, Ln5/z;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ln5/z$a;->C([Ljava/lang/String;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->n:Li7/u;

    invoke-static {}, Ln5/z;->g()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->v:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->o:I

    invoke-static {}, Ln5/z;->h()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->w:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->p:I

    invoke-static {}, Ln5/z;->i()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->x:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->q:I

    invoke-static {}, Ln5/z;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Li7/u;->q([Ljava/lang/Object;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->r:Li7/u;

    invoke-static {}, Ln5/z;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Ln5/z$a;->C([Ljava/lang/String;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Ln5/z$a;->s:Li7/u;

    invoke-static {}, Ln5/z;->l()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->A:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->t:I

    invoke-static {}, Ln5/z;->n()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Ln5/z;->B:I

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ln5/z$a;->u:I

    invoke-static {}, Ln5/z;->o()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ln5/z;->C:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln5/z$a;->v:Z

    invoke-static {}, Ln5/z;->p()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Ln5/z;->D:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln5/z$a;->w:Z

    invoke-static {}, Ln5/z;->q()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Ln5/z;->E:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ln5/z$a;->x:Z

    invoke-static {}, Ln5/z;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ln5/x;->l:Ls3/h$a;

    invoke-static {v1, v0}, Lp5/c;->b(Ls3/h$a;Ljava/util/List;)Li7/u;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ln5/z$a;->y:Ljava/util/HashMap;

    move v1, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln5/x;

    iget-object v4, p0, Ln5/z$a;->y:Ljava/util/HashMap;

    iget-object v5, v3, Ln5/x;->h:Lu4/s0;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Ln5/z;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    invoke-static {p1, v0}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln5/z$a;->z:Ljava/util/HashSet;

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_2

    aget v1, p1, v2

    iget-object v3, p0, Ln5/z$a;->z:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public constructor <init>(Ln5/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Ln5/z$a;->B(Ln5/z;)V

    return-void
.end method

.method public static C([Ljava/lang/String;)Li7/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lp5/n0;->D0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->a:I

    return p0
.end method

.method public static synthetic b(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->b:I

    return p0
.end method

.method public static synthetic c(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->c:I

    return p0
.end method

.method public static synthetic d(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->d:I

    return p0
.end method

.method public static synthetic e(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->e:I

    return p0
.end method

.method public static synthetic f(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->f:I

    return p0
.end method

.method public static synthetic g(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->g:I

    return p0
.end method

.method public static synthetic h(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->h:I

    return p0
.end method

.method public static synthetic i(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->i:I

    return p0
.end method

.method public static synthetic j(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->j:I

    return p0
.end method

.method public static synthetic k(Ln5/z$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/z$a;->k:Z

    return p0
.end method

.method public static synthetic l(Ln5/z$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->l:Li7/u;

    return-object p0
.end method

.method public static synthetic m(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->m:I

    return p0
.end method

.method public static synthetic n(Ln5/z$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->n:Li7/u;

    return-object p0
.end method

.method public static synthetic o(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->o:I

    return p0
.end method

.method public static synthetic p(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->p:I

    return p0
.end method

.method public static synthetic q(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->q:I

    return p0
.end method

.method public static synthetic r(Ln5/z$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->r:Li7/u;

    return-object p0
.end method

.method public static synthetic s(Ln5/z$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->s:Li7/u;

    return-object p0
.end method

.method public static synthetic t(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->t:I

    return p0
.end method

.method public static synthetic u(Ln5/z$a;)I
    .locals 0

    iget p0, p0, Ln5/z$a;->u:I

    return p0
.end method

.method public static synthetic v(Ln5/z$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/z$a;->v:Z

    return p0
.end method

.method public static synthetic w(Ln5/z$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/z$a;->w:Z

    return p0
.end method

.method public static synthetic x(Ln5/z$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/z$a;->x:Z

    return p0
.end method

.method public static synthetic y(Ln5/z$a;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->y:Ljava/util/HashMap;

    return-object p0
.end method

.method public static synthetic z(Ln5/z$a;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Ln5/z$a;->z:Ljava/util/HashSet;

    return-object p0
.end method


# virtual methods
.method public A()Ln5/z;
    .locals 1

    new-instance v0, Ln5/z;

    invoke-direct {v0, p0}, Ln5/z;-><init>(Ln5/z$a;)V

    return-object v0
.end method

.method public final B(Ln5/z;)V
    .locals 2

    iget v0, p1, Ln5/z;->h:I

    iput v0, p0, Ln5/z$a;->a:I

    iget v0, p1, Ln5/z;->i:I

    iput v0, p0, Ln5/z$a;->b:I

    iget v0, p1, Ln5/z;->j:I

    iput v0, p0, Ln5/z$a;->c:I

    iget v0, p1, Ln5/z;->k:I

    iput v0, p0, Ln5/z$a;->d:I

    iget v0, p1, Ln5/z;->l:I

    iput v0, p0, Ln5/z$a;->e:I

    iget v0, p1, Ln5/z;->m:I

    iput v0, p0, Ln5/z$a;->f:I

    iget v0, p1, Ln5/z;->n:I

    iput v0, p0, Ln5/z$a;->g:I

    iget v0, p1, Ln5/z;->o:I

    iput v0, p0, Ln5/z$a;->h:I

    iget v0, p1, Ln5/z;->p:I

    iput v0, p0, Ln5/z$a;->i:I

    iget v0, p1, Ln5/z;->q:I

    iput v0, p0, Ln5/z$a;->j:I

    iget-boolean v0, p1, Ln5/z;->r:Z

    iput-boolean v0, p0, Ln5/z$a;->k:Z

    iget-object v0, p1, Ln5/z;->s:Li7/u;

    iput-object v0, p0, Ln5/z$a;->l:Li7/u;

    iget v0, p1, Ln5/z;->t:I

    iput v0, p0, Ln5/z$a;->m:I

    iget-object v0, p1, Ln5/z;->u:Li7/u;

    iput-object v0, p0, Ln5/z$a;->n:Li7/u;

    iget v0, p1, Ln5/z;->v:I

    iput v0, p0, Ln5/z$a;->o:I

    iget v0, p1, Ln5/z;->w:I

    iput v0, p0, Ln5/z$a;->p:I

    iget v0, p1, Ln5/z;->x:I

    iput v0, p0, Ln5/z$a;->q:I

    iget-object v0, p1, Ln5/z;->y:Li7/u;

    iput-object v0, p0, Ln5/z$a;->r:Li7/u;

    iget-object v0, p1, Ln5/z;->z:Li7/u;

    iput-object v0, p0, Ln5/z$a;->s:Li7/u;

    iget v0, p1, Ln5/z;->A:I

    iput v0, p0, Ln5/z$a;->t:I

    iget v0, p1, Ln5/z;->B:I

    iput v0, p0, Ln5/z$a;->u:I

    iget-boolean v0, p1, Ln5/z;->C:Z

    iput-boolean v0, p0, Ln5/z$a;->v:Z

    iget-boolean v0, p1, Ln5/z;->D:Z

    iput-boolean v0, p0, Ln5/z$a;->w:Z

    iget-boolean v0, p1, Ln5/z;->E:Z

    iput-boolean v0, p0, Ln5/z$a;->x:Z

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Ln5/z;->G:Li7/x;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ln5/z$a;->z:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Ln5/z;->F:Li7/v;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ln5/z$a;->y:Ljava/util/HashMap;

    return-void
.end method

.method public D(Ln5/z;)Ln5/z$a;
    .locals 0

    invoke-virtual {p0, p1}, Ln5/z$a;->B(Ln5/z;)V

    return-object p0
.end method

.method public E(Landroid/content/Context;)Ln5/z$a;
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Ln5/z$a;->F(Landroid/content/Context;)V

    :cond_0
    return-object p0
.end method

.method public final F(Landroid/content/Context;)V
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Ln5/z$a;->t:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lp5/n0;->X(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ln5/z$a;->s:Li7/u;

    :cond_2
    :goto_0
    return-void
.end method

.method public G(IIZ)Ln5/z$a;
    .locals 0

    iput p1, p0, Ln5/z$a;->i:I

    iput p2, p0, Ln5/z$a;->j:I

    iput-boolean p3, p0, Ln5/z$a;->k:Z

    return-object p0
.end method

.method public H(Landroid/content/Context;Z)Ln5/z$a;
    .locals 1

    invoke-static {p1}, Lp5/n0;->O(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1, p2}, Ln5/z$a;->G(IIZ)Ln5/z$a;

    move-result-object p1

    return-object p1
.end method
