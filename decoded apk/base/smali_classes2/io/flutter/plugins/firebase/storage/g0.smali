.class public final synthetic Lio/flutter/plugins/firebase/storage/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp9/l;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

.field public final synthetic b:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/g0;->a:Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    iput-object p2, p0, Lio/flutter/plugins/firebase/storage/g0;->b:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/g0;->a:Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/g0;->b:Lio/flutter/plugin/common/EventChannel$EventSink;

    check-cast p1, Lp9/e0$a;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;->a(Lio/flutter/plugins/firebase/storage/TaskStateChannelStreamHandler;Lio/flutter/plugin/common/EventChannel$EventSink;Lp9/e0$a;)V

    return-void
.end method
