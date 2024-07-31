.class public final synthetic Lnc/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic i:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic j:Lnc/i;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lnc/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/u;->h:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lnc/u;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Lnc/u;->j:Lnc/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnc/u;->h:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lnc/u;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v2, p0, Lnc/u;->j:Lnc/i;

    invoke-static {v0, v1, v2}, Lnc/b0;->d(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lnc/i;)V

    return-void
.end method
