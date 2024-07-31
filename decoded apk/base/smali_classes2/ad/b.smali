.class public final Lad/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lad/b;->a:Landroid/app/Activity;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()Lb;
    .locals 2

    iget-object v0, p0, Lad/b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    new-instance v0, Lb;

    invoke-virtual {p0}, Lad/b;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lb;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_0
    new-instance v0, Lad/a;

    invoke-direct {v0}, Lad/a;-><init>()V

    throw v0
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lad/b;->a:Landroid/app/Activity;

    return-void
.end method

.method public final d(Lf;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad/b;->a:Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lad/b;->a()Z

    move-result v1

    invoke-virtual {p1}, Lf;->a()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/16 v2, 0x80

    if-eqz p1, :cond_0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Window;->clearFlags(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Lad/a;

    invoke-direct {p1}, Lad/a;-><init>()V

    throw p1
.end method
