.class public Landroidx/swiperefreshlayout/widget/c$d;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/c;->startAlphaAnimation(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Landroidx/swiperefreshlayout/widget/c;


# direct methods
.method public constructor <init>(Landroidx/swiperefreshlayout/widget/c;II)V
    .locals 0

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$d;->j:Landroidx/swiperefreshlayout/widget/c;

    iput p2, p0, Landroidx/swiperefreshlayout/widget/c$d;->h:I

    iput p3, p0, Landroidx/swiperefreshlayout/widget/c$d;->i:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$d;->j:Landroidx/swiperefreshlayout/widget/c;

    iget-object p2, p2, Landroidx/swiperefreshlayout/widget/c;->mProgress:Landroidx/swiperefreshlayout/widget/b;

    iget v0, p0, Landroidx/swiperefreshlayout/widget/c$d;->h:I

    int-to-float v1, v0

    iget v2, p0, Landroidx/swiperefreshlayout/widget/c$d;->i:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v1, v0

    float-to-int p1, v1

    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/b;->setAlpha(I)V

    return-void
.end method
