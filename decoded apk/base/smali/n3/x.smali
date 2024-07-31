.class public final Ln3/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Ln3/w;",
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
            "Lo3/d;",
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
            "Lp3/b;",
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
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/x;->a:Lfd/a;

    iput-object p2, p0, Ln3/x;->b:Lfd/a;

    iput-object p3, p0, Ln3/x;->c:Lfd/a;

    iput-object p4, p0, Ln3/x;->d:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Ln3/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lfd/a<",
            "Lo3/d;",
            ">;",
            "Lfd/a<",
            "Ln3/y;",
            ">;",
            "Lfd/a<",
            "Lp3/b;",
            ">;)",
            "Ln3/x;"
        }
    .end annotation

    new-instance v0, Ln3/x;

    invoke-direct {v0, p0, p1, p2, p3}, Ln3/x;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lo3/d;Ln3/y;Lp3/b;)Ln3/w;
    .locals 1

    new-instance v0, Ln3/w;

    invoke-direct {v0, p0, p1, p2, p3}, Ln3/w;-><init>(Ljava/util/concurrent/Executor;Lo3/d;Ln3/y;Lp3/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Ln3/w;
    .locals 4

    iget-object v0, p0, Ln3/x;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln3/x;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo3/d;

    iget-object v2, p0, Ln3/x;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/y;

    iget-object v3, p0, Ln3/x;->d:Lfd/a;

    invoke-interface {v3}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp3/b;

    invoke-static {v0, v1, v2, v3}, Ln3/x;->c(Ljava/util/concurrent/Executor;Lo3/d;Ln3/y;Lp3/b;)Ln3/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln3/x;->b()Ln3/w;

    move-result-object v0

    return-object v0
.end method
