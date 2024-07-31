.class public Li2/g;
.super Li2/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/c<",
        "Lh2/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo2/a;)V
    .locals 0

    invoke-static {p1, p2}, Lj2/g;->c(Landroid/content/Context;Lo2/a;)Lj2/g;

    move-result-object p1

    invoke-virtual {p1}, Lj2/g;->d()Lj2/e;

    move-result-object p1

    invoke-direct {p0, p1}, Li2/c;-><init>(Lj2/d;)V

    return-void
.end method


# virtual methods
.method public b(Ll2/p;)Z
    .locals 2

    iget-object v0, p1, Ll2/p;->j:Lc2/b;

    invoke-virtual {v0}, Lc2/b;->b()Lc2/k;

    move-result-object v0

    sget-object v1, Lc2/k;->j:Lc2/k;

    if-eq v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object p1, p1, Ll2/p;->j:Lc2/b;

    invoke-virtual {p1}, Lc2/b;->b()Lc2/k;

    move-result-object p1

    sget-object v0, Lc2/k;->m:Lc2/k;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lh2/b;

    invoke-virtual {p0, p1}, Li2/g;->i(Lh2/b;)Z

    move-result p1

    return p1
.end method

.method public i(Lh2/b;)Z
    .locals 1

    invoke-virtual {p1}, Lh2/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lh2/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
