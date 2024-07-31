.class public final Lcom/google/firebase/FirebaseCommonKtxRegistrar;
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lce/k0;

    const/4 v1, 0x4

    new-array v1, v1, [Ly7/c;

    const-class v2, Lr7/a;

    invoke-static {v2, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v2

    invoke-static {v2}, Ly7/c;->e(Ly7/e0;)Ly7/c$b;

    move-result-object v2

    const-class v3, Lr7/a;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v3

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v2

    sget-object v3, Lcom/google/firebase/FirebaseCommonKtxRegistrar$a;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$a;

    invoke-virtual {v2, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v2

    invoke-virtual {v2}, Ly7/c$b;->d()Ly7/c;

    move-result-object v2

    const-string v3, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()"

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    aput-object v2, v1, v4

    const-class v2, Lr7/c;

    invoke-static {v2, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v2

    invoke-static {v2}, Ly7/c;->e(Ly7/e0;)Ly7/c$b;

    move-result-object v2

    const-class v4, Lr7/c;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v4

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v2, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v2

    sget-object v4, Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;

    invoke-virtual {v2, v4}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v2

    invoke-virtual {v2}, Ly7/c$b;->d()Ly7/c;

    move-result-object v2

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-class v2, Lr7/b;

    invoke-static {v2, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v2

    invoke-static {v2}, Ly7/c;->e(Ly7/e0;)Ly7/c$b;

    move-result-object v2

    const-class v4, Lr7/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v4

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v2, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v2

    sget-object v4, Lcom/google/firebase/FirebaseCommonKtxRegistrar$c;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$c;

    invoke-virtual {v2, v4}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v2

    invoke-virtual {v2}, Ly7/c$b;->d()Ly7/c;

    move-result-object v2

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    aput-object v2, v1, v4

    const-class v2, Lr7/d;

    invoke-static {v2, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    invoke-static {v0}, Ly7/c;->e(Ly7/e0;)Ly7/c$b;

    move-result-object v0

    const-class v2, Lr7/d;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v2, v4}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v2

    invoke-static {v2}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$d;

    invoke-virtual {v0, v2}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ly7/c$b;->d()Ly7/c;

    move-result-object v0

    invoke-static {v0, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v0, v1, v2

    invoke-static {v1}, Lhd/n;->g([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
