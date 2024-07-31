.class public final Lo3/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lo3/t0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;Lfd/a;Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/u0;->a:Lfd/a;

    iput-object p2, p0, Lo3/u0;->b:Lfd/a;

    iput-object p3, p0, Lo3/u0;->c:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;)Lo3/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lo3/u0;"
        }
    .end annotation

    new-instance v0, Lo3/u0;

    invoke-direct {v0, p0, p1, p2}, Lo3/u0;-><init>(Lfd/a;Lfd/a;Lfd/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lo3/t0;
    .locals 1

    new-instance v0, Lo3/t0;

    invoke-direct {v0, p0, p1, p2}, Lo3/t0;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lo3/t0;
    .locals 3

    iget-object v0, p0, Lo3/u0;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lo3/u0;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lo3/u0;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo3/u0;->c(Landroid/content/Context;Ljava/lang/String;I)Lo3/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo3/u0;->b()Lo3/t0;

    move-result-object v0

    return-object v0
.end method
