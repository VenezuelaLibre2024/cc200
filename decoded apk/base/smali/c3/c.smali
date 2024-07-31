.class public final Lc3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/c$a;
    }
.end annotation


# static fields
.field public static final n:Lc3/c$a;


# instance fields
.field public h:Landroid/content/Context;

.field public i:Lio/flutter/plugin/common/MethodChannel;

.field public final j:Ljava/lang/String;

.field public final k:Lwb/e;

.field public l:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc3/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc3/c$a;-><init>(Ltd/g;)V

    sput-object v0, Lc3/c;->n:Lc3/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "VideoCompressPlugin"

    iput-object v0, p0, Lc3/c;->j:Ljava/lang/String;

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lc3/c;->k:Lwb/e;

    const-string v0, "video_compress"

    iput-object v0, p0, Lc3/c;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc3/c;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    iget-object v1, p0, Lc3/c;->m:Ljava/lang/String;

    invoke-direct {v0, p2, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object p1, p0, Lc3/c;->h:Landroid/content/Context;

    iput-object v0, p0, Lc3/c;->i:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "binding.applicationContext"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    const-string v1, "binding.binaryMessenger"

    invoke-static {p1, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lc3/c;->b(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lc3/c;->i:Lio/flutter/plugin/common/MethodChannel;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    :cond_0
    iput-object v0, p0, Lc3/c;->h:Landroid/content/Context;

    iput-object v0, p0, Lc3/c;->i:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-object/from16 v6, p2

    const-string v1, "call"

    invoke-static {v0, v1}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "result"

    invoke-static {v6, v1}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v8, Lc3/c;->h:Landroid/content/Context;

    iget-object v1, v8, Lc3/c;->i:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v3, :cond_11

    if-nez v1, :cond_0

    goto/16 :goto_b

    :cond_0
    iget-object v2, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "video_compress"

    const-string v7, "position"

    const-string v9, "quality"

    const-string v10, "path"

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_9

    :sswitch_0
    const-string v1, "getMediaInfo"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_9

    :cond_1
    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lc3/b;

    iget-object v2, v8, Lc3/c;->m:Ljava/lang/String;

    invoke-direct {v1, v2}, Lc3/b;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v0}, Lc3/b;->d(Landroid/content/Context;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_8

    :sswitch_1
    const-string v4, "compressVideo"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v4, "deleteOrigin"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const-string v4, "startTime"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    const-string v10, "duration"

    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    const-string v11, "includeAudio"

    invoke-virtual {v0, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    if-nez v11, :cond_3

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_3
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const-string v12, "frameRate"

    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_4

    const/16 v0, 0x1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    :goto_0
    invoke-virtual {v3, v5}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-static {v5}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v12, "context.getExternalFiles\u2026compress\")!!.absolutePath"

    invoke-static {v5, v12}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v13, "yyyy-MM-dd hh-mm-ss"

    invoke-direct {v12, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v13, Ljava/util/Date;

    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    invoke-virtual {v12, v13}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "VID_"

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v5

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ".mp4"

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v12, 0x154

    invoke-static {v12}, Lbc/c;->b(I)Lbc/c$b;

    move-result-object v12

    invoke-virtual {v12}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v13, "atMost(340).build()"

    invoke-static {v12, v13}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0x280

    const/16 v14, 0x2d0

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    const/16 v0, 0x438

    const/16 v2, 0x780

    invoke-static {v0, v2}, Lbc/c;->c(II)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(1080, 1920).build()"

    goto/16 :goto_1

    :pswitch_1
    const/16 v0, 0x500

    invoke-static {v14, v0}, Lbc/c;->c(II)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(720, 1280).build()"

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x21c

    const/16 v2, 0x3c0

    invoke-static {v0, v2}, Lbc/c;->c(II)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(540, 960).build()"

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x1e0

    invoke-static {v0, v13}, Lbc/c;->c(II)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(480, 640).build()"

    goto :goto_1

    :pswitch_4
    new-instance v2, Lbc/c$b;

    invoke-direct {v2}, Lbc/c$b;-><init>()V

    const/high16 v12, 0x40400000    # 3.0f

    invoke-virtual {v2, v12}, Lbc/c$b;->d(F)Lbc/c$b;

    move-result-object v2

    const v12, 0xe1000

    int-to-long v12, v12

    const/4 v14, 0x4

    int-to-long v14, v14

    mul-long/2addr v12, v14

    invoke-virtual {v2, v12, v13}, Lbc/c$b;->a(J)Lbc/c$b;

    move-result-object v2

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lbc/c$b;->c(I)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "Builder()\n              \u2026                 .build()"

    goto :goto_1

    :pswitch_5
    invoke-static {v13}, Lbc/c;->b(I)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(640).build()"

    goto :goto_1

    :pswitch_6
    const/16 v0, 0x168

    invoke-static {v0}, Lbc/c;->b(I)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(360).build()"

    goto :goto_1

    :pswitch_7
    invoke-static {v14}, Lbc/c;->b(I)Lbc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/c$b;->b()Lbc/c;

    move-result-object v12

    const-string v0, "atMost(720).build()"

    :goto_1
    invoke-static {v12, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    if-eqz v11, :cond_5

    invoke-static {}, Lbc/a;->b()Lbc/a$b;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Lbc/a$b;->b(I)Lbc/a$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lbc/a$b;->d(I)Lbc/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lbc/a$b;->a()Lbc/a;

    move-result-object v0

    const-string v2, "{\n                    va\u2026build()\n                }"

    invoke-static {v0, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    new-instance v0, Lbc/d;

    invoke-direct {v0}, Lbc/d;-><init>()V

    :goto_3
    if-nez v4, :cond_7

    if-eqz v10, :cond_6

    goto :goto_4

    :cond_6
    new-instance v2, Lac/f;

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lac/f;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    move-object v10, v7

    move-object/from16 p1, v12

    goto :goto_6

    :cond_7
    :goto_4
    new-instance v14, Lac/f;

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v14, v3, v2}, Lac/f;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    new-instance v2, Lac/e;

    const v11, 0xf4240

    const/4 v13, 0x0

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_8
    move v4, v13

    :goto_5
    mul-int/2addr v4, v11

    move-object/from16 p1, v12

    int-to-long v11, v4

    if-eqz v10, :cond_9

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v13

    :cond_9
    const v4, 0xf4240

    mul-int/2addr v4, v13

    move-object v10, v7

    int-to-long v6, v4

    move-object v13, v2

    move-wide v15, v11

    move-wide/from16 v17, v6

    invoke-direct/range {v13 .. v18}, Lac/e;-><init>(Lac/b;JJ)V

    :goto_6
    invoke-static {v5}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-static {v5}, Lub/a;->d(Ljava/lang/String;)Lub/c$b;

    move-result-object v4

    invoke-virtual {v4, v2}, Lub/c$b;->a(Lac/b;)Lub/c$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lub/c$b;->d(Lbc/e;)Lub/c$b;

    move-result-object v0

    move-object/from16 v12, p1

    invoke-virtual {v0, v12}, Lub/c$b;->f(Lbc/e;)Lub/c$b;

    move-result-object v11

    new-instance v12, Lc3/c$b;

    move-object v0, v12

    move-object/from16 v2, p0

    move-object v4, v5

    move-object/from16 v5, p2

    move v6, v9

    move-object v7, v10

    invoke-direct/range {v0 .. v7}, Lc3/c$b;-><init>(Lio/flutter/plugin/common/MethodChannel;Lc3/c;Landroid/content/Context;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;ZLjava/lang/String;)V

    invoke-virtual {v11, v12}, Lub/c$b;->e(Lub/b;)Lub/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lub/c$b;->g()Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, v8, Lc3/c;->l:Ljava/util/concurrent/Future;

    goto/16 :goto_a

    :sswitch_2
    const-string v1, "getByteThumbnail"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v3, Lc3/a;

    iget-object v4, v8, Lc3/c;->m:Ljava/lang/String;

    invoke-direct {v3, v4}, Lc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    int-to-long v4, v0

    move-object v0, v3

    move-wide v3, v4

    move-object/from16 v5, p2

    invoke-virtual/range {v0 .. v5}, Lc3/a;->a(Ljava/lang/String;IJLio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_a

    :sswitch_3
    const-string v0, "deleteAllCache"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :goto_7
    move-object/from16 v6, p2

    goto/16 :goto_9

    :cond_b
    new-instance v0, Lc3/b;

    iget-object v1, v8, Lc3/c;->m:Ljava/lang/String;

    invoke-direct {v0, v1}, Lc3/b;-><init>(Ljava/lang/String;)V

    move-object/from16 v6, p2

    invoke-virtual {v0, v3, v6}, Lc3/b;->a(Landroid/content/Context;Lio/flutter/plugin/common/MethodChannel$Result;)V

    sget-object v0, Lgd/s;->a:Lgd/s;

    goto :goto_8

    :sswitch_4
    const-string v1, "setLogLevel"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_9

    :cond_c
    const-string v1, "logLevel"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Lwb/e;->e(I)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_8
    invoke-interface {v6, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_a

    :sswitch_5
    const-string v1, "getFileThumbnail"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v0, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Lc3/a;

    invoke-direct {v1, v5}, Lc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    int-to-long v9, v0

    move-object v0, v1

    move-object v1, v3

    move v3, v4

    move-wide v4, v9

    move-object/from16 v6, p2

    invoke-virtual/range {v0 .. v6}, Lc3/a;->b(Landroid/content/Context;Ljava/lang/String;IJLio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_a

    :sswitch_6
    const-string v0, "cancelCompression"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    iget-object v0, v8, Lc3/c;->l:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_f
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_8

    :cond_10
    :goto_9
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_a
    return-void

    :cond_11
    :goto_b
    iget-object v0, v8, Lc3/c;->j:Ljava/lang/String;

    const-string v1, "Calling VideoCompress plugin before initialization"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4f961d74 -> :sswitch_6
        -0x1a595ce6 -> :sswitch_5
        -0x1278eede -> :sswitch_4
        -0x10c1ced4 -> :sswitch_3
        0x4dda750e -> :sswitch_2
        0x671b0639 -> :sswitch_1
        0x7efd27fc -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
