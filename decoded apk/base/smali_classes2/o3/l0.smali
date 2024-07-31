.class public final synthetic Lo3/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# instance fields
.field public final synthetic a:Lo3/m0;

.field public final synthetic b:Lg3/i;

.field public final synthetic c:Lg3/p;


# direct methods
.method public synthetic constructor <init>(Lo3/m0;Lg3/i;Lg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/l0;->a:Lo3/m0;

    iput-object p2, p0, Lo3/l0;->b:Lg3/i;

    iput-object p3, p0, Lo3/l0;->c:Lg3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo3/l0;->a:Lo3/m0;

    iget-object v1, p0, Lo3/l0;->b:Lg3/i;

    iget-object v2, p0, Lo3/l0;->c:Lg3/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lo3/m0;->r0(Lo3/m0;Lg3/i;Lg3/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
