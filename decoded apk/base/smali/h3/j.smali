.class public final Lh3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lh3/i;",
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
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
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
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/j;->a:Lfd/a;

    iput-object p2, p0, Lh3/j;->b:Lfd/a;

    iput-object p3, p0, Lh3/j;->c:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;)Lh3/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;)",
            "Lh3/j;"
        }
    .end annotation

    new-instance v0, Lh3/j;

    invoke-direct {v0, p0, p1, p2}, Lh3/j;-><init>(Lfd/a;Lfd/a;Lfd/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lq3/a;Lq3/a;)Lh3/i;
    .locals 1

    new-instance v0, Lh3/i;

    invoke-direct {v0, p0, p1, p2}, Lh3/i;-><init>(Landroid/content/Context;Lq3/a;Lq3/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh3/i;
    .locals 3

    iget-object v0, p0, Lh3/j;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lh3/j;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3/a;

    iget-object v2, p0, Lh3/j;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq3/a;

    invoke-static {v0, v1, v2}, Lh3/j;->c(Landroid/content/Context;Lq3/a;Lq3/a;)Lh3/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh3/j;->b()Lh3/i;

    move-result-object v0

    return-object v0
.end method
