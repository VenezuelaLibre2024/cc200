.class public Lh/k$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh/e$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lh/k;


# direct methods
.method public constructor <init>(Lh/k;)V
    .locals 0

    iput-object p1, p0, Lh/k$e;->a:Lh/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lh/k$e;->a:Lh/k;

    iget-boolean v0, p1, Lh/k;->d:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Lh/k;->a:Ln/g0;

    invoke-interface {p1}, Ln/g0;->c()V

    iget-object p1, p0, Lh/k$e;->a:Lh/k;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lh/k;->d:Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lh/k$e;->a:Lh/k;

    iget-object v0, v0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
