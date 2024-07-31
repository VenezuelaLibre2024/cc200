.class public final synthetic Lnc/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic i:Lnc/i;

.field public final synthetic j:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lnc/i;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/y;->h:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lnc/y;->i:Lnc/i;

    iput-object p3, p0, Lnc/y;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnc/y;->h:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lnc/y;->i:Lnc/i;

    iget-object v2, p0, Lnc/y;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1, v2}, Lnc/b0;->h(Lio/flutter/plugin/common/MethodCall;Lnc/i;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
