.class public final synthetic Lo3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# instance fields
.field public final synthetic a:Lo3/m0;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lg3/p;


# direct methods
.method public synthetic constructor <init>(Lo3/m0;Ljava/util/List;Lg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/q;->a:Lo3/m0;

    iput-object p2, p0, Lo3/q;->b:Ljava/util/List;

    iput-object p3, p0, Lo3/q;->c:Lg3/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo3/q;->a:Lo3/m0;

    iget-object v1, p0, Lo3/q;->b:Ljava/util/List;

    iget-object v2, p0, Lo3/q;->c:Lg3/p;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lo3/m0;->h0(Lo3/m0;Ljava/util/List;Lg3/p;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method