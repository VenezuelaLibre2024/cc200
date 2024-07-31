.class public final Lm3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lm3/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lh3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/y;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lo3/d;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lp3/b;",
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
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lh3/e;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/d;->a:Lfd/a;

    iput-object p2, p0, Lm3/d;->b:Lfd/a;

    iput-object p3, p0, Lm3/d;->c:Lfd/a;

    iput-object p4, p0, Lm3/d;->d:Lfd/a;

    iput-object p5, p0, Lm3/d;->e:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lm3/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lh3/e;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;)",
            "Lm3/d;"
        }
    .end annotation

    new-instance v6, Lm3/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lm3/d;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Lh3/e;Ln3/y;Lo3/d;Lp3/b;)Lm3/c;
    .locals 7

    new-instance v6, Lm3/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lm3/c;-><init>(Ljava/util/concurrent/Executor;Lh3/e;Ln3/y;Lo3/d;Lp3/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Lm3/c;
    .locals 5

    iget-object v0, p0, Lm3/d;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lm3/d;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh3/e;

    iget-object v2, p0, Lm3/d;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/y;

    iget-object v3, p0, Lm3/d;->d:Lfd/a;

    invoke-interface {v3}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo3/d;

    iget-object v4, p0, Lm3/d;->e:Lfd/a;

    invoke-interface {v4}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp3/b;

    invoke-static {v0, v1, v2, v3, v4}, Lm3/d;->c(Ljava/util/concurrent/Executor;Lh3/e;Ln3/y;Lo3/d;Lp3/b;)Lm3/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm3/d;->b()Lm3/c;

    move-result-object v0

    return-object v0
.end method
