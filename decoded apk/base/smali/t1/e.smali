.class public Lt1/e;
.super Lt1/d;
.source ""

# interfaces
.implements Ls1/f;


# instance fields
.field public final i:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0, p1}, Lt1/d;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iput-object p1, p0, Lt1/e;->i:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public D0()J
    .locals 2

    iget-object v0, p0, Lt1/e;->i:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    return-wide v0
.end method

.method public s()I
    .locals 1

    iget-object v0, p0, Lt1/e;->i:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    return v0
.end method
