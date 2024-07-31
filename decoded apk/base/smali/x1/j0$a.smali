.class public Lx1/j0$a;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/j0;->l0(Landroid/view/ViewGroup;Lx1/s;ILx1/s;I)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lx1/j0;


# direct methods
.method public constructor <init>(Lx1/j0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lx1/j0$a;->d:Lx1/j0;

    iput-object p2, p0, Lx1/j0$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lx1/j0$a;->b:Landroid/view/View;

    iput-object p4, p0, Lx1/j0$a;->c:Landroid/view/View;

    invoke-direct {p0}, Lx1/n;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lx1/x;->a(Landroid/view/ViewGroup;)Lx1/w;

    move-result-object p1

    iget-object v0, p0, Lx1/j0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lx1/w;->d(Landroid/view/View;)V

    return-void
.end method

.method public d(Lx1/m;)V
    .locals 3

    iget-object v0, p0, Lx1/j0$a;->c:Landroid/view/View;

    sget v1, Lx1/j;->b:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lx1/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Lx1/x;->a(Landroid/view/ViewGroup;)Lx1/w;

    move-result-object v0

    iget-object v1, p0, Lx1/j0$a;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Lx1/w;->d(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method

.method public e(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/j0$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lx1/j0$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lx1/x;->a(Landroid/view/ViewGroup;)Lx1/w;

    move-result-object p1

    iget-object v0, p0, Lx1/j0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lx1/w;->c(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lx1/j0$a;->d:Lx1/j0;

    invoke-virtual {p1}, Lx1/m;->h()V

    :goto_0
    return-void
.end method
