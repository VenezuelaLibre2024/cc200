.class public final Ll2/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll2/h;


# instance fields
.field public final a:Lo1/e;

.field public final b:Lo1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/b<",
            "Ll2/g;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lo1/k;


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/i;->a:Lo1/e;

    new-instance v0, Ll2/i$a;

    invoke-direct {v0, p0, p1}, Ll2/i$a;-><init>(Ll2/i;Lo1/e;)V

    iput-object v0, p0, Ll2/i;->b:Lo1/b;

    new-instance v0, Ll2/i$b;

    invoke-direct {v0, p0, p1}, Ll2/i$b;-><init>(Ll2/i;Lo1/e;)V

    iput-object v0, p0, Ll2/i;->c:Lo1/k;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo1/h;->f(Ljava/lang/String;I)Lo1/h;

    move-result-object v0

    iget-object v2, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v2}, Lo1/e;->b()V

    iget-object v2, p0, Ll2/i;->a:Lo1/e;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lq1/c;->b(Lo1/e;Ls1/e;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    throw v1
.end method

.method public b(Ll2/g;)V
    .locals 1

    iget-object v0, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->b()V

    iget-object v0, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, p0, Ll2/i;->b:Lo1/b;

    invoke-virtual {v0, p1}, Lo1/b;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->g()V

    throw p1
.end method

.method public c(Ljava/lang/String;)Ll2/g;
    .locals 5

    const-string v0, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo1/h;->f(Ljava/lang/String;I)Lo1/h;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lo1/h;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lo1/h;->q(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->b()V

    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lq1/c;->b(Lo1/e;Ls1/e;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "work_spec_id"

    invoke-static {p1, v1}, Lq1/b;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "system_id"

    invoke-static {p1, v3}, Lq1/b;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, Ll2/g;

    invoke-direct {v3, v1, v2}, Ll2/g;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v3

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    return-object v2

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    throw v1
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->b()V

    iget-object v0, p0, Ll2/i;->c:Lo1/k;

    invoke-virtual {v0}, Lo1/k;->a()Ls1/f;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Ls1/d;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Ls1/d;->q(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->c()V

    :try_start_0
    invoke-interface {v0}, Ls1/f;->s()I

    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->g()V

    iget-object p1, p0, Ll2/i;->c:Lo1/k;

    invoke-virtual {p1, v0}, Lo1/k;->f(Ls1/f;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Ll2/i;->a:Lo1/e;

    invoke-virtual {v1}, Lo1/e;->g()V

    iget-object v1, p0, Ll2/i;->c:Lo1/k;

    invoke-virtual {v1, v0}, Lo1/k;->f(Ls1/f;)V

    throw p1
.end method
