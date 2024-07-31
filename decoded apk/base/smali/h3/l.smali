.class public final Lh3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lh3/k;",
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
            "Lh3/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lh3/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/l;->a:Lfd/a;

    iput-object p2, p0, Lh3/l;->b:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;)Lh3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lh3/i;",
            ">;)",
            "Lh3/l;"
        }
    .end annotation

    new-instance v0, Lh3/l;

    invoke-direct {v0, p0, p1}, Lh3/l;-><init>(Lfd/a;Lfd/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lh3/k;
    .locals 1

    new-instance v0, Lh3/k;

    check-cast p1, Lh3/i;

    invoke-direct {v0, p0, p1}, Lh3/k;-><init>(Landroid/content/Context;Lh3/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh3/k;
    .locals 2

    iget-object v0, p0, Lh3/l;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lh3/l;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lh3/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lh3/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh3/l;->b()Lh3/k;

    move-result-object v0

    return-object v0
.end method
