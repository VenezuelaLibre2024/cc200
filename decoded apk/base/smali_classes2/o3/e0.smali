.class public final synthetic Lo3/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lg3/p;


# direct methods
.method public synthetic constructor <init>(JLg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lo3/e0;->a:J

    iput-object p3, p0, Lo3/e0;->b:Lg3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lo3/e0;->a:J

    iget-object v2, p0, Lo3/e0;->b:Lg3/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lo3/m0;->I(JLg3/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
