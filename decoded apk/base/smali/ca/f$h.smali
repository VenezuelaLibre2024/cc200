.class public Lca/f$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Runnable;

.field public j:Lx6/h;

.field public k:Lfa/b;

.field public l:F

.field public final synthetic m:Lca/f;


# direct methods
.method public constructor <init>(Lca/f;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lca/f$h;->m:Lca/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lca/f$h;->h:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lca/f;Ljava/util/Set;Lca/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lca/f$h;-><init>(Lca/f;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lca/f$h;->i:Ljava/lang/Runnable;

    return-void
.end method

.method public b(F)V
    .locals 5

    iput p1, p0, Lca/f$h;->l:F

    new-instance v0, Lfa/b;

    iget-object v1, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v1}, Lca/f;->access$800(Lca/f;)F

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-double v1, p1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    const-wide/high16 v3, 0x4070000000000000L    # 256.0

    mul-double/2addr v1, v3

    invoke-direct {v0, v1, v2}, Lfa/b;-><init>(D)V

    iput-object v0, p0, Lca/f$h;->k:Lfa/b;

    return-void
.end method

.method public c(Lx6/h;)V
    .locals 0

    iput-object p1, p0, Lca/f$h;->j:Lx6/h;

    return-void
.end method

.method public run()V
    .locals 15
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v0}, Lca/f;->access$900(Lca/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lca/f;->access$1000(Lca/f;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Lca/f$h;->m:Lca/f;

    iget-object v3, p0, Lca/f$h;->h:Ljava/util/Set;

    invoke-static {v2, v3}, Lca/f;->access$1000(Lca/f;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lca/f;->shouldRender(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    iget-object v0, p0, Lca/f$h;->i:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    new-instance v0, Lca/f$f;

    iget-object v1, p0, Lca/f$h;->m:Lca/f;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lca/f$f;-><init>(Lca/f;Lca/f$a;)V

    iget v1, p0, Lca/f$h;->l:F

    iget-object v3, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v3}, Lca/f;->access$800(Lca/f;)F

    move-result v3

    cmpl-float v3, v1, v3

    const/4 v4, 0x1

    if-lez v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iget-object v5, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v5}, Lca/f;->access$800(Lca/f;)F

    move-result v5

    sub-float v5, v1, v5

    iget-object v6, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v6}, Lca/f;->access$1200(Lca/f;)Ljava/util/Set;

    move-result-object v6

    :try_start_0
    iget-object v7, p0, Lca/f$h;->j:Lx6/h;

    invoke-virtual {v7}, Lx6/h;->b()Lz6/e0;

    move-result-object v7

    iget-object v7, v7, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v7

    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->I()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v9, 0x0

    invoke-direct {v8, v9, v10, v9, v10}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v7, v8}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v7

    :goto_2
    iget-object v8, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v8}, Lca/f;->access$900(Lca/f;)Ljava/util/Set;

    move-result-object v8

    if-eqz v8, :cond_3

    iget-object v8, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v8}, Lca/f;->access$1300(Lca/f;)Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v9}, Lca/f;->access$900(Lca/f;)Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Laa/a;

    iget-object v11, p0, Lca/f$h;->m:Lca/f;

    invoke-virtual {v11, v10}, Lca/f;->shouldRenderAsCluster(Laa/a;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/google/android/gms/maps/model/LatLngBounds;->J(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v11

    if-eqz v11, :cond_2

    iget-object v11, p0, Lca/f$h;->k:Lfa/b;

    invoke-interface {v10}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v11, v10}, Lfa/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Lfa/a;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    move-object v8, v2

    :cond_4
    new-instance v9, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v9}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    iget-object v10, p0, Lca/f$h;->h:Ljava/util/Set;

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Laa/a;

    invoke-interface {v11}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    invoke-virtual {v7, v12}, Lcom/google/android/gms/maps/model/LatLngBounds;->J(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v12

    if-eqz v3, :cond_6

    if-eqz v12, :cond_6

    iget-object v13, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v13}, Lca/f;->access$1300(Lca/f;)Z

    move-result v13

    if-eqz v13, :cond_6

    iget-object v12, p0, Lca/f$h;->k:Lfa/b;

    invoke-interface {v11}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v13

    invoke-virtual {v12, v13}, Lfa/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Lfa/a;

    move-result-object v12

    iget-object v13, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v13, v8, v12}, Lca/f;->access$1400(Lca/f;Ljava/util/List;Lea/b;)Lea/b;

    move-result-object v12

    if-eqz v12, :cond_5

    iget-object v13, p0, Lca/f$h;->k:Lfa/b;

    invoke-virtual {v13, v12}, Lfa/b;->a(Lea/b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    new-instance v13, Lca/f$d;

    iget-object v14, p0, Lca/f$h;->m:Lca/f;

    invoke-direct {v13, v14, v11, v9, v12}, Lca/f$d;-><init>(Lca/f;Laa/a;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v4, v13}, Lca/f$f;->a(ZLca/f$d;)V

    goto :goto_4

    :cond_5
    new-instance v12, Lca/f$d;

    iget-object v13, p0, Lca/f$h;->m:Lca/f;

    invoke-direct {v12, v13, v11, v9, v2}, Lca/f$d;-><init>(Lca/f;Laa/a;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v4, v12}, Lca/f$f;->a(ZLca/f$d;)V

    goto :goto_4

    :cond_6
    new-instance v13, Lca/f$d;

    iget-object v14, p0, Lca/f$h;->m:Lca/f;

    invoke-direct {v13, v14, v11, v9, v2}, Lca/f$d;-><init>(Lca/f;Laa/a;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v12, v13}, Lca/f$f;->a(ZLca/f$d;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lca/f$f;->h()V

    invoke-interface {v6, v9}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    iget-object v8, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v8}, Lca/f;->access$1300(Lca/f;)Z

    move-result v8

    if-eqz v8, :cond_9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, p0, Lca/f$h;->h:Ljava/util/Set;

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Laa/a;

    iget-object v11, p0, Lca/f$h;->m:Lca/f;

    invoke-virtual {v11, v10}, Lca/f;->shouldRenderAsCluster(Laa/a;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/google/android/gms/maps/model/LatLngBounds;->J(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v11, p0, Lca/f$h;->k:Lfa/b;

    invoke-interface {v10}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v11, v10}, Lfa/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Lfa/a;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lca/f$g;

    invoke-static {v8}, Lca/f$g;->a(Lca/f$g;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-virtual {v7, v10}, Lcom/google/android/gms/maps/model/LatLngBounds;->J(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v10

    if-nez v3, :cond_b

    const/high16 v11, -0x3fc00000    # -3.0f

    cmpl-float v11, v5, v11

    if-lez v11, :cond_b

    if-eqz v10, :cond_b

    iget-object v11, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v11}, Lca/f;->access$1300(Lca/f;)Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v10, p0, Lca/f$h;->k:Lfa/b;

    invoke-static {v8}, Lca/f$g;->a(Lca/f$g;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v10, v11}, Lfa/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Lfa/a;

    move-result-object v10

    iget-object v11, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v11, v2, v10}, Lca/f;->access$1400(Lca/f;Ljava/util/List;Lea/b;)Lea/b;

    move-result-object v10

    if-eqz v10, :cond_a

    iget-object v11, p0, Lca/f$h;->k:Lfa/b;

    invoke-virtual {v11, v10}, Lfa/b;->a(Lea/b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v10

    invoke-static {v8}, Lca/f$g;->a(Lca/f$g;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v11

    invoke-virtual {v0, v8, v11, v10}, Lca/f$f;->c(Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_6

    :cond_a
    invoke-static {v8}, Lca/f$g;->c(Lca/f$g;)Lz6/m;

    move-result-object v8

    invoke-virtual {v0, v4, v8}, Lca/f$f;->f(ZLz6/m;)V

    goto :goto_6

    :cond_b
    invoke-static {v8}, Lca/f$g;->c(Lca/f$g;)Lz6/m;

    move-result-object v8

    invoke-virtual {v0, v10, v8}, Lca/f$f;->f(ZLz6/m;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v0}, Lca/f$f;->h()V

    iget-object v0, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v0, v9}, Lca/f;->access$1202(Lca/f;Ljava/util/Set;)Ljava/util/Set;

    iget-object v0, p0, Lca/f$h;->m:Lca/f;

    iget-object v2, p0, Lca/f$h;->h:Ljava/util/Set;

    invoke-static {v0, v2}, Lca/f;->access$902(Lca/f;Ljava/util/Set;)Ljava/util/Set;

    iget-object v0, p0, Lca/f$h;->m:Lca/f;

    invoke-static {v0, v1}, Lca/f;->access$802(Lca/f;F)F

    goto/16 :goto_0
.end method
