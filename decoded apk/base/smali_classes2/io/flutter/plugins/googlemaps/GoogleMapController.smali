.class Lio/flutter/plugins/googlemaps/GoogleMapController;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding$OnSaveInstanceStateListener;
.implements Lio/flutter/plugins/googlemaps/GoogleMapOptionsSink;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lx6/f;
.implements Lio/flutter/plugins/googlemaps/GoogleMapListener;
.implements Laa/c$f;
.implements Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;
.implements Lio/flutter/plugin/platform/PlatformView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding$OnSaveInstanceStateListener;",
        "Lio/flutter/plugins/googlemaps/GoogleMapOptionsSink;",
        "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;",
        "Lx6/f;",
        "Lio/flutter/plugins/googlemaps/GoogleMapListener;",
        "Laa/c$f<",
        "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
        ">;",
        "Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered<",
        "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
        ">;",
        "Lio/flutter/plugin/platform/PlatformView;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GoogleMapController"


# instance fields
.field private buildingsEnabled:Z

.field private final circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

.field private final clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

.field private final context:Landroid/content/Context;

.field public final density:F

.field private disposed:Z

.field private googleMap:Lx6/c;

.field private final id:I

.field private indoorEnabled:Z

.field private initialCircles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private initialClusterManagers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private initialMapStyle:Ljava/lang/String;

.field private initialMarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public initialPadding:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private initialPolygons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private initialPolylines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private initialTileOverlays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field

.field private lastStyleError:Ljava/lang/String;

.field private final lifecycleProvider:Lio/flutter/plugins/googlemaps/LifecycleProvider;

.field private mapReadyResult:Lio/flutter/plugin/common/MethodChannel$Result;

.field private mapView:Lx6/d;

.field private markerCollection:Lda/b$a;

.field private markerManager:Lda/b;

.field private final markersController:Lio/flutter/plugins/googlemaps/MarkersController;

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;

.field private myLocationButtonEnabled:Z

.field private myLocationEnabled:Z

.field private final options:Lcom/google/android/gms/maps/GoogleMapOptions;

.field private final polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

.field private final polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

.field private final tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

.field private trackCameraPosition:Z

.field private trafficEnabled:Z

.field private zoomControlsEnabled:Z


# direct methods
.method public constructor <init>(ILandroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/googlemaps/LifecycleProvider;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trackCameraPosition:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationButtonEnabled:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->zoomControlsEnabled:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->indoorEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trafficEnabled:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->buildingsEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    iput p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->id:I

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->context:Landroid/content/Context;

    iput-object p5, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->options:Lcom/google/android/gms/maps/GoogleMapOptions;

    new-instance v0, Lx6/d;

    invoke-direct {v0, p2, p5}, Lx6/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p5

    iget p5, p5, Landroid/util/DisplayMetrics;->density:F

    iput p5, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->density:F

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "plugins.flutter.dev/google_maps_android_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p3, p1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object p4, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lifecycleProvider:Lio/flutter/plugins/googlemaps/LifecycleProvider;

    new-instance p1, Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-direct {p1, v0, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController;-><init>(Lio/flutter/plugin/common/MethodChannel;Landroid/content/Context;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    new-instance p2, Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-direct {p2, v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;-><init>(Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugins/googlemaps/ClusterManagersController;)V

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    new-instance p1, Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-direct {p1, v0, p5}, Lio/flutter/plugins/googlemaps/PolygonsController;-><init>(Lio/flutter/plugin/common/MethodChannel;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    new-instance p1, Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-direct {p1, v0, p5}, Lio/flutter/plugins/googlemaps/PolylinesController;-><init>(Lio/flutter/plugin/common/MethodChannel;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    new-instance p1, Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-direct {p1, v0, p5}, Lio/flutter/plugins/googlemaps/CirclesController;-><init>(Lio/flutter/plugin/common/MethodChannel;F)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    new-instance p1, Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-direct {p1, v0}, Lio/flutter/plugins/googlemaps/TileOverlaysController;-><init>(Lio/flutter/plugin/common/MethodChannel;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    return-void
.end method

.method public constructor <init>(ILandroid/content/Context;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugins/googlemaps/LifecycleProvider;Lcom/google/android/gms/maps/GoogleMapOptions;Lio/flutter/plugins/googlemaps/ClusterManagersController;Lio/flutter/plugins/googlemaps/MarkersController;Lio/flutter/plugins/googlemaps/PolygonsController;Lio/flutter/plugins/googlemaps/PolylinesController;Lio/flutter/plugins/googlemaps/CirclesController;Lio/flutter/plugins/googlemaps/TileOverlaysController;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trackCameraPosition:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationButtonEnabled:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->zoomControlsEnabled:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->indoorEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trafficEnabled:Z

    iput-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->buildingsEnabled:Z

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    iput p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->id:I

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->context:Landroid/content/Context;

    iput-object p3, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    iput-object p5, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->options:Lcom/google/android/gms/maps/GoogleMapOptions;

    new-instance p1, Lx6/d;

    invoke-direct {p1, p2, p5}, Lx6/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iput p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->density:F

    iput-object p4, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lifecycleProvider:Lio/flutter/plugins/googlemaps/LifecycleProvider;

    iput-object p6, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    iput-object p7, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    iput-object p8, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    iput-object p9, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    iput-object p10, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    iput-object p11, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    return-void
.end method

.method private animateCamera(Lx6/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->f(Lx6/a;)V

    return-void
.end method

.method private checkSelfPermission(Ljava/lang/String;)I
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->context:Landroid/content/Context;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "permission is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private destroyMapViewIfNecessary()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lx6/d;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    return-void
.end method

.method private static findTextureView(Landroid/view/ViewGroup;)Landroid/view/TextureView;
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/TextureView;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/TextureView;

    return-object v2

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lio/flutter/plugins/googlemaps/GoogleMapController;->findTextureView(Landroid/view/ViewGroup;)Landroid/view/TextureView;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trackCameraPosition:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private hasLocationPermission()Z
    .locals 1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private installInvalidator()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->findTextureView(Landroid/view/ViewGroup;)Landroid/view/TextureView;

    move-result-object v0

    const-string v1, "GoogleMapController"

    if-nez v0, :cond_1

    const-string v0, "No TextureView found. Likely using the LEGACY renderer."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v2, "Installing custom TextureView driven invalidator."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    new-instance v3, Lio/flutter/plugins/googlemaps/GoogleMapController$1;

    invoke-direct {v3, p0, v1, v2}, Lio/flutter/plugins/googlemaps/GoogleMapController$1;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;Landroid/view/TextureView$SurfaceTextureListener;Lx6/d;)V

    invoke-virtual {v0, v3}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method private moveCamera(Lx6/a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->n(Lx6/a;)V

    return-void
.end method

.method private setGoogleMapListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    const-string p1, "GoogleMapController"

    const-string v0, "Controller was disposed before GoogleMap was ready."

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lx6/c;->A(Lx6/c$d;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->z(Lx6/c$c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->y(Lx6/c$b;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->I(Lx6/c$l;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->J(Lx6/c$m;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->B(Lx6/c$e;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->E(Lx6/c$h;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->F(Lx6/c$i;)V

    return-void
.end method

.method private updateInitialCircles()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialCircles:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/CirclesController;->addCircles(Ljava/util/List;)V

    return-void
.end method

.method private updateInitialClusterManagers()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialClusterManagers:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->addClusterManagers(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private updateInitialMarkers()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialMarkers:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarkers(Ljava/util/List;)V

    return-void
.end method

.method private updateInitialPolygons()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPolygons:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/PolygonsController;->addPolygons(Ljava/util/List;)V

    return-void
.end method

.method private updateInitialPolylines()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPolylines:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/PolylinesController;->addPolylines(Ljava/util/List;)V

    return-void
.end method

.method private updateInitialTileOverlays()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialTileOverlays:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->addTileOverlays(Ljava/util/List;)V

    return-void
.end method

.method private updateMapStyle(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lz6/l;

    invoke-direct {v1, p1}, Lz6/l;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    :goto_1
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lx6/c;->t(Lz6/l;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, "Unable to set the map style. Please check console logs for errors."

    :goto_2
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lastStyleError:Ljava/lang/String;

    return p1
.end method

.method private updateMyLocationSettings()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->hasLocationPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationEnabled:Z

    invoke-virtual {v0, v1}, Lx6/c;->x(Z)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationButtonEnabled:Z

    invoke-virtual {v0, v1}, Lx6/i;->k(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "GoogleMapController"

    const-string v1, "Cannot enable MyLocation layer as location permissions are not granted"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    invoke-direct {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setGoogleMapListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V

    invoke-virtual {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setMarkerCollectionListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V

    invoke-virtual {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setClusterItemClickListener(Laa/c$f;)V

    invoke-virtual {p0, v1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setClusterItemRenderedListener(Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->destroyMapViewIfNecessary()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lifecycleProvider:Lio/flutter/plugins/googlemaps/LifecycleProvider;

    invoke-interface {v0}, Lio/flutter/plugins/googlemaps/LifecycleProvider;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/j;)V

    :cond_1
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    return-object v0
.end method

.method public init()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lifecycleProvider:Lio/flutter/plugins/googlemaps/LifecycleProvider;

    invoke-interface {v0}, Lio/flutter/plugins/googlemaps/LifecycleProvider;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/j;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {v0, p0}, Lx6/d;->a(Lx6/f;)V

    return-void
.end method

.method public onCameraIdle()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->onCameraIdle()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    iget v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "map"

    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "camera#onIdle"

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onCameraMove()V
    .locals 3

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trackCameraPosition:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/plugins/googlemaps/Convert;->cameraPositionToJson(Lcom/google/android/gms/maps/model/CameraPosition;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "position"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "camera#onMove"

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onCameraMoveStarted(I)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "isGesture"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "camera#onMoveStarted"

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onCircleClick(Lz6/f;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-virtual {p1}, Lz6/f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/CirclesController;->onCircleTap(Ljava/lang/String;)Z

    return-void
.end method

.method public bridge synthetic onClusterItemClick(Laa/b;)Z
    .locals 0

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->onClusterItemClick(Lio/flutter/plugins/googlemaps/MarkerBuilder;)Z

    move-result p1

    return p1
.end method

.method public onClusterItemClick(Lio/flutter/plugins/googlemaps/MarkerBuilder;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMarkerTap(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onClusterItemRendered(Laa/b;Lz6/m;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/googlemaps/GoogleMapController;->onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V

    return-void
.end method

.method public onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/MarkersController;->onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/k;)V
    .locals 1

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lx6/d;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/k;)V
    .locals 0

    invoke-interface {p1}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/j;)V

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->destroyMapViewIfNecessary()V

    return-void
.end method

.method public onInfoWindowClick(Lz6/m;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onInfoWindowTap(Ljava/lang/String;)V

    return-void
.end method

.method public onMapClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "position"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "map#onTap"

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "position"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "map#onLongPress"

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMapReady(Lx6/c;)V
    .locals 5

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->indoorEnabled:Z

    invoke-virtual {p1, v0}, Lx6/c;->q(Z)Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trafficEnabled:Z

    invoke-virtual {v0, v1}, Lx6/c;->L(Z)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    iget-boolean v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->buildingsEnabled:Z

    invoke-virtual {v0, v1}, Lx6/c;->p(Z)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->installInvalidator()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapReadyResult:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iput-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapReadyResult:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    invoke-direct {p0, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setGoogleMapListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V

    new-instance v0, Lda/b;

    invoke-direct {v0, p1}, Lda/b;-><init>(Lx6/c;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerManager:Lda/b;

    invoke-virtual {v0}, Lda/b;->g()Lda/b$a;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerCollection:Lda/b$a;

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMyLocationSettings()V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerCollection:Lda/b$a;

    invoke-virtual {v0, v2}, Lio/flutter/plugins/googlemaps/MarkersController;->setCollection(Lda/b$a;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerManager:Lda/b;

    invoke-virtual {v0, p1, v2}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->init(Lx6/c;Lda/b;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolygonsController;->setGoogleMap(Lx6/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolylinesController;->setGoogleMap(Lx6/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/CirclesController;->setGoogleMap(Lx6/c;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->setGoogleMap(Lx6/c;)V

    invoke-virtual {p0, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setMarkerCollectionListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V

    invoke-virtual {p0, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setClusterItemClickListener(Laa/c$f;)V

    invoke-virtual {p0, p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setClusterItemRenderedListener(Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialClusterManagers()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialMarkers()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialPolygons()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialPolylines()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialCircles()V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialTileOverlays()V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    const/4 v3, 0x2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    iget-object v3, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    const/4 v4, 0x3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {p0, p1, v0, v2, v3}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setPadding(FFFF)V

    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialMapStyle:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMapStyle(Ljava/lang/String;)Z

    iput-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialMapStyle:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public onMarkerClick(Lz6/m;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMapsMarkerTap(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public onMarkerDrag(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lz6/m;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMarkerDrag(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public onMarkerDragEnd(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lz6/m;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMarkerDragEnd(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public onMarkerDragStart(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lz6/m;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMarkerDragStart(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 7

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "camera#move"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x22

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "markers#showInfoWindow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x21

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "map#isLiteModeEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x20

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "circles#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x1f

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "tileOverlays#clearTileCache"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x1e

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "tileOverlays#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x1d

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "map#isTrafficEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x1c

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "markers#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x1b

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "map#isZoomControlsEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "map#isCompassEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "map#isBuildingsEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "map#setStyle"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "polylines#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "map#getLatLng"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "map#takeSnapshot"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "map#isMapToolbarEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "map#waitForMap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_11
    const-string v1, "map#isZoomGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_12
    const-string v1, "map#getMinMaxZoomLevels"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "map#getStyleError"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_14
    const-string v1, "clusterManagers#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_15
    const-string v1, "map#getZoomLevel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "markers#hideInfoWindow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "map#isMyLocationButtonEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_18
    const-string v1, "map#isTiltGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "clusterManager#getClusters"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "polygons#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1b
    const-string v1, "map#getTileOverlayInfo"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1c
    const-string v1, "markers#isInfoWindowShown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1d
    const-string v1, "camera#animate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_1e
    const-string v1, "map#getScreenCoordinate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1f
    const-string v1, "map#update"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_20
    const-string v1, "map#isRotateGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    move v3, v2

    goto :goto_0

    :sswitch_21
    const-string v1, "map#isScrollGesturesEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_22
    const-string v1, "map#getVisibleRegion"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    const/4 v3, 0x0

    :goto_0
    const-string v0, "tileOverlayId"

    const-string v1, "cameraUpdate"

    const-string v4, "markerId"

    const-string v5, "GoogleMap uninitialized"

    const/4 v6, 0x0

    packed-switch v3, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_5

    :pswitch_0
    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->density:F

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->toCameraUpdate(Ljava/lang/Object;F)Lx6/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->moveCamera(Lx6/a;)V

    :cond_23
    :goto_1
    invoke-interface {p2, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/MarkersController;->showMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->options:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->N()Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_3
    const-string v0, "circlesToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/CirclesController;->addCircles(Ljava/util/List;)V

    const-string v0, "circlesToChange"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/CirclesController;->changeCircles(Ljava/util/List;)V

    const-string v0, "circleIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->circlesController:Lio/flutter/plugins/googlemaps/CirclesController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/CirclesController;->removeCircles(Ljava/util/List;)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->clearTileCache(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    const-string v0, "tileOverlaysToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->addTileOverlays(Ljava/util/List;)V

    const-string v0, "tileOverlaysToChange"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->changeTileOverlays(Ljava/util/List;)V

    const-string v0, "tileOverlayIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->removeTileOverlays(Ljava/util/List;)V

    goto :goto_1

    :pswitch_6
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->m()Z

    move-result p1

    goto :goto_2

    :pswitch_7
    const-string v0, "markersToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarkers(Ljava/util/List;)V

    const-string v0, "markersToChange"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->changeMarkers(Ljava/util/List;)V

    const-string v0, "markerIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->removeMarkers(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_8
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->g()Z

    move-result p1

    goto :goto_2

    :pswitch_9
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->a()Z

    move-result p1

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_a
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->l()Z

    move-result p1

    goto :goto_2

    :pswitch_b
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_24

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    :cond_24
    invoke-direct {p0, v6}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMapStyle(Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_25

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lastStyleError:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_25
    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_c
    const-string v0, "polylinesToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/PolylinesController;->addPolylines(Ljava/util/List;)V

    const-string v0, "polylinesToChange"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/PolylinesController;->changePolylines(Ljava/util/List;)V

    const-string v0, "polylineIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolylinesController;->removePolylines(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_d
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz v0, :cond_26

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->toPoint(Ljava/lang/Object;)Landroid/graphics/Point;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->j()Lx6/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_26
    const-string p1, "getLatLng called prior to map initialization"

    goto/16 :goto_4

    :pswitch_e
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_27

    new-instance v0, Lio/flutter/plugins/googlemaps/GoogleMapController$2;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/googlemaps/GoogleMapController$2;-><init>(Lio/flutter/plugins/googlemaps/GoogleMapController;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p1, v0}, Lx6/c;->M(Lx6/c$n;)V

    goto/16 :goto_5

    :cond_27
    const-string p1, "takeSnapshot"

    goto/16 :goto_4

    :pswitch_f
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->b()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_10
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_28

    invoke-interface {p2, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_28
    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapReadyResult:Lio/flutter/plugin/common/MethodChannel$Result;

    goto/16 :goto_5

    :pswitch_11
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->h()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :pswitch_13
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->lastStyleError:Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_14
    const-string v0, "clusterManagersToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_29

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->addClusterManagers(Ljava/util/List;)V

    :cond_29
    const-string v0, "clusterManagerIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_23

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->removeClusterManagers(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_15
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/MarkersController;->hideMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_5

    :pswitch_17
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->c()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_18
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->f()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_19
    const-string v0, "clusterManagerId"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->getClustersWithClusterManagerId(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_5

    :pswitch_1a
    const-string v0, "polygonsToAdd"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/PolygonsController;->addPolygons(Ljava/util/List;)V

    const-string v0, "polygonsToChange"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/PolygonsController;->changePolygons(Ljava/util/List;)V

    const-string v0, "polygonIdsToRemove"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolygonsController;->removePolygons(Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_1b
    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->tileOverlaysController:Lio/flutter/plugins/googlemaps/TileOverlaysController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/TileOverlaysController;->getTileOverlayInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :pswitch_1c
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markersController:Lio/flutter/plugins/googlemaps/MarkersController;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugins/googlemaps/MarkersController;->isInfoWindowShown(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_5

    :pswitch_1d
    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    iget v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->density:F

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->toCameraUpdate(Ljava/lang/Object;F)Lx6/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->animateCamera(Lx6/a;)V

    goto/16 :goto_1

    :pswitch_1e
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz v0, :cond_2a

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->toLatLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->j()Lx6/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/h;->c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->pointToJson(Landroid/graphics/Point;)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :cond_2a
    const-string p1, "getScreenCoordinate called prior to map initialization"

    goto :goto_4

    :pswitch_1f
    const-string v0, "options"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p0}, Lio/flutter/plugins/googlemaps/Convert;->interpretGoogleMapOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/GoogleMapOptionsSink;)V

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object p1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->cameraPositionToJson(Lcom/google/android/gms/maps/model/CameraPosition;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_20
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->d()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_21
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Lx6/c;->k()Lx6/i;

    move-result-object p1

    invoke-virtual {p1}, Lx6/i;->e()Z

    move-result p1

    goto/16 :goto_2

    :pswitch_22
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_2b

    invoke-virtual {p1}, Lx6/c;->j()Lx6/h;

    move-result-object p1

    invoke-virtual {p1}, Lx6/h;->b()Lz6/e0;

    move-result-object p1

    iget-object p1, p1, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->latLngBoundsToJson(Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_2b
    const-string p1, "getVisibleRegion called prior to map initialization"

    :goto_4
    invoke-interface {p2, v5, p1, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_5
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7b4b4569 -> :sswitch_22
        -0x68801827 -> :sswitch_21
        -0x63d6bc75 -> :sswitch_20
        -0x52ced230 -> :sswitch_1f
        -0x51736f2d -> :sswitch_1e
        -0x4b5fdc7d -> :sswitch_1d
        -0x4ace63a1 -> :sswitch_1c
        -0x4ab89a1f -> :sswitch_1b
        -0x41b409ed -> :sswitch_1a
        -0x291e9501 -> :sswitch_19
        -0x238d7a57 -> :sswitch_18
        -0x22657943 -> :sswitch_17
        -0x1e4cec96 -> :sswitch_16
        -0x1aefc77e -> :sswitch_15
        -0xb6f3fd4 -> :sswitch_14
        -0x8eaf81a -> :sswitch_13
        0xf9f8443 -> :sswitch_12
        0x10dca5d3 -> :sswitch_11
        0x11956b2f -> :sswitch_10
        0x174d4211 -> :sswitch_f
        0x19decb32 -> :sswitch_e
        0x25216d95 -> :sswitch_d
        0x26623c99 -> :sswitch_c
        0x2a7eadb6 -> :sswitch_b
        0x39fcc9d3 -> :sswitch_a
        0x41768de0 -> :sswitch_9
        0x45de59e7 -> :sswitch_8
        0x4edb3513 -> :sswitch_7
        0x5c275a95 -> :sswitch_6
        0x5d47629b -> :sswitch_5
        0x65d75179 -> :sswitch_4
        0x6fac67a9 -> :sswitch_3
        0x722e9c9f -> :sswitch_2
        0x746e6365 -> :sswitch_1
        0x776bde6f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPause(Landroidx/lifecycle/k;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p1}, Lx6/d;->d()V

    return-void
.end method

.method public onPolygonClick(Lz6/q;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polygonsController:Lio/flutter/plugins/googlemaps/PolygonsController;

    invoke-virtual {p1}, Lz6/q;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolygonsController;->onPolygonTap(Ljava/lang/String;)Z

    return-void
.end method

.method public onPolylineClick(Lz6/s;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->polylinesController:Lio/flutter/plugins/googlemaps/PolylinesController;

    invoke-virtual {p1}, Lz6/s;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/PolylinesController;->onPolylineTap(Ljava/lang/String;)Z

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {v0, p1}, Lx6/d;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public onResume(Landroidx/lifecycle/k;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p1}, Lx6/d;->d()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {v0, p1}, Lx6/d;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/k;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p1}, Lx6/d;->f()V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/k;)V
    .locals 0

    iget-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->disposed:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    invoke-virtual {p1}, Lx6/d;->g()V

    return-void
.end method

.method public setBuildingsEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->buildingsEnabled:Z

    return-void
.end method

.method public setCameraTargetBounds(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->s(Lcom/google/android/gms/maps/model/LatLngBounds;)V

    return-void
.end method

.method public setClusterItemClickListener(Laa/c$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$f<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    const-string p1, "GoogleMapController"

    const-string v0, "Controller was disposed before GoogleMap was ready."

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->setClusterItemClickListener(Laa/c$f;)V

    return-void
.end method

.method public setClusterItemRenderedListener(Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered<",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    const-string p1, "GoogleMapController"

    const-string v0, "Controller was disposed before GoogleMap was ready."

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->setClusterItemRenderedListener(Lio/flutter/plugins/googlemaps/ClusterManagersController$OnClusterItemRendered;)V

    return-void
.end method

.method public setCompassEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->i(Z)V

    return-void
.end method

.method public setIndoorEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->indoorEnabled:Z

    return-void
.end method

.method public setInitialCircles(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialCircles:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialCircles()V

    :cond_1
    return-void
.end method

.method public setInitialClusterManagers(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialClusterManagers:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialClusterManagers()V

    :cond_1
    return-void
.end method

.method public setInitialMarkers(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialMarkers:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialMarkers()V

    :cond_1
    return-void
.end method

.method public setInitialPadding(FFFF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPadding:Ljava/util/List;

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setInitialPolygons(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPolygons:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialPolygons()V

    :cond_1
    return-void
.end method

.method public setInitialPolylines(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialPolylines:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialPolylines()V

    :cond_1
    return-void
.end method

.method public setInitialTileOverlays(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialTileOverlays:Ljava/util/List;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateInitialTileOverlays()V

    :cond_0
    return-void
.end method

.method public setLiteModeEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->options:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMapOptions;->T(Z)Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method

.method public setMapStyle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->initialMapStyle:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMapStyle(Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method public setMapToolbarEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->j(Z)V

    return-void
.end method

.method public setMapType(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->u(I)V

    return-void
.end method

.method public setMarkerCollectionListener(Lio/flutter/plugins/googlemaps/GoogleMapListener;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    const-string p1, "GoogleMapController"

    const-string v0, "Controller was disposed before GoogleMap was ready."

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerCollection:Lda/b$a;

    invoke-virtual {v0, p1}, Lda/b$a;->m(Lx6/c$j;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerCollection:Lda/b$a;

    invoke-virtual {v0, p1}, Lda/b$a;->n(Lx6/c$k;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->markerCollection:Lda/b$a;

    invoke-virtual {v0, p1}, Lda/b$a;->k(Lx6/c$f;)V

    return-void
.end method

.method public setMinMaxZoomPreference(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->o()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lx6/c;->w(F)V

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Lx6/c;->v(F)V

    :cond_1
    return-void
.end method

.method public setMyLocationButtonEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationButtonEnabled:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationButtonEnabled:Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMyLocationSettings()V

    :cond_1
    return-void
.end method

.method public setMyLocationEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationEnabled:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->myLocationEnabled:Z

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/GoogleMapController;->updateMyLocationSettings()V

    :cond_1
    return-void
.end method

.method public setPadding(FFFF)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz v0, :cond_0

    iget v1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->density:F

    mul-float/2addr p2, v1

    float-to-int p2, p2

    mul-float/2addr p1, v1

    float-to-int p1, p1

    mul-float/2addr p4, v1

    float-to-int p4, p4

    mul-float/2addr p3, v1

    float-to-int p3, p3

    invoke-virtual {v0, p2, p1, p4, p3}, Lx6/c;->K(IIII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/googlemaps/GoogleMapController;->setInitialPadding(FFFF)V

    :goto_0
    return-void
.end method

.method public setRotateGesturesEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->l(Z)V

    return-void
.end method

.method public setScrollGesturesEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->m(Z)V

    return-void
.end method

.method public setTiltGesturesEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->n(Z)V

    return-void
.end method

.method public setTrackCameraPosition(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trackCameraPosition:Z

    return-void
.end method

.method public setTrafficEnabled(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->trafficEnabled:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lx6/c;->L(Z)V

    return-void
.end method

.method public setView(Lx6/d;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->mapView:Lx6/d;

    return-void
.end method

.method public setZoomControlsEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->zoomControlsEnabled:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->zoomControlsEnabled:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->o(Z)V

    :cond_1
    return-void
.end method

.method public setZoomGesturesEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapController;->googleMap:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->k()Lx6/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/i;->p(Z)V

    return-void
.end method
