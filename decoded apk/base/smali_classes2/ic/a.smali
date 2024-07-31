.class public Lic/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field public h:Lio/flutter/plugin/common/MethodChannel;

.field public i:Ljc/b;

.field public j:Lkc/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lic/a;ILjava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lic/a;->c(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "record_mp3"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lic/a;->h:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance p1, Lic/a$a;

    invoke-direct {p1, p0}, Lic/a$a;-><init>(Lic/a;)V

    iput-object p1, p0, Lic/a;->j:Lkc/a;

    return-void
.end method

.method public final c(ILjava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "RecordMp3"

    invoke-static {v0, p2}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lic/a;->h:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Lic/a$b;

    invoke-direct {v0, p0}, Lic/a$b;-><init>(Lic/a;)V

    const-string v1, "onRecordError"

    invoke-virtual {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lic/a;->i:Ljc/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljc/b;->r()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lic/a;->i:Ljc/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljc/b;->v()V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "record = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RecordMp3Plugin"

    invoke-static {v1, v0}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lic/a;->i:Ljc/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljc/b;->n()V

    iget-object p1, p0, Lic/a;->i:Ljc/b;

    invoke-virtual {p1, v0}, Ljc/b;->w(Ljava/io/File;)V

    iget-object p1, p0, Lic/a;->i:Ljc/b;

    goto :goto_0

    :cond_0
    new-instance p1, Ljc/b;

    iget-object v1, p0, Lic/a;->j:Lkc/a;

    invoke-direct {p1, v0, v1}, Ljc/b;-><init>(Ljava/io/File;Lkc/a;)V

    iput-object p1, p0, Lic/a;->i:Ljc/b;

    :goto_0
    invoke-virtual {p1}, Ljc/b;->z()V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lic/a;->i:Ljc/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljc/b;->A()V

    const/4 v0, 0x0

    iput-object v0, p0, Lic/a;->i:Ljc/b;

    :cond_0
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    invoke-virtual {p0, p1}, Lic/a;->b(Lio/flutter/plugin/common/BinaryMessenger;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    iget-object p1, p0, Lic/a;->h:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v0, p0, Lic/a;->h:Lio/flutter/plugin/common/MethodChannel;

    :cond_0
    iget-object p1, p0, Lic/a;->i:Ljc/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljc/b;->n()V

    iput-object v0, p0, Lic/a;->i:Ljc/b;

    :cond_1
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object p2, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "start"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "pause"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "stop"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "resume"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string p2, "path"

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lic/a;->f(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lic/a;->d()V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lic/a;->g()V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0}, Lic/a;->e()V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x37b237d3 -> :sswitch_3
        0x360802 -> :sswitch_2
        0x65825f6 -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
