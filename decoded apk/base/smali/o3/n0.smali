.class public final Lo3/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Lo3/m0;",
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
            "Lo3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lo3/t0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/lang/String;",
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
            "Lo3/e;",
            ">;",
            "Lfd/a<",
            "Lo3/t0;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/n0;->a:Lfd/a;

    iput-object p2, p0, Lo3/n0;->b:Lfd/a;

    iput-object p3, p0, Lo3/n0;->c:Lfd/a;

    iput-object p4, p0, Lo3/n0;->d:Lfd/a;

    iput-object p5, p0, Lo3/n0;->e:Lfd/a;

    return-void
.end method

.method public static a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lo3/n0;
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
            "Lo3/e;",
            ">;",
            "Lfd/a<",
            "Lo3/t0;",
            ">;",
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lo3/n0;"
        }
    .end annotation

    new-instance v6, Lo3/n0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo3/n0;-><init>(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)V

    return-object v6
.end method

.method public static c(Lq3/a;Lq3/a;Ljava/lang/Object;Ljava/lang/Object;Lfd/a;)Lo3/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            "Lq3/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lo3/m0;"
        }
    .end annotation

    new-instance v6, Lo3/m0;

    move-object v3, p2

    check-cast v3, Lo3/e;

    move-object v4, p3

    check-cast v4, Lo3/t0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo3/m0;-><init>(Lq3/a;Lq3/a;Lo3/e;Lo3/t0;Lfd/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Lo3/m0;
    .locals 5

    iget-object v0, p0, Lo3/n0;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/a;

    iget-object v1, p0, Lo3/n0;->b:Lfd/a;

    invoke-interface {v1}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3/a;

    iget-object v2, p0, Lo3/n0;->c:Lfd/a;

    invoke-interface {v2}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lo3/n0;->d:Lfd/a;

    invoke-interface {v3}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lo3/n0;->e:Lfd/a;

    invoke-static {v0, v1, v2, v3, v4}, Lo3/n0;->c(Lq3/a;Lq3/a;Ljava/lang/Object;Ljava/lang/Object;Lfd/a;)Lo3/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo3/n0;->b()Lo3/m0;

    move-result-object v0

    return-object v0
.end method
