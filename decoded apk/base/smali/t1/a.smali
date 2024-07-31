.class public Lt1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/b;


# static fields
.field public static final i:[Ljava/lang/String;

.field public static final j:[Ljava/lang/String;


# instance fields
.field public final h:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, ""

    const-string v1, " OR ROLLBACK "

    const-string v2, " OR ABORT "

    const-string v3, " OR FAIL "

    const-string v4, " OR IGNORE "

    const-string v5, " OR REPLACE "

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt1/a;->i:[Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lt1/a;->j:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method


# virtual methods
.method public G(Ls1/e;)Landroid/database/Cursor;
    .locals 4

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Lt1/a$a;

    invoke-direct {v1, p0, p1}, Lt1/a$a;-><init>(Lt1/a;Ls1/e;)V

    invoke-interface {p1}, Ls1/e;->a()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lt1/a;->j:[Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public N()V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    return-void
.end method

.method public O(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public V(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    new-instance v0, Ls1/a;

    invoke-direct {v0, p1}, Ls1/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lt1/a;->G(Ls1/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public Z()V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    return-void
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    return v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o(Ls1/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 6

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Lt1/a$b;

    invoke-direct {v1, p0, p1}, Lt1/a$b;-><init>(Lt1/a;Ls1/e;)V

    invoke-interface {p1}, Ls1/e;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lt1/a;->j:[Ljava/lang/String;

    const/4 v4, 0x0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public o0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    return v0
.end method

.method public t(Ljava/lang/String;)Ls1/f;
    .locals 2

    new-instance v0, Lt1/e;

    iget-object v1, p0, Lt1/a;->h:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    invoke-direct {v0, p1}, Lt1/e;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    return-object v0
.end method
