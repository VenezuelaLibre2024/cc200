.class public final Ldf/g$h;
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
.field public final synthetic h:Ldf/g;

.field public final synthetic i:I

.field public final synthetic j:D

.field public final synthetic k:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ldf/g;IDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ldf/g$h;->h:Ldf/g;

    iput p2, p0, Ldf/g$h;->i:I

    iput-wide p3, p0, Ldf/g$h;->j:D

    iput-object p5, p0, Ldf/g$h;->k:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ldf/g$h;->h:Ldf/g;

    invoke-static {v0}, Ldf/g;->d(Ldf/g;)Landroid/media/SoundPool;

    move-result-object v0

    iget v1, p0, Ldf/g$h;->i:I

    iget-wide v2, p0, Ldf/g$h;->j:D

    double-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/media/SoundPool;->setRate(IF)V

    invoke-static {}, Ldf/c;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ldf/g$p;

    iget-object v2, p0, Ldf/g$h;->k:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {v1, v2}, Ldf/g$p;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
