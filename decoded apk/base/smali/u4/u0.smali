.class public final Lu4/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final k:Lu4/u0;

.field public static final l:Ljava/lang/String;

.field public static final m:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Lu4/u0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Lu4/s0;",
            ">;"
        }
    .end annotation
.end field

.field public j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu4/u0;

    const/4 v1, 0x0

    new-array v2, v1, [Lu4/s0;

    invoke-direct {v0, v2}, Lu4/u0;-><init>([Lu4/s0;)V

    sput-object v0, Lu4/u0;->k:Lu4/u0;

    invoke-static {v1}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu4/u0;->l:Ljava/lang/String;

    sget-object v0, Lu4/t0;->a:Lu4/t0;

    sput-object v0, Lu4/u0;->m:Ls3/h$a;

    return-void
.end method

.method public varargs constructor <init>([Lu4/s0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/u;->q([Ljava/lang/Object;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Lu4/u0;->i:Li7/u;

    array-length p1, p1

    iput p1, p0, Lu4/u0;->h:I

    invoke-virtual {p0}, Lu4/u0;->e()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lu4/u0;
    .locals 0

    invoke-static {p0}, Lu4/u0;->d(Landroid/os/Bundle;)Lu4/u0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/os/Bundle;)Lu4/u0;
    .locals 3

    sget-object v0, Lu4/u0;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-instance p0, Lu4/u0;

    new-array v0, v0, [Lu4/s0;

    invoke-direct {p0, v0}, Lu4/u0;-><init>([Lu4/s0;)V

    return-object p0

    :cond_0
    new-instance v1, Lu4/u0;

    sget-object v2, Lu4/s0;->o:Ls3/h$a;

    invoke-static {v2, p0}, Lp5/c;->b(Ls3/h$a;Ljava/util/List;)Li7/u;

    move-result-object p0

    new-array v0, v0, [Lu4/s0;

    invoke-virtual {p0, v0}, Li7/s;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lu4/s0;

    invoke-direct {v1, p0}, Lu4/u0;-><init>([Lu4/s0;)V

    return-object v1
.end method


# virtual methods
.method public b(I)Lu4/s0;
    .locals 1

    iget-object v0, p0, Lu4/u0;->i:Li7/u;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/s0;

    return-object p1
.end method

.method public c(Lu4/s0;)I
    .locals 1

    iget-object v0, p0, Lu4/u0;->i:Li7/u;

    invoke-virtual {v0, p1}, Li7/u;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final e()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu4/u0;->i:Li7/u;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    move v2, v1

    :goto_1
    iget-object v3, p0, Lu4/u0;->i:Li7/u;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lu4/u0;->i:Li7/u;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu4/s0;

    iget-object v4, p0, Lu4/u0;->i:Li7/u;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lu4/s0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, "TrackGroupArray"

    const-string v5, ""

    invoke-static {v4, v5, v3}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lu4/u0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu4/u0;

    iget v2, p0, Lu4/u0;->h:I

    iget v3, p1, Lu4/u0;->h:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lu4/u0;->i:Li7/u;

    iget-object p1, p1, Lu4/u0;->i:Li7/u;

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
    .locals 1

    iget v0, p0, Lu4/u0;->j:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lu4/u0;->i:Li7/u;

    invoke-virtual {v0}, Li7/u;->hashCode()I

    move-result v0

    iput v0, p0, Lu4/u0;->j:I

    :cond_0
    iget v0, p0, Lu4/u0;->j:I

    return v0
.end method
