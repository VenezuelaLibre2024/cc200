.class public Lh/e$f$a;
.super Lk0/j0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh/e$f;


# direct methods
.method public constructor <init>(Lh/e$f;)V
    .locals 0

    iput-object p1, p0, Lh/e$f$a;->a:Lh/e$f;

    invoke-direct {p0}, Lk0/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh/e$f$a;->a:Lh/e$f;

    iget-object p1, p1, Lh/e$f;->h:Lh/e;

    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lh/e$f$a;->a:Lh/e$f;

    iget-object p1, p1, Lh/e$f;->h:Lh/e;

    iget-object p1, p1, Lh/e;->z:Lk0/h0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lk0/h0;->h(Lk0/i0;)Lk0/h0;

    iget-object p1, p0, Lh/e$f$a;->a:Lh/e$f;

    iget-object p1, p1, Lh/e$f;->h:Lh/e;

    iput-object v0, p1, Lh/e;->z:Lk0/h0;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh/e$f$a;->a:Lh/e$f;

    iget-object p1, p1, Lh/e$f;->h:Lh/e;

    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
