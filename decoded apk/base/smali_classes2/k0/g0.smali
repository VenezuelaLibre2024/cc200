.class public final synthetic Lk0/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lk0/k0;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lk0/k0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/g0;->a:Lk0/k0;

    iput-object p2, p0, Lk0/g0;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lk0/g0;->a:Lk0/k0;

    iget-object v1, p0, Lk0/g0;->b:Landroid/view/View;

    invoke-static {v0, v1, p1}, Lk0/h0;->a(Lk0/k0;Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void
.end method
