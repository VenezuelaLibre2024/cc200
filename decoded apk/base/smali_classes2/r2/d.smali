.class public final synthetic Lr2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/d;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p2, p0, Lr2/d;->i:Ljava/lang/String;

    iput-object p3, p0, Lr2/d;->j:Ljava/lang/String;

    iput-object p4, p0, Lr2/d;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lr2/d;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lr2/d;->i:Ljava/lang/String;

    iget-object v2, p0, Lr2/d;->j:Ljava/lang/String;

    iget-object v3, p0, Lr2/d;->k:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lr2/e;->c(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
