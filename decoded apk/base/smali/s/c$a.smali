.class public Ls/c$a;
.super Lb/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/c;->b(Ls/b;)Lb/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Landroid/os/Handler;

.field public final synthetic b:Ls/b;

.field public final synthetic c:Ls/c;


# direct methods
.method public constructor <init>(Ls/c;Ls/b;)V
    .locals 0

    iput-object p1, p0, Ls/c$a;->c:Ls/c;

    iput-object p2, p0, Ls/c$a;->b:Ls/b;

    invoke-direct {p0}, Lb/a$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ls/c$a;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public B1(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 8

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v7, Ls/c$a$e;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ls/c$a$e;-><init>(Ls/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public D0(IILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v1, Ls/c$a$f;

    invoke-direct {v1, p0, p1, p2, p3}, Ls/c$a$f;-><init>(Ls/c$a;IILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public R0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v1, Ls/c$a$b;

    invoke-direct {v1, p0, p1, p2}, Ls/c$a$b;-><init>(Ls/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public X(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Ls/b;->extraCallbackWithResult(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public c1(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v1, Ls/c$a$a;

    invoke-direct {v1, p0, p1, p2}, Ls/c$a$a;-><init>(Ls/c$a;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public r1(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v1, Ls/c$a$d;

    invoke-direct {v1, p0, p1, p2}, Ls/c$a$d;-><init>(Ls/c$a;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public y1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ls/c$a;->b:Ls/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls/c$a;->a:Landroid/os/Handler;

    new-instance v1, Ls/c$a$c;

    invoke-direct {v1, p0, p1}, Ls/c$a$c;-><init>(Ls/c$a;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
