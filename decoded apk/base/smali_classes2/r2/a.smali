.class public final synthetic Lr2/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/a;->h:Lio/flutter/plugin/common/EventChannel$EventSink;

    iput-object p2, p0, Lr2/a;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lr2/a;->h:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v1, p0, Lr2/a;->i:Ljava/lang/Object;

    invoke-static {v0, v1}, Lr2/e;->a(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Object;)V

    return-void
.end method
