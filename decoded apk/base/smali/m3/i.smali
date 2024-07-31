.class public final Lm3/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Ln3/y;",
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
            "Lo3/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/g;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/g;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/i;->a:Lfd/a;

    iput-object p2, p0, Lm3/i;->b:Lfd/a;

    iput-object p3, p0, Lm3/i;->c:Lfd/a;

    iput-object p4, p0, Lm3/i;->d:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lm3/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/g;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;)",
            "Lm3/i;"
        }
    .end annotation

    new-instance v0, Lm3/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lm3/i;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lo3/d;Ln3/g;Lq3/a;)Ln3/y;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm3/h;->a(Landroid/content/Context;Lo3/d;Ln3/g;Lq3/a;)Ln3/y;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Li3/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/y;

    return-object p0
.end method


# virtual methods
.method public b()Ln3/y;
    .locals 4

    iget-object v0, p0, Lm3/i;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm3/i;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo3/d;

    iget-object v2, p0, Lm3/i;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/g;

    iget-object v3, p0, Lm3/i;->d:Lfd/a;

    invoke-interface {v3}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq3/a;

    invoke-static {v0, v1, v2, v3}, Lm3/i;->c(Landroid/content/Context;Lo3/d;Ln3/g;Lq3/a;)Ln3/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm3/i;->b()Ln3/y;

    move-result-object v0

    return-object v0
.end method
