.class public final Ldf/g$c;
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

.field public final synthetic j:Ldf/h;

.field public final synthetic k:I

.field public final synthetic l:D

.field public final synthetic m:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ldf/g;ILdf/h;IDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ldf/g$c;->h:Ldf/g;

    iput p2, p0, Ldf/g$c;->i:I

    iput-object p3, p0, Ldf/g$c;->j:Ldf/h;

    iput p4, p0, Ldf/g$c;->k:I

    iput-wide p5, p0, Ldf/g$c;->l:D

    iput-object p7, p0, Ldf/g$c;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Ldf/g$c;->h:Ldf/g;

    invoke-static {v0}, Ldf/g;->d(Ldf/g;)Landroid/media/SoundPool;

    move-result-object v1

    iget v2, p0, Ldf/g$c;->i:I

    iget-object v0, p0, Ldf/g$c;->j:Ldf/h;

    invoke-virtual {v0}, Ldf/h;->a()F

    move-result v3

    iget-object v0, p0, Ldf/g$c;->j:Ldf/h;

    invoke-virtual {v0}, Ldf/h;->b()F

    move-result v4

    iget v6, p0, Ldf/g$c;->k:I

    iget-wide v7, p0, Ldf/g$c;->l:D

    double-to-float v7, v7

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    invoke-static {}, Ldf/c;->b()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Ldf/g$k;

    iget-object v3, p0, Ldf/g$c;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {v2, v3, v0}, Ldf/g$k;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
