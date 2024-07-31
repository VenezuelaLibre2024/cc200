.class public Lh/e$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e;->J0(Ll/b$a;)Ll/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lh/e;


# direct methods
.method public constructor <init>(Lh/e;)V
    .locals 0

    iput-object p1, p0, Lh/e$f;->h:Lh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v1, v0, Lh/e;->x:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    invoke-virtual {v0}, Lh/e;->Z()V

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    invoke-virtual {v0}, Lh/e;->H0()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v0, v0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v2, v0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lk0/b0;->c(Landroid/view/View;)Lk0/h0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lk0/h0;->b(F)Lk0/h0;

    move-result-object v1

    iput-object v1, v0, Lh/e;->z:Lk0/h0;

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v0, v0, Lh/e;->z:Lk0/h0;

    new-instance v1, Lh/e$f$a;

    invoke-direct {v1, p0}, Lh/e$f$a;-><init>(Lh/e$f;)V

    invoke-virtual {v0, v1}, Lk0/h0;->h(Lk0/i0;)Lk0/h0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v0, v0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object v0, p0, Lh/e$f;->h:Lh/e;

    iget-object v0, v0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
