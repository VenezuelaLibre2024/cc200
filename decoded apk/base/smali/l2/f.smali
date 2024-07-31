.class public final Ll2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll2/e;


# instance fields
.field public final a:Lo1/e;

.field public final b:Lo1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/b<",
            "Ll2/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/f;->a:Lo1/e;

    new-instance v0, Ll2/f$a;

    invoke-direct {v0, p0, p1}, Ll2/f$a;-><init>(Ll2/f;Lo1/e;)V

    iput-object v0, p0, Ll2/f;->b:Lo1/b;

    return-void
.end method


# virtual methods
.method public a(Ll2/d;)V
    .locals 1

    iget-object v0, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->b()V

    iget-object v0, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, p0, Ll2/f;->b:Lo1/b;

    invoke-virtual {v0, p1}, Lo1/b;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {v0}, Lo1/e;->g()V

    throw p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo1/h;->f(Ljava/lang/String;I)Lo1/h;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lo1/h;->j0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lo1/h;->q(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Ll2/f;->a:Lo1/e;

    invoke-virtual {p1}, Lo1/e;->b()V

    iget-object p1, p0, Ll2/f;->a:Lo1/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lq1/c;->b(Lo1/e;Ls1/e;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    return-object v2

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lo1/h;->n()V

    throw v1
.end method
