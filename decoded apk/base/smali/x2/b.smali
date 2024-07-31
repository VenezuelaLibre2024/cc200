.class public Lx2/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# instance fields
.field public h:Landroid/app/Activity;

.field public i:Lv2/a;

.field public j:Lx2/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, Lx2/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v2}, Lx2/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    if-nez v1, :cond_1

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lv2/c;

    invoke-direct {p0}, Lv2/c;-><init>()V

    throw p0

    :cond_1
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_2

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p0, :cond_3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v3
.end method

.method public static e([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lx2/a;
    .locals 3

    invoke-static {p1}, Lx2/b;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_0

    sget-object p1, Lx2/a;->k:Lx2/a;

    return-object p1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    if-ne v0, v2, :cond_3

    sget-object p1, Lx2/a;->h:Lx2/a;

    return-object p1

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_4

    sget-object p1, Lx2/a;->k:Lx2/a;

    return-object p1

    :cond_4
    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {p1, v0}, Lx2/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object p1, Lx2/a;->j:Lx2/a;

    return-object p1

    :cond_5
    invoke-static {p1, v0}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, Lx2/a;->k:Lx2/a;

    return-object p1

    :cond_6
    sget-object p1, Lx2/a;->j:Lx2/a;

    return-object p1
.end method

.method public final c([Ljava/lang/String;[I)Z
    .locals 1

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {p1, v0}, Lx2/b;->e([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    aget p1, p2, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lx2/b;->a(Landroid/content/Context;)Lx2/a;

    move-result-object p1

    sget-object v0, Lx2/a;->j:Lx2/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lx2/a;->k:Lx2/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public f(Landroid/app/Activity;Lx2/c;Lv2/a;)V
    .locals 4

    if-nez p1, :cond_0

    sget-object p1, Lv2/b;->h:Lv2/b;

    invoke-interface {p3, p1}, Lv2/a;->a(Lv2/b;)V

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    sget-object p1, Lx2/a;->k:Lx2/a;

    invoke-interface {p2, p1}, Lx2/c;->a(Lx2/a;)V

    return-void

    :cond_1
    invoke-static {p1}, Lx2/b;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_2

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {p1, v0}, Lx2/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1}, Lx2/b;->a(Landroid/content/Context;)Lx2/a;

    move-result-object v2

    sget-object v3, Lx2/a;->j:Lx2/a;

    if-ne v2, v3, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iput-object p3, p0, Lx2/b;->i:Lv2/a;

    iput-object p2, p0, Lx2/b;->j:Lx2/c;

    iput-object p1, p0, Lx2/b;->h:Landroid/app/Activity;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-interface {v1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    const/16 p3, 0x6d

    invoke-static {p1, p2, p3}, Lx/b;->g(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 9

    const/4 v0, 0x0

    const/16 v1, 0x6d

    if-eq p1, v1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lx2/b;->h:Landroid/app/Activity;

    const-string v1, "Geolocator"

    if-nez p1, :cond_2

    const-string p1, "Trying to process permission result without an valid Activity instance"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lx2/b;->i:Lv2/a;

    if-eqz p1, :cond_1

    sget-object p2, Lv2/b;->h:Lv2/b;

    invoke-interface {p1, p2}, Lv2/a;->a(Lv2/b;)V

    :cond_1
    return v0

    :cond_2
    :try_start_0
    invoke-static {p1}, Lx2/b;->b(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    array-length v2, p3

    if-nez v2, :cond_3

    const-string p1, "The grantResults array is empty. This can happen when the user cancels the permission request"

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_3
    sget-object v2, Lx2/a;->h:Lx2/a;

    const/4 v3, -0x1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v4, v0

    move v5, v4

    :cond_4
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {p2, v6}, Lx2/b;->e([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    if-ltz v8, :cond_5

    move v4, v7

    :cond_5
    aget v8, p3, v8

    if-nez v8, :cond_6

    move v3, v0

    :cond_6
    iget-object v8, p0, Lx2/b;->h:Landroid/app/Activity;

    invoke-static {v8, v6}, Lx/b;->j(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v5, v7

    goto :goto_0

    :cond_7
    if-nez v4, :cond_8

    const-string p1, "Location permissions not part of permissions send to onRequestPermissionsResult method."

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_8
    if-nez v3, :cond_b

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_a

    invoke-virtual {p0, p2, p3}, Lx2/b;->c([Ljava/lang/String;[I)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_1

    :cond_9
    sget-object p1, Lx2/a;->j:Lx2/a;

    goto :goto_2

    :cond_a
    :goto_1
    sget-object p1, Lx2/a;->k:Lx2/a;

    :goto_2
    move-object v2, p1

    goto :goto_3

    :cond_b
    if-nez v5, :cond_c

    sget-object v2, Lx2/a;->i:Lx2/a;

    :cond_c
    :goto_3
    iget-object p1, p0, Lx2/b;->j:Lx2/c;

    if-eqz p1, :cond_d

    invoke-interface {p1, v2}, Lx2/c;->a(Lx2/a;)V

    :cond_d
    return v7

    :catch_0
    iget-object p1, p0, Lx2/b;->i:Lv2/a;

    if-eqz p1, :cond_e

    sget-object p2, Lv2/b;->k:Lv2/b;

    invoke-interface {p1, p2}, Lv2/a;->a(Lv2/b;)V

    :cond_e
    return v0
.end method
