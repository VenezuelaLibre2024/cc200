.class public final Ldf/g$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/g;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic i:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Ldf/g$j;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Ldf/g$j;->i:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ldf/g$j;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Ldf/g$j;->i:Ljava/lang/Throwable;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "URI loading failure"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
