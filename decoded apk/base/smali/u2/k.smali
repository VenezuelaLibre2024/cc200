.class public Lu2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public final h:Lx2/b;

.field public final i:Lw2/k;

.field public final j:Lw2/m;

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw2/o;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroid/content/Context;

.field public m:Landroid/app/Activity;

.field public n:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Lx2/b;Lw2/k;Lw2/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/k;->h:Lx2/b;

    iput-object p2, p0, Lu2/k;->i:Lw2/k;

    iput-object p3, p0, Lu2/k;->j:Lw2/m;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lu2/k;->k:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu2/k;->k([ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/k;->i(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/k;->o(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/k;->l(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugin/common/MethodChannel$Result;Lx2/a;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/k;->n(Lio/flutter/plugin/common/MethodChannel$Result;Lx2/a;)V

    return-void
.end method

.method public static synthetic f(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu2/k;->j([ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/k;->m(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 2

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic j([ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V
    .locals 2

    const/4 v0, 0x0

    aget-boolean v1, p1, v0

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    iget-object p1, p0, Lu2/k;->i:Lw2/k;

    invoke-virtual {p1, p2}, Lw2/k;->f(Lw2/o;)V

    iget-object p1, p0, Lu2/k;->k:Ljava/util/Map;

    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lw2/q;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p4, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic k([ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 2

    const/4 v0, 0x0

    aget-boolean v1, p1, v0

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    iget-object p1, p0, Lu2/k;->i:Lw2/k;

    invoke-virtual {p1, p2}, Lw2/k;->f(Lw2/o;)V

    iget-object p1, p0, Lu2/k;->k:Ljava/util/Map;

    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p5}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p4, p1, p2, p3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/location/Location;)V
    .locals 0

    invoke-static {p1}, Lw2/q;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 2

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lio/flutter/plugin/common/MethodChannel$Result;Lx2/a;)V
    .locals 0

    invoke-virtual {p1}, Lx2/a;->c()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lio/flutter/plugin/common/MethodChannel$Result;Lv2/b;)V
    .locals 2

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final h(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lu2/k;->j:Lw2/m;

    new-instance v1, Lu2/d;

    invoke-direct {v1, p1}, Lu2/d;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, p2, v1}, Lw2/m;->a(Landroid/content/Context;Lv2/a;)Lw2/n;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "cancelGetCurrentPosition"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "getLocationAccuracy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "requestPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "checkPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "isLocationServiceEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "openAppSettings"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "openLocationSettings"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "getLastKnownPosition"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_8
    const-string v1, "getCurrentPosition"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu2/k;->p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_1
    iget-object p1, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-virtual {p0, p2, p1}, Lu2/k;->h(Lio/flutter/plugin/common/MethodChannel$Result;Landroid/content/Context;)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0, p2}, Lu2/k;->u(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0, p2}, Lu2/k;->q(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0, p2}, Lu2/k;->t(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_5
    iget-object p1, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-static {p1}, Ly2/a;->a(Landroid/content/Context;)Z

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    iget-object p1, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-static {p1}, Ly2/a;->b(Landroid/content/Context;)Z

    move-result p1

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, p2}, Lu2/k;->s(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2}, Lu2/k;->r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x68b9fc74 -> :sswitch_8
        -0x44f2ea20 -> :sswitch_7
        -0x30f92e9e -> :sswitch_6
        0x14b278ba -> :sswitch_5
        0x1538bfab -> :sswitch_4
        0x28e6dcf7 -> :sswitch_3
        0x2c7fedbe -> :sswitch_2
        0x34469f44 -> :sswitch_1
        0x69c703a6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "requestId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lu2/k;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lw2/o;->f()V

    :cond_0
    iget-object v0, p0, Lu2/k;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final q(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lu2/k;->h:Lx2/b;

    iget-object v1, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx2/b;->a(Landroid/content/Context;)Lx2/a;

    move-result-object v0

    invoke-virtual {v0}, Lx2/a;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lv2/b;->k:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lv2/b;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v1, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 12

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lu2/k;->h:Lx2/b;

    iget-object v2, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lx2/b;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Lv2/b;->l:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "forceLocationManager"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    invoke-static {p1}, Lw2/r;->e(Ljava/util/Map;)Lw2/r;

    move-result-object v1

    const-string v3, "requestId"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v3, 0x1

    new-array v9, v3, [Z

    aput-boolean v2, v9, v2

    iget-object v2, p0, Lu2/k;->i:Lw2/k;

    iget-object v3, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-virtual {v2, v3, v0, v1}, Lw2/k;->a(Landroid/content/Context;ZLw2/r;)Lw2/o;

    move-result-object v0

    iget-object v1, p0, Lu2/k;->k:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lu2/k;->i:Lw2/k;

    iget-object v2, p0, Lu2/k;->m:Landroid/app/Activity;

    new-instance v10, Lu2/i;

    move-object v3, v10

    move-object v4, p0

    move-object v5, v9

    move-object v6, v0

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lu2/i;-><init>(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v11, Lu2/g;

    move-object v3, v11

    invoke-direct/range {v3 .. v8}, Lu2/g;-><init>(Lu2/k;[ZLw2/o;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v1, v0, v2, v10, v11}, Lw2/k;->e(Lw2/o;Landroid/app/Activity;Lw2/w;Lv2/a;)V

    return-void

    :catch_0
    sget-object p1, Lv2/b;->k:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lu2/k;->h:Lx2/b;

    iget-object v2, p0, Lu2/k;->l:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lx2/b;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Lv2/b;->l:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    const-string v0, "forceLocationManager"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, Lu2/k;->i:Lw2/k;

    iget-object v1, p0, Lu2/k;->l:Landroid/content/Context;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    new-instance v2, Lu2/h;

    invoke-direct {v2, p2}, Lu2/h;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v3, Lu2/f;

    invoke-direct {v3, p2}, Lu2/f;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lw2/k;->b(Landroid/content/Context;ZLw2/w;Lv2/a;)V

    return-void

    :catch_0
    sget-object p1, Lv2/b;->k:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final t(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p0, Lu2/k;->i:Lw2/k;

    iget-object v1, p0, Lu2/k;->l:Landroid/content/Context;

    new-instance v2, Lw2/c;

    invoke-direct {v2, p1}, Lw2/c;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1, v2}, Lw2/k;->d(Landroid/content/Context;Lw2/s;)V

    return-void
.end method

.method public final u(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu2/k;->h:Lx2/b;

    iget-object v1, p0, Lu2/k;->m:Landroid/app/Activity;

    new-instance v2, Lu2/j;

    invoke-direct {v2, p1}, Lu2/j;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    new-instance v3, Lu2/e;

    invoke-direct {v3, p1}, Lu2/e;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1, v2, v3}, Lx2/b;->f(Landroid/app/Activity;Lx2/c;Lv2/a;)V
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lv2/b;->k:Lv2/b;

    invoke-virtual {v0}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lv2/b;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v1, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public v(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lu2/k;->m:Landroid/app/Activity;

    return-void
.end method

.method public w(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    iget-object v0, p0, Lu2/k;->n:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Setting a method call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lu2/k;->x()V

    :cond_0
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "flutter.baseflow.com/geolocator_android"

    invoke-direct {v0, p2, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lu2/k;->n:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object p1, p0, Lu2/k;->l:Landroid/content/Context;

    return-void
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Lu2/k;->n:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v1, p0, Lu2/k;->n:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method
