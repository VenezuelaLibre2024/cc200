.class public Lr2/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lq2/s;

.field public final i:I

.field public final j:Lr2/e;

.field public final k:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lq2/s;ILr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/n;->h:Lq2/s;

    iput p2, p0, Lr2/n;->i:I

    iput-object p3, p0, Lr2/n;->j:Lr2/e;

    iput-object p4, p0, Lr2/n;->k:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lr2/n;->h:Lq2/s;

    iget v1, p0, Lr2/n;->i:I

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->D(Lq2/s;I)V

    iget-object v0, p0, Lr2/n;->j:Lr2/e;

    iget-object v1, p0, Lr2/n;->k:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method
