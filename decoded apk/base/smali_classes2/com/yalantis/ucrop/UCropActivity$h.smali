.class public Lcom/yalantis/ucrop/UCropActivity$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lrc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yalantis/ucrop/UCropActivity;->t()V
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

    iput-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$h;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;IIII)V
    .locals 7

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$h;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-static {v0}, Lcom/yalantis/ucrop/UCropActivity;->m(Lcom/yalantis/ucrop/UCropActivity;)Lcom/yalantis/ucrop/view/GestureCropImageView;

    move-result-object v1

    invoke-virtual {v1}, Lvc/a;->getTargetAspectRatio()F

    move-result v2

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/yalantis/ucrop/UCropActivity;->E(Landroid/net/Uri;FIIII)V

    iget-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$h;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/UCropActivity$h;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {v0, p1}, Lcom/yalantis/ucrop/UCropActivity;->D(Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/yalantis/ucrop/UCropActivity$h;->a:Lcom/yalantis/ucrop/UCropActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
