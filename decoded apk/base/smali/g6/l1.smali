.class public final Lg6/l1;
.super Le7/d;
.source ""

# interfaces
.implements Lf6/f$a;
.implements Lf6/f$b;


# static fields
.field public static final j:Lf6/a$a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Lf6/a$a;

.field public final f:Ljava/util/Set;

.field public final g:Lh6/e;

.field public h:Ld7/f;

.field public i:Lg6/k1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ld7/e;->c:Lf6/a$a;

    sput-object v0, Lg6/l1;->j:Lf6/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lh6/e;)V
    .locals 1

    sget-object v0, Lg6/l1;->j:Lf6/a$a;

    invoke-direct {p0}, Le7/d;-><init>()V

    iput-object p1, p0, Lg6/l1;->a:Landroid/content/Context;

    iput-object p2, p0, Lg6/l1;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh6/e;

    iput-object p1, p0, Lg6/l1;->g:Lh6/e;

    invoke-virtual {p3}, Lh6/e;->g()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lg6/l1;->f:Ljava/util/Set;

    iput-object v0, p0, Lg6/l1;->c:Lf6/a$a;

    return-void
.end method

.method public static bridge synthetic M1(Lg6/l1;)Lg6/k1;
    .locals 0

    iget-object p0, p0, Lg6/l1;->i:Lg6/k1;

    return-object p0
.end method

.method public static bridge synthetic N1(Lg6/l1;Le7/l;)V
    .locals 3

    invoke-virtual {p1}, Le7/l;->I()Le6/b;

    move-result-object v0

    invoke-virtual {v0}, Le6/b;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Le7/l;->J()Lh6/t0;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh6/t0;

    invoke-virtual {p1}, Lh6/t0;->I()Le6/b;

    move-result-object v0

    invoke-virtual {v0}, Le6/b;->M()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lg6/l1;->i:Lg6/k1;

    invoke-interface {p1, v0}, Lg6/k1;->a(Le6/b;)V

    :goto_0
    iget-object p0, p0, Lg6/l1;->h:Ld7/f;

    invoke-interface {p0}, Lf6/a$f;->disconnect()V

    return-void

    :cond_1
    iget-object v0, p0, Lg6/l1;->i:Lg6/k1;

    invoke-virtual {p1}, Lh6/t0;->J()Lh6/k;

    move-result-object p1

    iget-object v1, p0, Lg6/l1;->f:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lg6/k1;->c(Lh6/k;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final O1(Lg6/k1;)V
    .locals 9

    iget-object v0, p0, Lg6/l1;->h:Ld7/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lf6/a$f;->disconnect()V

    :cond_0
    iget-object v0, p0, Lg6/l1;->g:Lh6/e;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh6/e;->k(Ljava/lang/Integer;)V

    iget-object v2, p0, Lg6/l1;->c:Lf6/a$a;

    iget-object v3, p0, Lg6/l1;->a:Landroid/content/Context;

    iget-object v0, p0, Lg6/l1;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lg6/l1;->g:Lh6/e;

    invoke-virtual {v5}, Lh6/e;->h()Ld7/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lf6/a$a;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Ljava/lang/Object;Lf6/f$a;Lf6/f$b;)Lf6/a$f;

    move-result-object v0

    iput-object v0, p0, Lg6/l1;->h:Ld7/f;

    iput-object p1, p0, Lg6/l1;->i:Lg6/k1;

    iget-object p1, p0, Lg6/l1;->f:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lg6/l1;->h:Ld7/f;

    invoke-interface {p1}, Ld7/f;->b()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lg6/l1;->b:Landroid/os/Handler;

    new-instance v0, Lg6/i1;

    invoke-direct {v0, p0}, Lg6/i1;-><init>(Lg6/l1;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final P1()V
    .locals 1

    iget-object v0, p0, Lg6/l1;->h:Ld7/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lf6/a$f;->disconnect()V

    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 0

    iget-object p1, p0, Lg6/l1;->h:Ld7/f;

    invoke-interface {p1}, Lf6/a$f;->disconnect()V

    return-void
.end method

.method public final e(Le6/b;)V
    .locals 1

    iget-object v0, p0, Lg6/l1;->i:Lg6/k1;

    invoke-interface {v0, p1}, Lg6/k1;->a(Le6/b;)V

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lg6/l1;->h:Ld7/f;

    invoke-interface {p1, p0}, Ld7/f;->a(Le7/f;)V

    return-void
.end method

.method public final w(Le7/l;)V
    .locals 2

    iget-object v0, p0, Lg6/l1;->b:Landroid/os/Handler;

    new-instance v1, Lg6/j1;

    invoke-direct {v1, p0, p1}, Lg6/j1;-><init>(Lg6/l1;Le7/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
