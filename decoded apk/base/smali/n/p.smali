.class public Ln/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public b:Ln/u0;

.field public c:Ln/u0;

.field public d:Ln/u0;

.field public e:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln/p;->e:I

    iput-object p1, p0, Ln/p;->a:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    iget-object v0, p0, Ln/p;->d:Ln/u0;

    if-nez v0, :cond_0

    new-instance v0, Ln/u0;

    invoke-direct {v0}, Ln/u0;-><init>()V

    iput-object v0, p0, Ln/p;->d:Ln/u0;

    :cond_0
    iget-object v0, p0, Ln/p;->d:Ln/u0;

    invoke-virtual {v0}, Ln/u0;->a()V

    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-static {v1}, Ln0/f;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Ln/u0;->d:Z

    iput-object v1, v0, Ln/u0;->a:Landroid/content/res/ColorStateList;

    :cond_1
    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-static {v1}, Ln0/f;->b(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    if-eqz v1, :cond_2

    iput-boolean v2, v0, Ln/u0;->c:Z

    iput-object v1, v0, Ln/u0;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_2
    iget-boolean v1, v0, Ln/u0;->d:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, Ln/u0;->c:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_0
    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v1

    invoke-static {p1, v0, v1}, Ln/j;->i(Landroid/graphics/drawable/Drawable;Ln/u0;[I)V

    return v2
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Ln/p;->e:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ln/h0;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ln/p;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ln/p;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Ln/p;->c:Ln/u0;

    if-eqz v1, :cond_2

    iget-object v2, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Ln/j;->i(Landroid/graphics/drawable/Drawable;Ln/u0;[I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ln/p;->b:Ln/u0;

    if-eqz v1, :cond_3

    iget-object v2, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Ln/j;->i(Landroid/graphics/drawable/Drawable;Ln/u0;[I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public d()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ln/p;->c:Ln/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln/u0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ln/p;->c:Ln/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln/u0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f()Z
    .locals 3

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public g(Landroid/util/AttributeSet;I)V
    .locals 8

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lg/j;->P:[I

    const/4 v1, 0x0

    invoke-static {v0, p1, v3, p2, v1}, Ln/w0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ln/w0;

    move-result-object v0

    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Ln/w0;->q()Landroid/content/res/TypedArray;

    move-result-object v5

    const/4 v7, 0x0

    move-object v4, p1

    move v6, p2

    invoke-static/range {v1 .. v7}, Lk0/b0;->U(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :try_start_0
    iget-object p1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 p2, -0x1

    if-nez p1, :cond_0

    sget v1, Lg/j;->Q:I

    invoke-virtual {v0, v1, p2}, Ln/w0;->m(II)I

    move-result v1

    if-eq v1, p2, :cond_0

    iget-object p1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Li/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Ln/h0;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    sget p1, Lg/j;->R:I

    invoke-virtual {v0, p1}, Ln/w0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v1, p1}, Ln0/f;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    :cond_2
    sget p1, Lg/j;->S:I

    invoke-virtual {v0, p1}, Ln/w0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1, p2}, Ln/w0;->j(II)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ln/h0;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-static {v1, p1}, Ln0/f;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-virtual {v0}, Ln/w0;->v()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ln/w0;->v()V

    throw p1
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result p1

    iput p1, p0, Ln/p;->e:I

    return-void
.end method

.method public i(I)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Li/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ln/h0;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Ln/p;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ln/p;->a:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Ln/p;->c()V

    return-void
.end method

.method public j(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ln/p;->c:Ln/u0;

    if-nez v0, :cond_0

    new-instance v0, Ln/u0;

    invoke-direct {v0}, Ln/u0;-><init>()V

    iput-object v0, p0, Ln/p;->c:Ln/u0;

    :cond_0
    iget-object v0, p0, Ln/p;->c:Ln/u0;

    iput-object p1, v0, Ln/u0;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ln/u0;->d:Z

    invoke-virtual {p0}, Ln/p;->c()V

    return-void
.end method

.method public k(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ln/p;->c:Ln/u0;

    if-nez v0, :cond_0

    new-instance v0, Ln/u0;

    invoke-direct {v0}, Ln/u0;-><init>()V

    iput-object v0, p0, Ln/p;->c:Ln/u0;

    :cond_0
    iget-object v0, p0, Ln/p;->c:Ln/u0;

    iput-object p1, v0, Ln/u0;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ln/u0;->c:Z

    invoke-virtual {p0}, Ln/p;->c()V

    return-void
.end method

.method public final l()Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-le v0, v3, :cond_1

    iget-object v0, p0, Ln/p;->b:Ln/u0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method
