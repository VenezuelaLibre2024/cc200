.class public Lt1/b$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final h:[Lt1/a;

.field public final i:Ls1/c$a;

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Lt1/a;Ls1/c$a;)V
    .locals 6

    iget v4, p4, Ls1/c$a;->a:I

    new-instance v5, Lt1/b$a$a;

    invoke-direct {v5, p4, p3}, Lt1/b$a$a;-><init>(Ls1/c$a;[Lt1/a;)V

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object p4, p0, Lt1/b$a;->i:Ls1/c$a;

    iput-object p3, p0, Lt1/b$a;->h:[Lt1/a;

    return-void
.end method

.method public static d([Lt1/a;Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;
    .locals 2

    const/4 v0, 0x0

    aget-object v1, p0, v0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lt1/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lt1/a;

    invoke-direct {v1, p1}, Lt1/a;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    aput-object v1, p0, v0

    :cond_1
    aget-object p0, p0, v0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;
    .locals 1

    iget-object v0, p0, Lt1/b$a;->h:[Lt1/a;

    invoke-static {v0, p1}, Lt1/b$a;->d([Lt1/a;Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v0, p0, Lt1/b$a;->h:[Lt1/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()Ls1/b;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lt1/b$a;->j:Z

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-boolean v1, p0, Lt1/b$a;->j:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lt1/b$a;->close()V

    invoke-virtual {p0}, Lt1/b$a;->f()Ls1/b;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Lt1/b$a;->i:Ls1/c$a;

    invoke-virtual {p0, p1}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls1/c$a;->b(Ls1/b;)V

    return-void
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Lt1/b$a;->i:Ls1/c$a;

    invoke-virtual {p0, p1}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls1/c$a;->d(Ls1/b;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/b$a;->j:Z

    iget-object v0, p0, Lt1/b$a;->i:Ls1/c$a;

    invoke-virtual {p0, p1}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Ls1/c$a;->e(Ls1/b;II)V

    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-boolean v0, p0, Lt1/b$a;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt1/b$a;->i:Ls1/c$a;

    invoke-virtual {p0, p1}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls1/c$a;->f(Ls1/b;)V

    :cond_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt1/b$a;->j:Z

    iget-object v0, p0, Lt1/b$a;->i:Ls1/c$a;

    invoke-virtual {p0, p1}, Lt1/b$a;->a(Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Ls1/c$a;->g(Ls1/b;II)V

    return-void
.end method
