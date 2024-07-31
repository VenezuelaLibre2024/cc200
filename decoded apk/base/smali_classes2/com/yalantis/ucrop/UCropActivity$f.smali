.class public Lcom/yalantis/ucrop/UCropActivity$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/yalantis/ucrop/view/widget/HorizontalProgressWheelView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yalantis/ucrop/UCropActivity;->M()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/yalantis/ucrop/UCropActivity;


# direct methods
.method public constructor <init>(Lcom/yalantis/ucrop/UCropActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lvc/a;->B()V

    return-void
.end method

.method public b(FF)V
    .locals 4

    const/4 p2, 0x0

    cmpl-float p2, p1, p2

    const v0, 0x466a6000    # 15000.0f

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {p2}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object p2

    iget-object v1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v1}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v1

    invoke-virtual {v1}, Lvc/b;->getCurrentScale()F

    move-result v1

    iget-object v2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v2}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v2

    invoke-virtual {v2}, Lvc/a;->getMaxScale()F

    move-result v2

    iget-object v3, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v3}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v3

    invoke-virtual {v3}, Lvc/a;->getMinScale()F

    move-result v3

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    mul-float/2addr p1, v2

    add-float/2addr v1, p1

    invoke-virtual {p2, v1}, Lvc/a;->E(F)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {p2}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object p2

    iget-object v1, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v1}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v1

    invoke-virtual {v1}, Lvc/b;->getCurrentScale()F

    move-result v1

    iget-object v2, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v2}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v2

    invoke-virtual {v2}, Lvc/a;->getMaxScale()F

    move-result v2

    iget-object v3, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v3}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v3

    invoke-virtual {v3}, Lvc/a;->getMinScale()F

    move-result v3

    sub-float/2addr v2, v3

    div-float/2addr v2, v0

    mul-float/2addr p1, v2

    add-float/2addr v1, p1

    invoke-virtual {p2, v1}, Lvc/a;->G(F)V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$f;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v0

    invoke-virtual {v0}, Lvc/a;->v()V

    return-void
.end method
