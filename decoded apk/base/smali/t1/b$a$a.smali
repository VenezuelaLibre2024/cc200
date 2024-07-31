.class public Lt1/b$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt1/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lt1/a;Ls1/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ls1/c$a;

.field public final synthetic b:[Lt1/a;


# direct methods
.method public constructor <init>(Ls1/c$a;[Lt1/a;)V
    .locals 0

    iput-object p1, p0, Lt1/b$a$a;->a:Ls1/c$a;

    iput-object p2, p0, Lt1/b$a$a;->b:[Lt1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Lt1/b$a$a;->a:Ls1/c$a;

    iget-object v1, p0, Lt1/b$a$a;->b:[Lt1/a;

    invoke-static {v1, p1}, Lt1/b$a;->d([Lt1/a;Landroid/database/sqlite/SQLiteDatabase;)Lt1/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls1/c$a;->c(Ls1/b;)V

    return-void
.end method
