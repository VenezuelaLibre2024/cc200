.class Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/LifecycleProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$2;->this$0:Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin$2;->this$0:Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;

    iget-object v0, v0, Lio/flutter/plugins/googlemaps/GoogleMapsPlugin;->lifecycle:Landroidx/lifecycle/f;

    return-object v0
.end method
