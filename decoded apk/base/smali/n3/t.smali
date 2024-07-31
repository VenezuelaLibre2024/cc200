.class public final Ln3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Ln3/s;",
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
            "Lh3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lo3/d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/y;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lp3/b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lo3/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lh3/e;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lo3/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/t;->a:Lfd/a;

    iput-object p2, p0, Ln3/t;->b:Lfd/a;

    iput-object p3, p0, Ln3/t;->c:Lfd/a;

    iput-object p4, p0, Ln3/t;->d:Lfd/a;

    iput-object p5, p0, Ln3/t;->e:Lfd/a;

    iput-object p6, p0, Ln3/t;->f:Lfd/a;

    iput-object p7, p0, Ln3/t;->g:Lfd/a;

    iput-object p8, p0, Ln3/t;->h:Lfd/a;

    iput-object p9, p0, Ln3/t;->i:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Ln3/t;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;",
            "Lfd/a<",
            "Lh3/e;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lq3/a;",
            ">;",
            "Lfd/a<",
            "Lo3/c;",
            ">;)",
            "Ln3/t;"
        }
    .end annotation

    new-instance v10, Ln3/t;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ln3/t;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lh3/e;Lo3/d;Ln3/y;Ljava/util/concurrent/Executor;Lp3/b;Lq3/a;Lq3/a;Lo3/c;)Ln3/s;
    .locals 11

    new-instance v10, Ln3/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Ln3/s;-><init>(Landroid/content/Context;Lh3/e;Lo3/d;Ln3/y;Ljava/util/concurrent/Executor;Lp3/b;Lq3/a;Lq3/a;Lo3/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Ln3/s;
    .locals 10

    iget-object v0, p0, Ln3/t;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Ln3/t;->b:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh3/e;

    iget-object v0, p0, Ln3/t;->c:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo3/d;

    iget-object v0, p0, Ln3/t;->d:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ln3/y;

    iget-object v0, p0, Ln3/t;->e:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Ln3/t;->f:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lp3/b;

    iget-object v0, p0, Ln3/t;->g:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lq3/a;

    iget-object v0, p0, Ln3/t;->h:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lq3/a;

    iget-object v0, p0, Ln3/t;->i:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo3/c;

    invoke-static/range {v1 .. v9}, Ln3/t;->c(Landroid/content/Context;Lh3/e;Lo3/d;Ln3/y;Ljava/util/concurrent/Executor;Lp3/b;Lq3/a;Lq3/a;Lo3/c;)Ln3/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln3/t;->b()Ln3/s;

    move-result-object v0

    return-object v0
.end method
