.class public Ln/k0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final synthetic h:Ln/k0;


# direct methods
.method public constructor <init>(Ln/k0;)V
    .locals 0

    iput-object p1, p0, Ln/k0$i;->h:Ln/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ln/k0$i;->h:Ln/k0;

    iget-object v0, v0, Ln/k0;->j:Ln/i0;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk0/b0;->F(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln/k0$i;->h:Ln/k0;

    iget-object v0, v0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I

    move-result v0

    iget-object v1, p0, Ln/k0$i;->h:Ln/k0;

    iget-object v1, v1, Ln/k0;->j:Ln/i0;

    invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Ln/k0$i;->h:Ln/k0;

    iget-object v0, v0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    iget-object v1, p0, Ln/k0$i;->h:Ln/k0;

    iget v2, v1, Ln/k0;->v:I

    if-gt v0, v2, :cond_0

    iget-object v0, v1, Ln/k0;->M:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v0, p0, Ln/k0$i;->h:Ln/k0;

    invoke-virtual {v0}, Ln/k0;->show()V

    :cond_0
    return-void
.end method
