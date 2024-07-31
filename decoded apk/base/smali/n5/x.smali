.class public final Ln5/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ln5/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lu4/s0;

.field public final i:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ln5/x;->j:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ln5/x;->k:Ljava/lang/String;

    sget-object v0, Ln5/w;->a:Ln5/w;

    sput-object v0, Ln5/x;->l:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Lu4/s0;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu4/s0;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lu4/s0;->h:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Ln5/x;->h:Lu4/s0;

    invoke-static {p2}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ln5/x;->i:Li7/u;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ln5/x;
    .locals 0

    invoke-static {p0}, Ln5/x;->c(Landroid/os/Bundle;)Ln5/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ln5/x;
    .locals 2

    sget-object v0, Ln5/x;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    sget-object v1, Lu4/s0;->o:Ls3/h$a;

    invoke-interface {v1, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Lu4/s0;

    sget-object v1, Ln5/x;->k:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p0

    invoke-static {p0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    new-instance v1, Ln5/x;

    invoke-static {p0}, Lk7/e;->c([I)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Ln5/x;-><init>(Lu4/s0;Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Ln5/x;->h:Lu4/s0;

    iget v0, v0, Lu4/s0;->j:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ln5/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ln5/x;

    iget-object v2, p0, Ln5/x;->h:Lu4/s0;

    iget-object v3, p1, Ln5/x;->h:Lu4/s0;

    invoke-virtual {v2, v3}, Lu4/s0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln5/x;->i:Li7/u;

    iget-object p1, p1, Ln5/x;->i:Li7/u;

    invoke-virtual {v2, p1}, Li7/u;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ln5/x;->h:Lu4/s0;

    invoke-virtual {v0}, Lu4/s0;->hashCode()I

    move-result v0

    iget-object v1, p0, Ln5/x;->i:Li7/u;

    invoke-virtual {v1}, Li7/u;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method
