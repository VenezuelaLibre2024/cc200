.class public Ln/b0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/b0$g;,
        Ln/b0$d;,
        Ln/b0$c;,
        Ln/b0$e;,
        Ln/b0$f;
    }
.end annotation


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ln/u0;

.field public c:Ln/u0;

.field public d:Ln/u0;

.field public e:Ln/u0;

.field public f:Ln/u0;

.field public g:Ln/u0;

.field public h:Ln/u0;

.field public final i:Ln/d0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln/b0;->j:I

    const/4 v0, -0x1

    iput v0, p0, Ln/b0;->k:I

    iput-object p1, p0, Ln/b0;->a:Landroid/widget/TextView;

    new-instance v0, Ln/d0;

    invoke-direct {v0, p1}, Ln/d0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ln/b0;->i:Ln/d0;

    return-void
.end method

.method public static d(Landroid/content/Context;Ln/j;I)Ln/u0;
    .locals 0

    invoke-virtual {p1, p0, p2}, Ln/j;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Ln/u0;

    invoke-direct {p1}, Ln/u0;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Ln/u0;->d:Z

    iput-object p0, p1, Ln/u0;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A(IF)V
    .locals 1

    sget-boolean v0, Ln0/b;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln/b0;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Ln/b0;->B(IF)V

    :cond_0
    return-void
.end method

.method public final B(IF)V
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0, p1, p2}, Ln/d0;->w(IF)V

    return-void
.end method

.method public final C(Landroid/content/Context;Ln/w0;)V
    .locals 10

    sget v0, Lg/j;->H2:I

    iget v1, p0, Ln/b0;->j:I

    invoke-virtual {p2, v0, v1}, Ln/w0;->j(II)I

    move-result v0

    iput v0, p0, Ln/b0;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lt v0, v1, :cond_0

    sget v5, Lg/j;->M2:I

    invoke-virtual {p2, v5, v3}, Ln/w0;->j(II)I

    move-result v5

    iput v5, p0, Ln/b0;->k:I

    if-eq v5, v3, :cond_0

    iget v5, p0, Ln/b0;->j:I

    and-int/2addr v5, v2

    or-int/2addr v5, v4

    iput v5, p0, Ln/b0;->j:I

    :cond_0
    sget v5, Lg/j;->L2:I

    invoke-virtual {p2, v5}, Ln/w0;->r(I)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_6

    sget v6, Lg/j;->N2:I

    invoke-virtual {p2, v6}, Ln/w0;->r(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    sget p1, Lg/j;->G2:I

    invoke-virtual {p2, p1}, Ln/w0;->r(I)Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v4, p0, Ln/b0;->m:Z

    invoke-virtual {p2, p1, v7}, Ln/w0;->j(II)I

    move-result p1

    if-eq p1, v7, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v6, 0x0

    iput-object v6, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    sget v6, Lg/j;->N2:I

    invoke-virtual {p2, v6}, Ln/w0;->r(I)Z

    move-result v8

    if-eqz v8, :cond_7

    move v5, v6

    :cond_7
    iget v6, p0, Ln/b0;->k:I

    iget v8, p0, Ln/b0;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Ln/b0$a;

    invoke-direct {v9, p0, v6, v8, p1}, Ln/b0$a;-><init>(Ln/b0;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Ln/b0;->j:I

    invoke-virtual {p2, v5, p1, v9}, Ln/w0;->i(IILz/h$f;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v1, :cond_9

    iget v0, p0, Ln/b0;->k:I

    if-eq v0, v3, :cond_9

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Ln/b0;->k:I

    iget v6, p0, Ln/b0;->j:I

    and-int/2addr v6, v2

    if-eqz v6, :cond_8

    move v6, v7

    goto :goto_3

    :cond_8
    move v6, v4

    :goto_3
    invoke-static {p1, v0, v6}, Ln/b0$g;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_9
    iput-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    :cond_a
    iget-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v7

    goto :goto_4

    :cond_b
    move p1, v4

    :goto_4
    iput-boolean p1, p0, Ln/b0;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v5}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v1, :cond_e

    iget p2, p0, Ln/b0;->k:I

    if-eq p2, v3, :cond_e

    invoke-static {p1, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ln/b0;->k:I

    iget v0, p0, Ln/b0;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_d

    move v4, v7

    :cond_d
    invoke-static {p1, p2, v4}, Ln/b0$g;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_5

    :cond_e
    iget p2, p0, Ln/b0;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_5
    iput-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    :cond_f
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;Ln/u0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Ln/j;->i(Landroid/graphics/drawable/Drawable;Ln/u0;[I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Ln/b0;->b:Ln/u0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/b0;->c:Ln/u0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/b0;->d:Ln/u0;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln/b0;->e:Ln/u0;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v3, v0, v2

    iget-object v4, p0, Ln/b0;->b:Ln/u0;

    invoke-virtual {p0, v3, v4}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    const/4 v3, 0x1

    aget-object v3, v0, v3

    iget-object v4, p0, Ln/b0;->c:Ln/u0;

    invoke-virtual {p0, v3, v4}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    aget-object v3, v0, v1

    iget-object v4, p0, Ln/b0;->d:Ln/u0;

    invoke-virtual {p0, v3, v4}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    const/4 v3, 0x3

    aget-object v0, v0, v3

    iget-object v3, p0, Ln/b0;->e:Ln/u0;

    invoke-virtual {p0, v0, v3}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_3

    iget-object v0, p0, Ln/b0;->f:Ln/u0;

    if-nez v0, :cond_2

    iget-object v0, p0, Ln/b0;->g:Ln/u0;

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0}, Ln/b0$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Ln/b0;->f:Ln/u0;

    invoke-virtual {p0, v2, v3}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Ln/b0;->g:Ln/u0;

    invoke-virtual {p0, v0, v1}, Ln/b0;->a(Landroid/graphics/drawable/Drawable;Ln/u0;)V

    :cond_3
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->b()V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->h()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->i()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->j()I

    move-result v0

    return v0
.end method

.method public h()[I
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->k()[I

    move-result-object v0

    return-object v0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->l()I

    move-result v0

    return v0
.end method

.method public j()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln/u0;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln/u0;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->q()Z

    move-result v0

    return v0
.end method

.method public m(Landroid/util/AttributeSet;I)V
    .locals 23
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Ln/j;->b()Ln/j;

    move-result-object v11

    sget-object v2, Lg/j;->Y:[I

    const/4 v12, 0x0

    invoke-static {v10, v8, v2, v9, v12}, Ln/w0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ln/w0;

    move-result-object v13

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v13}, Ln/w0;->q()Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move/from16 v5, p2

    invoke-static/range {v0 .. v6}, Lk0/b0;->U(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    sget v0, Lg/j;->Z:I

    const/4 v14, -0x1

    invoke-virtual {v13, v0, v14}, Ln/w0;->m(II)I

    move-result v0

    sget v1, Lg/j;->c0:I

    invoke-virtual {v13, v1}, Ln/w0;->r(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v13, v1, v12}, Ln/w0;->m(II)I

    move-result v1

    invoke-static {v10, v11, v1}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v1

    iput-object v1, v7, Ln/b0;->b:Ln/u0;

    :cond_0
    sget v1, Lg/j;->a0:I

    invoke-virtual {v13, v1}, Ln/w0;->r(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v13, v1, v12}, Ln/w0;->m(II)I

    move-result v1

    invoke-static {v10, v11, v1}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v1

    iput-object v1, v7, Ln/b0;->c:Ln/u0;

    :cond_1
    sget v1, Lg/j;->d0:I

    invoke-virtual {v13, v1}, Ln/w0;->r(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v13, v1, v12}, Ln/w0;->m(II)I

    move-result v1

    invoke-static {v10, v11, v1}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v1

    iput-object v1, v7, Ln/b0;->d:Ln/u0;

    :cond_2
    sget v1, Lg/j;->b0:I

    invoke-virtual {v13, v1}, Ln/w0;->r(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v13, v1, v12}, Ln/w0;->m(II)I

    move-result v1

    invoke-static {v10, v11, v1}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v1

    iput-object v1, v7, Ln/b0;->e:Ln/u0;

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_5

    sget v2, Lg/j;->e0:I

    invoke-virtual {v13, v2}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v13, v2, v12}, Ln/w0;->m(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v2

    iput-object v2, v7, Ln/b0;->f:Ln/u0;

    :cond_4
    sget v2, Lg/j;->f0:I

    invoke-virtual {v13, v2}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v13, v2, v12}, Ln/w0;->m(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ln/b0;->d(Landroid/content/Context;Ln/j;I)Ln/u0;

    move-result-object v2

    iput-object v2, v7, Ln/b0;->g:Ln/u0;

    :cond_5
    invoke-virtual {v13}, Ln/w0;->v()V

    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    const/16 v3, 0x1a

    const/16 v5, 0x17

    if-eq v0, v14, :cond_d

    sget-object v6, Lg/j;->E2:[I

    invoke-static {v10, v0, v6}, Ln/w0;->s(Landroid/content/Context;I[I)Ln/w0;

    move-result-object v0

    if-nez v2, :cond_6

    sget v6, Lg/j;->P2:I

    invoke-virtual {v0, v6}, Ln/w0;->r(I)Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-virtual {v0, v6, v12}, Ln/w0;->a(IZ)Z

    move-result v6

    const/4 v15, 0x1

    goto :goto_0

    :cond_6
    move v6, v12

    move v15, v6

    :goto_0
    invoke-virtual {v7, v10, v0}, Ln/b0;->C(Landroid/content/Context;Ln/w0;)V

    if-ge v1, v5, :cond_9

    sget v4, Lg/j;->I2:I

    invoke-virtual {v0, v4}, Ln/w0;->r(I)Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-virtual {v0, v4}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    goto :goto_1

    :cond_7
    const/4 v4, 0x0

    :goto_1
    sget v13, Lg/j;->J2:I

    invoke-virtual {v0, v13}, Ln/w0;->r(I)Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-virtual {v0, v13}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    goto :goto_2

    :cond_8
    const/4 v13, 0x0

    :goto_2
    sget v14, Lg/j;->K2:I

    invoke-virtual {v0, v14}, Ln/w0;->r(I)Z

    move-result v19

    if-eqz v19, :cond_a

    invoke-virtual {v0, v14}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v14

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    const/4 v13, 0x0

    :cond_a
    const/4 v14, 0x0

    :goto_3
    sget v5, Lg/j;->Q2:I

    invoke-virtual {v0, v5}, Ln/w0;->r(I)Z

    move-result v20

    if-eqz v20, :cond_b

    invoke-virtual {v0, v5}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    if-lt v1, v3, :cond_c

    sget v3, Lg/j;->O2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v21

    if-eqz v21, :cond_c

    invoke-virtual {v0, v3}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_c
    const/4 v3, 0x0

    :goto_5
    invoke-virtual {v0}, Ln/w0;->v()V

    goto :goto_6

    :cond_d
    move v6, v12

    move v15, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_6
    sget-object v0, Lg/j;->E2:[I

    invoke-static {v10, v8, v0, v9, v12}, Ln/w0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ln/w0;

    move-result-object v0

    if-nez v2, :cond_e

    sget v12, Lg/j;->P2:I

    invoke-virtual {v0, v12}, Ln/w0;->r(I)Z

    move-result v22

    if-eqz v22, :cond_e

    move-object/from16 v22, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v12, v3}, Ln/w0;->a(IZ)Z

    move-result v6

    const/16 v3, 0x17

    const/4 v15, 0x1

    goto :goto_7

    :cond_e
    move-object/from16 v22, v3

    const/16 v3, 0x17

    :goto_7
    if-ge v1, v3, :cond_11

    sget v3, Lg/j;->I2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-virtual {v0, v3}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    :cond_f
    sget v3, Lg/j;->J2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v12

    if-eqz v12, :cond_10

    invoke-virtual {v0, v3}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v13

    :cond_10
    sget v3, Lg/j;->K2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-virtual {v0, v3}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v14

    :cond_11
    sget v3, Lg/j;->Q2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-virtual {v0, v3}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object v5

    :cond_12
    const/16 v3, 0x1a

    if-lt v1, v3, :cond_13

    sget v3, Lg/j;->O2:I

    invoke-virtual {v0, v3}, Ln/w0;->r(I)Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-virtual {v0, v3}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_13
    move-object/from16 v3, v22

    :goto_8
    const/16 v12, 0x1c

    if-lt v1, v12, :cond_14

    sget v12, Lg/j;->F2:I

    invoke-virtual {v0, v12}, Ln/w0;->r(I)Z

    move-result v16

    if-eqz v16, :cond_14

    move-object/from16 v16, v11

    const/4 v11, -0x1

    invoke-virtual {v0, v12, v11}, Ln/w0;->e(II)I

    move-result v12

    if-nez v12, :cond_15

    iget-object v11, v7, Ln/b0;->a:Landroid/widget/TextView;

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-virtual {v11, v8, v12}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_9

    :cond_14
    move-object/from16 v16, v11

    :cond_15
    :goto_9
    invoke-virtual {v7, v10, v0}, Ln/b0;->C(Landroid/content/Context;Ln/w0;)V

    invoke-virtual {v0}, Ln/w0;->v()V

    if-eqz v4, :cond_16

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    if-eqz v13, :cond_17

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_17
    if-eqz v14, :cond_18

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_18
    if-nez v2, :cond_19

    if-eqz v15, :cond_19

    invoke-virtual {v7, v6}, Ln/b0;->s(Z)V

    :cond_19
    iget-object v0, v7, Ln/b0;->l:Landroid/graphics/Typeface;

    if-eqz v0, :cond_1b

    iget v2, v7, Ln/b0;->k:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_1a

    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    iget v4, v7, Ln/b0;->j:I

    invoke-virtual {v2, v0, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_a

    :cond_1a
    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1b
    :goto_a
    if-eqz v3, :cond_1c

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0, v3}, Ln/b0$f;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_1c
    if-eqz v5, :cond_1e

    const/16 v0, 0x18

    if-lt v1, v0, :cond_1d

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v5}, Ln/b0$e;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v0, v1}, Ln/b0$e;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    goto :goto_b

    :cond_1d
    const/16 v0, 0x15

    if-lt v1, v0, :cond_1e

    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0}, Ln/b0$d;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v1, v0}, Ln/b0$c;->c(Landroid/widget/TextView;Ljava/util/Locale;)V

    :cond_1e
    :goto_b
    iget-object v0, v7, Ln/b0;->i:Ln/d0;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v9}, Ln/d0;->r(Landroid/util/AttributeSet;I)V

    sget-boolean v0, Ln0/b;->f:Z

    if-eqz v0, :cond_20

    iget-object v0, v7, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->l()I

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, v7, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0}, Ln/d0;->k()[I

    move-result-object v0

    array-length v2, v0

    if-lez v2, :cond_20

    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v2}, Ln/b0$f;->a(Landroid/widget/TextView;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1f

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    iget-object v2, v7, Ln/b0;->i:Ln/d0;

    invoke-virtual {v2}, Ln/d0;->i()I

    move-result v2

    iget-object v3, v7, Ln/b0;->i:Ln/d0;

    invoke-virtual {v3}, Ln/d0;->h()I

    move-result v3

    iget-object v4, v7, Ln/b0;->i:Ln/d0;

    invoke-virtual {v4}, Ln/d0;->j()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v0, v2, v3, v4, v5}, Ln/b0$f;->b(Landroid/widget/TextView;IIII)V

    goto :goto_c

    :cond_1f
    const/4 v5, 0x0

    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v2, v0, v5}, Ln/b0$f;->c(Landroid/widget/TextView;[II)V

    :cond_20
    :goto_c
    sget-object v0, Lg/j;->g0:[I

    invoke-static {v10, v1, v0}, Ln/w0;->t(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ln/w0;

    move-result-object v8

    sget v0, Lg/j;->o0:I

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    move-object/from16 v2, v16

    if-eq v0, v1, :cond_21

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    goto :goto_d

    :cond_21
    const/4 v3, 0x0

    :goto_d
    sget v0, Lg/j;->t0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    if-eq v0, v1, :cond_22

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v4, v0

    goto :goto_e

    :cond_22
    const/4 v4, 0x0

    :goto_e
    sget v0, Lg/j;->p0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    if-eq v0, v1, :cond_23

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    goto :goto_f

    :cond_23
    const/4 v5, 0x0

    :goto_f
    sget v0, Lg/j;->m0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    if-eq v0, v1, :cond_24

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v6, v0

    goto :goto_10

    :cond_24
    const/4 v6, 0x0

    :goto_10
    sget v0, Lg/j;->q0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    if-eq v0, v1, :cond_25

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v9, v0

    goto :goto_11

    :cond_25
    const/4 v9, 0x0

    :goto_11
    sget v0, Lg/j;->n0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->m(II)I

    move-result v0

    if-eq v0, v1, :cond_26

    invoke-virtual {v2, v10, v0}, Ln/j;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v10, v0

    goto :goto_12

    :cond_26
    const/4 v10, 0x0

    :goto_12
    move-object/from16 v0, p0

    move-object v1, v3

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move-object v5, v9

    move-object v6, v10

    invoke-virtual/range {v0 .. v6}, Ln/b0;->y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    sget v0, Lg/j;->r0:I

    invoke-virtual {v8, v0}, Ln/w0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-virtual {v8, v0}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, Ln0/j;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_27
    sget v0, Lg/j;->s0:I

    invoke-virtual {v8, v0}, Ln/w0;->r(I)Z

    move-result v1

    if-eqz v1, :cond_28

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Ln/w0;->j(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ln/h0;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iget-object v2, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v2, v0}, Ln0/j;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_13

    :cond_28
    const/4 v1, -0x1

    :goto_13
    sget v0, Lg/j;->v0:I

    invoke-virtual {v8, v0, v1}, Ln/w0;->e(II)I

    move-result v0

    sget v2, Lg/j;->w0:I

    invoke-virtual {v8, v2, v1}, Ln/w0;->e(II)I

    move-result v2

    sget v3, Lg/j;->x0:I

    invoke-virtual {v8, v3, v1}, Ln/w0;->e(II)I

    move-result v3

    invoke-virtual {v8}, Ln/w0;->v()V

    if-eq v0, v1, :cond_29

    iget-object v4, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v4, v0}, Ln0/j;->h(Landroid/widget/TextView;I)V

    :cond_29
    if-eq v2, v1, :cond_2a

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0, v2}, Ln0/j;->i(Landroid/widget/TextView;I)V

    :cond_2a
    if-eq v3, v1, :cond_2b

    iget-object v0, v7, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0, v3}, Ln0/j;->j(Landroid/widget/TextView;I)V

    :cond_2b
    return-void
.end method

.method public n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;",
            "Landroid/graphics/Typeface;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, Ln/b0;->m:Z

    if-eqz v0, :cond_1

    iput-object p2, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lk0/b0;->F(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ln/b0;->j:I

    new-instance v1, Ln/b0$b;

    invoke-direct {v1, p0, p1, p2, v0}, Ln/b0$b;-><init>(Ln/b0;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget v0, p0, Ln/b0;->j:I

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o(ZIIII)V
    .locals 0

    sget-boolean p1, Ln0/b;->f:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ln/b0;->c()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    invoke-virtual {p0}, Ln/b0;->b()V

    return-void
.end method

.method public q(Landroid/content/Context;I)V
    .locals 4

    sget-object v0, Lg/j;->E2:[I

    invoke-static {p1, p2, v0}, Ln/w0;->s(Landroid/content/Context;I[I)Ln/w0;

    move-result-object p2

    sget v0, Lg/j;->P2:I

    invoke-virtual {p2, v0}, Ln/w0;->r(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0, v2}, Ln/w0;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Ln/b0;->s(Z)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_3

    sget v1, Lg/j;->I2:I

    invoke-virtual {p2, v1}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p2, v1}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v3, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    sget v1, Lg/j;->K2:I

    invoke-virtual {p2, v1}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2, v1}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v3, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_2
    sget v1, Lg/j;->J2:I

    invoke-virtual {p2, v1}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p2, v1}, Ln/w0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v3, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_3
    sget v1, Lg/j;->F2:I

    invoke-virtual {p2, v1}, Ln/w0;->r(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    invoke-virtual {p2, v1, v3}, Ln/w0;->e(II)I

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ln/b0;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_4
    invoke-virtual {p0, p1, p2}, Ln/b0;->C(Landroid/content/Context;Ln/w0;)V

    const/16 p1, 0x1a

    if-lt v0, p1, :cond_5

    sget p1, Lg/j;->O2:I

    invoke-virtual {p2, p1}, Ln/w0;->r(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2, p1}, Ln/w0;->n(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ln/b0$f;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_5
    invoke-virtual {p2}, Ln/w0;->v()V

    iget-object p1, p0, Ln/b0;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_6

    iget-object p2, p0, Ln/b0;->a:Landroid/widget/TextView;

    iget v0, p0, Ln/b0;->j:I

    invoke-virtual {p2, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_6
    return-void
.end method

.method public r(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p3, p1}, Lm0/a;->f(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    iget-object v0, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public t(IIII)V
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0, p1, p2, p3, p4}, Ln/d0;->s(IIII)V

    return-void
.end method

.method public u([II)V
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0, p1, p2}, Ln/d0;->t([II)V

    return-void
.end method

.method public v(I)V
    .locals 1

    iget-object v0, p0, Ln/b0;->i:Ln/d0;

    invoke-virtual {v0, p1}, Ln/d0;->u(I)V

    return-void
.end method

.method public w(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    if-nez v0, :cond_0

    new-instance v0, Ln/u0;

    invoke-direct {v0}, Ln/u0;-><init>()V

    iput-object v0, p0, Ln/b0;->h:Ln/u0;

    :cond_0
    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    iput-object p1, v0, Ln/u0;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ln/u0;->d:Z

    invoke-virtual {p0}, Ln/b0;->z()V

    return-void
.end method

.method public x(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    if-nez v0, :cond_0

    new-instance v0, Ln/u0;

    invoke-direct {v0}, Ln/u0;-><init>()V

    iput-object v0, p0, Ln/b0;->h:Ln/u0;

    :cond_0
    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    iput-object p1, v0, Ln/u0;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ln/u0;->c:Z

    invoke-virtual {p0}, Ln/b0;->z()V

    return-void
.end method

.method public final y(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-lt v0, v1, :cond_5

    if-nez p5, :cond_0

    if-eqz p6, :cond_5

    :cond_0
    iget-object p1, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {p1}, Ln/b0$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object p3, p0, Ln/b0;->a:Landroid/widget/TextView;

    if-eqz p5, :cond_1

    goto :goto_0

    :cond_1
    aget-object p5, p1, v5

    :goto_0
    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    aget-object p2, p1, v3

    :goto_1
    if-eqz p6, :cond_3

    goto :goto_2

    :cond_3
    aget-object p6, p1, v4

    :goto_2
    if-eqz p4, :cond_4

    goto :goto_3

    :cond_4
    aget-object p4, p1, v2

    :goto_3
    invoke-static {p3, p5, p2, p6, p4}, Ln/b0$c;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_a

    :cond_5
    if-nez p1, :cond_6

    if-nez p2, :cond_6

    if-nez p3, :cond_6

    if-eqz p4, :cond_f

    :cond_6
    if-lt v0, v1, :cond_a

    iget-object p5, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-static {p5}, Ln/b0$c;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    aget-object p6, p5, v5

    if-nez p6, :cond_7

    aget-object p6, p5, v4

    if-eqz p6, :cond_a

    :cond_7
    iget-object p1, p0, Ln/b0;->a:Landroid/widget/TextView;

    aget-object p3, p5, v5

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    aget-object p2, p5, v3

    :goto_4
    aget-object p6, p5, v4

    if-eqz p4, :cond_9

    goto :goto_5

    :cond_9
    aget-object p4, p5, v2

    :goto_5
    invoke-static {p1, p3, p2, p6, p4}, Ln/b0$c;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_a
    iget-object p5, p0, Ln/b0;->a:Landroid/widget/TextView;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object p5

    iget-object p6, p0, Ln/b0;->a:Landroid/widget/TextView;

    if-eqz p1, :cond_b

    goto :goto_6

    :cond_b
    aget-object p1, p5, v5

    :goto_6
    if-eqz p2, :cond_c

    goto :goto_7

    :cond_c
    aget-object p2, p5, v3

    :goto_7
    if-eqz p3, :cond_d

    goto :goto_8

    :cond_d
    aget-object p3, p5, v4

    :goto_8
    if-eqz p4, :cond_e

    goto :goto_9

    :cond_e
    aget-object p4, p5, v2

    :goto_9
    invoke-virtual {p6, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_f
    :goto_a
    return-void
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, Ln/b0;->h:Ln/u0;

    iput-object v0, p0, Ln/b0;->b:Ln/u0;

    iput-object v0, p0, Ln/b0;->c:Ln/u0;

    iput-object v0, p0, Ln/b0;->d:Ln/u0;

    iput-object v0, p0, Ln/b0;->e:Ln/u0;

    iput-object v0, p0, Ln/b0;->f:Ln/u0;

    iput-object v0, p0, Ln/b0;->g:Ln/u0;

    return-void
.end method
