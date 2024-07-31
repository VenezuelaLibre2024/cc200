.class public final Lc3/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lub/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc3/c;->onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel;

.field public final synthetic b:Lc3/c;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Lc3/c;Landroid/content/Context;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc3/c$b;->a:Lio/flutter/plugin/common/MethodChannel;

    iput-object p2, p0, Lc3/c$b;->b:Lc3/c;

    iput-object p3, p0, Lc3/c$b;->c:Landroid/content/Context;

    iput-object p4, p0, Lc3/c$b;->d:Ljava/lang/String;

    iput-object p5, p0, Lc3/c$b;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-boolean p6, p0, Lc3/c$b;->f:Z

    iput-object p7, p0, Lc3/c$b;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object p1, p0, Lc3/c$b;->a:Lio/flutter/plugin/common/MethodChannel;

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "updateProgress"

    invoke-virtual {p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Lc3/b;

    iget-object v0, p0, Lc3/c$b;->b:Lc3/c;

    invoke-virtual {v0}, Lc3/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lc3/b;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lc3/c$b;->c:Landroid/content/Context;

    iget-object v1, p0, Lc3/c$b;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lc3/b;->d(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "isCancel"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object v0, p0, Lc3/c$b;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lc3/c$b;->f:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lc3/c$b;->g:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public b(D)V
    .locals 3

    iget-object v0, p0, Lc3/c$b;->a:Lio/flutter/plugin/common/MethodChannel;

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    mul-double/2addr p1, v1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "updateProgress"

    invoke-virtual {v0, p2, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lc3/c$b;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lc3/c$b;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
