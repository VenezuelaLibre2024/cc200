.class public Lm/c$a;
.super Lk0/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final d:Landroid/view/ActionProvider;

.field public final synthetic e:Lm/c;


# direct methods
.method public constructor <init>(Lm/c;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    iput-object p1, p0, Lm/c$a;->e:Lm/c;

    invoke-direct {p0, p2}, Lk0/b;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lm/c$a;->d:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lm/c$a;->d:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lm/c$a;->d:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lm/c$a;->d:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method

.method public f(Landroid/view/SubMenu;)V
    .locals 2

    iget-object v0, p0, Lm/c$a;->d:Landroid/view/ActionProvider;

    iget-object v1, p0, Lm/c$a;->e:Lm/c;

    invoke-virtual {v1, p1}, Lm/b;->d(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    return-void
.end method
