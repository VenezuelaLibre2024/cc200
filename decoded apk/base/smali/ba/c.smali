.class public Lba/c;
.super Lba/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Lba/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final e:Lfa/b;


# instance fields
.field public b:I

.field public final c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lba/c$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final d:Lga/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lga/a<",
            "Lba/c$b<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfa/b;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-direct {v0, v1, v2}, Lfa/b;-><init>(D)V

    sput-object v0, Lba/c;->e:Lfa/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Lba/a;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lba/c;->b:I

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lba/c;->c:Ljava/util/Collection;

    new-instance v0, Lga/a;

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/16 v6, 0x0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lga/a;-><init>(DDDD)V

    iput-object v0, p0, Lba/c;->d:Lga/a;

    return-void
.end method

.method public static synthetic j()Lfa/b;
    .locals 1

    sget-object v0, Lba/c;->e:Lfa/b;

    return-object v0
.end method


# virtual methods
.method public b(F)Ljava/util/Set;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p1

    float-to-int v2, v0

    iget v3, v1, Lba/c;->b:I

    int-to-double v3, v3

    int-to-double v5, v2

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    div-double/2addr v3, v5

    const-wide/high16 v5, 0x4070000000000000L    # 256.0

    div-double/2addr v3, v5

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v8, v1, Lba/c;->d:Lga/a;

    monitor-enter v8

    :try_start_0
    iget-object v9, v1, Lba/c;->d:Lga/a;

    invoke-virtual {v1, v9, v0}, Lba/c;->m(Lga/a;F)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lba/c$b;

    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v9}, Lba/c$b;->a()Lea/b;

    move-result-object v10

    invoke-virtual {v1, v10, v3, v4}, Lba/c;->k(Lea/b;D)Lea/a;

    move-result-object v10

    iget-object v11, v1, Lba/c;->d:Lga/a;

    invoke-virtual {v11, v10}, Lga/a;->f(Lea/a;)Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_1

    invoke-interface {v5, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v11, Lba/g;

    invoke-static {v9}, Lba/c$b;->d(Lba/c$b;)Laa/b;

    move-result-object v12

    invoke-interface {v12}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v12

    invoke-direct {v11, v12}, Lba/g;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-interface {v5, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lba/c$b;

    invoke-interface {v6, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Double;

    invoke-virtual {v13}, Lba/c$b;->a()Lea/b;

    move-result-object v15

    move-object/from16 p1, v0

    invoke-virtual {v9}, Lba/c$b;->a()Lea/b;

    move-result-object v0

    invoke-virtual {v1, v15, v0}, Lba/c;->l(Lea/b;Lea/b;)D

    move-result-wide v15

    if-eqz v14, :cond_3

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v17

    cmpg-double v0, v17, v15

    if-gez v0, :cond_2

    :goto_2
    move-object/from16 v0, p1

    goto :goto_1

    :cond_2
    invoke-interface {v7, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lba/g;

    invoke-static {v13}, Lba/c$b;->d(Lba/c$b;)Laa/b;

    move-result-object v14

    invoke-virtual {v0, v14}, Lba/g;->d(Laa/b;)Z

    :cond_3
    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v6, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v13}, Lba/c$b;->d(Lba/c$b;)Laa/b;

    move-result-object v0

    invoke-virtual {v11, v0}, Lba/g;->a(Laa/b;)Z

    invoke-interface {v7, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    move-object/from16 p1, v0

    invoke-interface {v2, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_5
    monitor-exit v8

    return-object v5

    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lba/c;->d:Lga/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lba/c;->c:Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    iget-object v1, p0, Lba/c;->d:Lga/a;

    invoke-virtual {v1}, Lga/a;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Laa/b;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    new-instance v0, Lba/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lba/c$b;-><init>(Laa/b;Lba/c$a;)V

    iget-object p1, p0, Lba/c;->d:Lga/a;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Lba/c;->c:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lba/c;->d:Lga/a;

    invoke-virtual {v2, v0}, Lga/a;->e(Lga/a$a;)Z

    :cond_0
    monitor-exit p1

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lba/c;->b:I

    return v0
.end method

.method public i(Laa/b;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    new-instance v0, Lba/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lba/c$b;-><init>(Laa/b;Lba/c$a;)V

    iget-object p1, p0, Lba/c;->d:Lga/a;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Lba/c;->c:Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lba/c;->d:Lga/a;

    invoke-virtual {v2, v0}, Lga/a;->a(Lga/a$a;)V

    :cond_0
    monitor-exit p1

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final k(Lea/b;D)Lea/a;
    .locals 10

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p2, v0

    new-instance v9, Lea/a;

    iget-wide v0, p1, Lea/b;->a:D

    sub-double v2, v0, p2

    add-double v4, v0, p2

    iget-wide v0, p1, Lea/b;->b:D

    sub-double v6, v0, p2

    add-double p1, v0, p2

    move-object v0, v9

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v6

    move-wide v7, p1

    invoke-direct/range {v0 .. v8}, Lea/a;-><init>(DDDD)V

    return-object v9
.end method

.method public final l(Lea/b;Lea/b;)D
    .locals 6

    iget-wide v0, p1, Lea/b;->a:D

    iget-wide v2, p2, Lea/b;->a:D

    sub-double v4, v0, v2

    sub-double/2addr v0, v2

    mul-double/2addr v4, v0

    iget-wide v0, p1, Lea/b;->b:D

    iget-wide p1, p2, Lea/b;->b:D

    sub-double v2, v0, p1

    sub-double/2addr v0, p1

    mul-double/2addr v2, v0

    add-double/2addr v4, v2

    return-wide v4
.end method

.method public m(Lga/a;F)Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lga/a<",
            "Lba/c$b<",
            "TT;>;>;F)",
            "Ljava/util/Collection<",
            "Lba/c$b<",
            "TT;>;>;"
        }
    .end annotation

    iget-object p1, p0, Lba/c;->c:Ljava/util/Collection;

    return-object p1
.end method
