.class public final Lg6/o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh6/c$c;
.implements Lg6/k1;


# instance fields
.field public final a:Lf6/a$f;

.field public final b:Lg6/b;

.field public c:Lh6/k;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:Lg6/f;


# direct methods
.method public constructor <init>(Lg6/f;Lf6/a$f;Lg6/b;)V
    .locals 0

    iput-object p1, p0, Lg6/o0;->f:Lg6/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lg6/o0;->c:Lh6/k;

    iput-object p1, p0, Lg6/o0;->d:Ljava/util/Set;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg6/o0;->e:Z

    iput-object p2, p0, Lg6/o0;->a:Lf6/a$f;

    iput-object p3, p0, Lg6/o0;->b:Lg6/b;

    return-void
.end method

.method public static bridge synthetic d(Lg6/o0;)Lf6/a$f;
    .locals 0

    iget-object p0, p0, Lg6/o0;->a:Lf6/a$f;

    return-object p0
.end method

.method public static bridge synthetic e(Lg6/o0;)Lg6/b;
    .locals 0

    iget-object p0, p0, Lg6/o0;->b:Lg6/b;

    return-object p0
.end method

.method public static bridge synthetic f(Lg6/o0;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/o0;->e:Z

    return-void
.end method

.method public static bridge synthetic g(Lg6/o0;)V
    .locals 0

    invoke-virtual {p0}, Lg6/o0;->h()V

    return-void
.end method


# virtual methods
.method public final a(Le6/b;)V
    .locals 2

    iget-object v0, p0, Lg6/o0;->f:Lg6/f;

    invoke-static {v0}, Lg6/f;->E(Lg6/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg6/o0;->b:Lg6/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg6/k0;->I(Le6/b;)V

    :cond_0
    return-void
.end method

.method public final b(Le6/b;)V
    .locals 2

    iget-object v0, p0, Lg6/o0;->f:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lg6/n0;

    invoke-direct {v1, p0, p1}, Lg6/n0;-><init>(Lg6/o0;Le6/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(Lh6/k;Ljava/util/Set;)V
    .locals 1

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lg6/o0;->c:Lh6/k;

    iput-object p2, p0, Lg6/o0;->d:Ljava/util/Set;

    invoke-virtual {p0}, Lg6/o0;->h()V

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GoogleApiManager"

    const-string v0, "Received null response from onSignInSuccess"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Le6/b;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Le6/b;-><init>(I)V

    invoke-virtual {p0, p1}, Lg6/o0;->a(Le6/b;)V

    return-void
.end method

.method public final h()V
    .locals 3

    iget-boolean v0, p0, Lg6/o0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg6/o0;->c:Lh6/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg6/o0;->a:Lf6/a$f;

    iget-object v2, p0, Lg6/o0;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, Lf6/a$f;->getRemoteService(Lh6/k;Ljava/util/Set;)V

    :cond_0
    return-void
.end method
