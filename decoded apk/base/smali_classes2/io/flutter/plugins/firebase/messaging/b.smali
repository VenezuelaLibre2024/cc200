.class public final synthetic Lio/flutter/plugins/firebase/messaging/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;

.field public final synthetic i:Lio/flutter/embedding/engine/loader/FlutterLoader;

.field public final synthetic j:Lio/flutter/embedding/engine/FlutterShellArgs;

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;Lio/flutter/embedding/engine/loader/FlutterLoader;Lio/flutter/embedding/engine/FlutterShellArgs;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/messaging/b;->h:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;

    iput-object p2, p0, Lio/flutter/plugins/firebase/messaging/b;->i:Lio/flutter/embedding/engine/loader/FlutterLoader;

    iput-object p3, p0, Lio/flutter/plugins/firebase/messaging/b;->j:Lio/flutter/embedding/engine/FlutterShellArgs;

    iput-wide p4, p0, Lio/flutter/plugins/firebase/messaging/b;->k:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/firebase/messaging/b;->h:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;

    iget-object v1, p0, Lio/flutter/plugins/firebase/messaging/b;->i:Lio/flutter/embedding/engine/loader/FlutterLoader;

    iget-object v2, p0, Lio/flutter/plugins/firebase/messaging/b;->j:Lio/flutter/embedding/engine/FlutterShellArgs;

    iget-wide v3, p0, Lio/flutter/plugins/firebase/messaging/b;->k:J

    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;->b(Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor;Lio/flutter/embedding/engine/loader/FlutterLoader;Lio/flutter/embedding/engine/FlutterShellArgs;J)V

    return-void
.end method
