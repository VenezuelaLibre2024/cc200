.class public Lr2/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lq2/h;

.field public final i:Lr2/e;

.field public final j:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lq2/h;Lr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/l;->h:Lq2/h;

    iput-object p2, p0, Lr2/l;->i:Lr2/e;

    iput-object p3, p0, Lr2/l;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lr2/l;->h:Lq2/h;

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->r(Lq2/h;)V

    iget-object v0, p0, Lr2/l;->i:Lr2/e;

    iget-object v1, p0, Lr2/l;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method
