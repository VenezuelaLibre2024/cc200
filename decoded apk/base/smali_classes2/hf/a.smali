.class public final Lhf/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/a$a;,
        Lhf/a$b;
    }
.end annotation


# static fields
.field public static final n:Lhf/a$a;


# instance fields
.field public h:Lio/flutter/plugin/common/MethodChannel;

.field public i:Landroid/content/Context;

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhf/c;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Landroid/os/Handler;

.field public l:Ljava/lang/Runnable;

.field public m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhf/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhf/a$a;-><init>(Ltd/g;)V

    sput-object v0, Lhf/a;->n:Lhf/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lhf/a;->j:Ljava/util/Map;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lhf/a;->k:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic a(Lhf/a;)Z
    .locals 0

    iget-boolean p0, p0, Lhf/a;->m:Z

    return p0
.end method

.method public static final synthetic b(Lhf/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lhf/a;->m:Z

    return-void
.end method

.method public static final synthetic c(Lhf/a;)V
    .locals 0

    invoke-virtual {p0}, Lhf/a;->n()V

    return-void
.end method


# virtual methods
.method public final d(Lio/flutter/plugin/common/MethodCall;Lhf/c;)V
    .locals 3

    const-string v0, "respectSilence"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "stayAwake"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "duckAudio"

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_2

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p2, v0, v1, v2}, Lhf/c;->a(ZZZ)V

    const-string v0, "volume"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    if-nez p1, :cond_3

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lhf/c;->p(D)V

    return-void
.end method

.method public final e()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Lhf/a;->i:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context.applicationContext"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Lhf/c;
    .locals 3

    iget-object v0, p0, Lhf/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    const-string v2, "PlayerMode.MEDIA_PLAYER"

    invoke-static {p2, v2, v1}, Lae/n;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lhf/f;

    invoke-direct {p2, p0, p1}, Lhf/f;-><init>(Lhf/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lhf/h;

    invoke-direct {p2, p1}, Lhf/h;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v1, p2

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v1, Lhf/c;

    return-object v1
.end method

.method public final g(Lhf/c;)V
    .locals 3

    const-string v0, "player"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    const-string v0, "channel"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    invoke-virtual {p1}, Lhf/c;->d()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, p1, v2}, Lhf/a$a;->a(Lhf/a$a;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "audio.onComplete"

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lhf/c;)V
    .locals 3

    const-string v0, "player"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    const-string v0, "channel"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    invoke-virtual {p1}, Lhf/c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lhf/c;->c()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lhf/a$a;->a(Lhf/a$a;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "audio.onDuration"

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Lhf/c;Ljava/lang/String;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    const-string v0, "channel"

    invoke-static {v0}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    invoke-virtual {p1}, Lhf/c;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, p2}, Lhf/a$a;->a(Lhf/a$a;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "audio.onError"

    invoke-virtual {v0, p2, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final j()V
    .locals 0

    invoke-virtual {p0}, Lhf/a;->m()V

    return-void
.end method

.method public final k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v4, "changeLogLevel"

    invoke-static {v3, v4}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v5, 0x2e

    const-string v6, "argument<String>(name) ?: return null"

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    if-eqz v3, :cond_2

    const-string v3, "value"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v10, v6}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v11, v8, [C

    aput-char v5, v11, v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lae/o;->c0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lhd/v;->y(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lc;->valueOf(Ljava/lang/String;)Lc;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_1

    sget-object v1, Ld;->a:Ld;

    invoke-virtual {v1, v4}, Ld;->e(Lc;)V

    invoke-interface {v2, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "value is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :cond_2
    const-string v3, "playerId"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_3

    return-void

    :cond_3
    const-string v10, "mode"

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v0, v3, v10}, Lhf/a;->f(Ljava/lang/String;Ljava/lang/String;)Lhf/c;

    move-result-object v3

    iget-object v11, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v11, :cond_1d

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    const-string v13, "PlayerMode.LOW_LATENCY"

    const-string v14, "isLocal"

    const-string v15, "url"

    const-string v4, "position"

    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_5

    :sswitch_0
    const-string v4, "setReleaseMode"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "releaseMode"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_5

    const/4 v4, 0x0

    goto :goto_1

    :cond_5
    invoke-static {v10, v6}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v11, v8, [C

    aput-char v5, v11, v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lae/o;->c0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lhd/v;->y(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lhf/d;->valueOf(Ljava/lang/String;)Lhf/d;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_6

    invoke-virtual {v3, v4}, Lhf/c;->n(Lhf/d;)V

    goto/16 :goto_4

    :cond_6
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "releaseMode is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :sswitch_1
    const-string v1, "release"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_5

    :cond_7
    invoke-virtual {v3}, Lhf/c;->i()V

    goto/16 :goto_4

    :sswitch_2
    const-string v4, "setVolume"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v4, "volume"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lhf/c;->p(D)V

    goto/16 :goto_4

    :cond_9
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "volume is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :sswitch_3
    const-string v1, "pause"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_5

    :cond_a
    invoke-virtual {v3}, Lhf/c;->g()V

    goto/16 :goto_4

    :sswitch_4
    const-string v1, "getDuration"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_5

    :cond_b
    invoke-virtual {v3}, Lhf/c;->c()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :sswitch_5
    const-string v1, "stop"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_5

    :cond_d
    invoke-virtual {v3}, Lhf/c;->q()V

    goto/16 :goto_4

    :sswitch_6
    const-string v5, "seek"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto/16 :goto_5

    :cond_e
    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lhf/c;->j(I)V

    goto/16 :goto_4

    :cond_f
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "position is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :sswitch_7
    const-string v5, "play"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto/16 :goto_5

    :cond_10
    invoke-virtual {v0, v1, v3}, Lhf/a;->d(Lio/flutter/plugin/common/MethodCall;Lhf/c;)V

    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-nez v6, :cond_11

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v3, v5, v6}, Lhf/c;->o(Ljava/lang/String;Z)V

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_18

    invoke-static {v10, v13}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lhf/c;->j(I)V

    goto/16 :goto_3

    :sswitch_8
    const-string v4, "setPlaybackRate"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto/16 :goto_5

    :cond_12
    const-string v4, "playbackRate"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lhf/c;->m(D)V

    goto/16 :goto_4

    :cond_13
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "playbackRate is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :sswitch_9
    const-string v4, "earpieceOrSpeakersToggle"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto/16 :goto_5

    :cond_14
    const-string v4, "playingRoute"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_15

    invoke-virtual {v3, v1}, Lhf/c;->l(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_15
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "playingRoute is required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :sswitch_a
    const-string v4, "setUrl"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto/16 :goto_5

    :cond_16
    invoke-virtual {v1, v15}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_17

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v4, v1}, Lhf/c;->o(Ljava/lang/String;Z)V

    goto :goto_4

    :sswitch_b
    const-string v1, "resume"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_5

    :cond_18
    :goto_3
    invoke-virtual {v3}, Lhf/c;->h()V

    goto :goto_4

    :sswitch_c
    const-string v1, "getCurrentPosition"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_5

    :cond_19
    invoke-virtual {v3}, Lhf/c;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_1a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :sswitch_d
    const-string v5, "playBytes"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_5

    :cond_1b
    invoke-virtual {v0, v1, v3}, Lhf/a;->d(Lio/flutter/plugin/common/MethodCall;Lhf/c;)V

    const-string v5, "bytes"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    if-eqz v5, :cond_1c

    new-instance v6, Lhf/b;

    invoke-direct {v6, v5}, Lhf/b;-><init>([B)V

    invoke-virtual {v3, v6}, Lhf/c;->k(Landroid/media/MediaDataSource;)V

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_18

    invoke-static {v10, v13}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto/16 :goto_2

    :goto_4
    invoke-interface {v2, v9}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_1c
    sget-object v1, Lhf/a;->n:Lhf/a$a;

    const-string v2, "bytes are required"

    invoke-static {v1, v2}, Lhf/a$a;->b(Lhf/a$a;Ljava/lang/String;)Ljava/lang/Exception;

    move-result-object v1

    throw v1

    :cond_1d
    :goto_5
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x717eda69 -> :sswitch_d
        -0x68b9fc74 -> :sswitch_c
        -0x37b237d3 -> :sswitch_b
        -0x35fd6253 -> :sswitch_a
        -0x325c38fd -> :sswitch_9
        -0x17fa60e3 -> :sswitch_8
        0x348b34 -> :sswitch_7
        0x35ce78 -> :sswitch_6
        0x360802 -> :sswitch_5
        0x51e8b0a -> :sswitch_4
        0x65825f6 -> :sswitch_3
        0x27f73e1c -> :sswitch_2
        0x41012807 -> :sswitch_1
        0x7cf03488 -> :sswitch_0
    .end sparse-switch
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhf/a;->m:Z

    return-void
.end method

.method public final m()V
    .locals 4

    iget-object v0, p0, Lhf/a;->l:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lhf/a$b;

    iget-object v1, p0, Lhf/a;->j:Ljava/util/Map;

    iget-object v2, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-nez v2, :cond_1

    const-string v2, "channel"

    invoke-static {v2}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_1
    iget-object v3, p0, Lhf/a;->k:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3, p0}, Lhf/a$b;-><init>(Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel;Landroid/os/Handler;Lhf/a;)V

    iget-object v1, p0, Lhf/a;->k:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v0, p0, Lhf/a;->l:Ljava/lang/Runnable;

    return-void
.end method

.method public final n()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lhf/a;->l:Ljava/lang/Runnable;

    iget-object v1, p0, Lhf/a;->k:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    const-string v2, "xyz.luan/audioplayers"

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "binding.applicationContext"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lhf/a;->i:Landroid/content/Context;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lhf/a;->m:Z

    iget-object p1, p0, Lhf/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Ltd/m;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lhf/a;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Ld;->a:Ld;

    const-string v1, "Unexpected error!"

    invoke-virtual {v0, v1, p1}, Ld;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1, v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
