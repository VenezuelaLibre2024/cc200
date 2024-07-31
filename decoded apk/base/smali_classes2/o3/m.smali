.class public final synthetic Lo3/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# instance fields
.field public final synthetic a:Lo3/m0;

.field public final synthetic b:Lg3/p;


# direct methods
.method public synthetic constructor <init>(Lo3/m0;Lg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/m;->a:Lo3/m0;

    iput-object p2, p0, Lo3/m;->b:Lg3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo3/m;->a:Lo3/m0;

    iget-object v1, p0, Lo3/m;->b:Lg3/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lo3/m0;->x(Lo3/m0;Lg3/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
