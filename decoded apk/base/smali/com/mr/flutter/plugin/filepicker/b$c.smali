.class public Lcom/mr/flutter/plugin/filepicker/b$c;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/flutter/plugin/filepicker/b;->j(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/mr/flutter/plugin/filepicker/b;


# direct methods
.method public constructor <init>(Lcom/mr/flutter/plugin/filepicker/b;Landroid/os/Looper;Z)V
    .locals 0

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b$c;->b:Lcom/mr/flutter/plugin/filepicker/b;

    iput-boolean p3, p0, Lcom/mr/flutter/plugin/filepicker/b$c;->a:Z

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b$c;->b:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-static {p1}, Lcom/mr/flutter/plugin/filepicker/b;->h(Lcom/mr/flutter/plugin/filepicker/b;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    iget-boolean v0, p0, Lcom/mr/flutter/plugin/filepicker/b$c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method
