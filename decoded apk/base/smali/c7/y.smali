.class public final Lc7/y;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:Lc7/a0;


# direct methods
.method public constructor <init>(Lc7/k6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p4}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p3, p0, Lc7/y;->a:Ljava/lang/String;

    iput-object p4, p0, Lc7/y;->b:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Lc7/y;->c:Ljava/lang/String;

    iput-wide p5, p0, Lc7/y;->d:J

    iput-wide p7, p0, Lc7/y;->e:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    invoke-static {p3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId"

    invoke-virtual {p2, p4, p3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    if-eqz p9, :cond_5

    invoke-virtual {p9}, Landroid/os/Bundle;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2, p9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-nez p4, :cond_2

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p4

    invoke-virtual {p4}, Lc7/v4;->B()Lc7/x4;

    move-result-object p4

    const-string p5, "Param name can\'t be null"

    invoke-virtual {p4, p5}, Lc7/x4;->a(Ljava/lang/String;)V

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lc7/k6;->G()Lc7/qc;

    move-result-object p5

    invoke-virtual {p2, p4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p5, p4, p6}, Lc7/qc;->n0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    if-nez p5, :cond_3

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p5

    invoke-virtual {p5}, Lc7/v4;->G()Lc7/x4;

    move-result-object p5

    invoke-virtual {p1}, Lc7/k6;->y()Lc7/u4;

    move-result-object p6

    invoke-virtual {p6, p4}, Lc7/u4;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p6, "Param value can\'t be null"

    invoke-virtual {p5, p6, p4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lc7/k6;->G()Lc7/qc;

    move-result-object p6

    invoke-virtual {p6, p2, p4, p5}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-instance p1, Lc7/a0;

    invoke-direct {p1, p2}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_5
    new-instance p1, Lc7/a0;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    :goto_2
    iput-object p1, p0, Lc7/y;->f:Lc7/a0;

    return-void
.end method

.method public constructor <init>(Lc7/k6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLc7/a0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p4}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p9}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lc7/y;->a:Ljava/lang/String;

    iput-object p4, p0, Lc7/y;->b:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Lc7/y;->c:Ljava/lang/String;

    iput-wide p5, p0, Lc7/y;->d:J

    iput-wide p7, p0, Lc7/y;->e:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    invoke-static {p3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p4}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId, name"

    invoke-virtual {p1, p4, p2, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iput-object p9, p0, Lc7/y;->f:Lc7/a0;

    return-void
.end method


# virtual methods
.method public final a(Lc7/k6;J)Lc7/y;
    .locals 11

    new-instance v10, Lc7/y;

    iget-object v2, p0, Lc7/y;->c:Ljava/lang/String;

    iget-object v3, p0, Lc7/y;->a:Ljava/lang/String;

    iget-object v4, p0, Lc7/y;->b:Ljava/lang/String;

    iget-wide v5, p0, Lc7/y;->d:J

    iget-object v9, p0, Lc7/y;->f:Lc7/a0;

    move-object v0, v10

    move-object v1, p1

    move-wide v7, p2

    invoke-direct/range {v0 .. v9}, Lc7/y;-><init>(Lc7/k6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLc7/a0;)V

    return-object v10
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lc7/y;->a:Ljava/lang/String;

    iget-object v1, p0, Lc7/y;->b:Ljava/lang/String;

    iget-object v2, p0, Lc7/y;->f:Lc7/a0;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Event{appId=\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', name=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\', params="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
