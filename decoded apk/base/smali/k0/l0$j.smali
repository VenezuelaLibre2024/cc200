.class public Lk0/l0$j;
.super Lk0/l0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public n:La0/b;

.field public o:La0/b;

.field public p:La0/b;


# direct methods
.method public constructor <init>(Lk0/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$i;-><init>(Lk0/l0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk0/l0$j;->n:La0/b;

    iput-object p1, p0, Lk0/l0$j;->o:La0/b;

    iput-object p1, p0, Lk0/l0$j;->p:La0/b;

    return-void
.end method

.method public constructor <init>(Lk0/l0;Lk0/l0$j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$i;-><init>(Lk0/l0;Lk0/l0$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk0/l0$j;->n:La0/b;

    iput-object p1, p0, Lk0/l0$j;->o:La0/b;

    iput-object p1, p0, Lk0/l0$j;->p:La0/b;

    return-void
.end method


# virtual methods
.method public h()La0/b;
    .locals 1

    iget-object v0, p0, Lk0/l0$j;->o:La0/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La0/b;->d(Landroid/graphics/Insets;)La0/b;

    move-result-object v0

    iput-object v0, p0, Lk0/l0$j;->o:La0/b;

    :cond_0
    iget-object v0, p0, Lk0/l0$j;->o:La0/b;

    return-object v0
.end method

.method public j()La0/b;
    .locals 1

    iget-object v0, p0, Lk0/l0$j;->n:La0/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La0/b;->d(Landroid/graphics/Insets;)La0/b;

    move-result-object v0

    iput-object v0, p0, Lk0/l0$j;->n:La0/b;

    :cond_0
    iget-object v0, p0, Lk0/l0$j;->n:La0/b;

    return-object v0
.end method

.method public l()La0/b;
    .locals 1

    iget-object v0, p0, Lk0/l0$j;->p:La0/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La0/b;->d(Landroid/graphics/Insets;)La0/b;

    move-result-object v0

    iput-object v0, p0, Lk0/l0$j;->p:La0/b;

    :cond_0
    iget-object v0, p0, Lk0/l0$j;->p:La0/b;

    return-object v0
.end method

.method public m(IIII)Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object p1

    return-object p1
.end method

.method public t(La0/b;)V
    .locals 0

    return-void
.end method
