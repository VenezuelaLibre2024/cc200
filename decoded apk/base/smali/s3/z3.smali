.class public final Ls3/z3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/z3$a;
    }
.end annotation


# static fields
.field public static final i:Ls3/z3;

.field public static final j:Ljava/lang/String;

.field public static final k:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/z3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ls3/z3$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls3/z3;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    invoke-direct {v0, v1}, Ls3/z3;-><init>(Ljava/util/List;)V

    sput-object v0, Ls3/z3;->i:Ls3/z3;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/z3;->j:Ljava/lang/String;

    sget-object v0, Ls3/x3;->a:Ls3/x3;

    sput-object v0, Ls3/z3;->k:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/z3$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ls3/z3;->h:Li7/u;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/z3;
    .locals 0

    invoke-static {p0}, Ls3/z3;->d(Landroid/os/Bundle;)Ls3/z3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/os/Bundle;)Ls3/z3;
    .locals 1

    sget-object v0, Ls3/z3;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Ls3/z3$a;->q:Ls3/h$a;

    invoke-static {v0, p0}, Lp5/c;->b(Ls3/h$a;Ljava/util/List;)Li7/u;

    move-result-object p0

    :goto_0
    new-instance v0, Ls3/z3;

    invoke-direct {v0, p0}, Ls3/z3;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public b()Li7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "Ls3/z3$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls3/z3;->h:Li7/u;

    return-object v0
.end method

.method public c(I)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ls3/z3;->h:Li7/u;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ls3/z3;->h:Li7/u;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/z3$a;

    invoke-virtual {v2}, Ls3/z3$a;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ls3/z3$a;->c()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ls3/z3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ls3/z3;

    iget-object v0, p0, Ls3/z3;->h:Li7/u;

    iget-object p1, p1, Ls3/z3;->h:Li7/u;

    invoke-virtual {v0, p1}, Li7/u;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls3/z3;->h:Li7/u;

    invoke-virtual {v0}, Li7/u;->hashCode()I

    move-result v0

    return v0
.end method
