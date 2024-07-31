.class public final Lg6/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Le6/b;

.field public final synthetic i:Lg6/o0;


# direct methods
.method public constructor <init>(Lg6/o0;Le6/b;)V
    .locals 0

    iput-object p1, p0, Lg6/n0;->i:Lg6/o0;

    iput-object p2, p0, Lg6/n0;->h:Le6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lg6/n0;->i:Lg6/o0;

    iget-object v1, v0, Lg6/o0;->f:Lg6/f;

    invoke-static {v1}, Lg6/f;->E(Lg6/f;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lg6/o0;->e(Lg6/o0;)Lg6/b;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lg6/n0;->h:Le6/b;

    invoke-virtual {v1}, Le6/b;->M()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg6/n0;->i:Lg6/o0;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lg6/o0;->f(Lg6/o0;Z)V

    iget-object v1, p0, Lg6/n0;->i:Lg6/o0;

    invoke-static {v1}, Lg6/o0;->d(Lg6/o0;)Lf6/a$f;

    move-result-object v1

    invoke-interface {v1}, Lf6/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lg6/n0;->i:Lg6/o0;

    invoke-static {v0}, Lg6/o0;->g(Lg6/o0;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lg6/n0;->i:Lg6/o0;

    invoke-static {v1}, Lg6/o0;->d(Lg6/o0;)Lf6/a$f;

    move-result-object v3

    invoke-static {v1}, Lg6/o0;->d(Lg6/o0;)Lf6/a$f;

    move-result-object v1

    invoke-interface {v1}, Lf6/a$f;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v3, v2, v1}, Lf6/a$f;->getRemoteService(Lh6/k;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "GoogleApiManager"

    const-string v4, "Failed to get service from broker. "

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lg6/n0;->i:Lg6/o0;

    invoke-static {v1}, Lg6/o0;->d(Lg6/o0;)Lf6/a$f;

    move-result-object v1

    const-string v3, "Failed to get service from broker."

    invoke-interface {v1, v3}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    new-instance v1, Le6/b;

    const/16 v3, 0xa

    invoke-direct {v1, v3}, Le6/b;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v1, p0, Lg6/n0;->h:Le6/b;

    invoke-virtual {v0, v1, v2}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void
.end method
