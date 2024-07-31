.class public Lr2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# instance fields
.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Ljava/util/concurrent/ExecutorService;

.field public k:Lio/flutter/plugin/common/MethodChannel;

.field public l:Lio/flutter/plugin/common/EventChannel;

.field public m:Lio/flutter/plugin/common/MethodChannel$Result;

.field public n:Landroid/content/Context;

.field public o:Landroid/app/Activity;

.field public p:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field public q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

.field public r:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final s:Lr2/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lr2/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lr2/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lr2/k;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lr2/e;

    invoke-direct {v0}, Lr2/e;-><init>()V

    iput-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p0, v0, v1

    const-string v1, "FFmpegKitFlutterPlugin created %s."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ffmpeg-kit-flutter"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static A0(Lq2/p;)I
    .locals 2

    sget-object v0, Lr2/k$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v1, 0x4

    if-eq p0, v1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    return v1

    :cond_2
    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static B0(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_0

    check-cast v2, Lorg/json/JSONArray;

    invoke-static {v2}, Lr2/k;->B0(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_0
    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_1

    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2}, Lr2/k;->F0(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static C0(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq2/n;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq2/n;

    invoke-static {v2}, Lr2/k;->G0(Lq2/n;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static D0(I)Lq2/p;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lq2/p;->l:Lq2/p;

    return-object p0

    :cond_0
    sget-object p0, Lq2/p;->k:Lq2/p;

    return-object p0

    :cond_1
    sget-object p0, Lq2/p;->j:Lq2/p;

    return-object p0

    :cond_2
    sget-object p0, Lq2/p;->i:Lq2/p;

    return-object p0

    :cond_3
    sget-object p0, Lq2/p;->h:Lq2/p;

    return-object p0
.end method

.method public static E0(Ljava/util/Date;)J
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static F0(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    instance-of v4, v3, Lorg/json/JSONArray;

    if-eqz v4, :cond_1

    check-cast v3, Lorg/json/JSONArray;

    invoke-static {v3}, Lr2/k;->B0(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_1
    instance-of v4, v3, Lorg/json/JSONObject;

    if-eqz v4, :cond_2

    check-cast v3, Lorg/json/JSONObject;

    invoke-static {v3}, Lr2/k;->F0(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static G0(Lq2/n;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/n;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lq2/n;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "sessionId"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/n;->a()Lq2/m;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->z0(Lq2/m;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "level"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/n;->b()Ljava/lang/String;

    move-result-object p0

    const-string v1, "message"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static H0(Lq2/q;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/q;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lq2/q;->a()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lq2/q;->a()Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lr2/k;->F0(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static I0(Lq2/x;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/x;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Lq2/x;->q()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "sessionId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lq2/x;->k()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->E0(Ljava/util/Date;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "createTime"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lq2/x;->f()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->E0(Ljava/util/Date;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "startTime"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lq2/x;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "command"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lq2/x;->d()Z

    move-result v1

    const-string v2, "type"

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-interface {p0}, Lq2/x;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Lq2/x;->s()Z

    move-result v1

    if-eqz v1, :cond_4

    check-cast p0, Lq2/s;

    invoke-virtual {p0}, Lq2/s;->B()Lq2/q;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Lr2/k;->H0(Lq2/q;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "mediaInformation"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p0, 0x3

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static J0(Lq2/a0;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/a0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lq2/a0;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "sessionId"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "videoFrameNumber"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->f()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "videoFps"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "videoQuality"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->c()J

    move-result-wide v1

    const-wide/32 v3, 0x7fffffff

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    invoke-virtual {p0}, Lq2/a0;->c()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lq2/a0;->c()J

    move-result-wide v1

    rem-long/2addr v1, v3

    :goto_0
    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "size"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->e()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "time"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "bitrate"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lq2/a0;->d()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string v1, "speed"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static K0(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lq2/x;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq2/x;

    invoke-static {v2}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static L0(I)Lq2/y;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sget-object p0, Lq2/y;->k:Lq2/y;

    return-object p0

    :cond_0
    sget-object p0, Lq2/y;->j:Lq2/y;

    return-object p0

    :cond_1
    sget-object p0, Lq2/y;->i:Lq2/y;

    return-object p0

    :cond_2
    sget-object p0, Lq2/y;->h:Lq2/y;

    return-object p0
.end method

.method public static M0(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq2/a0;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq2/a0;

    invoke-static {v2}, Lr2/k;->J0(Lq2/a0;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static synthetic a(Lr2/k;Lq2/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lr2/k;->i0(Lq2/n;)V

    return-void
.end method

.method public static synthetic b(Lr2/k;Lq2/a0;)V
    .locals 0

    invoke-direct {p0, p1}, Lr2/k;->j0(Lq2/a0;)V

    return-void
.end method

.method public static h0(Ljava/lang/Integer;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic i0(Lq2/n;)V
    .locals 1

    iget-object v0, p0, Lr2/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lr2/k;->x(Lq2/n;)V

    :cond_0
    return-void
.end method

.method private synthetic j0(Lq2/a0;)V
    .locals 1

    iget-object v0, p0, Lr2/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lr2/k;->z(Lq2/a0;)V

    :cond_0
    return-void
.end method

.method public static z0(Lq2/m;)I
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, Lq2/m;->r:Lq2/m;

    :cond_0
    invoke-virtual {p0}, Lq2/m;->f()I

    move-result p0

    return p0
.end method


# virtual methods
.method public A()V
    .locals 3

    iget-object v0, p0, Lr2/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method

.method public B(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->A()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public C(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->A()V

    invoke-virtual {p0}, Lr2/k;->D()V

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->o()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public D()V
    .locals 3

    iget-object v0, p0, Lr2/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method

.method public E(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->D()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public F(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    sget-object v0, Lq2/p;->l:Lq2/p;

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v1, v0}, Lq2/h;->A([Ljava/lang/String;Lq2/i;Lq2/o;Lq2/b0;Lq2/p;)Lq2/h;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public G(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lr2/l;

    check-cast p1, Lq2/h;

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-direct {v0, p1, v1, p2}, Lr2/l;-><init>(Lq2/h;Lr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Lr2/k;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_FFMPEG_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public H(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "SESSION_NOT_FOUND"

    const-string v0, "Session not found."

    :goto_0
    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lq2/x;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Lr2/k;->h0(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 p2, 0x1388

    :goto_1
    check-cast p1, Lq2/h;

    invoke-virtual {p1, p2}, Lq2/h;->B(I)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->M0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "NOT_FFMPEG_SESSION"

    const-string v0, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_2
    return-void
.end method

.method public I(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lq2/h;

    invoke-virtual {p1}, Lq2/h;->D()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->M0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_FFMPEG_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public J(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    sget-object v0, Lq2/p;->l:Lq2/p;

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0}, Lq2/k;->z([Ljava/lang/String;Lq2/l;Lq2/o;Lq2/p;)Lq2/k;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public K(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lr2/m;

    check-cast p1, Lq2/k;

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-direct {v0, p1, v1, p2}, Lr2/m;-><init>(Lq2/k;Lr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Lr2/k;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_FFPROBE_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public L(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public M(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public N(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lq2/v;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public N0()V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->P0()V

    invoke-virtual {p0}, Lr2/k;->O0()V

    iget-object v0, p0, Lr2/k;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lr2/k;->n:Landroid/content/Context;

    iput-object v0, p0, Lr2/k;->o:Landroid/app/Activity;

    iput-object v0, p0, Lr2/k;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "FFmpegKitFlutterPlugin uninitialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public O(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lq2/g;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->K0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public O0()V
    .locals 2

    iget-object v0, p0, Lr2/k;->l:Lio/flutter/plugin/common/EventChannel;

    if-nez v0, :cond_0

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "FFmpegKitFlutterPlugin event channel was already uninitialised."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object v1, p0, Lr2/k;->l:Lio/flutter/plugin/common/EventChannel;

    return-void
.end method

.method public P(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public P0()V
    .locals 2

    iget-object v0, p0, Lr2/k;->k:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "FFmpegKitFlutterPlugin method channel was already uninitialised."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v1, p0, Lr2/k;->k:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public Q(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lq2/j;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->K0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public Q0(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    new-instance v0, Lr2/o;

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-direct {v0, p1, p2, v1, p3}, Lr2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Lr2/k;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public R(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->z()Lq2/x;

    move-result-object v0

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-static {v0}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public S(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->A()Lq2/x;

    move-result-object v0

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-static {v0}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public T(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->B()Lq2/m;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->z0(Lq2/m;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public U(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->C()Lq2/p;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->A0(Lq2/p;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public V(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lq2/s;

    invoke-virtual {p1}, Lq2/s;->B()Lq2/q;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->H0(Lq2/q;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_MEDIA_INFORMATION_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public W(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lq2/j;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->K0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public X(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lq2/v;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public Y(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const-string v1, "android"

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public Z(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v1, "GET_SAF_PARAMETER_FAILED"

    const-string v2, "ffmpeg-kit-flutter"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v5, 0x13

    if-ge v0, v5, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, p2, v3

    const-string v5, "getSafParameter is not supported on API Level %d"

    invoke-static {p1, v5, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {p2, v5, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, v1, p2}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lr2/k;->n:Landroid/content/Context;

    const/4 v5, 0x2

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v3

    aput-object p2, v0, v4

    const-string p1, "Cannot getSafParameter using parameters uriString: %s, openMode: %s. Uri string cannot be parsed."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "Uri string cannot be parsed."

    invoke-virtual {p1, p3, v1, p2}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lr2/k;->n:Landroid/content/Context;

    invoke-static {v1, v0, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->G(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    aput-object p2, v1, v4

    aput-object v0, v1, v5

    const-string p1, "getSafParameter using parameters uriString: %s, openMode: %s completed with saf parameter: %s."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1, p3, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v3

    aput-object p2, v0, v4

    const-string p1, "Cannot getSafParameter using parameters uriString: %s, openMode: %s. Context is null."

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "INVALID_CONTEXT"

    const-string v0, "Context is null."

    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public b0(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->I()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "SESSION_NOT_FOUND"

    const-string v0, "Session not found."

    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-static {p2}, Lr2/k;->h0(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_1
    const/16 p2, 0x1388

    :goto_0
    invoke-interface {p1, p2}, Lq2/x;->i(I)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->C0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public c0(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->J()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lr2/k;->K0(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "SESSION_NOT_FOUND"

    const-string v0, "Session not found."

    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-static {p2}, Lr2/k;->h0(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_1
    const/16 p2, 0x1388

    :goto_0
    invoke-interface {p1, p2}, Lq2/x;->e(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p2, p3, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public d0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lr2/k;->L0(I)Lq2/y;

    move-result-object p1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->K(Lq2/y;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lr2/k;->K0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-interface {p1}, Lq2/x;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public e0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lq2/z;->i:Lq2/z;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lq2/z;->j:Lq2/z;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lq2/z;->k:Lq2/z;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lq2/z;->l:Lq2/z;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne v0, v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v1, Lq2/z;->m:Lq2/z;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_5

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->M(Lq2/z;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1, p2, v3}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "INVALID_SIGNAL"

    const-string v1, "Signal value not supported."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public f(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lq2/x;->n()Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public f0(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Landroid/app/Activity;Lio/flutter/plugin/common/PluginRegistry$Registrar;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 3

    invoke-virtual {p0}, Lr2/k;->p0()V

    iget-object v0, p0, Lr2/k;->k:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "ffmpeg-kit-flutter"

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "flutter.arthenica.com/ffmpeg_kit"

    invoke-direct {v0, p1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lr2/k;->k:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    goto :goto_0

    :cond_0
    const-string v0, "FFmpegKitFlutterPlugin method channel was already initialised."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v0, p0, Lr2/k;->l:Lio/flutter/plugin/common/EventChannel;

    if-nez v0, :cond_1

    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    const-string v2, "flutter.arthenica.com/ffmpeg_kit_event"

    invoke-direct {v0, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lr2/k;->l:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    goto :goto_1

    :cond_1
    const-string p1, "FFmpegKitFlutterPlugin event channel was already initialised."

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iput-object p2, p0, Lr2/k;->n:Landroid/content/Context;

    iput-object p3, p0, Lr2/k;->o:Landroid/app/Activity;

    if-eqz p4, :cond_2

    invoke-interface {p4, p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)Lio/flutter/plugin/common/PluginRegistry$Registrar;

    goto :goto_2

    :cond_2
    invoke-interface {p5, p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    :goto_2
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p0, p1, p4

    const/4 p4, 0x1

    aput-object p2, p1, p4

    const/4 p2, 0x2

    aput-object p3, p1, p2

    const-string p2, "FFmpegKitFlutterPlugin %s initialised with context %s and activity %s."

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public g(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-interface {p1}, Lq2/x;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public g0(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->N()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public h(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lq2/x;->o()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->C0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public i(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lq2/x;->t()Lq2/w;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1}, Lq2/w;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public j(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-interface {p1}, Lq2/x;->getState()Lq2/y;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public k(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-interface {p1}, Lq2/x;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public k0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lq2/r;->a(Ljava/lang/String;)Lq2/q;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->H0(Lq2/q;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "Parsing MediaInformation failed."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public l(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lq2/h;

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->d(Lq2/h;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_FFMPEG_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public l0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lq2/r;->a(Ljava/lang/String;)Lq2/q;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->H0(Lq2/q;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "Parsing MediaInformation failed."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "PARSE_FAILED"

    const-string v1, "Parsing MediaInformation failed with JSON error."

    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public m(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "SESSION_NOT_FOUND"

    const-string v1, "Session not found."

    :goto_0
    invoke-virtual {p1, p2, v0, v1}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lq2/x;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lq2/k;

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e(Lq2/k;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string v0, "NOT_FFPROBE_SESSION"

    const-string v1, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_1
    return-void
.end method

.method public m0(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lq2/s;->z([Ljava/lang/String;Lq2/t;Lq2/o;)Lq2/s;

    move-result-object p1

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-static {p1}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public n(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "SESSION_NOT_FOUND"

    const-string v0, "Session not found."

    :goto_0
    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lq2/x;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Lr2/k;->h0(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 p2, 0x1388

    :goto_1
    check-cast p1, Lq2/s;

    invoke-static {p1, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f(Lq2/s;I)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "NOT_MEDIA_INFORMATION_SESSION"

    const-string v0, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_2
    return-void
.end method

.method public n0(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->H(J)Lq2/x;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "SESSION_NOT_FOUND"

    const-string v0, "Session not found."

    :goto_0
    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Lq2/x;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Lr2/k;->h0(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 p2, 0x1388

    :goto_1
    new-instance v0, Lr2/n;

    check-cast p1, Lq2/s;

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-direct {v0, p1, p2, v1, p3}, Lr2/n;-><init>(Lq2/s;ILr2/e;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iget-object p1, p0, Lr2/k;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "NOT_MEDIA_INFORMATION_SESSION"

    const-string v0, "A session is found but it does not have the correct type."

    goto :goto_0

    :goto_2
    return-void
.end method

.method public o(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-static {}, Lq2/g;->a()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public o0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->messagesInTransmit(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x0

    if-nez p3, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_0
    const/4 v5, 0x2

    aput-object v4, v0, v5

    const-string v4, "selectDocument completed with requestCode: %d, resultCode: %d, data: %s."

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "ffmpeg-kit-flutter"

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_2

    const/16 v0, 0x4e20

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, v2

    const-string p1, "FFmpegKitFlutterPlugin ignored unsupported activity result for requestCode: %d."

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    :goto_1
    const/4 p1, -0x1

    if-ne p2, p1, :cond_5

    if-nez p3, :cond_3

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    iget-object p2, p0, Lr2/k;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {p1, p2, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Lr2/k;->s:Lr2/e;

    iget-object p3, p0, Lr2/k;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {p2, p3, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    iget-object p3, p0, Lr2/k;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "SELECT_CANCELLED"

    invoke-virtual {p1, p3, v0, p2}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return v3
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 7

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "FFmpegKitFlutterPlugin %s attached to activity %s."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ffmpeg-kit-flutter"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lr2/k;->p:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    iget-object v0, p0, Lr2/k;->p:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Lr2/k;->f0(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Landroid/app/Activity;Lio/flutter/plugin/common/PluginRegistry$Registrar;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    iput-object p1, p0, Lr2/k;->p:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    return-void
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lr2/k;->r:Lio/flutter/plugin/common/EventChannel$EventSink;

    const-string p1, "ffmpeg-kit-flutter"

    const-string v0, "FFmpegKitFlutterPlugin stopped listening to events."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->N0()V

    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "FFmpegKitFlutterPlugin detached from activity."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lr2/k;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lr2/k;->p:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 1

    iput-object p2, p0, Lr2/k;->r:Lio/flutter/plugin/common/EventChannel$EventSink;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p0, p1, v0

    const/4 v0, 0x1

    aput-object p2, p1, v0

    const-string p2, "FFmpegKitFlutterPlugin %s started listening to events on %s."

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "ffmpeg-kit-flutter"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v5, p2

    const-string v1, "sessionId"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "waitTimeout"

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "arguments"

    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const-string v4, "ffprobeJsonOutput"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v7, "writable"

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    iget-object v8, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    const/4 v11, -0x1

    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v9, "ffprobeSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v11, 0x3f

    goto/16 :goto_0

    :sswitch_1
    const-string v9, "setLogRedirectionStrategy"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v11, 0x3e

    goto/16 :goto_0

    :sswitch_2
    const-string v9, "mediaInformationJsonParserFrom"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v11, 0x3d

    goto/16 :goto_0

    :sswitch_3
    const-string v9, "enableLogs"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v11, 0x3c

    goto/16 :goto_0

    :sswitch_4
    const-string v9, "abstractSessionGetAllLogs"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v11, 0x3b

    goto/16 :goto_0

    :sswitch_5
    const-string v9, "selectDocument"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v11, 0x3a

    goto/16 :goto_0

    :sswitch_6
    const-string v9, "setFontDirectoryList"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v11, 0x39

    goto/16 :goto_0

    :sswitch_7
    const-string v9, "mediaInformationJsonParserFromWithError"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v11, 0x38

    goto/16 :goto_0

    :sswitch_8
    const-string v9, "getMediaInformationSessions"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v11, 0x37

    goto/16 :goto_0

    :sswitch_9
    const-string v9, "messagesInTransmit"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v11, 0x36

    goto/16 :goto_0

    :sswitch_a
    const-string v9, "getExternalLibraries"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0x35

    goto/16 :goto_0

    :sswitch_b
    const-string v9, "setFontconfigConfigurationPath"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v11, 0x34

    goto/16 :goto_0

    :sswitch_c
    const-string v9, "mediaInformationSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v11, 0x33

    goto/16 :goto_0

    :sswitch_d
    const-string v9, "writeToPipe"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v11, 0x32

    goto/16 :goto_0

    :sswitch_e
    const-string v9, "setSessionHistorySize"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v11, 0x31

    goto/16 :goto_0

    :sswitch_f
    const-string v9, "disableLogs"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v11, 0x30

    goto/16 :goto_0

    :sswitch_10
    const-string v9, "getLastCompletedSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v11, 0x2f

    goto/16 :goto_0

    :sswitch_11
    const-string v9, "setEnvironmentVariable"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v11, 0x2e

    goto/16 :goto_0

    :sswitch_12
    const-string v9, "abstractSessionGetEndTime"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v11, 0x2d

    goto/16 :goto_0

    :sswitch_13
    const-string v9, "getLogRedirectionStrategy"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v11, 0x2c

    goto/16 :goto_0

    :sswitch_14
    const-string v9, "abstractSessionGetLogs"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v11, 0x2b

    goto/16 :goto_0

    :sswitch_15
    const-string v9, "ffmpegSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v11, 0x2a

    goto/16 :goto_0

    :sswitch_16
    const-string v9, "disableRedirection"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v11, 0x29

    goto/16 :goto_0

    :sswitch_17
    const-string v9, "ffprobeSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v11, 0x28

    goto/16 :goto_0

    :sswitch_18
    const-string v9, "registerNewFFmpegPipe"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v11, 0x27

    goto/16 :goto_0

    :sswitch_19
    const-string v9, "clearSessions"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v11, 0x26

    goto/16 :goto_0

    :sswitch_1a
    const-string v9, "getFFprobeSessions"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v11, 0x25

    goto/16 :goto_0

    :sswitch_1b
    const-string v9, "getPackageName"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v11, 0x24

    goto/16 :goto_0

    :sswitch_1c
    const-string v9, "closeFFmpegPipe"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v11, 0x23

    goto/16 :goto_0

    :sswitch_1d
    const-string v9, "asyncFFprobeSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v11, 0x22

    goto/16 :goto_0

    :sswitch_1e
    const-string v9, "abstractSessionGetFailStackTrace"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v11, 0x21

    goto/16 :goto_0

    :sswitch_1f
    const-string v9, "ignoreSignal"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v11, 0x20

    goto/16 :goto_0

    :sswitch_20
    const-string v9, "thereAreAsynchronousMessagesInTransmit"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v11, 0x1f

    goto/16 :goto_0

    :sswitch_21
    const-string v9, "getArch"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v11, 0x1e

    goto/16 :goto_0

    :sswitch_22
    const-string v9, "getMediaInformation"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v11, 0x1d

    goto/16 :goto_0

    :sswitch_23
    const-string v9, "getLogLevel"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v11, 0x1c

    goto/16 :goto_0

    :sswitch_24
    const-string v9, "getFFmpegSessions"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v11, 0x1b

    goto/16 :goto_0

    :sswitch_25
    const-string v9, "setLogLevel"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v11, 0x1a

    goto/16 :goto_0

    :sswitch_26
    const-string v9, "enableStatistics"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v11, 0x19

    goto/16 :goto_0

    :sswitch_27
    const-string v9, "getPlatform"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v11, 0x18

    goto/16 :goto_0

    :sswitch_28
    const-string v9, "abstractSessionGetAllLogsAsString"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v11, 0x17

    goto/16 :goto_0

    :sswitch_29
    const-string v9, "getFFmpegVersion"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_29

    goto/16 :goto_0

    :cond_29
    const/16 v11, 0x16

    goto/16 :goto_0

    :sswitch_2a
    const-string v9, "getSessions"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const/16 v11, 0x15

    goto/16 :goto_0

    :sswitch_2b
    const-string v9, "getSessionsByState"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const/16 v11, 0x14

    goto/16 :goto_0

    :sswitch_2c
    const-string v9, "cancelSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const/16 v11, 0x13

    goto/16 :goto_0

    :sswitch_2d
    const-string v9, "asyncMediaInformationSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const/16 v11, 0x12

    goto/16 :goto_0

    :sswitch_2e
    const-string v9, "enableRedirection"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const/16 v11, 0x11

    goto/16 :goto_0

    :sswitch_2f
    const-string v9, "getLastSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const/16 v11, 0x10

    goto/16 :goto_0

    :sswitch_30
    const-string v9, "getSessionHistorySize"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_30

    goto/16 :goto_0

    :cond_30
    const/16 v11, 0xf

    goto/16 :goto_0

    :sswitch_31
    const-string v9, "abstractSessionGetReturnCode"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_31

    goto/16 :goto_0

    :cond_31
    const/16 v11, 0xe

    goto/16 :goto_0

    :sswitch_32
    const-string v9, "abstractSessionGetState"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_32

    goto/16 :goto_0

    :cond_32
    const/16 v11, 0xd

    goto/16 :goto_0

    :sswitch_33
    const-string v9, "ffmpegSessionGetStatistics"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_33

    goto/16 :goto_0

    :cond_33
    const/16 v11, 0xc

    goto/16 :goto_0

    :sswitch_34
    const-string v9, "disableStatistics"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_34

    goto/16 :goto_0

    :cond_34
    const/16 v11, 0xb

    goto/16 :goto_0

    :sswitch_35
    const-string v9, "getSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_35

    goto/16 :goto_0

    :cond_35
    const/16 v11, 0xa

    goto/16 :goto_0

    :sswitch_36
    const-string v9, "cancel"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_36

    goto/16 :goto_0

    :cond_36
    const/16 v11, 0x9

    goto/16 :goto_0

    :sswitch_37
    const-string v9, "ffmpegSessionGetAllStatistics"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_37

    goto/16 :goto_0

    :cond_37
    const/16 v11, 0x8

    goto/16 :goto_0

    :sswitch_38
    const-string v9, "getBuildDate"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_38

    goto :goto_0

    :cond_38
    const/4 v11, 0x7

    goto :goto_0

    :sswitch_39
    const-string v9, "asyncFFmpegSessionExecute"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_39

    goto :goto_0

    :cond_39
    const/4 v11, 0x6

    goto :goto_0

    :sswitch_3a
    const-string v9, "abstractSessionGetDuration"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3a

    goto :goto_0

    :cond_3a
    const/4 v11, 0x5

    goto :goto_0

    :sswitch_3b
    const-string v9, "setFontDirectory"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3b

    goto :goto_0

    :cond_3b
    const/4 v11, 0x4

    goto :goto_0

    :sswitch_3c
    const-string v9, "isLTSBuild"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3c

    goto :goto_0

    :cond_3c
    const/4 v11, 0x3

    goto :goto_0

    :sswitch_3d
    const-string v9, "mediaInformationSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3d

    goto :goto_0

    :cond_3d
    const/4 v11, 0x2

    goto :goto_0

    :sswitch_3e
    const-string v9, "ffmpegSession"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3e

    goto :goto_0

    :cond_3e
    const/4 v11, 0x1

    goto :goto_0

    :sswitch_3f
    const-string v9, "getSafParameter"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3f

    goto :goto_0

    :cond_3f
    const/4 v11, 0x0

    :goto_0
    const-string v8, "Invalid ffprobe json output."

    const-string v9, "INVALID_FFPROBE_JSON_OUTPUT"

    const-string v12, "fontNameMap"

    const-string v13, "Invalid arguments array."

    const-string v14, "INVALID_ARGUMENTS"

    const-string v15, "Invalid session id."

    const-string v10, "INVALID_SESSION"

    packed-switch v11, :pswitch_data_0

    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    invoke-virtual {v0, v5}, Lr2/e;->k(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_0
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->K(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1
    const-string v1, "strategy"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_40

    invoke-virtual {v6, v0, v5}, Lr2/k;->x0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_40
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_LOG_REDIRECTION_STRATEGY"

    const-string v2, "Invalid log redirection strategy value."

    goto/16 :goto_2

    :pswitch_2
    if-eqz v4, :cond_41

    invoke-virtual {v6, v4, v5}, Lr2/k;->k0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_41
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    invoke-virtual {v0, v5, v9, v8}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {v6, v5}, Lr2/k;->B(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_4
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v2, v5}, Lr2/k;->c(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_5
    const-string v1, "title"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    const-string v1, "extraTypes"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_42

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_1

    :cond_42
    const/4 v0, 0x0

    :goto_1
    move-object v4, v0

    if-eqz v7, :cond_43

    move-object/from16 v0, p0

    move-object v1, v7

    move-object/from16 v5, p2

    invoke-virtual/range {v0 .. v5}, Lr2/k;->r0(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_43
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_WRITABLE"

    const-string v2, "Invalid writable value."

    goto :goto_2

    :pswitch_6
    const-string v1, "fontDirectoryList"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v1, :cond_44

    invoke-virtual {v6, v1, v0, v5}, Lr2/k;->u0(Ljava/util/List;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_44
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_FONT_DIRECTORY_LIST"

    const-string v2, "Invalid font directory list."

    goto :goto_2

    :pswitch_7
    if-eqz v4, :cond_41

    invoke-virtual {v6, v4, v5}, Lr2/k;->l0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_8
    invoke-virtual {v6, v5}, Lr2/k;->W(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_9
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->o0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v6, v5}, Lr2/k;->N(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_b
    const-string v1, "path"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_45

    invoke-virtual {v6, v0, v5}, Lr2/k;->v0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_45
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_PATH"

    const-string v2, "Invalid path."

    :goto_2
    invoke-virtual {v0, v5, v1, v2}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_c
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v2, v5}, Lr2/k;->n0(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_d
    const-string v1, "input"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "pipe"

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v1, :cond_46

    if-eqz v0, :cond_46

    invoke-virtual {v6, v1, v0, v5}, Lr2/k;->Q0(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_46
    if-eqz v0, :cond_47

    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_INPUT"

    const-string v2, "Invalid input value."

    goto :goto_2

    :cond_47
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_PIPE"

    const-string v2, "Invalid pipe value."

    goto :goto_2

    :pswitch_e
    const-string v1, "sessionHistorySize"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_48

    invoke-virtual {v6, v0, v5}, Lr2/k;->y0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_48
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_SIZE"

    const-string v2, "Invalid session history size value."

    goto :goto_2

    :pswitch_f
    invoke-virtual {v6, v5}, Lr2/k;->t(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v6, v5}, Lr2/k;->R(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_11
    const-string v1, "variableName"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "variableValue"

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v1, :cond_49

    if-eqz v0, :cond_49

    invoke-virtual {v6, v1, v0, v5}, Lr2/k;->s0(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_49
    if-eqz v0, :cond_4a

    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_NAME"

    const-string v2, "Invalid environment variable name."

    goto :goto_2

    :cond_4a
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_VALUE"

    const-string v2, "Invalid environment variable value."

    goto :goto_2

    :pswitch_12
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->f(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_4b
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    invoke-virtual {v0, v5, v10, v15}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v6, v5}, Lr2/k;->U(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_14
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->h(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_15
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->G(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v6, v5}, Lr2/k;->u(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_17
    if-eqz v3, :cond_51

    invoke-virtual {v6, v3, v5}, Lr2/k;->J(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v6, v5}, Lr2/k;->q0(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v6, v5}, Lr2/k;->q(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v6, v5}, Lr2/k;->Q(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {v6, v5}, Lr2/k;->X(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1c
    const-string v1, "ffmpegPipePath"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4c

    invoke-virtual {v6, v0, v5}, Lr2/k;->r(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_4c
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_PIPE_PATH"

    const-string v2, "Invalid ffmpeg pipe path."

    goto/16 :goto_2

    :pswitch_1d
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->m(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1e
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->g(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_1f
    const-string v1, "signal"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4d

    invoke-virtual {v6, v0, v5}, Lr2/k;->e0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_4d
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_SIGNAL"

    const-string v2, "Invalid signal value."

    goto/16 :goto_2

    :pswitch_20
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->k(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_21
    invoke-virtual {v6, v5}, Lr2/k;->L(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_22
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->V(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_23
    invoke-virtual {v6, v5}, Lr2/k;->T(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_24
    invoke-virtual {v6, v5}, Lr2/k;->O(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_25
    const-string v1, "level"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4e

    invoke-virtual {v6, v0, v5}, Lr2/k;->w0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_4e
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_LEVEL"

    const-string v2, "Invalid level value."

    goto/16 :goto_2

    :pswitch_26
    invoke-virtual {v6, v5}, Lr2/k;->E(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_27
    invoke-virtual {v6, v5}, Lr2/k;->Y(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_28
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v2, v5}, Lr2/k;->d(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {v6, v5}, Lr2/k;->P(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {v6, v5}, Lr2/k;->c0(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_2b
    const-string v1, "state"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_4f

    invoke-virtual {v6, v0, v5}, Lr2/k;->d0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :cond_4f
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_SESSION_STATE"

    const-string v2, "Invalid session state value."

    goto/16 :goto_2

    :pswitch_2c
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->p(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_2d
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v2, v5}, Lr2/k;->n(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_2e
    invoke-virtual {v6, v5}, Lr2/k;->C(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_2f
    invoke-virtual {v6, v5}, Lr2/k;->S(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_30
    invoke-virtual {v6, v5}, Lr2/k;->b0(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_31
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->i(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_32
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->j(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_33
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->I(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_34
    invoke-virtual {v6, v5}, Lr2/k;->w(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_35
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->a0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {v6, v5}, Lr2/k;->o(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_37
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v2, v5}, Lr2/k;->H(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_38
    invoke-virtual {v6, v5}, Lr2/k;->M(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_3

    :pswitch_39
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->l(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :pswitch_3a
    if-eqz v1, :cond_4b

    invoke-virtual {v6, v1, v5}, Lr2/k;->e(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :pswitch_3b
    const-string v1, "fontDirectory"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v1, :cond_50

    invoke-virtual {v6, v1, v0, v5}, Lr2/k;->t0(Ljava/lang/String;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :cond_50
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_FONT_DIRECTORY"

    const-string v2, "Invalid font directory."

    goto/16 :goto_2

    :pswitch_3c
    invoke-virtual {v6, v5}, Lr2/k;->g0(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :pswitch_3d
    if-eqz v3, :cond_51

    invoke-virtual {v6, v3, v5}, Lr2/k;->m0(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :pswitch_3e
    if-eqz v3, :cond_51

    invoke-virtual {v6, v3, v5}, Lr2/k;->F(Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :cond_51
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    invoke-virtual {v0, v5, v14, v13}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :pswitch_3f
    const-string v1, "uri"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "openMode"

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v1, :cond_52

    if-eqz v0, :cond_52

    invoke-virtual {v6, v1, v0, v5}, Lr2/k;->Z(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_3

    :cond_52
    iget-object v0, v6, Lr2/k;->s:Lr2/e;

    if-eqz v1, :cond_53

    const-string v1, "INVALID_OPEN_MODE"

    const-string v2, "Invalid openMode value."

    goto/16 :goto_2

    :cond_53
    const-string v1, "INVALID_URI"

    const-string v2, "Invalid uri value."

    goto/16 :goto_2

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6482d9 -> :sswitch_3f
        -0x7d5ff76f -> :sswitch_3e
        -0x7202c932 -> :sswitch_3d
        -0x6f42e773 -> :sswitch_3c
        -0x67f04264 -> :sswitch_3b
        -0x66a401aa -> :sswitch_3a
        -0x629525e0 -> :sswitch_39
        -0x541b4b7a -> :sswitch_38
        -0x52d40761 -> :sswitch_37
        -0x5185d186 -> :sswitch_36
        -0x4be241a0 -> :sswitch_35
        -0x49b3d1d5 -> :sswitch_34
        -0x49773bf8 -> :sswitch_33
        -0x48ab64f1 -> :sswitch_32
        -0x47653081 -> :sswitch_31
        -0x447e03cb -> :sswitch_30
        -0x3f8b2616 -> :sswitch_2f
        -0x3c0bbad7 -> :sswitch_2e
        -0x3bd93d9d -> :sswitch_2d
        -0x3ad17144 -> :sswitch_2c
        -0x3411fb19 -> :sswitch_2b
        -0x3065f1ed -> :sswitch_2a
        -0x17904cc3 -> :sswitch_29
        -0x177a550f -> :sswitch_28
        -0x14685a17 -> :sswitch_27
        -0x139f14fa -> :sswitch_26
        -0x1278eede -> :sswitch_25
        -0x1067f928 -> :sswitch_24
        -0xd314fea -> :sswitch_23
        -0x80b01e2 -> :sswitch_22
        -0x482c734 -> :sswitch_21
        0x256bd39 -> :sswitch_20
        0x5d1331a -> :sswitch_1f
        0x801109d -> :sswitch_1e
        0xab4da13 -> :sswitch_1d
        0xfd2f98b -> :sswitch_1c
        0x1000d6bb -> :sswitch_1b
        0x24c29597 -> :sswitch_1a
        0x27bf4e0a -> :sswitch_19
        0x2cf77550 -> :sswitch_18
        0x358d3986 -> :sswitch_17
        0x377166a4 -> :sswitch_16
        0x3de2f1a4 -> :sswitch_15
        0x3fb52771 -> :sswitch_14
        0x42d08b51 -> :sswitch_13
        0x45e19946 -> :sswitch_12
        0x487741ed -> :sswitch_11
        0x4d2630f7 -> :sswitch_10
        0x50a6a8b7 -> :sswitch_f
        0x52ad7e41 -> :sswitch_e
        0x558bef88 -> :sswitch_d
        0x569db4c7 -> :sswitch_c
        0x576a5428 -> :sswitch_b
        0x5cbb0a58 -> :sswitch_a
        0x5d58fd61 -> :sswitch_9
        0x61b634db -> :sswitch_8
        0x663388a9 -> :sswitch_7
        0x68a3b45a -> :sswitch_6
        0x6c1fae37 -> :sswitch_5
        0x6f4c29ee -> :sswitch_4
        0x70d4e5d2 -> :sswitch_3
        0x73f50439 -> :sswitch_2
        0x7514275d -> :sswitch_1
        0x793fb30f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-virtual {p0, p1}, Lr2/k;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public p(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lq2/g;->b(J)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public p0()V
    .locals 1

    new-instance v0, Lr2/f;

    invoke-direct {v0, p0}, Lr2/f;-><init>(Lr2/k;)V

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k(Lq2/i;)V

    new-instance v0, Lr2/g;

    invoke-direct {v0, p0}, Lr2/g;-><init>(Lr2/k;)V

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l(Lq2/l;)V

    new-instance v0, Lr2/i;

    invoke-direct {v0, p0}, Lr2/i;-><init>(Lr2/k;)V

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->n(Lq2/t;)V

    new-instance v0, Lr2/h;

    invoke-direct {v0, p0}, Lr2/h;-><init>(Lr2/k;)V

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->m(Lq2/o;)V

    new-instance v0, Lr2/j;

    invoke-direct {v0, p0}, Lr2/j;-><init>(Lr2/k;)V

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->p(Lq2/b0;)V

    return-void
.end method

.method public q(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->g()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public q0(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p0, Lr2/k;->n:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr2/k;->s:Lr2/e;

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->O(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "ffmpeg-kit-flutter"

    const-string v1, "Cannot registerNewFFmpegPipe. Context is null."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const-string v1, "INVALID_CONTEXT"

    const-string v2, "Context is null."

    invoke-virtual {v0, p1, v1, v2}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public r(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->h(Ljava/lang/String;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public r0(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v6, "SELECT_FAILED"

    const-string v7, "ffmpeg-kit-flutter"

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/16 v10, 0x13

    if-ge v0, v10, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    new-array v3, v9, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v8

    const-string v4, "selectDocument is not supported on API Level %d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, v1, Lr2/k;->s:Lr2/e;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    new-array v7, v9, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    invoke-static {v3, v4, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v5, v6, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v10, 0x3

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v11, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v0, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v11, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v11, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v11}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v9}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    :cond_2
    const-string v11, "*/*"

    invoke-virtual {v0, v11}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    :goto_1
    if-eqz v2, :cond_3

    const-string v11, "android.intent.extra.TITLE"

    invoke-virtual {v0, v11, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_3
    if-eqz v4, :cond_4

    const-string v11, "android.intent.extra.MIME_TYPES"

    invoke-virtual {v0, v11, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_4
    iget-object v11, v1, Lr2/k;->n:Landroid/content/Context;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x4

    if-eqz v11, :cond_9

    iget-object v11, v1, Lr2/k;->o:Landroid/app/Activity;

    if-eqz v11, :cond_7

    :try_start_0
    iput-object v5, v1, Lr2/k;->m:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    if-eqz v15, :cond_5

    const/16 v15, 0x4e20

    goto :goto_2

    :cond_5
    const/16 v15, 0x2710

    :goto_2
    invoke-virtual {v11, v0, v15}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    new-array v11, v14, [Ljava/lang/Object;

    aput-object p1, v11, v8

    aput-object v3, v11, v9

    aput-object v2, v11, v13

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-static/range {p4 .. p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    :goto_3
    aput-object v12, v11, v10

    const-string v2, "Failed to selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s!"

    invoke-static {v2, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v2, v1, Lr2/k;->s:Lr2/e;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v5, v6, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    new-array v0, v14, [Ljava/lang/Object;

    aput-object p1, v0, v8

    aput-object v3, v0, v9

    aput-object v2, v0, v13

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    invoke-static/range {p4 .. p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    :goto_4
    aput-object v12, v0, v10

    const-string v2, "Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Activity is null."

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v1, Lr2/k;->s:Lr2/e;

    const-string v2, "INVALID_ACTIVITY"

    const-string v3, "Activity is null."

    goto :goto_6

    :cond_9
    new-array v0, v14, [Ljava/lang/Object;

    aput-object p1, v0, v8

    aput-object v3, v0, v9

    aput-object v2, v0, v13

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    invoke-static/range {p4 .. p4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    :goto_5
    aput-object v12, v0, v10

    const-string v2, "Cannot selectDocument using parameters writable: %s, type: %s, title: %s and extra types: %s. Context is null."

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v1, Lr2/k;->s:Lr2/e;

    const-string v2, "INVALID_CONTEXT"

    const-string v3, "Context is null."

    :goto_6
    invoke-virtual {v0, v5, v2, v3}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    return-void
.end method

.method public s()V
    .locals 3

    iget-object v0, p0, Lr2/k;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method

.method public s0(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->P(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public t(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->s()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public t0(Ljava/lang/String;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lr2/k;->n:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->Q(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "ffmpeg-kit-flutter"

    const-string p2, "Cannot setFontDirectory. Context is null."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "INVALID_CONTEXT"

    const-string v0, "Context is null."

    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public u(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public u0(Ljava/util/List;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lr2/k;->n:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-static {v0, p1, p2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->R(Landroid/content/Context;Ljava/util/List;Ljava/util/Map;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "ffmpeg-kit-flutter"

    const-string p2, "Cannot setFontDirectoryList. Context is null."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const-string p2, "INVALID_CONTEXT"

    const-string v0, "Context is null."

    invoke-virtual {p1, p3, p2, v0}, Lr2/e;->e(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public v()V
    .locals 3

    iget-object v0, p0, Lr2/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method

.method public v0(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->S(Ljava/lang/String;)I

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public w(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lr2/k;->v()V

    iget-object v0, p0, Lr2/k;->s:Lr2/e;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public w0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lq2/m;->c(I)Lq2/m;

    move-result-object p1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->T(Lq2/m;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public x(Lq2/n;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lr2/k;->G0(Lq2/n;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "FFmpegKitLogCallbackEvent"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    iget-object v1, p0, Lr2/k;->r:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-virtual {p1, v1, v0}, Lr2/e;->l(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Object;)V

    return-void
.end method

.method public x0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lr2/k;->D0(I)Lq2/p;

    move-result-object p1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->U(Lq2/p;)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public y(Lq2/x;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lr2/k;->I0(Lq2/x;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "FFmpegKitCompleteCallbackEvent"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    iget-object v1, p0, Lr2/k;->r:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-virtual {p1, v1, v0}, Lr2/e;->l(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Object;)V

    return-void
.end method

.method public y0(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->V(I)V

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr2/e;->m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Object;)V

    return-void
.end method

.method public z(Lq2/a0;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lr2/k;->J0(Lq2/a0;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "FFmpegKitStatisticsCallbackEvent"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lr2/k;->s:Lr2/e;

    iget-object v1, p0, Lr2/k;->r:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-virtual {p1, v1, v0}, Lr2/e;->l(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/Object;)V

    return-void
.end method
