.class public Lk0/h0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk0/h0;->i(Landroid/view/View;Lk0/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk0/i0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lk0/h0;


# direct methods
.method public constructor <init>(Lk0/h0;Lk0/i0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lk0/h0$a;->c:Lk0/h0;

    iput-object p2, p0, Lk0/h0$a;->a:Lk0/i0;

    iput-object p3, p0, Lk0/h0$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lk0/h0$a;->a:Lk0/i0;

    iget-object v0, p0, Lk0/h0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lk0/i0;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lk0/h0$a;->a:Lk0/i0;

    iget-object v0, p0, Lk0/h0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lk0/i0;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lk0/h0$a;->a:Lk0/i0;

    iget-object v0, p0, Lk0/h0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lk0/i0;->c(Landroid/view/View;)V

    return-void
.end method
