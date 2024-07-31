.class public Li2/b;
.super Li2/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo2/a;)V
    .locals 0

    invoke-static {p1, p2}, Lj2/g;->c(Landroid/content/Context;Lo2/a;)Lj2/g;

    move-result-object p1

    invoke-virtual {p1}, Lj2/g;->b()Lj2/b;

    move-result-object p1

    invoke-direct {p0, p1}, Li2/c;-><init>(Lj2/d;)V

    return-void
.end method


# virtual methods
.method public b(Ll2/p;)Z
    .locals 0

    iget-object p1, p1, Ll2/p;->j:Lc2/b;

    invoke-virtual {p1}, Lc2/b;->f()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Li2/b;->i(Ljava/lang/Boolean;)Z

    move-result p1

    return p1
.end method

.method public i(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
