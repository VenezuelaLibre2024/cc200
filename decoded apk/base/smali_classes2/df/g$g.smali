.class public final Ldf/g$g;
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
.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Ldf/g;

.field public final synthetic k:D

.field public final synthetic l:D

.field public final synthetic m:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ldf/g;DDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ldf/g$g;->h:Ljava/lang/Integer;

    iput-object p2, p0, Ldf/g$g;->i:Ljava/lang/Integer;

    iput-object p3, p0, Ldf/g$g;->j:Ldf/g;

    iput-wide p4, p0, Ldf/g$g;->k:D

    iput-wide p6, p0, Ldf/g$g;->l:D

    iput-object p8, p0, Ldf/g$g;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ldf/g$g;->h:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Ldf/g$g;->j:Ldf/g;

    invoke-static {v1}, Ldf/g;->d(Ldf/g;)Landroid/media/SoundPool;

    move-result-object v1

    iget-wide v2, p0, Ldf/g$g;->k:D

    double-to-float v2, v2

    iget-wide v3, p0, Ldf/g$g;->l:D

    double-to-float v3, v3

    invoke-virtual {v1, v0, v2, v3}, Landroid/media/SoundPool;->setVolume(IFF)V

    :cond_0
    iget-object v0, p0, Ldf/g$g;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ldf/g$g;->j:Ldf/g;

    invoke-static {v1}, Ldf/g;->e(Ldf/g;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ldf/h;

    iget-wide v3, p0, Ldf/g$g;->k:D

    double-to-float v3, v3

    iget-wide v4, p0, Ldf/g$g;->l:D

    double-to-float v4, v4

    invoke-direct {v2, v3, v4}, Ldf/h;-><init>(FF)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {}, Ldf/c;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ldf/g$o;

    iget-object v2, p0, Ldf/g$g;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {v1, v2}, Ldf/g$o;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
