.class public final Ldf/g$l;
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

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;I)V
    .locals 0

    iput-object p1, p0, Ldf/g$l;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iput p2, p0, Ldf/g$l;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldf/g$l;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iget v1, p0, Ldf/g$l;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
