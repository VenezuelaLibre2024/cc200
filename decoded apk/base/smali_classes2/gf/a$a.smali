.class public Lgf/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgf/a;->onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/Map;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic q:Lgf/a;


# direct methods
.method public constructor <init>(Lgf/a;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IIIIILio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgf/a$a;->q:Lgf/a;

    iput-object p2, p0, Lgf/a$a;->h:Ljava/lang/String;

    iput-object p3, p0, Lgf/a$a;->i:Ljava/util/Map;

    iput-object p4, p0, Lgf/a$a;->j:Ljava/lang/String;

    iput p5, p0, Lgf/a$a;->k:I

    iput p6, p0, Lgf/a$a;->l:I

    iput p7, p0, Lgf/a$a;->m:I

    iput p8, p0, Lgf/a$a;->n:I

    iput p9, p0, Lgf/a$a;->o:I

    iput-object p10, p0, Lgf/a$a;->p:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lgf/a$a;->h:Ljava/lang/String;

    const-string v3, "file"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lgf/a$a;->i:Ljava/util/Map;

    const-string v4, "path"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    iget-object v4, p0, Lgf/a$a;->q:Lgf/a;

    iget-object v5, p0, Lgf/a$a;->j:Ljava/lang/String;

    iget v7, p0, Lgf/a$a;->k:I

    iget v8, p0, Lgf/a$a;->l:I

    iget v9, p0, Lgf/a$a;->m:I

    iget v10, p0, Lgf/a$a;->n:I

    iget v11, p0, Lgf/a$a;->o:I

    invoke-static/range {v4 .. v11}, Lgf/a;->a(Lgf/a;Ljava/lang/String;Ljava/lang/String;IIIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lgf/a$a;->h:Ljava/lang/String;

    const-string v4, "data"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v4, p0, Lgf/a$a;->q:Lgf/a;

    iget-object v5, p0, Lgf/a$a;->j:Ljava/lang/String;

    iget v6, p0, Lgf/a$a;->k:I

    iget v7, p0, Lgf/a$a;->l:I

    iget v8, p0, Lgf/a$a;->m:I

    iget v9, p0, Lgf/a$a;->n:I

    iget v10, p0, Lgf/a$a;->o:I

    invoke-static/range {v4 .. v10}, Lgf/a;->b(Lgf/a;Ljava/lang/String;IIIII)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    move v3, v1

    move-object v1, v0

    :goto_0
    move-object v2, v0

    move-object v0, v1

    move v1, v3

    goto :goto_1

    :catch_0
    move-exception v2

    :goto_1
    iget-object v3, p0, Lgf/a$a;->q:Lgf/a;

    iget-object v4, p0, Lgf/a$a;->p:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v3, v4, v0, v1, v2}, Lgf/a;->c(Lgf/a;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;ZLjava/lang/Exception;)V

    return-void
.end method
