.class public Lk0/l0$d;
.super Lk0/l0$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk0/l0$f;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lk0/l0;)V
    .locals 1

    invoke-direct {p0, p1}, Lk0/l0$f;-><init>(Lk0/l0;)V

    invoke-virtual {p1}, Lk0/l0;->u()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lk0/l0;
    .locals 2

    invoke-virtual {p0}, Lk0/l0$f;->a()V

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lk0/l0;->v(Landroid/view/WindowInsets;)Lk0/l0;

    move-result-object v0

    iget-object v1, p0, Lk0/l0$f;->b:[La0/b;

    invoke-virtual {v0, v1}, Lk0/l0;->q([La0/b;)V

    return-object v0
.end method

.method public c(La0/b;)V
    .locals 1

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La0/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public d(La0/b;)V
    .locals 1

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La0/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public e(La0/b;)V
    .locals 1

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La0/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public f(La0/b;)V
    .locals 1

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La0/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public g(La0/b;)V
    .locals 1

    iget-object v0, p0, Lk0/l0$d;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, La0/b;->e()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
