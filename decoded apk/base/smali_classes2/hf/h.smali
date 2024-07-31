.class public final Lhf/h;
.super Lhf/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/h$a;
    }
.end annotation


# static fields
.field public static final l:Lhf/h$a;

.field public static final m:Landroid/media/SoundPool;

.field public static final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lhf/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lhf/h;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:F

.field public e:F

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Integer;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhf/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhf/h$a;-><init>(Ltd/g;)V

    sput-object v0, Lhf/h;->l:Lhf/h$a;

    invoke-static {v0}, Lhf/h$a;->a(Lhf/h$a;)Landroid/media/SoundPool;

    move-result-object v0

    sput-object v0, Lhf/h;->m:Landroid/media/SoundPool;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lhf/h;->n:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lhf/h;->o:Ljava/util/Map;

    sget-object v1, Lhf/g;->a:Lhf/g;

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "playerId"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lhf/c;-><init>()V

    iput-object p1, p0, Lhf/h;->b:Ljava/lang/String;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lhf/h;->d:F

    iput p1, p0, Lhf/h;->e:F

    return-void
.end method

.method public static synthetic r(Landroid/media/SoundPool;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lhf/h;->s(Landroid/media/SoundPool;II)V

    return-void
.end method

.method public static final s(Landroid/media/SoundPool;II)V
    .locals 3

    sget-object p0, Ld;->a:Ld;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Loaded "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ld;->b(Ljava/lang/String;)V

    sget-object p0, Lhf/h;->n:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhf/h;

    if-eqz p1, :cond_3

    iget-object p2, p1, Lhf/h;->f:Ljava/lang/Integer;

    invoke-interface {p0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lhf/h;->o:Ljava/util/Map;

    const-string p2, "urlToPlayers"

    invoke-static {p0, p2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object p1, p1, Lhf/h;->c:Ljava/lang/String;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Lhd/n;->e()Ljava/util/List;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhf/h;

    sget-object v0, Ld;->a:Ld;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Marking "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " as loaded"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld;->b(Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-boolean v1, p2, Lhf/h;->k:Z

    iget-boolean v1, p2, Lhf/h;->h:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Delayed start of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld;->b(Ljava/lang/String;)V

    invoke-virtual {p2}, Lhf/h;->z()V

    goto :goto_0

    :cond_2
    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LOW_LATENCY mode does not support: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public a(ZZZ)V
    .locals 0

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lhf/h;->v()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public bridge synthetic c()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lhf/h;->w()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhf/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 2

    iget-boolean v0, p0, Lhf/h;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->pause(I)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhf/h;->h:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhf/h;->i:Z

    return-void
.end method

.method public h()V
    .locals 1

    iget-boolean v0, p0, Lhf/h;->k:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lhf/h;->z()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhf/h;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhf/h;->i:Z

    return-void
.end method

.method public i()V
    .locals 5

    invoke-virtual {p0}, Lhf/h;->q()V

    iget-object v0, p0, Lhf/h;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lhf/h;->c:Ljava/lang/String;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v2, Lhf/h;->o:Ljava/util/Map;

    const-string v3, "urlToPlayers"

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v2

    :try_start_0
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    monitor-exit v2

    return-void

    :cond_1
    :try_start_1
    invoke-static {v3}, Lhd/v;->E(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_2

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->unload(I)Z

    sget-object v1, Lhf/h;->n:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lhf/h;->f:Ljava/lang/Integer;

    sget-object v1, Ld;->a:Ld;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unloaded soundId "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ld;->b(Ljava/lang/String;)V

    sget-object v0, Lgd/s;->a:Lgd/s;

    goto :goto_0

    :cond_2
    invoke-interface {v3, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_3
    return-void
.end method

.method public j(I)V
    .locals 0

    const-string p1, "seek"

    invoke-virtual {p0, p1}, Lhf/h;->A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public k(Landroid/media/MediaDataSource;)V
    .locals 0

    const-string p1, "setDataSource"

    invoke-virtual {p0, p1}, Lhf/h;->A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    const-string v0, "playingRoute"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "setPlayingRoute"

    invoke-virtual {p0, p1}, Lhf/h;->A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public m(D)V
    .locals 1

    double-to-float p1, p1

    iput p1, p0, Lhf/h;->e:F

    iget-object p1, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object p2, Lhf/h;->m:Landroid/media/SoundPool;

    iget v0, p0, Lhf/h;->e:F

    invoke-virtual {p2, p1, v0}, Landroid/media/SoundPool;->setRate(IF)V

    :cond_0
    return-void
.end method

.method public n(Lhf/d;)V
    .locals 2

    const-string v0, "releaseMode"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhf/d;->i:Lhf/d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lhf/h;->j:Z

    iget-boolean p1, p0, Lhf/h;->h:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {p0}, Lhf/h;->y()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/media/SoundPool;->setLoop(II)V

    :cond_1
    return-void
.end method

.method public o(Ljava/lang/String;Z)V
    .locals 7

    const-string v0, "url"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/h;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhf/h;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lhf/h;->i()V

    :cond_1
    sget-object v0, Lhf/h;->o:Ljava/util/Map;

    const-string v1, "urlToPlayers"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lhf/h;->c:Ljava/lang/String;

    const-string v1, "urlToPlayers"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Lhd/v;->s(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhf/h;

    if-eqz v2, :cond_3

    iget-boolean p2, v2, Lhf/h;->k:Z

    iput-boolean p2, p0, Lhf/h;->k:Z

    iget-object p2, v2, Lhf/h;->f:Ljava/lang/Integer;

    iput-object p2, p0, Lhf/h;->f:Ljava/lang/Integer;

    sget-object p2, Ld;->a:Ld;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reusing soundId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lhf/h;->f:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is loading="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lhf/h;->k:Z

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Ld;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x1

    iput-boolean v4, p0, Lhf/h;->k:Z

    sget-object v5, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {p0, p1, p2}, Lhf/h;->u(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v5, p2, v4}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lhf/h;->f:Ljava/lang/Integer;

    sget-object p2, Lhf/h;->n:Ljava/util/Map;

    const-string v4, "soundIdToPlayer"

    invoke-static {p2, v4}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lhf/h;->f:Ljava/lang/Integer;

    invoke-interface {p2, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Ld;->a:Ld;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "time to call load() for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v2

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " player="

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :goto_1
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public p(D)V
    .locals 1

    double-to-float p1, p1

    iput p1, p0, Lhf/h;->d:F

    iget-boolean p1, p0, Lhf/h;->h:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object p2, Lhf/h;->m:Landroid/media/SoundPool;

    iget v0, p0, Lhf/h;->d:F

    invoke-virtual {p2, p1, v0, v0}, Landroid/media/SoundPool;->setVolume(IFF)V

    :cond_0
    return-void
.end method

.method public q()V
    .locals 3

    iget-boolean v0, p0, Lhf/h;->h:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v2, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {v2, v0}, Landroid/media/SoundPool;->stop(I)V

    :cond_0
    iput-boolean v1, p0, Lhf/h;->h:Z

    :cond_1
    iput-boolean v1, p0, Lhf/h;->i:Z

    return-void
.end method

.method public final t(Ljava/net/URL;)[B
    .locals 6

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p1

    const/16 v1, 0x1000

    :try_start_0
    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    move v3, v4

    :goto_1
    const/4 v5, 0x0

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    move-object v2, v5

    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_2
    sget-object v1, Lgd/s;->a:Lgd/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v5}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const-string v0, "outputStream.toByteArray()"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p1, v0}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final u(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    const-string p2, "file://"

    invoke-static {p1, p2}, Lae/o;->X(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lhf/h;->x(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public v()Ljava/lang/Void;
    .locals 1

    const-string v0, "getDuration"

    invoke-virtual {p0, v0}, Lhf/h;->A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public w()Ljava/lang/Void;
    .locals 1

    const-string v0, "getDuration"

    invoke-virtual {p0, v0}, Lhf/h;->A(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public final x(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    const-string v0, "create(url).toURL()"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lhf/h;->t(Ljava/net/URL;)[B

    move-result-object p1

    const-string v0, "sound"

    const-string v1, ""

    invoke-static {v0, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_0
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string p1, "tempFile"

    invoke-static {v0, p1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Lqd/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final y()I
    .locals 1

    iget-boolean v0, p0, Lhf/h;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z()V
    .locals 8

    iget v0, p0, Lhf/h;->e:F

    float-to-double v0, v0

    invoke-virtual {p0, v0, v1}, Lhf/h;->m(D)V

    iget-boolean v0, p0, Lhf/h;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhf/h;->g:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Lhf/h;->m:Landroid/media/SoundPool;

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->resume(I)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lhf/h;->i:Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhf/h;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget-object v1, Lhf/h;->m:Landroid/media/SoundPool;

    iget v4, p0, Lhf/h;->d:F

    const/4 v5, 0x0

    invoke-virtual {p0}, Lhf/h;->y()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    move v3, v4

    invoke-virtual/range {v1 .. v7}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lhf/h;->g:Ljava/lang/Integer;

    :cond_2
    :goto_0
    return-void
.end method
