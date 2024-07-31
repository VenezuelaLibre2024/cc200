.class public Ls3/u1$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Ls3/u1$f;

.field public final d:Ls3/u1$b;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt4/c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/String;

.field public final g:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ls3/u1$l;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/u1$k;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ls3/u1$f;",
            "Ls3/u1$b;",
            "Ljava/util/List<",
            "Lt4/c;",
            ">;",
            "Ljava/lang/String;",
            "Li7/u<",
            "Ls3/u1$l;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/u1$h;->a:Landroid/net/Uri;

    iput-object p2, p0, Ls3/u1$h;->b:Ljava/lang/String;

    iput-object p3, p0, Ls3/u1$h;->c:Ls3/u1$f;

    iput-object p5, p0, Ls3/u1$h;->e:Ljava/util/List;

    iput-object p6, p0, Ls3/u1$h;->f:Ljava/lang/String;

    iput-object p7, p0, Ls3/u1$h;->g:Li7/u;

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ls3/u1$l;

    invoke-virtual {p3}, Ls3/u1$l;->a()Ls3/u1$l$a;

    move-result-object p3

    invoke-static {p3}, Ls3/u1$l$a;->a(Ls3/u1$l$a;)Ls3/u1$k;

    move-result-object p3

    invoke-virtual {p1, p3}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li7/u$a;->k()Li7/u;

    move-result-object p1

    iput-object p1, p0, Ls3/u1$h;->h:Ljava/util/List;

    iput-object p8, p0, Ls3/u1$h;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;Ls3/u1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Ls3/u1$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls3/u1$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls3/u1$h;

    iget-object v1, p0, Ls3/u1$h;->a:Landroid/net/Uri;

    iget-object v3, p1, Ls3/u1$h;->a:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->b:Ljava/lang/String;

    iget-object v3, p1, Ls3/u1$h;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->c:Ls3/u1$f;

    iget-object v3, p1, Ls3/u1$h;->c:Ls3/u1$f;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->d:Ls3/u1$b;

    iget-object v3, p1, Ls3/u1$h;->d:Ls3/u1$b;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->e:Ljava/util/List;

    iget-object v3, p1, Ls3/u1$h;->e:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->f:Ljava/lang/String;

    iget-object v3, p1, Ls3/u1$h;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->g:Li7/u;

    iget-object v3, p1, Ls3/u1$h;->g:Li7/u;

    invoke-virtual {v1, v3}, Li7/u;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$h;->i:Ljava/lang/Object;

    iget-object p1, p1, Ls3/u1$h;->i:Ljava/lang/Object;

    invoke-static {v1, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ls3/u1$h;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->c:Ls3/u1$f;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ls3/u1$f;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->f:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->g:Li7/u;

    invoke-virtual {v1}, Li7/u;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1$h;->i:Ljava/lang/Object;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method
