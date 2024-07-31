.class public Lgf/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgf/a;->i(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;ZLjava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic j:Ljava/lang/Exception;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lgf/a;


# direct methods
.method public constructor <init>(Lgf/a;ZLio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgf/a$b;->l:Lgf/a;

    iput-boolean p2, p0, Lgf/a$b;->h:Z

    iput-object p3, p0, Lgf/a$b;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p4, p0, Lgf/a$b;->j:Ljava/lang/Exception;

    iput-object p5, p0, Lgf/a$b;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-boolean v0, p0, Lgf/a$b;->h:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lgf/a$b;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    return-void

    :cond_0
    iget-object v0, p0, Lgf/a$b;->j:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    iget-object v0, p0, Lgf/a$b;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lgf/a$b;->j:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "exception"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lgf/a$b;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v1, p0, Lgf/a$b;->k:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
