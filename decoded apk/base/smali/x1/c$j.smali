.class public Lx1/c$j;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/c;->q(Landroid/view/ViewGroup;Lx1/s;Lx1/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Lx1/c;


# direct methods
.method public constructor <init>(Lx1/c;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lx1/c$j;->c:Lx1/c;

    iput-object p2, p0, Lx1/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lx1/n;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lx1/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public b(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx1/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public c(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx1/x;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx1/c$j;->a:Z

    return-void
.end method

.method public d(Lx1/m;)V
    .locals 2

    iget-boolean v0, p0, Lx1/c$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lx1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lx1/x;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method

.method public e(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lx1/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method
