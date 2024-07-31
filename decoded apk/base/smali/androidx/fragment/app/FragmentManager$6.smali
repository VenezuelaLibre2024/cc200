.class Landroidx/fragment/app/FragmentManager$6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroidx/fragment/app/c0;

.field public final synthetic j:Landroidx/lifecycle/f;

.field public final synthetic k:Landroidx/fragment/app/x;


# virtual methods
.method public a(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 2

    sget-object p1, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->k:Landroidx/fragment/app/x;

    invoke-static {p1}, Landroidx/fragment/app/x;->f(Landroidx/fragment/app/x;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->h:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->i:Landroidx/fragment/app/c0;

    iget-object v1, p0, Landroidx/fragment/app/FragmentManager$6;->h:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroidx/fragment/app/c0;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->k:Landroidx/fragment/app/x;

    iget-object v0, p0, Landroidx/fragment/app/FragmentManager$6;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/x;->u(Ljava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->j:Landroidx/lifecycle/f;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/j;)V

    iget-object p1, p0, Landroidx/fragment/app/FragmentManager$6;->k:Landroidx/fragment/app/x;

    invoke-static {p1}, Landroidx/fragment/app/x;->g(Landroidx/fragment/app/x;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Landroidx/fragment/app/FragmentManager$6;->h:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
