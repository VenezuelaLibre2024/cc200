.class public Ln/k0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Ln/k0;


# direct methods
.method public constructor <init>(Ln/k0;)V
    .locals 0

    iput-object p1, p0, Ln/k0$g;->a:Ln/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Ln/k0$g;->a:Ln/k0;

    invoke-virtual {p1}, Ln/k0;->v()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ln/k0$g;->a:Ln/k0;

    iget-object p1, p1, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ln/k0$g;->a:Ln/k0;

    iget-object p2, p1, Ln/k0;->I:Landroid/os/Handler;

    iget-object p1, p1, Ln/k0;->D:Ln/k0$i;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Ln/k0$g;->a:Ln/k0;

    iget-object p1, p1, Ln/k0;->D:Ln/k0$i;

    invoke-virtual {p1}, Ln/k0$i;->run()V

    :cond_0
    return-void
.end method
