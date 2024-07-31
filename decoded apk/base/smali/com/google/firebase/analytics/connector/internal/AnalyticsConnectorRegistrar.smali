.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$getComponents$0(Ly7/d;)Lp7/a;
    .locals 3

    const-class v0, Ln7/g;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln7/g;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lu8/d;

    invoke-interface {p0, v2}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu8/d;

    invoke-static {v0, v1, p0}, Lp7/b;->d(Ln7/g;Landroid/content/Context;Lu8/d;)Lp7/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ly7/c;

    const-class v1, Lp7/a;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-class v2, Ln7/g;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v2, Lu8/d;

    invoke-static {v2}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v2, Lq7/b;->a:Lq7/b;

    invoke-virtual {v1, v2}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->e()Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-analytics"

    const-string v2, "21.5.1"

    invoke-static {v1, v2}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
