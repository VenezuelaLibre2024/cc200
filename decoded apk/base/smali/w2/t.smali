.class public Lw2/t;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final a:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public b:Lw2/x;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Lw2/t;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "location"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    const-string p2, "gps"

    invoke-virtual {p1, p2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p2

    const-string v0, "network"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p2, :cond_2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw2/t;->b:Lw2/x;

    if-eqz p1, :cond_1

    sget-object p2, Lw2/x;->i:Lw2/x;

    if-ne p1, p2, :cond_4

    :cond_1
    sget-object p1, Lw2/x;->h:Lw2/x;

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Lw2/t;->b:Lw2/x;

    if-eqz p1, :cond_3

    sget-object p2, Lw2/x;->h:Lw2/x;

    if-ne p1, p2, :cond_4

    :cond_3
    sget-object p1, Lw2/x;->i:Lw2/x;

    :goto_1
    iput-object p1, p0, Lw2/t;->b:Lw2/x;

    iget-object p2, p0, Lw2/t;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
