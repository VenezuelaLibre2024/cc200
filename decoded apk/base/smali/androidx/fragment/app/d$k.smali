.class public Landroidx/fragment/app/d$k;
.super Landroidx/fragment/app/d$l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public c:Z

.field public d:Z

.field public e:Landroidx/fragment/app/k$a;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0$e;Lg0/e;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/d$l;-><init>(Landroidx/fragment/app/m0$e;Lg0/e;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/d$k;->d:Z

    iput-boolean p3, p0, Landroidx/fragment/app/d$k;->c:Z

    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;)Landroidx/fragment/app/k$a;
    .locals 4

    iget-boolean v0, p0, Landroidx/fragment/app/d$k;->d:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/d$k;->e:Landroidx/fragment/app/k$a;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/m0$e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/m0$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/d$l;->b()Landroidx/fragment/app/m0$e;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/m0$e;->e()Landroidx/fragment/app/m0$e$c;

    move-result-object v1

    sget-object v2, Landroidx/fragment/app/m0$e$c;->i:Landroidx/fragment/app/m0$e$c;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-boolean v2, p0, Landroidx/fragment/app/d$k;->c:Z

    invoke-static {p1, v0, v1, v2}, Landroidx/fragment/app/k;->b(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Landroidx/fragment/app/k$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/d$k;->e:Landroidx/fragment/app/k$a;

    iput-boolean v3, p0, Landroidx/fragment/app/d$k;->d:Z

    return-object p1
.end method
