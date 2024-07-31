.class public final Ldf/g$e;
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

.field public final synthetic j:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ldf/g;ILio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ldf/g$e;->h:Ldf/g;

    iput p2, p0, Ldf/g$e;->i:I

    iput-object p3, p0, Ldf/g$e;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ldf/g$e;->h:Ldf/g;

    invoke-static {v0}, Ldf/g;->d(Ldf/g;)Landroid/media/SoundPool;

    move-result-object v0

    iget v1, p0, Ldf/g$e;->i:I

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->resume(I)V

    invoke-static {}, Ldf/c;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ldf/g$m;

    iget-object v2, p0, Ldf/g$e;->j:Lio/flutter/plugin/common/MethodChannel$Result;

    iget v3, p0, Ldf/g$e;->i:I

    invoke-direct {v1, v2, v3}, Ldf/g$m;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
