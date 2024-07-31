.class public Ll2/r$a;
.super Lo1/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll2/r;-><init>(Lo1/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/b<",
        "Ll2/p;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ll2/r;


# direct methods
.method public constructor <init>(Ll2/r;Lo1/e;)V
    .locals 0

    iput-object p1, p0, Ll2/r$a;->d:Ll2/r;

    invoke-direct {p0, p2}, Lo1/b;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Ls1/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ll2/p;

    invoke-virtual {p0, p1, p2}, Ll2/r$a;->i(Ls1/f;Ll2/p;)V

    return-void
.end method

.method public i(Ls1/f;Ll2/p;)V
    .locals 10

    iget-object v0, p2, Ll2/p;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_0
    iget-object v0, p2, Ll2/p;->b:Lc2/s$a;

    invoke-static {v0}, Ll2/v;->j(Lc2/s$a;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ls1/d;->M(IJ)V

    iget-object v0, p2, Ll2/p;->c:Ljava/lang/String;

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_1
    iget-object v0, p2, Ll2/p;->d:Ljava/lang/String;

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p2, Ll2/p;->e:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->n(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Ls1/d;->Q(I[B)V

    :goto_3
    iget-object v0, p2, Ll2/p;->f:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->n(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Ls1/d;->Q(I[B)V

    :goto_4
    const/4 v0, 0x7

    iget-wide v1, p2, Ll2/p;->g:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, Ll2/p;->h:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, Ll2/p;->i:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0xa

    iget v1, p2, Ll2/p;->k:I

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    iget-object v0, p2, Ll2/p;->l:Lc2/a;

    invoke-static {v0}, Ll2/v;->a(Lc2/a;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ls1/d;->M(IJ)V

    const/16 v0, 0xc

    iget-wide v1, p2, Ll2/p;->m:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0xd

    iget-wide v1, p2, Ll2/p;->n:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0xe

    iget-wide v1, p2, Ll2/p;->o:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    const/16 v0, 0xf

    iget-wide v1, p2, Ll2/p;->p:J

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    iget-boolean v0, p2, Ll2/p;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ls1/d;->M(IJ)V

    iget-object v0, p2, Ll2/p;->r:Lc2/n;

    invoke-static {v0}, Ll2/v;->i(Lc2/n;)I

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ls1/d;->M(IJ)V

    iget-object p2, p2, Ll2/p;->j:Lc2/b;

    const/16 v0, 0x18

    const/16 v1, 0x17

    const/16 v2, 0x16

    const/16 v3, 0x15

    const/16 v4, 0x14

    const/16 v5, 0x13

    const/16 v6, 0x12

    const/16 v7, 0x19

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lc2/b;->b()Lc2/k;

    move-result-object v8

    invoke-static {v8}, Ll2/v;->h(Lc2/k;)I

    move-result v8

    int-to-long v8, v8

    invoke-interface {p1, v6, v8, v9}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->g()Z

    move-result v6

    int-to-long v8, v6

    invoke-interface {p1, v5, v8, v9}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->h()Z

    move-result v5

    int-to-long v5, v5

    invoke-interface {p1, v4, v5, v6}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->f()Z

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->i()Z

    move-result v3

    int-to-long v3, v3

    invoke-interface {p1, v2, v3, v4}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->c()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ls1/d;->M(IJ)V

    invoke-virtual {p2}, Lc2/b;->a()Lc2/c;

    move-result-object p2

    invoke-static {p2}, Ll2/v;->c(Lc2/c;)[B

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {p1, v7, p2}, Ls1/d;->Q(I[B)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v6}, Ls1/d;->j0(I)V

    invoke-interface {p1, v5}, Ls1/d;->j0(I)V

    invoke-interface {p1, v4}, Ls1/d;->j0(I)V

    invoke-interface {p1, v3}, Ls1/d;->j0(I)V

    invoke-interface {p1, v2}, Ls1/d;->j0(I)V

    invoke-interface {p1, v1}, Ls1/d;->j0(I)V

    invoke-interface {p1, v0}, Ls1/d;->j0(I)V

    :goto_5
    invoke-interface {p1, v7}, Ls1/d;->j0(I)V

    :goto_6
    return-void
.end method
