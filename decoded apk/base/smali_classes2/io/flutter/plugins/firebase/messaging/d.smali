.class public final synthetic Lio/flutter/plugins/firebase/messaging/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/d;->a:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/d;->a:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;

    check-cast p1, Lcom/google/firebase/messaging/d;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;->n(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin;Lcom/google/firebase/messaging/d;)V

    return-void
.end method
