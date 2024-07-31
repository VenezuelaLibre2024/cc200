.class public final Lzc/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public final h:Lzc/b;

.field public final i:Ldev/fluttercommunity/plus/share/a;


# direct methods
.method public constructor <init>(Lzc/b;Ldev/fluttercommunity/plus/share/a;)V
    .locals 1

    const-string v0, "share"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzc/a;->h:Lzc/b;

    iput-object p2, p0, Lzc/a;->i:Ldev/fluttercommunity/plus/share/a;

    return-void
.end method


# virtual methods
.method public final a(Lio/flutter/plugin/common/MethodCall;)V
    .locals 1

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    instance-of p1, p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Map arguments expected"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 12

    const-string v0, "call"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v1, "call.method"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "WithResult"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lae/n;->l(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x16

    if-lt v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v3, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const-string v11, "dev.fluttercommunity.plus/share/unavailable"

    const-string v6, "subject"

    const-string v7, "text"

    const-string v8, "null cannot be cast to non-null type kotlin.String"

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "share"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "shareUri"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lzc/a;->a(Lio/flutter/plugin/common/MethodCall;)V

    iget-object v0, p0, Lzc/a;->h:Lzc/b;

    const-string v3, "uri"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v8}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1, v4, v2}, Lzc/b;->m(Ljava/lang/String;Ljava/lang/String;Z)V

    if-nez v1, :cond_9

    :cond_2
    invoke-interface {p2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_2
    const-string v2, "shareFilesWithResult"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "shareWithResult"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-virtual {p0, p1}, Lzc/a;->a(Lio/flutter/plugin/common/MethodCall;)V

    if-eqz v1, :cond_4

    iget-object v2, p0, Lzc/a;->i:Ldev/fluttercommunity/plus/share/a;

    invoke-virtual {v2, p2}, Ldev/fluttercommunity/plus/share/a;->b(Lio/flutter/plugin/common/MethodChannel$Result;)Z

    move-result v2

    if-nez v2, :cond_4

    return-void

    :cond_4
    iget-object v2, p0, Lzc/a;->h:Lzc/b;

    invoke-virtual {p1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v8}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v2, v3, p1, v1}, Lzc/b;->m(Ljava/lang/String;Ljava/lang/String;Z)V

    if-nez v1, :cond_9

    if-eqz v0, :cond_2

    invoke-interface {p2, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_4
    const-string v2, "shareFiles"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0, p1}, Lzc/a;->a(Lio/flutter/plugin/common/MethodCall;)V

    if-eqz v1, :cond_6

    iget-object v2, p0, Lzc/a;->i:Ldev/fluttercommunity/plus/share/a;

    invoke-virtual {v2, p2}, Ldev/fluttercommunity/plus/share/a;->b(Lio/flutter/plugin/common/MethodChannel$Result;)Z

    move-result v2

    if-nez v2, :cond_6

    return-void

    :cond_6
    :try_start_0
    iget-object v5, p0, Lzc/a;->h:Lzc/b;

    const-string v2, "paths"

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    const-string v3, "mimeTypes"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {p1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    move-object v6, v2

    move-object v7, v3

    move v10, v1

    invoke-virtual/range {v5 .. v10}, Lzc/b;->n(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    if-nez v1, :cond_9

    if-eqz v0, :cond_7

    invoke-interface {p2, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-interface {p2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Share failed"

    invoke-interface {p2, v0, p1, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    :goto_1
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :cond_9
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6bf77228 -> :sswitch_4
        -0x5f0fa63e -> :sswitch_3
        -0x4842cb85 -> :sswitch_2
        -0x2c5502f3 -> :sswitch_1
        0x6854fdf -> :sswitch_0
    .end sparse-switch
.end method
