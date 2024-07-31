.class public final synthetic Lu2/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw2/w;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/m;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public final a(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Lu2/m;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-static {v0, p1}, Lu2/n;->b(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V

    return-void
.end method
