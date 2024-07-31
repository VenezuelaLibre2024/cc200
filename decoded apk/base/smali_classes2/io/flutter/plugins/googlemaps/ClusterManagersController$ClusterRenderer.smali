.class Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;
.super Lca/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemaps/ClusterManagersController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClusterRenderer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
        ">",
        "Lca/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx6/c;Laa/c;Lio/flutter/plugins/googlemaps/ClusterManagersController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lx6/c;",
            "Laa/c<",
            "TT;>;",
            "Lio/flutter/plugins/googlemaps/ClusterManagersController;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lca/f;-><init>(Landroid/content/Context;Lx6/c;Laa/c;)V

    iput-object p4, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    return-void
.end method


# virtual methods
.method public bridge synthetic onBeforeClusterItemRendered(Laa/b;Lz6/n;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;->onBeforeClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/n;)V

    return-void
.end method

.method public onBeforeClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz6/n;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->update(Lz6/n;)V

    return-void
.end method

.method public bridge synthetic onClusterItemRendered(Laa/b;Lz6/m;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;->onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V

    return-void
.end method

.method public onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz6/m;",
            ")V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lca/f;->onClusterItemRendered(Laa/b;Lz6/m;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/ClusterManagersController$ClusterRenderer;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V

    return-void
.end method
