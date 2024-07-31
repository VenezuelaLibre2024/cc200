.class public Lw2/r;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lw2/l;

.field public final b:J

.field public final c:J

.field public final d:Z


# direct methods
.method public constructor <init>(Lw2/l;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/r;->a:Lw2/l;

    iput-wide p2, p0, Lw2/r;->b:J

    iput-wide p4, p0, Lw2/r;->c:J

    iput-boolean p6, p0, Lw2/r;->d:Z

    return-void
.end method

.method public static e(Ljava/util/Map;)Lw2/r;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lw2/r;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, Lw2/r;

    sget-object v1, Lw2/l;->l:Lw2/l;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lw2/r;-><init>(Lw2/l;JJZ)V

    return-object p0

    :cond_0
    const-string v0, "accuracy"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "distanceFilter"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "timeInterval"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "useMSLAltitude"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    sget-object v3, Lw2/l;->l:Lw2/l;

    const/4 v4, 0x1

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_4

    const/4 v5, 0x2

    if-eq v0, v5, :cond_3

    const/4 v5, 0x3

    if-eq v0, v5, :cond_2

    const/4 v5, 0x5

    if-eq v0, v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lw2/l;->m:Lw2/l;

    goto :goto_0

    :cond_2
    sget-object v3, Lw2/l;->k:Lw2/l;

    goto :goto_0

    :cond_3
    sget-object v3, Lw2/l;->j:Lw2/l;

    goto :goto_0

    :cond_4
    sget-object v3, Lw2/l;->i:Lw2/l;

    goto :goto_0

    :cond_5
    sget-object v3, Lw2/l;->h:Lw2/l;

    :cond_6
    :goto_0
    move-object v6, v3

    new-instance v0, Lw2/r;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v7, v1

    goto :goto_1

    :cond_7
    const-wide/16 v7, 0x0

    :goto_1
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    goto :goto_2

    :cond_8
    const-wide/16 v1, 0x1388

    :goto_2
    move-wide v9, v1

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    :goto_3
    move v11, v4

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, Lw2/r;-><init>(Lw2/l;JJZ)V

    return-object v0
.end method


# virtual methods
.method public a()Lw2/l;
    .locals 1

    iget-object v0, p0, Lw2/r;->a:Lw2/l;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lw2/r;->b:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lw2/r;->c:J

    return-wide v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lw2/r;->d:Z

    return v0
.end method
