.class public final Lg3/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lg3/u;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
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
            "Lm3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/s;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lm3/e;",
            ">;",
            "Lfd/a<",
            "Ln3/s;",
            ">;",
            "Lfd/a<",
            "Ln3/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/w;->a:Lfd/a;

    iput-object p2, p0, Lg3/w;->b:Lfd/a;

    iput-object p3, p0, Lg3/w;->c:Lfd/a;

    iput-object p4, p0, Lg3/w;->d:Lfd/a;

    iput-object p5, p0, Lg3/w;->e:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lg3/w;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lm3/e;",
            ">;",
            "Lfd/a<",
            "Ln3/s;",
            ">;",
            "Lfd/a<",
            "Ln3/w;",
            ">;)",
            "Lg3/w;"
        }
    .end annotation

    new-instance v6, Lg3/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg3/w;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v6
.end method

.method public static c(Lq3/a;Lq3/a;Lm3/e;Ln3/s;Ln3/w;)Lg3/u;
    .locals 7

    new-instance v6, Lg3/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg3/u;-><init>(Lq3/a;Lq3/a;Lm3/e;Ln3/s;Ln3/w;)V

    return-object v6
.end method


# virtual methods
.method public b()Lg3/u;
    .locals 5

    iget-object v0, p0, Lg3/w;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/a;

    iget-object v1, p0, Lg3/w;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3/a;

    iget-object v2, p0, Lg3/w;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm3/e;

    iget-object v3, p0, Lg3/w;->d:Lfd/a;

    invoke-interface {v3}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln3/s;

    iget-object v4, p0, Lg3/w;->e:Lfd/a;

    invoke-interface {v4}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln3/w;

    invoke-static {v0, v1, v2, v3, v4}, Lg3/w;->c(Lq3/a;Lq3/a;Lm3/e;Ln3/s;Ln3/w;)Lg3/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg3/w;->b()Lg3/u;

    move-result-object v0

    return-object v0
.end method
