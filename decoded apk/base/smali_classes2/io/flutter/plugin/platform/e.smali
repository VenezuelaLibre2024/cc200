.class public final synthetic Lio/flutter/plugin/platform/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugin/platform/PlatformViewsController;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/PlatformViewsController;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/e;->h:Lio/flutter/plugin/platform/PlatformViewsController;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/e;->h:Lio/flutter/plugin/platform/PlatformViewsController;

    invoke-static {v0}, Lio/flutter/plugin/platform/PlatformViewsController;->a(Lio/flutter/plugin/platform/PlatformViewsController;)V

    return-void
.end method
