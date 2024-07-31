.class public final Lg6/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/a$f;
.implements Landroid/content/ServiceConnection;


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/content/ComponentName;

.field public final k:Landroid/content/Context;

.field public final l:Lg6/e;

.field public final m:Landroid/os/Handler;

.field public final n:Lg6/m;

.field public o:Landroid/os/IBinder;

.field public p:Z

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lg6/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg6/l;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic b()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/l;->p:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lg6/l;->o:Landroid/os/IBinder;

    iget-object v0, p0, Lg6/l;->l:Lg6/e;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lg6/e;->c(I)V

    return-void
.end method

.method public final synthetic c(Landroid/os/IBinder;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/l;->p:Z

    iput-object p1, p0, Lg6/l;->o:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    iget-object p1, p0, Lg6/l;->l:Lg6/e;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1, v0}, Lg6/e;->g(Landroid/os/Bundle;)V

    return-void
.end method

.method public final connect(Lh6/c$c;)V
    .locals 3

    invoke-virtual {p0}, Lg6/l;->e()V

    iget-object p1, p0, Lg6/l;->o:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lg6/l;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    :try_start_0
    const-string p1, "connect() called when already connected"

    invoke-virtual {p0, p1}, Lg6/l;->disconnect(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 p1, 0x0

    :try_start_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lg6/l;->j:Landroid/content/ComponentName;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lg6/l;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lg6/l;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    iget-object v1, p0, Lg6/l;->k:Landroid/content/Context;

    invoke-static {}, Lh6/i;->b()I

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lg6/l;->p:Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v0, :cond_2

    iput-object p1, p0, Lg6/l;->o:Landroid/os/IBinder;

    iget-object p1, p0, Lg6/l;->n:Lg6/m;

    new-instance v0, Le6/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Le6/b;-><init>(I)V

    invoke-interface {p1, v0}, Lg6/m;->e(Le6/b;)V

    :cond_2
    iget-object p1, p0, Lg6/l;->o:Landroid/os/IBinder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    return-void

    :catch_1
    move-exception v0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lg6/l;->p:Z

    iput-object p1, p0, Lg6/l;->o:Landroid/os/IBinder;

    throw v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lg6/l;->r:Ljava/lang/String;

    return-void
.end method

.method public final disconnect()V
    .locals 1

    invoke-virtual {p0}, Lg6/l;->e()V

    iget-object v0, p0, Lg6/l;->o:Landroid/os/IBinder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lg6/l;->k:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/l;->p:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lg6/l;->o:Landroid/os/IBinder;

    return-void
.end method

.method public final disconnect(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lg6/l;->e()V

    iput-object p1, p0, Lg6/l;->q:Ljava/lang/String;

    invoke-virtual {p0}, Lg6/l;->disconnect()V

    return-void
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lg6/l;->m:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method should only run on the NonGmsServiceBrokerClient\'s handler thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getAvailableFeatures()[Le6/d;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Le6/d;

    return-object v0
.end method

.method public final getEndpointPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg6/l;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lg6/l;->j:Landroid/content/ComponentName;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg6/l;->j:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLastDisconnectMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg6/l;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getRemoteService(Lh6/k;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/k;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final getScopesForConnectionlessNonSignIn()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final isConnected()Z
    .locals 1

    invoke-virtual {p0}, Lg6/l;->e()V

    iget-object v0, p0, Lg6/l;->o:Landroid/os/IBinder;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isConnecting()Z
    .locals 1

    invoke-virtual {p0}, Lg6/l;->e()V

    iget-boolean v0, p0, Lg6/l;->p:Z

    return v0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    iget-object p1, p0, Lg6/l;->m:Landroid/os/Handler;

    new-instance v0, Lg6/y0;

    invoke-direct {v0, p0, p2}, Lg6/y0;-><init>(Lg6/l;Landroid/os/IBinder;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lg6/l;->m:Landroid/os/Handler;

    new-instance v0, Lg6/x0;

    invoke-direct {v0, p0}, Lg6/x0;-><init>(Lg6/l;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onUserSignOut(Lh6/c$e;)V
    .locals 0

    return-void
.end method

.method public final requiresGooglePlayServices()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final requiresSignIn()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
