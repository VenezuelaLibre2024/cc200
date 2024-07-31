.class public Lxc/d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxc/d;->onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxc/d;


# direct methods
.method public constructor <init>(Lxc/d;)V
    .locals 0

    iput-object p1, p0, Lxc/d$a;->a:Lxc/d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 2

    iget-object v0, p0, Lxc/d$a;->a:Lxc/d;

    invoke-static {v0}, Lxc/d;->c(Lxc/d;)Lxc/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lxc/a;->a(Landroid/net/Network;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lxc/d;->e(Lxc/d;Ljava/util/List;)V

    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    iget-object p1, p0, Lxc/d$a;->a:Lxc/d;

    invoke-static {p1}, Lxc/d;->c(Lxc/d;)Lxc/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lxc/a;->b(Landroid/net/NetworkCapabilities;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lxc/d;->e(Lxc/d;Ljava/util/List;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 0

    iget-object p1, p0, Lxc/d$a;->a:Lxc/d;

    invoke-static {p1}, Lxc/d;->d(Lxc/d;)V

    return-void
.end method
