.class public Landroidx/appcompat/widget/a$e;
.super Landroidx/appcompat/view/menu/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic m:Landroidx/appcompat/widget/a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a;Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;Z)V
    .locals 6

    iput-object p1, p0, Landroidx/appcompat/widget/a$e;->m:Landroidx/appcompat/widget/a;

    sget v5, Lg/a;->l:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    invoke-direct/range {v0 .. v5}, Landroidx/appcompat/view/menu/h;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZI)V

    const p2, 0x800005

    invoke-virtual {p0, p2}, Landroidx/appcompat/view/menu/h;->h(I)V

    iget-object p1, p1, Landroidx/appcompat/widget/a;->J:Landroidx/appcompat/widget/a$f;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/h;->j(Landroidx/appcompat/view/menu/i$a;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/a$e;->m:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->r(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/a$e;->m:Landroidx/appcompat/widget/a;

    invoke-static {v0}, Landroidx/appcompat/widget/a;->s(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a$e;->m:Landroidx/appcompat/widget/a;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/a;->F:Landroidx/appcompat/widget/a$e;

    invoke-super {p0}, Landroidx/appcompat/view/menu/h;->e()V

    return-void
.end method
