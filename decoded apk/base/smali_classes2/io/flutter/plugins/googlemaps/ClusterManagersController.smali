.class Lio/flutter/plugins/googlemaps/ClusterManagersController;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/c$b;
.implements Laa/c$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;,
        Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx6/c$b;",
        "Laa/c$c<",
        "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
        ">;"
    }
.end annotation


# instance fields
.field private clusterItemClickListener:Laa/c$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$f<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private clusterItemRenderedListener:Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private final clusterManagerIdToManager:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Laa/c<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;>;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private googleMap:Lx6/c;

.field private markerManager:Lda/b;

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->context:Landroid/content/Context;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method private static getClusterManagerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p0, Ljava/util/Map;

    const-string v0, "clusterManagerId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private initListenersForClusterManager(Laa/c;Laa/c$c;Laa/c$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;",
            "Laa/c$c<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;",
            "Laa/c$f<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Laa/c;->j(Laa/c$c;)V

    invoke-virtual {p1, p3}, Laa/c;->k(Laa/c$f;)V

    return-void
.end method

.method private initListenersForClusterManagers()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laa/c;

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterItemClickListener:Laa/c$f;

    invoke-direct {p0, v1, p0, v2}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->initListenersForClusterManager(Laa/c;Laa/c$c;Laa/c$f;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private removeClusterManager(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/c;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->initListenersForClusterManager(Laa/c;Laa/c$c;Laa/c$f;)V

    invoke-virtual {p1}, Laa/c;->c()V

    invoke-virtual {p1}, Laa/c;->d()V

    return-void
.end method


# virtual methods
.method public addClusterManager(Ljava/lang/Object;)V
    .locals 4

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->getClusterManagerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Laa/c;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->context:Landroid/content/Context;

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->googleMap:Lx6/c;

    iget-object v3, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->markerManager:Lda/b;

    invoke-direct {v0, v1, v2, v3}, Laa/c;-><init>(Landroid/content/Context;Lx6/c;Lda/b;)V

    new-instance v1, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->context:Landroid/content/Context;

    iget-object v3, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->googleMap:Lx6/c;

    invoke-direct {v1, v2, v3, v0, p0}, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;-><init>(Landroid/content/Context;Lx6/c;Laa/c;Lio/flutter/plugins/googlemaps/ClusterManagersController;)V

    invoke-virtual {v0, v1}, Laa/c;->l(Lca/a;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterItemClickListener:Laa/c$f;

    invoke-direct {p0, v0, p0, v1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->initListenersForClusterManager(Laa/c;Laa/c$c;Laa/c$f;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "clusterManagerId was null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addClusterManagers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->addClusterManager(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public addItem(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Laa/c;->b(Laa/b;)Z

    invoke-virtual {v0}, Laa/c;->d()V

    :cond_0
    return-void
.end method

.method public getClustersWithClusterManagerId(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa/c;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getClusters called with invalid clusterManagerId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "Invalid clusterManagerId"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Laa/c;->e()Lba/b;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->googleMap:Lx6/c;

    invoke-virtual {v1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    invoke-interface {v0, v1}, Lba/b;->b(F)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->clustersToJson(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public init(Lx6/c;Lda/b;)V
    .locals 0

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->markerManager:Lda/b;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->googleMap:Lx6/c;

    return-void
.end method

.method public onCameraIdle()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laa/c;

    invoke-virtual {v1}, Laa/c;->onCameraIdle()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onClusterClick(Laa/a;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Laa/a;->c()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-interface {p1}, Laa/a;->b()Ljava/util/Collection;

    move-result-object v0

    new-array v2, v1, [Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/googlemaps/MarkerBuilder;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlemaps/Convert;->clusterToJson(Ljava/lang/String;Laa/a;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "cluster#onTap"

    invoke-virtual {v2, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return v1
.end method

.method public onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterItemRenderedListener:Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;->onClusterItemRendered(Laa/b;Lz6/m;)V

    :cond_0
    return-void
.end method

.method public removeClusterManagers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->removeClusterManager(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeItem(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterManagerIdToManager:Ljava/util/HashMap;

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Laa/c;->i(Laa/b;)Z

    invoke-virtual {v0}, Laa/c;->d()V

    :cond_0
    return-void
.end method

.method public setClusterItemClickListener(Laa/c$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$f<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterItemClickListener:Laa/c$f;

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->initListenersForClusterManagers()V

    return-void
.end method

.method public setClusterItemRenderedListener(Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController;->clusterItemRenderedListener:Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;

    return-void
.end method
