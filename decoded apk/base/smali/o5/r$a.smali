.class public final Lo5/r$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lo5/j$a;

.field public c:Lo5/m0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lo5/s$b;

    invoke-direct {v0}, Lo5/s$b;-><init>()V

    invoke-direct {p0, p1, v0}, Lo5/r$a;-><init>(Landroid/content/Context;Lo5/j$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo5/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lo5/r$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lo5/r$a;->b:Lo5/j$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lo5/j;
    .locals 1

    invoke-virtual {p0}, Lo5/r$a;->b()Lo5/r;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo5/r;
    .locals 3

    new-instance v0, Lo5/r;

    iget-object v1, p0, Lo5/r$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lo5/r$a;->b:Lo5/j$a;

    invoke-interface {v2}, Lo5/j$a;->a()Lo5/j;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo5/r;-><init>(Landroid/content/Context;Lo5/j;)V

    iget-object v1, p0, Lo5/r$a;->c:Lo5/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lo5/r;->g(Lo5/m0;)V

    :cond_0
    return-object v0
.end method
