.class public final synthetic Lnc/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lnc/i;

.field public final synthetic i:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic j:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lnc/i;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/z;->h:Lnc/i;

    iput-object p2, p0, Lnc/z;->i:Lio/flutter/plugin/common/MethodCall;

    iput-object p3, p0, Lnc/z;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnc/z;->h:Lnc/i;

    iget-object v1, p0, Lnc/z;->i:Lio/flutter/plugin/common/MethodCall;

    iget-object v2, p0, Lnc/z;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1, v2}, Lnc/b0;->c(Lnc/i;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
