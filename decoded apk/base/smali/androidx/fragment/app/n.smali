.class public Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroidx/fragment/app/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/fragment/app/p<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/p<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    return-void
.end method

.method public static b(Landroidx/fragment/app/p;)Landroidx/fragment/app/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/p<",
            "*>;)",
            "Landroidx/fragment/app/n;"
        }
    .end annotation

    new-instance v0, Landroidx/fragment/app/n;

    const-string v1, "callbacks == null"

    invoke-static {p0, v1}, Lj0/d;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/p;

    invoke-direct {v0, p0}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/p;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroidx/fragment/app/Fragment;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v1, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v1, v0, v0, p1}, Landroidx/fragment/app/x;->n(Landroidx/fragment/app/p;Landroidx/fragment/app/l;Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->z()V

    return-void
.end method

.method public d(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x;->C(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->D()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->F()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->O()V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->S()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->T()V

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->V()V

    return-void
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->c0(Z)Z

    move-result v0

    return v0
.end method

.method public l()Landroidx/fragment/app/x;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    return-object v0
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->Z0()V

    return-void
.end method

.method public n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/n;->a:Landroidx/fragment/app/p;

    iget-object v0, v0, Landroidx/fragment/app/p;->l:Landroidx/fragment/app/x;

    invoke-virtual {v0}, Landroidx/fragment/app/x;->w0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
