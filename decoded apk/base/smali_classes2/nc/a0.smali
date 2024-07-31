.class public final synthetic Lnc/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic k:Ljava/lang/Boolean;

.field public final synthetic l:Lnc/i;

.field public final synthetic m:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic n:Z

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Boolean;Lnc/i;Lio/flutter/plugin/common/MethodCall;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lnc/a0;->h:Z

    iput-object p2, p0, Lnc/a0;->i:Ljava/lang/String;

    iput-object p3, p0, Lnc/a0;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p4, p0, Lnc/a0;->k:Ljava/lang/Boolean;

    iput-object p5, p0, Lnc/a0;->l:Lnc/i;

    iput-object p6, p0, Lnc/a0;->m:Lio/flutter/plugin/common/MethodCall;

    iput-boolean p7, p0, Lnc/a0;->n:Z

    iput p8, p0, Lnc/a0;->o:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-boolean v0, p0, Lnc/a0;->h:Z

    iget-object v1, p0, Lnc/a0;->i:Ljava/lang/String;

    iget-object v2, p0, Lnc/a0;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v3, p0, Lnc/a0;->k:Ljava/lang/Boolean;

    iget-object v4, p0, Lnc/a0;->l:Lnc/i;

    iget-object v5, p0, Lnc/a0;->m:Lio/flutter/plugin/common/MethodCall;

    iget-boolean v6, p0, Lnc/a0;->n:Z

    iget v7, p0, Lnc/a0;->o:I

    invoke-static/range {v0 .. v7}, Lnc/b0;->a(ZLjava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Boolean;Lnc/i;Lio/flutter/plugin/common/MethodCall;ZI)V

    return-void
.end method
