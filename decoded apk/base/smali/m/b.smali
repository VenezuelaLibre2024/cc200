.class public abstract Lm/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/g<",
            "Lc0/b;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/g<",
            "Lc0/c;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lc0/b;

    if-eqz v0, :cond_2

    check-cast p1, Lc0/b;

    iget-object v0, p0, Lm/b;->b:Lu/g;

    if-nez v0, :cond_0

    new-instance v0, Lu/g;

    invoke-direct {v0}, Lu/g;-><init>()V

    iput-object v0, p0, Lm/b;->b:Lu/g;

    :cond_0
    iget-object v0, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v0, p1}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, Lm/c;

    iget-object v1, p0, Lm/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lm/c;-><init>(Landroid/content/Context;Lc0/b;)V

    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1, p1, v0}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final d(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, Lc0/c;

    if-eqz v0, :cond_2

    check-cast p1, Lc0/c;

    iget-object v0, p0, Lm/b;->c:Lu/g;

    if-nez v0, :cond_0

    new-instance v0, Lu/g;

    invoke-direct {v0}, Lu/g;-><init>()V

    iput-object v0, p0, Lm/b;->c:Lu/g;

    :cond_0
    iget-object v0, p0, Lm/b;->c:Lu/g;

    invoke-virtual {v0, p1}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, Lm/g;

    iget-object v1, p0, Lm/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lm/g;-><init>(Landroid/content/Context;Lc0/c;)V

    iget-object v1, p0, Lm/b;->c:Lu/g;

    invoke-virtual {v1, p1, v0}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lm/b;->b:Lu/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu/g;->clear()V

    :cond_0
    iget-object v0, p0, Lm/b;->c:Lu/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu/g;->clear()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 2

    iget-object v0, p0, Lm/b;->b:Lu/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1}, Lu/g;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1, v0}, Lu/g;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/b;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1, v0}, Lu/g;->k(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g(I)V
    .locals 2

    iget-object v0, p0, Lm/b;->b:Lu/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1}, Lu/g;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {v1, v0}, Lu/g;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/b;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object p1, p0, Lm/b;->b:Lu/g;

    invoke-virtual {p1, v0}, Lu/g;->k(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
