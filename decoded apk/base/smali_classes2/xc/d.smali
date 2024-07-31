.class public Lxc/d;
.super Landroid/content/BroadcastReceiver;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Lxc/a;

.field public j:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final k:Landroid/os/Handler;

.field public l:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lxc/a;)V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lxc/d;->k:Landroid/os/Handler;

    iput-object p1, p0, Lxc/d;->h:Landroid/content/Context;

    iput-object p2, p0, Lxc/d;->i:Lxc/a;

    return-void
.end method

.method public static synthetic a(Lxc/d;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lxc/d;->g(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lxc/d;)V
    .locals 0

    invoke-direct {p0}, Lxc/d;->f()V

    return-void
.end method

.method public static bridge synthetic c(Lxc/d;)Lxc/a;
    .locals 0

    iget-object p0, p0, Lxc/d;->i:Lxc/a;

    return-object p0
.end method

.method public static bridge synthetic d(Lxc/d;)V
    .locals 0

    invoke-virtual {p0}, Lxc/d;->h()V

    return-void
.end method

.method public static bridge synthetic e(Lxc/d;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lxc/d;->i(Ljava/util/List;)V

    return-void
.end method

.method private synthetic f()V
    .locals 2

    iget-object v0, p0, Lxc/d;->j:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v1, p0, Lxc/d;->i:Lxc/a;

    invoke-virtual {v1}, Lxc/a;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lxc/d;->j:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 4

    new-instance v0, Lxc/b;

    invoke-direct {v0, p0}, Lxc/b;-><init>(Lxc/d;)V

    iget-object v1, p0, Lxc/d;->k:Landroid/os/Handler;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lxc/c;

    invoke-direct {v0, p0, p1}, Lxc/c;-><init>(Lxc/d;Ljava/util/List;)V

    iget-object p1, p0, Lxc/d;->k:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Lxc/d;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lxc/d;->i:Lxc/a;

    invoke-virtual {p1}, Lxc/a;->c()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object v0, p0, Lxc/d;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lxc/d;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p1, p0, Lxc/d;->h:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 1

    iput-object p2, p0, Lxc/d;->j:Lio/flutter/plugin/common/EventChannel$EventSink;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    new-instance p1, Lxc/d$a;

    invoke-direct {p1, p0}, Lxc/d$a;-><init>(Lxc/d;)V

    iput-object p1, p0, Lxc/d;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    iget-object p1, p0, Lxc/d;->i:Lxc/a;

    invoke-virtual {p1}, Lxc/a;->c()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object p2, p0, Lxc/d;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, p2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lxc/d;->h:Landroid/content/Context;

    new-instance p2, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {p2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    iget-object p1, p0, Lxc/d;->i:Lxc/a;

    invoke-virtual {p1}, Lxc/a;->d()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxc/d;->i(Ljava/util/List;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lxc/d;->j:Lio/flutter/plugin/common/EventChannel$EventSink;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lxc/d;->i:Lxc/a;

    invoke-virtual {p2}, Lxc/a;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
