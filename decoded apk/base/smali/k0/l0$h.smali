.class public Lk0/l0$h;
.super Lk0/l0$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public m:La0/b;


# direct methods
.method public constructor <init>(Lk0/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$g;-><init>(Lk0/l0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk0/l0$h;->m:La0/b;

    return-void
.end method

.method public constructor <init>(Lk0/l0;Lk0/l0$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk0/l0$g;-><init>(Lk0/l0;Lk0/l0$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk0/l0$h;->m:La0/b;

    iget-object p1, p2, Lk0/l0$h;->m:La0/b;

    iput-object p1, p0, Lk0/l0$h;->m:La0/b;

    return-void
.end method


# virtual methods
.method public b()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object v0

    return-object v0
.end method

.method public c()Lk0/l0;
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object v0

    return-object v0
.end method

.method public final i()La0/b;
    .locals 4

    iget-object v0, p0, Lk0/l0$h;->m:La0/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, La0/b;->b(IIII)La0/b;

    move-result-object v0

    iput-object v0, p0, Lk0/l0$h;->m:La0/b;

    :cond_0
    iget-object v0, p0, Lk0/l0$h;->m:La0/b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lk0/l0$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public t(La0/b;)V
    .locals 0

    iput-object p1, p0, Lk0/l0$h;->m:La0/b;

    return-void
.end method
