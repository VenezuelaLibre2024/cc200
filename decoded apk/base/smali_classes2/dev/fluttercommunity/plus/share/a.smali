.class public final Ldev/fluttercommunity/plus/share/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/fluttercommunity/plus/share/a$a;
    }
.end annotation


# static fields
.field public static final k:Ldev/fluttercommunity/plus/share/a$a;


# instance fields
.field public final h:Landroid/content/Context;

.field public i:Lio/flutter/plugin/common/MethodChannel$Result;

.field public j:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldev/fluttercommunity/plus/share/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldev/fluttercommunity/plus/share/a$a;-><init>(Ltd/g;)V

    sput-object v0, Ldev/fluttercommunity/plus/share/a;->k:Ldev/fluttercommunity/plus/share/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldev/fluttercommunity/plus/share/a;->h:Landroid/content/Context;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ldev/fluttercommunity/plus/share/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ldev/fluttercommunity/plus/share/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldev/fluttercommunity/plus/share/a;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ldev/fluttercommunity/plus/share/a;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    return-void
.end method

.method public final b(Lio/flutter/plugin/common/MethodChannel$Result;)Z
    .locals 4

    const-string v0, "callback"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldev/fluttercommunity/plus/share/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent;->a:Ldev/fluttercommunity/plus/share/SharePlusPendingIntent$a;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent$a;->b(Ljava/lang/String;)V

    iget-object v0, p0, Ldev/fluttercommunity/plus/share/a;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iput-object p1, p0, Ldev/fluttercommunity/plus/share/a;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Share callback error"

    const-string v3, "prior share-sheet did not call back, did you await it? Maybe use non-result variant"

    invoke-interface {p1, v1, v3, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    move v1, v2

    :goto_0
    return v1
.end method

.method public final c()V
    .locals 1

    const-string v0, "dev.fluttercommunity.plus/share/unavailable"

    invoke-virtual {p0, v0}, Ldev/fluttercommunity/plus/share/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 0

    const/16 p2, 0x5873

    if-ne p1, p2, :cond_0

    sget-object p1, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent;->a:Ldev/fluttercommunity/plus/share/SharePlusPendingIntent$a;

    invoke-virtual {p1}, Ldev/fluttercommunity/plus/share/SharePlusPendingIntent$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldev/fluttercommunity/plus/share/a;->a(Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
